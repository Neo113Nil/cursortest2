package com.mobilefuse.sdk.telemetry;

import com.ironsource.X3;
import com.mobilefuse.sdk.logging.LogLevel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TelemetryLogger.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryLogger;", "", "()V", "Companion", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final class TelemetryLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String getLogs() {
        return Companion.getLogs$default(INSTANCE, null, null, 3, null);
    }

    @NotNull
    public static final String getLogs(@NotNull LogLevel logLevel) {
        return Companion.getLogs$default(INSTANCE, logLevel, null, 2, null);
    }

    @NotNull
    public static final String getLogs(@NotNull LogLevel logLevel, @Nullable Function1 function1) {
        return INSTANCE.getLogs(logLevel, function1);
    }

    @NotNull
    public static final List<TimedStampedLog> getTimedStampedLogs(@NotNull LogLevel logLevel, @Nullable Function1 function1) {
        return INSTANCE.getTimedStampedLogs(logLevel, function1);
    }

    /* compiled from: TelemetryLogger.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0007J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryLogger$Companion;", "", "()V", "getLogs", "", "logLevel", "Lcom/mobilefuse/sdk/logging/LogLevel;", "actionsFactory", "Lkotlin/Function1;", "", "Lcom/mobilefuse/sdk/telemetry/TelemetryAction;", "getLongestActionSenderNameLength", "", "actions", "getTimedStampedLogs", "Lcom/mobilefuse/sdk/telemetry/TimedStampedLog;", "reportVideoStreamingEvent", "", "message", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        @NotNull
        public final String getLogs() {
            return getLogs$default(this, null, null, 3, null);
        }

        @NotNull
        public final String getLogs(@NotNull LogLevel logLevel) {
            return getLogs$default(this, logLevel, null, 2, null);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String getLogs$default(Companion companion, LogLevel logLevel, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                logLevel = LogLevel.INFO;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return companion.getLogs(logLevel, function1);
        }

        @NotNull
        public final String getLogs(@NotNull LogLevel logLevel, @Nullable Function1 actionsFactory) {
            List<TelemetryAction> actions$default;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            if (actionsFactory == null || (actions$default = (List) actionsFactory.invoke(logLevel)) == null) {
                actions$default = TelemetryHelpersKt.getActions$default(Telemetry.INSTANCE, logLevel, null, 2, null);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());
            String str = "%-" + getLongestActionSenderNameLength(actions$default) + "s";
            String str2 = "";
            for (TelemetryAction telemetryAction : actions$default) {
                if (telemetryAction.getType().getIncludeInLogsPrinting()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(simpleDateFormat.format(TelemetryHelpersKt.getTimestampDate(telemetryAction)));
                    sb.append(" | ");
                    sb.append(telemetryAction.getLogLevel());
                    sb.append(" | ");
                    sb.append(TelemetryHelpersKt.getLogTime(telemetryAction));
                    sb.append(" | [");
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(str, Arrays.copyOf(new Object[]{telemetryAction.getSender()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    sb.append(format);
                    sb.append(X3.j.e);
                    sb.append(" ");
                    sb.append(TelemetryHelpersKt.getLogs(telemetryAction));
                    sb.append("\n\n");
                    str2 = sb.toString();
                }
            }
            return str2;
        }

        public static /* synthetic */ List getTimedStampedLogs$default(Companion companion, LogLevel logLevel, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                logLevel = LogLevel.DEBUG;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return companion.getTimedStampedLogs(logLevel, function1);
        }

        @NotNull
        public final List<TimedStampedLog> getTimedStampedLogs(@NotNull LogLevel logLevel, @Nullable Function1 actionsFactory) {
            List<TelemetryAction> actions$default;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            ArrayList arrayList = new ArrayList();
            if (actionsFactory == null || (actions$default = (List) actionsFactory.invoke(logLevel)) == null) {
                actions$default = TelemetryHelpersKt.getActions$default(Telemetry.INSTANCE, logLevel, null, 2, null);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());
            String str = "%-" + getLongestActionSenderNameLength(actions$default) + "s";
            for (TelemetryAction telemetryAction : actions$default) {
                if (telemetryAction.getType().getIncludeInLogsPrinting()) {
                    Date timestampDate = TelemetryHelpersKt.getTimestampDate(telemetryAction);
                    StringBuilder sb = new StringBuilder();
                    sb.append(simpleDateFormat.format(TelemetryHelpersKt.getTimestampDate(telemetryAction)));
                    sb.append(" | ");
                    sb.append(telemetryAction.getLogLevel());
                    sb.append(" | ");
                    sb.append(TelemetryHelpersKt.getLogTime(telemetryAction));
                    sb.append(" | [");
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(str, Arrays.copyOf(new Object[]{telemetryAction.getSender()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    sb.append(format);
                    sb.append(X3.j.e);
                    sb.append(" ");
                    sb.append(TelemetryHelpersKt.getLogs(telemetryAction));
                    sb.append("\n\n");
                    arrayList.add(new TimedStampedLog(timestampDate, sb.toString()));
                }
            }
            return arrayList;
        }

        private final int getLongestActionSenderNameLength(List<TelemetryAction> actions) {
            int i = 0;
            for (TelemetryAction telemetryAction : actions) {
                if (telemetryAction.getSender().length() > i) {
                    i = telemetryAction.getSender().length();
                }
            }
            return i;
        }

        public final void reportVideoStreamingEvent(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            Telemetry.INSTANCE.onAction(new TelemetryAction(TelemetryHelpersKt.getTelemetryActionSender(this), new VideoStreamingEvent(message, "", false, true, false), CollectionsKt.emptyList(), LogLevel.INFO, 0L, 16, null));
        }
    }
}
