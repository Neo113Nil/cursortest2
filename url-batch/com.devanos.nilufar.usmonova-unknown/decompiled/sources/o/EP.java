package o;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class EP implements InterfaceC0288Kz, Closeable {
    public final String h;
    public final DP i;
    public boolean j;

    public EP(String str, DP dp) {
        this.h = str;
        this.i = dp;
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        if (enumC0054Bz == EnumC0054Bz.ON_DESTROY) {
            this.j = false;
            interfaceC0365Nz.getLifecycle().b(this);
        }
    }

    public final void m(AbstractC0106Dz abstractC0106Dz, KP kp) {
        AbstractC0048Bt.n(kp, "registry");
        AbstractC0048Bt.n(abstractC0106Dz, "lifecycle");
        if (this.j) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.j = true;
        abstractC0106Dz.a(this);
        kp.c(this.h, this.i.e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
