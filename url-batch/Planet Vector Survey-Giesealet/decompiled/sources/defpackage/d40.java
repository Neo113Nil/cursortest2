package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d40 extends v00 implements bu {
    public final /* synthetic */ f40 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ag0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(f40 f40Var, long j, long j2, ag0 ag0Var) {
        super(0);
        this.e = f40Var;
        this.f = j;
        this.g = j2;
        this.h = ag0Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        f40 f40Var = this.e;
        f40Var.d0().d = false;
        f40Var.d0().e = this.f;
        f40Var.d0().f = this.g;
        mu c = this.h.d.c();
        if (c != null) {
            c.c(f40Var.d0());
        }
        return ky0.a;
    }
}
