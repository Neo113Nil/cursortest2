package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class C implements t {
    public static final C i = new C();

    /* renamed from: a, reason: collision with root package name */
    public int f1486a;

    /* renamed from: b, reason: collision with root package name */
    public int f1487b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1489e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1488c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final v f1490f = new v(this);

    /* renamed from: g, reason: collision with root package name */
    public final B0.b f1491g = new B0.b(9, this);
    public final A0.h h = new A0.h(17, this);

    public final void a() {
        int i2 = this.f1487b + 1;
        this.f1487b = i2;
        if (i2 == 1) {
            if (this.f1488c) {
                this.f1490f.d(EnumC0071l.ON_RESUME);
                this.f1488c = false;
            } else {
                Handler handler = this.f1489e;
                g1.f.b(handler);
                handler.removeCallbacks(this.f1491g);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final v d() {
        return this.f1490f;
    }
}
