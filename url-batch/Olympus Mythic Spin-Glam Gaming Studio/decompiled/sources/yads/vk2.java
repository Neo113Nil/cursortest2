package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes13.dex */
public final class vk2 implements ex0 {
    public final dx0 a;
    public final Handler b;

    public vk2(dx0 dx0Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = dx0Var;
        this.b = handler;
    }

    public static final void b(vk2 vk2Var) {
        vk2Var.getClass();
    }

    public static final void c(vk2 vk2Var) {
        vk2Var.getClass();
        dx0 dx0Var = vk2Var.a;
        if (dx0Var != null) {
            dx0Var.onAdShown();
        }
    }

    @Override // yads.ex0
    public final void onAdClicked() {
        this.b.post(new Runnable() { // from class: yads.vk2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(vk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void onAdDismissed() {
        this.b.post(new Runnable() { // from class: yads.vk2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                vk2.b(vk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void onAdShown() {
        this.b.post(new Runnable() { // from class: yads.vk2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                vk2.c(vk2.this);
            }
        });
    }

    @Override // yads.ex0
    public final void a(final y4 y4Var) {
        this.b.post(new Runnable() { // from class: yads.vk2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(vk2.this, y4Var);
            }
        });
    }

    public static final void a(vk2 vk2Var, y4 y4Var) {
        vk2Var.getClass();
    }

    public static final void a(vk2 vk2Var) {
        vk2Var.getClass();
    }
}
