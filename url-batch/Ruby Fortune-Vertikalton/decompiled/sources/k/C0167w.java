package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.punchtowin.balls.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0167w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2743a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0157m f2744b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2745c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2746e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2748g;
    public InterfaceC0168x h;
    public AbstractC0165u i;

    /* renamed from: j, reason: collision with root package name */
    public C0166v f2749j;

    /* renamed from: f, reason: collision with root package name */
    public int f2747f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0166v f2750k = new C0166v(this);

    public C0167w(int i, Context context, View view, MenuC0157m menuC0157m, boolean z2) {
        this.f2743a = context;
        this.f2744b = menuC0157m;
        this.f2746e = view;
        this.f2745c = z2;
        this.d = i;
    }

    public final AbstractC0165u a() {
        AbstractC0165u viewOnKeyListenerC0143D;
        if (this.i == null) {
            Context context = this.f2743a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0143D = new ViewOnKeyListenerC0151g(context, this.f2746e, this.d, this.f2745c);
            } else {
                View view = this.f2746e;
                Context context2 = this.f2743a;
                boolean z2 = this.f2745c;
                viewOnKeyListenerC0143D = new ViewOnKeyListenerC0143D(this.d, context2, view, this.f2744b, z2);
            }
            viewOnKeyListenerC0143D.l(this.f2744b);
            viewOnKeyListenerC0143D.r(this.f2750k);
            viewOnKeyListenerC0143D.n(this.f2746e);
            viewOnKeyListenerC0143D.g(this.h);
            viewOnKeyListenerC0143D.o(this.f2748g);
            viewOnKeyListenerC0143D.p(this.f2747f);
            this.i = viewOnKeyListenerC0143D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0165u abstractC0165u = this.i;
        return abstractC0165u != null && abstractC0165u.a();
    }

    public void c() {
        this.i = null;
        C0166v c0166v = this.f2749j;
        if (c0166v != null) {
            c0166v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0165u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2747f, this.f2746e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2746e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2743a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2741a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
