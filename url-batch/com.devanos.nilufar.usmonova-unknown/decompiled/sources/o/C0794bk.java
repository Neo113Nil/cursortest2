package o;

/* renamed from: o.bk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794bk implements InterfaceC2249xs {
    public final boolean h;

    public C0794bk(boolean z) {
        this.h = z;
    }

    @Override // o.InterfaceC2249xs
    public final boolean b() {
        return this.h;
    }

    @Override // o.InterfaceC2249xs
    public final OE d() {
        return null;
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("Empty{"), this.h ? "Active" : "New", '}');
    }
}
