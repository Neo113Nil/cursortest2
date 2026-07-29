package o;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: o.dW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911dW extends AbstractC1075g1 {
    public final C1108gW a;
    public final Window.Callback b;
    public final C0845cW c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final R2 h = new R2(9, this);

    public C0911dW(Toolbar toolbar, CharSequence charSequence, WindowCallbackC0884d5 windowCallbackC0884d5) {
        C0845cW c0845cW = new C0845cW(this);
        C1108gW c1108gW = new C1108gW(toolbar, false);
        this.a = c1108gW;
        windowCallbackC0884d5.getClass();
        this.b = windowCallbackC0884d5;
        c1108gW.k = windowCallbackC0884d5;
        toolbar.setOnMenuItemClickListener(c0845cW);
        if (!c1108gW.g) {
            c1108gW.h = charSequence;
            if ((c1108gW.b & 8) != 0) {
                Toolbar toolbar2 = c1108gW.a;
                toolbar2.setTitle(charSequence);
                if (c1108gW.g) {
                    AZ.i(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.c = new C0845cW(this);
    }

    @Override // o.AbstractC1075g1
    public final boolean a() {
        C2128w1 c2128w1;
        ActionMenuView actionMenuView = this.a.a.h;
        return (actionMenuView == null || (c2128w1 = actionMenuView.A) == null || !c2128w1.d()) ? false : true;
    }

    @Override // o.AbstractC1075g1
    public final boolean b() {
        C1284jC c1284jC;
        YV yv = this.a.a.T;
        if (yv == null || (c1284jC = yv.i) == null) {
            return false;
        }
        if (yv == null) {
            c1284jC = null;
        }
        if (c1284jC == null) {
            return true;
        }
        c1284jC.collapseActionView();
        return true;
    }

    @Override // o.AbstractC1075g1
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // o.AbstractC1075g1
    public final int d() {
        return this.a.b;
    }

    @Override // o.AbstractC1075g1
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // o.AbstractC1075g1
    public final boolean f() {
        C1108gW c1108gW = this.a;
        Toolbar toolbar = c1108gW.a;
        R2 r2 = this.h;
        toolbar.removeCallbacks(r2);
        Toolbar toolbar2 = c1108gW.a;
        WeakHashMap weakHashMap = AZ.a;
        toolbar2.postOnAnimation(r2);
        return true;
    }

    @Override // o.AbstractC1075g1
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // o.AbstractC1075g1
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu p = p();
        if (p == null) {
            return false;
        }
        p.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return p.performShortcut(i, keyEvent, 0);
    }

    @Override // o.AbstractC1075g1
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // o.AbstractC1075g1
    public final boolean k() {
        return this.a.a.u();
    }

    @Override // o.AbstractC1075g1
    public final void n(CharSequence charSequence) {
        C1108gW c1108gW = this.a;
        if (c1108gW.g) {
            return;
        }
        Toolbar toolbar = c1108gW.a;
        c1108gW.h = charSequence;
        if ((c1108gW.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c1108gW.g) {
                AZ.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu p() {
        boolean z = this.e;
        C1108gW c1108gW = this.a;
        if (!z) {
            C0260Jx c0260Jx = new C0260Jx(this);
            C0845cW c0845cW = new C0845cW(this);
            Toolbar toolbar = c1108gW.a;
            toolbar.U = c0260Jx;
            toolbar.V = c0845cW;
            ActionMenuView actionMenuView = toolbar.h;
            if (actionMenuView != null) {
                actionMenuView.B = c0260Jx;
                actionMenuView.C = c0845cW;
            }
            this.e = true;
        }
        return c1108gW.a.getMenu();
    }

    @Override // o.AbstractC1075g1
    public final void g() {
    }

    @Override // o.AbstractC1075g1
    public final void l(boolean z) {
    }

    @Override // o.AbstractC1075g1
    public final void m(boolean z) {
    }
}
