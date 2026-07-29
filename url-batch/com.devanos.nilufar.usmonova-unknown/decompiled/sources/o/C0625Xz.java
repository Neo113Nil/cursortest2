package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.Xz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625Xz implements Iterator, InterfaceC1594nw {
    public final CharSequence h;
    public int i;
    public int j;
    public int k;
    public int l;

    public C0625Xz(CharSequence charSequence) {
        AbstractC0048Bt.n(charSequence, "string");
        this.h = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.i;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.l < 0) {
            this.i = 2;
            return false;
        }
        CharSequence charSequence = this.h;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.j; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.i = 1;
                this.l = i;
                this.k = length;
                return true;
            }
        }
        i = -1;
        this.i = 1;
        this.l = i;
        this.k = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.i = 0;
        int i = this.k;
        int i2 = this.j;
        this.j = this.l + i;
        return this.h.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
