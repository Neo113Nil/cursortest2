package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3280a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3281b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3282c;

    public d(f fVar) {
        this.f3282c = fVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2 = this.f3280a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f3280a = cVar3;
            this.f3281b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3281b) {
            return this.f3282c.f3283a != null;
        }
        c cVar = this.f3280a;
        return (cVar == null || cVar.f3279c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3281b) {
            this.f3281b = false;
            this.f3280a = this.f3282c.f3283a;
        } else {
            c cVar = this.f3280a;
            this.f3280a = cVar != null ? cVar.f3279c : null;
        }
        return this.f3280a;
    }
}
