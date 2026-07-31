package io.intercom.android.sdk.utilities;

import android.content.Context;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: FirstMessageUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1", f = "FirstMessageUtils.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class FirstMessageUtilsKt$handleFirstMessageToast$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ IntercomDataLayer $dataLayer;
    final /* synthetic */ Twig $twig;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FirstMessageUtilsKt$handleFirstMessageToast$1(IntercomDataLayer intercomDataLayer, Twig twig, Context context, Continuation<? super FirstMessageUtilsKt$handleFirstMessageToast$1> continuation) {
        super(2, continuation);
        this.$dataLayer = intercomDataLayer;
        this.$twig = twig;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FirstMessageUtilsKt$handleFirstMessageToast$1(this.$dataLayer, this.$twig, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FirstMessageUtilsKt$handleFirstMessageToast$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final SharedFlow<IntercomEvent> event = this.$dataLayer.getEvent();
            this.label = 1;
            if (new Flow<Object>() { // from class: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "FirstMessageUtils.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    /* renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (obj instanceof IntercomEvent.BaseResponseReceived) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            }.collect(new AnonymousClass1(this.$twig, this.$context), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FirstMessageUtils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ Context $context;
        final /* synthetic */ Twig $twig;

        AnonymousClass1(Twig twig, Context context) {
            this.$twig = twig;
            this.$context = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(IntercomEvent.BaseResponseReceived baseResponseReceived, Continuation<? super Unit> continuation) {
            FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1;
            int i;
            AnonymousClass1<T> anonymousClass1;
            if (continuation instanceof FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) {
                firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = (FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) continuation;
                if ((firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label -= Integer.MIN_VALUE;
                    Object obj = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (baseResponseReceived.getBaseResponse().getConfig().isFirstRequest()) {
                            this.$twig.i(this.$context.getString(R.string.intercom_android_activated_message), new Object[0]);
                            try {
                                MainCoroutineDispatcher main = Dispatchers.getMain();
                                C01371 c01371 = new C01371(this.$context, null);
                                firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.L$0 = this;
                                firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label = 1;
                                if (BuildersKt.withContext(main, c01371, firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } catch (Exception e) {
                                e = e;
                                anonymousClass1 = this;
                                anonymousClass1.$twig.internal("Couldn't show first message toast: " + e.getMessage());
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        anonymousClass1 = (AnonymousClass1) firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e2) {
                            e = e2;
                            anonymousClass1.$twig.internal("Couldn't show first message toast: " + e.getMessage());
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = new FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(this, continuation);
            Object obj2 = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((IntercomEvent.BaseResponseReceived) obj, (Continuation<? super Unit>) continuation);
        }

        /* compiled from: FirstMessageUtils.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1", f = "FirstMessageUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01371(Context context, Continuation<? super C01371> continuation) {
                super(2, continuation);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01371(this.$context, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FirstMessageUtilsKt.showFirstMessageToast(this.$context);
                return Unit.INSTANCE;
            }
        }
    }
}
