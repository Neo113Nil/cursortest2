package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes6.dex */
public final class d implements Runnable {
    public final boolean a;
    public final /* synthetic */ e b;

    public d(e eVar, boolean z) {
        this.b = eVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a == this.b.hasWindowFocus()) {
            this.b.f();
        }
    }
}
