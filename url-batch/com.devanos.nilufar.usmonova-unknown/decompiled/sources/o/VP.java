package o;

/* loaded from: classes.dex */
public final class VP extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ QD i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VP(QD qd, int i) {
        super(1);
        this.h = i;
        this.i = qd;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                return obj == this.i ? "(this)" : String.valueOf(obj);
            default:
                if (obj instanceof GT) {
                    ((GT) obj).f(4);
                }
                this.i.a(obj);
                return C0782bY.a;
        }
    }
}
