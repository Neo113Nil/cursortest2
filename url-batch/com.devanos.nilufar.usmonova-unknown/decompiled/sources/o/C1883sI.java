package o;

/* renamed from: o.sI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883sI {
    public final C1488mI a;

    public C1883sI(C1488mI c1488mI) {
        this.a = c1488mI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883sI)) {
            return false;
        }
        C1883sI c1883sI = (C1883sI) obj;
        if (!AbstractC0048Bt.h(this.a, c1883sI.a)) {
            return false;
        }
        c1883sI.getClass();
        return true;
    }

    public final int hashCode() {
        C1488mI c1488mI = this.a;
        if (c1488mI != null) {
            return c1488mI.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.a + ')';
    }
}
