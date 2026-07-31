package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes11.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements Flow {
    final /* synthetic */ int $count$inlined;
    final /* synthetic */ Flow $this_take$inlined;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(Flow flow, int i) {
        this.$this_take$inlined = flow;
        this.$count$inlined = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        AbortFlowException e;
        Object obj;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = anonymousClass1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Object obj3 = new Object();
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    try {
                        Flow flow = this.$this_take$inlined;
                        FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1 = new FlowKt__LimitKt$take$2$1(ref$IntRef, this.$count$inlined, flowCollector, obj3);
                        anonymousClass1.L$0 = obj3;
                        anonymousClass1.label = 1;
                        if (flow.collect(flowKt__LimitKt$take$2$1, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (AbortFlowException e2) {
                        e = e2;
                        obj = obj3;
                        FlowExceptions_commonKt.checkOwnership(e, obj);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = anonymousClass1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        FlowExceptions_commonKt.checkOwnership(e, obj);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        anonymousClass1 = new AnonymousClass1(continuation);
        Object obj22 = anonymousClass1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
