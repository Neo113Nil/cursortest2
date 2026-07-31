package com.ogury.core.internal.datastore.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ogury.core.internal.datastore.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {112, 112}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class SimpleActor$offer$2 extends SuspendLambda implements Function2 {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, Continuation continuation) {
        super(2, continuation);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new SimpleActor$offer$2(this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if (r6 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        AtomicInteger atomicInteger;
        Function2 function2;
        CoroutineScope coroutineScope;
        AtomicInteger atomicInteger2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            atomicInteger = ((SimpleActor) this.this$0).remainingMessages;
            if (atomicInteger.get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            coroutineScope = ((SimpleActor) this.this$0).scope;
            CoroutineScopeKt.ensureActive(coroutineScope);
            function2 = ((SimpleActor) this.this$0).consumeMessage;
            Channel channel = ((SimpleActor) this.this$0).messageQueue;
            this.L$0 = function2;
            this.label = 1;
            obj = channel.receive(this);
        } else if (i == 1) {
            function2 = (Function2) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            atomicInteger2 = ((SimpleActor) this.this$0).remainingMessages;
            if (atomicInteger2.decrementAndGet() == 0) {
                return Unit.INSTANCE;
            }
            coroutineScope = ((SimpleActor) this.this$0).scope;
            CoroutineScopeKt.ensureActive(coroutineScope);
            function2 = ((SimpleActor) this.this$0).consumeMessage;
            Channel channel2 = ((SimpleActor) this.this$0).messageQueue;
            this.L$0 = function2;
            this.label = 1;
            obj = channel2.receive(this);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((SimpleActor$offer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
