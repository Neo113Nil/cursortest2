package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class o implements n {

    @Nullable
    public final y a;

    @Nullable
    public final String b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r d;

    @Nullable
    public final Function0 e;

    @Nullable
    public final Function0 f;

    @NotNull
    public final MutableStateFlow g;

    @NotNull
    public final StateFlow h;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.VastPrivacyIconImpl$1", f = "VastPrivacyIcon.kt", l = {67}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Integer d;
        public final /* synthetic */ Integer e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Integer num, Integer num2, Continuation continuation) {
            super(2, continuation);
            this.c = context;
            this.d = num;
            this.e = num2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            k kVar = null;
            try {
            } catch (Exception unused) {
                if (kVar != null) {
                    kVar.destroy();
                }
                o.this.destroy();
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                y yVar = o.this.a;
                if (yVar != null) {
                    Context context = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = o.this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar = o.this.d;
                    Integer num = this.d;
                    int intValue = num != null ? num.intValue() : 0;
                    Integer num2 = this.e;
                    int intValue2 = num2 != null ? num2.intValue() : 0;
                    Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return o.a.a();
                        }
                    };
                    Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$a$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return o.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                        }
                    };
                    this.a = 1;
                    a = l.a(yVar, context, aVar, rVar, intValue, intValue2, function0, function1, (r24 & 128) != 0 ? false : false, (r24 & 256) != 0 ? null : null, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                o.this.g.setValue(kVar);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a = obj;
            kVar = (k) a;
            o.this.g.setValue(kVar);
            return Unit.INSTANCE;
        }

        public static final Unit a() {
            return Unit.INSTANCE;
        }

        public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            return Unit.INSTANCE;
        }
    }

    public static final class b implements Flow {
        public final /* synthetic */ Flow a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector a;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.VastPrivacyIconImpl$special$$inlined$map$1$2", f = "VastPrivacyIcon.kt", l = {50}, m = "emit")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$b$a$a, reason: collision with other inner class name */
            public static final class C1667a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;
                public Object c;

                public C1667a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1667a c1667a;
                int i;
                if (continuation instanceof C1667a) {
                    c1667a = (C1667a) continuation;
                    int i2 = c1667a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1667a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1667a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1667a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.a;
                            k kVar = (k) obj;
                            j k = kVar != null ? kVar.k() : null;
                            c1667a.b = 1;
                            if (flowCollector.emit(k, c1667a) == coroutine_suspended) {
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
                c1667a = new C1667a(continuation);
                Object obj22 = c1667a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1667a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public b(Flow flow) {
            this.a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.a.collect(new a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public o(@Nullable y yVar, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @NotNull CoroutineScope scope, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @Nullable Function0 function0, @Nullable Function0 function02) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.a = yVar;
        this.b = str;
        this.c = customUserEventBuilderService;
        this.d = externalLinkHandler;
        this.e = function0;
        this.f = function02;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.g = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(context, num, num2, null), 3, null);
        this.h = FlowKt.stateIn(new b(MutableStateFlow), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    @NotNull
    public StateFlow O() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        MutableStateFlow mutableStateFlow = this.g;
        k kVar = (k) mutableStateFlow.getValue();
        if (kVar != null) {
            kVar.destroy();
        }
        mutableStateFlow.setValue(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void i() {
        Function0 function0 = this.f;
        if (function0 != null) {
            function0.mo4828invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void u() {
        String str = this.b;
        if (str != null) {
            Function0 function0 = this.e;
            if (function0 != null) {
                function0.mo4828invoke();
            }
            this.d.a(str);
        }
    }
}
