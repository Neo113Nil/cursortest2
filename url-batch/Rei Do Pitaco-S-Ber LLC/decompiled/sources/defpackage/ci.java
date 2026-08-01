package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class ci {
    public final TextInputLayout a;
    public final bi b;
    public final Context c;
    public final CheckableImageButton d;

    public ci(bi biVar) {
        this.a = biVar.f;
        this.b = biVar;
        this.c = biVar.getContext();
        this.d = biVar.l;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof hg;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.b.f(false);
    }

    public void l(EditText editText) {
    }

    public void m(k0 k0Var) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z) {
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }
}
