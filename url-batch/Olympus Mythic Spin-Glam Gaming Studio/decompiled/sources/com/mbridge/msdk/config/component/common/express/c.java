package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExpressionExecutor.java */
/* loaded from: classes12.dex */
public class c {
    public static Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("$") && !str.startsWith(X3.j.d)) {
            return str;
        }
        if (!str.startsWith(X3.j.d)) {
            if (str.startsWith("$")) {
                return a(aVar, str);
            }
            return null;
        }
        String replaceAll = str.replaceAll("[\\[\\]]", "");
        if (replaceAll.split(StringUtils.COMMA).length == 0) {
            return null;
        }
        return a(aVar, replaceAll);
    }

    private static Object a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String... strArr) {
        Object obj;
        Object a;
        if (strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String[] split = str.replace("$", "").split("\\.");
            if (split.length != 0) {
                if (aVar.a((Object) split[0])) {
                    obj = aVar;
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(split[0], aVar);
                    obj = hashMap;
                }
                int length = split.length;
                int i = 0;
                Object obj2 = obj;
                while (i < length) {
                    String str2 = split[i];
                    if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                        a = a((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2, str2);
                    } else {
                        a = a(obj2, str2);
                    }
                    i++;
                    obj2 = a;
                }
                if (strArr.length == 1) {
                    return obj2;
                }
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    private static Object a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        try {
            if (aVar.a((Object) str)) {
                return aVar.b(str);
            }
            return null;
        } catch (Exception e) {
            q0.b("ExpressionExecutor", e.getMessage(), e);
            return null;
        }
    }

    private static Object a(Object obj, String str) {
        try {
            if (obj instanceof Map) {
                return ((Map) obj).get(str);
            }
            if (obj == null) {
                return null;
            }
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            q0.b("ExpressionExecutor", e.getMessage(), e);
            return null;
        }
    }
}
