package o;

/* renamed from: o.wY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2163wY implements InterfaceC0137Fe {
    public final C2163wY h;
    public final C0657Zf i;

    public C2163wY(C2163wY c2163wY, C0657Zf c0657Zf) {
        this.h = c2163wY;
        this.i = c0657Zf;
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He D(InterfaceC0189He interfaceC0189He) {
        return PX.E0(this, interfaceC0189He);
    }

    @Override // o.InterfaceC0189He
    public final Object I(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return interfaceC2312yp.invoke(obj, this);
    }

    public final void a(C0657Zf c0657Zf) {
        if (this.i == c0657Zf) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        C2163wY c2163wY = this.h;
        if (c2163wY != null) {
            c2163wY.a(c0657Zf);
        }
    }

    @Override // o.InterfaceC0137Fe
    public final InterfaceC0163Ge getKey() {
        return C1623oL.q;
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.z0(this, interfaceC0163Ge);
    }

    @Override // o.InterfaceC0189He
    public final InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.J(this, interfaceC0163Ge);
    }
}
