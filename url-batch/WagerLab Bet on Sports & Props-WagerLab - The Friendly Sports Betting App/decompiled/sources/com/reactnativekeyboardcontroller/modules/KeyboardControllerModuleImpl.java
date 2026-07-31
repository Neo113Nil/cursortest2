package com.reactnativekeyboardcontroller.modules;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.view.WindowInsetsAnimationControllerCompat;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.reactnativekeyboardcontroller.interactive.KeyboardAnimationController;
import com.reactnativekeyboardcontroller.traversal.FocusedInputHolder;
import com.reactnativekeyboardcontroller.traversal.ViewHierarchyNavigator;
import io.intercom.android.sdk.models.carousel.ActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyboardControllerModuleImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/reactnativekeyboardcontroller/modules/KeyboardControllerModuleImpl;", "", "mReactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "controller", "Lcom/reactnativekeyboardcontroller/interactive/KeyboardAnimationController;", "mDefaultMode", "", "setInputMode", "", "mode", "setDefaultMode", "preload", ActionType.DISMISS, "keepFocus", "", "animated", "setFocusTo", "direction", "", "setSoftInputMode", "getCurrentMode", "Companion", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KeyboardControllerModuleImpl {
    public static final String NAME = "KeyboardController";
    private final KeyboardAnimationController controller;
    private final int mDefaultMode;
    private final ReactApplicationContext mReactContext;

    public final void preload() {
    }

    public KeyboardControllerModuleImpl(ReactApplicationContext mReactContext) {
        Intrinsics.checkNotNullParameter(mReactContext, "mReactContext");
        this.mReactContext = mReactContext;
        this.controller = new KeyboardAnimationController();
        this.mDefaultMode = getCurrentMode();
    }

    public final void setInputMode(int mode) {
        setSoftInputMode(mode);
    }

    public final void setDefaultMode() {
        setSoftInputMode(this.mDefaultMode);
    }

    public final void dismiss(final boolean keepFocus, final boolean animated) {
        final Activity currentActivity = this.mReactContext.getCurrentActivity();
        final EditText editText = FocusedInputHolder.INSTANCE.get();
        if (editText != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativekeyboardcontroller.modules.KeyboardControllerModuleImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    KeyboardControllerModuleImpl.dismiss$lambda$2(animated, this, editText, currentActivity, keepFocus);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismiss$lambda$2$maybeClearFocus(boolean z, View view) {
        if (z) {
            return;
        }
        view.clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismiss$lambda$2(boolean z, KeyboardControllerModuleImpl keyboardControllerModuleImpl, final View view, Activity activity, final boolean z2) {
        if (Build.VERSION.SDK_INT >= 30 && !z) {
            keyboardControllerModuleImpl.controller.startControlRequest(view, new Function1() { // from class: com.reactnativekeyboardcontroller.modules.KeyboardControllerModuleImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit dismiss$lambda$2$lambda$1;
                    dismiss$lambda$2$lambda$1 = KeyboardControllerModuleImpl.dismiss$lambda$2$lambda$1(view, z2, (WindowInsetsAnimationControllerCompat) obj);
                    return dismiss$lambda$2$lambda$1;
                }
            });
            return;
        }
        Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        dismiss$lambda$2$maybeClearFocus(z2, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismiss$lambda$2$lambda$1(final View view, final boolean z, WindowInsetsAnimationControllerCompat insetsController) {
        Intrinsics.checkNotNullParameter(insetsController, "insetsController");
        insetsController.finish(false);
        view.post(new Runnable() { // from class: com.reactnativekeyboardcontroller.modules.KeyboardControllerModuleImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardControllerModuleImpl.dismiss$lambda$2$maybeClearFocus(z, view);
            }
        });
        return Unit.INSTANCE;
    }

    public final void setFocusTo(String direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (Intrinsics.areEqual(direction, "current")) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativekeyboardcontroller.modules.KeyboardControllerModuleImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    KeyboardControllerModuleImpl.setFocusTo$lambda$3();
                }
            });
            return;
        }
        EditText editText = FocusedInputHolder.INSTANCE.get();
        if (editText != null) {
            ViewHierarchyNavigator.INSTANCE.setFocusTo(direction, editText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFocusTo$lambda$3() {
        FocusedInputHolder.INSTANCE.focus();
    }

    private final void setSoftInputMode(final int mode) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativekeyboardcontroller.modules.KeyboardControllerModuleImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardControllerModuleImpl.setSoftInputMode$lambda$4(KeyboardControllerModuleImpl.this, mode);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSoftInputMode$lambda$4(KeyboardControllerModuleImpl keyboardControllerModuleImpl, int i) {
        Activity currentActivity;
        Window window;
        if (keyboardControllerModuleImpl.getCurrentMode() == i || (currentActivity = keyboardControllerModuleImpl.mReactContext.getCurrentActivity()) == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i);
    }

    private final int getCurrentMode() {
        Window window;
        WindowManager.LayoutParams attributes;
        Activity currentActivity = this.mReactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return 0;
        }
        return attributes.softInputMode;
    }
}
