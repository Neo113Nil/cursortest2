package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5054d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5059h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.U;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class l {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt", f = "PreparedVastResource.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER, 140}, m = "prepareVastResource")
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public boolean i;
        public /* synthetic */ Object j;
        public int k;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return l.a(null, null, null, null, 0, 0, null, null, false, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$2", f = "PreparedVastResource.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Ref$ObjectRef<String> b;
        public final /* synthetic */ y c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref$ObjectRef<String> ref$ObjectRef, y yVar, Continuation continuation) {
            super(2, continuation);
            this.b = ref$ObjectRef;
            this.c = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.b, this.c, continuation);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.element = l.a(this.c);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
        public final /* synthetic */ Integer a;
        public final /* synthetic */ Ref$ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m> b;
        public final /* synthetic */ Ref$ObjectRef<C5054d> c;
        public final /* synthetic */ Ref$ObjectRef<CoroutineScope> d;

        public c(Integer num, Ref$ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m> ref$ObjectRef, Ref$ObjectRef<C5054d> ref$ObjectRef2, Ref$ObjectRef<CoroutineScope> ref$ObjectRef3) {
            this.a = num;
            this.b = ref$ObjectRef;
            this.c = ref$ObjectRef2;
            this.d = ref$ObjectRef3;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void destroy() {
            Integer num = this.a;
            if (num != null) {
                U.a.b(num.intValue());
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar = this.b.element;
            if (mVar != null) {
                mVar.destroy();
            }
            this.b.element = null;
            C5054d c5054d = this.c.element;
            if (c5054d != null) {
                c5054d.destroy();
            }
            this.c.element = null;
            CoroutineScope coroutineScope = this.d.element;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
            this.d.element = null;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$1", f = "PreparedVastResource.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Function0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation continuation) {
            return ((d) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.mo4828invoke();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$2", f = "PreparedVastResource.kt", l = {109}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a b;
        public final /* synthetic */ Function1 c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$2$1", f = "PreparedVastResource.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ Object b;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation continuation) {
                return ((a) create(gVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.b) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.b = aVar;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow unrecoverableError = this.b.getUnrecoverableError();
                a aVar = new a(null);
                this.a = 1;
                obj = FlowKt.first(unrecoverableError, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
            if (gVar != null) {
                this.c.invoke(gVar);
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public static final j a(@NotNull y yVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar instanceof y.c) {
            y.c cVar = (y.c) yVar;
            if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.a) {
                return new j.b(cVar.a().b(), i, i2);
            }
        }
        return null;
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    @Nullable
    public static final String a(@NotNull y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar instanceof y.a) {
            y.a aVar = (y.a) yVar;
            if (C5059h.a.a(aVar.a().a())) {
                return aVar.a().a();
            }
        } else if (yVar instanceof y.b) {
            y.b bVar = (y.b) yVar;
            if (C5059h.a.a(bVar.a().a())) {
                return bVar.a().a();
            }
        } else if (yVar instanceof y.c) {
            y.c cVar = (y.c) yVar;
            if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b && C5059h.a.a(cVar.a().b())) {
                return cVar.a().b();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull y yVar, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, int i, int i2, @NotNull Function0 function0, @NotNull Function1 function1, boolean z, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, @NotNull Continuation continuation) {
        a aVar2;
        int i3;
        Ref$ObjectRef ref$ObjectRef;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar2;
        Function1 function12;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar2;
        y yVar2;
        boolean z2;
        Context context2;
        Function0 function02;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        String str;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        Ref$ObjectRef ref$ObjectRef7;
        C5054d c5054d;
        Integer boxInt;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i4 = aVar2.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar2.k = i4 - Integer.MIN_VALUE;
                Object obj = aVar2.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = aVar2.k;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    j a2 = a(yVar, i, i2);
                    if (a2 != null) {
                        return new k(a2, null);
                    }
                    ref$ObjectRef = new Ref$ObjectRef();
                    CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    b bVar = new b(ref$ObjectRef, yVar, null);
                    aVar2.a = yVar;
                    aVar2.b = context;
                    aVar3 = aVar;
                    aVar2.c = aVar3;
                    rVar2 = rVar;
                    aVar2.d = rVar2;
                    aVar2.e = function0;
                    aVar2.f = function1;
                    aVar2.g = kVar;
                    aVar2.h = ref$ObjectRef;
                    aVar2.i = z;
                    aVar2.k = 1;
                    if (BuildersKt.withContext(coroutineContext, bVar, aVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function12 = function1;
                    kVar2 = kVar;
                    yVar2 = yVar;
                    z2 = z;
                    context2 = context;
                    function02 = function0;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ref$ObjectRef7 = (Ref$ObjectRef) aVar2.c;
                        ref$ObjectRef6 = (Ref$ObjectRef) aVar2.b;
                        ref$ObjectRef5 = (Ref$ObjectRef) aVar2.a;
                        ResultKt.throwOnFailure(obj);
                        if (obj instanceof C5054d) {
                            ref$ObjectRef4 = ref$ObjectRef7;
                            ref$ObjectRef2 = ref$ObjectRef5;
                            ref$ObjectRef3 = ref$ObjectRef6;
                            c5054d = null;
                        } else {
                            ref$ObjectRef4 = ref$ObjectRef7;
                            c5054d = (C5054d) obj;
                            ref$ObjectRef2 = ref$ObjectRef5;
                            ref$ObjectRef3 = ref$ObjectRef6;
                        }
                        boxInt = c5054d != null ? Boxing.boxInt(U.a.a(c5054d)) : null;
                        c cVar = new c(boxInt, ref$ObjectRef2, ref$ObjectRef3, ref$ObjectRef4);
                        if (boxInt != null) {
                            return new k(new j.a(boxInt.intValue()), cVar);
                        }
                        return null;
                    }
                    z2 = aVar2.i;
                    ref$ObjectRef = (Ref$ObjectRef) aVar2.h;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k) aVar2.g;
                    function12 = (Function1) aVar2.f;
                    function02 = (Function0) aVar2.e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r) aVar2.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) aVar2.c;
                    Context context3 = (Context) aVar2.b;
                    yVar2 = (y) aVar2.a;
                    ResultKt.throwOnFailure(obj);
                    kVar2 = kVar3;
                    context2 = context3;
                    rVar2 = rVar3;
                    aVar3 = aVar4;
                }
                ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef3 = new Ref$ObjectRef();
                ref$ObjectRef4 = new Ref$ObjectRef();
                str = (String) ref$ObjectRef.element;
                if (str != null) {
                    Context applicationContext = context2.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    ?? aVar5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(applicationContext, null, new t(rVar2, aVar3), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a(), false, null, 50, null);
                    ref$ObjectRef3.element = aVar5;
                    ?? CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
                    ref$ObjectRef4.element = CoroutineScope;
                    FlowKt.launchIn(FlowKt.onEach(aVar5.getClickthroughEvent(), new d(function02, null)), CoroutineScope);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new e(aVar5, function12, null), 3, null);
                    q.a(aVar5, yVar2);
                    c5054d = aVar5;
                    if (c5054d != null) {
                    }
                    c cVar2 = new c(boxInt, ref$ObjectRef2, ref$ObjectRef3, ref$ObjectRef4);
                    if (boxInt != null) {
                    }
                } else {
                    ?? mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(context2, str, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return l.a();
                        }
                    }, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final Object mo4828invoke() {
                            return l.b();
                        }
                    }, function02, function12, true, rVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h.a(context2, CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain()), z2), kVar2, null, 1024, null);
                    ref$ObjectRef2.element = mVar;
                    aVar2.a = ref$ObjectRef2;
                    aVar2.b = ref$ObjectRef3;
                    aVar2.c = ref$ObjectRef4;
                    aVar2.d = null;
                    aVar2.e = null;
                    aVar2.f = null;
                    aVar2.g = null;
                    aVar2.h = null;
                    aVar2.k = 2;
                    Object c2 = mVar.c(aVar2);
                    if (c2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef5 = ref$ObjectRef2;
                    ref$ObjectRef6 = ref$ObjectRef3;
                    obj = c2;
                    ref$ObjectRef7 = ref$ObjectRef4;
                    if (obj instanceof C5054d) {
                    }
                    if (c5054d != null) {
                    }
                    c cVar22 = new c(boxInt, ref$ObjectRef2, ref$ObjectRef3, ref$ObjectRef4);
                    if (boxInt != null) {
                    }
                }
            }
        }
        aVar2 = new a(continuation);
        Object obj2 = aVar2.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = aVar2.k;
        if (i3 != 0) {
        }
        ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef3 = new Ref$ObjectRef();
        ref$ObjectRef4 = new Ref$ObjectRef();
        str = (String) ref$ObjectRef.element;
        if (str != null) {
        }
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}
