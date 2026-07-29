package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.vE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2077vE implements InterfaceC1440la {
    public final AbstractC1701pX a;
    public InterfaceC1455lp b;
    public final C2077vE c;
    public final InterfaceC1437lX d;
    public final Object e;

    public /* synthetic */ C2077vE(AbstractC1701pX abstractC1701pX, C0425Qh c0425Qh, InterfaceC1437lX interfaceC1437lX, int i) {
        this(abstractC1701pX, (i & 2) != 0 ? null : c0425Qh, (C2077vE) null, (i & 8) != 0 ? null : interfaceC1437lX);
    }

    @Override // o.SW
    public final boolean a() {
        return false;
    }

    @Override // o.InterfaceC1440la
    public final AbstractC1701pX b() {
        return this.a;
    }

    @Override // o.SW
    public final InterfaceC2364zb c() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.SW
    public final Collection d() {
        List list = (List) this.e.getValue();
        return list == null ? C1318jk.h : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2077vE.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C2077vE c2077vE = (C2077vE) obj;
        C2077vE c2077vE2 = this.c;
        if (c2077vE2 == null) {
            c2077vE2 = this;
        }
        C2077vE c2077vE3 = c2077vE.c;
        if (c2077vE3 != null) {
            c2077vE = c2077vE3;
        }
        return c2077vE2 == c2077vE;
    }

    @Override // o.SW
    public final List getParameters() {
        return C1318jk.h;
    }

    public final int hashCode() {
        C2077vE c2077vE = this.c;
        return c2077vE != null ? c2077vE.hashCode() : super.hashCode();
    }

    @Override // o.SW
    public final AbstractC0545Ux l() {
        AbstractC1004ey b = this.a.b();
        AbstractC0048Bt.m(b, "projection.type");
        return AbstractC0772bO.l(b);
    }

    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    public C2077vE(AbstractC1701pX abstractC1701pX, InterfaceC1455lp interfaceC1455lp, C2077vE c2077vE, InterfaceC1437lX interfaceC1437lX) {
        AbstractC0048Bt.n(abstractC1701pX, "projection");
        this.a = abstractC1701pX;
        this.b = interfaceC1455lp;
        this.c = c2077vE;
        this.d = interfaceC1437lX;
        this.e = EB.C(EnumC1992tz.h, new C1139h0(28, this));
    }
}
