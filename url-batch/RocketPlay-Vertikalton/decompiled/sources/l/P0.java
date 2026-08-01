package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3352a;

    /* renamed from: b, reason: collision with root package name */
    public int f3353b;

    /* renamed from: c, reason: collision with root package name */
    public int f3354c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3355e;

    /* renamed from: f, reason: collision with root package name */
    public int f3356f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3357g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f3354c = i;
        this.d = i2;
        this.h = true;
        if (this.f3357g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3352a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3353b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3352a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3353b = i2;
        }
    }
}
