package o;

import java.util.Iterator;

/* renamed from: o.gY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110gY implements Iterator {
    public final /* synthetic */ int h;
    public Iterator i;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
        }
        return this.i.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
        }
        return (String) this.i.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
