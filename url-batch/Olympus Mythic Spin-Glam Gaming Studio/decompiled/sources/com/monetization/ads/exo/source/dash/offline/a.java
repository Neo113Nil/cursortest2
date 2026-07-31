package com.monetization.ads.exo.source.dash.offline;

import yads.fr;
import yads.jw0;
import yads.l30;
import yads.l51;
import yads.lo;
import yads.ns2;
import yads.oo2;
import yads.pw0;
import yads.qq;
import yads.ti1;
import yads.tl2;

/* loaded from: classes4.dex */
public final class a extends ns2 {
    public final /* synthetic */ fr i;
    public final /* synthetic */ int j;
    public final /* synthetic */ oo2 k;

    public a(fr frVar, int i, oo2 oo2Var) {
        this.i = frVar;
        this.j = i;
        this.k = oo2Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // yads.ns2
    public final Object b() {
        fr frVar = this.i;
        int i = this.j;
        oo2 oo2Var = this.k;
        if (oo2Var.e == null) {
            return null;
        }
        jw0 jw0Var = oo2Var.a;
        String str = jw0Var.l;
        qq qqVar = new qq((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new pw0() : new ti1(0), i, jw0Var);
        try {
            tl2 tl2Var = oo2Var.e;
            tl2Var.getClass();
            tl2 e = oo2Var.e();
            if (e != null) {
                tl2 a = tl2Var.a(e, ((lo) oo2Var.b.get(0)).a);
                if (a == null) {
                    new l51(frVar, l30.a(oo2Var, ((lo) oo2Var.b.get(0)).a, tl2Var, 0), oo2Var.a, 0, null, qqVar).a();
                } else {
                    e = a;
                }
                new l51(frVar, l30.a(oo2Var, ((lo) oo2Var.b.get(0)).a, e, 0), oo2Var.a, 0, null, qqVar).a();
            }
            qqVar.c();
            return qqVar.b();
        } catch (Throwable th) {
            qqVar.c();
            throw th;
        }
    }
}
