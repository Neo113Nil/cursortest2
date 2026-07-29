package o;

/* loaded from: classes.dex */
public final class IJ extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ long h;
    public final /* synthetic */ C0843cU i;
    public final /* synthetic */ BT j;
    public final /* synthetic */ BT k;
    public final /* synthetic */ BT l;
    public final /* synthetic */ BT m;
    public final /* synthetic */ float n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f49o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IJ(long j, C0843cU c0843cU, C0099Ds c0099Ds, C0099Ds c0099Ds2, C0099Ds c0099Ds3, C0099Ds c0099Ds4, float f, long j2) {
        super(1);
        this.h = j;
        this.i = c0843cU;
        this.j = c0099Ds;
        this.k = c0099Ds2;
        this.l = c0099Ds3;
        this.m = c0099Ds4;
        this.n = f;
        this.f49o = j2;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        float f;
        InterfaceC1121gj interfaceC1121gj = (InterfaceC1121gj) obj;
        long j = this.h;
        C0843cU c0843cU = this.i;
        KJ.b(interfaceC1121gj, 0.0f, 360.0f, j, c0843cU);
        float floatValue = (((Number) this.j.getValue()).floatValue() * 216.0f) % 360.0f;
        float floatValue2 = ((Number) this.k.getValue()).floatValue();
        BT bt = this.l;
        float abs = Math.abs(floatValue2 - ((Number) bt.getValue()).floatValue());
        float floatValue3 = ((Number) bt.getValue()).floatValue() + ((Number) this.m.getValue()).floatValue() + (floatValue - 90.0f);
        if (c0843cU.j == 0) {
            f = 0.0f;
        } else {
            f = ((this.n / (KJ.a / 2)) * 57.29578f) / 2.0f;
        }
        KJ.b(interfaceC1121gj, floatValue3 + f, Math.max(abs, 0.1f), this.f49o, c0843cU);
        return C0782bY.a;
    }
}
