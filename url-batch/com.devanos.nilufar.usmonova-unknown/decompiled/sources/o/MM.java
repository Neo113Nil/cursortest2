package o;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* loaded from: classes.dex */
public final class MM extends BM implements InterfaceC0489St {
    public final KM a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public MM(KM km, Annotation[] annotationArr, String str, boolean z) {
        AbstractC0048Bt.n(annotationArr, "reflectAnnotations");
        this.a = km;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    @Override // o.InterfaceC0489St
    public final C1558nM a(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        return EB.p(this.b, c2245xo);
    }

    @Override // o.InterfaceC0489St
    public final Collection getAnnotations() {
        return EB.r(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MM.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        String str = this.c;
        sb.append(str != null ? C0827cE.d(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
