package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506ma implements InterfaceC1440la {
    public final AbstractC1701pX a;
    public C2077vE b;

    public C1506ma(AbstractC1701pX abstractC1701pX) {
        AbstractC0048Bt.n(abstractC1701pX, "projection");
        this.a = abstractC1701pX;
        abstractC1701pX.a();
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
    public final /* bridge */ /* synthetic */ InterfaceC2364zb c() {
        return null;
    }

    @Override // o.SW
    public final Collection d() {
        AbstractC1701pX abstractC1701pX = this.a;
        AbstractC1004ey b = abstractC1701pX.a() == 3 ? abstractC1701pX.b() : l().o();
        AbstractC0048Bt.m(b, "if (projection.projectio… builtIns.nullableAnyType");
        return AbstractC0868ct.J(b);
    }

    @Override // o.SW
    public final List getParameters() {
        return C1318jk.h;
    }

    @Override // o.SW
    public final AbstractC0545Ux l() {
        AbstractC0545Ux l = this.a.b().B0().l();
        AbstractC0048Bt.m(l, "projection.type.constructor.builtIns");
        return l;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}
