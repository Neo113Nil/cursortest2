package X0;

import K.E;
import j1.InterfaceC0183a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends E implements Iterator, InterfaceC0183a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1300e;

    public d(f fVar, int i) {
        this.f1300e = i;
        i1.f.e(fVar, "map");
        this.d = fVar;
        this.f624b = -1;
        this.f625c = fVar.h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1300e) {
            case 0:
                b();
                int i = this.f623a;
                f fVar = (f) this.d;
                if (i >= fVar.f1308f) {
                    throw new NoSuchElementException();
                }
                this.f623a = i + 1;
                this.f624b = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i2 = this.f623a;
                f fVar2 = (f) this.d;
                if (i2 >= fVar2.f1308f) {
                    throw new NoSuchElementException();
                }
                this.f623a = i2 + 1;
                this.f624b = i2;
                Object obj = fVar2.f1304a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.f623a;
                f fVar3 = (f) this.d;
                if (i3 >= fVar3.f1308f) {
                    throw new NoSuchElementException();
                }
                this.f623a = i3 + 1;
                this.f624b = i3;
                Object[] objArr = fVar3.f1305b;
                i1.f.b(objArr);
                Object obj2 = objArr[this.f624b];
                e();
                return obj2;
        }
    }
}
