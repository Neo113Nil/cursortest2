package o;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: o.ei, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988ei extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC1596ny i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0988ei(InterfaceC1455lp interfaceC1455lp, int i) {
        super(0);
        this.h = i;
        switch (i) {
            case 1:
                this.i = (AbstractC1596ny) interfaceC1455lp;
                super(0);
                break;
            default:
                this.i = (AbstractC1596ny) interfaceC1455lp;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.lp, o.ny] */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.lp, o.ny] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return AbstractC0720ac.M0((Iterable) this.i.invoke());
            default:
                try {
                    return (List) this.i.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C1318jk.h;
                }
        }
    }
}
