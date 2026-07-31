package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes15.dex */
public final class g {

    @NotNull
    public static final String a = "AdController";

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImplKt$isLinearPlaylistItemPlayingFlow$1", f = "AdPlaylistControllerImpl.kt", l = {406}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ Flow b;
        public final /* synthetic */ MutableStateFlow c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdPlaylistControllerImplKt$isLinearPlaylistItemPlayingFlow$1$1", f = "AdPlaylistControllerImpl.kt", l = {410}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g$a$a, reason: collision with other inner class name */
        public static final class C1644a extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ MutableStateFlow c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g$a$a$a, reason: collision with other inner class name */
            public static final class C1645a<T> implements FlowCollector {
                public final /* synthetic */ MutableStateFlow a;

                public C1645a(MutableStateFlow mutableStateFlow) {
                    this.a = mutableStateFlow;
                }

                public final Object a(boolean z, Continuation continuation) {
                    this.a.setValue(Boxing.boxBoolean(z));
                    return Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((Boolean) obj).booleanValue(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1644a(MutableStateFlow mutableStateFlow, Continuation continuation) {
                super(2, continuation);
                this.c = mutableStateFlow;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k kVar, Continuation continuation) {
                return ((C1644a) create(kVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C1644a c1644a = new C1644a(this.c, continuation);
                c1644a.b = obj;
                return c1644a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    k kVar = (k) this.b;
                    if (!(kVar instanceof k.c)) {
                        this.c.setValue(null);
                        return Unit.INSTANCE;
                    }
                    StateFlow isPlaying = ((k.c) kVar).a().isPlaying();
                    C1645a c1645a = new C1645a(this.c);
                    this.a = 1;
                    if (isPlaying.collect(c1645a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow flow, MutableStateFlow mutableStateFlow, Continuation continuation) {
            super(2, continuation);
            this.b = flow;
            this.c = mutableStateFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = this.b;
                C1644a c1644a = new C1644a(this.c, null);
                this.a = 1;
                if (FlowKt.collectLatest(flow, c1644a, this) == coroutine_suspended) {
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

    public static final Flow b(Flow flow, CoroutineScope coroutineScope) {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(flow, MutableStateFlow, null), 3, null);
        return MutableStateFlow;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a b(List<? extends k> list, k kVar) {
        k kVar2 = (k) CollectionsKt.getOrNull(list, CollectionsKt.indexOf((List) list, (Object) kVar) + 1);
        k.b bVar = kVar2 instanceof k.b ? (k.b) kVar2 : null;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a ad, @NotNull r externalLinkHandler, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, boolean z, @Nullable Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k linkHandler) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        return new f(j.a(ad, externalLinkHandler, context, customUserEventBuilderService, z, bool, i, i2, i3, z2, z3, linkHandler), new h(ad.i(), ad.j().n().b(), ad.h(), null, 8, null));
    }

    public static final a.AbstractC1677a.c.EnumC1679a b(List<? extends k> list, k kVar, a.AbstractC1677a.c.EnumC1679a enumC1679a) {
        return (enumC1679a != a.AbstractC1677a.c.EnumC1679a.c || b(list, kVar) == null) ? enumC1679a : a.AbstractC1677a.c.EnumC1679a.d;
    }

    public static final a.AbstractC1677a.c b(List<? extends k> list, k kVar, a.AbstractC1677a.c cVar) {
        a.AbstractC1677a.c.EnumC1679a b = b(list, kVar, cVar.d());
        return b == cVar.d() ? cVar : a.AbstractC1677a.c.a(cVar, b, null, null, 6, null);
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c mraidAdData, @NotNull r externalLinkHandler, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j mraidFullscreenContentController, int i, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k linkHandler) {
        Intrinsics.checkNotNullParameter(mraidAdData, "mraidAdData");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mraidFullscreenContentController, "mraidFullscreenContentController");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        return new f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d.a(mraidAdData, mraidFullscreenContentController, i, context, externalLinkHandler, customUserEventBuilderService, linkHandler), null);
    }
}
