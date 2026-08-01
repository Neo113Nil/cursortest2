package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3570a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3571b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3572c;

    public d(f fVar) {
        this.f3572c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3570a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3570a = cVar3;
            this.f3571b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3571b) {
            return this.f3572c.f3573a != null;
        }
        c cVar = this.f3570a;
        return (cVar == null || cVar.f3569c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3571b) {
            this.f3571b = false;
            this.f3570a = this.f3572c.f3573a;
        } else {
            c cVar = this.f3570a;
            this.f3570a = cVar != null ? cVar.f3569c : null;
        }
        return this.f3570a;
    }
}
