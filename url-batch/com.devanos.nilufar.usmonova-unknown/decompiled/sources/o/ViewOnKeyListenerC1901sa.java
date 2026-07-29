package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.devanos.nilufar.usmonova.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1901sa extends AbstractC1614oC implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public boolean C;
    public InterfaceC2075vC D;
    public ViewTreeObserver E;
    public PopupWindow.OnDismissListener F;
    public boolean G;
    public final Context i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Handler m;
    public View u;
    public View v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;
    public final ArrayList n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f221o = new ArrayList();
    public final B5 p = new B5(2, this);
    public final W2 q = new W2(1, this);
    public final Y1 r = new Y1(10, this);
    public int s = 0;
    public int t = 0;
    public boolean B = false;

    public ViewOnKeyListenerC1901sa(Context context, View view, int i, boolean z) {
        this.i = context;
        this.u = view;
        this.k = i;
        this.l = z;
        this.w = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = new Handler();
    }

    @Override // o.InterfaceC1629oR
    public final boolean a() {
        ArrayList arrayList = this.f221o;
        return arrayList.size() > 0 && ((C1835ra) arrayList.get(0)).a.F.isShowing();
    }

    @Override // o.InterfaceC2141wC
    public final void b(MenuC0825cC menuC0825cC, boolean z) {
        ArrayList arrayList = this.f221o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0825cC == ((C1835ra) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C1835ra) arrayList.get(i2)).b.c(false);
        }
        C1835ra c1835ra = (C1835ra) arrayList.remove(i);
        MenuC0825cC menuC0825cC2 = c1835ra.b;
        C2009uC c2009uC = c1835ra.a;
        menuC0825cC2.r(this);
        if (this.G) {
            AbstractC1811rC.b(c2009uC.F, null);
            c2009uC.F.setAnimationStyle(0);
        }
        c2009uC.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.w = ((C1835ra) arrayList.get(size2 - 1)).c;
        } else {
            this.w = this.u.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C1835ra) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC2075vC interfaceC2075vC = this.D;
        if (interfaceC2075vC != null) {
            interfaceC2075vC.b(menuC0825cC, true);
        }
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.E.removeGlobalOnLayoutListener(this.p);
            }
            this.E = null;
        }
        this.v.removeOnAttachStateChangeListener(this.q);
        this.F.onDismiss();
    }

    @Override // o.InterfaceC2141wC
    public final void c() {
        Iterator it = this.f221o.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1835ra) it.next()).a.j.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ZB) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.InterfaceC1629oR
    public final void d() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((MenuC0825cC) it.next());
        }
        arrayList.clear();
        View view = this.u;
        this.v = view;
        if (view != null) {
            boolean z = this.E == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.p);
            }
            this.v.addOnAttachStateChangeListener(this.q);
        }
    }

    @Override // o.InterfaceC1629oR
    public final void dismiss() {
        ArrayList arrayList = this.f221o;
        int size = arrayList.size();
        if (size > 0) {
            C1835ra[] c1835raArr = (C1835ra[]) arrayList.toArray(new C1835ra[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1835ra c1835ra = c1835raArr[i];
                if (c1835ra.a.F.isShowing()) {
                    c1835ra.a.dismiss();
                }
            }
        }
    }

    @Override // o.InterfaceC1629oR
    public final C1713pj f() {
        ArrayList arrayList = this.f221o;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1835ra) arrayList.get(arrayList.size() - 1)).a.j;
    }

    @Override // o.InterfaceC2141wC
    public final void g(InterfaceC2075vC interfaceC2075vC) {
        this.D = interfaceC2075vC;
    }

    @Override // o.InterfaceC2141wC
    public final boolean i() {
        return false;
    }

    @Override // o.InterfaceC2141wC
    public final boolean j(SubMenuC0909dU subMenuC0909dU) {
        Iterator it = this.f221o.iterator();
        while (it.hasNext()) {
            C1835ra c1835ra = (C1835ra) it.next();
            if (subMenuC0909dU == c1835ra.b) {
                c1835ra.a.j.requestFocus();
                return true;
            }
        }
        if (!subMenuC0909dU.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0909dU);
        InterfaceC2075vC interfaceC2075vC = this.D;
        if (interfaceC2075vC != null) {
            interfaceC2075vC.z(subMenuC0909dU);
        }
        return true;
    }

    @Override // o.AbstractC1614oC
    public final void l(MenuC0825cC menuC0825cC) {
        menuC0825cC.b(this, this.i);
        if (a()) {
            u(menuC0825cC);
        } else {
            this.n.add(menuC0825cC);
        }
    }

    @Override // o.AbstractC1614oC
    public final void n(View view) {
        if (this.u != view) {
            this.u = view;
            this.t = Gravity.getAbsoluteGravity(this.s, view.getLayoutDirection());
        }
    }

    @Override // o.AbstractC1614oC
    public final void o(boolean z) {
        this.B = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1835ra c1835ra;
        ArrayList arrayList = this.f221o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1835ra = null;
                break;
            }
            c1835ra = (C1835ra) arrayList.get(i);
            if (!c1835ra.a.F.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c1835ra != null) {
            c1835ra.b.c(false);
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

    @Override // o.AbstractC1614oC
    public final void p(int i) {
        if (this.s != i) {
            this.s = i;
            this.t = Gravity.getAbsoluteGravity(i, this.u.getLayoutDirection());
        }
    }

    @Override // o.AbstractC1614oC
    public final void q(int i) {
        this.x = true;
        this.z = i;
    }

    @Override // o.AbstractC1614oC
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.F = onDismissListener;
    }

    @Override // o.AbstractC1614oC
    public final void s(boolean z) {
        this.C = z;
    }

    @Override // o.AbstractC1614oC
    public final void t(int i) {
        this.y = true;
        this.A = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0161, code lost:
    
        if (((r9.getWidth() + r11[0]) + r5) > r10.right) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0163, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        if ((r11[0] - r5) < 0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(MenuC0825cC menuC0825cC) {
        boolean z;
        int i;
        C1835ra c1835ra;
        View view;
        int i2;
        int i3;
        int i4;
        int width;
        MenuItem menuItem;
        ZB zb;
        int i5;
        int firstVisiblePosition;
        Context context = this.i;
        LayoutInflater from = LayoutInflater.from(context);
        ZB zb2 = new ZB(menuC0825cC, from, this.l, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.B) {
            zb2.c = true;
        } else if (a()) {
            int size = menuC0825cC.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = menuC0825cC.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i6++;
            }
            zb2.c = z;
        }
        int m = AbstractC1614oC.m(zb2, context, this.j);
        C2009uC c2009uC = new C2009uC(context, null, this.k);
        c2009uC.I = this.r;
        c2009uC.w = this;
        c2009uC.F.setOnDismissListener(this);
        c2009uC.v = this.u;
        c2009uC.s = this.t;
        c2009uC.E = true;
        c2009uC.F.setFocusable(true);
        c2009uC.F.setInputMethodMode(2);
        c2009uC.p(zb2);
        c2009uC.r(m);
        c2009uC.s = this.t;
        ArrayList arrayList = this.f221o;
        if (arrayList.size() > 0) {
            c1835ra = (C1835ra) arrayList.get(arrayList.size() - 1);
            MenuC0825cC menuC0825cC2 = c1835ra.b;
            int size2 = menuC0825cC2.f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0825cC2.getItem(i7);
                if (menuItem.hasSubMenu() && menuC0825cC == menuItem.getSubMenu()) {
                    break;
                } else {
                    i7++;
                }
            }
            if (menuItem == null) {
                i = 1;
                view = null;
            } else {
                C1713pj c1713pj = c1835ra.a.j;
                ListAdapter adapter = c1713pj.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    zb = (ZB) headerViewListAdapter.getWrappedAdapter();
                } else {
                    zb = (ZB) adapter;
                    i5 = 0;
                }
                int count = zb.getCount();
                i = 1;
                int i8 = 0;
                while (true) {
                    if (i8 >= count) {
                        i8 = -1;
                        break;
                    } else if (menuItem == zb.getItem(i8)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 != -1 && (firstVisiblePosition = (i8 + i5) - c1713pj.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1713pj.getChildCount()) {
                    view = c1713pj.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i9 = Build.VERSION.SDK_INT;
                C1936t5 c1936t5 = c2009uC.F;
                if (i9 <= 28) {
                    Method method = C2009uC.J;
                    if (method != null) {
                        try {
                            method.invoke(c1936t5, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    AbstractC1877sC.a(c1936t5, false);
                }
                AbstractC1811rC.a(c2009uC.F, null);
                C1713pj c1713pj2 = ((C1835ra) arrayList.get(arrayList.size() - 1)).a.j;
                int[] iArr = new int[2];
                c1713pj2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.v.getWindowVisibleDisplayFrame(rect);
                if (this.w == i) {
                }
                boolean z2 = i2 == 1;
                this.w = i2;
                if (Build.VERSION.SDK_INT >= 26) {
                    c2009uC.v = view;
                    i4 = 0;
                    i3 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.u.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.t & 7) == 5) {
                        iArr2[0] = this.u.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i3 = iArr3[0] - iArr2[0];
                    i4 = iArr3[1] - iArr2[1];
                }
                if ((this.t & 5) != 5) {
                    if (z2) {
                        width = i3 + view.getWidth();
                        c2009uC.m = width;
                        c2009uC.r = true;
                        c2009uC.q = true;
                        c2009uC.i(i4);
                    }
                    width = i3 - m;
                    c2009uC.m = width;
                    c2009uC.r = true;
                    c2009uC.q = true;
                    c2009uC.i(i4);
                } else if (z2) {
                    width = i3 + m;
                    c2009uC.m = width;
                    c2009uC.r = true;
                    c2009uC.q = true;
                    c2009uC.i(i4);
                } else {
                    m = view.getWidth();
                    width = i3 - m;
                    c2009uC.m = width;
                    c2009uC.r = true;
                    c2009uC.q = true;
                    c2009uC.i(i4);
                }
            } else {
                if (this.x) {
                    c2009uC.m = this.z;
                }
                if (this.y) {
                    c2009uC.i(this.A);
                }
                Rect rect2 = this.h;
                c2009uC.D = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C1835ra(c2009uC, menuC0825cC, this.w));
            c2009uC.d();
            C1713pj c1713pj3 = c2009uC.j;
            c1713pj3.setOnKeyListener(this);
            if (c1835ra == null || !this.C || menuC0825cC.m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1713pj3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0825cC.m);
            c1713pj3.addHeaderView(frameLayout, null, false);
            c2009uC.d();
            return;
        }
        i = 1;
        c1835ra = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C1835ra(c2009uC, menuC0825cC, this.w));
        c2009uC.d();
        C1713pj c1713pj32 = c2009uC.j;
        c1713pj32.setOnKeyListener(this);
        if (c1835ra == null) {
        }
    }
}
