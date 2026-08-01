package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2920a;

    /* renamed from: b, reason: collision with root package name */
    public int f2921b;

    /* renamed from: c, reason: collision with root package name */
    public int f2922c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2923e;

    /* renamed from: f, reason: collision with root package name */
    public int f2924f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2925g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2922c = i;
        this.d = i2;
        this.h = true;
        if (this.f2925g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2920a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2921b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2920a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2921b = i2;
        }
    }
}
