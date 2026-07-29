package o;

/* loaded from: classes.dex */
public final class HF extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ IF i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HF(IF r1, int i) {
        super(0);
        this.h = i;
        this.i = r1;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                LE le = this.i.c;
                CH ch = (CH) le.invoke();
                if (AbstractC0809c.a(ch) != -1) {
                    return C0218Ih.r(ch.h.o(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + le + ", instead got " + ch).toString());
            default:
                CU cu = IF.f;
                IF r1 = this.i;
                synchronized (cu) {
                    IF.e.remove(((CH) r1.d.getValue()).h.o());
                }
                return C0782bY.a;
        }
    }
}
