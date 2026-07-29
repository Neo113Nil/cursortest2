package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.qC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1746qC {
    public final Context a;
    public final MenuC0825cC b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public InterfaceC2075vC h;
    public AbstractC1614oC i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final C1680pC k = new C1680pC(this);

    public C1746qC(Context context, MenuC0825cC menuC0825cC, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = menuC0825cC;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final AbstractC1614oC a() {
        AbstractC1614oC viewOnKeyListenerC1171hT;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1171hT = new ViewOnKeyListenerC1901sa(context, this.e, this.d, this.c);
            } else {
                viewOnKeyListenerC1171hT = new ViewOnKeyListenerC1171hT(this.a, this.b, this.e, this.d, this.c);
            }
            viewOnKeyListenerC1171hT.l(this.b);
            viewOnKeyListenerC1171hT.r(this.k);
            viewOnKeyListenerC1171hT.n(this.e);
            viewOnKeyListenerC1171hT.g(this.h);
            viewOnKeyListenerC1171hT.o(this.g);
            viewOnKeyListenerC1171hT.p(this.f);
            this.i = viewOnKeyListenerC1171hT;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC1614oC abstractC1614oC = this.i;
        return abstractC1614oC != null && abstractC1614oC.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        AbstractC1614oC a = a();
        a.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.h = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.d();
    }
}
