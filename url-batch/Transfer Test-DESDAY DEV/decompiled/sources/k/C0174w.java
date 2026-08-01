package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.football.transfertrivia.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0174w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2817a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0164m f2818b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2819c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2820e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2822g;
    public InterfaceC0175x h;
    public AbstractC0172u i;

    /* renamed from: j, reason: collision with root package name */
    public C0173v f2823j;

    /* renamed from: f, reason: collision with root package name */
    public int f2821f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0173v f2824k = new C0173v(this);

    public C0174w(int i, Context context, View view, MenuC0164m menuC0164m, boolean z2) {
        this.f2817a = context;
        this.f2818b = menuC0164m;
        this.f2820e = view;
        this.f2819c = z2;
        this.d = i;
    }

    public final AbstractC0172u a() {
        AbstractC0172u viewOnKeyListenerC0150D;
        if (this.i == null) {
            Context context = this.f2817a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0150D = new ViewOnKeyListenerC0158g(context, this.f2820e, this.d, this.f2819c);
            } else {
                View view = this.f2820e;
                Context context2 = this.f2817a;
                boolean z2 = this.f2819c;
                viewOnKeyListenerC0150D = new ViewOnKeyListenerC0150D(this.d, context2, view, this.f2818b, z2);
            }
            viewOnKeyListenerC0150D.l(this.f2818b);
            viewOnKeyListenerC0150D.r(this.f2824k);
            viewOnKeyListenerC0150D.n(this.f2820e);
            viewOnKeyListenerC0150D.g(this.h);
            viewOnKeyListenerC0150D.o(this.f2822g);
            viewOnKeyListenerC0150D.p(this.f2821f);
            this.i = viewOnKeyListenerC0150D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0172u abstractC0172u = this.i;
        return abstractC0172u != null && abstractC0172u.a();
    }

    public void c() {
        this.i = null;
        C0173v c0173v = this.f2823j;
        if (c0173v != null) {
            c0173v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0172u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2821f, this.f2820e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2820e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2817a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2815a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
