package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.lS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432lS implements Iterator {
    public static final C1432lS i = new C1432lS(0);
    public final /* synthetic */ int h;

    public /* synthetic */ C1432lS(int i2) {
        this.h = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.h) {
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                throw new NoSuchElementException();
            case 1:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.h) {
            case 0:
                throw new IllegalStateException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
