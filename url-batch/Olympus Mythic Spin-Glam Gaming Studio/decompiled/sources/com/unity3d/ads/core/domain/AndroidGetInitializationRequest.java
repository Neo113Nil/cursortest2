package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGetInitializationRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096B¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getInitializationRequestPayload", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "<init>", "(Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidGetInitializationRequest implements GetInitializationRequest {

    @NotNull
    private final GetInitializationRequestPayload getInitializationRequestPayload;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetInitializationRequest(@NotNull GetInitializationRequestPayload getInitializationRequestPayload, @NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        Intrinsics.checkNotNullParameter(getInitializationRequestPayload, "getInitializationRequestPayload");
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getInitializationRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b A[PHI: r7
      0x006b: PHI (r7v8 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x0068, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull Continuation continuation) {
        AndroidGetInitializationRequest$invoke$1 androidGetInitializationRequest$invoke$1;
        int i;
        if (continuation instanceof AndroidGetInitializationRequest$invoke$1) {
            androidGetInitializationRequest$invoke$1 = (AndroidGetInitializationRequest$invoke$1) continuation;
            int i2 = androidGetInitializationRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetInitializationRequest$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetInitializationRequest$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializationRequestPayload;
                    androidGetInitializationRequest$invoke$1.label = 1;
                    obj = getInitializationRequestPayload.invoke(androidGetInitializationRequest$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                androidGetInitializationRequest$invoke$1.label = 2;
                obj = getUniversalRequestForPayLoad.invoke(_build, androidGetInitializationRequest$invoke$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        androidGetInitializationRequest$invoke$1 = new AndroidGetInitializationRequest$invoke$1(this, continuation);
        Object obj2 = androidGetInitializationRequest$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetInitializationRequest$invoke$1.label;
        if (i != 0) {
        }
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) obj2);
        UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
        androidGetInitializationRequest$invoke$1.label = 2;
        obj2 = getUniversalRequestForPayLoad2.invoke(_build2, androidGetInitializationRequest$invoke$1);
        if (obj2 != coroutine_suspended2) {
        }
    }
}
