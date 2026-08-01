package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class d0 {
    public static final d0 e;
    public static final d0 f;
    public static final d0 g;
    public static final d0 h;
    public static final d0 i;
    public static final d0 j;
    public static final d0 k;
    public static final d0 l;
    public static final d0 m;
    public final Object a;
    public final int b;
    public final Class c;
    public final t0 d;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x024f, code lost:
    
        if ((r0 < 36 ? r0 * 100000 : android.os.Build.VERSION.SDK_INT_FULL) >= 3600001) goto L63;
     */
    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        boolean z = true;
        new d0((String) null, 1);
        new d0((String) null, 2);
        new d0((String) null, 4);
        new d0((String) null, 8);
        e = new d0((String) null, 16);
        new d0((String) null, 32);
        new d0((String) null, 64);
        new d0((String) null, 128);
        new d0(256, m0.class);
        new d0(512, m0.class);
        new d0(1024, n0.class);
        new d0(2048, n0.class);
        f = new d0((String) null, 4096);
        g = new d0((String) null, 8192);
        new d0((String) null, 16384);
        new d0((String) null, 32768);
        new d0((String) null, 65536);
        new d0(131072, r0.class);
        h = new d0((String) null, 262144);
        new d0((String) null, 524288);
        i = new d0((String) null, 1048576);
        new d0(2097152, s0.class);
        new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        j = new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, p0.class);
        k = new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        l = new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction18;
        } else {
            accessibilityAction = null;
        }
        new d0(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i2 >= 29) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction17;
        } else {
            accessibilityAction2 = null;
        }
        new d0(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        new d0(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        if (i2 >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction3 = accessibilityAction16;
        } else {
            accessibilityAction3 = null;
        }
        new d0(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
        new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, q0.class);
        new d0(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, o0.class);
        if (i2 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction4 = accessibilityAction15;
        } else {
            accessibilityAction4 = null;
        }
        new d0(accessibilityAction4, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i2 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction5 = accessibilityAction14;
        } else {
            accessibilityAction5 = null;
        }
        new d0(accessibilityAction5, R.id.accessibilityActionHideTooltip, null, null, null);
        new d0(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction6 = accessibilityAction13;
        } else {
            accessibilityAction6 = null;
        }
        new d0(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
        new d0(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        if (i2 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction7 = accessibilityAction12;
        } else {
            accessibilityAction7 = null;
        }
        new d0(accessibilityAction7, R.id.accessibilityActionDragDrop, null, null, null);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction8 = accessibilityAction11;
        } else {
            accessibilityAction8 = null;
        }
        new d0(accessibilityAction8, R.id.accessibilityActionDragCancel, null, null, null);
        if (i2 >= 33) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction9 = accessibilityAction10;
        } else {
            accessibilityAction9 = null;
        }
        new d0(accessibilityAction9, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        m = new d0(i2 >= 34 ? g0.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i3 = q8.a;
        if (i2 >= 36) {
        }
        z = false;
        new d0(z ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION : null, R.id.ALT, null, null, null);
    }

    public d0(Object obj, int i2, CharSequence charSequence, t0 t0Var, Class cls) {
        this.b = i2;
        this.d = t0Var;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        Object obj2 = ((d0) obj).a;
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
        String d = k0.d(this.b);
        if (d.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public d0(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public d0(String str, int i2) {
        this(null, i2, str, null, null);
    }
}
