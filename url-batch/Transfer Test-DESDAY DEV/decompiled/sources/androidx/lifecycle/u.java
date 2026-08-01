package androidx.lifecycle;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0072m f1527a;

    /* renamed from: b, reason: collision with root package name */
    public r f1528b;

    public final void a(t tVar, EnumC0071l enumC0071l) {
        EnumC0072m a2 = enumC0071l.a();
        EnumC0072m enumC0072m = this.f1527a;
        g1.f.e(enumC0072m, "state1");
        if (a2.compareTo(enumC0072m) < 0) {
            enumC0072m = a2;
        }
        this.f1527a = enumC0072m;
        this.f1528b.a(tVar, enumC0071l);
        this.f1527a = a2;
    }
}
