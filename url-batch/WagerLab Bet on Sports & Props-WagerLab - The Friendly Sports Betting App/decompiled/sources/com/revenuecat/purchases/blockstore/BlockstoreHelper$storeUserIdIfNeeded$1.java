package com.revenuecat.purchases.blockstore;

import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: BlockstoreHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$storeUserIdIfNeeded$1", f = "BlockstoreHelper.kt", i = {}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT, 67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class BlockstoreHelper$storeUserIdIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentUserId;
    int label;
    final /* synthetic */ BlockstoreHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockstoreHelper$storeUserIdIfNeeded$1(BlockstoreHelper blockstoreHelper, String str, Continuation<? super BlockstoreHelper$storeUserIdIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = blockstoreHelper;
        this.$currentUserId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlockstoreHelper$storeUserIdIfNeeded$1(this.this$0, this.$currentUserId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BlockstoreHelper$storeUserIdIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r7 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object storeUserIdIfNeeded;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (Exception e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to store user Id in Block store: " + e.getMessage(), e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.this$0.getBlockstoreData(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            Map map = (Map) obj;
            this.label = 2;
            storeUserIdIfNeeded = this.this$0.storeUserIdIfNeeded(map, this.$currentUserId, this);
        } catch (Exception e2) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to retrieve Block store data. Will not store userId. Error: " + e2.getMessage(), e2);
            return Unit.INSTANCE;
        }
    }
}
