package io.bidmachine.utils.log;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.lazy.LazyValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J \u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lio/bidmachine/utils/log/UtilsLoggerInstance;", "Lio/bidmachine/util/log/LoggerInstance;", "()V", "d", "", "subTag", "", "messageBuilder", "Lkotlin/Function0;", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "throwable", "", "w", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class UtilsLoggerInstance implements io.bidmachine.util.log.LoggerInstance {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String d$lambda$0(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d$lambda$1(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e$lambda$4(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e$lambda$5(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w$lambda$2(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.mo4828invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w$lambda$3(Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "$messageBuilder");
        return (String) messageBuilder.mo4828invoke();
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void d(@Nullable Object subTag, @NotNull final Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        if (subTag == null) {
            Logger.d((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.log.UtilsLoggerInstance$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String d$lambda$0;
                    d$lambda$0 = UtilsLoggerInstance.d$lambda$0(Function0.this);
                    return d$lambda$0;
                }
            });
        } else {
            Logger.d(subTag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.log.UtilsLoggerInstance$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String d$lambda$1;
                    d$lambda$1 = UtilsLoggerInstance.d$lambda$1(Function0.this);
                    return d$lambda$1;
                }
            });
        }
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void e(@Nullable Object subTag, @NotNull final Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        if (subTag == null) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.log.UtilsLoggerInstance$$ExternalSyntheticLambda2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String e$lambda$4;
                    e$lambda$4 = UtilsLoggerInstance.e$lambda$4(Function0.this);
                    return e$lambda$4;
                }
            });
        } else {
            Logger.e(subTag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.log.UtilsLoggerInstance$$ExternalSyntheticLambda3
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String e$lambda$5;
                    e$lambda$5 = UtilsLoggerInstance.e$lambda$5(Function0.this);
                    return e$lambda$5;
                }
            });
        }
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void w(@Nullable Object subTag, @NotNull final Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        if (subTag == null) {
            Logger.w((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.log.UtilsLoggerInstance$$ExternalSyntheticLambda4
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String w$lambda$2;
                    w$lambda$2 = UtilsLoggerInstance.w$lambda$2(Function0.this);
                    return w$lambda$2;
                }
            });
        } else {
            Logger.w(subTag, (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.log.UtilsLoggerInstance$$ExternalSyntheticLambda5
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String w$lambda$3;
                    w$lambda$3 = UtilsLoggerInstance.w$lambda$3(Function0.this);
                    return w$lambda$3;
                }
            });
        }
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void e(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (subTag == null) {
            Logger.e(throwable);
        } else {
            Logger.e(subTag, throwable);
        }
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void w(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (subTag == null) {
            Logger.w(throwable);
        } else {
            Logger.w(subTag, throwable);
        }
    }
}
