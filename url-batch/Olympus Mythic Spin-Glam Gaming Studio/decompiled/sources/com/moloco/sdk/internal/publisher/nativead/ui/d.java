package com.moloco.sdk.internal.publisher.nativead.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.internal.C;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class d extends FrameLayout implements k {

    @NotNull
    public static final a d = new a(null);
    public static final int e = 8;

    @NotNull
    public static final String f = "VideoContainer";

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a;

    @NotNull
    public final C b;

    @Nullable
    public ComposeView c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Function3 {
        public final /* synthetic */ y a;
        public final /* synthetic */ d b;
        public final /* synthetic */ Function0 c;
        public final /* synthetic */ Q d;

        public static final class a implements Function2 {
            public final /* synthetic */ d a;
            public final /* synthetic */ Function0 b;
            public final /* synthetic */ Modifier c;
            public final /* synthetic */ Q d;

            public a(d dVar, Function0 function0, Modifier modifier, Q q) {
                this.a = dVar;
                this.b = function0;
                this.c = modifier;
                this.d = q;
            }

            @ComposableTarget
            @Composable
            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035844210, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous>.<anonymous> (NativeAdVideoContainer.kt:64)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.a.a;
                long m1456getBlack0d7_KjU = Color.INSTANCE.m1456getBlack0d7_KjU();
                Function0 function0 = this.b;
                o oVar = new o(function0, function0, function0);
                x.a(aVar, this.c, m1456getBlack0d7_KjU, f.a(composer, 0), null, null, null, null, oVar, null, null, p.a(g.a(), composer, 6, 0), this.d, false, composer, 818110848, 0, 9280);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }
        }

        public b(y yVar, d dVar, Function0 function0, Q q) {
            this.a = yVar;
            this.b = dVar;
            this.c = function0;
            this.d = q;
        }

        @ComposableTarget
        @Composable
        public final void a(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            if ((i & 6) == 0) {
                i |= composer.changed(modifier) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1867022133, i, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous> (NativeAdVideoContainer.kt:63)");
            }
            this.a.a(ComposableLambdaKt.composableLambda(composer, 1035844210, true, new a(this.b, this.c, modifier, this.d)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a vastAdController, @NotNull Q viewVisibilityTracker, @NotNull C viewLifecycleOwner, @NotNull y watermark, @Nullable Function0 function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vastAdController, "vastAdController");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.a = vastAdController;
        this.b = viewLifecycleOwner;
        ComposeView a2 = com.moloco.sdk.internal.publisher.nativead.ui.b.a(context, ComposableLambdaKt.composableLambdaInstance(1867022133, true, new b(watermark, this, function0, viewVisibilityTracker)));
        addView(a2, new ViewGroup.LayoutParams(-1, -1));
        this.c = a2;
    }

    @VisibleForTesting
    public static /* synthetic */ void getVideoView$annotations() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        this.a.destroy();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final ComposeView getVideoView() {
        return this.c;
    }

    public final void k() {
        removeAllViews();
        ComposeView composeView = this.c;
        if (composeView != null) {
            composeView.disposeComposition();
        }
        this.c = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    @VisibleForTesting
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "onAttachedToWindow", null, false, 12, null);
        this.b.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    @VisibleForTesting
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, f, "onDetachedFromWindow", null, false, 12, null);
        this.b.b(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.b.d(this);
        } else {
            this.b.c(this);
        }
    }

    public final void setVideoView(@Nullable ComposeView composeView) {
        this.c = composeView;
    }
}
