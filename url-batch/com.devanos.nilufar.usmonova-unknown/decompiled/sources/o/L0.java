package o;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class L0 {
    public static final L0 c;
    public static final L0 d;
    public static final L0 e;
    public static final L0 f;
    public static final L0 g;
    public static final L0 h;
    public final Object a;
    public final int b;

    static {
        new L0(null, 1, null, null);
        new L0(null, 2, null, null);
        new L0(null, 4, null, null);
        new L0(null, 8, null, null);
        new L0(null, 16, null, null);
        new L0(null, 32, null, null);
        c = new L0(null, 64, null, null);
        d = new L0(null, 128, null, null);
        new L0(null, 256, null, W0.class);
        new L0(null, 512, null, W0.class);
        new L0(null, 1024, null, X0.class);
        new L0(null, 2048, null, X0.class);
        e = new L0(null, 4096, null, null);
        f = new L0(null, 8192, null, null);
        new L0(null, 16384, null, null);
        new L0(null, 32768, null, null);
        new L0(null, 65536, null, null);
        new L0(null, 131072, null, AbstractC0747b1.class);
        new L0(null, 262144, null, null);
        new L0(null, 524288, null, null);
        new L0(null, 1048576, null, null);
        new L0(null, 2097152, null, AbstractC0812c1.class);
        int i = Build.VERSION.SDK_INT;
        new L0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new L0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, Z0.class);
        g = new L0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        new L0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        h = new L0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        new L0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new L0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new L0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new L0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new L0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new L0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new L0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, AbstractC0681a1.class);
        new L0(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, Y0.class);
        new L0(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new L0(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new L0(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new L0(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new L0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new L0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new L0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new L0(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new L0(i >= 34 ? O0.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public L0(int i, String str) {
        this(null, i, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof L0)) {
            return false;
        }
        Object obj2 = ((L0) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c2 = Q0.c(this.b);
        if (c2.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c2);
        return sb.toString();
    }

    public L0(Object obj, int i, CharSequence charSequence, Class cls) {
        this.b = i;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.a = obj;
        }
    }
}
