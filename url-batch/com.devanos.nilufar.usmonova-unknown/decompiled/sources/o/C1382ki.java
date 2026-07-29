package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1382ki extends AbstractC2191x {
    public final C0321Mh r;
    public final RK s;
    public final C0347Nh t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1382ki(C0321Mh c0321Mh, RK rk, int i) {
        super(r2, r3, r4, r5, r6, rk.m, i, C1097gL.m);
        C0296Lh c0296Lh = c0321Mh.a;
        VA va = c0296Lh.a;
        InterfaceC1118gg interfaceC1118gg = c0321Mh.c;
        C1672p4 c1672p4 = C0460Rq.t;
        C0827cE C = AbstractC1052fg.C(c0321Mh.b, rk.l);
        QK qk = rk.n;
        AbstractC0048Bt.m(qk, "proto.variance");
        int ordinal = qk.ordinal();
        int i2 = 2;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = 3;
            } else {
                if (ordinal != 2) {
                    throw new C0057Cc();
                }
                i2 = 1;
            }
        }
        this.r = c0321Mh;
        this.s = rk;
        this.t = new C0347Nh(c0296Lh.a, new C1139h0(9, this));
    }

    @Override // o.AbstractC1533n0
    public final List I0() {
        C0321Mh c0321Mh = this.r;
        C0695aD c0695aD = c0321Mh.d;
        RK rk = this.s;
        AbstractC0048Bt.n(rk, "<this>");
        List list = rk.f96o;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = rk.p;
            AbstractC0048Bt.m(list2, "upperBoundIdList");
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list2));
            for (Integer num : list2) {
                AbstractC0048Bt.m(num, "it");
                arrayList.add(c0695aD.a(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return AbstractC0868ct.J(AbstractC0192Hh.e(this).m());
        }
        XW xw = c0321Mh.h;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(xw.g((MK) it.next()));
        }
        return arrayList2;
    }

    @Override // o.L, o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return this.t;
    }
}
