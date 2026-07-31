package io.intercom.android.sdk.utilities;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccessibilityUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/utilities/AccessibilityUtils;", "", "<init>", "()V", "addClickAbilityAnnouncement", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "removeClickAbilityAnnouncement", "addHeadingAnnouncement", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AccessibilityUtils {
    public static final int $stable = 0;
    public static final AccessibilityUtils INSTANCE = new AccessibilityUtils();

    private AccessibilityUtils() {
    }

    public final void addClickAbilityAnnouncement(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils$addClickAbilityAnnouncement$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                info.setClickable(true);
            }
        });
    }

    public final void removeClickAbilityAnnouncement(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils$removeClickAbilityAnnouncement$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                info.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_LONG_CLICK);
                info.setClickable(false);
                info.setLongClickable(false);
            }
        });
    }

    public final void addHeadingAnnouncement(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: io.intercom.android.sdk.utilities.AccessibilityUtils$addHeadingAnnouncement$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setHeading(true);
            }
        });
    }
}
