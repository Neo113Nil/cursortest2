package com.my.target;

import com.my.target.gb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class r0 extends gb {
    private static volatile r0 b;

    private r0() {
    }

    public static r0 a() {
        r0 r0Var;
        r0 r0Var2 = b;
        if (r0Var2 != null) {
            return r0Var2;
        }
        synchronized (r0.class) {
            try {
                r0Var = b;
                if (r0Var == null) {
                    r0Var = new r0();
                    b = r0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, gb.a aVar) {
        if (a(str, aVar)) {
            mi.a("AudioLoader: can't load. Audio already loading");
        } else {
            a(str, (String) h5.a().a(str, null).c());
        }
    }

    public void c(final String str, final gb.a aVar) {
        o0.c(new Runnable() { // from class: com.my.target.r0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                r0.this.b(str, aVar);
            }
        });
    }
}
