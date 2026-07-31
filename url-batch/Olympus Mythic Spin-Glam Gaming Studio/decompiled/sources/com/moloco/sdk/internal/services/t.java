package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class t implements s {

    @NotNull
    public static final a c = new a(null);
    public static final int d = 0;

    @NotNull
    public static final String e = "ClickthroughService";

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.ClickthroughServiceImpl", f = "ClickthroughService.kt", l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "runClickThrough")
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return t.this.a(null, null, null, null, this);
        }
    }

    public t(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        this.a = externalLinkHandler;
        this.b = customUserEventBuilderService;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.moloco.sdk.internal.services.s
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, @Nullable MutableSharedFlow mutableSharedFlow, @NotNull Continuation continuation) {
        b bVar;
        int i;
        MutableSharedFlow mutableSharedFlow2;
        Object a2;
        t tVar;
        String str2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                Object obj = bVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a;
                    a.AbstractC1677a.d dVar = new a.AbstractC1677a.d(new a.AbstractC1677a.f(cVar.a(aVar.g()), cVar.a(aVar.h())), new a.AbstractC1677a.f(cVar.a(aVar.i()), cVar.a(aVar.j())), new a.AbstractC1677a.g(cVar.a(aVar.l()), cVar.a(aVar.k())), hVar.p());
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2 = this.b;
                    bVar.a = this;
                    mutableSharedFlow2 = mutableSharedFlow;
                    bVar.b = mutableSharedFlow2;
                    bVar.e = 1;
                    a2 = aVar2.a(currentTimeMillis, dVar, str, bVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    MutableSharedFlow mutableSharedFlow3 = (MutableSharedFlow) bVar.b;
                    tVar = (t) bVar.a;
                    ResultKt.throwOnFailure(obj);
                    a2 = obj;
                    mutableSharedFlow2 = mutableSharedFlow3;
                }
                str2 = (String) a2;
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, e, "Launching url: " + str2, false, 4, null);
                rVar = tVar.a;
                if (str2 == null) {
                    str2 = "";
                }
                if (rVar.a(str2) || mutableSharedFlow2 == null) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                bVar.a = null;
                bVar.b = null;
                bVar.e = 2;
                if (mutableSharedFlow2.emit(unit, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        str2 = (String) a2;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, e, "Launching url: " + str2, false, 4, null);
        rVar = tVar.a;
        if (str2 == null) {
        }
        if (rVar.a(str2)) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.internal.services.s
    @Nullable
    public Object a(@NotNull String str, @Nullable MutableSharedFlow mutableSharedFlow, @NotNull Continuation continuation) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar = this.a;
        if (str == null) {
            str = "";
        }
        if (rVar.a(str) && mutableSharedFlow != null) {
            Unit unit = Unit.INSTANCE;
            Object emit = mutableSharedFlow.emit(unit, continuation);
            return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : unit;
        }
        return Unit.INSTANCE;
    }
}
