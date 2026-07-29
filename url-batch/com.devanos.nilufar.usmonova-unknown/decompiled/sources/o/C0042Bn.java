package o;

/* renamed from: o.Bn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042Bn implements InterfaceC2244xn {
    public final /* synthetic */ io.flutter.embedding.engine.renderer.e a;
    public final /* synthetic */ D1 b;
    public final /* synthetic */ C0068Cn c;

    public C0042Bn(C0068Cn c0068Cn, io.flutter.embedding.engine.renderer.e eVar, D1 d1) {
        this.c = c0068Cn;
        this.a = eVar;
        this.b = d1;
    }

    @Override // o.InterfaceC2244xn
    public final void b() {
        C1256in c1256in;
        this.a.c(this);
        this.b.run();
        C0068Cn c0068Cn = this.c;
        if ((c0068Cn.m instanceof C1256in) || (c1256in = c0068Cn.l) == null) {
            return;
        }
        c1256in.a();
        C1256in c1256in2 = c0068Cn.l;
        if (c1256in2 != null) {
            c1256in2.h.close();
            c0068Cn.removeView(c0068Cn.l);
            c0068Cn.l = null;
        }
    }

    @Override // o.InterfaceC2244xn
    public final void a() {
    }
}
