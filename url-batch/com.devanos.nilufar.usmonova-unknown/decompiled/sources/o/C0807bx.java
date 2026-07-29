package o;

/* renamed from: o.bx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807bx extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0872cx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0807bx(C0872cx c0872cx, int i) {
        super(0);
        this.h = i;
        this.i = c0872cx;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return new C0741ax(this.i);
            default:
                return this.i.s();
        }
    }
}
