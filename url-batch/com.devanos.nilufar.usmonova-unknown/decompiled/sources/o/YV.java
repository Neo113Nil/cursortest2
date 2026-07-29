package o;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class YV implements InterfaceC2141wC {
    public MenuC0825cC h;
    public C1284jC i;
    public final /* synthetic */ Toolbar j;

    public YV(Toolbar toolbar) {
        this.j = toolbar;
    }

    @Override // o.InterfaceC2141wC
    public final void c() {
        if (this.i != null) {
            MenuC0825cC menuC0825cC = this.h;
            if (menuC0825cC != null) {
                int size = menuC0825cC.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.h.getItem(i) == this.i) {
                        return;
                    }
                }
            }
            k(this.i);
        }
    }

    @Override // o.InterfaceC2141wC
    public final boolean e(C1284jC c1284jC) {
        Toolbar toolbar = this.j;
        toolbar.c();
        ViewParent parent = toolbar.f6o.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f6o);
            }
            toolbar.addView(toolbar.f6o);
        }
        View actionView = c1284jC.getActionView();
        toolbar.p = actionView;
        this.i = c1284jC;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.p);
            }
            ZV h = Toolbar.h();
            h.a = (toolbar.u & 112) | 8388611;
            h.b = 2;
            toolbar.p.setLayoutParams(h);
            toolbar.addView(toolbar.p);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((ZV) childAt.getLayoutParams()).b != 2 && childAt != toolbar.h) {
                toolbar.removeViewAt(childCount);
                toolbar.L.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1284jC.C = true;
        c1284jC.n.p(false);
        KeyEvent.Callback callback = toolbar.p;
        if (callback instanceof InterfaceC0653Zb) {
            ((C1416lC) ((InterfaceC0653Zb) callback)).h.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // o.InterfaceC2141wC
    public final void h(Context context, MenuC0825cC menuC0825cC) {
        C1284jC c1284jC;
        MenuC0825cC menuC0825cC2 = this.h;
        if (menuC0825cC2 != null && (c1284jC = this.i) != null) {
            menuC0825cC2.d(c1284jC);
        }
        this.h = menuC0825cC;
    }

    @Override // o.InterfaceC2141wC
    public final boolean i() {
        return false;
    }

    @Override // o.InterfaceC2141wC
    public final boolean j(SubMenuC0909dU subMenuC0909dU) {
        return false;
    }

    @Override // o.InterfaceC2141wC
    public final boolean k(C1284jC c1284jC) {
        Toolbar toolbar = this.j;
        KeyEvent.Callback callback = toolbar.p;
        if (callback instanceof InterfaceC0653Zb) {
            ((C1416lC) ((InterfaceC0653Zb) callback)).h.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.p);
        toolbar.removeView(toolbar.f6o);
        toolbar.p = null;
        ArrayList arrayList = toolbar.L;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.i = null;
        toolbar.requestLayout();
        c1284jC.C = false;
        c1284jC.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // o.InterfaceC2141wC
    public final void b(MenuC0825cC menuC0825cC, boolean z) {
    }
}
