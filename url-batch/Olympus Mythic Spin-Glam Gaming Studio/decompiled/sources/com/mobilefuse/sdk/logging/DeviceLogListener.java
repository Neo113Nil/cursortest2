package com.mobilefuse.sdk.logging;

import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceLogListener.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/mobilefuse/sdk/logging/DeviceLogListener;", "", "onLogCaptured", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "Lcom/mobilefuse/sdk/logging/LogLevel;", "message", "", "tag", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public interface DeviceLogListener {
    void onLogCaptured(@NotNull LogLevel level, @NotNull String message, @Nullable String tag);

    /* compiled from: DeviceLogListener.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        public static /* synthetic */ void onLogCaptured$default(DeviceLogListener deviceLogListener, LogLevel logLevel, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLogCaptured");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            deviceLogListener.onLogCaptured(logLevel, str, str2);
        }
    }
}
