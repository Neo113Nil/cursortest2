package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;

/* renamed from: o.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2128w1 implements InterfaceC2141wC {
    public C1864s1 A;
    public RunnableC1996u1 B;
    public C1930t1 C;
    public final Context h;
    public Context i;
    public MenuC0825cC j;
    public final LayoutInflater k;
    public InterfaceC2075vC l;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC2339zC f236o;
    public C2062v1 p;
    public Drawable q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public C1864s1 z;
    public final int m = R.layout.abc_action_menu_layout;
    public final int n = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray y = new SparseBooleanArray();
    public final Y1 D = new Y1(5, this);

    public C2128w1(Context context) {
        this.h = context;
        this.k = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.yC] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C1284jC c1284jC, View view, ViewGroup viewGroup) {
        View actionView = c1284jC.getActionView();
        if (actionView == null || c1284jC.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC2273yC ? (InterfaceC2273yC) view : (InterfaceC2273yC) this.k.inflate(this.n, viewGroup, false);
            actionMenuItemView.a(c1284jC);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f236o);
            if (this.C == null) {
                this.C = new C1930t1(this);
            }
            actionMenuItemView2.setPopupCallback(this.C);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c1284jC.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C2260y1)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // o.InterfaceC2141wC
    public final void b(MenuC0825cC menuC0825cC, boolean z) {
        d();
        C1864s1 c1864s1 = this.A;
        if (c1864s1 != null && c1864s1.b()) {
            c1864s1.i.dismiss();
        }
        InterfaceC2075vC interfaceC2075vC = this.l;
        if (interfaceC2075vC != null) {
            interfaceC2075vC.b(menuC0825cC, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2141wC
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f236o;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC0825cC menuC0825cC = this.j;
            if (menuC0825cC != null) {
                menuC0825cC.i();
                ArrayList l = this.j.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1284jC c1284jC = (C1284jC) l.get(i2);
                    if ((c1284jC.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C1284jC itemData = childAt instanceof InterfaceC2273yC ? ((InterfaceC2273yC) childAt).getItemData() : null;
                        View a = a(c1284jC, childAt, viewGroup);
                        if (c1284jC != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f236o).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.p) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f236o).requestLayout();
        MenuC0825cC menuC0825cC2 = this.j;
        if (menuC0825cC2 != null) {
            menuC0825cC2.i();
            ArrayList arrayList2 = menuC0825cC2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC1350kC actionProviderVisibilityListenerC1350kC = ((C1284jC) arrayList2.get(i3)).A;
            }
        }
        MenuC0825cC menuC0825cC3 = this.j;
        if (menuC0825cC3 != null) {
            menuC0825cC3.i();
            arrayList = menuC0825cC3.j;
        }
        if (this.s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C1284jC) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.p == null) {
                this.p = new C2062v1(this, this.h);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.p.getParent();
            if (viewGroup3 != this.f236o) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f236o;
                C2062v1 c2062v1 = this.p;
                actionMenuView.getClass();
                C2260y1 i4 = ActionMenuView.i();
                i4.a = true;
                actionMenuView.addView(c2062v1, i4);
            }
        } else {
            C2062v1 c2062v12 = this.p;
            if (c2062v12 != null) {
                Object parent = c2062v12.getParent();
                Object obj = this.f236o;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.p);
                }
            }
        }
        ((ActionMenuView) this.f236o).setOverflowReserved(this.s);
    }

    public final boolean d() {
        Object obj;
        RunnableC1996u1 runnableC1996u1 = this.B;
        if (runnableC1996u1 != null && (obj = this.f236o) != null) {
            ((View) obj).removeCallbacks(runnableC1996u1);
            this.B = null;
            return true;
        }
        C1864s1 c1864s1 = this.z;
        if (c1864s1 == null) {
            return false;
        }
        if (c1864s1.b()) {
            c1864s1.i.dismiss();
        }
        return true;
    }

    @Override // o.InterfaceC2141wC
    public final boolean e(C1284jC c1284jC) {
        return false;
    }

    public final boolean f() {
        C1864s1 c1864s1 = this.z;
        return c1864s1 != null && c1864s1.b();
    }

    @Override // o.InterfaceC2141wC
    public final void g(InterfaceC2075vC interfaceC2075vC) {
        throw null;
    }

    @Override // o.InterfaceC2141wC
    public final void h(Context context, MenuC0825cC menuC0825cC) {
        this.i = context;
        LayoutInflater.from(context);
        this.j = menuC0825cC;
        Resources resources = context.getResources();
        if (!this.t) {
            this.s = true;
        }
        int i = 2;
        this.u = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.w = i;
        int i4 = this.u;
        if (this.s) {
            if (this.p == null) {
                C2062v1 c2062v1 = new C2062v1(this, this.h);
                this.p = c2062v1;
                if (this.r) {
                    c2062v1.setImageDrawable(this.q);
                    this.q = null;
                    this.r = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.p.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.p.getMeasuredWidth();
        } else {
            this.p = null;
        }
        this.v = i4;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // o.InterfaceC2141wC
    public final boolean i() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        C2128w1 c2128w1 = this;
        MenuC0825cC menuC0825cC = c2128w1.j;
        if (menuC0825cC != null) {
            arrayList = menuC0825cC.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = c2128w1.w;
        int i4 = c2128w1.v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c2128w1.f236o;
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
            C1284jC c1284jC = (C1284jC) arrayList.get(i5);
            int i8 = c1284jC.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (c2128w1.x && c1284jC.C) {
                i3 = 0;
            }
            i5++;
        }
        if (c2128w1.s && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = c2128w1.y;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C1284jC c1284jC2 = (C1284jC) arrayList.get(i10);
            int i12 = c1284jC2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = c1284jC2.b;
            if (z3) {
                View a = c2128w1.a(c1284jC2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c1284jC2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View a2 = c2128w1.a(c1284jC2, null, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
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
                        C1284jC c1284jC3 = (C1284jC) arrayList.get(i14);
                        if (c1284jC3.b == i13) {
                            if ((c1284jC3.x & 32) == 32) {
                                i9++;
                            }
                            c1284jC3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                c1284jC2.f(z5);
            } else {
                c1284jC2.f(false);
                i10++;
                i2 = 2;
                c2128w1 = this;
                z = true;
            }
            i10++;
            i2 = 2;
            c2128w1 = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2141wC
    public final boolean j(SubMenuC0909dU subMenuC0909dU) {
        boolean z;
        if (subMenuC0909dU.hasVisibleItems()) {
            SubMenuC0909dU subMenuC0909dU2 = subMenuC0909dU;
            while (true) {
                MenuC0825cC menuC0825cC = subMenuC0909dU2.z;
                if (menuC0825cC == this.j) {
                    break;
                }
                subMenuC0909dU2 = (SubMenuC0909dU) menuC0825cC;
            }
            C1284jC c1284jC = subMenuC0909dU2.A;
            ViewGroup viewGroup = (ViewGroup) this.f236o;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC2273yC) && ((InterfaceC2273yC) childAt).getItemData() == c1284jC) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC0909dU.A.getClass();
                int size = subMenuC0909dU.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC0909dU.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C1864s1 c1864s1 = new C1864s1(this, this.i, subMenuC0909dU, view);
                this.A = c1864s1;
                c1864s1.g = z;
                AbstractC1614oC abstractC1614oC = c1864s1.i;
                if (abstractC1614oC != null) {
                    abstractC1614oC.o(z);
                }
                C1864s1 c1864s12 = this.A;
                if (!c1864s12.b()) {
                    if (c1864s12.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1864s12.d(0, 0, false, false);
                }
                InterfaceC2075vC interfaceC2075vC = this.l;
                if (interfaceC2075vC != null) {
                    interfaceC2075vC.z(subMenuC0909dU);
                }
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC2141wC
    public final boolean k(C1284jC c1284jC) {
        return false;
    }

    public final boolean l() {
        MenuC0825cC menuC0825cC;
        if (!this.s || f() || (menuC0825cC = this.j) == null || this.f236o == null || this.B != null) {
            return false;
        }
        menuC0825cC.i();
        if (menuC0825cC.j.isEmpty()) {
            return false;
        }
        RunnableC1996u1 runnableC1996u1 = new RunnableC1996u1(this, 0, new C1864s1(this, this.i, this.j, this.p));
        this.B = runnableC1996u1;
        ((View) this.f236o).post(runnableC1996u1);
        return true;
    }
}
