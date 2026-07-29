package o;

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
import com.devanos.nilufar.usmonova.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class AZ {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final C1439lZ d = new C1439lZ();
    public static final ViewTreeObserverOnGlobalLayoutListenerC1571nZ e = new ViewTreeObserverOnGlobalLayoutListenerC1571nZ();

    public static C0942e00 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        C0942e00 c0942e00 = (C0942e00) a.get(view);
        if (c0942e00 != null) {
            return c0942e00;
        }
        C0942e00 c0942e002 = new C0942e00(view);
        a.put(view, c0942e002);
        return c0942e002;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C2362zZ.d;
        C2362zZ c2362zZ = (C2362zZ) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c2362zZ == null) {
            c2362zZ = new C2362zZ();
            c2362zZ.a = null;
            c2362zZ.b = null;
            c2362zZ.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c2362zZ);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c2362zZ.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C2362zZ.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c2362zZ.a == null) {
                            c2362zZ.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C2362zZ.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c2362zZ.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c2362zZ.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = c2362zZ.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c2362zZ.b == null) {
                    c2362zZ.b = new SparseArray();
                }
                c2362zZ.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC2032uZ.a(view);
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

    public static String[] d(C1541n5 c1541n5) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC2164wZ.a(c1541n5) : (String[]) c1541n5.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = AbstractC1966tZ.b(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = obtain.getText();
                    if (i2 >= 28) {
                        charSequence = AbstractC1966tZ.b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
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
            List<CharSequence> text2 = obtain2.getText();
            if (i2 >= 28) {
                charSequence = AbstractC1966tZ.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1510me f(View view, C1510me c1510me) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1510me + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2164wZ.b(view, c1510me);
        }
        InterfaceC1092gG interfaceC1092gG = (InterfaceC1092gG) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC1158hG interfaceC1158hG = d;
        if (interfaceC1092gG == null) {
            if (view instanceof InterfaceC1158hG) {
                interfaceC1158hG = (InterfaceC1158hG) view;
            }
            return interfaceC1158hG.a(c1510me);
        }
        C1510me a2 = ((C2292yV) interfaceC1092gG).a(view, c1510me);
        if (a2 == null) {
            return null;
        }
        if (view instanceof InterfaceC1158hG) {
            interfaceC1158hG = (InterfaceC1158hG) view;
        }
        return interfaceC1158hG.a(a2);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2032uZ.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void h(View view, C0 c0) {
        if (c0 == null && (c(view) instanceof B0)) {
            c0 = new C0();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0 == null ? null : c0.b);
    }

    public static void i(View view, CharSequence charSequence) {
        new C1505mZ(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC1571nZ viewTreeObserverOnGlobalLayoutListenerC1571nZ = e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC1571nZ.h.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1571nZ);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1571nZ);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC1571nZ.h.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1571nZ);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1571nZ);
            }
        }
    }
}
