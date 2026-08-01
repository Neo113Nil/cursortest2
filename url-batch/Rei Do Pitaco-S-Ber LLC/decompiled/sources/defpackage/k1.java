package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class k1 implements jt {
    public g1 A;
    public f1 B;
    public int D;
    public final Context f;
    public Context g;
    public ss h;
    public final LayoutInflater i;
    public ht j;
    public lt m;
    public int n;
    public h1 o;
    public Drawable p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public e1 y;
    public e1 z;
    public final int k = R.layout.abc_action_menu_layout;
    public final int l = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray x = new SparseBooleanArray();
    public final j0 C = new j0(2, this);

    public k1(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    @Override // defpackage.jt
    public final void a(ss ssVar, boolean z) {
        d();
        e1 e1Var = this.z;
        if (e1Var != null && e1Var.b()) {
            e1Var.j.dismiss();
        }
        ht htVar = this.j;
        if (htVar != null) {
            htVar.a(ssVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kt] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(vs vsVar, View view, ViewGroup viewGroup) {
        View actionView = vsVar.getActionView();
        if (actionView == null || vsVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof kt ? (kt) view : (kt) this.i.inflate(this.l, viewGroup, false);
            actionMenuItemView.c(vsVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.m);
            if (this.B == null) {
                this.B = new f1(this);
            }
            actionMenuItemView2.setPopupCallback(this.B);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(vsVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof m1)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.jt
    public final boolean c(vs vsVar) {
        return false;
    }

    public final boolean d() {
        Object obj;
        g1 g1Var = this.A;
        if (g1Var != null && (obj = this.m) != null) {
            ((View) obj).removeCallbacks(g1Var);
            this.A = null;
            return true;
        }
        e1 e1Var = this.y;
        if (e1Var == null) {
            return false;
        }
        if (e1Var.b()) {
            e1Var.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.jt
    public final void e(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof j1) && (i = ((j1) parcelable).f) > 0 && (findItem = this.h.findItem(i)) != null) {
            k((v30) findItem.getSubMenu());
        }
    }

    @Override // defpackage.jt
    public final void f(ht htVar) {
        throw null;
    }

    @Override // defpackage.jt
    public final boolean g(vs vsVar) {
        return false;
    }

    @Override // defpackage.jt
    public final int getId() {
        return this.n;
    }

    public final boolean h() {
        e1 e1Var = this.y;
        return e1Var != null && e1Var.b();
    }

    @Override // defpackage.jt
    public final void i(Context context, ss ssVar) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = ssVar;
        Resources resources = context.getResources();
        if (!this.s) {
            this.r = true;
        }
        int i = 2;
        this.t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.v = i;
        int i4 = this.t;
        if (this.r) {
            if (this.o == null) {
                h1 h1Var = new h1(this, this.f);
                this.o = h1Var;
                if (this.q) {
                    h1Var.setImageDrawable(this.p);
                    this.p = null;
                    this.q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.o.getMeasuredWidth();
        } else {
            this.o = null;
        }
        this.u = i4;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jt
    public final void j(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.m;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            ss ssVar = this.h;
            if (ssVar != null) {
                ssVar.i();
                ArrayList l = this.h.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    vs vsVar = (vs) l.get(i2);
                    if ((vsVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        vs itemData = childAt instanceof kt ? ((kt) childAt).getItemData() : null;
                        View b = b(vsVar, childAt, viewGroup);
                        if (vsVar != itemData) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.m).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.o) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.m).requestLayout();
        ss ssVar2 = this.h;
        if (ssVar2 != null) {
            ssVar2.i();
            ArrayList arrayList2 = ssVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ws wsVar = ((vs) arrayList2.get(i3)).A;
            }
        }
        ss ssVar3 = this.h;
        if (ssVar3 != null) {
            ssVar3.i();
            arrayList = ssVar3.j;
        }
        if (this.r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((vs) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        h1 h1Var = this.o;
        if (z2) {
            if (h1Var == null) {
                this.o = new h1(this, this.f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.o.getParent();
            if (viewGroup3 != this.m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.m;
                h1 h1Var2 = this.o;
                actionMenuView.getClass();
                m1 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(h1Var2, j);
            }
        } else if (h1Var != null) {
            Object parent = h1Var.getParent();
            Object obj = this.m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.o);
            }
        }
        ((ActionMenuView) this.m).setOverflowReserved(this.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jt
    public final boolean k(v30 v30Var) {
        boolean z;
        if (v30Var.hasVisibleItems()) {
            v30 v30Var2 = v30Var;
            while (true) {
                ss ssVar = v30Var2.z;
                if (ssVar == this.h) {
                    break;
                }
                v30Var2 = (v30) ssVar;
            }
            vs vsVar = v30Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.m;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof kt) && ((kt) childAt).getItemData() == vsVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.D = v30Var.A.a;
                int size = v30Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = v30Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                e1 e1Var = new e1(this, this.g, v30Var, view);
                this.z = e1Var;
                e1Var.h = z;
                at atVar = e1Var.j;
                if (atVar != null) {
                    atVar.q(z);
                }
                e1 e1Var2 = this.z;
                if (!e1Var2.b()) {
                    if (e1Var2.f == null) {
                        l8.u("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    e1Var2.d(0, 0, false, false);
                }
                ht htVar = this.j;
                if (htVar != null) {
                    htVar.v(v30Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jt
    public final boolean l() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        k1 k1Var = this;
        ss ssVar = k1Var.h;
        if (ssVar != null) {
            arrayList = ssVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = k1Var.v;
        int i4 = k1Var.u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) k1Var.m;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            vs vsVar = (vs) arrayList.get(i5);
            int i8 = vsVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (k1Var.w && vsVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (k1Var.r && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = k1Var.x;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            vs vsVar2 = (vs) arrayList.get(i10);
            int i12 = vsVar2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = vsVar2.b;
            if (z3) {
                View b = k1Var.b(vsVar2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                vsVar2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View b2 = k1Var.b(vsVar2, null, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        vs vsVar3 = (vs) arrayList.get(i14);
                        if (vsVar3.b == i13) {
                            if ((vsVar3.x & 32) == 32) {
                                i9++;
                            }
                            vsVar3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                vsVar2.f(z5);
            } else {
                vsVar2.f(false);
                i10++;
                i2 = 2;
                k1Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            k1Var = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.jt
    public final Parcelable m() {
        j1 j1Var = new j1();
        j1Var.f = this.D;
        return j1Var;
    }

    public final boolean n() {
        ss ssVar;
        if (!this.r || h() || (ssVar = this.h) == null || this.m == null || this.A != null) {
            return false;
        }
        ssVar.i();
        if (ssVar.j.isEmpty()) {
            return false;
        }
        g1 g1Var = new g1(this, new e1(this, this.g, this.h, this.o));
        this.A = g1Var;
        ((View) this.m).post(g1Var);
        return true;
    }
}
