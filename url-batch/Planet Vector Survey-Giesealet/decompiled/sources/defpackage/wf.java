package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vectorharbor.planetvectorsurvey.MainActivity;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wf implements vf, ViewTreeObserver.OnDrawListener, Runnable {
    public final long d = SystemClock.uptimeMillis() + 10000;
    public Runnable e;
    public boolean f;
    public final /* synthetic */ MainActivity g;

    public wf(MainActivity mainActivity) {
        this.g = mainActivity;
    }

    public final void a(View view) {
        if (this.f) {
            return;
        }
        this.f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.e = runnable;
        View decorView = this.g.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f) {
            decorView.postOnAnimation(new w2(3, this));
        } else if (nz.l(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.d) {
                this.f = false;
                this.g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.e = null;
        au fullyDrawnReporter = this.g.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.a) {
            z = fullyDrawnReporter.b;
        }
        if (z) {
            this.f = false;
            this.g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
