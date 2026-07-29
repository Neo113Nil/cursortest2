package o;

/* renamed from: o.vJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2082vJ implements TD, InterfaceC0422Qe {
    public final InterfaceC0189He h;
    public final /* synthetic */ TD i;

    public C2082vJ(TD td, InterfaceC0189He interfaceC0189He) {
        this.h = interfaceC0189He;
        this.i = td;
    }

    @Override // o.BT
    public final Object getValue() {
        return this.i.getValue();
    }

    @Override // o.InterfaceC0422Qe
    public final InterfaceC0189He m() {
        return this.h;
    }

    @Override // o.TD
    public final void setValue(Object obj) {
        this.i.setValue(obj);
    }
}
