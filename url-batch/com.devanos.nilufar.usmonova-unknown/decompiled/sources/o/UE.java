package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class UE extends AbstractC1309jb {
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f114o;
    public final C1968tb p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UE(VA va, InterfaceC1836rb interfaceC1836rb, C0827cE c0827cE, boolean z, int i) {
        super(va, interfaceC1836rb, c0827cE, IS.e);
        AbstractC0048Bt.n(interfaceC1836rb, "container");
        this.n = z;
        C1197ht c0 = AbstractC1807r8.c0(0, i);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(c0));
        Iterator it = c0.iterator();
        while (((C1131gt) it).j) {
            int nextInt = ((C1131gt) it).nextInt();
            arrayList.add(C1503mX.K0(this, 1, C0827cE.e("T" + nextInt), nextInt, va));
        }
        this.f114o = arrayList;
        this.p = new C1968tb(this, TM.n(this), AbstractC0773bP.i(AbstractC0192Hh.j(this).l().e()), va);
    }

    @Override // o.InterfaceC1245ib
    public final int B() {
        return 1;
    }

    @Override // o.InterfaceC1245ib
    public final boolean D() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final Collection E() {
        return C1648ok.h;
    }

    @Override // o.InterfaceC1245ib
    public final boolean K() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final Collection U() {
        return C1318jk.h;
    }

    @Override // o.OB
    public final boolean X() {
        return false;
    }

    @Override // o.InterfaceC1245ib, o.OB
    public final int g() {
        return 1;
    }

    @Override // o.W3
    public final InterfaceC1738q4 getAnnotations() {
        return C0460Rq.t;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = AbstractC0270Kh.e;
        AbstractC0048Bt.m(c0244Jh, "PUBLIC");
        return c0244Jh;
    }

    @Override // o.InterfaceC1245ib
    public final LY h0() {
        return null;
    }

    @Override // o.InterfaceC1245ib
    public final C0981eb i0() {
        return null;
    }

    @Override // o.InterfaceC1245ib
    public final boolean j() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final /* bridge */ /* synthetic */ WB j0() {
        return VB.b;
    }

    @Override // o.InterfaceC0004Ab
    public final boolean k() {
        return this.n;
    }

    @Override // o.InterfaceC1245ib
    public final boolean m() {
        return false;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC0004Ab
    public final List p() {
        return this.f114o;
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // o.YC
    public final WB u(C1398ky c1398ky) {
        return VB.b;
    }

    @Override // o.AbstractC1309jb, o.OB
    public final boolean w() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final boolean y0() {
        return false;
    }

    @Override // o.InterfaceC2364zb
    public final SW z() {
        return this.p;
    }
}
