package com.unity3d.ads.core.domain;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidInitializeBoldSDK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {128, 129, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "initializationSuccess")
/* loaded from: classes.dex */
final class AndroidInitializeBoldSDK$initializationSuccess$1 extends ContinuationImpl {
    double D$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidInitializeBoldSDK$initializationSuccess$1(AndroidInitializeBoldSDK androidInitializeBoldSDK, Continuation continuation) {
        super(continuation);
        this.this$0 = androidInitializeBoldSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object initializationSuccess;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initializationSuccess = this.this$0.initializationSuccess(null, null, false, this);
        return initializationSuccess;
    }
}
