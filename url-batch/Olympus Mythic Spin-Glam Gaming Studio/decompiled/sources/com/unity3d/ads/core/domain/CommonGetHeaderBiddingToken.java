package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetHeaderBiddingToken.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "buildHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "<init>", "(Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;)V", "invoke", "", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {

    @NotNull
    public static final String HB_TOKEN_VERSION = "2";

    @NotNull
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;

    public CommonGetHeaderBiddingToken(@NotNull BuildHeaderBiddingToken buildHeaderBiddingToken) {
        Intrinsics.checkNotNullParameter(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, @Nullable TokenConfiguration tokenConfiguration, @NotNull Continuation continuation) {
        CommonGetHeaderBiddingToken$invoke$1 commonGetHeaderBiddingToken$invoke$1;
        int i2;
        if (continuation instanceof CommonGetHeaderBiddingToken$invoke$1) {
            commonGetHeaderBiddingToken$invoke$1 = (CommonGetHeaderBiddingToken$invoke$1) continuation;
            int i3 = commonGetHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonGetHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonGetHeaderBiddingToken$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
                    commonGetHeaderBiddingToken$invoke$1.label = 1;
                    obj = buildHeaderBiddingToken.invoke(i, tokenConfiguration, commonGetHeaderBiddingToken$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ByteString byteString = ((HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj).toByteString();
                Intrinsics.checkNotNullExpressionValue(byteString, "toByteString(...)");
                return "2:" + ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null);
            }
        }
        commonGetHeaderBiddingToken$invoke$1 = new CommonGetHeaderBiddingToken$invoke$1(this, continuation);
        Object obj2 = commonGetHeaderBiddingToken$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        ByteString byteString2 = ((HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj2).toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString2, "toByteString(...)");
        return "2:" + ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null);
    }
}
