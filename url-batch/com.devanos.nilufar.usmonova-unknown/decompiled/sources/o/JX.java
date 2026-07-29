package o;

/* loaded from: classes.dex */
public final class JX {
    public final FU a;
    public final C1586no b;
    public final int c;
    public final int d;
    public final Object e;

    public JX(FU fu, C1586no c1586no, int i, int i2, Object obj) {
        this.a = fu;
        this.b = c1586no;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JX)) {
            return false;
        }
        JX jx = (JX) obj;
        return AbstractC0048Bt.h(this.a, jx.a) && AbstractC0048Bt.h(this.b, jx.b) && this.c == jx.c && this.d == jx.d && AbstractC0048Bt.h(this.e, jx.e);
    }

    public final int hashCode() {
        FU fu = this.a;
        int hashCode = (Integer.hashCode(this.d) + ((Integer.hashCode(this.c) + ((((fu == null ? 0 : fu.hashCode()) * 31) + this.b.h) * 31)) * 31)) * 31;
        Object obj = this.e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "All";
        } else if (i2 == 2) {
            str = "Weight";
        } else if (i2 == 3) {
            str = "Style";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
