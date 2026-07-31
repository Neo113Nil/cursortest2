package com.mobilefuse.sdk.ad.rendering.omniad.container;

import android.view.WindowManager;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: WindowContainer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"disableWindowDefaultAnimations", "", "Landroid/view/WindowManager$LayoutParams;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public final class WindowContainerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void disableWindowDefaultAnimations(WindowManager.LayoutParams layoutParams) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Field field = WindowManager.LayoutParams.class.getField("privateFlags");
            Object obj = field.get(layoutParams);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            field.set(layoutParams, Integer.valueOf(((Integer) obj).intValue() | 64));
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
