package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class v4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v4(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                e5 e5Var = (e5) obj;
                if (!e5Var.getInternalPopup().b()) {
                    e5Var.k.n(e5Var.getTextDirection(), e5Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = e5Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                b5 b5Var = (b5) obj;
                e5 e5Var2 = b5Var.L;
                if (!e5Var2.isAttachedToWindow() || !e5Var2.getGlobalVisibleRect(b5Var.J)) {
                    b5Var.dismiss();
                    break;
                } else {
                    b5Var.s();
                    b5Var.d();
                    break;
                }
                break;
            case 2:
                i9 i9Var = (i9) obj;
                ArrayList arrayList = i9Var.n;
                if (i9Var.b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((h9) arrayList.get(0)).a.D) {
                        View view = i9Var.u;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((h9) obj2).a.d();
                            }
                            break;
                        } else {
                            i9Var.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                d30 d30Var = (d30) obj;
                gt gtVar = d30Var.n;
                if (d30Var.b() && !gtVar.D) {
                    View view2 = d30Var.s;
                    if (view2 != null && view2.isShown()) {
                        gtVar.d();
                        break;
                    } else {
                        d30Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
