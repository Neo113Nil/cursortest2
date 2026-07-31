package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.PrivacyUpdateRequestKt;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetPrivacyUpdateRequest.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086B¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;", "", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "privacyUpdateVersion", "", "privacyUpdateContent", "Lcom/google/protobuf/ByteString;", "(ILcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPrivacyUpdateRequest {

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public GetPrivacyUpdateRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    @Nullable
    public final Object invoke(int i, @NotNull ByteString byteString, @NotNull Continuation continuation) {
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.INSTANCE;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder newBuilder = PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        PrivacyUpdateRequestKt.Dsl _create = companion._create(newBuilder);
        _create.setVersion(i);
        _create.setContent(byteString);
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest _build = _create._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setPrivacyUpdateRequest(_build);
        return this.getUniversalRequestForPayLoad.invoke(_create2._build(), continuation);
    }
}
