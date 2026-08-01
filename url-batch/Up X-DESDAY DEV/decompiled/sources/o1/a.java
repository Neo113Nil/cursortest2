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
    public final j f3344a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3346c;

    public a(p pVar) {
        this.f3346c = pVar;
        this.f3344a = new j(((o) pVar.d).f4070a.a());
    }

    @Override // v1.u
    public final w a() {
        return this.f3344a;
    }

    @Override // v1.u
    public long b(v1.f fVar, long j2) {
        p pVar = this.f3346c;
        X0.e.e(fVar, "sink");
        try {
            return ((o) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3244c).k();
            e();
            throw e2;
        }
    }

    public final void e() {
        p pVar = this.f3346c;
        int i = pVar.f3242a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3242a);
        }
        j jVar = this.f3344a;
        w wVar = jVar.f4058e;
        jVar.f4058e = w.d;
        wVar.a();
        wVar.b();
        pVar.f3242a = 6;
    }
}
