package o;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* renamed from: o.xY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2229xY implements Runnable {
    public final /* synthetic */ AY h;
    public final /* synthetic */ F7 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Runnable k;

    public /* synthetic */ RunnableC2229xY(AY ay, F7 f7, int i, Runnable runnable) {
        this.h = ay;
        this.i = f7;
        this.j = i;
        this.k = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final F7 f7 = this.i;
        final int i = this.j;
        Runnable runnable = this.k;
        final AY ay = this.h;
        AU au = ay.f;
        try {
            try {
                InterfaceC0480Sk interfaceC0480Sk = ay.c;
                Objects.requireNonNull(interfaceC0480Sk);
                ((C1495mP) au).q(new C1932t2(8, interfaceC0480Sk));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ay.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((C1495mP) au).q(new InterfaceC2357zU() { // from class: o.yY
                        @Override // o.InterfaceC2357zU
                        public final Object execute() {
                            AY.this.d.a(f7, i + 1, false);
                            return null;
                        }
                    });
                } else {
                    ay.a(f7, i);
                }
                runnable.run();
            } catch (C2291yU unused) {
                ay.d.a(f7, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
