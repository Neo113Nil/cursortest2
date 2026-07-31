package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes13.dex */
public final class D {
    public static final int d = 8;

    @NotNull
    public final CoroutineScope a;

    @NotNull
    public final MutableStateFlow b;

    @NotNull
    public final StateFlow c;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ResettableCountdownSecondsStateFlow$countdownSecondsStateFlow$1", f = "CountdownFlow.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ResettableCountdownSecondsStateFlow$countdownSecondsStateFlow$1$1", f = "CountdownFlow.kt", l = {123}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D$a$a, reason: collision with other inner class name */
        public static final class C1564a extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ ProducerScope c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D$a$a$a, reason: collision with other inner class name */
            public static final class C1565a<T> implements FlowCollector {
                public final /* synthetic */ ProducerScope a;

                public C1565a(ProducerScope producerScope) {
                    this.a = producerScope;
                }

                public final Object a(int i, Continuation continuation) {
                    Object send = this.a.send(UInt.m8054boximpl(i), continuation);
                    return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((UInt) obj).m8059unboximpl(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1564a(ProducerScope producerScope, Continuation continuation) {
                super(2, continuation);
                this.c = producerScope;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(StateFlow stateFlow, Continuation continuation) {
                return ((C1564a) create(stateFlow, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C1564a c1564a = new C1564a(this.c, continuation);
                c1564a.b = obj;
                return c1564a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlow = (StateFlow) this.b;
                    C1565a c1565a = new C1565a(this.c);
                    this.a = 1;
                    if (stateFlow.collect(c1565a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope producerScope, Continuation continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = D.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.b;
                MutableStateFlow mutableStateFlow = D.this.b;
                C1564a c1564a = new C1564a(producerScope, null);
                this.a = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c1564a, this) == coroutine_suspended) {
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
    }

    public /* synthetic */ D(int i, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, coroutineScope);
    }

    public D(int i, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = scope;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(C5057g.a(i, scope, null, 4, null));
        this.b = MutableStateFlow;
        this.c = FlowKt.stateIn(FlowKt.channelFlow(new a(null)), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), ((StateFlow) MutableStateFlow.getValue()).getValue());
    }

    public final void a(int i) {
        this.b.setValue(C5057g.a(i, this.a, null, 4, null));
    }

    @NotNull
    public final StateFlow a() {
        return this.c;
    }
}
