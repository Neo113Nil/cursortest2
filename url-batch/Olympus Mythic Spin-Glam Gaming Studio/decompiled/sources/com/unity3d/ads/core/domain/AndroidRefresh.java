package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidRefresh.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096B¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidRefresh;", "Lcom/unity3d/ads/core/domain/Refresh;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getAdDataRefreshRequest", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "invoke", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "opportunityId", "Lcom/google/protobuf/ByteString;", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidRefresh implements Refresh {

    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    public AndroidRefresh(@NotNull CoroutineDispatcher defaultDispatcher, @NotNull GetAdDataRefreshRequest getAdDataRefreshRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GatewayClient gatewayClient) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.Refresh
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull Continuation continuation) {
        AndroidRefresh$invoke$1 androidRefresh$invoke$1;
        int i;
        if (continuation instanceof AndroidRefresh$invoke$1) {
            androidRefresh$invoke$1 = (AndroidRefresh$invoke$1) continuation;
            int i2 = androidRefresh$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidRefresh$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidRefresh$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidRefresh$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher;
                    AndroidRefresh$invoke$2 androidRefresh$invoke$2 = new AndroidRefresh$invoke$2(this, byteString2, byteString, null);
                    androidRefresh$invoke$1.label = 1;
                    obj = BuildersKt.withContext(coroutineDispatcher, androidRefresh$invoke$2, androidRefresh$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        androidRefresh$invoke$1 = new AndroidRefresh$invoke$1(this, continuation);
        Object obj2 = androidRefresh$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidRefresh$invoke$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }
}
