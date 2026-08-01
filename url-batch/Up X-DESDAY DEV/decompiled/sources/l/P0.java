package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2895a;

    /* renamed from: b, reason: collision with root package name */
    public int f2896b;

    /* renamed from: c, reason: collision with root package name */
    public int f2897c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2898e;

    /* renamed from: f, reason: collision with root package name */
    public int f2899f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2900g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2897c = i;
        this.d = i2;
        this.h = true;
        if (this.f2900g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2895a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2896b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2895a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2896b = i2;
        }
    }
}
