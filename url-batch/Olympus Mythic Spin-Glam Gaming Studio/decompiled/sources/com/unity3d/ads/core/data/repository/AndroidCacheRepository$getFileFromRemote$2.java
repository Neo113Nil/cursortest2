package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidCacheRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2", f = "AndroidCacheRepository.kt", l = {120, 124}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AndroidCacheRepository$getFileFromRemote$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$getFileFromRemote$2(AndroidCacheRepository androidCacheRepository, String str, File file, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidCacheRepository$getFileFromRemote$2(this.this$0, this.$url, this.$cacheDirectory, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidCacheRepository$getFileFromRemote$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CompletableDeferred CompletableDeferred$default;
        DownloadPriorityQueue downloadPriorityQueue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String filename = this.this$0.getFilename(this.$url);
            CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            downloadPriorityQueue = this.this$0.downloadPriorityQueue;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cacheDirectory, filename, this.$url, CompletableDeferred$default, null);
            this.L$0 = CompletableDeferred$default;
            this.label = 1;
            if (downloadPriorityQueue.invoke(0, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CompletableDeferred$default = (CompletableDeferred) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        obj = CompletableDeferred$default.await(this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }

    /* compiled from: AndroidCacheRepository.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2$1", f = "AndroidCacheRepository.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileFromRemote$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1 {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ CompletableDeferred $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, CompletableDeferred completableDeferred, Continuation continuation) {
            super(1, continuation);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$fileResult = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$fileResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CacheDataSource cacheDataSource;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                cacheDataSource = this.this$0.remoteCacheDataSource;
                File file = this.$cacheDirectory;
                String str = this.$filename;
                String str2 = this.$url;
                Integer boxInt = Boxing.boxInt(0);
                this.label = 1;
                obj = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, str, str2, boxInt, 0, null, this, 48, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$fileResult.complete((CacheResult) obj);
            return Unit.INSTANCE;
        }
    }
}
