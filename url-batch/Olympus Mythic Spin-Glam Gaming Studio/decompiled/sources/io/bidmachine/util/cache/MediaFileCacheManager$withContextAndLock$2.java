package io.bidmachine.util.cache;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileCacheManager.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.cache.MediaFileCacheManager$withContextAndLock$2", f = "MediaFileCacheManager.kt", l = {601, 402}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MediaFileCacheManager$withContextAndLock$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $block;
    final /* synthetic */ Mutex $mutex;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaFileCacheManager$withContextAndLock$2(Mutex mutex, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$mutex = mutex;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        MediaFileCacheManager$withContextAndLock$2 mediaFileCacheManager$withContextAndLock$2 = new MediaFileCacheManager$withContextAndLock$2(this.$mutex, this.$block, continuation);
        mediaFileCacheManager$withContextAndLock$2.L$0 = obj;
        return mediaFileCacheManager$withContextAndLock$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((MediaFileCacheManager$withContextAndLock$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Mutex mutex;
        Function2 function2;
        Mutex mutex2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                mutex = this.$mutex;
                function2 = this.$block;
                this.L$0 = coroutineScope;
                this.L$1 = mutex;
                this.L$2 = function2;
                this.label = 1;
                if (mutex.lock(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        mutex2.unlock(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                function2 = (Function2) this.L$2;
                Mutex mutex3 = (Mutex) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
            }
            this.L$0 = mutex;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            Object invoke = function2.invoke(coroutineScope, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            obj = invoke;
            mutex2.unlock(null);
            return obj;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
