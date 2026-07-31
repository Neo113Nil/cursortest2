package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5057g;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5057g {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsFlow$1", f = "CountdownFlow.kt", l = {30, 33, 34}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$a */
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation continuation) {
            super(2, continuation);
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.d, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0073 -> B:12:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            FlowCollector flowCollector;
            int compare;
            UInt m8054boximpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.a;
                        flowCollector = (FlowCollector) this.c;
                        ResultKt.throwOnFailure(obj);
                        i = UInt.m8055constructorimpl(i - 1);
                        m8054boximpl = UInt.m8054boximpl(i);
                        this.c = flowCollector;
                        this.a = i;
                        this.b = 3;
                        if (flowCollector.emit(m8054boximpl, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                i = this.a;
                flowCollector = (FlowCollector) this.c;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.c;
                i = this.d;
                UInt m8054boximpl2 = UInt.m8054boximpl(i);
                this.c = flowCollector2;
                this.a = i;
                this.b = 1;
                if (flowCollector2.emit(m8054boximpl2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector = flowCollector2;
            }
            compare = Integer.compare(i ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
            if (compare <= 0) {
                this.c = flowCollector;
                this.a = i;
                this.b = 2;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = UInt.m8055constructorimpl(i - 1);
                m8054boximpl = UInt.m8054boximpl(i);
                this.c = flowCollector;
                this.a = i;
                this.b = 3;
                if (flowCollector.emit(m8054boximpl, this) == coroutine_suspended) {
                }
                compare = Integer.compare(i ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
                if (compare <= 0) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsStateFlow$1", f = "CountdownFlow.kt", l = {83, 87, 89}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b */
    public static final class b extends SuspendLambda implements Function2 {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Ref$IntRef d;
        public final /* synthetic */ Flow e;
        public final /* synthetic */ Ref$IntRef f;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$a */
        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ Ref$IntRef a;
            public final /* synthetic */ Ref$ObjectRef<Job> b;
            public final /* synthetic */ ProducerScope c;
            public final /* synthetic */ Ref$IntRef d;

            public a(Ref$IntRef ref$IntRef, Ref$ObjectRef<Job> ref$ObjectRef, ProducerScope producerScope, Ref$IntRef ref$IntRef2) {
                this.a = ref$IntRef;
                this.b = ref$ObjectRef;
                this.c = producerScope;
                this.d = ref$IntRef2;
            }

            public final Object a(boolean z, Continuation continuation) {
                if (z) {
                    b.b(this.a, this.b, this.c, this.d);
                } else {
                    b.c(this.b);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsStateFlow$1$startCountdown$1", f = "CountdownFlow.kt", l = {65}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$b, reason: collision with other inner class name */
        public static final class C1583b extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ Ref$IntRef b;
            public final /* synthetic */ Ref$ObjectRef<Job> c;
            public final /* synthetic */ Ref$IntRef d;
            public final /* synthetic */ ProducerScope e;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$b$a */
            public static final class a<T> implements FlowCollector {
                public final /* synthetic */ Ref$IntRef a;
                public final /* synthetic */ Ref$IntRef b;
                public final /* synthetic */ ProducerScope c;

                public a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, ProducerScope producerScope) {
                    this.a = ref$IntRef;
                    this.b = ref$IntRef2;
                    this.c = producerScope;
                }

                public final Object a(int i, Continuation continuation) {
                    this.a.element = i;
                    Ref$IntRef ref$IntRef = this.b;
                    if (i == ref$IntRef.element) {
                        return Unit.INSTANCE;
                    }
                    ref$IntRef.element = i;
                    Object send = this.c.send(UInt.m8054boximpl(i), continuation);
                    return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((UInt) obj).m8059unboximpl(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1583b(Ref$IntRef ref$IntRef, Ref$ObjectRef<Job> ref$ObjectRef, Ref$IntRef ref$IntRef2, ProducerScope producerScope, Continuation continuation) {
                super(2, continuation);
                this.b = ref$IntRef;
                this.c = ref$ObjectRef;
                this.d = ref$IntRef2;
                this.e = producerScope;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1583b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1583b(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow a2 = C5057g.a(this.b.element);
                        a aVar = new a(this.b, this.d, this.e);
                        this.a = 1;
                        if (a2.collect(aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.c.element = null;
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    this.c.element = null;
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref$IntRef ref$IntRef, Flow flow, Ref$IntRef ref$IntRef2, Continuation continuation) {
            super(2, continuation);
            this.d = ref$IntRef;
            this.e = flow;
            this.f = ref$IntRef2;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [T, kotlinx.coroutines.Job] */
        public static final void b(Ref$IntRef ref$IntRef, Ref$ObjectRef<Job> ref$ObjectRef, ProducerScope producerScope, Ref$IntRef ref$IntRef2) {
            ?? launch$default;
            if (ref$IntRef.element == 0 || ref$ObjectRef.element != null) {
                return;
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new C1583b(ref$IntRef, ref$ObjectRef, ref$IntRef2, producerScope, null), 3, null);
            ref$ObjectRef.element = launch$default;
        }

        public static final void c(Ref$ObjectRef<Job> ref$ObjectRef) {
            Job job = ref$ObjectRef.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            ref$ObjectRef.element = null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.d, this.e, this.f, continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final Ref$ObjectRef ref$ObjectRef;
            ProducerScope producerScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope2 = (ProducerScope) this.c;
                ref$ObjectRef = new Ref$ObjectRef();
                UInt m8054boximpl = UInt.m8054boximpl(this.d.element);
                this.c = producerScope2;
                this.a = ref$ObjectRef;
                this.b = 1;
                if (producerScope2.send(m8054boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.a;
                producerScope = (ProducerScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            Flow flow = this.e;
            if (flow == null) {
                b(this.f, ref$ObjectRef, producerScope, this.d);
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return C5057g.b.b(Ref$ObjectRef.this);
                    }
                };
                this.c = null;
                this.a = null;
                this.b = 2;
                if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Flow distinctUntilChanged = FlowKt.distinctUntilChanged(flow);
                a aVar = new a(this.f, ref$ObjectRef, producerScope, this.d);
                this.c = null;
                this.a = null;
                this.b = 3;
                if (distinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        public static final Unit b(Ref$ObjectRef ref$ObjectRef) {
            c(ref$ObjectRef);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope producerScope, Continuation continuation) {
            return ((b) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public static final Flow a(int i) {
        return FlowKt.flow(new a(i, null));
    }

    public static /* synthetic */ StateFlow a(int i, CoroutineScope coroutineScope, Flow flow, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            flow = null;
        }
        return a(i, coroutineScope, flow);
    }

    @NotNull
    public static final StateFlow a(int i, @NotNull CoroutineScope scope, @Nullable Flow flow) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i;
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = i;
        return FlowKt.stateIn(FlowKt.channelFlow(new b(ref$IntRef2, flow, ref$IntRef, null)), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), UInt.m8054boximpl(i));
    }
}
