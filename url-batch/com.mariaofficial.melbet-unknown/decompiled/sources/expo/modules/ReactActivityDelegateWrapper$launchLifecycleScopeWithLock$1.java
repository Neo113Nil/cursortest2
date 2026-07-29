package expo.modules;

import androidx.core.app.FrameMetricsAggregator;
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

/* compiled from: ReactActivityDelegateWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1", f = "ReactActivityDelegateWrapper.kt", i = {0, 0, 1}, l = {FrameMetricsAggregator.EVERY_DURATION, 485}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes2.dex */
final class ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ReactActivityDelegateWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1(ReactActivityDelegateWrapper reactActivityDelegateWrapper, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1> continuation) {
        super(2, continuation);
        this.this$0 = reactActivityDelegateWrapper;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1 reactActivityDelegateWrapper$launchLifecycleScopeWithLock$1 = new ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1(this.this$0, this.$block, continuation);
        reactActivityDelegateWrapper$launchLifecycleScopeWithLock$1.L$0 = obj;
        return reactActivityDelegateWrapper$launchLifecycleScopeWithLock$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactActivityDelegateWrapper$launchLifecycleScopeWithLock$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r9.lock(null, r8) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Mutex mutex;
        Function2<CoroutineScope, Continuation<? super Unit>, Object> function2;
        Mutex mutex2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                mutex = this.this$0.mutex;
                function2 = this.$block;
                this.L$0 = coroutineScope;
                this.L$1 = mutex;
                this.L$2 = function2;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
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
            if (function2.invoke(coroutineScope, this) != coroutine_suspended) {
                mutex2 = mutex;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
