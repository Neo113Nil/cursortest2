package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: OperatorSQL.java */
/* loaded from: classes13.dex */
public class p {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public p(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private Object a(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" and (");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        sb.append(" )");
        return sb.toString();
    }

    private Object b() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String());
    }

    private Object c(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" group by");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        return sb.toString();
    }

    private Object d(String str, Object obj, List<Object> list) {
        String str2;
        Map map;
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        str2 = "";
        if (list.size() == 2) {
            Object obj2 = list.get(0);
            str2 = obj2 != null ? String.valueOf(obj2) : "";
            Object obj3 = list.get(1);
            if (obj3 instanceof Map) {
                map = (Map) obj3;
                if (!TextUtils.isEmpty(str2) || map == null) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
                sb.append(" insert into " + str2);
                StringBuilder sb2 = new StringBuilder(" (");
                StringBuilder sb3 = new StringBuilder(" VALUES (");
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    Object obj4 = map.get(str3);
                    sb2.append(str3);
                    if (obj4 == null) {
                        sb3.append("NULL");
                    } else if (obj4 instanceof Number) {
                        sb3.append(obj4);
                    } else {
                        sb3.append("'");
                        sb3.append(a(obj4.toString()));
                        sb3.append("'");
                    }
                    if (it.hasNext()) {
                        sb2.append(StringUtils.COMMA);
                        sb3.append(StringUtils.COMMA);
                    } else {
                        sb2.append(" )");
                        sb3.append(" )");
                    }
                }
                sb.append(sb2.toString());
                sb.append(sb3.toString());
                return sb.toString();
            }
        }
        map = null;
        if (TextUtils.isEmpty(str2)) {
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Object e(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" limit");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        return sb.toString();
    }

    private Object f(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" or (");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        sb.append(" )");
        return sb.toString();
    }

    private Object g(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" order by");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        return sb.toString();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("829")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b()) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("830")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(j(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("831")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("832")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(l(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("833")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("834")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(f(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("835")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(g(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("836")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("837")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a()) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("838")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("839")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(d(str, obj, list)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("840")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(e(str, obj, list)) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e) {
            q0.b("SQLOperator", e.getMessage(), e);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Object j(String str, Object obj, List<Object> list) {
        if (list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder("select");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        return sb.toString();
    }

    private Object k(String str, Object obj, List<Object> list) {
        String str2;
        Map map;
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        str2 = "";
        if (list.size() == 2) {
            Object obj2 = list.get(0);
            str2 = obj2 != null ? String.valueOf(obj2) : "";
            Object obj3 = list.get(1);
            if (obj3 instanceof Map) {
                map = (Map) obj3;
                if (!TextUtils.isEmpty(str2) || map == null) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
                sb.append("update ");
                sb.append(str2);
                sb.append(" set");
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    sb.append(" ");
                    sb.append(str3);
                    sb.append("=");
                    sb.append(map.get(str3));
                    if (it.hasNext()) {
                        sb.append(StringUtils.COMMA);
                    }
                }
                return sb.toString();
            }
        }
        map = null;
        if (TextUtils.isEmpty(str2)) {
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Object l(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" where");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        return sb.toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a i(String str, Object obj, List<Object> list) {
        return b(str) ? h(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object b(String str, Object obj, List<Object> list) {
        if (obj == null || list == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(obj));
        sb.append(" from");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                sb.append(" ");
                sb.append(String.valueOf(list.get(i)));
                if (i < list.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        return sb.toString();
    }

    private Object a() {
        return new StringBuilder(" delete ");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("829")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("830")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("831")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("832")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("833")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("834")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("835")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("836")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("837")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("838")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("839")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("840"));
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("'", "''");
    }
}
