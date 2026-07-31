package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$setPrivacy$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    CommonAdViewerExposedFunctionsKt$setPrivacy$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, Continuation continuation) {
        CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1;
        int i;
        if (continuation instanceof CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) continuation;
            int i2 = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SessionRepository sessionRepository = this.$sessionRepository;
                    Object obj2 = objArr[0];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    byte[] decode = Base64.decode((String) obj2, 2);
                    Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                    ByteString byteString = ByteStringsKt.toByteString(decode);
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = 1;
                    if (sessionRepository.setPrivacy(byteString, commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, continuation);
        Object obj3 = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
