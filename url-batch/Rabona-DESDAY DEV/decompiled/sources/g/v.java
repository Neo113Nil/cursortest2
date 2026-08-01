package g;

import K.C0001a0;
import K.T;
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
import com.linetic.luckycross.R;
import j.AbstractC0138a;
import j.C0140c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0158m;

/* loaded from: classes.dex */
public final class v implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2345a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2346b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2347c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0110A f2348e;

    public v(LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A, Window.Callback callback) {
        this.f2348e = layoutInflaterFactory2C0110A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2345a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2346b = true;
            callback.onContentChanged();
        } finally {
            this.f2346b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2345a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2345a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2345a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2345a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2347c;
        Window.Callback callback = this.f2345a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2348e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0158m menuC0158m;
        boolean performShortcut;
        if (this.f2345a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2348e;
        layoutInflaterFactory2C0110A.z();
        K k2 = layoutInflaterFactory2C0110A.f2232o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 == null || (menuC0158m = j2.d) == null) {
                performShortcut = false;
            } else {
                menuC0158m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0158m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        z zVar = layoutInflaterFactory2C0110A.f2206N;
        if (zVar == null || !layoutInflaterFactory2C0110A.E(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0110A.f2206N == null) {
                z y2 = layoutInflaterFactory2C0110A.y(0);
                layoutInflaterFactory2C0110A.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0110A.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2359k = false;
            }
            z2 = false;
            return !z2;
        }
        z zVar2 = layoutInflaterFactory2C0110A.f2206N;
        if (zVar2 != null) {
            zVar2.f2360l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2345a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2345a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2345a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2345a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2345a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2345a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2346b) {
            this.f2345a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0158m)) {
            return this.f2345a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2345a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2345a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2345a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2348e;
        if (i == 108) {
            layoutInflaterFactory2C0110A.z();
            K k2 = layoutInflaterFactory2C0110A.f2232o;
            if (k2 != null && true != k2.f2276l) {
                k2.f2276l = true;
                ArrayList arrayList = k2.f2277m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0110A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2345a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2348e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0110A.getClass();
                return;
            }
            z y2 = layoutInflaterFactory2C0110A.y(i);
            if (y2.f2361m) {
                layoutInflaterFactory2C0110A.r(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0110A.z();
        K k2 = layoutInflaterFactory2C0110A.f2232o;
        if (k2 == null || !k2.f2276l) {
            return;
        }
        k2.f2276l = false;
        ArrayList arrayList = k2.f2277m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2345a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0158m menuC0158m = menu instanceof MenuC0158m ? (MenuC0158m) menu : null;
        if (i == 0 && menuC0158m == null) {
            return false;
        }
        if (menuC0158m != null) {
            menuC0158m.f2708x = true;
        }
        boolean onPreparePanel = this.f2345a.onPreparePanel(i, view, menu);
        if (menuC0158m != null) {
            menuC0158m.f2708x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0158m menuC0158m = this.f2348e.y(0).h;
        if (menuC0158m != null) {
            d(list, menuC0158m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2345a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2345a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2345a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2348e;
        if (!layoutInflaterFactory2C0110A.f2243z || i != 0) {
            return j.k.b(this.f2345a, callback, i);
        }
        Context context = layoutInflaterFactory2C0110A.f2228k;
        T.u uVar = new T.u();
        uVar.f753b = context;
        uVar.f752a = callback;
        uVar.f754c = new ArrayList();
        uVar.d = new o.k();
        AbstractC0138a abstractC0138a = layoutInflaterFactory2C0110A.f2238u;
        if (abstractC0138a != null) {
            abstractC0138a.a();
        }
        B.j jVar = new B.j(layoutInflaterFactory2C0110A, uVar);
        layoutInflaterFactory2C0110A.z();
        K k2 = layoutInflaterFactory2C0110A.f2232o;
        if (k2 != null) {
            J j2 = k2.i;
            if (j2 != null) {
                j2.a();
            }
            k2.f2270c.setHideOnContentScrollEnabled(false);
            k2.f2272f.e();
            J j3 = new J(k2, k2.f2272f.getContext(), jVar);
            MenuC0158m menuC0158m = j3.d;
            menuC0158m.w();
            try {
                if (((T.u) j3.f2263e.f30b).q(j3, menuC0158m)) {
                    k2.i = j3;
                    j3.i();
                    k2.f2272f.c(j3);
                    k2.d0(true);
                } else {
                    j3 = null;
                }
                layoutInflaterFactory2C0110A.f2238u = j3;
            } finally {
                menuC0158m.v();
            }
        }
        if (layoutInflaterFactory2C0110A.f2238u == null) {
            C0001a0 c0001a0 = layoutInflaterFactory2C0110A.f2242y;
            if (c0001a0 != null) {
                c0001a0.b();
            }
            AbstractC0138a abstractC0138a2 = layoutInflaterFactory2C0110A.f2238u;
            if (abstractC0138a2 != null) {
                abstractC0138a2.a();
            }
            if (layoutInflaterFactory2C0110A.f2239v == null) {
                boolean z2 = layoutInflaterFactory2C0110A.f2202J;
                Context context2 = layoutInflaterFactory2C0110A.f2228k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0140c c0140c = new C0140c(context2, 0);
                        c0140c.getTheme().setTo(newTheme);
                        context2 = c0140c;
                    }
                    layoutInflaterFactory2C0110A.f2239v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0110A.f2240w = popupWindow;
                    Q.m.d(popupWindow, 2);
                    layoutInflaterFactory2C0110A.f2240w.setContentView(layoutInflaterFactory2C0110A.f2239v);
                    layoutInflaterFactory2C0110A.f2240w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0110A.f2239v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0110A.f2240w.setHeight(-2);
                    layoutInflaterFactory2C0110A.f2241x = new p(layoutInflaterFactory2C0110A, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0110A.f2195B.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0110A.z();
                        K k3 = layoutInflaterFactory2C0110A.f2232o;
                        Context e02 = k3 != null ? k3.e0() : null;
                        if (e02 != null) {
                            context2 = e02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflaterFactory2C0110A.f2239v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0110A.f2239v != null) {
                C0001a0 c0001a02 = layoutInflaterFactory2C0110A.f2242y;
                if (c0001a02 != null) {
                    c0001a02.b();
                }
                layoutInflaterFactory2C0110A.f2239v.e();
                Context context3 = layoutInflaterFactory2C0110A.f2239v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0110A.f2239v;
                j.d dVar = new j.d();
                dVar.f2554c = context3;
                dVar.d = actionBarContextView;
                dVar.f2555e = jVar;
                MenuC0158m menuC0158m2 = new MenuC0158m(actionBarContextView.getContext());
                menuC0158m2.f2696l = 1;
                dVar.h = menuC0158m2;
                menuC0158m2.f2691e = dVar;
                if (((T.u) jVar.f30b).q(dVar, menuC0158m2)) {
                    dVar.i();
                    layoutInflaterFactory2C0110A.f2239v.c(dVar);
                    layoutInflaterFactory2C0110A.f2238u = dVar;
                    if (layoutInflaterFactory2C0110A.f2194A && (viewGroup = layoutInflaterFactory2C0110A.f2195B) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0110A.f2239v.setAlpha(0.0f);
                        C0001a0 a2 = T.a(layoutInflaterFactory2C0110A.f2239v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0110A.f2242y = a2;
                        a2.d(new r(i2, layoutInflaterFactory2C0110A));
                    } else {
                        layoutInflaterFactory2C0110A.f2239v.setAlpha(1.0f);
                        layoutInflaterFactory2C0110A.f2239v.setVisibility(0);
                        if (layoutInflaterFactory2C0110A.f2239v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0110A.f2239v.getParent();
                            WeakHashMap weakHashMap = T.f381a;
                            K.F.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0110A.f2240w != null) {
                        layoutInflaterFactory2C0110A.f2229l.getDecorView().post(layoutInflaterFactory2C0110A.f2241x);
                    }
                } else {
                    layoutInflaterFactory2C0110A.f2238u = null;
                }
            }
            layoutInflaterFactory2C0110A.H();
            layoutInflaterFactory2C0110A.f2238u = layoutInflaterFactory2C0110A.f2238u;
        }
        layoutInflaterFactory2C0110A.H();
        AbstractC0138a abstractC0138a3 = layoutInflaterFactory2C0110A.f2238u;
        if (abstractC0138a3 != null) {
            return uVar.g(abstractC0138a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2345a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
