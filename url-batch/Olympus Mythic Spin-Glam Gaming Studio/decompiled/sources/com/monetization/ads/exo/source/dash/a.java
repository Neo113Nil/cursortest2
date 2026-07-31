package com.monetization.ads.exo.source.dash;

import yads.i23;

/* loaded from: classes4.dex */
public final class a {
    public final /* synthetic */ i a;

    public a(i iVar) {
        this.a = iVar;
    }

    public final void a() {
        long j;
        i iVar = this.a;
        synchronized (i23.b) {
            try {
                j = i23.c ? i23.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        iVar.L = j;
        iVar.a(true);
    }
}
