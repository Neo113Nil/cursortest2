package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes14.dex */
public final class q02 {
    public static final Object c = new Object();
    public static volatile q02 d;
    public final Handler a = new Handler(Looper.getMainLooper());
    public boolean b;

    public final void a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.b) {
                view.setAlpha(view.getAlpha() / 2);
                this.b = true;
            }
            this.a.postDelayed(new Runnable() { // from class: yads.q02$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    q02.a(q02.this, view);
                }
            }, 100L);
        }
    }

    public static final void a(q02 q02Var, View view) {
        if (q02Var.b) {
            view.setAlpha(view.getAlpha() * 2);
            q02Var.b = false;
        }
    }
}
