package com.fyber.inneractive.sdk.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class l0 {
    public static final h0 g = new h0();
    public final PriorityBlockingQueue a = new PriorityBlockingQueue(100, new k0());
    public volatile boolean b = false;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final ThreadPoolExecutor d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), g);
    public final i0 e = new i0(this);
    public final j1 f = new j1();

    public final void a(t0 t0Var) {
        p0 p0Var;
        if (!this.a.offer(t0Var)) {
            IAlog.a("Request queue is full! current request is dropped! %s", t0Var.r());
            return;
        }
        i1 i1Var = i1.QUEUED;
        t0Var.f = i1Var;
        if (i1Var != i1.QUEUED_FOR_RETRY || (p0Var = t0Var.d) == null) {
            return;
        }
        p0Var.a("sdkRequestEndedButWillBeRetried");
    }

    public final void b(t0 t0Var) {
        j1 j1Var = this.f;
        j1Var.getClass();
        String str = t0Var.g;
        IAlog.a("%s : NetworkRequestWatchdog : finalize request: %s", IAlog.a(j1Var), str);
        n1 n1Var = (n1) j1Var.a.get(str);
        if (n1Var != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(n1Var.d);
        }
        j1Var.a.remove(str);
    }

    public final boolean c(t0 t0Var) {
        if (!t0Var.u()) {
            return false;
        }
        t0Var.f = i1.QUEUED_FOR_RETRY;
        p0 p0Var = t0Var.d;
        if (p0Var != null) {
            p0Var.a("sdkRequestEndedButWillBeRetried");
        }
        long g2 = t0Var.g();
        IAlog.e("retryNetworkRequest queue up in main thread - %s with delay of %d", t0Var.getClass().getName(), Long.valueOf(g2));
        this.c.postDelayed(new j0(this, t0Var), g2);
        return true;
    }

    public static void a(t0 t0Var, l lVar, o0 o0Var) {
        try {
            if (t0Var.a || t0Var.h() == null || o0Var == null || lVar == null || lVar.a != 200) {
                return;
            }
            t0Var.a(o0Var, t0Var.h(), lVar.e);
        } catch (Exception e) {
            IAlog.a("Failed cache network response data for url: %s msg: %s", t0Var.r(), e.getMessage());
        }
    }

    public static void a(t0 t0Var, o0 o0Var) {
        try {
            if (t0Var.a || o0Var == null) {
                return;
            }
            t0Var.a(o0Var.a, (Exception) null, false);
        } catch (Exception e) {
            IAlog.a("failed notifying the listener request complete for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (t0Var.a) {
                return;
            }
            t0Var.a((Object) null, e, false);
        }
    }

    public final o0 a(t0 t0Var, l lVar) {
        o0 o0Var = null;
        if (lVar != null) {
            try {
                if (!t0Var.a) {
                    int i = lVar.a;
                    if (i != 200 && (i < 300 || i >= 304)) {
                        if (i == 304) {
                            t0Var.a((Object) null, (Exception) new g(), false);
                        } else {
                            t0Var.a((Object) null, (Exception) new k1(lVar.b, lVar.a), false);
                        }
                    }
                    o0Var = t0Var.a(lVar, lVar.d, i);
                }
            } catch (t1 e) {
                IAlog.a("failed parsing network request but will retry url: %s msg: %s", t0Var.r(), e.getMessage());
                if (c(t0Var)) {
                    throw e;
                }
                throw new s1(e);
            } catch (Exception e2) {
                IAlog.a("failed parsing network request url: %s msg: %s", t0Var.r(), e2.getMessage());
                throw e2;
            }
        }
        return o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l a(t0 t0Var, a aVar) {
        String str;
        try {
            if (t0Var.a) {
                return null;
            }
            if (aVar != null) {
                str = aVar.a;
            } else {
                str = "";
            }
            a();
            return t0Var.a(str);
        } catch (b e) {
            e = e;
            IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
                throw new t1(e);
            }
            throw new s1(e);
        } catch (t1 e2) {
            IAlog.a("failed sending network request but will retry url: %s msg: %s", t0Var.r(), e2.getMessage());
            if (c(t0Var)) {
                throw e2;
            }
            throw new s1(e2);
        } catch (SocketTimeoutException e3) {
            e = e3;
            IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
            }
        } catch (UnknownHostException e4) {
            e = e4;
            IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
            }
        } catch (Exception e5) {
            IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e5.getMessage());
            throw e5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r2.isConnectedOrConnecting() != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a() {
        Boolean c = ((com.fyber.inneractive.sdk.config.global.features.l) IAConfigManager.N.L.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c("should_use_is_network_connected");
        boolean z = false;
        if (c != null ? c.booleanValue() : false) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) com.fyber.inneractive.sdk.util.o.a.getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null) {
                }
            } catch (Throwable unused) {
                IAlog.b("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            }
            if (z) {
                throw new b("No network connection");
            }
            return;
        }
        return;
        z = true;
        if (z) {
        }
    }
}
