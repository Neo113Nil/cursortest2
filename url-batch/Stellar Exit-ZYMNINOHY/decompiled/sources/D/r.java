package D;

import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r {
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation g(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo j(int i2) {
        return new AccessibilityNodeInfo.CollectionInfo(i2, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo k(int i2, boolean z2) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i2, 1, 0, 1, z2);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo r(int i2) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i2, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo s(int i2, boolean z2) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i2, 1, z2);
    }
}
