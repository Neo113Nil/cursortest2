package p1;

import c1.AbstractC0104b;
import j1.InterfaceC0183a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0183a {

    /* renamed from: a, reason: collision with root package name */
    public int f3805a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3806b;

    /* renamed from: c, reason: collision with root package name */
    public int f3807c;
    public m1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3809f;

    public b(c cVar) {
        this.f3809f = cVar;
        int h = AbstractC0104b.h(cVar.f3811b, 0, cVar.f3810a.length());
        this.f3806b = h;
        this.f3807c = h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [h1.p, i1.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f3807c;
        if (i < 0) {
            this.f3805a = 0;
            this.d = null;
            return;
        }
        c cVar = this.f3809f;
        int i2 = cVar.f3812c;
        CharSequence charSequence = cVar.f3810a;
        if (i2 > 0) {
            int i3 = this.f3808e + 1;
            this.f3808e = i3;
        }
        if (i <= charSequence.length()) {
            V0.d dVar = (V0.d) cVar.d.d(charSequence, Integer.valueOf(this.f3807c));
            if (dVar == null) {
                this.d = new m1.c(this.f3806b, d.M(charSequence), 1);
                this.f3807c = -1;
            } else {
                int intValue = ((Number) dVar.f1243a).intValue();
                int intValue2 = ((Number) dVar.f1244b).intValue();
                this.d = AbstractC0104b.B(this.f3806b, intValue);
                int i4 = intValue + intValue2;
                this.f3806b = i4;
                this.f3807c = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.f3805a = 1;
        }
        this.d = new m1.c(this.f3806b, d.M(charSequence), 1);
        this.f3807c = -1;
        this.f3805a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3805a == -1) {
            a();
        }
        return this.f3805a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3805a == -1) {
            a();
        }
        if (this.f3805a == 0) {
            throw new NoSuchElementException();
        }
        m1.c cVar = this.d;
        i1.f.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f3805a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
