package g;

import K.S;
import K.Z;
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
import com.fortuneodd.shadegrid.R;
import j.AbstractC0148a;
import j.C0150c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0168m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2348a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2350c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0122A f2351e;

    public v(LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A, Window.Callback callback) {
        this.f2351e = layoutInflaterFactory2C0122A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2348a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2349b = true;
            callback.onContentChanged();
        } finally {
            this.f2349b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2348a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2348a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2348a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2348a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2350c;
        Window.Callback callback = this.f2348a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2351e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0168m menuC0168m;
        boolean performShortcut;
        if (this.f2348a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = this.f2351e;
        layoutInflaterFactory2C0122A.z();
        K k2 = layoutInflaterFactory2C0122A.f2234o;
        if (k2 != null) {
            J j2 = k2.f2278m;
            if (j2 == null || (menuC0168m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0168m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0168m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0122A.f2208N;
        if (zVar == null || !layoutInflaterFactory2C0122A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0122A.f2208N == null) {
                z y2 = layoutInflaterFactory2C0122A.y(0);
                layoutInflaterFactory2C0122A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0122A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2362k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0122A.f2208N;
        if (zVar2 != null) {
            zVar2.f2363l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2348a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2348a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2348a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2348a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2348a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2348a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2349b) {
            this.f2348a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0168m)) {
            return this.f2348a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2348a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2348a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2348a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = this.f2351e;
        if (i == 108) {
            layoutInflaterFactory2C0122A.z();
            K k2 = layoutInflaterFactory2C0122A.f2234o;
            if (k2 != null && true != k2.f2281p) {
                k2.f2281p = true;
                ArrayList arrayList = k2.f2282q;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0122A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2348a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = this.f2351e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0122A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0122A.y(i);
            if (y2.f2364m) {
                layoutInflaterFactory2C0122A.r(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0122A.z();
        K k2 = layoutInflaterFactory2C0122A.f2234o;
        if (k2 == null || !k2.f2281p) {
            return;
        }
        k2.f2281p = false;
        ArrayList arrayList = k2.f2282q;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2348a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0168m menuC0168m = menu instanceof MenuC0168m ? (MenuC0168m) menu : null;
        if (i == 0 && menuC0168m == null) {
            return false;
        }
        if (menuC0168m != null) {
            menuC0168m.f2711x = true;
        }
        boolean onPreparePanel = this.f2348a.onPreparePanel(i, view, menu);
        if (menuC0168m != null) {
            menuC0168m.f2711x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0168m menuC0168m = this.f2351e.y(0).h;
        if (menuC0168m != null) {
            d(list, menuC0168m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2348a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2348a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2348a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = this.f2351e;
        if (!layoutInflaterFactory2C0122A.f2245z || i != 0) {
            return j.k.b(this.f2348a, callback, i);
        }
        Context context = layoutInflaterFactory2C0122A.f2230k;
        T.u uVar = new T.u();
        uVar.f751b = context;
        uVar.f750a = callback;
        uVar.f752c = new ArrayList();
        uVar.d = new o.k();
        AbstractC0148a abstractC0148a = layoutInflaterFactory2C0122A.f2240u;
        if (abstractC0148a != null) {
            abstractC0148a.a();
        }
        B.j jVar = new B.j(layoutInflaterFactory2C0122A, uVar);
        layoutInflaterFactory2C0122A.z();
        K k2 = layoutInflaterFactory2C0122A.f2234o;
        if (k2 != null) {
            J j2 = k2.f2278m;
            if (j2 != null) {
                j2.a();
            }
            k2.f2274g.setHideOnContentScrollEnabled(false);
            k2.f2275j.e();
            J j3 = new J(k2, k2.f2275j.getContext(), jVar);
            MenuC0168m menuC0168m = j3.d;
            menuC0168m.w();
            try {
                if (((T.u) j3.f2265e.f28b).q(j3, menuC0168m)) {
                    k2.f2278m = j3;
                    j3.i();
                    k2.f2275j.c(j3);
                    k2.b0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0122A.f2240u = j3;
            } finally {
                menuC0168m.v();
            }
        }
        if (layoutInflaterFactory2C0122A.f2240u == null) {
            Z z2 = layoutInflaterFactory2C0122A.f2244y;
            if (z2 != null) {
                z2.b();
            }
            AbstractC0148a abstractC0148a2 = layoutInflaterFactory2C0122A.f2240u;
            if (abstractC0148a2 != null) {
                abstractC0148a2.a();
            }
            if (layoutInflaterFactory2C0122A.f2241v == null) {
                boolean z3 = layoutInflaterFactory2C0122A.f2204J;
                Context context2 = layoutInflaterFactory2C0122A.f2230k;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0150c c0150c = new C0150c(context2, 0);
                        c0150c.getTheme().setTo(newTheme);
                        context2 = c0150c;
                    }
                    layoutInflaterFactory2C0122A.f2241v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0122A.f2242w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    layoutInflaterFactory2C0122A.f2242w.setContentView(layoutInflaterFactory2C0122A.f2241v);
                    layoutInflaterFactory2C0122A.f2242w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0122A.f2241v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0122A.f2242w.setHeight(-2);
                    layoutInflaterFactory2C0122A.f2243x = new p(layoutInflaterFactory2C0122A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0122A.f2197B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0122A.z();
                        K k3 = layoutInflaterFactory2C0122A.f2234o;
                        Context c02 = k3 != null ? k3.c0() : null;
                        if (c02 != null) {
                            context2 = c02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0122A.f2241v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0122A.f2241v != null) {
                Z z4 = layoutInflaterFactory2C0122A.f2244y;
                if (z4 != null) {
                    z4.b();
                }
                layoutInflaterFactory2C0122A.f2241v.e();
                Context context3 = layoutInflaterFactory2C0122A.f2241v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0122A.f2241v;
                j.d dVar = new j.d();
                dVar.f2557c = context3;
                dVar.d = actionBarContextView;
                dVar.f2558e = jVar;
                MenuC0168m menuC0168m2 = new MenuC0168m(actionBarContextView.getContext());
                menuC0168m2.f2699l = 1;
                dVar.h = menuC0168m2;
                menuC0168m2.f2694e = dVar;
                if (((T.u) jVar.f28b).q(dVar, menuC0168m2)) {
                    dVar.i();
                    layoutInflaterFactory2C0122A.f2241v.c(dVar);
                    layoutInflaterFactory2C0122A.f2240u = dVar;
                    if (layoutInflaterFactory2C0122A.f2196A && (viewGroup = layoutInflaterFactory2C0122A.f2197B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0122A.f2241v.setAlpha(0.0f);
                        Z a2 = S.a(layoutInflaterFactory2C0122A.f2241v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0122A.f2244y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0122A));
                    } else {
                        layoutInflaterFactory2C0122A.f2241v.setAlpha(1.0f);
                        layoutInflaterFactory2C0122A.f2241v.setVisibility(0);
                        if (layoutInflaterFactory2C0122A.f2241v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0122A.f2241v.getParent();
                            WeakHashMap weakHashMap = S.f360a;
                            K.E.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0122A.f2242w != null) {
                        layoutInflaterFactory2C0122A.f2231l.getDecorView().post(layoutInflaterFactory2C0122A.f2243x);
                    }
                } else {
                    layoutInflaterFactory2C0122A.f2240u = null;
                }
            }
            layoutInflaterFactory2C0122A.H();
            layoutInflaterFactory2C0122A.f2240u = layoutInflaterFactory2C0122A.f2240u;
        }
        layoutInflaterFactory2C0122A.H();
        AbstractC0148a abstractC0148a3 = layoutInflaterFactory2C0122A.f2240u;
        if (abstractC0148a3 != null) {
            return uVar.g(abstractC0148a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2348a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
