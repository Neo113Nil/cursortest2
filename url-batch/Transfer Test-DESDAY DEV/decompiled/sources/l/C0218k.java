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
import com.football.transfertrivia.R;
import java.util.ArrayList;
import k.AbstractC0172u;
import k.ActionProviderVisibilityListenerC0167p;
import k.C0166o;
import k.InterfaceC0147A;
import k.InterfaceC0175x;
import k.InterfaceC0176y;
import k.InterfaceC0177z;
import k.MenuC0164m;
import k.SubMenuC0151E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218k implements InterfaceC0176y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3016a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3017b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0164m f3018c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0175x f3019e;
    public InterfaceC0147A h;
    public C0216j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3022j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3023k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3024l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3025m;

    /* renamed from: n, reason: collision with root package name */
    public int f3026n;

    /* renamed from: o, reason: collision with root package name */
    public int f3027o;

    /* renamed from: p, reason: collision with root package name */
    public int f3028p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3029q;

    /* renamed from: s, reason: collision with root package name */
    public C0210g f3031s;

    /* renamed from: t, reason: collision with root package name */
    public C0210g f3032t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0214i f3033u;

    /* renamed from: v, reason: collision with root package name */
    public C0212h f3034v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3020f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3021g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3030r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final A0.h f3035w = new A0.h(26, this);

    public C0218k(Context context) {
        this.f3016a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(C0166o c0166o, View view, ViewGroup viewGroup) {
        View actionView = c0166o.getActionView();
        if (actionView == null || c0166o.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0177z ? (InterfaceC0177z) view : (InterfaceC0177z) this.d.inflate(this.f3021g, viewGroup, false);
            actionMenuItemView.a(c0166o);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3034v == null) {
                this.f3034v = new C0212h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3034v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0166o.f2782C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0222m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        e();
        C0210g c0210g = this.f3032t;
        if (c0210g != null && c0210g.b()) {
            c0210g.i.dismiss();
        }
        InterfaceC0175x interfaceC0175x = this.f3019e;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0176y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0164m menuC0164m = this.f3018c;
            if (menuC0164m != null) {
                menuC0164m.i();
                ArrayList l2 = this.f3018c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0166o c0166o = (C0166o) l2.get(i2);
                    if (c0166o.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0166o itemData = childAt instanceof InterfaceC0177z ? ((InterfaceC0177z) childAt).getItemData() : null;
                        View a2 = a(c0166o, childAt, viewGroup);
                        if (c0166o != itemData) {
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
        MenuC0164m menuC0164m2 = this.f3018c;
        if (menuC0164m2 != null) {
            menuC0164m2.i();
            ArrayList arrayList2 = menuC0164m2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p = ((C0166o) arrayList2.get(i3)).f2780A;
            }
        }
        MenuC0164m menuC0164m3 = this.f3018c;
        if (menuC0164m3 != null) {
            menuC0164m3.i();
            arrayList = menuC0164m3.f2762j;
        }
        if (this.f3024l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0166o) arrayList.get(0)).f2782C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0216j(this, this.f3016a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0216j c0216j = this.i;
                actionMenuView.getClass();
                C0222m j2 = ActionMenuView.j();
                j2.f3038a = true;
                actionMenuView.addView(c0216j, j2);
            }
        } else {
            C0216j c0216j2 = this.i;
            if (c0216j2 != null) {
                Object parent = c0216j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3024l);
    }

    @Override // k.InterfaceC0176y
    public final boolean d(C0166o c0166o) {
        return false;
    }

    public final boolean e() {
        Object obj;
        RunnableC0214i runnableC0214i = this.f3033u;
        if (runnableC0214i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0214i);
            this.f3033u = null;
            return true;
        }
        C0210g c0210g = this.f3031s;
        if (c0210g == null) {
            return false;
        }
        if (c0210g.b()) {
            c0210g.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.InterfaceC0176y
    public final boolean f(SubMenuC0151E subMenuC0151E) {
        boolean z2;
        if (!subMenuC0151E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0151E subMenuC0151E2 = subMenuC0151E;
        while (true) {
            MenuC0164m menuC0164m = subMenuC0151E2.f2697z;
            if (menuC0164m == this.f3018c) {
                break;
            }
            subMenuC0151E2 = (SubMenuC0151E) menuC0164m;
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
                if ((childAt instanceof InterfaceC0177z) && ((InterfaceC0177z) childAt).getItemData() == subMenuC0151E2.f2696A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0151E.f2696A.getClass();
        int size = subMenuC0151E.f2760f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0151E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0210g c0210g = new C0210g(this, this.f3017b, subMenuC0151E, view);
        this.f3032t = c0210g;
        c0210g.f2822g = z2;
        AbstractC0172u abstractC0172u = c0210g.i;
        if (abstractC0172u != null) {
            abstractC0172u.o(z2);
        }
        C0210g c0210g2 = this.f3032t;
        if (!c0210g2.b()) {
            if (c0210g2.f2820e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0210g2.d(0, 0, false, false);
        }
        InterfaceC0175x interfaceC0175x = this.f3019e;
        if (interfaceC0175x != null) {
            interfaceC0175x.g(subMenuC0151E);
        }
        return true;
    }

    @Override // k.InterfaceC0176y
    public final void g(InterfaceC0175x interfaceC0175x) {
        throw null;
    }

    @Override // k.InterfaceC0176y
    public final boolean h(C0166o c0166o) {
        return false;
    }

    public final boolean i() {
        C0210g c0210g = this.f3031s;
        return c0210g != null && c0210g.b();
    }

    @Override // k.InterfaceC0176y
    public final void j(Context context, MenuC0164m menuC0164m) {
        this.f3017b = context;
        LayoutInflater.from(context);
        this.f3018c = menuC0164m;
        Resources resources = context.getResources();
        if (!this.f3025m) {
            this.f3024l = true;
        }
        int i = 2;
        this.f3026n = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f3028p = i;
        int i4 = this.f3026n;
        if (this.f3024l) {
            if (this.i == null) {
                C0216j c0216j = new C0216j(this, this.f3016a);
                this.i = c0216j;
                if (this.f3023k) {
                    c0216j.setImageDrawable(this.f3022j);
                    this.f3022j = null;
                    this.f3023k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3027o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        MenuC0164m menuC0164m = this.f3018c;
        if (menuC0164m != null) {
            arrayList = menuC0164m.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3028p;
        int i4 = this.f3027o;
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
            C0166o c0166o = (C0166o) arrayList.get(i5);
            int i8 = c0166o.f2804y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3029q && c0166o.f2782C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3024l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3030r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C0166o c0166o2 = (C0166o) arrayList.get(i10);
            int i12 = c0166o2.f2804y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = c0166o2.f2784b;
            if (z4) {
                View a2 = a(c0166o2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                c0166o2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(c0166o2, null, viewGroup);
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
                        C0166o c0166o3 = (C0166o) arrayList.get(i14);
                        if (c0166o3.f2784b == i13) {
                            if (c0166o3.f()) {
                                i9++;
                            }
                            c0166o3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                c0166o2.g(z6);
            } else {
                c0166o2.g(false);
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
        MenuC0164m menuC0164m;
        if (!this.f3024l || i() || (menuC0164m = this.f3018c) == null || this.h == null || this.f3033u != null) {
            return false;
        }
        menuC0164m.i();
        if (menuC0164m.f2762j.isEmpty()) {
            return false;
        }
        RunnableC0214i runnableC0214i = new RunnableC0214i(this, new C0210g(this, this.f3017b, this.f3018c, this.i));
        this.f3033u = runnableC0214i;
        ((View) this.h).post(runnableC0214i);
        return true;
    }
}
