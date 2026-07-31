package com.unity3d.ads.core.data.datasource;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {508}, m = "getGPUModel")
/* loaded from: classes12.dex */
final class AndroidStaticDeviceInfoDataSource$getGPUModel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidStaticDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidStaticDeviceInfoDataSource$getGPUModel$1(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, Continuation continuation) {
        super(continuation);
        this.this$0 = androidStaticDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object gPUModel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        gPUModel = this.this$0.getGPUModel(this);
        return gPUModel;
    }
}
