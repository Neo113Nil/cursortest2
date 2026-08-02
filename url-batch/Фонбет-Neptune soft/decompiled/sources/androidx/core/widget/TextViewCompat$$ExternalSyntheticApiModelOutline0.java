package androidx.core.widget;

import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputContentInfo;
import java.util.Map;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class TextViewCompat$$ExternalSyntheticApiModelOutline0 {
    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WindowInsets.Builder m146m() {
        return new WindowInsets.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ WindowInsets.Builder m147m(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController.OnControllableInsetsChangedListener m(Object obj) {
        return (WindowInsetsController.OnControllableInsetsChangedListener) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo m(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillId m153m(Object obj) {
        return (AutofillId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m154m(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ InputContentInfo m155m(Object obj) {
        return (InputContentInfo) obj;
    }
}
