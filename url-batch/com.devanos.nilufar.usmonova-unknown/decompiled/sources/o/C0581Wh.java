package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Wh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581Wh extends AbstractC1598o implements InterfaceC1118gg {
    public final SA A;
    public final RA B;
    public final C0769bL C;
    public final InterfaceC1738q4 D;
    public final C1030fK l;
    public final AbstractC1478m8 m;
    public final IS n;

    /* renamed from: o, reason: collision with root package name */
    public final C1639ob f125o;
    public final int p;
    public final C0244Jh q;
    public final int r;
    public final C0321Mh s;
    public final XB t;
    public final C0555Vh u;
    public final C1168hQ v;
    public final C1334k w;
    public final InterfaceC1118gg x;
    public final RA y;
    public final SA z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0581Wh(C0321Mh c0321Mh, C1030fK c1030fK, InterfaceC0893dE interfaceC0893dE, AbstractC1478m8 abstractC1478m8, IS is) {
        super(c0321Mh.a.a, AbstractC1052fg.x(interfaceC0893dE, c1030fK.l).i());
        int i;
        int i2;
        C1097gL c1097gL;
        C0321Mh c0321Mh2;
        InterfaceC1118gg interfaceC1118gg;
        AbstractC0048Bt.n(c0321Mh, "outerContext");
        AbstractC0048Bt.n(c1030fK, "classProto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(is, "sourceElement");
        this.l = c1030fK;
        this.m = abstractC1478m8;
        this.n = is;
        this.f125o = AbstractC1052fg.x(interfaceC0893dE, c1030fK.l);
        this.p = C1097gL.G0((EnumC2149wK) AbstractC1650om.e.c(c1030fK.k));
        this.q = PX.E((EnumC0703aL) AbstractC1650om.d.c(c1030fK.k));
        EnumC0964eK enumC0964eK = (EnumC0964eK) AbstractC1650om.f.c(c1030fK.k);
        int i3 = 1;
        switch (enumC0964eK == null ? -1 : AbstractC1031fL.b[enumC0964eK.ordinal()]) {
            case 2:
                i = 2;
                i2 = i;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i = 4;
                i2 = i;
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                i = 5;
                i2 = i;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                i = 6;
                i2 = i;
                break;
            default:
                i2 = 1;
                break;
        }
        this.r = i2;
        List list = c1030fK.n;
        AbstractC0048Bt.m(list, "classProto.typeParameterList");
        SK sk = c1030fK.L;
        AbstractC0048Bt.m(sk, "classProto.typeTable");
        C0695aD c0695aD = new C0695aD(sk);
        ZK zk = c1030fK.N;
        AbstractC0048Bt.m(zk, "classProto.versionRequirementTable");
        if (zk.i.size() == 0) {
            c1097gL = C1097gL.p;
            interfaceC1118gg = this;
            c0321Mh2 = c0321Mh;
        } else {
            AbstractC0048Bt.m(zk.i, "table.requirementList");
            c1097gL = new C1097gL(9);
            c0321Mh2 = c0321Mh;
            interfaceC1118gg = this;
        }
        C0321Mh a = c0321Mh2.a(interfaceC1118gg, list, interfaceC0893dE, c0695aD, c1097gL, abstractC1478m8);
        C0296Lh c0296Lh = a.a;
        this.s = a;
        this.t = i2 == 3 ? new KT(c0296Lh.a, this) : VB.b;
        this.u = new C0555Vh(this);
        C0140Fh c0140Fh = C1168hQ.d;
        VA va = c0296Lh.a;
        VA va2 = c0296Lh.a;
        ((AE) c0296Lh.q).getClass();
        U8 u8 = new U8(i3, 3, this);
        c0140Fh.getClass();
        AbstractC0048Bt.n(va, "storageManager");
        this.v = new C1168hQ(this, va, u8);
        this.w = i2 == 3 ? new C1334k(this) : null;
        InterfaceC1118gg interfaceC1118gg2 = c0321Mh.c;
        this.x = interfaceC1118gg2;
        C0529Uh c0529Uh = new C0529Uh(this, 4);
        va2.getClass();
        this.y = new RA(va2, c0529Uh);
        this.z = new SA(va2, new C0529Uh(this, 3));
        new RA(va2, new C0529Uh(this, 2));
        this.A = new SA(va2, new C0529Uh(this, 5));
        this.B = new RA(va2, new C0529Uh(this, 6));
        InterfaceC0893dE interfaceC0893dE2 = a.b;
        C0695aD c0695aD2 = a.d;
        C0581Wh c0581Wh = interfaceC1118gg2 instanceof C0581Wh ? (C0581Wh) interfaceC1118gg2 : null;
        this.C = new C0769bL(c1030fK, interfaceC0893dE2, c0695aD2, is, c0581Wh != null ? c0581Wh.C : null);
        this.D = !AbstractC1650om.c.c(c1030fK.k).booleanValue() ? C0460Rq.t : new QE(va2, new C0529Uh(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JR A0(C0827cE c0827cE) {
        Iterator it = w0().c(c0827cE, DE.n).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((PJ) next).J() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        PJ pj = (PJ) obj;
        return (JR) (pj != null ? pj.c() : null);
    }

    @Override // o.InterfaceC1245ib
    public final int B() {
        return this.r;
    }

    @Override // o.InterfaceC1245ib
    public final boolean D() {
        return AbstractC1650om.f.c(this.l.k) == EnumC0964eK.COMPANION_OBJECT;
    }

    @Override // o.InterfaceC1245ib
    public final Collection E() {
        return (Collection) this.z.invoke();
    }

    @Override // o.InterfaceC1245ib
    public final boolean K() {
        return AbstractC1650om.l.c(this.l.k).booleanValue();
    }

    @Override // o.InterfaceC1245ib
    public final Collection U() {
        return (Collection) this.A.invoke();
    }

    @Override // o.OB
    public final boolean X() {
        return AbstractC1650om.j.c(this.l.k).booleanValue();
    }

    @Override // o.InterfaceC1249ig
    public final IS d() {
        return this.n;
    }

    @Override // o.InterfaceC1245ib, o.OB
    public final int g() {
        return this.p;
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return this.D;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        return this.q;
    }

    @Override // o.InterfaceC1245ib
    public final LY h0() {
        return (LY) this.B.invoke();
    }

    @Override // o.InterfaceC1245ib
    public final C0981eb i0() {
        return (C0981eb) this.y.invoke();
    }

    @Override // o.InterfaceC1245ib
    public final boolean j() {
        return AbstractC1650om.k.c(this.l.k).booleanValue() && this.m.a(1, 4, 2);
    }

    @Override // o.InterfaceC1245ib
    public final WB j0() {
        return this.t;
    }

    @Override // o.InterfaceC0004Ab
    public final boolean k() {
        return AbstractC1650om.g.c(this.l.k).booleanValue();
    }

    @Override // o.InterfaceC1245ib
    public final boolean m() {
        if (!AbstractC1650om.k.c(this.l.k).booleanValue()) {
            return false;
        }
        AbstractC1478m8 abstractC1478m8 = this.m;
        int i = abstractC1478m8.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = abstractC1478m8.c;
            if (i2 >= 4 && (i2 > 4 || abstractC1478m8.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        return this.x;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC0004Ab
    public final List p() {
        return this.s.h.b();
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    @Override // o.AbstractC1598o, o.InterfaceC1245ib
    public final List s0() {
        C0321Mh c0321Mh = this.s;
        C0695aD c0695aD = c0321Mh.d;
        C1030fK c1030fK = this.l;
        AbstractC0048Bt.n(c1030fK, "<this>");
        List list = c1030fK.t;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = c1030fK.u;
            AbstractC0048Bt.m(list2, "contextReceiverTypeIdList");
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list2));
            for (Integer num : list2) {
                AbstractC0048Bt.m(num, "it");
                arrayList.add(c0695aD.a(num.intValue()));
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C0261Jy(z0(), new C1708pe(this, c0321Mh.h.g((MK) it.next()), (C0827cE) null), C0460Rq.t));
        }
        return arrayList2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(X() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // o.YC
    public final WB u(C1398ky c1398ky) {
        C1168hQ c1168hQ = this.v;
        AbstractC0192Hh.j(c1168hQ.a);
        return (WB) AbstractC0772bO.o(c1168hQ.c, C1168hQ.e[0]);
    }

    @Override // o.OB
    public final boolean w() {
        return AbstractC1650om.i.c(this.l.k).booleanValue();
    }

    public final C0503Th w0() {
        ((AE) this.s.a.q).getClass();
        C1168hQ c1168hQ = this.v;
        AbstractC0192Hh.j(c1168hQ.a);
        return (C0503Th) ((WB) AbstractC0772bO.o(c1168hQ.c, C1168hQ.e[0]));
    }

    @Override // o.InterfaceC1245ib
    public final boolean y0() {
        return AbstractC1650om.h.c(this.l.k).booleanValue();
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        return this.u;
    }
}
