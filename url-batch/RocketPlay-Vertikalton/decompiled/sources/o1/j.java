package o1;

import K.C0030x;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final p1.c f3713a;

    /* renamed from: b, reason: collision with root package name */
    public final W0.a f3714b;

    public j(p1.c cVar, W0.a aVar) {
        this.f3713a = cVar;
        this.f3714b = aVar;
    }

    @Override // o1.d
    public final Iterator iterator() {
        return new C0030x(this);
    }
}
