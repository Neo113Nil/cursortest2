package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class sg extends rg {
    @Override // defpackage.qg, defpackage.og
    public void b(i40 i40Var, i40 i40Var2, Window window, View view, boolean z, boolean z2) {
        i40Var.getClass();
        i40Var2.getClass();
        window.getClass();
        view.getClass();
        k80.a(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof cb)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        iw iwVar = new iw(view, 13);
        int i3 = Build.VERSION.SDK_INT;
        g90 hb0Var = i3 >= 35 ? new hb0(window, iwVar) : i3 >= 30 ? new gb0(window, iwVar) : new eb0(window, iwVar);
        hb0Var.d(!z);
        hb0Var.c(!z2);
    }
}
