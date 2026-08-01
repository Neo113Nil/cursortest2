package s0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f3674a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3675b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3676c;

    public p(int i, int i2, String str) {
        this.f3674a = i;
        this.f3675b = i2;
        this.f3676c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f3674a == pVar.f3674a && this.f3675b == pVar.f3675b && g1.f.a(this.f3676c, pVar.f3676c);
    }

    public final int hashCode() {
        return this.f3676c.hashCode() + ((Integer.hashCode(this.f3675b) + (Integer.hashCode(this.f3674a) * 31)) * 31);
    }

    public final String toString() {
        return "LeaderboardItem(rank=" + this.f3674a + ", score=" + this.f3675b + ", date=" + this.f3676c + ")";
    }
}
