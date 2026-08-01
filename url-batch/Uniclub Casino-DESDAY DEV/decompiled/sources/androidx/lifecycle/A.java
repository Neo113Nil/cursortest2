package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class A implements r {
    public static final A i = new A();

    /* renamed from: a, reason: collision with root package name */
    public int f1331a;

    /* renamed from: b, reason: collision with root package name */
    public int f1332b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1334e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1333c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1335f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final D0.p f1336g = new D0.p(8, this);
    public final C.g h = new C.g(19, this);

    public final void a() {
        int i2 = this.f1332b + 1;
        this.f1332b = i2;
        if (i2 == 1) {
            if (this.f1333c) {
                this.f1335f.d(EnumC0068l.ON_RESUME);
                this.f1333c = false;
            } else {
                Handler handler = this.f1334e;
                X0.d.b(handler);
                handler.removeCallbacks(this.f1336g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t e() {
        return this.f1335f;
    }
}
