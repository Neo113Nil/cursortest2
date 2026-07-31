package io.bidmachine.util;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.Window;
import androidx.annotation.ColorInt;
import com.ironsource.X3;
import com.my.target.common.DisclaimerAlias;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.handler.UIHandlerTaskManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UiUtils.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\rH\u0007J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0007J\u0012\u0010\u001e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020 H\u0007J)\u0010!\u001a\u00020\u0006\"\u0004\b\u0000\u0010\"2\u0006\u0010#\u001a\u0002H\"2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u0002H\"\u0018\u00010%¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0012H\u0007J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J!\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010,\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J#\u0010/\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010,\u001a\u00020\u0012H\u0007¢\u0006\u0002\u00100R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lio/bidmachine/util/UiUtils;", "", "()V", "TASK_MANAGER", "Lio/bidmachine/util/taskmanager/TaskManager;", "applyFullscreen", "", "activity", "Landroid/app/Activity;", "applySystemUiVisibility", "window", "Landroid/view/Window;", "isNoStatusBar", "", "cancelOnUiThread", "runnable", "Ljava/lang/Runnable;", "defineOrientationBySize", "", "width", "height", "finishActivityWithoutAnimation", "hideKeyboard", "(Landroid/app/Activity;)Ljava/lang/Boolean;", "isUiThread", "obtainMotionEvent", "Landroid/view/MotionEvent;", "action", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "onUiThread", "delayMs", "", "onUiThreadWithArgSafely", "I", "input", "postMethod", "Lio/bidmachine/util/Executable;", "(Ljava/lang/Object;Lio/bidmachine/util/Executable;)V", "orientationToString", "", X3.i.n, "prepareFullscreen", "setActivityBackgroundColor", "color", "(Landroid/app/Activity;I)Lkotlin/Unit;", "setNoActivityTransition", "setWindowBackgroundColor", "(Landroid/view/Window;I)Lkotlin/Unit;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class UiUtils {

    @NotNull
    public static final UiUtils INSTANCE = new UiUtils();

    @NotNull
    private static final TaskManager TASK_MANAGER = new UIHandlerTaskManager();

    public static final int defineOrientationBySize(int width, int height) {
        return width > height ? 2 : 1;
    }

    private UiUtils() {
    }

    public static final boolean isUiThread() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean onUiThread(@Nullable Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        return TASK_MANAGER.executeSafely(runnable);
    }

    public static final boolean onUiThread(@Nullable Runnable runnable, long delayMs) {
        if (runnable == null) {
            return false;
        }
        return TASK_MANAGER.scheduleSafely(runnable, delayMs);
    }

    public final <I> void onUiThreadWithArgSafely(final I input, @Nullable final Executable<I> postMethod) {
        if (postMethod == null) {
            return;
        }
        onUiThread(new Runnable() { // from class: io.bidmachine.util.UiUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UiUtils.onUiThreadWithArgSafely$lambda$1(Executable.this, input);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUiThreadWithArgSafely$lambda$1(Executable executable, Object obj) {
        try {
            executable.execute(obj);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    public static final void cancelOnUiThread(@Nullable Runnable runnable) {
        if (runnable == null) {
            return;
        }
        TASK_MANAGER.cancel(runnable);
    }

    @Nullable
    public static final Unit setWindowBackgroundColor(@Nullable Window window, @ColorInt int color) {
        return UiUtilsKt.setWindowBackgroundColor(window, color);
    }

    @Nullable
    public static final Unit setActivityBackgroundColor(@NotNull Activity activity, @ColorInt int color) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return UiUtilsKt.setActivityBackgroundColor(activity, color);
    }

    public static final void setNoActivityTransition(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        UiUtilsKt.setNoActivityTransition(activity);
    }

    public static final void finishActivityWithoutAnimation(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        UiUtilsKt.finishActivityWithoutAnimation(activity);
    }

    public static final void prepareFullscreen(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        UiUtilsKt.prepareFullscreen(activity);
    }

    public static final void applyFullscreen(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        UiUtilsKt.applyFullscreen(activity);
    }

    public static final void applySystemUiVisibility(@NotNull Window window, boolean isNoStatusBar) {
        Intrinsics.checkNotNullParameter(window, "window");
        UiUtilsKt.applySystemUiVisibility(window, isNoStatusBar);
    }

    @Nullable
    public static final Boolean hideKeyboard(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return UiUtilsKt.hideKeyboard(activity);
    }

    @NotNull
    public static final String orientationToString(int orientation) {
        if (orientation == 0) {
            return DisclaimerAlias.UNDEFINED;
        }
        if (orientation == 1) {
            return "PORTRAIT";
        }
        if (orientation == 2) {
            return "LANDSCAPE";
        }
        return "UNKNOWN";
    }

    @NotNull
    public static final MotionEvent obtainMotionEvent(int action, int x, int y) {
        MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), action, x, y, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(\n            Syst…,\n            0\n        )");
        return obtain;
    }
}
