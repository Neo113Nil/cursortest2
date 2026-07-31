package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final e a = new e();

    @NotNull
    public static Function2 b = ComposableLambdaKt.composableLambdaInstance(-1374838940, false, a.a);

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
                ComposerKt.traceEventStart(-1374838940, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$VastCTAKt.lambda-1.<anonymous> (VastCTA.kt:78)");
            }
            composer.startReplaceableGroup(-1163707276);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.e$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return e.a.a();
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            r.a(null, "https://play-lh.googleusercontent.com/l_C7yZC4etIdr5tUY7-7LdKzi_-FWmVhwqMU_OncT9MMntcK-wWBEIvuVrfT1Yoe6Q=s96", "Learn More", 0L, (Function0) rememberedValue, composer, 25008, 9);
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
