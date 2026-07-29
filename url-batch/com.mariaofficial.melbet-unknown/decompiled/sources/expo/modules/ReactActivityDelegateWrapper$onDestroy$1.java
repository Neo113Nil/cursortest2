package expo.modules;

import android.util.Log;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.react.ReactActivity;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: ReactActivityDelegateWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.ReactActivityDelegateWrapper$onDestroy$1", f = "ReactActivityDelegateWrapper.kt", i = {0, 1}, l = {FrameMetricsAggregator.EVERY_DURATION, 242}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class ReactActivityDelegateWrapper$onDestroy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ReactActivityDelegateWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactActivityDelegateWrapper$onDestroy$1(ReactActivityDelegateWrapper reactActivityDelegateWrapper, Continuation<? super ReactActivityDelegateWrapper$onDestroy$1> continuation) {
        super(2, continuation);
        this.this$0 = reactActivityDelegateWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactActivityDelegateWrapper$onDestroy$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactActivityDelegateWrapper$onDestroy$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x004b, code lost:
    
        if (r7.lock(null, r6) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071 A[Catch: all -> 0x001b, LOOP:0: B:9:0x006b->B:11:0x0071, LOOP_END, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0017, B:8:0x0061, B:9:0x006b, B:11:0x0071, B:13:0x0081, B:22:0x0087, B:16:0x00a9, B:15:0x00a2, B:25:0x0092), top: B:6:0x0017, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0017, B:8:0x0061, B:9:0x006b, B:11:0x0071, B:13:0x0081, B:22:0x0087, B:16:0x00a9, B:15:0x00a2, B:25:0x0092), top: B:6:0x0017, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        ReactActivityDelegateWrapper reactActivityDelegateWrapper;
        Mutex mutex2;
        Throwable th;
        CompletableDeferred completableDeferred;
        ReactActivityDelegateWrapper reactActivityDelegateWrapper2;
        List<ReactActivityLifecycleListener> list;
        ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler;
        String str;
        ReactActivity reactActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.this$0.mutex;
                reactActivityDelegateWrapper = this.this$0;
                this.L$0 = mutex;
                this.L$1 = reactActivityDelegateWrapper;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    reactActivityDelegateWrapper2 = (ReactActivityDelegateWrapper) this.L$1;
                    mutex2 = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        list = reactActivityDelegateWrapper2.reactActivityLifecycleListeners;
                        for (ReactActivityLifecycleListener reactActivityLifecycleListener : list) {
                            reactActivity = reactActivityDelegateWrapper2.activity;
                            reactActivityLifecycleListener.onDestroy(reactActivity);
                        }
                        delayLoadAppHandler = reactActivityDelegateWrapper2.getDelayLoadAppHandler();
                        if (delayLoadAppHandler == null) {
                            try {
                                reactActivityDelegateWrapper2.getDelegate().onDestroy();
                                Unit unit = Unit.INSTANCE;
                            } catch (Exception e) {
                                str = ReactActivityDelegateWrapper.TAG;
                                Boxing.boxInt(Log.e(str, "Exception occurred during onDestroy with delayed app loading", e));
                            }
                        } else {
                            reactActivityDelegateWrapper2.getDelegate().onDestroy();
                        }
                        Unit unit2 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                reactActivityDelegateWrapper = (ReactActivityDelegateWrapper) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                mutex = mutex3;
            }
            completableDeferred = reactActivityDelegateWrapper.loadAppReady;
            this.L$0 = mutex;
            this.L$1 = reactActivityDelegateWrapper;
            this.label = 2;
            if (completableDeferred.await(this) != coroutine_suspended) {
                reactActivityDelegateWrapper2 = reactActivityDelegateWrapper;
                mutex2 = mutex;
                list = reactActivityDelegateWrapper2.reactActivityLifecycleListeners;
                while (r7.hasNext()) {
                }
                delayLoadAppHandler = reactActivityDelegateWrapper2.getDelayLoadAppHandler();
                if (delayLoadAppHandler == null) {
                }
                Unit unit22 = Unit.INSTANCE;
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
