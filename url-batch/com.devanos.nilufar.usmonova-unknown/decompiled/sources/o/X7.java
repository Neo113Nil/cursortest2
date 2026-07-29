package o;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class X7 extends TC implements InterfaceC2123vy, InterfaceC1055fj, InterfaceC2155wQ, WC, InterfaceC0302Ln, InterfaceC0699aH, InterfaceC0725ah {
    public SC n;

    @Override // o.WC
    public final C0460Rq a() {
        return C0460Rq.C;
    }

    @Override // o.InterfaceC1055fj
    public final void b(C0079Cy c0079Cy) {
        AbstractC0048Bt.l(this.n, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        throw new ClassCastException();
    }

    @Override // o.InterfaceC2123vy
    public final M5 d(AbstractC1415lB abstractC1415lB, IB ib, long j) {
        AbstractC0048Bt.l(this.n, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // o.InterfaceC0302Ln
    public final void e(InterfaceC0224In interfaceC0224In) {
        AbstractC0868ct.W("applyFocusProperties called on wrong node");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.ny, o.vp] */
    @Override // o.InterfaceC2155wQ
    public final void h(C2023uQ c2023uQ) {
        SC sc = this.n;
        AbstractC0048Bt.l(sc, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        C2023uQ c2023uQ2 = new C2023uQ();
        c2023uQ2.i = true;
        ((AppendedSemanticsElement) sc).a.invoke(c2023uQ2);
        AbstractC0048Bt.l(c2023uQ, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        LinkedHashMap linkedHashMap = c2023uQ.h;
        if (c2023uQ2.i) {
            c2023uQ.i = true;
        }
        if (c2023uQ2.j) {
            c2023uQ.j = true;
        }
        for (Map.Entry entry : c2023uQ2.h.entrySet()) {
            FQ fq = (FQ) entry.getKey();
            Object value = entry.getValue();
            if (!linkedHashMap.containsKey(fq)) {
                linkedHashMap.put(fq, value);
            } else if (value instanceof C1599o0) {
                Object obj = linkedHashMap.get(fq);
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C1599o0 c1599o0 = (C1599o0) obj;
                String str = c1599o0.a;
                if (str == null) {
                    str = ((C1599o0) value).a;
                }
                InterfaceC0174Gp interfaceC0174Gp = c1599o0.b;
                if (interfaceC0174Gp == null) {
                    interfaceC0174Gp = ((C1599o0) value).b;
                }
                linkedHashMap.put(fq, new C1599o0(str, interfaceC0174Gp));
            }
        }
    }

    @Override // o.InterfaceC1055fj
    public final void i() {
        AbstractC1473m3.M(this);
    }

    @Override // o.InterfaceC0699aH
    public final boolean j() {
        return this.m;
    }

    @Override // o.TC
    public final void m() {
        q(true);
    }

    @Override // o.TC
    public final void n() {
        r();
    }

    public final void q(boolean z) {
        if (!this.m) {
            AbstractC0868ct.W("initializeModifier called on unattached node");
            throw null;
        }
        if ((this.c & 4) != 0 && !z) {
            AbstractC0946e20.I(this, 2).n0();
        }
        if ((this.c & 2) != 0) {
            IU iu = (IU) AbstractC0946e20.J(this).u.e;
            AbstractC0048Bt.l(iu, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (iu.n) {
                ME me = this.h;
                AbstractC0048Bt.k(me);
                ((C2255xy) me).D0(this);
                YG yg = me.C;
                if (yg != null) {
                    yg.invalidate();
                }
            }
            if (!z) {
                AbstractC0946e20.I(this, 2).n0();
                AbstractC0946e20.J(this).s();
            }
        }
        if ((this.c & 8) != 0) {
            ((S2) AbstractC0946e20.K(this)).z();
        }
    }

    public final void r() {
        if (!this.m) {
            AbstractC0868ct.W("unInitializeModifier called on unattached node");
            throw null;
        }
        if ((this.c & 8) != 0) {
            ((S2) AbstractC0946e20.K(this)).z();
        }
    }

    public final String toString() {
        return this.n.toString();
    }
}
