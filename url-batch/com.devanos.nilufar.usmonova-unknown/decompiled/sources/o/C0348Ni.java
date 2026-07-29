package o;

import java.io.Serializable;
import java.util.List;

/* renamed from: o.Ni, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348Ni extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Serializable k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348Ni(SB sb, boolean z, CK ck) {
        super(0);
        this.j = sb;
        this.i = z;
        this.k = ck;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        List list;
        switch (this.h) {
            case 0:
                if (this.i) {
                    KP kp = (KP) this.j;
                    String str = (String) this.k;
                    kp.getClass();
                    AbstractC0048Bt.n(str, "key");
                    kp.a.k(str);
                }
                return C0782bY.a;
            default:
                SB sb = (SB) this.j;
                C0321Mh c0321Mh = sb.a;
                C0296Lh c0296Lh = c0321Mh.a;
                AbstractC0900dL a = sb.a(c0321Mh.c);
                if (a != null) {
                    CK ck = (CK) this.k;
                    list = this.i ? AbstractC0720ac.J0(c0296Lh.e.k(a, ck)) : AbstractC0720ac.J0(c0296Lh.e.x(a, ck));
                } else {
                    list = null;
                }
                return list == null ? C1318jk.h : list;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348Ni(boolean z, KP kp, String str) {
        super(0);
        this.i = z;
        this.j = kp;
        this.k = str;
    }
}
