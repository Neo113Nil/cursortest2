package Q0;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f657a;

    /* renamed from: b, reason: collision with root package name */
    public final int f658b;

    /* renamed from: c, reason: collision with root package name */
    public final int f659c;

    public c(d dVar, int i, int i2) {
        X0.d.e(dVar, "list");
        this.f657a = dVar;
        this.f658b = i;
        q1.l.p(i, i2, dVar.a());
        this.f659c = i2 - i;
    }

    @Override // Q0.d
    public final int a() {
        return this.f659c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f659c;
        if (i >= 0 && i < i2) {
            return this.f657a.get(this.f658b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
