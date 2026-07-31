package com.revenuecat.purchases.blockstore;

import com.google.android.gms.auth.blockstore.BlockstoreClient;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BlockstoreHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1", f = "BlockstoreHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class BlockstoreHelper$clearUserIdBackupIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BlockstoreClient $blockstoreClient;
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ DeleteBytesRequest $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockstoreHelper$clearUserIdBackupIfNeeded$1(BlockstoreClient blockstoreClient, DeleteBytesRequest deleteBytesRequest, Function0<Unit> function0, Continuation<? super BlockstoreHelper$clearUserIdBackupIfNeeded$1> continuation) {
        super(2, continuation);
        this.$blockstoreClient = blockstoreClient;
        this.$request = deleteBytesRequest;
        this.$callback = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlockstoreHelper$clearUserIdBackupIfNeeded$1(this.$blockstoreClient, this.$request, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BlockstoreHelper$clearUserIdBackupIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Task<Boolean> deleteBytes = this.$blockstoreClient.deleteBytes(this.$request);
        final Function0<Unit> function0 = this.$callback;
        final Function1<Boolean, Unit> function1 = new Function1<Boolean, Unit>() { // from class: com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Block store cached UserID cleared if any");
                }
                function0.invoke();
            }
        };
        Task<Boolean> addOnSuccessListener = deleteBytes.addOnSuccessListener(new OnSuccessListener() { // from class: com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                Function1.this.invoke(obj2);
            }
        });
        final Function0<Unit> function02 = this.$callback;
        addOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                BlockstoreHelper$clearUserIdBackupIfNeeded$1.invokeSuspend$lambda$2(Function0.this, exc);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(Function0 function0, Exception exc) {
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Tried to clear Block store cached UserID but failed: " + exc.getMessage(), exc);
        function0.invoke();
    }
}
