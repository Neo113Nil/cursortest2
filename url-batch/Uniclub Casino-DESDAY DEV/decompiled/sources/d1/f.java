package d1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterable, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1.c f1915a;

    public f(e1.c cVar) {
        this.f1915a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e1.b(this.f1915a);
    }
}
