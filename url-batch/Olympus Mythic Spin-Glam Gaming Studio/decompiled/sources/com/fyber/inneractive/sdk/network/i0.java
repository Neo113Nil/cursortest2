package com.fyber.inneractive.sdk.network;

import android.os.Process;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes6.dex */
public final class i0 implements Runnable {
    public final /* synthetic */ l0 a;

    public i0(l0 l0Var) {
        this.a = l0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:11|12|(1:16)|17|(3:19|(1:21)(1:126)|(20:23|(1:125)(1:27)|28|(1:30)|31|32|(13:36|(1:42)|43|44|45|46|47|48|49|50|(1:52)|55|56)|119|(3:38|40|42)|43|44|45|46|47|48|49|50|(0)|55|56))|127|(1:25)|125|28|(0)|31|32|(14:34|36|(0)|43|44|45|46|47|48|49|50|(0)|55|56)|119|(0)|43|44|45|46|47|48|49|50|(0)|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x015a, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015d, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0160, code lost:
    
        r3 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0166, code lost:
    
        if (r3 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x016c, code lost:
    
        r3.a("sdkRequestEndedButWillBeRetried");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x016f, code lost:
    
        r0.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0172, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x011b, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x011c, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0118, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0119, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00ca, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00cb, code lost:
    
        com.fyber.inneractive.sdk.util.IAlog.a("failed fetching cache data for url: %s msg: %s", r2.r(), r3.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00de, code lost:
    
        if (r2.a == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00e0, code lost:
    
        r2.a((java.lang.Object) null, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010e, code lost:
    
        if (r1 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0185, code lost:
    
        r1.a("sdkRequestEndedButWillBeRetried");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0173, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0179, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0181, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0183, code lost:
    
        if (r1 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0114, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
    
        if (r2.a == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0144, code lost:
    
        r2.a((java.lang.Object) null, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014a, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0155, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
    
        if (r1 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0112, code lost:
    
        r3 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0120, code lost:
    
        if (r2.a == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0122, code lost:
    
        r2.a((java.lang.Object) null, new java.lang.Exception(r3), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012d, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0130, code lost:
    
        r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0133, code lost:
    
        r1 = com.fyber.inneractive.sdk.network.i1.DONE;
        r2.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0139, code lost:
    
        if (r1 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x013b, code lost:
    
        r1 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013d, code lost:
    
        if (r1 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x012b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t0 t0Var;
        boolean z;
        boolean z2;
        a aVar;
        i1 i1Var;
        p0 p0Var;
        l0 l0Var = this.a;
        l0Var.getClass();
        Process.setThreadPriority(10);
        while (l0Var.b) {
            o0 o0Var = null;
            try {
                t0Var = (t0) l0Var.a.take();
            } catch (InterruptedException unused) {
                if (!l0Var.b) {
                    Thread.currentThread().interrupt();
                }
                t0Var = null;
            }
            if (t0Var != null && !t0Var.a) {
                i1 i1Var2 = i1.RUNNING;
                t0Var.f = i1Var2;
                if (i1Var2 == i1.QUEUED_FOR_RETRY && (p0Var = t0Var.d) != null) {
                    p0Var.a("sdkRequestEndedButWillBeRetried");
                }
                if (t0Var.o) {
                    Boolean c = ((com.fyber.inneractive.sdk.config.global.features.l) IAConfigManager.N.L.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c("should_manage_request_watchdog");
                    if (c != null ? c.booleanValue() : true) {
                        z = true;
                        z2 = !z || t0Var.v();
                        IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z2));
                        if (z2) {
                            j1 j1Var = l0Var.f;
                            Thread currentThread = Thread.currentThread();
                            j1Var.getClass();
                            IAlog.a("%s : NetworkRequestWatchdog : register request: %s", IAlog.a(j1Var), t0Var.g);
                            int s = t0Var.s();
                            l1 p = t0Var.p();
                            n1 n1Var = new n1(t0Var, currentThread, p.a + p.b + s);
                            j1Var.a.putIfAbsent(t0Var.g, n1Var);
                            com.fyber.inneractive.sdk.util.r.b.postDelayed(n1Var.d, n1Var.c);
                        }
                        if (!t0Var.a && t0Var.h() != null) {
                            aVar = t0Var.i();
                            if (aVar != null && aVar.b != null && !t0Var.a) {
                                t0Var.a(aVar.b, (Exception) null, true);
                            }
                            l a = l0Var.a(t0Var, aVar);
                            o0 o0Var2 = l0Var.a(t0Var, a);
                            l0.a(t0Var, a, o0Var2);
                            l0.a(t0Var, o0Var2);
                            t0Var.e();
                            i1Var = i1.DONE;
                            t0Var.f = i1Var;
                            if (i1Var == i1.QUEUED_FOR_RETRY) {
                                p0 p0Var2 = t0Var.d;
                            }
                            l0Var.b(t0Var);
                        }
                        aVar = null;
                        if (aVar != null) {
                            t0Var.a(aVar.b, (Exception) null, true);
                        }
                        l a2 = l0Var.a(t0Var, aVar);
                        o0 o0Var22 = l0Var.a(t0Var, a2);
                        l0.a(t0Var, a2, o0Var22);
                        l0.a(t0Var, o0Var22);
                        t0Var.e();
                        i1Var = i1.DONE;
                        t0Var.f = i1Var;
                        if (i1Var == i1.QUEUED_FOR_RETRY) {
                        }
                        l0Var.b(t0Var);
                    }
                }
                z = false;
                if (z) {
                }
                IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z2));
                if (z2) {
                }
                if (!t0Var.a) {
                    aVar = t0Var.i();
                    if (aVar != null) {
                    }
                    l a22 = l0Var.a(t0Var, aVar);
                    o0 o0Var222 = l0Var.a(t0Var, a22);
                    l0.a(t0Var, a22, o0Var222);
                    l0.a(t0Var, o0Var222);
                    t0Var.e();
                    i1Var = i1.DONE;
                    t0Var.f = i1Var;
                    if (i1Var == i1.QUEUED_FOR_RETRY) {
                    }
                    l0Var.b(t0Var);
                }
                aVar = null;
                if (aVar != null) {
                }
                l a222 = l0Var.a(t0Var, aVar);
                o0 o0Var2222 = l0Var.a(t0Var, a222);
                l0.a(t0Var, a222, o0Var2222);
                l0.a(t0Var, o0Var2222);
                t0Var.e();
                i1Var = i1.DONE;
                t0Var.f = i1Var;
                if (i1Var == i1.QUEUED_FOR_RETRY) {
                }
                l0Var.b(t0Var);
            }
        }
    }
}
