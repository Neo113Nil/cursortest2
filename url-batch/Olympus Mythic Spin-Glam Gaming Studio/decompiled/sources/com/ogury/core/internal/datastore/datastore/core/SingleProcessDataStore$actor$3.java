package com.ogury.core.internal.datastore.datastore.core;

import com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "msg", "Lcom/ogury/core/internal/datastore/datastore/core/SingleProcessDataStore$Message;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ogury.core.internal.datastore.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 229}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$actor$3 extends SuspendLambda implements Function2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<T> singleProcessDataStore, Continuation continuation) {
        super(2, continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, continuation);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SingleProcessDataStore.Message<T> message, @Nullable Continuation continuation) {
        return ((SingleProcessDataStore$actor$3) create(message, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r5 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handleUpdate;
        Object handleRead;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SingleProcessDataStore.Message message = (SingleProcessDataStore.Message) this.L$0;
            if (message instanceof SingleProcessDataStore.Message.Read) {
                this.label = 1;
                handleRead = this.this$0.handleRead((SingleProcessDataStore.Message.Read) message, this);
            } else if (message instanceof SingleProcessDataStore.Message.Update) {
                this.label = 2;
                handleUpdate = this.this$0.handleUpdate((SingleProcessDataStore.Message.Update) message, this);
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
