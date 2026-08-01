package l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2911a;

    /* renamed from: b, reason: collision with root package name */
    public int f2912b;

    /* renamed from: c, reason: collision with root package name */
    public int f2913c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2914e;

    /* renamed from: f, reason: collision with root package name */
    public int f2915f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2916g;
    public boolean h;

    public final void a(int i, int i2) {
        this.f2913c = i;
        this.d = i2;
        this.h = true;
        if (this.f2916g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2911a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2912b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2911a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2912b = i2;
        }
    }
}
