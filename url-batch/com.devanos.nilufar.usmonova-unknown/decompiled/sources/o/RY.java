package o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class RY extends TY implements InterfaceC1882sH, SY {
    public final int m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f98o;
    public final boolean p;
    public final AbstractC1004ey q;
    public final RY r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RY(InterfaceC2072v9 interfaceC2072v9, RY ry, int i, InterfaceC1738q4 interfaceC1738q4, C0827cE c0827cE, AbstractC1004ey abstractC1004ey, boolean z, boolean z2, boolean z3, AbstractC1004ey abstractC1004ey2, IS is) {
        super(interfaceC2072v9, interfaceC1738q4, c0827cE, abstractC1004ey, is);
        AbstractC0048Bt.n(interfaceC2072v9, "containingDeclaration");
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(abstractC1004ey, "outType");
        AbstractC0048Bt.n(is, Constants.ScionAnalytics.PARAM_SOURCE);
        this.m = i;
        this.n = z;
        this.f98o = z2;
        this.p = z3;
        this.q = abstractC1004ey2;
        this.r = ry == null ? this : ry;
    }

    @Override // o.SY
    public final boolean G() {
        return false;
    }

    public RY H0(C0459Rp c0459Rp, C0827cE c0827cE, int i) {
        InterfaceC1738q4 annotations = getAnnotations();
        AbstractC0048Bt.m(annotations, "annotations");
        AbstractC1004ey c = c();
        AbstractC0048Bt.m(c, "type");
        return new RY(c0459Rp, null, i, annotations, c0827cE, c, I0(), this.f98o, this.p, this.q, IS.e);
    }

    public final boolean I0() {
        return this.n && ((InterfaceC2204x9) n()).M() != 2;
    }

    @Override // o.AbstractC1314jg, o.InterfaceC1118gg
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2072v9 n() {
        InterfaceC1118gg n = super.n();
        AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC2072v9) n;
    }

    @Override // o.AbstractC1314jg, o.AbstractC1184hg, o.InterfaceC1118gg
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final RY a() {
        RY ry = this.r;
        return ry == this ? this : ry.a();
    }

    @Override // o.InterfaceC1106gU
    public final InterfaceC1249ig e(C2096vX c2096vX) {
        AbstractC0048Bt.n(c2096vX, "substitutor");
        if (c2096vX.a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC1446lg, o.OB
    public final C0244Jh getVisibility() {
        C0244Jh c0244Jh = AbstractC0270Kh.f;
        AbstractC0048Bt.m(c0244Jh, "LOCAL");
        return c0244Jh;
    }

    @Override // o.InterfaceC2072v9
    public final Collection o() {
        Collection o2 = n().o();
        AbstractC0048Bt.m(o2, "containingDeclaration.overriddenDescriptors");
        Collection collection = o2;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((RY) ((InterfaceC2072v9) it.next()).t0().get(this.m));
        }
        return arrayList;
    }

    @Override // o.SY
    public final /* bridge */ /* synthetic */ AbstractC0551Vd o0() {
        return null;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.L(this, obj);
    }
}
