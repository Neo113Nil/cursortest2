package o;

/* renamed from: o.ht, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197ht extends C1065ft {
    public static final C1197ht k = new C1197ht(1, 0, 1);

    @Override // o.C1065ft
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1197ht)) {
            return false;
        }
        if (isEmpty() && ((C1197ht) obj).isEmpty()) {
            return true;
        }
        C1197ht c1197ht = (C1197ht) obj;
        return this.h == c1197ht.h && this.i == c1197ht.i;
    }

    @Override // o.C1065ft
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.h * 31) + this.i;
    }

    @Override // o.C1065ft
    public final boolean isEmpty() {
        return this.h > this.i;
    }

    @Override // o.C1065ft
    public final String toString() {
        return this.h + ".." + this.i;
    }
}
