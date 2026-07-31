package com.revenuecat.purchases.blockstore;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.identity.IdentityManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BlockstoreHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1", f = "BlockstoreHelper.kt", i = {}, l = {87, 100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ String $currentUserId;
    int label;
    final /* synthetic */ BlockstoreHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1(BlockstoreHelper blockstoreHelper, String str, Function0<Unit> function0, Continuation<? super BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = blockstoreHelper;
        this.$currentUserId = str;
        this.$callback = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1(this.this$0, this.$currentUserId, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (r10.aliasCurrentUserIdTo(r3, r9) == r2) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        IdentityManager identityManager;
        byte[] bytes;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
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
                        BlockstoreHelper.aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(this.this$0, this.$callback);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                RetrieveBytesResponse.BlockstoreData blockstoreData = (RetrieveBytesResponse.BlockstoreData) ((Map) obj).get(BlockstoreHelper.BLOCKSTORE_USER_ID_KEY);
                String str = (blockstoreData == null || (bytes = blockstoreData.getBytes()) == null) ? null : new String(bytes, Charsets.UTF_8);
                if (str == null || Intrinsics.areEqual(str, this.$currentUserId)) {
                    BlockstoreHelper.aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(this.this$0, this.$callback);
                    return Unit.INSTANCE;
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Aliasing Blockstore user ID: " + str + " with current UserID");
                }
                identityManager = this.this$0.identityManager;
                this.label = 2;
            } catch (Exception e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to retrieve Block store data. Will not recover userId. Error: " + e.getMessage(), e);
                BlockstoreHelper.aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(this.this$0, this.$callback);
                return Unit.INSTANCE;
            }
        } catch (PurchasesException e2) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to alias Block store user ID: " + e2.getMessage() + ". Underlying error: " + e2.getUnderlyingErrorMessage() + ". Any purchases on previous anonymous user will not be recovered.", e2);
            BlockstoreHelper.aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(this.this$0, this.$callback);
            return Unit.INSTANCE;
        }
    }
}
