package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3277a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3278b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3279c;

    public d(f fVar) {
        this.f3279c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3277a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3277a = cVar3;
            this.f3278b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3278b) {
            return this.f3279c.f3280a != null;
        }
        c cVar = this.f3277a;
        return (cVar == null || cVar.f3276c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3278b) {
            this.f3278b = false;
            this.f3277a = this.f3279c.f3280a;
        } else {
            c cVar = this.f3277a;
            this.f3277a = cVar != null ? cVar.f3276c : null;
        }
        return this.f3277a;
    }
}
