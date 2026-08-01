package i1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f2389n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2390a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2391b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2392c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2393e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2394f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2395g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2396j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2397k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2398l;

    /* renamed from: m, reason: collision with root package name */
    public String f2399m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        X0.e.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f2390a = z2;
        this.f2391b = z3;
        this.f2392c = i;
        this.d = i2;
        this.f2393e = z4;
        this.f2394f = z5;
        this.f2395g = z6;
        this.h = i3;
        this.i = i4;
        this.f2396j = z7;
        this.f2397k = z8;
        this.f2398l = z9;
        this.f2399m = str;
    }

    public final String toString() {
        String str = this.f2399m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2390a) {
            sb.append("no-cache, ");
        }
        if (this.f2391b) {
            sb.append("no-store, ");
        }
        int i = this.f2392c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f2393e) {
            sb.append("private, ");
        }
        if (this.f2394f) {
            sb.append("public, ");
        }
        if (this.f2395g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f2396j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2397k) {
            sb.append("no-transform, ");
        }
        if (this.f2398l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        X0.e.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f2399m = sb2;
        return sb2;
    }
}
