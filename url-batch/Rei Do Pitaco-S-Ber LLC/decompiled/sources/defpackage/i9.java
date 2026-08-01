package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class i9 extends at implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public ht C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;
    public final Context g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final Handler l;
    public View t;
    public View u;
    public int v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final v4 o = new v4(2, this);
    public final f9 p = new f9(0, this);
    public final j0 q = new j0(8, this);
    public int r = 0;
    public int s = 0;
    public boolean A = false;

    public i9(Context context, View view, int i, int i2, boolean z) {
        this.g = context;
        this.t = view;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = new Handler();
    }

    @Override // defpackage.jt
    public final void a(ss ssVar, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ssVar == ((h9) arrayList.get(i)).b) {
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
            ((h9) arrayList.get(i2)).b.c(false);
        }
        h9 h9Var = (h9) arrayList.remove(i);
        ss ssVar2 = h9Var.b;
        gt gtVar = h9Var.a;
        n4 n4Var = gtVar.E;
        ssVar2.r(this);
        if (this.F) {
            dt.b(n4Var, null);
            n4Var.setAnimationStyle(0);
        }
        gtVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.v = ((h9) arrayList.get(size2 - 1)).c;
        } else {
            this.v = this.t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((h9) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        ht htVar = this.C;
        if (htVar != null) {
            htVar.a(ssVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.o);
            }
            this.D = null;
        }
        this.u.removeOnAttachStateChangeListener(this.p);
        this.E.onDismiss();
    }

    @Override // defpackage.b20
    public final boolean b() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((h9) arrayList.get(0)).a.E.isShowing();
    }

    @Override // defpackage.b20
    public final void d() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w((ss) obj);
        }
        arrayList.clear();
        View view = this.t;
        this.u = view;
        if (view != null) {
            boolean z = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.o);
            }
            this.u.addOnAttachStateChangeListener(this.p);
        }
    }

    @Override // defpackage.b20
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            h9[] h9VarArr = (h9[]) arrayList.toArray(new h9[size]);
            for (int i = size - 1; i >= 0; i--) {
                h9 h9Var = h9VarArr[i];
                if (h9Var.a.E.isShowing()) {
                    h9Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.jt
    public final void f(ht htVar) {
        this.C = htVar;
    }

    @Override // defpackage.b20
    public final bg h() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h9) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.jt
    public final void j(boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((h9) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ps) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.jt
    public final boolean k(v30 v30Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h9 h9Var = (h9) obj;
            if (v30Var == h9Var.b) {
                h9Var.a.h.requestFocus();
                return true;
            }
        }
        if (!v30Var.hasVisibleItems()) {
            return false;
        }
        n(v30Var);
        ht htVar = this.C;
        if (htVar != null) {
            htVar.v(v30Var);
        }
        return true;
    }

    @Override // defpackage.jt
    public final boolean l() {
        return false;
    }

    @Override // defpackage.jt
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.at
    public final void n(ss ssVar) {
        ssVar.b(this, this.g);
        if (b()) {
            w(ssVar);
        } else {
            this.m.add(ssVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        h9 h9Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                h9Var = null;
                break;
            }
            h9Var = (h9) arrayList.get(i);
            if (!h9Var.a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (h9Var != null) {
            h9Var.b.c(false);
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

    @Override // defpackage.at
    public final void p(View view) {
        if (this.t != view) {
            this.t = view;
            this.s = Gravity.getAbsoluteGravity(this.r, view.getLayoutDirection());
        }
    }

    @Override // defpackage.at
    public final void q(boolean z) {
        this.A = z;
    }

    @Override // defpackage.at
    public final void r(int i) {
        if (this.r != i) {
            this.r = i;
            this.s = Gravity.getAbsoluteGravity(i, this.t.getLayoutDirection());
        }
    }

    @Override // defpackage.at
    public final void s(int i) {
        this.w = true;
        this.y = i;
    }

    @Override // defpackage.at
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // defpackage.at
    public final void u(boolean z) {
        this.B = z;
    }

    @Override // defpackage.at
    public final void v(int i) {
        this.x = true;
        this.z = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(ss ssVar) {
        boolean z;
        boolean z2;
        View view;
        h9 h9Var;
        int i;
        int i2;
        MenuItem menuItem;
        ps psVar;
        int i3;
        int firstVisiblePosition;
        Context context = this.g;
        ?? from = LayoutInflater.from(context);
        ps psVar2 = new ps(ssVar, from, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.A) {
            psVar2.c = true;
        } else if (b()) {
            int size = ssVar.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = ssVar.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            psVar2.c = z;
        }
        int o = at.o(psVar2, context, this.h);
        gt gtVar = new gt(context, null, this.i, this.j);
        gtVar.H = this.q;
        gtVar.u = this;
        n4 n4Var = gtVar.E;
        n4Var.setOnDismissListener(this);
        gtVar.t = this.t;
        gtVar.q = this.s;
        gtVar.D = true;
        n4Var.setFocusable(true);
        n4Var.setInputMethodMode(2);
        gtVar.q(psVar2);
        gtVar.r(o);
        gtVar.q = this.s;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            h9Var = (h9) arrayList.get(arrayList.size() - 1);
            ss ssVar2 = h9Var.b;
            int size2 = ssVar2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = ssVar2.getItem(i5);
                if (menuItem.hasSubMenu() && ssVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                bg bgVar = h9Var.a.h;
                ListAdapter adapter = bgVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    psVar = (ps) headerViewListAdapter.getWrappedAdapter();
                } else {
                    psVar = (ps) adapter;
                    i3 = 0;
                }
                int count = psVar.getCount();
                int i6 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (menuItem == psVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                view = (i6 != -1 && (firstVisiblePosition = (i6 + i3) - bgVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < bgVar.getChildCount()) ? bgVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z2 = 0;
            view = null;
            h9Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = gt.I;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(n4Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                et.a(n4Var, z2);
            }
            dt.a(n4Var, null);
            bg bgVar2 = ((h9) arrayList.get(arrayList.size() - 1)).a.h;
            int[] iArr = new int[2];
            bgVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.u.getWindowVisibleDisplayFrame(rect);
            if (this.v == 1) {
                if (bgVar2.getWidth() + iArr[0] + o > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.v = i;
                    gtVar.t = view;
                    if ((this.s & 5) == 5) {
                        i2 = 0;
                        o = z3 ? view.getWidth() : 0 - o;
                    } else if (z3) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        o = 0 - view.getWidth();
                    }
                    gtVar.k = o;
                    gtVar.p = true;
                    gtVar.o = true;
                    gtVar.k(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                gtVar.t = view;
                if ((this.s & 5) == 5) {
                }
                gtVar.k = o;
                gtVar.p = true;
                gtVar.o = true;
                gtVar.k(i2);
            } else {
                if (iArr[0] - o >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.v = i;
                    gtVar.t = view;
                    if ((this.s & 5) == 5) {
                    }
                    gtVar.k = o;
                    gtVar.p = true;
                    gtVar.o = true;
                    gtVar.k(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                gtVar.t = view;
                if ((this.s & 5) == 5) {
                }
                gtVar.k = o;
                gtVar.p = true;
                gtVar.o = true;
                gtVar.k(i2);
            }
        } else {
            if (this.w) {
                gtVar.k = this.y;
            }
            if (this.x) {
                gtVar.k(this.z);
            }
            Rect rect2 = this.f;
            gtVar.C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new h9(gtVar, ssVar, this.v));
        gtVar.d();
        bg bgVar3 = gtVar.h;
        bgVar3.setOnKeyListener(this);
        if (h9Var == null && this.B && ssVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, bgVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(ssVar.m);
            bgVar3.addHeaderView(frameLayout, null, false);
            gtVar.d();
        }
    }

    @Override // defpackage.jt
    public final void e(Parcelable parcelable) {
    }
}
