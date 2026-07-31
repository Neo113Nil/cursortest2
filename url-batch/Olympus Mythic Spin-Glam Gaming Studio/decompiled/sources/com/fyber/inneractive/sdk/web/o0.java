package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes5.dex */
public final class o0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ v0 b;

    public o0(v0 v0Var, String str) {
        this.b = v0Var;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("injecting JS: %s", this.a);
        try {
            String str = this.a;
            if (str != null) {
                com.fyber.inneractive.sdk.util.q0.a(this.b.a, str);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to inject JS", new Object[0]);
        }
    }
}
