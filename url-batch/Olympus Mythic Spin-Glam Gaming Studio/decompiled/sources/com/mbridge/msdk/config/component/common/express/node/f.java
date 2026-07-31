package com.mbridge.msdk.config.component.common.express.node;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* compiled from: IndexAccessNode.java */
/* loaded from: classes4.dex */
public class f extends d {
    d a;
    d b;

    public f(d dVar, d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object a;
        String str;
        try {
            a = this.a.a(dVar, eVar, aVar);
            str = (String) this.b.a(dVar, eVar, aVar);
        } catch (Exception e) {
            q0.b("IndexAccessNode", "IndexAccessNode error: " + e.getMessage());
        }
        if (a != null && !TextUtils.isEmpty(str)) {
            int parseInt = Integer.parseInt(str);
            if (a instanceof Object[]) {
                if (parseInt < ((Object[]) a).length) {
                    return ((Object[]) a)[parseInt];
                }
            } else if (a instanceof int[]) {
                if (parseInt < ((int[]) a).length) {
                    return Integer.valueOf(((int[]) a)[parseInt]);
                }
            } else if (a instanceof long[]) {
                if (parseInt < ((long[]) a).length) {
                    return Long.valueOf(((long[]) a)[parseInt]);
                }
            } else if (a instanceof double[]) {
                if (parseInt < ((double[]) a).length) {
                    return Double.valueOf(((double[]) a)[parseInt]);
                }
            } else if (a instanceof float[]) {
                if (parseInt < ((float[]) a).length) {
                    return Float.valueOf(((float[]) a)[parseInt]);
                }
            } else if (a instanceof boolean[]) {
                if (parseInt < ((boolean[]) a).length) {
                    return Boolean.valueOf(((boolean[]) a)[parseInt]);
                }
            } else if (a instanceof char[]) {
                if (parseInt < ((char[]) a).length) {
                    return Character.valueOf(((char[]) a)[parseInt]);
                }
            } else if (a instanceof byte[]) {
                if (parseInt < ((byte[]) a).length) {
                    return Byte.valueOf(((byte[]) a)[parseInt]);
                }
            } else if (a instanceof short[]) {
                if (parseInt < ((short[]) a).length) {
                    return Short.valueOf(((short[]) a)[parseInt]);
                }
            } else if ((a instanceof List) && parseInt < ((List) a).size()) {
                return ((List) a).get(parseInt);
            }
            return null;
        }
        return null;
    }
}
