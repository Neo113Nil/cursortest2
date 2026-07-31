package io.bidmachine.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NullUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"valueOrNew", "R", "value", "valueBuilder", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class NullUtilsKt {
    public static final <R> R valueOrNew(@Nullable R r, @NotNull Function0 valueBuilder) {
        Intrinsics.checkNotNullParameter(valueBuilder, "valueBuilder");
        return r == null ? (R) valueBuilder.mo4828invoke() : r;
    }
}
