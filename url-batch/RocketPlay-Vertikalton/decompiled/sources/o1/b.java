package o1;

import K.X;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3705b;

    public b(d dVar, int i) {
        this.f3704a = dVar;
        this.f3705b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o1.d
    public final Iterator iterator() {
        return new X(this);
    }
}
