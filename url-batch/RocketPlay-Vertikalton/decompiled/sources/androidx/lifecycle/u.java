package androidx.lifecycle;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0080m f1906a;

    /* renamed from: b, reason: collision with root package name */
    public r f1907b;

    public final void a(t tVar, EnumC0079l enumC0079l) {
        EnumC0080m a2 = enumC0079l.a();
        EnumC0080m enumC0080m = this.f1906a;
        i1.f.e(enumC0080m, "state1");
        if (a2.compareTo(enumC0080m) < 0) {
            enumC0080m = a2;
        }
        this.f1906a = enumC0080m;
        this.f1907b.a(tVar, enumC0079l);
        this.f1906a = a2;
    }
}
