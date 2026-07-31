package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* compiled from: Limit.kt */
/* loaded from: classes14.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2 implements FlowCollector {
    final /* synthetic */ Function2 $predicate$inlined;
    final /* synthetic */ Ref$ObjectRef $result$inlined;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(Function2 function2, Ref$ObjectRef ref$ObjectRef) {
        this.$predicate$inlined = function2;
        this.$result$inlined = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        Object obj2;
        int i;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        T t;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                obj2 = anonymousClass1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Function2 function2 = this.$predicate$inlined;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = obj;
                    anonymousClass1.label = 1;
                    InlineMarker.mark(6);
                    obj2 = function2.invoke(obj, anonymousClass1);
                    InlineMarker.mark(7);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = this;
                    t = obj;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = anonymousClass1.L$1;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    t = obj3;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Unit.INSTANCE;
                }
                flowKt__ReduceKt$first$$inlined$collectWhile$2.$result$inlined.element = t;
                throw new AbortFlowException(flowKt__ReduceKt$first$$inlined$collectWhile$2);
            }
        }
        anonymousClass1 = new AnonymousClass1(continuation);
        obj2 = anonymousClass1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.label;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
