package com.fyber.inneractive.sdk.network;

import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class g0 {
    public static final g0 c = new g0();
    public final k a = new k();
    public p1 b;

    public final h a() {
        String str;
        if (this.b == null) {
            try {
                str = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                str = "hurl";
            }
            if (str != null && str.equals("okhttp")) {
                try {
                    OkHttpClient.Companion companion = OkHttpClient.INSTANCE;
                    this.b = new p1();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        p1 p1Var = this.b;
        return p1Var != null ? p1Var : this.a;
    }
}
