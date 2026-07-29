package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.xL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2216xL extends AbstractC1782qm {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216xL(JR jr, JR jr2) {
        super(jr, jr2);
        AbstractC0048Bt.n(jr, "lowerBound");
        AbstractC0048Bt.n(jr2, "upperBound");
        InterfaceC1136gy.a.b(jr, jr2);
    }

    public static final ArrayList K0(C2304yh c2304yh, AbstractC1004ey abstractC1004ey) {
        List<AbstractC1701pX> w0 = abstractC1004ey.w0();
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(w0));
        for (AbstractC1701pX abstractC1701pX : w0) {
            AbstractC0048Bt.n(abstractC1701pX, "typeProjection");
            StringBuilder sb = new StringBuilder();
            AbstractC0720ac.s0(AbstractC0868ct.J(abstractC1701pX), sb, ", ", null, null, new C2238xh(c2304yh, 0), 60);
            String sb2 = sb.toString();
            AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
            arrayList.add(sb2);
        }
        return arrayList;
    }

    public static final String L0(String str, String str2) {
        String substring;
        if (!UT.D(str, '<')) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC0048Bt.n(str, "<this>");
        AbstractC0048Bt.n(str, "missingDelimiterValue");
        int H = UT.H(str, '<', 0, 6);
        if (H == -1) {
            substring = str;
        } else {
            substring = str.substring(0, H);
            AbstractC0048Bt.m(substring, "substring(...)");
        }
        sb.append(substring);
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        sb.append(UT.Q(str, '>', str));
        return sb.toString();
    }

    @Override // o.AbstractC1004ey
    public final AbstractC1004ey D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR jr = this.i;
        AbstractC0048Bt.n(jr, "type");
        JR jr2 = this.j;
        AbstractC0048Bt.n(jr2, "type");
        return new C2216xL(jr, jr2);
    }

    @Override // o.AbstractC2097vY
    public final AbstractC2097vY F0(boolean z) {
        return new C2216xL(this.i.F0(z), this.j.F0(z));
    }

    @Override // o.AbstractC2097vY
    /* renamed from: G0 */
    public final AbstractC2097vY D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        JR jr = this.i;
        AbstractC0048Bt.n(jr, "type");
        JR jr2 = this.j;
        AbstractC0048Bt.n(jr2, "type");
        return new C2216xL(jr, jr2);
    }

    @Override // o.AbstractC2097vY
    public final AbstractC2097vY H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return new C2216xL(this.i.H0(ow), this.j.H0(ow));
    }

    @Override // o.AbstractC1782qm
    public final JR I0() {
        return this.i;
    }

    @Override // o.AbstractC1782qm
    public final String J0(C2304yh c2304yh, C2304yh c2304yh2) {
        JR jr = this.i;
        String Y = c2304yh.Y(jr);
        JR jr2 = this.j;
        String Y2 = c2304yh.Y(jr2);
        if (c2304yh2.a.n()) {
            return "raw (" + Y + ".." + Y2 + ')';
        }
        if (jr2.w0().isEmpty()) {
            return c2304yh.F(Y, Y2, AbstractC0772bO.l(this));
        }
        ArrayList K0 = K0(c2304yh, jr);
        ArrayList K02 = K0(c2304yh, jr2);
        String t0 = AbstractC0720ac.t0(K0, ", ", null, null, WI.k, 30);
        ArrayList O0 = AbstractC0720ac.O0(K0, K02);
        if (!O0.isEmpty()) {
            Iterator it = O0.iterator();
            while (it.hasNext()) {
                C1619oH c1619oH = (C1619oH) it.next();
                String str = (String) c1619oH.h;
                String str2 = (String) c1619oH.i;
                if (!AbstractC0048Bt.h(str, UT.M(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        }
        Y2 = L0(Y2, t0);
        String L0 = L0(Y, t0);
        return AbstractC0048Bt.h(L0, Y2) ? L0 : c2304yh.F(L0, Y2, AbstractC0772bO.l(this));
    }

    @Override // o.AbstractC1782qm, o.AbstractC1004ey
    public final WB r0() {
        InterfaceC2364zb c = B0().c();
        InterfaceC1245ib interfaceC1245ib = c instanceof InterfaceC1245ib ? (InterfaceC1245ib) c : null;
        if (interfaceC1245ib != null) {
            WB d0 = interfaceC1245ib.d0(new C2150wL());
            AbstractC0048Bt.m(d0, "classDescriptor.getMemberScope(RawSubstitution())");
            return d0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + B0().c()).toString());
    }
}
