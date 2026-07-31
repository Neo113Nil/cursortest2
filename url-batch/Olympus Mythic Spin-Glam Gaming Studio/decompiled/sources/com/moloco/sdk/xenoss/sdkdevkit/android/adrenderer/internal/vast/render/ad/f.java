package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes9.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a {
    public static final int l = 8;

    @NotNull
    public final List<k> a;

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h b;

    @NotNull
    public final CoroutineScope c;

    @NotNull
    public final MutableStateFlow d;

    @NotNull
    public final StateFlow e;

    @NotNull
    public final StateFlow f;

    @NotNull
    public final Flow g;

    @NotNull
    public final StateFlow h;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c i;

    @NotNull
    public final MutableSharedFlow j;

    @NotNull
    public final Flow k;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$1", f = "AdPlaylistControllerImpl.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$a$a, reason: collision with other inner class name */
        public static final class C1640a<T> implements FlowCollector {
            public final /* synthetic */ Ref$ObjectRef<d.a> a;
            public final /* synthetic */ f b;

            public C1640a(Ref$ObjectRef<d.a> ref$ObjectRef, f fVar) {
                this.a = ref$ObjectRef;
                this.b = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(d.a aVar, Continuation continuation) {
                if ((this.a.element instanceof d.a.b) && (aVar instanceof d.a.C1664a)) {
                    this.b.a(b.j.b);
                }
                this.a.element = aVar;
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
            return f.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                StateFlow l = f.this.l();
                C1640a c1640a = new C1640a(ref$ObjectRef, f.this);
                this.a = 1;
                if (l.collect(c1640a, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$2", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, Continuation continuation) {
            super(2, continuation);
            this.d = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, Continuation continuation) {
            return ((b) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = f.this.new b(this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b) this.b;
            if (bVar instanceof b.d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.b;
                if (hVar != null) {
                    hVar.a(x.j);
                }
                f.this.a(new b.f(((b.d) bVar).b()));
            } else if (bVar instanceof b.a) {
                f.this.a(b.a.b);
            } else if (bVar instanceof b.c) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar2 = f.this.b;
                if (hVar2 != null) {
                    Boxing.boxBoolean(hVar2.b());
                }
                f.this.a(b.C1639b.b);
            } else {
                if (!(bVar instanceof b.C1647b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((k.a) this.d).a().destroy();
                Unit unit = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$3", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar, Continuation continuation) {
            return ((c) create(dVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = f.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d) this.b;
            if (dVar instanceof d.C1665d) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.b;
                if (hVar != null) {
                    hVar.a(x.g);
                }
                f.this.a(new b.f(((d.C1665d) dVar).b()));
            } else if (Intrinsics.areEqual(dVar, d.a.b)) {
                f.this.a(b.a.b);
            } else if (Intrinsics.areEqual(dVar, d.e.b)) {
                f.this.a(b.i.b);
                f.this.T();
                Unit unit = Unit.INSTANCE;
            } else if (Intrinsics.areEqual(dVar, d.b.b)) {
                f.this.a(b.c.b);
                Boxing.boxBoolean(f.this.S());
            } else {
                if (!Intrinsics.areEqual(dVar, d.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar2 = f.this.b;
                if (hVar2 != null) {
                    Boxing.boxBoolean(hVar2.b());
                }
                f.this.a(b.g.b);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$4", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.values().length];
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b.a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b bVar, Continuation continuation) {
            return ((d) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = f.this.new d(continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = a.a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.b) this.b).ordinal()];
            if (i == 1) {
                f.this.a(b.a.b);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = f.this.b;
                if (hVar != null) {
                    Boxing.boxBoolean(hVar.b());
                }
                f.this.a(b.d.b);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$5", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Continuation continuation) {
            return ((e) create(lVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = f.this.new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = a.a[((l) this.b).ordinal()];
            if (i == 1) {
                f.this.a(b.i.b);
                f.this.T();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f.this.a(b.a.b);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$canReplay$1", f = "AdPlaylistControllerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$f, reason: collision with other inner class name */
    public static final class C1641f extends SuspendLambda implements Function3 {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public C1641f(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Boolean bool, Continuation continuation) {
            C1641f c1641f = f.this.new C1641f(continuation);
            c1641f.b = kVar;
            c1641f.c = bool;
            return c1641f.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r0, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) == false) goto L12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            k kVar = (k) this.b;
            Boolean bool = (Boolean) this.c;
            boolean z = kVar != null && Intrinsics.areEqual(kVar, CollectionsKt.last(f.this.a));
            return Boxing.boxBoolean(z);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$onEvent$1", f = "AdPlaylistControllerImpl.kt", l = {261}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b b;
        public final /* synthetic */ f c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, f fVar, Continuation continuation) {
            super(2, continuation);
            this.b = bVar;
            this.c = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a, "Emitting event: " + this.b, null, false, 12, null);
                MutableSharedFlow mutableSharedFlow = this.c.j;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = this.b;
                this.a = 1;
                if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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

    public static final class h implements Flow {
        public final /* synthetic */ Flow a;
        public final /* synthetic */ f b;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector a;
            public final /* synthetic */ f b;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$special$$inlined$map$1$2", f = "AdPlaylistControllerImpl.kt", l = {50}, m = "emit")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$h$a$a, reason: collision with other inner class name */
            public static final class C1642a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;
                public Object c;

                public C1642a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, f fVar) {
                this.a = flowCollector;
                this.b = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1642a c1642a;
                int i;
                Object obj2;
                if (continuation instanceof C1642a) {
                    c1642a = (C1642a) continuation;
                    int i2 = c1642a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1642a.b = i2 - Integer.MIN_VALUE;
                        Object obj3 = c1642a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1642a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj3);
                            FlowCollector flowCollector = this.a;
                            k kVar = (k) obj;
                            boolean areEqual = Intrinsics.areEqual(CollectionsKt.lastOrNull(this.b.a), kVar);
                            if (kVar instanceof k.a) {
                                obj2 = new i.a.C1646a(((k.a) kVar).a(), areEqual);
                            } else if (kVar instanceof k.c) {
                                obj2 = new i.a.c(((k.c) kVar).a(), areEqual);
                            } else if (kVar instanceof k.b) {
                                obj2 = new i.a.b(((k.b) kVar).a(), areEqual);
                            } else if (kVar instanceof k.d) {
                                obj2 = new i.a.d(((k.d) kVar).a(), areEqual);
                            } else {
                                if (kVar != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                obj2 = null;
                            }
                            c1642a.b = 1;
                            if (flowCollector.emit(obj2, c1642a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1642a = new C1642a(continuation);
                Object obj32 = c1642a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1642a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public h(Flow flow, f fVar) {
            this.a = flow;
            this.b = fVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.a.collect(new a(flowCollector, this.b), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class i implements Flow {
        public final /* synthetic */ Flow a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector a;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImpl$special$$inlined$map$2$2", f = "AdPlaylistControllerImpl.kt", l = {50}, m = "emit")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.f$i$a$a, reason: collision with other inner class name */
            public static final class C1643a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;
                public Object c;

                public C1643a(Continuation continuation) {
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
                C1643a c1643a;
                int i;
                boolean z;
                if (continuation instanceof C1643a) {
                    c1643a = (C1643a) continuation;
                    int i2 = c1643a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1643a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1643a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1643a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.a;
                            k kVar = (k) obj;
                            if (kVar instanceof k.a) {
                                z = ((k.a) kVar).a().J();
                            } else if (kVar instanceof k.c) {
                                z = ((k.c) kVar).a().J();
                            } else {
                                if (!(kVar instanceof k.b) && !(kVar instanceof k.d) && kVar != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z = false;
                            }
                            Boolean boxBoolean = Boxing.boxBoolean(z);
                            c1643a.b = 1;
                            if (flowCollector.emit(boxBoolean, c1643a) == coroutine_suspended) {
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
                c1643a = new C1643a(continuation);
                Object obj22 = c1643a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1643a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public i(Flow flow) {
            this.a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.a.collect(new a(flowCollector), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull List<? extends k> playlist, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar) {
        Flow b2;
        Flow onEach;
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        this.a = playlist;
        this.b = hVar;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.c = CoroutineScope;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.d = MutableStateFlow;
        h hVar2 = new h(MutableStateFlow, this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.e = FlowKt.stateIn(hVar2, CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), null);
        i iVar = new i(MutableStateFlow);
        SharingStarted WhileSubscribed$default = SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null);
        Boolean bool = Boolean.FALSE;
        this.f = FlowKt.stateIn(iVar, CoroutineScope, WhileSubscribed$default, bool);
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b(MutableStateFlow, CoroutineScope);
        this.g = b2;
        this.h = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, b2, new C1641f(null)), CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), bool);
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e.a(MutableStateFlow, CoroutineScope);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.j = MutableSharedFlow$default;
        this.k = MutableSharedFlow$default;
        for (k kVar : playlist) {
            if (kVar instanceof k.a) {
                onEach = FlowKt.onEach(((k.a) kVar).a().a(), new b(kVar, null));
            } else if (kVar instanceof k.c) {
                onEach = FlowKt.onEach(((k.c) kVar).a().a(), new c(null));
            } else if (kVar instanceof k.b) {
                onEach = FlowKt.onEach(((k.b) kVar).a().a(), new d(null));
            } else {
                if (!(kVar instanceof k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                onEach = FlowKt.onEach(((k.d) kVar).a().a(), new e(null));
            }
            FlowKt.launchIn(onEach, this.c);
        }
    }

    public static Object f(f fVar) {
        return Reflection.property0(new PropertyReference0Impl(fVar.i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void A() {
        k kVar = (k) this.d.getValue();
        if (kVar instanceof k.a) {
            ((k.a) kVar).a().b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
            return;
        }
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
            return;
        }
        if (kVar instanceof k.b) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a, "Empty CTA DEC playlist item reached", null, false, 12, null);
        } else if (kVar instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a, "Empty CTA Mraid playlist item reached", null, false, 12, null);
        } else {
            if (kVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a, "Empty CTA playlist item reached", null, false, 12, null);
        }
    }

    public final void J() {
        k kVar = (k) CollectionsKt.firstOrNull((List) this.a);
        if (kVar == null) {
            return;
        }
        a(kVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    @NotNull
    public StateFlow P() {
        return this.h;
    }

    public final boolean S() {
        List<k> list = this.a;
        k kVar = (k) CollectionsKt.getOrNull(list, CollectionsKt.indexOf((List) list, this.d.getValue()) + 1);
        if (kVar == null) {
            return false;
        }
        a(kVar);
        return true;
    }

    public final void T() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a b2;
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((List<? extends k>) this.a, (k) this.d.getValue());
        if (b2 != null) {
            b2.t();
        }
        if (S()) {
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h hVar = this.b;
        if (hVar != null) {
            hVar.a();
        }
        a(b.e.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.c, null, 1, null);
        for (k kVar : this.a) {
            if (kVar instanceof k.a) {
                ((k.a) kVar).a().destroy();
            } else if (kVar instanceof k.c) {
                ((k.c) kVar).a().destroy();
            } else if (kVar instanceof k.b) {
                ((k.b) kVar).a().destroy();
            } else {
                if (!(kVar instanceof k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((k.d) kVar).a().destroy();
            }
        }
        a((k) null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    @NotNull
    public StateFlow k() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    @NotNull
    public StateFlow l() {
        return this.i.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    @NotNull
    public StateFlow n() {
        return this.f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void x() {
        if (l().getValue() instanceof d.a.C1664a) {
            Object value = this.d.getValue();
            k.c cVar = value instanceof k.c ? (k.c) value : null;
            if (cVar != null) {
                cVar.a().h();
            } else {
                T();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i
    public void z() {
        J();
        a(b.h.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    public void d() {
        J();
    }

    public final void a(k kVar) {
        this.d.setValue(kVar);
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().r();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a
    @NotNull
    public Flow a() {
        return this.k;
    }

    public final Job a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new g(bVar, this, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c button) {
        a.AbstractC1677a.c b2;
        Intrinsics.checkNotNullParameter(button, "button");
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((List<? extends k>) this.a, (k) this.d.getValue(), button);
        k kVar = (k) this.d.getValue();
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().a(b2);
            return;
        }
        if (kVar instanceof k.a) {
            ((k.a) kVar).a().a(b2);
            return;
        }
        if (kVar instanceof k.b) {
            ((k.b) kVar).a().a(b2);
            return;
        }
        if (kVar instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a, "Empty onButtonRendered MRAID playlist item reached", null, false, 12, null);
            return;
        }
        if (kVar == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a, "Displaying " + b2.d() + " at position: " + b2.e() + " of size: " + b2.f() + " in unknown playlist item type", null, false, 12, null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        a.AbstractC1677a.c.EnumC1679a b2;
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((List<? extends k>) this.a, (k) this.d.getValue(), buttonType);
        k kVar = (k) this.d.getValue();
        if (kVar instanceof k.c) {
            ((k.c) kVar).a().a(b2);
            return;
        }
        if (kVar instanceof k.a) {
            ((k.a) kVar).a().a(b2);
            return;
        }
        if (kVar instanceof k.b) {
            ((k.b) kVar).a().a(b2);
            return;
        }
        if (kVar instanceof k.d) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a, "Empty onButtonUnRendered MRAID playlist item reached", null, false, 12, null);
            return;
        }
        if (kVar == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a, "Unrendering " + b2 + " in unknown playlist item type", null, false, 12, null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
