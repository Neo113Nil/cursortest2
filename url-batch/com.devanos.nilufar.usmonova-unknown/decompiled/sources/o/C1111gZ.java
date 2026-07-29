package o;

/* renamed from: o.gZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111gZ {
    public final String a;

    public C1111gZ(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1111gZ) {
            return AbstractC0048Bt.h(this.a, ((C1111gZ) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
