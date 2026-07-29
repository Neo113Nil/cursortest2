package o;

import android.transition.Transition;
import android.widget.PopupWindow;

/* renamed from: o.rC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1811rC {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
