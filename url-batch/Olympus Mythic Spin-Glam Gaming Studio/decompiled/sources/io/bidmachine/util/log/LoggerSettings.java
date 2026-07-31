package io.bidmachine.util.log;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LoggerSettings.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lio/bidmachine/util/log/LoggerSettings;", "", "()V", "logger", "Lio/bidmachine/util/log/DefaultLoggerInstance;", "getLogger$bidmachine_android_sdk_bd_3_7_1", "()Lio/bidmachine/util/log/DefaultLoggerInstance;", "setEnable", "", "value", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerSettings {

    @NotNull
    public static final LoggerSettings INSTANCE = new LoggerSettings();

    @NotNull
    private static final DefaultLoggerInstance logger = new DefaultLoggerInstance("BidMachineUtil");

    private LoggerSettings() {
    }

    @NotNull
    public final DefaultLoggerInstance getLogger$bidmachine_android_sdk_bd_3_7_1() {
        return logger;
    }

    public static final void setEnable(boolean value) {
        logger.setEnabled(value);
    }
}
