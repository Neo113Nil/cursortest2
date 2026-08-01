package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2917a;

    /* renamed from: b, reason: collision with root package name */
    public int f2918b;

    /* renamed from: c, reason: collision with root package name */
    public int f2919c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2920e;

    /* renamed from: f, reason: collision with root package name */
    public int f2921f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2922g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2919c = i;
        this.d = i2;
        this.h = true;
        if (this.f2922g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2917a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2918b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2917a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2918b = i2;
        }
    }
}
