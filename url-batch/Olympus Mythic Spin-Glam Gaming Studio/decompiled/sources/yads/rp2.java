package yads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes10.dex */
public final class rp2 extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ sp2 c;

    public rp2(sp2 sp2Var) {
        this.c = sp2Var;
    }

    public final /* synthetic */ void a() {
        sp2 sp2Var = this.c;
        if (sp2Var.f != null) {
            sp2Var.a();
        }
    }

    public final void b() {
        sp2 sp2Var = this.c;
        if (sp2Var.f == null || (sp2Var.e & 3) == 0) {
            return;
        }
        sp2Var.a();
    }

    public final void c() {
        this.c.d.post(new Runnable() { // from class: yads.rp2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                rp2.this.a();
            }
        });
    }

    public final void d() {
        this.c.d.post(new Runnable() { // from class: yads.rp2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                rp2.this.b();
            }
        });
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        if (this.a && this.b == hasCapability) {
            if (hasCapability) {
                d();
            }
        } else {
            this.a = true;
            this.b = hasCapability;
            c();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c();
    }
}
