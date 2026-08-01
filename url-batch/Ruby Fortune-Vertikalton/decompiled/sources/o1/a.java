package o1;

import java.io.IOException;
import m1.m;
import m1.p;
import v1.j;
import v1.o;
import v1.u;
import v1.w;

/* loaded from: classes.dex */
public abstract class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final j f3360a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3362c;

    public a(p pVar) {
        this.f3362c = pVar;
        this.f3360a = new j(((o) pVar.d).f4086a.a());
    }

    @Override // v1.u
    public final w a() {
        return this.f3360a;
    }

    @Override // v1.u
    public long b(v1.f fVar, long j2) {
        p pVar = this.f3362c;
        X0.e.e(fVar, "sink");
        try {
            return ((o) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3260c).k();
            e();
            throw e2;
        }
    }

    public final void e() {
        p pVar = this.f3362c;
        int i = pVar.f3258a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3258a);
        }
        j jVar = this.f3360a;
        w wVar = jVar.f4074e;
        jVar.f4074e = w.d;
        wVar.a();
        wVar.b();
        pVar.f3258a = 6;
    }
}
