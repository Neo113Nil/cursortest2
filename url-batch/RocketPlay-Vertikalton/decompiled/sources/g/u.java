package g;

import K.C0010c0;
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
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.R;
import j.AbstractC0175a;
import j.C0177c;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class u implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f2692a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2693b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2694c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f2695e;

    public u(z zVar, Window.Callback callback) {
        this.f2695e = zVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2692a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f2693b = true;
            callback.onContentChanged();
        } finally {
            this.f2693b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f2692a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f2692a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        j.l.a(this.f2692a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2692a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f2694c;
        Window.Callback callback = this.f2692a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f2695e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        MenuC0202m menuC0202m;
        boolean performShortcut;
        if (this.f2692a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        z zVar = this.f2695e;
        zVar.z();
        J j2 = zVar.f2752o;
        if (j2 != null) {
            I i = j2.f2613l;
            if (i == null || (menuC0202m = i.d) == null) {
                performShortcut = false;
            } else {
                menuC0202m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0202m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        y yVar = zVar.f2726M;
        if (yVar == null || !zVar.E(yVar, keyEvent.getKeyCode(), keyEvent)) {
            if (zVar.f2726M == null) {
                y y2 = zVar.y(0);
                zVar.F(y2, keyEvent);
                boolean E2 = zVar.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f2706k = false;
            }
            z2 = false;
            return !z2;
        }
        y yVar2 = zVar.f2726M;
        if (yVar2 != null) {
            yVar2.f2707l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2692a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2692a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2692a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2692a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2692a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2692a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2693b) {
            this.f2692a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0202m)) {
            return this.f2692a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2692a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2692a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2692a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        z zVar = this.f2695e;
        if (i == 108) {
            zVar.z();
            J j2 = zVar.f2752o;
            if (j2 != null && true != j2.f2616o) {
                j2.f2616o = true;
                ArrayList arrayList = j2.f2617p;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            zVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.f2692a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        z zVar = this.f2695e;
        if (i != 108) {
            if (i != 0) {
                zVar.getClass();
                return;
            }
            y y2 = zVar.y(i);
            if (y2.f2708m) {
                zVar.r(y2, false);
                return;
            }
            return;
        }
        zVar.z();
        J j2 = zVar.f2752o;
        if (j2 == null || !j2.f2616o) {
            return;
        }
        j2.f2616o = false;
        ArrayList arrayList = j2.f2617p;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        j.m.a(this.f2692a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0202m menuC0202m = menu instanceof MenuC0202m ? (MenuC0202m) menu : null;
        if (i == 0 && menuC0202m == null) {
            return false;
        }
        if (menuC0202m != null) {
            menuC0202m.f3207x = true;
        }
        boolean onPreparePanel = this.f2692a.onPreparePanel(i, view, menu);
        if (menuC0202m != null) {
            menuC0202m.f3207x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0202m menuC0202m = this.f2695e.y(0).h;
        if (menuC0202m != null) {
            d(list, menuC0202m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.k.a(this.f2692a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2692a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f2692a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        int i2 = 1;
        z zVar = this.f2695e;
        zVar.getClass();
        if (i != 0) {
            return j.k.b(this.f2692a, callback, i);
        }
        Context context = zVar.f2748k;
        U.v vVar = new U.v();
        vVar.f1208b = context;
        vVar.f1207a = callback;
        vVar.f1209c = new ArrayList();
        vVar.d = new o.k();
        AbstractC0175a abstractC0175a = zVar.f2758u;
        if (abstractC0175a != null) {
            abstractC0175a.a();
        }
        B.j jVar = new B.j(zVar, vVar);
        zVar.z();
        J j2 = zVar.f2752o;
        if (j2 != null) {
            I i3 = j2.f2613l;
            if (i3 != null) {
                i3.a();
            }
            j2.f2609f.setHideOnContentScrollEnabled(false);
            j2.i.e();
            I i4 = new I(j2, j2.i.getContext(), jVar);
            MenuC0202m menuC0202m = i4.d;
            menuC0202m.w();
            try {
                if (((U.v) i4.f2602e.f72b).q(i4, menuC0202m)) {
                    j2.f2613l = i4;
                    i4.i();
                    j2.i.c(i4);
                    j2.w(true);
                } else {
                    i4 = null;
                }
                zVar.f2758u = i4;
            } finally {
                menuC0202m.v();
            }
        }
        if (zVar.f2758u == null) {
            C0010c0 c0010c0 = zVar.f2762y;
            if (c0010c0 != null) {
                c0010c0.b();
            }
            AbstractC0175a abstractC0175a2 = zVar.f2758u;
            if (abstractC0175a2 != null) {
                abstractC0175a2.a();
            }
            if (zVar.f2759v == null) {
                boolean z2 = zVar.f2722I;
                Context context2 = zVar.f2748k;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0177c c0177c = new C0177c(context2, 0);
                        c0177c.getTheme().setTo(newTheme);
                        context2 = c0177c;
                    }
                    zVar.f2759v = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    zVar.f2760w = popupWindow;
                    Q.l.d(popupWindow, 2);
                    zVar.f2760w.setContentView(zVar.f2759v);
                    zVar.f2760w.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    zVar.f2759v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    zVar.f2760w.setHeight(-2);
                    zVar.f2761x = new o(zVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) zVar.f2715A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        zVar.z();
                        J j3 = zVar.f2752o;
                        Context x2 = j3 != null ? j3.x() : null;
                        if (x2 != null) {
                            context2 = x2;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        zVar.f2759v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (zVar.f2759v != null) {
                C0010c0 c0010c02 = zVar.f2762y;
                if (c0010c02 != null) {
                    c0010c02.b();
                }
                zVar.f2759v.e();
                Context context3 = zVar.f2759v.getContext();
                ActionBarContextView actionBarContextView = zVar.f2759v;
                j.d dVar = new j.d();
                dVar.f3060c = context3;
                dVar.d = actionBarContextView;
                dVar.f3061e = jVar;
                MenuC0202m menuC0202m2 = new MenuC0202m(actionBarContextView.getContext());
                menuC0202m2.f3195l = 1;
                dVar.h = menuC0202m2;
                menuC0202m2.f3190e = dVar;
                if (((U.v) jVar.f72b).q(dVar, menuC0202m2)) {
                    dVar.i();
                    zVar.f2759v.c(dVar);
                    zVar.f2758u = dVar;
                    if (zVar.f2763z && (viewGroup = zVar.f2715A) != null && viewGroup.isLaidOut()) {
                        zVar.f2759v.setAlpha(RecyclerView.f1949A0);
                        C0010c0 a2 = T.a(zVar.f2759v);
                        a2.a(1.0f);
                        zVar.f2762y = a2;
                        a2.d(new q(i2, zVar));
                    } else {
                        zVar.f2759v.setAlpha(1.0f);
                        zVar.f2759v.setVisibility(0);
                        if (zVar.f2759v.getParent() instanceof View) {
                            View view = (View) zVar.f2759v.getParent();
                            WeakHashMap weakHashMap = T.f633a;
                            K.F.c(view);
                        }
                    }
                    if (zVar.f2760w != null) {
                        zVar.f2749l.getDecorView().post(zVar.f2761x);
                    }
                } else {
                    zVar.f2758u = null;
                }
            }
            zVar.H();
            zVar.f2758u = zVar.f2758u;
        }
        zVar.H();
        AbstractC0175a abstractC0175a3 = zVar.f2758u;
        if (abstractC0175a3 != null) {
            return vVar.g(abstractC0175a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2692a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
