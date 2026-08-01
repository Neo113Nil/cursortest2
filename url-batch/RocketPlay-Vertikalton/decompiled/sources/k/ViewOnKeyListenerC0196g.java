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
import com.luckycounter.drinkwater.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0222B;
import l.C0278t0;
import l.I0;
import l.J0;
import l.L0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0196g extends AbstractC0210u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3152b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3153c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3154e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3155f;

    /* renamed from: n, reason: collision with root package name */
    public View f3161n;

    /* renamed from: o, reason: collision with root package name */
    public View f3162o;

    /* renamed from: p, reason: collision with root package name */
    public int f3163p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3164q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3165r;

    /* renamed from: s, reason: collision with root package name */
    public int f3166s;

    /* renamed from: t, reason: collision with root package name */
    public int f3167t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3169v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0213x f3170w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f3171x;

    /* renamed from: y, reason: collision with root package name */
    public C0211v f3172y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3173z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3156g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0193d i = new ViewTreeObserverOnGlobalLayoutListenerC0193d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final P0.n f3157j = new P0.n(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final A1.d f3158k = new A1.d(27, this);

    /* renamed from: l, reason: collision with root package name */
    public int f3159l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3160m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3168u = false;

    public ViewOnKeyListenerC0196g(Context context, View view, int i, boolean z2) {
        this.f3152b = context;
        this.f3161n = view;
        this.d = i;
        this.f3154e = z2;
        this.f3163p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3153c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3155f = new Handler();
    }

    @Override // k.InterfaceC0187C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0195f) arrayList.get(0)).f3149a.f3321z.isShowing();
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0202m == ((C0195f) arrayList.get(i)).f3150b) {
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
            ((C0195f) arrayList.get(i2)).f3150b.c(false);
        }
        C0195f c0195f = (C0195f) arrayList.remove(i);
        c0195f.f3150b.r(this);
        boolean z3 = this.f3173z;
        L0 l02 = c0195f.f3149a;
        if (z3) {
            I0.b(l02.f3321z, null);
            l02.f3321z.setAnimationStyle(0);
        }
        l02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3163p = ((C0195f) arrayList.get(size2 - 1)).f3151c;
        } else {
            this.f3163p = this.f3161n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0195f) arrayList.get(0)).f3150b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0213x interfaceC0213x = this.f3170w;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3171x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3171x.removeGlobalOnLayoutListener(this.i);
            }
            this.f3171x = null;
        }
        this.f3162o.removeOnAttachStateChangeListener(this.f3157j);
        this.f3172y.onDismiss();
    }

    @Override // k.InterfaceC0214y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0195f) it.next()).f3149a.f3301c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0199j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0187C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0195f[] c0195fArr = (C0195f[]) arrayList.toArray(new C0195f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0195f c0195f = c0195fArr[i];
                if (c0195f.f3149a.f3321z.isShowing()) {
                    c0195f.f3149a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean e(SubMenuC0189E subMenuC0189E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0195f c0195f = (C0195f) it.next();
            if (subMenuC0189E == c0195f.f3150b) {
                c0195f.f3149a.f3301c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0189E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0189E);
        InterfaceC0213x interfaceC0213x = this.f3170w;
        if (interfaceC0213x != null) {
            interfaceC0213x.f(subMenuC0189E);
        }
        return true;
    }

    @Override // k.InterfaceC0187C
    public final C0278t0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0195f) arrayList.get(arrayList.size() - 1)).f3149a.f3301c;
    }

    @Override // k.InterfaceC0214y
    public final void g(InterfaceC0213x interfaceC0213x) {
        this.f3170w = interfaceC0213x;
    }

    @Override // k.InterfaceC0187C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f3156g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0202m) it.next());
        }
        arrayList.clear();
        View view = this.f3161n;
        this.f3162o = view;
        if (view != null) {
            boolean z2 = this.f3171x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3171x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f3162o.addOnAttachStateChangeListener(this.f3157j);
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0210u
    public final void l(MenuC0202m menuC0202m) {
        menuC0202m.b(this, this.f3152b);
        if (a()) {
            v(menuC0202m);
        } else {
            this.f3156g.add(menuC0202m);
        }
    }

    @Override // k.AbstractC0210u
    public final void n(View view) {
        if (this.f3161n != view) {
            this.f3161n = view;
            this.f3160m = Gravity.getAbsoluteGravity(this.f3159l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0210u
    public final void o(boolean z2) {
        this.f3168u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0195f c0195f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0195f = null;
                break;
            }
            c0195f = (C0195f) arrayList.get(i);
            if (!c0195f.f3149a.f3321z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0195f != null) {
            c0195f.f3150b.c(false);
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

    @Override // k.AbstractC0210u
    public final void p(int i) {
        if (this.f3159l != i) {
            this.f3159l = i;
            this.f3160m = Gravity.getAbsoluteGravity(i, this.f3161n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0210u
    public final void q(int i) {
        this.f3164q = true;
        this.f3166s = i;
    }

    @Override // k.AbstractC0210u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3172y = (C0211v) onDismissListener;
    }

    @Override // k.AbstractC0210u
    public final void s(boolean z2) {
        this.f3169v = z2;
    }

    @Override // k.AbstractC0210u
    public final void t(int i) {
        this.f3165r = true;
        this.f3167t = i;
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
    public final void v(MenuC0202m menuC0202m) {
        C0195f c0195f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0199j c0199j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f3152b;
        LayoutInflater from = LayoutInflater.from(context);
        C0199j c0199j2 = new C0199j(menuC0202m, from, this.f3154e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f3168u) {
            c0199j2.f3183c = true;
        } else if (a()) {
            c0199j2.f3183c = AbstractC0210u.u(menuC0202m);
        }
        int m2 = AbstractC0210u.m(c0199j2, context, this.f3153c);
        L0 l02 = new L0(context, null, this.d);
        l02.f3338C = this.f3158k;
        l02.f3311p = this;
        l02.f3321z.setOnDismissListener(this);
        l02.f3310o = this.f3161n;
        l02.f3307l = this.f3160m;
        l02.f3320y = true;
        l02.f3321z.setFocusable(true);
        l02.f3321z.setInputMethodMode(2);
        l02.n(c0199j2);
        l02.r(m2);
        l02.f3307l = this.f3160m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0195f = (C0195f) arrayList.get(arrayList.size() - 1);
            MenuC0202m menuC0202m2 = c0195f.f3150b;
            int size = menuC0202m2.f3191f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0202m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0202m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0278t0 c0278t0 = c0195f.f3149a.f3301c;
                ListAdapter adapter = c0278t0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0199j = (C0199j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0199j = (C0199j) adapter;
                    i3 = 0;
                }
                int count = c0199j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0199j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0278t0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0278t0.getChildCount()) {
                    view = c0278t0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0222B c0222b = l02.f3321z;
                if (i6 <= 28) {
                    Method method = L0.f3337D;
                    if (method != null) {
                        try {
                            method.invoke(c0222b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    J0.a(c0222b, false);
                }
                I0.a(l02.f3321z, null);
                C0278t0 c0278t02 = ((C0195f) arrayList.get(arrayList.size() - 1)).f3149a.f3301c;
                int[] iArr = new int[2];
                c0278t02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3162o.getWindowVisibleDisplayFrame(rect);
                if (this.f3163p == 1) {
                }
                boolean z2 = i2 == i;
                this.f3163p = i2;
                l02.f3310o = view;
                if ((this.f3160m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                l02.f3303f = m2;
                l02.f3306k = true;
                l02.f3305j = true;
                l02.l(0);
            } else {
                if (this.f3164q) {
                    l02.f3303f = this.f3166s;
                }
                if (this.f3165r) {
                    l02.l(this.f3167t);
                }
                Rect rect2 = this.f3246a;
                l02.f3319x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0195f(l02, menuC0202m, this.f3163p));
            l02.i();
            C0278t0 c0278t03 = l02.f3301c;
            c0278t03.setOnKeyListener(this);
            if (c0195f == null || !this.f3169v || menuC0202m.f3196m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0278t03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0202m.f3196m);
            c0278t03.addHeaderView(frameLayout, null, false);
            l02.i();
            return;
        }
        c0195f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0195f(l02, menuC0202m, this.f3163p));
        l02.i();
        C0278t0 c0278t032 = l02.f3301c;
        c0278t032.setOnKeyListener(this);
        if (c0195f == null) {
        }
    }
}
