package o;

/* renamed from: o.sU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1895sU implements InterfaceC2244xn {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ SurfaceHolderCallback2C2027uU b;

    public C1895sU(SurfaceHolderCallback2C2027uU surfaceHolderCallback2C2027uU, Runnable runnable) {
        this.b = surfaceHolderCallback2C2027uU;
        this.a = runnable;
    }

    @Override // o.InterfaceC2244xn
    public final void b() {
        this.a.run();
        io.flutter.embedding.engine.renderer.e eVar = this.b.b;
        if (eVar != null) {
            eVar.c(this);
        }
    }

    @Override // o.InterfaceC2244xn
    public final void a() {
    }
}
