package io.bidmachine.rendering.utils;

import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.util.log.LoggerInstance;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0010\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ'\u0010\u0011\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ!\u0010\u0011\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ!\u0010\u0013\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/bidmachine/rendering/utils/RenderingLoggerInstance;", "Lio/bidmachine/util/log/LoggerInstance;", "<init>", "()V", "", "subTag", "Lkotlin/Function0;", "", "messageBuilder", "", "a", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "b", "", "throwable", "(Ljava/lang/Throwable;)V", "d", "w", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", EidRequestBuilder.REQUEST_FIELD_EMAIL, "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class RenderingLoggerInstance implements LoggerInstance {
    private final void a(Object subTag, Function0 messageBuilder) {
        if (k.b()) {
            if (subTag != null) {
                k.a(subTag, (String) messageBuilder.mo4828invoke(), new Object[0]);
            } else {
                k.a((String) messageBuilder.mo4828invoke(), new Object[0]);
            }
        }
    }

    private final void b(Object subTag, Function0 messageBuilder) {
        if (k.b()) {
            if (subTag != null) {
                k.b(subTag, (String) messageBuilder.mo4828invoke(), new Object[0]);
            } else {
                k.b((String) messageBuilder.mo4828invoke(), new Object[0]);
            }
        }
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void d(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        b(subTag, messageBuilder);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void e(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        a(subTag, messageBuilder);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void w(@Nullable Object subTag, @NotNull Function0 messageBuilder) {
        Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        b(subTag, messageBuilder);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void e(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a(throwable);
    }

    @Override // io.bidmachine.util.log.LoggerInstance
    public void w(@Nullable Object subTag, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a(throwable);
    }

    private final void a(Throwable throwable) {
        if (k.b()) {
            k.b(throwable);
        }
    }
}
