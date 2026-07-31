package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@VisibleForTesting
/* loaded from: classes8.dex */
public final class h implements g {
    public static final int h = 8;

    @Nullable
    public final r a;

    @Nullable
    public D d;

    @Nullable
    public Job e;
    public int f;

    @NotNull
    public final String b = "LinearGoNextActionImpl";

    @NotNull
    public final CoroutineScope c = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());

    @NotNull
    public final MutableStateFlow g = StateFlowKt.MutableStateFlow(d.a.c.b);

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearGoNextActionImpl$startTimer$1", f = "LinearGoNextAction.kt", l = {126}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearGoNextActionImpl$startTimer$1$1", f = "LinearGoNextAction.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h$a$a, reason: collision with other inner class name */
        public static final class C1666a extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ int b;
            public final /* synthetic */ h c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1666a(h hVar, Continuation continuation) {
                super(2, continuation);
                this.c = hVar;
            }

            public final Object a(int i, Continuation continuation) {
                return ((C1666a) create(UInt.m8054boximpl(i), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C1666a c1666a = new C1666a(this.c, continuation);
                c1666a.b = ((UInt) obj).m8059unboximpl();
                return c1666a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((UInt) obj).m8059unboximpl(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                d.a b;
                d.a b2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i = this.b;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, this.c.b, "Updating countdown to " + ((Object) UInt.m8058toStringimpl(i)), null, false, 12, null);
                this.c.f = i;
                String str = this.c.b;
                StringBuilder sb = new StringBuilder();
                sb.append("Propagating state: ");
                b = i.b(i);
                sb.append(b);
                MolocoLogger.info$default(molocoLogger, str, sb.toString(), null, false, 12, null);
                MutableStateFlow l = this.c.l();
                b2 = i.b(i);
                l.setValue(b2);
                return Unit.INSTANCE;
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return h.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            StateFlow a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (h.this.d == null) {
                    h.this.d = new D(h.this.f, h.this.c, null);
                } else {
                    D d = h.this.d;
                    if (d != null) {
                        d.a(h.this.f);
                    }
                }
                D d2 = h.this.d;
                if (d2 != null && (a = d2.a()) != null) {
                    C1666a c1666a = new C1666a(h.this, null);
                    this.a = 1;
                    if (FlowKt.collectLatest(a, c1666a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public h(@Nullable r rVar) {
        this.a = rVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void I() {
        l().setValue(d.a.c.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow l() {
        return this.g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void pause() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.b, "Canceling timer", null, false, 12, null);
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void s() {
        int compare;
        compare = Integer.compare(this.f ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            a(this.f & 4294967295L);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void a(int i, int i2) {
        long b;
        int b2;
        double d = (i / i2) * 100;
        if (i >= i2) {
            l().setValue(d.a.C1664a.b);
            return;
        }
        if (this.a == null) {
            l().setValue(d.a.c.b);
            return;
        }
        if (this.e == null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, this.b, "Starting timer", null, false, 12, null);
            r rVar = this.a;
            if (rVar instanceof r.a) {
                MolocoLogger.info$default(molocoLogger, this.b, "Offset Percents detected", null, false, 12, null);
                b2 = i.b(new IntRange((int) d, ((r.a) this.a).b()), i2);
                a(b2 & 4294967295L);
            } else {
                if (rVar instanceof r.b) {
                    MolocoLogger.info$default(molocoLogger, this.b, "Offset Millis detected", null, false, 12, null);
                    b = i.b(((r.b) this.a).b());
                    a(b);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void a(long j) {
        boolean b;
        Job launch$default;
        b = i.b(this.e);
        if (b) {
            this.f = UInt.m8055constructorimpl((int) j);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.b, "Start timer for duration: " + j + " seconds", null, false, 12, null);
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new a(null), 3, null);
            this.e = launch$default;
        }
    }
}
