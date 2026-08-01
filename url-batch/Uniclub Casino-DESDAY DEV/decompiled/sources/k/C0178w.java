package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.fortuneodd.shadegrid.R;

/* renamed from: k.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0178w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2752a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0168m f2753b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2754c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2755e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2757g;
    public InterfaceC0179x h;
    public AbstractC0176u i;

    /* renamed from: j, reason: collision with root package name */
    public C0177v f2758j;

    /* renamed from: f, reason: collision with root package name */
    public int f2756f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final C0177v f2759k = new C0177v(this);

    public C0178w(int i, Context context, View view, MenuC0168m menuC0168m, boolean z2) {
        this.f2752a = context;
        this.f2753b = menuC0168m;
        this.f2755e = view;
        this.f2754c = z2;
        this.d = i;
    }

    public final AbstractC0176u a() {
        AbstractC0176u viewOnKeyListenerC0154D;
        if (this.i == null) {
            Context context = this.f2752a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0154D = new ViewOnKeyListenerC0162g(context, this.f2755e, this.d, this.f2754c);
            } else {
                View view = this.f2755e;
                Context context2 = this.f2752a;
                boolean z2 = this.f2754c;
                viewOnKeyListenerC0154D = new ViewOnKeyListenerC0154D(this.d, context2, view, this.f2753b, z2);
            }
            viewOnKeyListenerC0154D.l(this.f2753b);
            viewOnKeyListenerC0154D.r(this.f2759k);
            viewOnKeyListenerC0154D.n(this.f2755e);
            viewOnKeyListenerC0154D.g(this.h);
            viewOnKeyListenerC0154D.o(this.f2757g);
            viewOnKeyListenerC0154D.p(this.f2756f);
            this.i = viewOnKeyListenerC0154D;
        }
        return this.i;
    }

    public final boolean b() {
        AbstractC0176u abstractC0176u = this.i;
        return abstractC0176u != null && abstractC0176u.a();
    }

    public void c() {
        this.i = null;
        C0177v c0177v = this.f2758j;
        if (c0177v != null) {
            c0177v.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z2, boolean z3) {
        AbstractC0176u a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2756f, this.f2755e.getLayoutDirection()) & 7) == 5) {
                i -= this.f2755e.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i3 = (int) ((this.f2752a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2750a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.i();
    }
}
