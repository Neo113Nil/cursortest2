package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class d30 extends at implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context g;
    public final ss h;
    public final ps i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final gt n;
    public PopupWindow.OnDismissListener q;
    public View r;
    public View s;
    public ht t;
    public ViewTreeObserver u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean z;
    public final v4 o = new v4(3, this);
    public final f9 p = new f9(5, this);
    public int y = 0;

    public d30(int i, int i2, ss ssVar, Context context, View view, boolean z) {
        this.g = context;
        this.h = ssVar;
        this.j = z;
        this.i = new ps(ssVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.l = i;
        this.m = i2;
        Resources resources = context.getResources();
        this.k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = view;
        this.n = new gt(context, null, i, i2);
        ssVar.b(this, context);
    }

    @Override // defpackage.jt
    public final void a(ss ssVar, boolean z) {
        if (ssVar != this.h) {
            return;
        }
        dismiss();
        ht htVar = this.t;
        if (htVar != null) {
            htVar.a(ssVar, z);
        }
    }

    @Override // defpackage.b20
    public final boolean b() {
        return !this.v && this.n.E.isShowing();
    }

    @Override // defpackage.b20
    public final void d() {
        View view;
        if (b()) {
            return;
        }
        if (this.v || (view = this.r) == null) {
            l8.u("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.s = view;
        gt gtVar = this.n;
        n4 n4Var = gtVar.E;
        n4 n4Var2 = gtVar.E;
        n4Var.setOnDismissListener(this);
        gtVar.u = this;
        gtVar.D = true;
        n4Var2.setFocusable(true);
        View view2 = this.s;
        boolean z = this.u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.o);
        }
        view2.addOnAttachStateChangeListener(this.p);
        gtVar.t = view2;
        gtVar.q = this.y;
        boolean z2 = this.w;
        Context context = this.g;
        ps psVar = this.i;
        if (!z2) {
            this.x = at.o(psVar, context, this.k);
            this.w = true;
        }
        gtVar.r(this.x);
        n4Var2.setInputMethodMode(2);
        Rect rect = this.f;
        gtVar.C = rect != null ? new Rect(rect) : null;
        gtVar.d();
        bg bgVar = gtVar.h;
        bgVar.setOnKeyListener(this);
        if (this.z) {
            ss ssVar = this.h;
            if (ssVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) bgVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(ssVar.m);
                }
                frameLayout.setEnabled(false);
                bgVar.addHeaderView(frameLayout, null, false);
            }
        }
        gtVar.q(psVar);
        gtVar.d();
    }

    @Override // defpackage.b20
    public final void dismiss() {
        if (b()) {
            this.n.dismiss();
        }
    }

    @Override // defpackage.jt
    public final void f(ht htVar) {
        this.t = htVar;
    }

    @Override // defpackage.b20
    public final bg h() {
        return this.n.h;
    }

    @Override // defpackage.jt
    public final void j(boolean z) {
        this.w = false;
        ps psVar = this.i;
        if (psVar != null) {
            psVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.jt
    public final boolean k(v30 v30Var) {
        boolean z;
        if (v30Var.hasVisibleItems()) {
            ct ctVar = new ct(this.l, this.m, v30Var, this.g, this.s, this.j);
            ht htVar = this.t;
            ctVar.i = htVar;
            at atVar = ctVar.j;
            if (atVar != null) {
                atVar.f(htVar);
            }
            int size = v30Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = v30Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            ctVar.h = z;
            at atVar2 = ctVar.j;
            if (atVar2 != null) {
                atVar2.q(z);
            }
            ctVar.k = this.q;
            this.q = null;
            this.h.c(false);
            gt gtVar = this.n;
            int i2 = gtVar.k;
            int o = gtVar.o();
            if ((Gravity.getAbsoluteGravity(this.y, this.r.getLayoutDirection()) & 7) == 5) {
                i2 += this.r.getWidth();
            }
            if (!ctVar.b()) {
                if (ctVar.f != null) {
                    ctVar.d(i2, o, true, true);
                }
            }
            ht htVar2 = this.t;
            if (htVar2 != null) {
                htVar2.v(v30Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jt
    public final boolean l() {
        return false;
    }

    @Override // defpackage.jt
    public final Parcelable m() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.v = true;
        this.h.c(true);
        ViewTreeObserver viewTreeObserver = this.u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.u = this.s.getViewTreeObserver();
            }
            this.u.removeGlobalOnLayoutListener(this.o);
            this.u = null;
        }
        this.s.removeOnAttachStateChangeListener(this.p);
        PopupWindow.OnDismissListener onDismissListener = this.q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.at
    public final void p(View view) {
        this.r = view;
    }

    @Override // defpackage.at
    public final void q(boolean z) {
        this.i.c = z;
    }

    @Override // defpackage.at
    public final void r(int i) {
        this.y = i;
    }

    @Override // defpackage.at
    public final void s(int i) {
        this.n.k = i;
    }

    @Override // defpackage.at
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.q = onDismissListener;
    }

    @Override // defpackage.at
    public final void u(boolean z) {
        this.z = z;
    }

    @Override // defpackage.at
    public final void v(int i) {
        this.n.k(i);
    }

    @Override // defpackage.jt
    public final void e(Parcelable parcelable) {
    }

    @Override // defpackage.at
    public final void n(ss ssVar) {
    }
}
