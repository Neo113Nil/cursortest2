package androidx.lifecycle;

import h1.InterfaceC0173a;
import j0.InterfaceC0182e;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class K extends i1.g implements InterfaceC0173a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, Object obj) {
        super(0);
        this.f1876b = i;
        this.f1877c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [h1.a, i1.g] */
    @Override // h1.InterfaceC0173a
    public final Object c() {
        InterfaceC0182e compileStatement;
        switch (this.f1876b) {
            case 0:
                return J.f((S) this.f1877c);
            case 1:
                compileStatement = r0.database.compileStatement(((androidx.room.y) this.f1877c).createQuery());
                return compileStatement;
            case 2:
                k0.h hVar = (k0.h) this.f1877c;
                String str = hVar.f3273b;
                k0.d dVar = new k0.d();
                dVar.f3261a = null;
                k0.g gVar = new k0.g(hVar.f3272a, hVar.f3273b, dVar, hVar.f3274c);
                gVar.setWriteAheadLoggingEnabled(hVar.f3275e);
                return gVar;
            case 3:
                return (List) this.f1877c;
            default:
                try {
                    return (List) ((i1.g) this.f1877c).c();
                } catch (SSLPeerUnverifiedException unused) {
                    return W0.s.f1284a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC0173a interfaceC0173a) {
        super(0);
        this.f1876b = 4;
        this.f1877c = (i1.g) interfaceC0173a;
    }
}
