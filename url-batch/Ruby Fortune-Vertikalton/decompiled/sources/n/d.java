package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3271a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3272b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3273c;

    public d(f fVar) {
        this.f3273c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3271a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3271a = cVar3;
            this.f3272b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3272b) {
            return this.f3273c.f3274a != null;
        }
        c cVar = this.f3271a;
        return (cVar == null || cVar.f3270c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3272b) {
            this.f3272b = false;
            this.f3271a = this.f3273c.f3274a;
        } else {
            c cVar = this.f3271a;
            this.f3271a = cVar != null ? cVar.f3270c : null;
        }
        return this.f3271a;
    }
}
