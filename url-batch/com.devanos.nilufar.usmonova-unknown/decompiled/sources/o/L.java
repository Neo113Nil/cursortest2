package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class L implements UL, W3, InterfaceC0623Xx {
    public Object h;

    public L(InterfaceC1738q4 interfaceC1738q4) {
        if (interfaceC1738q4 != null) {
            this.h = interfaceC1738q4;
        } else {
            B0(0);
            throw null;
        }
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static /* synthetic */ void B0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(format);
        }
    }

    public abstract void C0(C1334k c1334k);

    public abstract String D0();

    public abstract void E0(String[] strArr);

    @Override // o.UL
    public AbstractC1004ey c() {
        AbstractC1004ey abstractC1004ey = (AbstractC1004ey) this.h;
        if (abstractC1004ey != null) {
            return abstractC1004ey;
        }
        A0(1);
        throw null;
    }

    @Override // o.W3
    public InterfaceC1738q4 getAnnotations() {
        InterfaceC1738q4 interfaceC1738q4 = (InterfaceC1738q4) this.h;
        if (interfaceC1738q4 != null) {
            return interfaceC1738q4;
        }
        B0(1);
        throw null;
    }

    @Override // o.InterfaceC0623Xx
    public void h() {
        E0((String[]) ((ArrayList) this.h).toArray(new String[0]));
    }

    @Override // o.InterfaceC0623Xx
    public void q0(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.h).add((String) obj);
        }
    }

    @Override // o.InterfaceC0623Xx
    public InterfaceC0597Wx w0(C1639ob c1639ob) {
        return null;
    }

    public L(AbstractC1004ey abstractC1004ey) {
        if (abstractC1004ey != null) {
            this.h = abstractC1004ey;
        } else {
            A0(0);
            throw null;
        }
    }

    public L() {
        this.h = new ArrayList();
    }

    @Override // o.InterfaceC0623Xx
    public void F(C1705pb c1705pb) {
    }

    @Override // o.InterfaceC0623Xx
    public void u(C1639ob c1639ob, C0827cE c0827cE) {
    }
}
