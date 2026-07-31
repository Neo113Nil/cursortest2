package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a$a, reason: collision with other inner class name */
    public static final class C1670a implements Function2 {
        public final /* synthetic */ Unit a;

        public C1670a(Unit unit) {
            this.a = unit;
        }

        @ComposableTarget
        @Composable
        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1018657295, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebView.<anonymous>.<anonymous> (AdWebView.kt:41)");
            }
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

    public static final class b implements DisposableEffectResult {
        public final /* synthetic */ WebView a;

        public b(WebView webView) {
            this.a = webView;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            ViewParent parent = this.a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.a);
            }
        }
    }

    public static final class c extends FrameLayout {
        public final /* synthetic */ WebView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, WebView webView) {
            super(context);
            this.a = webView;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
            return super.dispatchTouchEvent(me);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ViewParent parent = this.a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.a);
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }
    }

    public static final Unit a(WebView webView, Modifier modifier, y yVar, int i, int i2, Composer composer, int i3) {
        a(webView, modifier, yVar, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    @ComposableTarget
    @Composable
    public static final void a(@NotNull final WebView webView, @Nullable Modifier modifier, @Nullable final y yVar, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Composer startRestartGroup = composer.startRestartGroup(-1111633024);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(webView) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(yVar) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1111633024, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebView (AdWebView.kt:14)");
            }
            startRestartGroup.startReplaceableGroup(1539491972);
            startRestartGroup.startReplaceableGroup(1539459945);
            boolean changed = startRestartGroup.changed(webView);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return a.a(webView, (Context) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) rememberedValue, modifier, null, startRestartGroup, i5 & 112, 4);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(1539492737);
            if (yVar != null) {
                yVar.a(ComposableLambdaKt.composableLambda(startRestartGroup, 1018657295, true, new C1670a(unit)), startRestartGroup, ((i5 >> 3) & 112) | 6);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1539499311);
            boolean changed2 = startRestartGroup.changed(webView);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return a.a(webView, (DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(webView, (Function1) rememberedValue2, startRestartGroup, i5 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a.a(webView, modifier2, yVar, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final FrameLayout a(WebView webView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        frameLayout.addView(webView, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @NotNull
    public static final FrameLayout a(@NotNull Context context, @NotNull WebView webView, @Nullable y yVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        c cVar = new c(context, webView);
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        cVar.addView(webView, new ViewGroup.LayoutParams(-1, -1));
        if (yVar != null) {
            yVar.a(cVar);
        }
        return cVar;
    }

    public static final DisposableEffectResult a(WebView webView, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new b(webView);
    }
}
