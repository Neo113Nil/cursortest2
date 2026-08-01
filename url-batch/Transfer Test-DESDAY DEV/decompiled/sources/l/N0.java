package l;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2921a;

    /* renamed from: b, reason: collision with root package name */
    public int f2922b;

    /* renamed from: c, reason: collision with root package name */
    public int f2923c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2924e;

    /* renamed from: f, reason: collision with root package name */
    public int f2925f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2926g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2923c = i;
        this.d = i2;
        this.h = true;
        if (this.f2926g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2921a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2922b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2921a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2922b = i2;
        }
    }
}
