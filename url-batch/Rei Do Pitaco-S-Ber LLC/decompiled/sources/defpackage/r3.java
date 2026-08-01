package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class r3 extends y80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.x80
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                c4 c4Var = ((p3) obj).g;
                c4Var.z.setAlpha(1.0f);
                c4Var.C.d(null);
                c4Var.C = null;
                break;
            case 1:
                c4 c4Var2 = (c4) obj;
                c4Var2.z.setAlpha(1.0f);
                c4Var2.C.d(null);
                c4Var2.C = null;
                break;
            default:
                c4 c4Var3 = (c4) ((o4) obj).h;
                c4Var3.z.setVisibility(8);
                PopupWindow popupWindow = c4Var3.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (c4Var3.z.getParent() instanceof View) {
                    View view = (View) c4Var3.z.getParent();
                    WeakHashMap weakHashMap = f80.a;
                    view.requestApplyInsets();
                }
                c4Var3.z.e();
                c4Var3.C.d(null);
                c4Var3.C = null;
                ViewGroup viewGroup = c4Var3.E;
                WeakHashMap weakHashMap2 = f80.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.y80, defpackage.x80
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((p3) obj).g.z.setVisibility(0);
                break;
            case 1:
                c4 c4Var = (c4) obj;
                c4Var.z.setVisibility(0);
                if (c4Var.z.getParent() instanceof View) {
                    View view = (View) c4Var.z.getParent();
                    WeakHashMap weakHashMap = f80.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
