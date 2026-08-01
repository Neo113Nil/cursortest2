package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.vectorharbor.planetvectorsurvey.MainActivity;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jx implements m20 {
    public static final lu0 e = new lu0(new zh(2));
    public final MainActivity d;

    public jx(MainActivity mainActivity) {
        this.d = mainActivity;
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        if (e20Var != e20.ON_DESTROY) {
            return;
        }
        Object systemService = this.d.getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        gx gxVar = (gx) e.getValue();
        Object b = gxVar.b(inputMethodManager);
        if (b == null) {
            return;
        }
        synchronized (b) {
            View c = gxVar.c(inputMethodManager);
            if (c == null) {
                return;
            }
            if (c.isAttachedToWindow()) {
                return;
            }
            boolean a = gxVar.a(inputMethodManager);
            if (a) {
                inputMethodManager.isActive();
            }
        }
    }
}
