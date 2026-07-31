package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GetCachedAsset.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.GetCachedAsset$getLegacyCachedAsset$result$1", f = "GetCachedAsset.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class GetCachedAsset$getLegacyCachedAsset$result$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ GetCachedAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCachedAsset$getLegacyCachedAsset$result$1(GetCachedAsset getCachedAsset, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = getCachedAsset;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetCachedAsset$getLegacyCachedAsset$result$1(this.this$0, this.$fileName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GetCachedAsset$getLegacyCachedAsset$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CacheRepository cacheRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cacheRepository = this.this$0.cacheRepository;
            String str = this.$fileName;
            this.label = 1;
            obj = cacheRepository.retrieveFile(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
