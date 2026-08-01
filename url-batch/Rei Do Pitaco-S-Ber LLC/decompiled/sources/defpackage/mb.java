package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class mb implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long f = SystemClock.uptimeMillis() + 10000;
    public Runnable g;
    public boolean h;
    public final /* synthetic */ b3 i;

    public mb(b3 b3Var) {
        this.i = b3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.g = runnable;
        View decorView = this.i.getWindow().getDecorView();
        decorView.getClass();
        if (!this.h) {
            decorView.postOnAnimation(new p1(4, this));
        } else if (oo.b(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.g;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f) {
                this.h = false;
                this.i.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.g = null;
        cl clVar = (cl) this.i.l.a();
        synchronized (clVar.a) {
            z = clVar.b;
        }
        if (z) {
            this.h = false;
            this.i.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
