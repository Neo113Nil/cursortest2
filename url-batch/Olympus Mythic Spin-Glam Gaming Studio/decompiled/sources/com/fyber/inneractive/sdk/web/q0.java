package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes5.dex */
public final class q0 implements com.digitalturbine.ignite.authenticator.listeners.internal.a {
    public final /* synthetic */ v0 a;

    public q0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.a
    public final void a() {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        v0 v0Var = this.a;
        v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, v0Var.d, v0Var.h.a));
        this.a.d("onShowInstallStarted();");
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.a
    public final void a(String str) {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}
