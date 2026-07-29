package o;

import android.view.View;
import com.devanos.nilufar.usmonova.R;
import java.util.Objects;

/* renamed from: o.tZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1966tZ {
    public static void a(View view, InterfaceC2296yZ interfaceC2296yZ) {
        GR gr = (GR) view.getTag(R.id.tag_unhandled_key_listeners);
        if (gr == null) {
            gr = new GR(0);
            view.setTag(R.id.tag_unhandled_key_listeners, gr);
        }
        Objects.requireNonNull(interfaceC2296yZ);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC1900sZ = new ViewOnUnhandledKeyEventListenerC1900sZ();
        gr.put(interfaceC2296yZ, viewOnUnhandledKeyEventListenerC1900sZ);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC1900sZ);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, InterfaceC2296yZ interfaceC2296yZ) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        GR gr = (GR) view.getTag(R.id.tag_unhandled_key_listeners);
        if (gr == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gr.get(interfaceC2296yZ)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, L7 l7) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
