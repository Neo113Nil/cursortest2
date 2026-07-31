package com.unity3d.ads.core.domain.exposure;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$getPrivacy$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    CommonAdViewerExposedFunctionsKt$getPrivacy$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, Continuation continuation) {
        CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1;
        int i;
        if (continuation instanceof CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) continuation;
            int i2 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SessionRepository sessionRepository = this.$sessionRepository;
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = 1;
                    obj = sessionRepository.getPrivacy(commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null);
            }
        }
        commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, continuation);
        Object obj2 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
        if (i != 0) {
        }
        return ProtobufExtensionsKt.toBase64$default((ByteString) obj2, false, 1, null);
    }
}
