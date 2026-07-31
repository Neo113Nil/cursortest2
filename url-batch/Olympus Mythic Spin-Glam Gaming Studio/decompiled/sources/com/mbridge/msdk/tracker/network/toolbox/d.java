package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.t;

/* compiled from: Common.java */
/* loaded from: classes11.dex */
public class d {
    public static String a(String str, t<?> tVar) {
        if (TextUtils.isEmpty(str) || tVar == null) {
            return "";
        }
        byte[] b = tVar.b();
        if (b == null || b.length == 0) {
            return str;
        }
        if (str.endsWith("?")) {
            return str + new String(b);
        }
        return str + "?" + new String(b);
    }
}
