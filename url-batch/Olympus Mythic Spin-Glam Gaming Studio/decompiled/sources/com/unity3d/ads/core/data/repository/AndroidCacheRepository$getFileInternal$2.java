package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
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
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidCacheRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/CacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", f = "AndroidCacheRepository.kt", l = {91, 98, 111}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AndroidCacheRepository$getFileInternal$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ File $cacheDirectory;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ Function3 $onProgress;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ AndroidCacheRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheRepository$getFileInternal$2(AndroidCacheRepository androidCacheRepository, String str, File file, int i, int i2, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidCacheRepository;
        this.$url = str;
        this.$cacheDirectory = file;
        this.$priority = i;
        this.$intervalMs = i2;
        this.$onProgress = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidCacheRepository$getFileInternal$2(this.this$0, this.$url, this.$cacheDirectory, this.$priority, this.$intervalMs, this.$onProgress, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AndroidCacheRepository$getFileInternal$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CacheDataSource cacheDataSource;
        Object file$default;
        String str;
        CompletableDeferred CompletableDeferred$default;
        DownloadPriorityQueue downloadPriorityQueue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String filename = this.this$0.getFilename(this.$url);
            cacheDataSource = this.this$0.localCacheDataSource;
            File file = this.$cacheDirectory;
            String str2 = this.$url;
            Integer boxInt = Boxing.boxInt(this.$priority);
            this.L$0 = filename;
            this.label = 1;
            file$default = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, filename, str2, boxInt, 0, null, this, 48, null);
            if (file$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = filename;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                CompletableDeferred$default = (CompletableDeferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                Object await = CompletableDeferred$default.await(this);
                return await != coroutine_suspended ? coroutine_suspended : await;
            }
            String str3 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str3;
            file$default = obj;
        }
        CacheResult cacheResult = (CacheResult) file$default;
        if (cacheResult instanceof CacheResult.Success) {
            return cacheResult;
        }
        CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        downloadPriorityQueue = this.this$0.downloadPriorityQueue;
        int i2 = this.$priority;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$cacheDirectory, str, this.$url, i2, CompletableDeferred$default, this.$intervalMs, this.$onProgress, null);
        this.L$0 = CompletableDeferred$default;
        this.label = 2;
        if (downloadPriorityQueue.invoke(i2, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.L$0 = null;
        this.label = 3;
        Object await2 = CompletableDeferred$default.await(this);
        if (await2 != coroutine_suspended) {
        }
    }

    /* compiled from: AndroidCacheRepository.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", f = "AndroidCacheRepository.kt", l = {100, 107}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1 {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ CompletableDeferred $fileResult;
        final /* synthetic */ String $filename;
        final /* synthetic */ int $intervalMs;
        final /* synthetic */ Function3 $onProgress;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ AndroidCacheRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i, CompletableDeferred completableDeferred, int i2, Function3 function3, Continuation continuation) {
            super(1, continuation);
            this.this$0 = androidCacheRepository;
            this.$cacheDirectory = file;
            this.$filename = str;
            this.$url = str2;
            this.$priority = i;
            this.$fileResult = completableDeferred;
            this.$intervalMs = i2;
            this.$onProgress = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, this.$intervalMs, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CacheDataSource cacheDataSource;
            CacheDataSource cacheDataSource2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                cacheDataSource = this.this$0.localCacheDataSource;
                File file = this.$cacheDirectory;
                String str = this.$filename;
                String str2 = this.$url;
                Integer boxInt = Boxing.boxInt(this.$priority);
                this.label = 1;
                obj = CacheDataSource.DefaultImpls.getFile$default(cacheDataSource, file, str, str2, boxInt, 0, null, this, 48, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.$fileResult.complete((CacheResult) obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            CacheResult cacheResult = (CacheResult) obj;
            if (!(cacheResult instanceof CacheResult.Success)) {
                cacheDataSource2 = this.this$0.remoteCacheDataSource;
                File file2 = this.$cacheDirectory;
                String str3 = this.$filename;
                String str4 = this.$url;
                Integer boxInt2 = Boxing.boxInt(this.$priority);
                int i2 = this.$intervalMs;
                Function3 function3 = this.$onProgress;
                this.label = 2;
                obj = cacheDataSource2.getFile(file2, str3, str4, boxInt2, i2, function3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.$fileResult.complete((CacheResult) obj);
                return Unit.INSTANCE;
            }
            this.$fileResult.complete(cacheResult);
            return Unit.INSTANCE;
        }
    }
}
