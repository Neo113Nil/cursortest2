package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g9 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public g9(j0 j0Var, h9 h9Var, vs vsVar, ss ssVar) {
        this.j = j0Var;
        this.g = h9Var;
        this.h = vsVar;
        this.i = ssVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                i9 i9Var = (i9) ((j0) obj).g;
                vs vsVar = (vs) obj3;
                h9 h9Var = (h9) obj4;
                if (h9Var != null) {
                    i9Var.F = true;
                    h9Var.b.c(false);
                    i9Var.F = false;
                }
                if (vsVar.isEnabled() && vsVar.hasSubMenu()) {
                    ((ss) obj2).q(vsVar, null, 4);
                    break;
                }
                break;
            default:
                fa0.i((View) obj4, (ja0) obj3, (o4) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }

    public g9(View view, ja0 ja0Var, o4 o4Var, ValueAnimator valueAnimator) {
        this.g = view;
        this.h = ja0Var;
        this.i = o4Var;
        this.j = valueAnimator;
    }
}
