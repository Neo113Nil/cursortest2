package C1;

import B1.j;
import java.util.ArrayList;
import x1.l;
import x1.m;
import x1.s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final j f253a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f254b;

    /* renamed from: c, reason: collision with root package name */
    public final int f255c;
    public final B1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final H.e f256e;

    /* renamed from: f, reason: collision with root package name */
    public final int f257f;

    /* renamed from: g, reason: collision with root package name */
    public final int f258g;
    public final int h;
    public int i;

    public g(j jVar, ArrayList arrayList, int i, B1.e eVar, H.e eVar2, int i2, int i3, int i4) {
        i1.f.e(jVar, "call");
        this.f253a = jVar;
        this.f254b = arrayList;
        this.f255c = i;
        this.d = eVar;
        this.f256e = eVar2;
        this.f257f = i2;
        this.f258g = i3;
        this.h = i4;
    }

    public static g a(g gVar, int i, B1.e eVar, H.e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            i = gVar.f255c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eVar = gVar.d;
        }
        B1.e eVar3 = eVar;
        if ((i2 & 4) != 0) {
            eVar2 = gVar.f256e;
        }
        H.e eVar4 = eVar2;
        int i4 = gVar.f257f;
        int i5 = gVar.f258g;
        int i6 = gVar.h;
        gVar.getClass();
        i1.f.e(eVar4, "request");
        return new g(gVar.f253a, gVar.f254b, i3, eVar3, eVar4, i4, i5, i6);
    }

    public final s b(H.e eVar) {
        i1.f.e(eVar, "request");
        ArrayList arrayList = this.f254b;
        int size = arrayList.size();
        int i = this.f255c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        B1.e eVar2 = this.d;
        if (eVar2 != null) {
            if (!eVar2.f175b.b((l) eVar.f547c)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        g a2 = a(this, i2, null, eVar, 58);
        m mVar = (m) arrayList.get(i);
        s a3 = mVar.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + mVar + " returned null");
        }
        if (eVar2 != null && i2 < arrayList.size() && a2.i != 1) {
            throw new IllegalStateException(("network interceptor " + mVar + " must call proceed() exactly once").toString());
        }
        if (a3.f4605g != null) {
            return a3;
        }
        throw new IllegalStateException(("interceptor " + mVar + " returned a response with no body").toString());
    }
}
