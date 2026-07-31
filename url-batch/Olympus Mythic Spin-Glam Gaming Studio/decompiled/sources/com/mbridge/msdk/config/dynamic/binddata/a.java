package com.mbridge.msdk.config.dynamic.binddata;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;

/* compiled from: ComponentBindData.java */
/* loaded from: classes11.dex */
public class a {
    public static void a(String str, View view, String str2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str) || view == null) {
            return;
        }
        b(str, view, str2, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(String str, View view, String str2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] split = str.split("\\|");
            HashMap hashMap = new HashMap();
            hashMap.put("parentLayoutFilePath", str2);
            d dVar = new d();
            for (String str3 : split) {
                String[] split2 = str3.split("=");
                if (split2.length == 2) {
                    String str4 = split2[1];
                    a(str4, "", view, aVar);
                    hashMap.put(split2[0], dVar.a(str4, aVar));
                }
            }
            hashMap.put("globalModel", aVar);
            if (view instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
                ((com.mbridge.msdk.config.dynamic.baseview.inter.a) view).setXmlData(hashMap);
            }
        } catch (Exception e) {
            q0.b("ComponentBindData", e.getMessage(), e);
        }
    }

    public static void a(String str, String str2, View view, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str) || view == null || !str.startsWith("$")) {
            return;
        }
        try {
            String replace = str.replace("$", "");
            com.mbridge.msdk.config.dynamic.binddata.wrapper.d dVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.d(str, str2, view, 0);
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a a = c.a(aVar, replace);
            if (a != null) {
                a.b(replace, dVar);
            }
        } catch (Exception e) {
            q0.b("ComponentBindData", e.getMessage(), e);
        }
    }
}
