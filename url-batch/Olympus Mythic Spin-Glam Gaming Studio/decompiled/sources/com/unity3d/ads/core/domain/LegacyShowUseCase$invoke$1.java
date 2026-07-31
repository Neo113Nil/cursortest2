package com.unity3d.ads.core.domain;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LegacyShowUseCase.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 128, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, ModuleDescriptor.MODULE_VERSION, 146, 152, 159, 164, 196}, m = "invoke")
/* loaded from: classes8.dex */
final class LegacyShowUseCase$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$invoke$1(LegacyShowUseCase legacyShowUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = legacyShowUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
