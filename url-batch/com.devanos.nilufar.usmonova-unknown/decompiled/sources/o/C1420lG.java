package o;

/* renamed from: o.lG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1420lG {
    public final String a;

    public C1420lG(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1420lG) && AbstractC0048Bt.h(this.a, ((C1420lG) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
