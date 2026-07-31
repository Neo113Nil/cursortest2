package com.unity3d.ads.core.domain.exposure;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1", f = "CommonAdViewerExposedFunctions.kt", l = {Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE}, m = "invoke")
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, Continuation continuation) {
        super(continuation);
        this.this$0 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((Object[]) null, (Continuation) this);
    }
}
