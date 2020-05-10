package com.utils;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 获取请求参数工具类
 *
 * @author Clrvn
 */
public class RequestParamsUtil {
    private static final Logger log = LoggerFactory.getLogger(RequestParamsUtil.class);
    private Map<String, Object> values = new LinkedHashMap<>();
    private int pageNo = 1;
    private int pageSize = 10;

    public RequestParamsUtil() {
        try {

            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
            Enumeration<String> params = request.getParameterNames();

            while (params.hasMoreElements()) {
                String name = params.nextElement();
                String value = StrUtil.trim(request.getParameter(name));
                if (StrUtil.isNotEmpty(value)) {
                    this.set(name, URLDecoder.decode(value, "UTF-8"));
                }
            }

            this.parsePagingQueryParams();
        } catch (Exception var5) {
            var5.printStackTrace();
            log.error("BaseControlForm initialize parameters setting error：" + var5);
        }

    }


    public int getPageNo() {
        String pageNum = String.valueOf(this.get("pageNum"));
        if (!StrUtil.isEmpty(pageNum) && NumberUtil.isNumber(pageNum)) {
            this.pageNo = Integer.parseInt(pageNum);
        }

        return this.pageNo;
    }

    public int getPageSize() {
        String pageSize = String.valueOf(this.get("pageSize"));
        if (!StrUtil.isEmpty(pageSize) || NumberUtil.isNumber(pageSize)) {
            this.pageSize = Integer.parseInt(pageSize);
        }

        return this.pageSize;
    }

    public Map<String, Object> getParameters() {
        return this.values;
    }

    public Object get(String name) {
        if (this.values == null) {
            this.values = new LinkedHashMap<>();
            return null;
        } else {
            return this.values.get(name);
        }
    }

    public String getString(String key) {
        return String.valueOf(this.get(key));
    }

    public String getSort() {
        return String.valueOf(this.values.get("sort"));
    }

    public String getOrder() {
        return String.valueOf(this.values.get("order"));
    }

    public String getOrderBy() {
        return String.valueOf(this.values.get("orderby"));
    }

    public void parsePagingQueryParams() {
        String orderby = String.valueOf(this.get("orderby")).trim();
        String sortName = String.valueOf(this.get("sort")).trim();
        String sortOrder = String.valueOf(this.get("order")).trim().toLowerCase();
        if (StrUtil.isEmpty(orderby) && !StrUtil.isEmpty(sortName)) {
            if (!"asc".equals(sortOrder) && !"desc".equals(sortOrder)) {
                sortOrder = "asc";
            }

            this.set("orderby", sortName + " " + sortOrder);
        }

    }

    public void set(String name, Object value) {
        if (ObjectUtil.isNotNull(value)) {
            this.values.put(name, value);
        }
    }

    public void remove(String name) {
        this.values.remove(name);
    }

    public void clear() {
        if (this.values != null) {
            this.values.clear();
        }
    }
}
