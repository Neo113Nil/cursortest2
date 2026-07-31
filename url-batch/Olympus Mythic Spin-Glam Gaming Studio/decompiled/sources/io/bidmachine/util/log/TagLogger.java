package io.bidmachine.util.log;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TagLogger.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J \u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/bidmachine/util/log/TagLogger;", "Lio/bidmachine/util/log/LoggerInstance;", "tag", "", "logger", "(Ljava/lang/String;Lio/bidmachine/util/log/LoggerInstance;)V", "d", "", "subTag", "", "messageBuilder", "Lkotlin/Function0;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "throwable", "", "w", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class TagLogger implements LoggerInstance {

    @NotNull
    private final LoggerInstance logger;

    @NotNull
    private final String tag;

    public TagLogger(@NotNull String tag, @NotNull LoggerInstance logger) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.tag = tag;
        this.logger = logger;
    }

    public /* synthetic */ TagLogger(String str, LoggerInstance loggerInstance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? LoggerSettings.INSTANCE.getLogger$bidmachine_android_sdk_bd_3_7_1() : loggerInstance);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void d(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        LoggerInstance loggerInstance = this.logger;
        if (subTag == null) {
            subTag = this.tag;
        }
        loggerInstance.d(subTag, messageBuilder);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void w(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        LoggerInstance loggerInstance = this.logger;
        if (subTag == null) {
            subTag = this.tag;
        }
        loggerInstance.w(subTag, messageBuilder);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void w(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        LoggerInstance loggerInstance = this.logger;
        if (subTag == null) {
            subTag = this.tag;
        }
        loggerInstance.w(subTag, throwable);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void e(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        LoggerInstance loggerInstance = this.logger;
        if (subTag == null) {
            subTag = this.tag;
        }
        loggerInstance.e(subTag, messageBuilder);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void e(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        LoggerInstance loggerInstance = this.logger;
        if (subTag == null) {
            subTag = this.tag;
        }
        loggerInstance.e(subTag, throwable);
    }
}
