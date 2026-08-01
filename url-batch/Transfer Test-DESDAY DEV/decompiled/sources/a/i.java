package a;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a, reason: collision with root package name */
    public final long f1192a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f1193b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1194c;
    public final /* synthetic */ ComponentActivity d;

    public i(ComponentActivity componentActivity) {
        this.d = componentActivity;
    }

    public final void a(View view) {
        if (this.f1194c) {
            return;
        }
        this.f1194c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g1.f.e(runnable, "runnable");
        this.f1193b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        g1.f.d(decorView, "window.decorView");
        if (!this.f1194c) {
            decorView.postOnAnimation(new B0.b(7, this));
        } else if (g1.f.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1193b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1192a) {
                this.f1194c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1193b = null;
        m mVar = (m) this.d.f1242g.a();
        synchronized (mVar.f1206a) {
            z2 = mVar.f1207b;
        }
        if (z2) {
            this.f1194c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
