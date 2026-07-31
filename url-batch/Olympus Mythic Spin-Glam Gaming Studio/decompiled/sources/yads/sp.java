package yads;

import android.graphics.Bitmap;
import android.os.Handler;

/* loaded from: classes4.dex */
public final class sp implements Runnable {
    public final Bitmap b;
    public final un2 c;
    public final aq d;
    public final Handler e;

    public sp(Bitmap bitmap, un2 un2Var, aq aqVar, Handler handler) {
        this.b = bitmap;
        this.c = un2Var;
        this.d = aqVar;
        this.e = handler;
    }

    public final void a(final Bitmap bitmap) {
        this.e.post(new Runnable() { // from class: yads.sp$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                sp.a(sp.this, bitmap);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        aq aqVar = this.d;
        Bitmap bitmap = this.b;
        aqVar.getClass();
        try {
            bitmap = aq.a(bitmap, 0.1d);
        } catch (Throwable unused) {
        }
        a(bitmap);
    }

    public static final void a(sp spVar, Bitmap bitmap) {
        un2 un2Var = spVar.c;
        tn2 tn2Var = un2Var.a.d;
        q72 q72Var = un2Var.b;
        wn2 wn2Var = un2Var.c;
        tn2Var.getClass();
        tn2.a(q72Var, wn2Var, bitmap);
    }
}
