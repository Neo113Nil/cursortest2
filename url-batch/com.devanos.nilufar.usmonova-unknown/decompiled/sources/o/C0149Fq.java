package o;

/* renamed from: o.Fq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149Fq extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ InterfaceC2114vp i;
    public final /* synthetic */ InterfaceC2114vp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0149Fq(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2, int i) {
        super(1);
        this.h = i;
        this.i = interfaceC2114vp;
        this.j = interfaceC2114vp2;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        int i;
        switch (this.h) {
            case 0:
                C1959tS c1959tS = (C1959tS) obj;
                synchronized (AbstractC2025uS.b) {
                    i = AbstractC2025uS.d;
                    AbstractC2025uS.d = i + 1;
                }
                return new SD(i, c1959tS, this.i, this.j);
            case 1:
                this.i.invoke(obj);
                this.j.invoke(obj);
                return C0782bY.a;
            default:
                this.i.invoke(obj);
                this.j.invoke(obj);
                return C0782bY.a;
        }
    }
}
