package com.unity3d.ads.core.domain.exposure;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 implements ExposedFunction {
    final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

    CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, Continuation continuation) {
        CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1;
        int i;
        if (continuation instanceof CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) continuation;
            int i2 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = objArr[0];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj2;
                    String optString = jSONObject.optString("content");
                    int optInt = jSONObject.optInt("version");
                    SendPrivacyUpdateRequest sendPrivacyUpdateRequest = this.$sendPrivacyUpdateRequest;
                    Intrinsics.checkNotNull(optString);
                    ByteString fromBase64$default = ProtobufExtensionsKt.fromBase64$default(optString, false, 1, null);
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = 1;
                    obj = sendPrivacyUpdateRequest.invoke(optInt, fromBase64$default, commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) obj;
                Map createMapBuilder = MapsKt.createMapBuilder();
                createMapBuilder.put("version", Boxing.boxInt(privacyUpdateResponse.getVersion()));
                ByteString content = privacyUpdateResponse.getContent();
                Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
                createMapBuilder.put("content", ProtobufExtensionsKt.toBase64$default(content, false, 1, null));
                return MapsKt.build(createMapBuilder);
            }
        }
        commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, continuation);
        Object obj3 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
        if (i != 0) {
        }
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse2 = (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) obj3;
        Map createMapBuilder2 = MapsKt.createMapBuilder();
        createMapBuilder2.put("version", Boxing.boxInt(privacyUpdateResponse2.getVersion()));
        ByteString content2 = privacyUpdateResponse2.getContent();
        Intrinsics.checkNotNullExpressionValue(content2, "getContent(...)");
        createMapBuilder2.put("content", ProtobufExtensionsKt.toBase64$default(content2, false, 1, null));
        return MapsKt.build(createMapBuilder2);
    }
}
