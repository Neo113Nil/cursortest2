package o;

import com.google.firebase.messaging.Constants;
import java.util.Map;

/* renamed from: o.f4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014f4 implements InterfaceC0948e4 {
    public final AbstractC1004ey a;
    public final Map b;
    public final IS c;

    public C1014f4(JR jr, Map map, IS is) {
        if (jr == null) {
            a(0);
            throw null;
        }
        if (map == null) {
            a(1);
            throw null;
        }
        this.a = jr;
        this.b = map;
        this.c = is;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = Constants.ScionAnalytics.PARAM_SOURCE;
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // o.InterfaceC0948e4
    public final AbstractC1004ey c() {
        AbstractC1004ey abstractC1004ey = this.a;
        if (abstractC1004ey != null) {
            return abstractC1004ey;
        }
        a(3);
        throw null;
    }

    @Override // o.InterfaceC0948e4
    public final IS d() {
        IS is = this.c;
        if (is != null) {
            return is;
        }
        a(5);
        throw null;
    }

    @Override // o.InterfaceC0948e4
    public final C2245xo e() {
        InterfaceC1245ib d = AbstractC0192Hh.d(this);
        if (d != null) {
            if (C0273Kk.f(d)) {
                d = null;
            }
            if (d != null) {
                return AbstractC0192Hh.c(d);
            }
        }
        return null;
    }

    @Override // o.InterfaceC0948e4
    public final Map f() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        a(4);
        throw null;
    }

    public final String toString() {
        return C2304yh.c.x(this, null);
    }
}
