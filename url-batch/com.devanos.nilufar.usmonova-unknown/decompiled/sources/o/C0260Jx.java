package o;

import androidx.appcompat.widget.ActionMenuView;

/* renamed from: o.Jx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260Jx implements InterfaceC2075vC {
    public final /* synthetic */ int h;
    public boolean i;
    public final Object j;

    public /* synthetic */ C0260Jx(Object obj, boolean z, int i) {
        this.h = i;
        this.j = obj;
        this.i = z;
    }

    public void a(boolean z) {
        if (this.i) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.i = true;
        C0286Kx c0286Kx = (C0286Kx) this.j;
        int i = c0286Kx.b - 1;
        c0286Kx.b = i;
        boolean z2 = z | c0286Kx.c;
        c0286Kx.c = z2;
        if (i != 0 || z2) {
            return;
        }
        c0286Kx.d.I(c0286Kx.a);
    }

    @Override // o.InterfaceC2075vC
    public void b(MenuC0825cC menuC0825cC, boolean z) {
        C2128w1 c2128w1;
        C0911dW c0911dW = (C0911dW) this.j;
        if (this.i) {
            return;
        }
        this.i = true;
        ActionMenuView actionMenuView = c0911dW.a.a.h;
        if (actionMenuView != null && (c2128w1 = actionMenuView.A) != null) {
            c2128w1.d();
            C1864s1 c1864s1 = c2128w1.A;
            if (c1864s1 != null && c1864s1.b()) {
                c1864s1.i.dismiss();
            }
        }
        c0911dW.b.onPanelClosed(108, menuC0825cC);
        this.i = false;
    }

    public String toString() {
        switch (this.h) {
            case 2:
                return this.i ? "FALL_THROUGH" : String.valueOf(this.j);
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC2075vC
    public boolean z(MenuC0825cC menuC0825cC) {
        ((C0911dW) this.j).b.onMenuOpened(108, menuC0825cC);
        return true;
    }

    public C0260Jx(C0286Kx c0286Kx) {
        this.h = 0;
        this.j = c0286Kx;
        this.i = false;
    }

    public C0260Jx(C0911dW c0911dW) {
        this.h = 3;
        this.j = c0911dW;
    }
}
