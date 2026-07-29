package o;

/* renamed from: o.gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117gf {
    public final String a;
    public final String b;
    public final String c;

    public C1117gf(String str, String str2) {
        this.a = str;
        this.b = null;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1117gf.class != obj.getClass()) {
            return false;
        }
        C1117gf c1117gf = (C1117gf) obj;
        if (this.a.equals(c1117gf.a)) {
            return this.c.equals(c1117gf.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.a);
        sb.append(", function: ");
        return AbstractC1888sN.l(sb, this.c, " )");
    }

    public C1117gf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
