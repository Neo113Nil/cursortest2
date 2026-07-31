package expo.modules.devmenu.compose.primitives;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DurationBasedAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PulseEffect.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"pulseEffect", "Landroidx/compose/ui/Modifier;", "initialScale", "", "targetScale", "brush", "Landroidx/compose/ui/graphics/Brush;", "shape", "Landroidx/compose/ui/graphics/Shape;", "animationSpect", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "expo-dev-menu_release", "scale", "alpha"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PulseEffectKt {
    public static final Modifier pulseEffect(Modifier modifier, float f, float f2, Brush brush, Shape shape, DurationBasedAnimationSpec<Float> durationBasedAnimationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        composer.startReplaceGroup(-516289984);
        ComposerKt.sourceInformation(composer, "C(pulseEffect)P(2,4,1,3)27@1126L49,28@1202L157,35@1387L138,42@1552L138:PulseEffect.kt#k98qbf");
        float f3 = (i2 & 1) != 0 ? 1.0f : f;
        float f4 = (i2 & 2) != 0 ? 2.0f : f2;
        final Brush solidColor = (i2 & 4) != 0 ? new SolidColor(Color.m5656copywmQWz5c$default(Color.INSTANCE.m5683getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null) : brush;
        final Shape circleShape = (i2 & 8) != 0 ? RoundedCornerShapeKt.getCircleShape() : shape;
        DurationBasedAnimationSpec<Float> tween$default = (i2 & 16) != 0 ? AnimationSpecKt.tween$default(1200, 0, null, 6, null) : durationBasedAnimationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-516289984, i, -1, "expo.modules.devmenu.compose.primitives.pulseEffect (PulseEffect.kt:26)");
        }
        InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("pulseEffect", composer, 6, 0);
        final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, f3, f4, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(tween$default, null, 0L, 6, null), "scale", composer, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 24576 | (i & 112) | (i & 896), 0);
        final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 1.0f, 0.0f, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(tween$default, null, 0L, 6, null), "alpha", composer, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
        composer.startReplaceGroup(-1224400529);
        ComposerKt.sourceInformation(composer, "CC(remember):PulseEffect.kt#9igjgp");
        boolean changed = ((((57344 & i) ^ 24576) > 16384 && composer.changed(circleShape)) || (i & 24576) == 16384) | composer.changed(animateFloat) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(solidColor)) || (i & 3072) == 2048) | composer.changed(animateFloat2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: expo.modules.devmenu.compose.primitives.PulseEffectKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit pulseEffect$lambda$4$lambda$3;
                    pulseEffect$lambda$4$lambda$3 = PulseEffectKt.pulseEffect$lambda$4$lambda$3(Shape.this, animateFloat, solidColor, animateFloat2, (DrawScope) obj);
                    return pulseEffect$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier drawBehind = DrawModifierKt.drawBehind(modifier, (Function1) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return drawBehind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pulseEffect$lambda$4$lambda$3(Shape shape, State state, Brush brush, State state2, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Outline mo326createOutlinePq9zytI = shape.mo326createOutlinePq9zytI(drawBehind.mo6236getSizeNHjbRc(), drawBehind.getLayoutDirection(), drawBehind);
        float pulseEffect$lambda$0 = pulseEffect$lambda$0(state);
        long mo6235getCenterF1C5BW0 = drawBehind.mo6235getCenterF1C5BW0();
        DrawContext drawContext = drawBehind.getDrawContext();
        long mo6157getSizeNHjbRc = drawContext.mo6157getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6164scale0AR0LA0(pulseEffect$lambda$0, pulseEffect$lambda$0, mo6235getCenterF1C5BW0);
            OutlineKt.m5926drawOutlinehn5TExg$default(drawBehind, mo326createOutlinePq9zytI, brush, pulseEffect$lambda$1(state2), null, null, 0, 56, null);
            drawContext.getCanvas().restore();
            drawContext.mo6158setSizeuvyYCjk(mo6157getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo6158setSizeuvyYCjk(mo6157getSizeNHjbRc);
            throw th;
        }
    }

    private static final float pulseEffect$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float pulseEffect$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}
