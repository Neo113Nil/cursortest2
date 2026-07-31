package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public final class m extends e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {
    public static final int s = 0;

    @NotNull
    public final Function0 o;

    @NotNull
    public final Function0 p;

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k q;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h r;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidInline", f = "MraidInline.kt", l = {53}, m = "load")
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return m.this.c(this);
        }
    }

    public /* synthetic */ m(Context context, String str, Function0 function0, Function0 function02, Function0 function03, Function1 function1, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, function0, function02, function03, function1, z, rVar, fVar, (i & 512) != 0 ? null : kVar, (i & 1024) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a() : hVar);
    }

    public static final Unit a(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        function0.mo4828invoke();
        if (kVar != null) {
            kVar.a(url);
        }
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
    public void V() {
        super.V();
        this.o.mo4828invoke();
    }

    @NotNull
    public final WebView c() {
        return I().c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
    public void s() {
        super.s();
        this.p.mo4828invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull Continuation continuation) {
        a aVar;
        Object obj;
        int i;
        m mVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                obj = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar.a = this;
                    aVar.d = 1;
                    obj = b(aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (m) aVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (obj instanceof x.b) {
                    return null;
                }
                return mVar.I().c();
            }
        }
        aVar = new a(continuation);
        obj = aVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        if (obj instanceof x.b) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context, @NotNull String adm, @NotNull Function0 onNeedToDetachAdViewBeforeExpand, @NotNull Function0 onExpandAdViewClosed, @NotNull final Function0 onShowListenerClick, @NotNull Function1 onError, boolean z, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull f mraidBridge, @Nullable final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker) {
        super(context, adm, r.b, onShowListenerClick, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.a(Function0.this, kVar, (String) obj);
            }
        }, onError, externalLinkHandler, z, mraidBridge);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(onNeedToDetachAdViewBeforeExpand, "onNeedToDetachAdViewBeforeExpand");
        Intrinsics.checkNotNullParameter(onExpandAdViewClosed, "onExpandAdViewClosed");
        Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(mraidBridge, "mraidBridge");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.o = onNeedToDetachAdViewBeforeExpand;
        this.p = onExpandAdViewClosed;
        this.q = kVar;
        this.r = buttonTracker;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.r.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.r.a(buttonType);
    }
}
