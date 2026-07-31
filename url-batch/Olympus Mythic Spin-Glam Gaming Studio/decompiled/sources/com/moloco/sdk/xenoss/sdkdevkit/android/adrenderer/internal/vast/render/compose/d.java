package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class d {

    @NotNull
    public static final d a = new d();

    @NotNull
    public static Function5 b = ComposableLambdaKt.composableLambdaInstance(-1970835476, false, a.a);

    public static final class a implements Function5 {
        public static final a a = new a();

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d$a$a, reason: collision with other inner class name */
        public static final class C1653a implements Function3 {
            public final /* synthetic */ Function0 a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d$a$a$a, reason: collision with other inner class name */
            public static final class C1654a implements Function3 {
                public final /* synthetic */ boolean a;

                public C1654a(boolean z) {
                    this.a = z;
                }

                @ComposableTarget
                @Composable
                public final void a(RowScope TextButton, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-919554769, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (PlaybackControl.kt:73)");
                    }
                    TextKt.m1056TextfLXpl1I(this.a ? "Pause" : "Play", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65534);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }
            }

            public C1653a(Function0 function0) {
                this.a = function0;
            }

            @ComposableTarget
            @Composable
            public final void a(boolean z, Composer composer, int i) {
                int i2;
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(z) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(170935244, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous> (PlaybackControl.kt:72)");
                }
                ButtonKt.TextButton(this.a, null, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -919554769, true, new C1654a(z)), composer, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }
        }

        @ComposableTarget
        @Composable
        public final void a(BoxScope boxScope, boolean z, Function0 onClick, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(onClick) ? 256 : 128;
            }
            if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1970835476, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous> (PlaybackControl.kt:66)");
            }
            CrossfadeKt.Crossfade(Boolean.valueOf(z), PaddingKt.m334padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m2507constructorimpl(4)), null, ComposableLambdaKt.composableLambda(composer, 170935244, true, new C1653a(onClick)), composer, ((i2 >> 3) & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((BoxScope) obj, ((Boolean) obj2).booleanValue(), (Function0) obj3, (Composer) obj4, ((Number) obj5).intValue());
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Function5 a() {
        return b;
    }
}
