package o;

/* renamed from: o.aT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711aT implements InterfaceC2235xe, InterfaceC0474Se {
    public final InterfaceC2235xe h;
    public final InterfaceC0189He i;

    public C0711aT(InterfaceC2235xe interfaceC2235xe, InterfaceC0189He interfaceC0189He) {
        this.h = interfaceC2235xe;
        this.i = interfaceC0189He;
    }

    @Override // o.InterfaceC0474Se
    public final InterfaceC0474Se getCallerFrame() {
        InterfaceC2235xe interfaceC2235xe = this.h;
        if (interfaceC2235xe instanceof InterfaceC0474Se) {
            return (InterfaceC0474Se) interfaceC2235xe;
        }
        return null;
    }

    @Override // o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        return this.i;
    }

    @Override // o.InterfaceC2235xe
    public final void resumeWith(Object obj) {
        this.h.resumeWith(obj);
    }
}
