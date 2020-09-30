package com.hak.base;

import java.util.*;

/**
 * @author hak
 * @description
 * @date 2020/8/24
 */
public class SearchData {

    private final Map<String, Object> params = new HashMap();

    public SearchData() {
    }

    public static Map<String, Object> generateFeignSearchData(Map<String, Object> searchData) {
        Set<String> mapKeys = searchData.keySet();
        Map<String, Object> feignParam = new HashMap(mapKeys.size());
        Iterator var3 = mapKeys.iterator();

        while (var3.hasNext()) {
            String key = (String) var3.next();
            feignParam.put("s_" + key, searchData.get(key));
        }

        return feignParam;
    }

    public Boolean getBooleanValue(final String key) {
        Object value = this.params.get(key);
        if (value == null) {
            return null;
        } else {
            return value instanceof Boolean ? (Boolean) value : Boolean.valueOf(String.valueOf(value));
        }
    }

    public Double getDoubleValue(final String key) {
        Object value = this.params.get(key);
        if (value == null) {
            return null;
        } else if (value instanceof Double) {
            return (Double) value;
        } else {
            Double doubleValue = Double.valueOf(String.valueOf(value));
            return doubleValue;
        }
    }

    public Integer getIntValue(final String key) {
        Object value = this.params.get(key);
        if (value == null) {
            return null;
        } else if (value instanceof Integer) {
            return (Integer) value;
        } else {
            Integer intValue = Integer.valueOf(String.valueOf(value));
            return intValue;
        }
    }

    public Long getLongValue(final String key) {
        Object value = this.params.get(key);
        if (value == null) {
            return null;
        } else if (value instanceof Long) {
            return (Long) value;
        } else {
            Long longValue = Long.valueOf(String.valueOf(value));
            return longValue;
        }
    }

    public String[] getStrArray(final String key) {
        Object value = this.params.get(key);
        if (value == null) {
            return null;
        } else if (value.getClass().isArray()) {
            return (String[]) ((String[]) value);
        } else if (!List.class.isAssignableFrom(value.getClass())) {
            return new String[]{String.valueOf(value)};
        } else {
            List<Object> list = (List) value;
            String[] array = new String[list.size()];

            for (int i = 0; i < list.size(); ++i) {
                array[i] = String.valueOf(list.get(i));
            }

            return array;
        }
    }

    public String getStrValue(final String key) {
        Object value = this.params.get(key);
        return value == null ? null : String.valueOf(value);
    }

    public boolean hasKey(final String key) {
        return this.params.containsKey(key);
    }

    public boolean isArrayValue(final String key) {
        Object value = this.params.get(key);
        if (value == null) {
            return false;
        } else {
            return value.getClass().isArray() || List.class.isAssignableFrom(value.getClass());
        }
    }

    public boolean isEmpty() {
        return this.params.isEmpty();
    }

    public void put(final String key, final Object value) {
        this.params.put(key, value);
    }

    public Map<String, Object> toFeignRequestParamter() {
        Set<String> mapKeys = this.params.keySet();
        Map<String, Object> feignParam = new HashMap(mapKeys.size());
        Iterator var3 = mapKeys.iterator();

        while (var3.hasNext()) {
            String key = (String) var3.next();
            feignParam.put("s_" + key, this.params.get(key));
        }

        return feignParam;
    }

    public String toQueryString() {
        StringBuilder str = new StringBuilder();
        this.params.forEach((key, value) -> {
            if (value.getClass().isArray()) {
                Object[] values = (Object[]) ((Object[]) value);
                Object[] var4 = values;
                int var5 = values.length;

                for (int var6 = 0; var6 < var5; ++var6) {
                    Object obj = var4[var6];
                    if (str.length() > 1) {
                        str.append("&");
                    }

                    str.append("s_").append(key).append("=").append(obj);
                }
            } else {
                Object objx;
                if (Collection.class.isAssignableFrom(value.getClass())) {
                    for (Iterator var8 = ((Collection) value).iterator(); var8.hasNext(); str.append("s_").append(key).append("=").append(objx)) {
                        objx = var8.next();
                        if (str.length() > 1) {
                            str.append("&");
                        }
                    }
                } else {
                    if (str.length() > 1) {
                        str.append("&");
                    }

                    str.append("s_").append(key).append("=").append(value);
                }
            }

        });
        return str.toString();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("{");
        this.params.forEach((key, value) -> {
            if (str.length() > 1) {
                str.append(",");
            }

            str.append(key).append(":").append(value);
        });
        str.append("}");
        return str.toString();
    }

}
