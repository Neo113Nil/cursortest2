package K;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.fortuneodd.shadegrid.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0258x;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f360a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f361b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f362c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final A f363e = new A();

    /* renamed from: f, reason: collision with root package name */
    public static final C f364f = new C();

    public static Z a(View view) {
        if (f360a == null) {
            f360a = new WeakHashMap();
        }
        Z z2 = (Z) f360a.get(view);
        if (z2 != null) {
            return z2;
        }
        Z z3 = new Z(view);
        f360a.put(view, z3);
        return z3;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = Q.d;
        Q q2 = (Q) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (q2 == null) {
            q2 = new Q();
            q2.f357a = null;
            q2.f358b = null;
            q2.f359c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, q2);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = q2.f357a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = Q.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (q2.f357a == null) {
                            q2.f357a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = Q.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                q2.f357a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    q2.f357a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = q2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (q2.f358b == null) {
                    q2.f358b = new SparseArray();
                }
                q2.f358b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return L.a(view);
        }
        if (f362c) {
            return null;
        }
        if (f361b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f361b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f362c = true;
                return null;
            }
        }
        try {
            Object obj = f361b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f362c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = K.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(C0258x c0258x) {
        return Build.VERSION.SDK_INT >= 31 ? N.a(c0258x) : (String[]) c0258x.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z2) {
                    obtain.getText().add(d(view));
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
            obtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0005f h(View view, C0005f c0005f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0005f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return N.b(view, c0005f);
        }
        InterfaceC0017s interfaceC0017s = (InterfaceC0017s) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0018t interfaceC0018t = f363e;
        if (interfaceC0017s == null) {
            if (view instanceof InterfaceC0018t) {
                interfaceC0018t = (InterfaceC0018t) view;
            }
            return interfaceC0018t.a(c0005f);
        }
        C0005f a2 = ((Q.s) interfaceC0017s).a(view, c0005f);
        if (a2 == null) {
            return null;
        }
        if (view instanceof InterfaceC0018t) {
            interfaceC0018t = (InterfaceC0018t) view;
        }
        return interfaceC0018t.a(a2);
    }

    public static void i(View view, int i) {
        ArrayList e2 = e(view);
        for (int i2 = 0; i2 < e2.size(); i2++) {
            if (((L.e) e2.get(i2)).a() == i) {
                e2.remove(i2);
                return;
            }
        }
    }

    public static void j(View view, L.e eVar, L.s sVar) {
        L.e eVar2 = new L.e(null, eVar.f479b, null, sVar, eVar.f480c);
        View.AccessibilityDelegate c2 = c(view);
        C0001b c0001b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f370a : new C0001b(c2);
        if (c0001b == null) {
            c0001b = new C0001b();
        }
        l(view, c0001b);
        i(view, eVar2.a());
        e(view).add(eVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            L.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, C0001b c0001b) {
        if (c0001b == null && (c(view) instanceof C0000a)) {
            c0001b = new C0001b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0001b == null ? null : c0001b.f373b);
    }

    public static void m(View view, CharSequence charSequence) {
        new B(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        C c2 = f364f;
        if (charSequence == null) {
            c2.f349a.remove(view);
            view.removeOnAttachStateChangeListener(c2);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(c2);
        } else {
            c2.f349a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(c2);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(c2);
            }
        }
    }
}
