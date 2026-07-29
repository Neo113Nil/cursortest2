package o;

import java.util.List;

/* renamed from: o.Nw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362Nw implements InterfaceC0310Lw {
    public static final /* synthetic */ InterfaceC0937dx[] m;
    public final AbstractC0491Sv h;
    public final int i;
    public final EnumC0285Kw j;
    public final RM k;
    public final RM l = TM.u(null, new C0336Mw(this, 0));

    static {
        VM vm = UM.a;
        m = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0362Nw.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), vm.g(new UJ(vm.b(C0362Nw.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C0362Nw(AbstractC0491Sv abstractC0491Sv, int i, EnumC0285Kw enumC0285Kw, InterfaceC1455lp interfaceC1455lp) {
        this.h = abstractC0491Sv;
        this.i = i;
        this.j = enumC0285Kw;
        this.k = TM.u(null, interfaceC1455lp);
    }

    public final InterfaceC1882sH e() {
        InterfaceC0937dx interfaceC0937dx = m[0];
        Object invoke = this.k.invoke();
        AbstractC0048Bt.m(invoke, "<get-descriptor>(...)");
        return (InterfaceC1882sH) invoke;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0362Nw)) {
            return false;
        }
        C0362Nw c0362Nw = (C0362Nw) obj;
        return AbstractC0048Bt.h(this.h, c0362Nw.h) && this.i == c0362Nw.i;
    }

    @Override // o.InterfaceC0361Nv
    public final List getAnnotations() {
        InterfaceC0937dx interfaceC0937dx = m[1];
        Object invoke = this.l.invoke();
        AbstractC0048Bt.m(invoke, "<get-annotations>(...)");
        return (List) invoke;
    }

    public final String getName() {
        InterfaceC1882sH e = e();
        RY ry = e instanceof RY ? (RY) e : null;
        if (ry != null && !ry.n().Q()) {
            C0827cE name = ry.getName();
            AbstractC0048Bt.m(name, "valueParameter.name");
            if (!name.i) {
                return name.b();
            }
        }
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + (this.h.hashCode() * 31);
    }

    public final C1661ox i() {
        AbstractC1004ey c = e().c();
        AbstractC0048Bt.m(c, "descriptor.type");
        return new C1661ox(c, new C0336Mw(this, 1));
    }

    public final boolean l() {
        InterfaceC1882sH e = e();
        RY ry = e instanceof RY ? (RY) e : null;
        if (ry != null) {
            return AbstractC0192Hh.a(ry);
        }
        return false;
    }

    public final boolean m() {
        InterfaceC1882sH e = e();
        return (e instanceof RY) && ((RY) e).q != null;
    }

    public final String toString() {
        String b;
        C2304yh c2304yh = XM.a;
        StringBuilder sb = new StringBuilder();
        int ordinal = this.j.ordinal();
        if (ordinal == 0) {
            sb.append("instance parameter");
        } else if (ordinal == 2) {
            sb.append("extension receiver parameter");
        } else if (ordinal == 3) {
            sb.append("parameter #" + this.i + ' ' + getName());
        }
        sb.append(" of ");
        InterfaceC2204x9 p = this.h.p();
        if (p instanceof PJ) {
            b = XM.c((PJ) p);
        } else {
            if (!(p instanceof InterfaceC0381Op)) {
                throw new IllegalStateException(("Illegal callable: " + p).toString());
            }
            b = XM.b((InterfaceC0381Op) p);
        }
        sb.append(b);
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
