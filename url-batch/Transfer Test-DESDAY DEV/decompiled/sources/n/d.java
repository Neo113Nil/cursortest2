package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3144a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3145b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3146c;

    public d(f fVar) {
        this.f3146c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3144a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3144a = cVar3;
            this.f3145b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3145b) {
            return this.f3146c.f3147a != null;
        }
        c cVar = this.f3144a;
        return (cVar == null || cVar.f3143c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3145b) {
            this.f3145b = false;
            this.f3144a = this.f3146c.f3147a;
        } else {
            c cVar = this.f3144a;
            this.f3144a = cVar != null ? cVar.f3143c : null;
        }
        return this.f3144a;
    }
}
