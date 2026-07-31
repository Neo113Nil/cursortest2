package com.my.target;

import android.graphics.Bitmap;
import com.my.target.gb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class a6 extends gb {
    private static volatile a6 b;

    private a6() {
    }

    public static a6 a() {
        a6 a6Var;
        a6 a6Var2 = b;
        if (a6Var2 != null) {
            return a6Var2;
        }
        synchronized (a6.class) {
            try {
                a6Var = b;
                if (a6Var == null) {
                    a6Var = new a6();
                    b = a6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, gb.a aVar) {
        if (a(str, aVar)) {
            mi.a("ImageLoader: can't load. Image already loading");
        } else {
            a(str, (Bitmap) i5.a().a(str, (String) null).c());
        }
    }

    public void c(final String str, final gb.a aVar) {
        o0.c(new Runnable() { // from class: com.my.target.a6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a6.this.b(str, aVar);
            }
        });
    }
}
