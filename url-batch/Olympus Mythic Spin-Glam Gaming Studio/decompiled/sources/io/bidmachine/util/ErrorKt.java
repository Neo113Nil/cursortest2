package io.bidmachine.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Error.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toError", "Lio/bidmachine/util/Error;", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class ErrorKt {
    @NotNull
    public static final Error toError(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return new Error(th);
    }
}
