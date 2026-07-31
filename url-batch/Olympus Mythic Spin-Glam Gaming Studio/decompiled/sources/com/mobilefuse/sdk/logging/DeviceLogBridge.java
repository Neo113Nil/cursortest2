package com.mobilefuse.sdk.logging;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceLogBridge.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/logging/DeviceLogBridge;", "", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/logging/DeviceLogListener;", "captureLog", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lcom/mobilefuse/sdk/logging/LogLevel;", "message", "", "tag", "setListener", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public final class DeviceLogBridge {

    @NotNull
    public static final DeviceLogBridge INSTANCE = new DeviceLogBridge();
    private static volatile DeviceLogListener listener;

    private DeviceLogBridge() {
    }

    public final void setListener(@Nullable DeviceLogListener listener2) {
        listener = listener2;
    }

    public final void captureLog(@NotNull LogLevel level, @NotNull String message, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.Ignore;
        try {
            DeviceLogListener deviceLogListener = listener;
            if (deviceLogListener != null) {
                deviceLogListener.onLogCaptured(level, message, tag);
            }
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
