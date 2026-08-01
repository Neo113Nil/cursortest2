package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements t {
    public static final C i = new C();

    /* renamed from: a, reason: collision with root package name */
    public int f1865a;

    /* renamed from: b, reason: collision with root package name */
    public int f1866b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1868e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1867c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final v f1869f = new v(this);

    /* renamed from: g, reason: collision with root package name */
    public final G0.o f1870g = new G0.o(10, this);
    public final A1.d h = new A1.d(20, this);

    public final void a() {
        int i2 = this.f1866b + 1;
        this.f1866b = i2;
        if (i2 == 1) {
            if (this.f1867c) {
                this.f1869f.d(EnumC0079l.ON_RESUME);
                this.f1867c = false;
            } else {
                Handler handler = this.f1868e;
                i1.f.b(handler);
                handler.removeCallbacks(this.f1870g);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final v e() {
        return this.f1869f;
    }
}
