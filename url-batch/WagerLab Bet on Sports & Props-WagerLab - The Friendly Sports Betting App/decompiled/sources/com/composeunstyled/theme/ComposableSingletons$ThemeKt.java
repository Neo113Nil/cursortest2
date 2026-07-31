package com.composeunstyled.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ThemeKt {
    public static final ComposableSingletons$ThemeKt INSTANCE = new ComposableSingletons$ThemeKt();

    /* renamed from: lambda$-463669463, reason: not valid java name */
    private static Function3<ThemeBuilder, Composer, Integer, Unit> f61lambda$463669463 = ComposableLambdaKt.composableLambdaInstance(-463669463, false, new Function3<ThemeBuilder, Composer, Integer, Unit>() { // from class: com.composeunstyled.theme.ComposableSingletons$ThemeKt$lambda$-463669463$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ThemeBuilder themeBuilder, Composer composer, Integer num) {
            invoke(themeBuilder, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ThemeBuilder themeBuilder, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(themeBuilder, "<this>");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463669463, i, -1, "com.composeunstyled.theme.ComposableSingletons$ThemeKt.lambda$-463669463.<anonymous> (Theme.kt:52)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-463669463$core_release, reason: not valid java name */
    public final Function3<ThemeBuilder, Composer, Integer, Unit> m9563getLambda$463669463$core_release() {
        return f61lambda$463669463;
    }
}
