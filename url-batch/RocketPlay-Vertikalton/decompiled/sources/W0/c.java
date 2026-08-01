package W0;

import E1.AbstractC0001b;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f1273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1274b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1275c;

    public c(d dVar, int i, int i2) {
        i1.f.e(dVar, "list");
        this.f1273a = dVar;
        this.f1274b = i;
        F1.l.k(i, i2, dVar.a());
        this.f1275c = i2 - i;
    }

    @Override // W0.d
    public final int a() {
        return this.f1275c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f1275c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return this.f1273a.get(this.f1274b + i);
    }
}
