package x1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f4477n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4478a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4479b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4480c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4481e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4482f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4483g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4484j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4485k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4486l;

    /* renamed from: m, reason: collision with root package name */
    public String f4487m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i1.f.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f4478a = z2;
        this.f4479b = z3;
        this.f4480c = i;
        this.d = i2;
        this.f4481e = z4;
        this.f4482f = z5;
        this.f4483g = z6;
        this.h = i3;
        this.i = i4;
        this.f4484j = z7;
        this.f4485k = z8;
        this.f4486l = z9;
        this.f4487m = str;
    }

    public final String toString() {
        String str = this.f4487m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4478a) {
            sb.append("no-cache, ");
        }
        if (this.f4479b) {
            sb.append("no-store, ");
        }
        int i = this.f4480c;
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
        if (this.f4481e) {
            sb.append("private, ");
        }
        if (this.f4482f) {
            sb.append("public, ");
        }
        if (this.f4483g) {
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
        if (this.f4484j) {
            sb.append("only-if-cached, ");
        }
        if (this.f4485k) {
            sb.append("no-transform, ");
        }
        if (this.f4486l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        i1.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f4487m = sb2;
        return sb2;
    }
}
