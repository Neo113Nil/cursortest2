package io.bidmachine.util.log;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.util.Error;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoggerInstance.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\"\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u001c\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fH&J\"\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u001c\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/log/LoggerInstance;", "", "d", "", "subTag", "messageBuilder", "Lkotlin/Function0;", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "error", "Lio/bidmachine/util/Error;", "throwable", "", "w", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public interface LoggerInstance {
    void d(@Nullable Object subTag, @NotNull Function0 messageBuilder);

    void e(@Nullable Object subTag, @NotNull Throwable throwable);

    void e(@Nullable Object subTag, @NotNull Function0 messageBuilder);

    void w(@Nullable Object subTag, @NotNull Throwable throwable);

    void w(@Nullable Object subTag, @NotNull Function0 messageBuilder);

    static /* synthetic */ void d$default(LoggerInstance loggerInstance, Object obj, Function0 function0, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        loggerInstance.d(obj, function0);
    }

    static /* synthetic */ void w$default(LoggerInstance loggerInstance, Object obj, Function0 function0, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        loggerInstance.w(obj, function0);
    }

    static /* synthetic */ void w$default(LoggerInstance loggerInstance, Object obj, Throwable th, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        loggerInstance.w(obj, th);
    }

    static /* synthetic */ void e$default(LoggerInstance loggerInstance, Object obj, Function0 function0, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        loggerInstance.e(obj, function0);
    }

    static /* synthetic */ void e$default(LoggerInstance loggerInstance, Object obj, Error error, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        loggerInstance.e(obj, error);
    }

    default void e(@Nullable Object subTag, @NotNull final Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        e(subTag, new Function0() { // from class: io.bidmachine.util.log.LoggerInstance$e$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return Error.this.getMessage();
            }
        });
    }

    static /* synthetic */ void e$default(LoggerInstance loggerInstance, Object obj, Throwable th, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        loggerInstance.e(obj, th);
    }
}
