package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.android.volley.toolbox.HttpClientStack;
import com.ironsource.C4701ic;

/* compiled from: HttpMethod.java */
/* loaded from: classes14.dex */
public final class f {
    public static boolean a(String str) {
        return (str.equals(C4701ic.a) || str.equals("HEAD")) ? false : true;
    }

    public static boolean b(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean c(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals("POST") || str.equals(com.safedk.android.a.g.f) || str.equals(HttpClientStack.HttpPatch.METHOD_NAME) || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
