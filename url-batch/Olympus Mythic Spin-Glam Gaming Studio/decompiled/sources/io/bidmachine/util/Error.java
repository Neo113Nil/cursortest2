package io.bidmachine.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Error.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/bidmachine/util/Error;", "", "throwable", "", "(Ljava/lang/Throwable;)V", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "toString", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class Error {

    @NotNull
    private final String message;

    public Error(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Error(@NotNull Throwable throwable) {
        this(r2 == null ? "Empty throwable" : r2);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String message = throwable.getMessage();
    }

    @NotNull
    public String toString() {
        return this.message;
    }
}
