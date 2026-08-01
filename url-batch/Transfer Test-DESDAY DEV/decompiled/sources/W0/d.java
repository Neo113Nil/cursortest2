package W0;

import K.E;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends E implements Iterator, h1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f909e;

    public d(f fVar, int i) {
        this.f909e = i;
        g1.f.e(fVar, "map");
        this.d = fVar;
        this.f363b = -1;
        this.f364c = fVar.h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f909e) {
            case 0:
                b();
                int i = this.f362a;
                f fVar = (f) this.d;
                if (i >= fVar.f917f) {
                    throw new NoSuchElementException();
                }
                this.f362a = i + 1;
                this.f363b = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i2 = this.f362a;
                f fVar2 = (f) this.d;
                if (i2 >= fVar2.f917f) {
                    throw new NoSuchElementException();
                }
                this.f362a = i2 + 1;
                this.f363b = i2;
                Object obj = fVar2.f913a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.f362a;
                f fVar3 = (f) this.d;
                if (i3 >= fVar3.f917f) {
                    throw new NoSuchElementException();
                }
                this.f362a = i3 + 1;
                this.f363b = i3;
                Object[] objArr = fVar3.f914b;
                g1.f.b(objArr);
                Object obj2 = objArr[this.f363b];
                e();
                return obj2;
        }
    }
}
