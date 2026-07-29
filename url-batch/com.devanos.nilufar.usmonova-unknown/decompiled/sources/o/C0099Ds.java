package o;

/* renamed from: o.Ds, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099Ds implements BT {
    public Number h;
    public Number i;
    public final C0208Hx j;
    public final C2278yH k;
    public JU l;
    public boolean m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public long f33o;
    public final /* synthetic */ C0177Gs p;

    public C0099Ds(C0177Gs c0177Gs, Number number, Number number2, C0208Hx c0208Hx, C0073Cs c0073Cs) {
        this.p = c0177Gs;
        this.h = number;
        this.i = number2;
        this.j = c0208Hx;
        this.k = AbstractC2219xO.r(number);
        this.l = new JU(c0073Cs, c0208Hx, this.h, this.i);
    }

    @Override // o.BT
    public final Object getValue() {
        return this.k.getValue();
    }
}
