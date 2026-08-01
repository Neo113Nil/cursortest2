package defpackage;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Comparator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fj implements Comparator {
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final boolean c;
    public final tg d;

    public fj(tg tgVar, boolean z) {
        this.c = z;
        this.d = tgVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        AccessibilityNodeInfo accessibilityNodeInfo = ((k0) obj).a;
        Rect rect = this.a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((k0) obj2).a;
        Rect rect2 = this.b;
        accessibilityNodeInfo2.getBoundsInScreen(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.c;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
