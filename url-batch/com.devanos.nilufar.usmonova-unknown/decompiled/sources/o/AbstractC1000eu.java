package o;

/* renamed from: o.eu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1000eu {
    public static final C2245xo a;
    public static final C2245xo[] b;
    public static final C0208Hx c;
    public static final C1066fu d;

    static {
        C2245xo c2245xo = new C2245xo("org.jspecify.nullness");
        C2245xo c2245xo2 = new C2245xo("org.jspecify.annotations");
        a = c2245xo2;
        C2245xo c2245xo3 = new C2245xo("io.reactivex.rxjava3.annotations");
        C2245xo c2245xo4 = new C2245xo("org.checkerframework.checker.nullness.compatqual");
        String b2 = c2245xo3.b();
        b = new C2245xo[]{new C2245xo(b2.concat(".Nullable")), new C2245xo(b2.concat(".NonNull"))};
        C2245xo c2245xo5 = new C2245xo("org.jetbrains.annotations");
        C1066fu c1066fu = C1066fu.d;
        C1619oH c1619oH = new C1619oH(c2245xo5, c1066fu);
        C1619oH c1619oH2 = new C1619oH(new C2245xo("androidx.annotation"), c1066fu);
        C1619oH c1619oH3 = new C1619oH(new C2245xo("android.support.annotation"), c1066fu);
        C1619oH c1619oH4 = new C1619oH(new C2245xo("android.annotation"), c1066fu);
        C1619oH c1619oH5 = new C1619oH(new C2245xo("com.android.annotations"), c1066fu);
        C1619oH c1619oH6 = new C1619oH(new C2245xo("org.eclipse.jdt.annotation"), c1066fu);
        C1619oH c1619oH7 = new C1619oH(new C2245xo("org.checkerframework.checker.nullness.qual"), c1066fu);
        C1619oH c1619oH8 = new C1619oH(c2245xo4, c1066fu);
        C1619oH c1619oH9 = new C1619oH(new C2245xo("javax.annotation"), c1066fu);
        C1619oH c1619oH10 = new C1619oH(new C2245xo("edu.umd.cs.findbugs.annotations"), c1066fu);
        C1619oH c1619oH11 = new C1619oH(new C2245xo("io.reactivex.annotations"), c1066fu);
        C2245xo c2245xo6 = new C2245xo("androidx.annotation.RecentlyNullable");
        DN dn = DN.j;
        C1619oH c1619oH12 = new C1619oH(c2245xo6, new C1066fu(dn, 4));
        C1619oH c1619oH13 = new C1619oH(new C2245xo("androidx.annotation.RecentlyNonNull"), new C1066fu(dn, 4));
        C1619oH c1619oH14 = new C1619oH(new C2245xo("lombok"), c1066fu);
        C1464ly c1464ly = new C1464ly(1, 9, 0);
        DN dn2 = DN.k;
        c = new C0208Hx(EB.G(c1619oH, c1619oH2, c1619oH3, c1619oH4, c1619oH5, c1619oH6, c1619oH7, c1619oH8, c1619oH9, c1619oH10, c1619oH11, c1619oH12, c1619oH13, c1619oH14, new C1619oH(c2245xo, new C1066fu(dn, c1464ly, dn2)), new C1619oH(c2245xo2, new C1066fu(dn, new C1464ly(1, 9, 0), dn2)), new C1619oH(c2245xo3, new C1066fu(dn, new C1464ly(1, 8, 0), dn2))));
        d = new C1066fu(dn, 4);
    }
}
