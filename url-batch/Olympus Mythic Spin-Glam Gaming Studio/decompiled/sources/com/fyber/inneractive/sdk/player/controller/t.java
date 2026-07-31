package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes6.dex */
public final class t implements Runnable {
    public final /* synthetic */ z a;

    public t(z zVar) {
        this.a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.a;
        zVar.j = null;
        zVar.r();
    }
}
