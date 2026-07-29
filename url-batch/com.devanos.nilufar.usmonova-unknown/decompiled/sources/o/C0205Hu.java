package o;

/* renamed from: o.Hu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205Hu extends C0849ca {
    public final C2299yc p;

    public C0205Hu(InterfaceC2235xe interfaceC2235xe, C2299yc c2299yc) {
        super(1, interfaceC2235xe);
        this.p = c2299yc;
    }

    @Override // o.C0849ca
    public final Throwable p(C0283Ku c0283Ku) {
        Throwable c;
        C2299yc c2299yc = this.p;
        c2299yc.getClass();
        Object obj = C0283Ku.h.get(c2299yc);
        return (!(obj instanceof C0257Ju) || (c = ((C0257Ju) obj).c()) == null) ? obj instanceof C0031Bc ? ((C0031Bc) obj).a : c0283Ku.t() : c;
    }

    @Override // o.C0849ca
    public final String x() {
        return "AwaitContinuation";
    }
}
