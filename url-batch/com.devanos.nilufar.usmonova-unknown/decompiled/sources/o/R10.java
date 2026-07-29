package o;

import android.view.View;
import com.devanos.nilufar.usmonova.R;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class R10 extends AbstractC1596ny implements InterfaceC2312yp {
    public final /* synthetic */ int h;
    public final /* synthetic */ S10 i;
    public final /* synthetic */ InterfaceC2312yp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R10(S10 s10, InterfaceC2312yp interfaceC2312yp, int i) {
        super(2);
        this.h = i;
        this.i = s10;
        this.j = interfaceC2312yp;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                InterfaceC1377kd interfaceC1377kd = (InterfaceC1377kd) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C1575nd c1575nd = (C1575nd) interfaceC1377kd;
                    if (c1575nd.t()) {
                        c1575nd.F();
                        break;
                    }
                }
                AbstractC1934t3.a(this.i.h, this.j, interfaceC1377kd, 0);
            default:
                InterfaceC1377kd interfaceC1377kd2 = (InterfaceC1377kd) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C1575nd c1575nd2 = (C1575nd) interfaceC1377kd2;
                    if (c1575nd2.t()) {
                        c1575nd2.F();
                        break;
                    }
                }
                S10 s10 = this.i;
                S2 s2 = s10.h;
                Object tag = s2.getTag(R.id.inspection_slot_table_set);
                Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC1594nw) && !(tag instanceof InterfaceC0103Dw))) ? null : (Set) tag;
                if (set == null) {
                    Object parent = s2.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                    set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC1594nw) && !(tag2 instanceof InterfaceC0103Dw))) ? null : (Set) tag2;
                }
                if (set != null) {
                    C1575nd c1575nd3 = (C1575nd) interfaceC1377kd2;
                    set.add(c1575nd3.c);
                    c1575nd3.p = true;
                    c1575nd3.z = true;
                    c1575nd3.c.p = new HashMap();
                    C0841cS c0841cS = c1575nd3.E;
                    c0841cS.getClass();
                    c0841cS.p = new HashMap();
                    C0972eS c0972eS = c1575nd3.F;
                    C0841cS c0841cS2 = c0972eS.a;
                    c0972eS.e = c0841cS2.p;
                    c0972eS.f = c0841cS2.q;
                }
                C1575nd c1575nd4 = (C1575nd) interfaceC1377kd2;
                boolean e = c1575nd4.e(s10);
                Object C = c1575nd4.C();
                C1623oL c1623oL = C1311jd.a;
                if (e || C == c1623oL) {
                    C = new P10(s10, null);
                    c1575nd4.P(C);
                }
                PX.g(s2, c1575nd4, (InterfaceC2312yp) C);
                boolean e2 = c1575nd4.e(s10);
                Object C2 = c1575nd4.C();
                if (e2 || C2 == c1623oL) {
                    C2 = new Q10(s10, null);
                    c1575nd4.P(C2);
                }
                PX.g(s2, c1575nd4, (InterfaceC2312yp) C2);
                AbstractC1473m3.a(AbstractC0670Zs.a.a(set), AbstractC0946e20.F(-1193460702, new R10(s10, this.j, 0), c1575nd4), c1575nd4, 56);
                break;
        }
        return C0782bY.a;
    }
}
