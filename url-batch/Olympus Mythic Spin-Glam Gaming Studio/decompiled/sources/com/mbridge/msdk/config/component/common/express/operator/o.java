package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* compiled from: OperatorObject.java */
/* loaded from: classes13.dex */
public class o {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public o(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("880")) ? a(obj, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("881")) ? a(obj, list, aVar) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e) {
            q0.b("OperatorObject", "Error handling object operation: " + str + ", " + e.getMessage(), e);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : (str.equals(com.mbridge.msdk.config.component.common.util.c.c("880")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("881"))) ? a(str, obj, list, aVar) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(1);
    }

    private synchronized com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String str;
        if (list != null) {
            try {
                if (list.size() == 3) {
                    try {
                        boolean z = ((Integer) list.get(0)).intValue() == 1;
                        if (z) {
                            str = (String) list.get(1);
                        } else {
                            str = (String) list.get(2);
                        }
                        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
                            str = str.substring(1, str.length() - 1);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            new com.mbridge.msdk.config.component.common.express.d().a(str, aVar);
                        }
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z));
                    } catch (Exception e) {
                        q0.a("OperatorObject", e.getMessage());
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.FALSE);
    }
}
