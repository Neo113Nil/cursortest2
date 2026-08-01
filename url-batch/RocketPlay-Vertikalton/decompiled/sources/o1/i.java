package o1;

import j1.InterfaceC0183a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1.c f3712a;

    public i(p1.c cVar) {
        this.f3712a = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p1.b(this.f3712a);
    }
}
