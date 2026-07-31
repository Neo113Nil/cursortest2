package com.mbridge.msdk.foundation.same.net.wrapper;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.j;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;

/* compiled from: MBridgeRequestListenerWrapper.java */
/* loaded from: classes14.dex */
public class i<T> implements j<T> {
    private final com.mbridge.msdk.foundation.same.net.b<T> a;
    private final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: MBridgeRequestListenerWrapper.java */
    class a implements Runnable {
        final /* synthetic */ v a;
        final /* synthetic */ q b;

        a(v vVar, q qVar) {
            this.a = vVar;
            this.b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.a != null) {
                    i.this.a.onSuccess(i.this.a(this.a, this.b));
                }
            } catch (Exception e) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e);
            }
        }
    }

    /* compiled from: MBridgeRequestListenerWrapper.java */
    class b implements Runnable {
        final /* synthetic */ v a;
        final /* synthetic */ q b;

        b(v vVar, q qVar) {
            this.a = vVar;
            this.b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.a != null) {
                    i.this.a.onError(i.this.a(this.a.c, this.b));
                }
            } catch (Exception e) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseError error", e);
            }
        }
    }

    public i(com.mbridge.msdk.foundation.same.net.b<T> bVar) {
        this.a = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void b(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseError: " + vVar.c.d() + " " + vVar.c.getMessage());
        this.b.post(new b(vVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.e a(v<T> vVar, q qVar) {
        if (vVar == null) {
            return null;
        }
        return com.mbridge.msdk.foundation.same.net.e.a(vVar.a, new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.a, qVar.b, qVar.d));
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void a(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + vVar.a);
        this.b.post(new a(vVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.exception.a a(b0 b0Var, q qVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        if (b0Var == null) {
            return null;
        }
        if (qVar != null) {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.a, qVar.b, qVar.d);
        } else {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(0, null, null);
        }
        if (b0Var.d() == 0) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 1) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(6, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 2) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 4) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(880041, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 5) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 6) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(15, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 7) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(7, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 8) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(10, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 9) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(4, aVar, b0Var.getMessage());
        }
        return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
    }
}
