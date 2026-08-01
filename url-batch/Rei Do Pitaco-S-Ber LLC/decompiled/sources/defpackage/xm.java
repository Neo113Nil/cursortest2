package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class xm implements p20 {
    public final yj f;
    public boolean g;
    public final /* synthetic */ bn h;

    public xm(bn bnVar) {
        this.h = bnVar;
        e50 a = bnVar.c.a();
        a.getClass();
        yj yjVar = new yj();
        yjVar.e = a;
        this.f = yjVar;
    }

    @Override // defpackage.p20
    public final e50 a() {
        return this.f;
    }

    @Override // defpackage.p20
    public long b(long j, m8 m8Var) {
        bn bnVar = this.h;
        m8Var.getClass();
        try {
            return bnVar.c.b(j, m8Var);
        } catch (IOException e) {
            bnVar.b.k();
            this.m();
            throw e;
        }
    }

    public final void m() {
        bn bnVar = this.h;
        int i = bnVar.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + bnVar.e);
        }
        yj yjVar = this.f;
        e50 e50Var = yjVar.e;
        yjVar.e = e50.d;
        e50Var.a();
        e50Var.b();
        bnVar.e = 6;
    }
}
