package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3255a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3256b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3257c;

    public d(f fVar) {
        this.f3257c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3255a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3255a = cVar3;
            this.f3256b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3256b) {
            return this.f3257c.f3258a != null;
        }
        c cVar = this.f3255a;
        return (cVar == null || cVar.f3254c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3256b) {
            this.f3256b = false;
            this.f3255a = this.f3257c.f3258a;
        } else {
            c cVar = this.f3255a;
            this.f3255a = cVar != null ? cVar.f3254c : null;
        }
        return this.f3255a;
    }
}
