package io.bidmachine.util;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UiUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0011\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010\n\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0002\u001a\u001b\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000f\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0002\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00062\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"applyFullscreen", "", "Landroid/app/Activity;", "applySystemUiVisibility", "isNoStatusBar", "", "Landroid/view/Window;", "finishActivityWithoutAnimation", "finishActivityWithoutAnimationSafely", "hideKeyboard", "(Landroid/app/Activity;)Ljava/lang/Boolean;", "prepareFullscreen", "setActivityBackgroundColor", "color", "", "(Landroid/app/Activity;I)Lkotlin/Unit;", "setNoActivityTransition", "setWindowBackgroundColor", "(Landroid/view/Window;I)Lkotlin/Unit;", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class UiUtilsKt {
    @Nullable
    public static final Unit setWindowBackgroundColor(@Nullable Window window, @ColorInt int i) {
        if (window == null) {
            return null;
        }
        window.setBackgroundDrawable(new ColorDrawable(i));
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Unit setActivityBackgroundColor(@NotNull Activity activity, @ColorInt int i) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return UiUtils.setWindowBackgroundColor(activity.getWindow(), i);
    }

    public static final void setNoActivityTransition(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                activity.overrideActivityTransition(0, 0, 0, 0);
                activity.overrideActivityTransition(1, 0, 0, 0);
                return;
            } catch (Throwable unused) {
            }
        }
        try {
            activity.overridePendingTransition(0, 0);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused2) {
        }
    }

    public static final void finishActivityWithoutAnimation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.finish();
        setNoActivityTransition(activity);
    }

    public static final void finishActivityWithoutAnimationSafely(@Nullable Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            finishActivityWithoutAnimation(activity);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    public static final void prepareFullscreen(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }

    public static final void applyFullscreen(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        applySystemUiVisibility$default(activity, false, 1, (Object) null);
        hideKeyboard(activity);
    }

    public static /* synthetic */ void applySystemUiVisibility$default(Activity activity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        applySystemUiVisibility(activity, z);
    }

    public static final void applySystemUiVisibility(@NotNull Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Window window = activity.getWindow();
        if (window != null) {
            applySystemUiVisibility(window, z);
        }
    }

    public static /* synthetic */ void applySystemUiVisibility$default(Window window, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        applySystemUiVisibility(window, z);
    }

    public static final void applySystemUiVisibility(@NotNull Window window, boolean z) {
        int i;
        WindowInsetsController windowInsetsController;
        int statusBars;
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            if (z) {
                window.setFlags(1024, 1024);
                i = 4;
            } else {
                i = 0;
            }
            if (i > 0) {
                window.getDecorView().setSystemUiVisibility(i);
                return;
            }
            return;
        }
        windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.setSystemBarsBehavior(2);
            if (z) {
                statusBars = WindowInsets.Type.statusBars();
                windowInsetsController.hide(statusBars);
            }
        }
    }

    @Nullable
    public static final Boolean hideKeyboard(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        InputMethodManager inputMethodManager = UtilsKt.getInputMethodManager(activity);
        if (inputMethodManager == null) {
            return null;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        return Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0));
    }
}
