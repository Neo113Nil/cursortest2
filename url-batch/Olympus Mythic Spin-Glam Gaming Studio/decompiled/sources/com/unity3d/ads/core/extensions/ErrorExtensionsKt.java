package com.unity3d.ads.core.extensions;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ErrorExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getErrorTokenOrNull", "Lcom/google/protobuf/ByteString;", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorExtensionsKt {
    @Nullable
    public static final ByteString getErrorTokenOrNull(@NotNull ErrorOuterClass.Error error) {
        Intrinsics.checkNotNullParameter(error, "<this>");
        if (error.getErrorToken().isEmpty()) {
            return null;
        }
        return error.getErrorToken();
    }
}
