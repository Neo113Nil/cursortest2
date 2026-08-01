package g;

import K.T;
import K.c0;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;
import j.AbstractC0144a;
import j.C0146c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0164m;

/* loaded from: classes.dex */
public final class t implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2252a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2253b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2254c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f2255e;

    public t(y yVar, Window.Callback callback) {
        this.f2255e = yVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2252a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2253b = true;
            callback.onContentChanged();
        } finally {
            this.f2253b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2252a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2252a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2252a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2252a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2254c;
        Window.Callback callback = this.f2252a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2255e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z2;
        MenuC0164m menuC0164m;
        boolean performShortcut;
        if (this.f2252a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        y yVar = this.f2255e;
        yVar.z();
        I i = yVar.f2313o;
        if (i != null) {
            C0099H c0099h = i.i;
            if (c0099h == null || (menuC0164m = c0099h.d) == null) {
                performShortcut = false;
            } else {
                menuC0164m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0164m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        x xVar = yVar.f2287N;
        if (xVar == null || !yVar.E(xVar, keyEvent.getKeyCode(), keyEvent)) {
            if (yVar.f2287N == null) {
                x y2 = yVar.y(0);
                yVar.F(y2, keyEvent);
                boolean E2 = yVar.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2266k = false;
            }
            z2 = false;
            return !z2;
        }
        x xVar2 = yVar.f2287N;
        if (xVar2 != null) {
            xVar2.f2267l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2252a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2252a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2252a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2252a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2252a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2252a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2253b) {
            this.f2252a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0164m)) {
            return this.f2252a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2252a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2252a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2252a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        y yVar = this.f2255e;
        if (i == 108) {
            yVar.z();
            I i2 = yVar.f2313o;
            if (i2 != null && true != i2.f2192l) {
                i2.f2192l = true;
                ArrayList arrayList = i2.f2193m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            yVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2252a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        y yVar = this.f2255e;
        if (i != 108) {
            if (i != 0) {
                yVar.getClass();
                return;
            }
            x y2 = yVar.y(i);
            if (y2.f2268m) {
                yVar.r(y2, false);
                return;
            }
            return;
        }
        yVar.z();
        I i2 = yVar.f2313o;
        if (i2 == null || !i2.f2192l) {
            return;
        }
        i2.f2192l = false;
        ArrayList arrayList = i2.f2193m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2252a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0164m menuC0164m = menu instanceof MenuC0164m ? (MenuC0164m) menu : null;
        if (i == 0 && menuC0164m == null) {
            return false;
        }
        if (menuC0164m != null) {
            menuC0164m.f2776x = true;
        }
        boolean onPreparePanel = this.f2252a.onPreparePanel(i, view, menu);
        if (menuC0164m != null) {
            menuC0164m.f2776x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0164m menuC0164m = this.f2255e.y(0).h;
        if (menuC0164m != null) {
            d(list, menuC0164m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2252a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2252a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2252a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        y yVar = this.f2255e;
        if (!yVar.f2324z || i != 0) {
            return j.k.b(this.f2252a, callback, i);
        }
        U.v vVar = new U.v(yVar.f2309k, callback);
        AbstractC0144a abstractC0144a = yVar.f2319u;
        if (abstractC0144a != null) {
            abstractC0144a.a();
        }
        B.j jVar = new B.j(yVar, vVar);
        yVar.z();
        I i3 = yVar.f2313o;
        if (i3 != null) {
            C0099H c0099h = i3.i;
            if (c0099h != null) {
                c0099h.a();
            }
            i3.f2186c.setHideOnContentScrollEnabled(false);
            i3.f2188f.e();
            C0099H c0099h2 = new C0099H(i3, i3.f2188f.getContext(), jVar);
            MenuC0164m menuC0164m = c0099h2.d;
            menuC0164m.w();
            try {
                if (((U.v) c0099h2.f2179e.f56b).m(c0099h2, menuC0164m)) {
                    i3.i = c0099h2;
                    c0099h2.g();
                    i3.f2188f.c(c0099h2);
                    i3.Z(true);
                } else {
                    c0099h2 = null;
                }
                yVar.f2319u = c0099h2;
            } finally {
                menuC0164m.v();
            }
        }
        if (yVar.f2319u == null) {
            c0 c0Var = yVar.f2323y;
            if (c0Var != null) {
                c0Var.b();
            }
            AbstractC0144a abstractC0144a2 = yVar.f2319u;
            if (abstractC0144a2 != null) {
                abstractC0144a2.a();
            }
            if (yVar.f2320v == null) {
                boolean z2 = yVar.f2283J;
                Context context = yVar.f2309k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0146c c0146c = new C0146c(context, 0);
                        c0146c.getTheme().setTo(newTheme);
                        context = c0146c;
                    }
                    yVar.f2320v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    yVar.f2321w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    yVar.f2321w.setContentView(yVar.f2320v);
                    yVar.f2321w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    yVar.f2320v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    yVar.f2321w.setHeight(-2);
                    yVar.f2322x = new n(yVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) yVar.f2276B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        yVar.z();
                        I i4 = yVar.f2313o;
                        Context a02 = i4 != null ? i4.a0() : null;
                        if (a02 != null) {
                            context = a02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        yVar.f2320v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (yVar.f2320v != null) {
                c0 c0Var2 = yVar.f2323y;
                if (c0Var2 != null) {
                    c0Var2.b();
                }
                yVar.f2320v.e();
                Context context2 = yVar.f2320v.getContext();
                ActionBarContextView actionBarContextView = yVar.f2320v;
                j.d dVar = new j.d();
                dVar.f2629c = context2;
                dVar.d = actionBarContextView;
                dVar.f2630e = jVar;
                MenuC0164m menuC0164m2 = new MenuC0164m(actionBarContextView.getContext());
                menuC0164m2.f2764l = 1;
                dVar.h = menuC0164m2;
                menuC0164m2.f2759e = dVar;
                if (((U.v) jVar.f56b).m(dVar, menuC0164m2)) {
                    dVar.g();
                    yVar.f2320v.c(dVar);
                    yVar.f2319u = dVar;
                    if (yVar.f2275A && (viewGroup = yVar.f2276B) != null && viewGroup.isLaidOut()) {
                        yVar.f2320v.setAlpha(RecyclerView.f1570A0);
                        c0 a2 = T.a(yVar.f2320v);
                        a2.a(1.0f);
                        yVar.f2323y = a2;
                        a2.d(new p(i2, yVar));
                    } else {
                        yVar.f2320v.setAlpha(1.0f);
                        yVar.f2320v.setVisibility(0);
                        if (yVar.f2320v.getParent() instanceof View) {
                            View view = (View) yVar.f2320v.getParent();
                            WeakHashMap weakHashMap = T.f372a;
                            K.F.c(view);
                        }
                    }
                    if (yVar.f2321w != null) {
                        yVar.f2310l.getDecorView().post(yVar.f2322x);
                    }
                } else {
                    yVar.f2319u = null;
                }
            }
            yVar.H();
            yVar.f2319u = yVar.f2319u;
        }
        yVar.H();
        AbstractC0144a abstractC0144a3 = yVar.f2319u;
        if (abstractC0144a3 != null) {
            return vVar.e(abstractC0144a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2252a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
