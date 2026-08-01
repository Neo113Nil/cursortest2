package s0;

import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3644a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3645b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3646c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3647e;

    public b(String str, String str2, String str3, String str4, List list) {
        this.f3644a = str;
        this.f3645b = str2;
        this.f3646c = str3;
        this.d = str4;
        this.f3647e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g1.f.a(this.f3644a, bVar.f3644a) && g1.f.a(this.f3645b, bVar.f3645b) && g1.f.a(this.f3646c, bVar.f3646c) && g1.f.a(this.d, bVar.d) && g1.f.a(this.f3647e, bVar.f3647e);
    }

    public final int hashCode() {
        return this.f3647e.hashCode() + ((this.d.hashCode() + ((this.f3646c.hashCode() + ((this.f3645b.hashCode() + (this.f3644a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferQuestion(amount=" + this.f3644a + ", fromClub=" + this.f3645b + ", toClub=" + this.f3646c + ", correctAnswer=" + this.d + ", options=" + this.f3647e + ")";
    }
}
