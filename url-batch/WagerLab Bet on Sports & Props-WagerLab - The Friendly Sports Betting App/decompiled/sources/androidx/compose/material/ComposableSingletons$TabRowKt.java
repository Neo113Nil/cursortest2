package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$TabRowKt {
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();

    /* renamed from: lambda$-1216856915, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8lambda$1216856915 = ComposableLambdaKt.composableLambdaInstance(-1216856915, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda$-1216856915$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C142@7090L9:TabRow.kt#jmzs0o");
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1216856915, i, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda$-1216856915.<anonymous> (TabRow.kt:142)");
            }
            TabRowDefaults.INSTANCE.m2198Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-222041980, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9lambda$222041980 = ComposableLambdaKt.composableLambdaInstance(-222041980, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda$-222041980$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C232@11733L9:TabRow.kt#jmzs0o");
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222041980, i, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda$-222041980.<anonymous> (TabRow.kt:232)");
            }
            TabRowDefaults.INSTANCE.m2198Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1216856915$material, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1981getLambda$1216856915$material() {
        return f8lambda$1216856915;
    }

    /* renamed from: getLambda$-222041980$material, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1982getLambda$222041980$material() {
        return f9lambda$222041980;
    }
}
