package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ib implements jp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jp
    public final void b(lp lpVar, fp fpVar) {
        Window window;
        View peekDecorView;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b3 b3Var = (b3) obj;
                if (fpVar == fp.ON_STOP && (window = b3Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                b3 b3Var2 = (b3) obj;
                if (fpVar == fp.ON_DESTROY) {
                    b3Var2.g.b = null;
                    if (!b3Var2.isChangingConfigurations()) {
                        b3Var2.d().a();
                    }
                    mb mbVar = b3Var2.k;
                    b3 b3Var3 = mbVar.i;
                    b3Var3.getWindow().getDecorView().removeCallbacks(mbVar);
                    b3Var3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mbVar);
                    break;
                }
                break;
            default:
                h3 h3Var = (h3) obj;
                h3Var.getClass();
                if (fpVar != fp.ON_START) {
                    if (fpVar == fp.ON_STOP) {
                        h3Var.e = false;
                        break;
                    }
                } else {
                    h3Var.e = true;
                    break;
                }
                break;
        }
    }
}
