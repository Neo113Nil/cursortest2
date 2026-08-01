package androidx.lifecycle;

/* loaded from: classes.dex */
public final class K extends g1.g implements f1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, Object obj) {
        super(0);
        this.f1497b = i;
        this.f1498c = obj;
    }

    @Override // f1.a
    public final Object c() {
        j0.e compileStatement;
        switch (this.f1497b) {
            case 0:
                return J.f((S) this.f1498c);
            case 1:
                compileStatement = r0.database.compileStatement(((androidx.room.y) this.f1498c).createQuery());
                return compileStatement;
            default:
                k0.h hVar = (k0.h) this.f1498c;
                String str = hVar.f2842b;
                k0.d dVar = new k0.d();
                dVar.f2830a = null;
                k0.g gVar = new k0.g(hVar.f2841a, hVar.f2842b, dVar, hVar.f2843c);
                gVar.setWriteAheadLoggingEnabled(hVar.f2844e);
                return gVar;
        }
    }
}
