package o;

/* loaded from: classes.dex */
public final class Q8 extends TQ {
    public static final Q8 m;

    static {
        C1649ol c1649ol = new C1649ol();
        X8.a(c1649ol);
        C2049uq c2049uq = X8.a;
        AbstractC0048Bt.m(c2049uq, "packageFqName");
        C2049uq c2049uq2 = X8.c;
        AbstractC0048Bt.m(c2049uq2, "constructorAnnotation");
        C2049uq c2049uq3 = X8.b;
        AbstractC0048Bt.m(c2049uq3, "classAnnotation");
        C2049uq c2049uq4 = X8.d;
        AbstractC0048Bt.m(c2049uq4, "functionAnnotation");
        C2049uq c2049uq5 = X8.e;
        AbstractC0048Bt.m(c2049uq5, "propertyAnnotation");
        C2049uq c2049uq6 = X8.f;
        AbstractC0048Bt.m(c2049uq6, "propertyGetterAnnotation");
        C2049uq c2049uq7 = X8.g;
        AbstractC0048Bt.m(c2049uq7, "propertySetterAnnotation");
        C2049uq c2049uq8 = X8.i;
        AbstractC0048Bt.m(c2049uq8, "enumEntryAnnotation");
        C2049uq c2049uq9 = X8.h;
        AbstractC0048Bt.m(c2049uq9, "compileTimeValue");
        C2049uq c2049uq10 = X8.j;
        AbstractC0048Bt.m(c2049uq10, "parameterAnnotation");
        C2049uq c2049uq11 = X8.k;
        AbstractC0048Bt.m(c2049uq11, "typeAnnotation");
        C2049uq c2049uq12 = X8.l;
        AbstractC0048Bt.m(c2049uq12, "typeParameterAnnotation");
        m = new Q8(c1649ol, c2049uq, c2049uq2, c2049uq3, c2049uq4, c2049uq5, c2049uq6, c2049uq7, c2049uq8, c2049uq9, c2049uq10, c2049uq11, c2049uq12);
    }

    public static String a(C2245xo c2245xo) {
        String b;
        AbstractC0048Bt.n(c2245xo, "fqName");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0778bU.y(c2245xo.b(), '.', '/'));
        sb.append('/');
        if (c2245xo.d()) {
            b = "default-package";
        } else {
            b = c2245xo.f().b();
            AbstractC0048Bt.m(b, "fqName.shortName().asString()");
        }
        sb.append(b.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
