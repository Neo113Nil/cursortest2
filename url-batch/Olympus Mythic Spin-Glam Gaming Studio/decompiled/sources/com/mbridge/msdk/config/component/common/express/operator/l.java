package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* compiled from: OperatorLogical.java */
/* loaded from: classes13.dex */
public class l {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public l(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str) || !(str.contains(com.mbridge.msdk.config.component.common.util.c.c("882")) || str.contains(com.mbridge.msdk.config.component.common.util.c.c("883")))) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        boolean a = (list == null || list.isEmpty()) ? false : a(list.get(0));
        boolean a2 = a(obj);
        if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("882"))) {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("883"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(a2 || a));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (a2 && a) {
            r1 = true;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(r1));
    }

    private boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof String)) {
            return (obj instanceof Number) && ((Number) obj).intValue() == 1;
        }
        String str = (String) obj;
        return "1".equals(str) || "true".equalsIgnoreCase(str);
    }
}
