package com.fyber.inneractive.sdk.flow;

/* loaded from: classes5.dex */
public final class x0 {
    public static final x0 c = new x0(null);
    public final int a;
    public final int b;

    public x0(com.fyber.inneractive.sdk.response.e eVar) {
        this.a = -1;
        this.b = -1;
        if (eVar != null) {
            this.a = eVar.L;
            this.b = eVar.K;
        }
    }

    public final boolean a() {
        return this.a >= 0;
    }

    public static x0 a(com.fyber.inneractive.sdk.player.f fVar) {
        return fVar != null ? fVar.n : c;
    }
}
