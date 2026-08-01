package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.ionia.reidopitaco.libya.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class f80 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final s70 e = new s70();
    public static final u70 f = new u70();

    public static v80 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        v80 v80Var = (v80) a.get(view);
        if (v80Var != null) {
            return v80Var;
        }
        v80 v80Var2 = new v80(view);
        a.put(view, v80Var2);
        return v80Var2;
    }

    public static void b(View view, db0 db0Var) {
        WindowInsets f2 = db0Var.f();
        if (f2 != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? c80.a(view, f2) : v70.a(view, f2);
            if (a2.equals(f2)) {
                return;
            }
            db0.g(view, a2);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = e80.d;
        e80 e80Var = (e80) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (e80Var == null) {
            e80Var = new e80();
            e80Var.a = null;
            e80Var.b = null;
            e80Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, e80Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = e80Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = e80.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (e80Var.a == null) {
                            e80Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = e80.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                e80Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    e80Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = e80Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (e80Var.b == null) {
                    e80Var.b = new SparseArray();
                }
                e80Var.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b80.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = a80.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(h4 h4Var) {
        return Build.VERSION.SDK_INT >= 31 ? d80.a(h4Var) : (String[]) h4Var.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bd i(View view, bd bdVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + bdVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return d80.b(view, bdVar);
        }
        z40 z40Var = (z40) view.getTag(R.id.tag_on_receive_content_listener);
        sv svVar = e;
        if (z40Var == null) {
            if (view instanceof sv) {
                svVar = (sv) view;
            }
            return svVar.a(bdVar);
        }
        bd a2 = z40.a(view, bdVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof sv) {
            svVar = (sv) view;
        }
        return svVar.a(a2);
    }

    public static void j(View view, int i) {
        ArrayList f2 = f(view);
        for (int i2 = 0; i2 < f2.size(); i2++) {
            if (((d0) f2.get(i2)).a() == i) {
                f2.remove(i2);
                return;
            }
        }
    }

    public static void k(View view, d0 d0Var, t0 t0Var) {
        d0 d0Var2 = new d0(null, d0Var.b, null, t0Var, d0Var.c);
        View.AccessibilityDelegate d2 = d(view);
        x xVar = d2 == null ? null : d2 instanceof w ? ((w) d2).a : new x(d2);
        if (xVar == null) {
            xVar = new x();
        }
        m(view, xVar);
        j(view, d0Var2.a());
        f(view).add(d0Var2);
        h(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            b80.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void m(View view, x xVar) {
        if (xVar == null && (d(view) instanceof w)) {
            xVar = new x();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(xVar == null ? null : xVar.b);
    }

    public static void n(View view, CharSequence charSequence) {
        new t70(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        u70 u70Var = f;
        if (charSequence == null) {
            u70Var.f.remove(view);
            view.removeOnAttachStateChangeListener(u70Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(u70Var);
        } else {
            u70Var.f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(u70Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(u70Var);
            }
        }
    }

    public static void o(View view, qd qdVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new ga0(qdVar));
            return;
        }
        PathInterpolator pathInterpolator = fa0.e;
        View.OnApplyWindowInsetsListener ea0Var = new ea0(view, qdVar);
        view.setTag(R.id.tag_window_insets_animation_callback, ea0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(ea0Var);
        }
    }
}
