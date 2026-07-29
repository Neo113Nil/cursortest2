package o;

import android.os.Handler;

/* renamed from: o.sJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884sJ implements InterfaceC0365Nz {
    public static final C1884sJ p = new C1884sJ();
    public int h;
    public int i;
    public Handler l;
    public boolean j = true;
    public boolean k = true;
    public final C0417Pz m = new C0417Pz(this);
    public final D1 n = new D1(12, this);

    /* renamed from: o, reason: collision with root package name */
    public final C1818rJ f218o = new C1818rJ(0, this);

    public final void a() {
        int i = this.i + 1;
        this.i = i;
        if (i == 1) {
            if (this.j) {
                this.m.e(EnumC0054Bz.ON_RESUME);
                this.j = false;
            } else {
                Handler handler = this.l;
                AbstractC0048Bt.k(handler);
                handler.removeCallbacks(this.n);
            }
        }
    }

    @Override // o.InterfaceC0365Nz
    public final AbstractC0106Dz getLifecycle() {
        return this.m;
    }
}
