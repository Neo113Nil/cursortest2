package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class p {

    @NotNull
    public static final Function5 a = d.a.a();

    @Composable
    @NotNull
    public static final Function7 a(@Nullable Function5 function5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(718660168);
        if ((i2 & 1) != 0) {
            function5 = a;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(718660168, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl (PlaybackControl.kt:48)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1901828083, true, new a(function5));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    @NotNull
    public static final Function5 a() {
        return a;
    }

    public static final class a implements Function7 {
        public final /* synthetic */ Function5 a;

        public a(Function5 function5) {
            this.a = function5;
        }

        @Composable
        public final void a(BoxScope boxScope, final boolean z, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, final Function1 onShouldPlay, final Function0 onShouldReplay, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(progress, "progress");
            Intrinsics.checkNotNullParameter(onShouldPlay, "onShouldPlay");
            Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(progress) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= composer.changed(onShouldPlay) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= composer.changed(onShouldReplay) ? 16384 : 8192;
            }
            if ((74899 & i2) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901828083, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultPlaybackControl.<anonymous> (PlaybackControl.kt:50)");
            }
            composer.startReplaceableGroup(263793858);
            boolean changed = composer.changed(progress) | composer.changed(onShouldReplay) | composer.changed(onShouldPlay) | composer.changed(z);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.p$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return p.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.this, onShouldReplay, onShouldPlay, z);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            this.a.invoke(boxScope, Boolean.valueOf(z), (Function0) rememberedValue, composer, Integer.valueOf(i2 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj3, (Function1) obj4, (Function0) obj5, (Composer) obj6, ((Number) obj7).intValue());
            return Unit.INSTANCE;
        }

        public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Function0 function0, Function1 function1, boolean z) {
            if (iVar instanceof i.a) {
                function0.mo4828invoke();
            } else {
                function1.invoke(Boolean.valueOf(!z));
            }
            return Unit.INSTANCE;
        }
    }
}
