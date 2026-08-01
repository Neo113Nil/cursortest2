package h0;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2597c;
    public final String d;

    public c(int i, int i2, String str, String str2) {
        this.f2595a = i;
        this.f2596b = i2;
        this.f2597c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        g1.f.e(cVar, "other");
        int i = this.f2595a - cVar.f2595a;
        return i == 0 ? this.f2596b - cVar.f2596b : i;
    }
}
