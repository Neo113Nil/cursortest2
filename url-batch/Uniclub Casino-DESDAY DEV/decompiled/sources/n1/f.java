package n1;

import i1.n;
import i1.o;
import i1.u;
import java.util.ArrayList;
import m1.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final j f3293a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3294b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3295c;
    public final m1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f3296e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3297f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3298g;
    public final int h;
    public int i;

    public f(j jVar, ArrayList arrayList, int i, m1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        X0.d.e(jVar, "call");
        this.f3293a = jVar;
        this.f3294b = arrayList;
        this.f3295c = i;
        this.d = eVar;
        this.f3296e = eVar2;
        this.f3297f = i2;
        this.f3298g = i3;
        this.h = i4;
    }

    public static f a(f fVar, int i, m1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = fVar.f3295c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = fVar.d;
        }
        m1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = fVar.f3296e;
        }
        H.e eVar4 = eVar2;
        int i4 = fVar.f3297f;
        int i5 = fVar.f3298g;
        int i6 = fVar.h;
        fVar.getClass();
        X0.d.e(eVar4, "request");
        return new f(fVar.f3293a, fVar.f3294b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final u b(H.e eVar) {
        X0.d.e(eVar, "request");
        ArrayList arrayList = this.f3294b;
        int size = arrayList.size();
        int i = this.f3295c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        m1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f3220b.b((n) eVar.f206c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        f a2 = a(this, i2, null, eVar, 58);
        o oVar = (o) arrayList.get(i);
        u a3 = oVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (eVar2 != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + oVar + " must call proceed() exactly once").toString());
        }
        if (a3.f2533g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + oVar + " returned a response with no body").toString());
    }
}
