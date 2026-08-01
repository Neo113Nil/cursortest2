package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xx implements bt0 {
    public Float d;
    public Float e;
    public final ce0 f;
    public zu0 g;
    public boolean h;
    public boolean i;
    public long j;
    public final /* synthetic */ zx k;

    public xx(zx zxVar, Float f, Float f2, wx wxVar) {
        j3 j3Var = dz0.a;
        this.k = zxVar;
        this.d = f;
        this.e = f2;
        this.f = ud0.o(f);
        this.g = new zu0(wxVar, j3Var, this.d, this.e, null);
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        return this.f.getValue();
    }
}
