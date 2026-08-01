package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class d40 implements Runnable {
    public final View f;
    public final boolean g;
    public final /* synthetic */ SwipeDismissBehavior h;

    public d40(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.h = swipeDismissBehavior;
        this.f = view;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i7 i7Var;
        SwipeDismissBehavior swipeDismissBehavior = this.h;
        h80 h80Var = swipeDismissBehavior.a;
        View view = this.f;
        if (h80Var != null && h80Var.f()) {
            view.postOnAnimation(this);
        } else {
            if (!this.g || (i7Var = swipeDismissBehavior.b) == null) {
                return;
            }
            i7Var.a(view);
        }
    }
}
