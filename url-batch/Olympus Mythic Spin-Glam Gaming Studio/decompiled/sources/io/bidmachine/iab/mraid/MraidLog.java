package io.bidmachine.iab.mraid;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.util.log.DefaultLoggerInstance;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u000f\u0010\u0012J'\u0010\u0013\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J9\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0015\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u0017J9\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0015\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0017J9\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0015\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001e¨\u0006$"}, d2 = {"Lio/bidmachine/iab/mraid/MraidLog;", "", "<init>", "()V", "", "enabled", "", "setEnabled", "(Z)V", "subTag", "Lkotlin/Function0;", "", "messageBuilder", "d", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "w", "", "throwable", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", EidRequestBuilder.REQUEST_FIELD_EMAIL, "message", "", "args", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "canSendDLog", "()Z", "canSendWLog", "canSendELog", "", "LOG_NONE", "I", "Lio/bidmachine/util/log/DefaultLoggerInstance;", "a", "Lio/bidmachine/util/log/DefaultLoggerInstance;", "logger", "logLevel", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class MraidLog {
    public static final int LOG_NONE = Integer.MAX_VALUE;

    @NotNull
    public static final MraidLog INSTANCE = new MraidLog();

    /* renamed from: a, reason: from kotlin metadata */
    private static final DefaultLoggerInstance logger = new DefaultLoggerInstance() { // from class: io.bidmachine.iab.mraid.MraidLog$logger$1
        @Override // io.bidmachine.util.log.DefaultLoggerInstance
        public boolean isLoggable(int priority) {
            return MraidLog.logLevel <= priority;
        }
    };
    public static int logLevel = 6;

    static final class a extends Lambda implements Function0 {
        final /* synthetic */ String a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr) {
            super(0);
            this.a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = this.a;
            if (str == null) {
                str = "";
            }
            Object[] objArr = this.b;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
    }

    static final class b extends Lambda implements Function0 {
        final /* synthetic */ String a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr) {
            super(0);
            this.a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = this.a;
            if (str == null) {
                str = "";
            }
            Object[] objArr = this.b;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
    }

    static final class c extends Lambda implements Function0 {
        final /* synthetic */ String a;
        final /* synthetic */ Object[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Object[] objArr) {
            super(0);
            this.a = str;
            this.b = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = this.a;
            if (str == null) {
                str = "";
            }
            Object[] objArr = this.b;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
    }

    private MraidLog() {
    }

    public static final void d(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        logger.d(subTag, messageBuilder);
    }

    public static final void e(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        logger.e(subTag, messageBuilder);
    }

    public static final void setEnabled(boolean enabled) {
        logLevel = enabled ? 3 : Integer.MAX_VALUE;
    }

    public static final void w(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        logger.w(subTag, messageBuilder);
    }

    @Deprecated
    public final boolean canSendDLog() {
        return logger.isLoggable(3);
    }

    @Deprecated
    public final boolean canSendELog() {
        return logger.isLoggable(6);
    }

    @Deprecated
    public final boolean canSendWLog() {
        return logger.isLoggable(5);
    }

    @Deprecated
    public static final void d(@NotNull String subTag, @Nullable String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(args, "args");
        d(subTag, new a(message, args));
    }

    public static final void e(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        logger.e(subTag, throwable);
    }

    public static final void w(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        logger.w(subTag, throwable);
    }

    @Deprecated
    public static final void e(@NotNull String subTag, @Nullable String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(args, "args");
        e(subTag, new b(message, args));
    }

    @Deprecated
    public static final void w(@NotNull String subTag, @Nullable String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(subTag, "subTag");
        Intrinsics.checkNotNullParameter(args, "args");
        w(subTag, new c(message, args));
    }
}
