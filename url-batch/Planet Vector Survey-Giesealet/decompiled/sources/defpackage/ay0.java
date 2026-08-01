package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ay0 {
    public final qu0 a;
    public final ut b;
    public final int c;
    public final int d;
    public final Object e;

    public ay0(qu0 qu0Var, ut utVar, int i, int i2, Object obj) {
        this.a = qu0Var;
        this.b = utVar;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay0)) {
            return false;
        }
        ay0 ay0Var = (ay0) obj;
        return nz.l(this.a, ay0Var.a) && nz.l(this.b, ay0Var.b) && this.c == ay0Var.c && this.d == ay0Var.d && nz.l(this.e, ay0Var.e);
    }

    public final int hashCode() {
        qu0 qu0Var = this.a;
        int hashCode = (((((((qu0Var == null ? 0 : qu0Var.hashCode()) * 31) + this.b.d) * 31) + this.c) * 31) + this.d) * 31;
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
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
