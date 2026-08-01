package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class m50 implements jt {
    public ss f;
    public vs g;
    public final /* synthetic */ Toolbar h;

    public m50(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // defpackage.jt
    public final boolean c(vs vsVar) {
        Toolbar toolbar = this.h;
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof sa) {
            ((xs) ((sa) callback)).f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.n);
        toolbar.removeView(toolbar.m);
        toolbar.n = null;
        ArrayList arrayList = toolbar.J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.g = null;
        toolbar.requestLayout();
        vsVar.C = false;
        vsVar.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.jt
    public final boolean g(vs vsVar) {
        Toolbar toolbar = this.h;
        toolbar.c();
        ViewParent parent = toolbar.m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.m);
            }
            toolbar.addView(toolbar.m);
        }
        View actionView = vsVar.getActionView();
        toolbar.n = actionView;
        this.g = vsVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.n);
            }
            n50 h = Toolbar.h();
            h.a = (toolbar.s & 112) | 8388611;
            h.b = 2;
            toolbar.n.setLayoutParams(h);
            toolbar.addView(toolbar.n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((n50) childAt.getLayoutParams()).b != 2 && childAt != toolbar.f) {
                toolbar.removeViewAt(childCount);
                toolbar.J.add(childAt);
            }
        }
        toolbar.requestLayout();
        vsVar.C = true;
        vsVar.n.p(false);
        KeyEvent.Callback callback = toolbar.n;
        if (callback instanceof sa) {
            ((xs) ((sa) callback)).f.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.jt
    public final int getId() {
        return 0;
    }

    @Override // defpackage.jt
    public final void i(Context context, ss ssVar) {
        vs vsVar;
        ss ssVar2 = this.f;
        if (ssVar2 != null && (vsVar = this.g) != null) {
            ssVar2.d(vsVar);
        }
        this.f = ssVar;
    }

    @Override // defpackage.jt
    public final void j(boolean z) {
        if (this.g != null) {
            ss ssVar = this.f;
            if (ssVar != null) {
                int size = ssVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f.getItem(i) == this.g) {
                        return;
                    }
                }
            }
            c(this.g);
        }
    }

    @Override // defpackage.jt
    public final boolean k(v30 v30Var) {
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

    @Override // defpackage.jt
    public final void e(Parcelable parcelable) {
    }

    @Override // defpackage.jt
    public final void a(ss ssVar, boolean z) {
    }
}
