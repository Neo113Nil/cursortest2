package o;

/* renamed from: o.gQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1102gQ extends AbstractC1993u implements InterfaceC0474Se {
    public final InterfaceC2235xe k;

    public C1102gQ(InterfaceC2235xe interfaceC2235xe, InterfaceC0189He interfaceC0189He) {
        super(interfaceC0189He, true);
        this.k = interfaceC2235xe;
    }

    @Override // o.C0283Ku
    public final boolean M() {
        return true;
    }

    @Override // o.InterfaceC0474Se
    public final InterfaceC0474Se getCallerFrame() {
        InterfaceC2235xe interfaceC2235xe = this.k;
        if (interfaceC2235xe instanceof InterfaceC0474Se) {
            return (InterfaceC0474Se) interfaceC2235xe;
        }
        return null;
    }

    @Override // o.C0283Ku
    public void i(Object obj) {
        AbstractC0022At.I(PX.H0(obj), AbstractC1473m3.L(this.k));
    }

    @Override // o.C0283Ku
    public void l(Object obj) {
        this.k.resumeWith(PX.H0(obj));
    }
}
