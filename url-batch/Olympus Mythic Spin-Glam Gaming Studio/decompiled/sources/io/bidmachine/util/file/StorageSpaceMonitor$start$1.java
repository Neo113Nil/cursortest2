package io.bidmachine.util.file;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StorageSpaceMonitor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.file.StorageSpaceMonitor$start$1", f = "StorageSpaceMonitor.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class StorageSpaceMonitor$start$1 extends SuspendLambda implements Function2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StorageSpaceMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StorageSpaceMonitor$start$1(StorageSpaceMonitor storageSpaceMonitor, Continuation continuation) {
        super(2, continuation);
        this.this$0 = storageSpaceMonitor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        StorageSpaceMonitor$start$1 storageSpaceMonitor$start$1 = new StorageSpaceMonitor$start$1(this.this$0, continuation);
        storageSpaceMonitor$start$1.L$0 = obj;
        return storageSpaceMonitor$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((StorageSpaceMonitor$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            StorageSpaceMonitor storageSpaceMonitor = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                storageSpaceMonitor.checkAndNotify();
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            j = this.this$0.interval;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.m8203delayVtjQ1oo(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
