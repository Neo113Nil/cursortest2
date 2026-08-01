package l;

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
import com.fortuneodd.shadegrid.R;
import java.util.ArrayList;
import k.AbstractC0176u;
import k.ActionProviderVisibilityListenerC0171p;
import k.C0170o;
import k.InterfaceC0151A;
import k.InterfaceC0179x;
import k.InterfaceC0180y;
import k.InterfaceC0181z;
import k.MenuC0168m;
import k.SubMenuC0155E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232k implements InterfaceC0180y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3013a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3014b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0168m f3015c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0179x f3016e;
    public InterfaceC0151A h;
    public C0230j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3019j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3020k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3021l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3022m;

    /* renamed from: n, reason: collision with root package name */
    public int f3023n;

    /* renamed from: o, reason: collision with root package name */
    public int f3024o;

    /* renamed from: p, reason: collision with root package name */
    public int f3025p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3026q;

    /* renamed from: s, reason: collision with root package name */
    public C0224g f3028s;

    /* renamed from: t, reason: collision with root package name */
    public C0224g f3029t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0228i f3030u;

    /* renamed from: v, reason: collision with root package name */
    public C0226h f3031v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3017f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3018g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3027r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final C.g f3032w = new C.g(29, this);

    public C0232k(Context context) {
        this.f3013a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0170o c0170o, View view, ViewGroup viewGroup) {
        View actionView = c0170o.getActionView();
        if (actionView == null || c0170o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0181z ? (InterfaceC0181z) view : (InterfaceC0181z) this.d.inflate(this.f3018g, viewGroup, false);
            actionMenuItemView.a(c0170o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3031v == null) {
                this.f3031v = new C0226h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3031v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0170o.f2717C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0236m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0180y
    public final void b(MenuC0168m menuC0168m, boolean z2) {
        f();
        C0224g c0224g = this.f3029t;
        if (c0224g != null && c0224g.b()) {
            c0224g.i.dismiss();
        }
        InterfaceC0179x interfaceC0179x = this.f3016e;
        if (interfaceC0179x != null) {
            interfaceC0179x.b(menuC0168m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0180y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0168m menuC0168m = this.f3015c;
            if (menuC0168m != null) {
                menuC0168m.i();
                ArrayList l2 = this.f3015c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0170o c0170o = (C0170o) l2.get(i2);
                    if (c0170o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0170o itemData = childAt instanceof InterfaceC0181z ? ((InterfaceC0181z) childAt).getItemData() : null;
                        View a2 = a(c0170o, childAt, viewGroup);
                        if (c0170o != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.h).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        MenuC0168m menuC0168m2 = this.f3015c;
        if (menuC0168m2 != null) {
            menuC0168m2.i();
            ArrayList arrayList2 = menuC0168m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0171p actionProviderVisibilityListenerC0171p = ((C0170o) arrayList2.get(i3)).f2715A;
            }
        }
        MenuC0168m menuC0168m3 = this.f3015c;
        if (menuC0168m3 != null) {
            menuC0168m3.i();
            arrayList = menuC0168m3.f2697j;
        }
        if (this.f3021l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0170o) arrayList.get(0)).f2717C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0230j(this, this.f3013a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0230j c0230j = this.i;
                actionMenuView.getClass();
                C0236m j2 = ActionMenuView.j();
                j2.f3033a = true;
                actionMenuView.addView(c0230j, j2);
            }
        } else {
            C0230j c0230j2 = this.i;
            if (c0230j2 != null) {
                Object parent = c0230j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3021l);
    }

    @Override // k.InterfaceC0180y
    public final boolean d(C0170o c0170o) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0180y
    public final boolean e(SubMenuC0155E subMenuC0155E) {
        boolean z2;
        if (!subMenuC0155E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0155E subMenuC0155E2 = subMenuC0155E;
        while (true) {
            MenuC0168m menuC0168m = subMenuC0155E2.f2632z;
            if (menuC0168m == this.f3015c) {
                break;
            }
            subMenuC0155E2 = (SubMenuC0155E) menuC0168m;
        }
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0181z) && ((InterfaceC0181z) childAt).getItemData() == subMenuC0155E2.f2631A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0155E.f2631A.getClass();
        int size = subMenuC0155E.f2695f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0155E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0224g c0224g = new C0224g(this, this.f3014b, subMenuC0155E, view);
        this.f3029t = c0224g;
        c0224g.f2757g = z2;
        AbstractC0176u abstractC0176u = c0224g.i;
        if (abstractC0176u != null) {
            abstractC0176u.o(z2);
        }
        C0224g c0224g2 = this.f3029t;
        if (!c0224g2.b()) {
            if (c0224g2.f2755e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0224g2.d(0, 0, false, false);
        }
        InterfaceC0179x interfaceC0179x = this.f3016e;
        if (interfaceC0179x != null) {
            interfaceC0179x.f(subMenuC0155E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0228i runnableC0228i = this.f3030u;
        if (runnableC0228i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0228i);
            this.f3030u = null;
            return true;
        }
        C0224g c0224g = this.f3028s;
        if (c0224g == null) {
            return false;
        }
        if (c0224g.b()) {
            c0224g.i.dismiss();
        }
        return true;
    }

    @Override // k.InterfaceC0180y
    public final void g(InterfaceC0179x interfaceC0179x) {
        throw null;
    }

    @Override // k.InterfaceC0180y
    public final boolean h(C0170o c0170o) {
        return false;
    }

    public final boolean i() {
        C0224g c0224g = this.f3028s;
        return c0224g != null && c0224g.b();
    }

    @Override // k.InterfaceC0180y
    public final void j(Context context, MenuC0168m menuC0168m) {
        this.f3014b = context;
        LayoutInflater.from(context);
        this.f3015c = menuC0168m;
        Resources resources = context.getResources();
        if (!this.f3022m) {
            this.f3021l = true;
        }
        int i = 2;
        this.f3023n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3025p = i;
        int i4 = this.f3023n;
        if (this.f3021l) {
            if (this.i == null) {
                C0230j c0230j = new C0230j(this, this.f3013a);
                this.i = c0230j;
                if (this.f3020k) {
                    c0230j.setImageDrawable(this.f3019j);
                    this.f3019j = null;
                    this.f3020k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3024o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0180y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0168m menuC0168m = this.f3015c;
        if (menuC0168m != null) {
            arrayList = menuC0168m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3025p;
        int i4 = this.f3024o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            C0170o c0170o = (C0170o) arrayList.get(i5);
            int i8 = c0170o.f2739y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3026q && c0170o.f2717C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3021l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3027r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0170o c0170o2 = (C0170o) arrayList.get(i10);
            int i12 = c0170o2.f2739y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0170o2.f2719b;
            if (z4) {
                View a2 = a(c0170o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0170o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0170o2, null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C0170o c0170o3 = (C0170o) arrayList.get(i14);
                        if (c0170o3.f2719b == i13) {
                            if (c0170o3.f()) {
                                i9++;
                            }
                            c0170o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0170o2.g(z6);
            } else {
                c0170o2.g(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    public final boolean l() {
        MenuC0168m menuC0168m;
        if (!this.f3021l || i() || (menuC0168m = this.f3015c) == null || this.h == null || this.f3030u != null) {
            return false;
        }
        menuC0168m.i();
        if (menuC0168m.f2697j.isEmpty()) {
            return false;
        }
        RunnableC0228i runnableC0228i = new RunnableC0228i(this, new C0224g(this, this.f3014b, this.f3015c, this.i));
        this.f3030u = runnableC0228i;
        ((View) this.h).post(runnableC0228i);
        return true;
    }
}
