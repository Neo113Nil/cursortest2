package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5061j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5068q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class m {

    @NotNull
    public static final m a = new m();

    @NotNull
    public static Function2 b = ComposableLambdaKt.composableLambdaInstance(-1693189779, false, a.a);

    @NotNull
    public final Function2 a() {
        return b;
    }

    public static final class a implements Function2 {
        public static final a a = new a();

        @ComposableTarget
        @Composable
        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1693189779, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.ComposableSingletons$DECKt.lambda-1.<anonymous> (DEC.kt:248)");
            }
            composer.startReplaceableGroup(-317444164);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return m.a.a();
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            r.a(null, "MONOPOLY GO!", (Function0) rememberedValue, new C5068q(12, null, new C5061j(null, "https://play-lh.googleusercontent.com/7M9FYlUnscfJQZqHE4Yz2HNEzESl3QOUEVAOD3YzC32HuMsbropV8h_tPpaNdRmqrA=w480-h960", null), null), composer, 432, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public static final Unit a() {
            return Unit.INSTANCE;
        }
    }
}
