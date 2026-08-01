package androidx.lifecycle;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class I extends X0.f implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i, Object obj) {
        super(0);
        this.f1340b = i;
        this.f1341c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [W0.a, X0.f] */
    @Override // W0.a
    public final Object a() {
        switch (this.f1340b) {
            case 0:
                return H.e((P) this.f1341c);
            case 1:
                return (List) this.f1341c;
            default:
                try {
                    return (List) ((X0.f) this.f1341c).a();
                } catch (SSLPeerUnverifiedException unused) {
                    return Q0.m.f664a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(W0.a aVar) {
        super(0);
        this.f1340b = 2;
        this.f1341c = (X0.f) aVar;
    }
}
