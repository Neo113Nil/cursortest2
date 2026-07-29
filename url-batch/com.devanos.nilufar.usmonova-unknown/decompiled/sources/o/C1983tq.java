package o;

/* renamed from: o.tq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1983tq implements Comparable {
    public final int h;
    public final I10 i;
    public final boolean j;

    public C1983tq(int i, I10 i10, boolean z) {
        this.h = i;
        this.i = i10;
        this.j = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.h - ((C1983tq) obj).h;
    }
}
