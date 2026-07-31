package io.bidmachine.rendering.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Lio/bidmachine/rendering/model/Error;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMessage", "Companion", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class Error {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final String message;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/bidmachine/rendering/model/Error$Companion;", "", "()V", "create", "Lio/bidmachine/rendering/model/Error;", "throwable", "", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Error create(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            String message = throwable.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new Error(message);
        }

        private Companion() {
        }
    }

    public Error(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    @NotNull
    public static final Error create(@NotNull Throwable th) {
        return INSTANCE.create(th);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public String toString() {
        return this.message;
    }
}
