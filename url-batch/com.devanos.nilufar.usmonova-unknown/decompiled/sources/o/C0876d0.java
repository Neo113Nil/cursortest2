package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876d0 implements SW {
    public final /* synthetic */ C1316ji a;

    public C0876d0(C1316ji c1316ji) {
        this.a = c1316ji;
    }

    @Override // o.SW
    public final boolean a() {
        return true;
    }

    @Override // o.SW
    public final InterfaceC2364zb c() {
        return this.a;
    }

    @Override // o.SW
    public final Collection d() {
        Collection d = this.a.J0().B0().d();
        AbstractC0048Bt.m(d, "declarationDescriptor.un…pe.constructor.supertypes");
        return d;
    }

    @Override // o.SW
    public final List getParameters() {
        List list = this.a.w;
        if (list != null) {
            return list;
        }
        AbstractC0048Bt.i0("typeConstructorParameters");
        throw null;
    }

    @Override // o.SW
    public final AbstractC0545Ux l() {
        return AbstractC0192Hh.e(this.a);
    }

    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}
