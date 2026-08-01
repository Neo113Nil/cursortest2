package n1;

import i1.m;
import i1.n;
import i1.t;
import java.util.ArrayList;
import m1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3289a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3290b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3291c;
    public final m1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f3292e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3293f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3294g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, m1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        X0.e.e(jVar, "call");
        this.f3289a = jVar;
        this.f3290b = arrayList;
        this.f3291c = i;
        this.d = eVar;
        this.f3292e = eVar2;
        this.f3293f = i2;
        this.f3294g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, m1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3291c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        m1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = fVar.f3292e;
        }
        H.e eVar4 = eVar2;
        int i4 = fVar.f3293f;
        int i5 = fVar.f3294g;
        int i6 = fVar.h;
        fVar.getClass();
        X0.e.e(eVar4, "request");
        return new f(fVar.f3289a, fVar.f3290b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final t b(H.e eVar) {
        X0.e.e(eVar, "request");
        ArrayList arrayList = this.f3290b;
        int size = arrayList.size();
        int i = this.f3291c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        m1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f3195b.b((m) eVar.f213c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        f a2 = a(this, i2, null, eVar, 58);
        n nVar = (n) arrayList.get(i);
        t a3 = nVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + nVar + " returned null");
        }
        if (eVar2 != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + nVar + " must call proceed() exactly once").toString());
        }
        if (a3.f2508g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + nVar + " returned a response with no body").toString());
    }
}
