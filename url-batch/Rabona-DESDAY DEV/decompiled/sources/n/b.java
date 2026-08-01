package n;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f3271a;

    /* renamed from: b, reason: collision with root package name */
    public c f3272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3273c;

    public b(c cVar, c cVar2, int i) {
        this.f3273c = i;
        this.f3271a = cVar2;
        this.f3272b = cVar;
    }

    @Override // n.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f3271a == cVar && cVar == this.f3272b) {
            this.f3272b = null;
            this.f3271a = null;
        }
        c cVar4 = this.f3271a;
        if (cVar4 == cVar) {
            switch (this.f3273c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f3276c;
                    break;
            }
            this.f3271a = cVar2;
        }
        c cVar5 = this.f3272b;
        if (cVar5 == cVar) {
            c cVar6 = this.f3271a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f3272b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f3273c) {
            case 0:
                return cVar.f3276c;
            default:
                return cVar.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3272b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f3272b;
        c cVar2 = this.f3271a;
        this.f3272b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
