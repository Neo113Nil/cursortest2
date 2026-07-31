package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.c0;

/* loaded from: classes4.dex */
public final class u implements Runnable {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ Exception b;

    public u(c0 c0Var, Exception exc) {
        this.a = c0Var;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.a;
        if (c0Var != null) {
            c0Var.a(this.b, InneractiveErrorCode.INVALID_INPUT, new com.fyber.inneractive.sdk.response.e[0]);
        }
    }
}
