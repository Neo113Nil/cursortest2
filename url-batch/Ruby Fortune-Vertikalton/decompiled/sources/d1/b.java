package d1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f1902a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1903b;

    public b(d dVar, int i) {
        this.f1902a = dVar;
        this.f1903b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // d1.d
    public final Iterator iterator() {
        return new X0.a(this);
    }
}
