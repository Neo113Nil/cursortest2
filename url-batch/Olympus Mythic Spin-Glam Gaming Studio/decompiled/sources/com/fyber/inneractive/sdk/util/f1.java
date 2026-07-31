package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class f1 {
    public static String a(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder(str);
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(z ? "?" : X3.j.c);
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(Uri.encode((String) entry.getValue()));
            z = false;
        }
        return sb.toString();
    }
}
