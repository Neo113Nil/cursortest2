package k;

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
import com.football.transfertrivia.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0179A;
import l.C0233r0;
import l.G0;
import l.H0;
import l.J0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0158g extends AbstractC0172u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2721b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2722c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2723e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2724f;

    /* renamed from: n, reason: collision with root package name */
    public View f2730n;

    /* renamed from: o, reason: collision with root package name */
    public View f2731o;

    /* renamed from: p, reason: collision with root package name */
    public int f2732p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2733q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2734r;

    /* renamed from: s, reason: collision with root package name */
    public int f2735s;

    /* renamed from: t, reason: collision with root package name */
    public int f2736t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2738v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0175x f2739w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2740x;

    /* renamed from: y, reason: collision with root package name */
    public C0173v f2741y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2742z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2725g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0155d i = new ViewTreeObserverOnGlobalLayoutListenerC0155d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final R0.n f2726j = new R0.n(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final A0.h f2727k = new A0.h(24, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2728l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2729m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2737u = false;

    public ViewOnKeyListenerC0158g(Context context, View view, int i, boolean z2) {
        this.f2721b = context;
        this.f2730n = view;
        this.d = i;
        this.f2723e = z2;
        this.f2732p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2722c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2724f = new Handler();
    }

    @Override // k.InterfaceC0149C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0157f) arrayList.get(0)).f2718a.f2889z.isShowing();
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0164m == ((C0157f) arrayList.get(i)).f2719b) {
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
            ((C0157f) arrayList.get(i2)).f2719b.c(false);
        }
        C0157f c0157f = (C0157f) arrayList.remove(i);
        c0157f.f2719b.r(this);
        boolean z3 = this.f2742z;
        J0 j02 = c0157f.f2718a;
        if (z3) {
            G0.b(j02.f2889z, null);
            j02.f2889z.setAnimationStyle(0);
        }
        j02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2732p = ((C0157f) arrayList.get(size2 - 1)).f2720c;
        } else {
            this.f2732p = this.f2730n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0157f) arrayList.get(0)).f2719b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0175x interfaceC0175x = this.f2739w;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2740x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2740x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2740x = null;
        }
        this.f2731o.removeOnAttachStateChangeListener(this.f2726j);
        this.f2741y.onDismiss();
    }

    @Override // k.InterfaceC0176y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0157f) it.next()).f2718a.f2869c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0161j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0149C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0157f[] c0157fArr = (C0157f[]) arrayList.toArray(new C0157f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0157f c0157f = c0157fArr[i];
                if (c0157f.f2718a.f2889z.isShowing()) {
                    c0157f.f2718a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0149C
    public final C0233r0 e() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0157f) arrayList.get(arrayList.size() - 1)).f2718a.f2869c;
    }

    @Override // k.InterfaceC0176y
    public final boolean f(SubMenuC0151E subMenuC0151E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0157f c0157f = (C0157f) it.next();
            if (subMenuC0151E == c0157f.f2719b) {
                c0157f.f2718a.f2869c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0151E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0151E);
        InterfaceC0175x interfaceC0175x = this.f2739w;
        if (interfaceC0175x != null) {
            interfaceC0175x.g(subMenuC0151E);
        }
        return true;
    }

    @Override // k.InterfaceC0176y
    public final void g(InterfaceC0175x interfaceC0175x) {
        this.f2739w = interfaceC0175x;
    }

    @Override // k.InterfaceC0149C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2725g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0164m) it.next());
        }
        arrayList.clear();
        View view = this.f2730n;
        this.f2731o = view;
        if (view != null) {
            boolean z2 = this.f2740x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2740x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2731o.addOnAttachStateChangeListener(this.f2726j);
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0172u
    public final void l(MenuC0164m menuC0164m) {
        menuC0164m.b(this, this.f2721b);
        if (a()) {
            v(menuC0164m);
        } else {
            this.f2725g.add(menuC0164m);
        }
    }

    @Override // k.AbstractC0172u
    public final void n(View view) {
        if (this.f2730n != view) {
            this.f2730n = view;
            this.f2729m = Gravity.getAbsoluteGravity(this.f2728l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0172u
    public final void o(boolean z2) {
        this.f2737u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0157f c0157f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0157f = null;
                break;
            }
            c0157f = (C0157f) arrayList.get(i);
            if (!c0157f.f2718a.f2889z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0157f != null) {
            c0157f.f2719b.c(false);
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

    @Override // k.AbstractC0172u
    public final void p(int i) {
        if (this.f2728l != i) {
            this.f2728l = i;
            this.f2729m = Gravity.getAbsoluteGravity(i, this.f2730n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0172u
    public final void q(int i) {
        this.f2733q = true;
        this.f2735s = i;
    }

    @Override // k.AbstractC0172u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2741y = (C0173v) onDismissListener;
    }

    @Override // k.AbstractC0172u
    public final void s(boolean z2) {
        this.f2738v = z2;
    }

    @Override // k.AbstractC0172u
    public final void t(int i) {
        this.f2734r = true;
        this.f2736t = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (((r8.getWidth() + r9[0]) + r5) > r11.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r9 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r8 = 1;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
    
        if ((r9[0] - r5) < 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(MenuC0164m menuC0164m) {
        C0157f c0157f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0161j c0161j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2721b;
        LayoutInflater from = LayoutInflater.from(context);
        C0161j c0161j2 = new C0161j(menuC0164m, from, this.f2723e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2737u) {
            c0161j2.f2752c = true;
        } else if (a()) {
            c0161j2.f2752c = AbstractC0172u.u(menuC0164m);
        }
        int m2 = AbstractC0172u.m(c0161j2, context, this.f2722c);
        J0 j02 = new J0(context, null, this.d);
        j02.f2905C = this.f2727k;
        j02.f2879p = this;
        j02.f2889z.setOnDismissListener(this);
        j02.f2878o = this.f2730n;
        j02.f2875l = this.f2729m;
        j02.f2888y = true;
        j02.f2889z.setFocusable(true);
        j02.f2889z.setInputMethodMode(2);
        j02.n(c0161j2);
        j02.q(m2);
        j02.f2875l = this.f2729m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0157f = (C0157f) arrayList.get(arrayList.size() - 1);
            MenuC0164m menuC0164m2 = c0157f.f2719b;
            int size = menuC0164m2.f2760f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0164m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0164m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0233r0 c0233r0 = c0157f.f2718a.f2869c;
                ListAdapter adapter = c0233r0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0161j = (C0161j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0161j = (C0161j) adapter;
                    i3 = 0;
                }
                int count = c0161j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0161j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0233r0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0233r0.getChildCount()) {
                    view = c0233r0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0179A c0179a = j02.f2889z;
                if (i6 <= 28) {
                    Method method = J0.f2904D;
                    if (method != null) {
                        try {
                            method.invoke(c0179a, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    H0.a(c0179a, false);
                }
                G0.a(j02.f2889z, null);
                C0233r0 c0233r02 = ((C0157f) arrayList.get(arrayList.size() - 1)).f2718a.f2869c;
                int[] iArr = new int[2];
                c0233r02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2731o.getWindowVisibleDisplayFrame(rect);
                if (this.f2732p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2732p = i2;
                j02.f2878o = view;
                if ((this.f2729m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                j02.f2871f = m2;
                j02.f2874k = true;
                j02.f2873j = true;
                j02.l(0);
            } else {
                if (this.f2733q) {
                    j02.f2871f = this.f2735s;
                }
                if (this.f2734r) {
                    j02.l(this.f2736t);
                }
                Rect rect2 = this.f2815a;
                j02.f2887x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0157f(j02, menuC0164m, this.f2732p));
            j02.i();
            C0233r0 c0233r03 = j02.f2869c;
            c0233r03.setOnKeyListener(this);
            if (c0157f == null || !this.f2738v || menuC0164m.f2765m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0233r03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0164m.f2765m);
            c0233r03.addHeaderView(frameLayout, null, false);
            j02.i();
            return;
        }
        c0157f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0157f(j02, menuC0164m, this.f2732p));
        j02.i();
        C0233r0 c0233r032 = j02.f2869c;
        c0233r032.setOnKeyListener(this);
        if (c0157f == null) {
        }
    }
}
