package o;

import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: o.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1862s0 {
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation h(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo l(int i) {
        return new AccessibilityNodeInfo.CollectionInfo(i, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo m(int i, boolean z) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i, 1, 0, 1, z);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo v(int i) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo w(int i, boolean z) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i, 1, z);
    }
}
