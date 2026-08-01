package h0;

import i1.f;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f3020a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3021b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3022c;
    public final String d;

    public c(int i, int i2, String str, String str2) {
        this.f3020a = i;
        this.f3021b = i2;
        this.f3022c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        f.e(cVar, "other");
        int i = this.f3020a - cVar.f3020a;
        return i == 0 ? this.f3021b - cVar.f3021b : i;
    }
}
