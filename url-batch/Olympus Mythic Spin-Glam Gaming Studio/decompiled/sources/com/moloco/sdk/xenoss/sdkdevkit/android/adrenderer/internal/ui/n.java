package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class n {

    @NotNull
    public static final n a = new n();

    @NotNull
    public static Function2 b = ComposableLambdaKt.composableLambdaInstance(253636918, false, a.a);

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
                ComposerKt.traceEventStart(253636918, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.ComposableSingletons$GenericIconButtonKt.lambda-1.<anonymous> (GenericIconButton.kt:83)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            composer.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 constructor = companion2.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(companion);
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer);
            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_round_skip_next_24, composer, 0);
            Color.Companion companion3 = Color.INSTANCE;
            long m1462getWhite0d7_KjU = companion3.m1462getWhite0d7_KjU();
            Shape rectangleShape = RectangleShapeKt.getRectangleShape();
            long m1457getBlue0d7_KjU = companion3.m1457getBlue0d7_KjU();
            float f = 40;
            long m2517DpSizeYgX7TsA = DpKt.m2517DpSizeYgX7TsA(Dp.m2507constructorimpl(f), Dp.m2507constructorimpl(f));
            composer.startReplaceableGroup(-852313276);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return n.a.a();
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            u.a(painterResource, (Function0) rememberedValue, null, false, null, m1457getBlue0d7_KjU, m2517DpSizeYgX7TsA, 0L, rectangleShape, m1462getWhite0d7_KjU, composer, 907739184, 156);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
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
