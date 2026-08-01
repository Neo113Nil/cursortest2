package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ve implements Iterator, vo {
    public int f = -1;
    public int g;
    public int h;
    public mo i;
    public final /* synthetic */ we j;

    public ve(we weVar) {
        this.j = weVar;
        int length = ((String) weVar.b).length();
        if (length < 0) {
            l8.d(length, " is less than minimum 0.", "Cannot coerce value to an empty range: maximum ");
            throw null;
        }
        length = length >= 0 ? 0 : length;
        this.g = length;
        this.h = length;
    }

    public final void a() {
        we weVar = this.j;
        String str = (String) weVar.b;
        int i = this.h;
        if (i < 0) {
            this.f = 0;
            this.i = null;
            return;
        }
        if (i > str.length()) {
            this.i = new mo(this.g, str.length() - 1, 1);
            this.h = -1;
        } else {
            int r0 = m30.r0(str, (char[]) ((h) weVar.c).g, Integer.valueOf(this.h).intValue(), false);
            bw bwVar = r0 >= 0 ? new bw(Integer.valueOf(r0), 1) : null;
            if (bwVar == null) {
                this.i = new mo(this.g, str.length() - 1, 1);
                this.h = -1;
            } else {
                int intValue = ((Number) bwVar.f).intValue();
                int intValue2 = ((Number) bwVar.g).intValue();
                this.i = m60.b0(this.g, intValue);
                int i2 = intValue + intValue2;
                this.g = i2;
                this.h = i2 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f == -1) {
            a();
        }
        return this.f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f == -1) {
            a();
        }
        if (this.f == 0) {
            throw new NoSuchElementException();
        }
        mo moVar = this.i;
        moVar.getClass();
        this.i = null;
        this.f = -1;
        return moVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
