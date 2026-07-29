package o;

/* loaded from: classes.dex */
public final class YB {
    public final String a;

    public YB(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YB) && AbstractC0048Bt.h(this.a, ((YB) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
