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
import com.luckycounter.drinkwater.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.C0283w;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f633a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f634b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f635c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final B f636e = new B();

    /* renamed from: f, reason: collision with root package name */
    public static final D f637f = new D();

    public static C0010c0 a(View view) {
        if (f633a == null) {
            f633a = new WeakHashMap();
        }
        C0010c0 c0010c0 = (C0010c0) f633a.get(view);
        if (c0010c0 != null) {
            return c0010c0;
        }
        C0010c0 c0010c02 = new C0010c0(view);
        f633a.put(view, c0010c02);
        return c0010c02;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = S.d;
        S s2 = (S) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (s2 == null) {
            s2 = new S();
            s2.f630a = null;
            s2.f631b = null;
            s2.f632c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, s2);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = s2.f630a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = S.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (s2.f630a == null) {
                            s2.f630a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = S.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                s2.f630a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    s2.f630a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = s2.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (s2.f631b == null) {
                    s2.f631b = new SparseArray();
                }
                s2.f631b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return M.a(view);
        }
        if (f635c) {
            return null;
        }
        if (f634b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f634b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f635c = true;
                return null;
            }
        }
        try {
            Object obj = f634b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f635c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = L.b(view);
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

    public static String[] f(C0283w c0283w) {
        return Build.VERSION.SDK_INT >= 31 ? O.a(c0283w) : (String[]) c0283w.getTag(R.id.tag_on_receive_content_mime_types);
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
    public static C0013f h(View view, C0013f c0013f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0013f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return O.b(view, c0013f);
        }
        InterfaceC0025s interfaceC0025s = (InterfaceC0025s) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0026t interfaceC0026t = f636e;
        if (interfaceC0025s == null) {
            if (view instanceof InterfaceC0026t) {
                interfaceC0026t = (InterfaceC0026t) view;
            }
            return interfaceC0026t.a(c0013f);
        }
        C0013f a2 = ((Q.r) interfaceC0025s).a(view, c0013f);
        if (a2 == null) {
            return null;
        }
        if (view instanceof InterfaceC0026t) {
            interfaceC0026t = (InterfaceC0026t) view;
        }
        return interfaceC0026t.a(a2);
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
        L.e eVar2 = new L.e(null, eVar.f793b, null, sVar, eVar.f794c);
        View.AccessibilityDelegate c2 = c(view);
        C0007b c0007b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f644a : new C0007b(c2);
        if (c0007b == null) {
            c0007b = new C0007b();
        }
        l(view, c0007b);
        i(view, eVar2.a());
        e(view).add(eVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            M.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, C0007b c0007b) {
        if (c0007b == null && (c(view) instanceof C0005a)) {
            c0007b = new C0007b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0007b == null ? null : c0007b.f649b);
    }

    public static void m(View view, CharSequence charSequence) {
        new C(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        D d2 = f637f;
        if (charSequence == null) {
            d2.f622a.remove(view);
            view.removeOnAttachStateChangeListener(d2);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(d2);
        } else {
            d2.f622a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(d2);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(d2);
            }
        }
    }
}
