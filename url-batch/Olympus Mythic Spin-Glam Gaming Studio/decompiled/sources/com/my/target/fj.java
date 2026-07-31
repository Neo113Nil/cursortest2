package com.my.target;

import com.my.target.gb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class fj extends gb {
    private static volatile fj b;

    private fj() {
    }

    public static fj a() {
        fj fjVar;
        fj fjVar2 = b;
        if (fjVar2 != null) {
            return fjVar2;
        }
        synchronized (fj.class) {
            try {
                fjVar = b;
                if (fjVar == null) {
                    fjVar = new fj();
                    b = fjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, gb.a aVar) {
        if (a(str, aVar)) {
            mi.a("VideoLoader: can't load. Video already loading");
        } else {
            a(str, (String) n5.a().a(str, null).c());
        }
    }

    public void c(final String str, final gb.a aVar) {
        o0.c(new Runnable() { // from class: com.my.target.fj$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                fj.this.b(str, aVar);
            }
        });
    }
}
