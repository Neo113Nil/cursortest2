package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ct {
    public final Context a;
    public final ss b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public ht i;
    public at j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final bt l = new bt(this);

    public ct(int i, int i2, ss ssVar, Context context, View view, boolean z) {
        this.a = context;
        this.b = ssVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final at a() {
        at d30Var;
        if (this.j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                d30Var = new i9(context2, this.f, this.d, this.e, this.c);
            } else {
                View view = this.f;
                d30Var = new d30(this.d, this.e, this.b, context2, view, this.c);
            }
            d30Var.n(this.b);
            d30Var.t(this.l);
            d30Var.p(this.f);
            d30Var.f(this.i);
            d30Var.q(this.h);
            d30Var.r(this.g);
            this.j = d30Var;
        }
        return this.j;
    }

    public final boolean b() {
        at atVar = this.j;
        return atVar != null && atVar.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        at a = a();
        a.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a.s(i);
            a.v(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.d();
    }
}
