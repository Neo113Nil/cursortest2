package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* compiled from: OperatorAssignment.java */
/* loaded from: classes13.dex */
public class d {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public d(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String str2;
        Object obj2;
        Object a = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            str2 = aVar.a();
            obj2 = aVar.b();
        } else {
            str2 = "";
            obj2 = null;
        }
        if (TextUtils.isEmpty(str2) || !(obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        Object b = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2).b(str2);
        if (b == null || TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) b).a(str2, a);
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String trim = str.trim();
        return trim.equals("=") ? b(trim, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
