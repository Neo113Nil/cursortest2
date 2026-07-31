package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$omImpression$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

    CommonAdViewerExposedFunctionsKt$omImpression$1(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        this.$omImpressionOccurred = omImpressionOccurred;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, Continuation continuation) {
        CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1;
        int i;
        if (continuation instanceof CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) continuation;
            int i2 = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = objArr[0];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    OmImpressionOccurred omImpressionOccurred = this.$omImpressionOccurred;
                    AdObject adObject = this.$adObject;
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = 1;
                    if (omImpressionOccurred.invoke(adObject, booleanValue, commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) == coroutine_suspended) {
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
        commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, continuation);
        Object obj3 = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
