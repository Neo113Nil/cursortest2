package yads;

/* loaded from: classes10.dex */
public final class eg0 {
    public final String a;
    public final String b;
    public final String c;

    public eg0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eg0.class != obj.getClass()) {
            return false;
        }
        eg0 eg0Var = (eg0) obj;
        return sb3.a(this.a, eg0Var.a) && sb3.a(this.b, eg0Var.b) && sb3.a(this.c, eg0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
