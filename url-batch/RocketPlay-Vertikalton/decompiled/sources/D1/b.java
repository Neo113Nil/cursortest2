package D1;

import B1.m;
import B1.q;
import K1.j;
import K1.p;
import K1.v;
import K1.x;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f268a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f270c;

    public b(q qVar) {
        this.f270c = qVar;
        this.f268a = new j(((p) qVar.d).f764a.b());
    }

    public final void a() {
        q qVar = this.f270c;
        int i = qVar.f224a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + qVar.f224a);
        }
        j jVar = this.f268a;
        x xVar = jVar.f750e;
        jVar.f750e = x.d;
        xVar.a();
        xVar.b();
        qVar.f224a = 6;
    }

    @Override // K1.v
    public final x b() {
        return this.f268a;
    }

    @Override // K1.v
    public long z(K1.f fVar, long j2) {
        q qVar = this.f270c;
        i1.f.e(fVar, "sink");
        try {
            return ((p) qVar.d).z(fVar, j2);
        } catch (IOException e2) {
            ((m) qVar.f226c).k();
            a();
            throw e2;
        }
    }
}
