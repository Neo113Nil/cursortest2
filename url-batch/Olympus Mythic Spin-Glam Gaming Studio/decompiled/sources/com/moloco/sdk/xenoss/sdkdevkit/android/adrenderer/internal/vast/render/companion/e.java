package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e implements d {
    public final int a;

    @NotNull
    public final D b;

    @NotNull
    public final StateFlow c;

    public static final class a implements Flow {
        public final /* synthetic */ Flow a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a, reason: collision with other inner class name */
        public static final class C1648a<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector a;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionGoNextActionImpl$special$$inlined$map$1$2", f = "CompanionGoNextAction.kt", l = {50}, m = "emit")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e$a$a$a, reason: collision with other inner class name */
            public static final class C1649a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;
                public Object c;

                public C1649a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1648a.this.emit(null, this);
                }
            }

            public C1648a(FlowCollector flowCollector) {
                this.a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1649a c1649a;
                int i;
                d.a b;
                if (continuation instanceof C1649a) {
                    c1649a = (C1649a) continuation;
                    int i2 = c1649a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1649a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1649a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1649a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.a;
                            b = f.b(((UInt) obj).m8059unboximpl());
                            c1649a.b = 1;
                            if (flowCollector.emit(b, c1649a) == coroutine_suspended) {
                                return coroutine_suspended;
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
                c1649a = new C1649a(continuation);
                Object obj22 = c1649a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1649a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public a(Flow flow) {
            this.a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.a.collect(new C1648a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, coroutineScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public StateFlow l() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.b.a(this.a);
    }

    public e(int i, CoroutineScope scope) {
        d.a b;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = i;
        D d = new D(i, scope, null);
        this.b = d;
        a aVar = new a(d.a());
        SharingStarted WhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null);
        b = f.b(i);
        this.c = FlowKt.stateIn(aVar, scope, WhileSubscribed$default, b);
    }
}
