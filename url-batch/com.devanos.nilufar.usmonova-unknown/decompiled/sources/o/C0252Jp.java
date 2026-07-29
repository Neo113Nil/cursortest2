package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Jp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252Jp extends AbstractC1598o {
    public static final C1639ob s = new C1639ob(AbstractC1499mT.j, C0827cE.e("Function"));
    public static final C1639ob t = new C1639ob(AbstractC1499mT.h, C0827cE.e("KFunction"));
    public final VA l;
    public final InterfaceC0961eH m;
    public final EnumC0304Lp n;

    /* renamed from: o, reason: collision with root package name */
    public final int f53o;
    public final C0226Ip p;
    public final C0329Mp q;
    public final List r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252Jp(VA va, W8 w8, EnumC0304Lp enumC0304Lp, int i) {
        super(va, enumC0304Lp.a(i));
        AbstractC0048Bt.n(w8, "containingDeclaration");
        this.l = va;
        this.m = w8;
        this.n = enumC0304Lp;
        this.f53o = i;
        this.p = new C0226Ip(this);
        this.q = new C0329Mp(va, this);
        ArrayList arrayList = new ArrayList();
        C1197ht c1197ht = new C1197ht(1, i, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(c1197ht));
        Iterator it = c1197ht.iterator();
        while (((C1131gt) it).j) {
            arrayList.add(C1503mX.K0(this, 2, C0827cE.e("P" + ((C1131gt) it).nextInt()), arrayList.size(), this.l));
            arrayList2.add(C0782bY.a);
        }
        arrayList.add(C1503mX.K0(this, 3, C0827cE.e("R"), arrayList.size(), this.l));
        this.r = AbstractC0720ac.J0(arrayList);
    }

    @Override // o.InterfaceC1245ib
    public final int B() {
        return 2;
    }

    @Override // o.InterfaceC1245ib
    public final boolean D() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final /* bridge */ /* synthetic */ Collection E() {
        return C1318jk.h;
    }

    @Override // o.InterfaceC1245ib
    public final boolean K() {
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final /* bridge */ /* synthetic */ Collection U() {
        return C1318jk.h;
    }

    @Override // o.OB
    public final boolean X() {
        return false;
    }

    @Override // o.InterfaceC1249ig
    public final IS d() {
        return IS.e;
    }

    @Override // o.InterfaceC1245ib, o.OB
    public final int g() {
        return 4;
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
    public final /* bridge */ /* synthetic */ C0981eb i0() {
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
        return false;
    }

    @Override // o.InterfaceC1245ib
    public final boolean m() {
        return false;
    }

    @Override // o.InterfaceC1118gg
    public final InterfaceC1118gg n() {
        return this.m;
    }

    @Override // o.InterfaceC1245ib, o.InterfaceC0004Ab
    public final List p() {
        return this.r;
    }

    @Override // o.OB
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        String b = getName().b();
        AbstractC0048Bt.m(b, "name.asString()");
        return b;
    }

    @Override // o.YC
    public final WB u(C1398ky c1398ky) {
        return this.q;
    }

    @Override // o.OB
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
