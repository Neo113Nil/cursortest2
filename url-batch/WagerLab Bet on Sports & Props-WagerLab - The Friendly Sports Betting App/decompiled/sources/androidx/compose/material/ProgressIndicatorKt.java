package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.profileinstaller.ProfileVerifier;
import io.branch.referral.BranchError;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001aA\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001aK\u0010\u001e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!\u001aA\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001f2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\"\u0010#\u001a5\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001fH\u0007¢\u0006\u0004\b$\u0010%\u001a-\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u001fH\u0007¢\u0006\u0004\b&\u0010'\u001a3\u0010(\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.\u001a#\u0010/\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00102\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b3\u0010.\u001a;\u00104\u001a\u00020\u0003*\u00020\u00152\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b5\u00106\"\u0010\u00107\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u0010\u00109\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u0010\u0010:\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u00108\"\u000e\u0010;\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020<X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S²\u0006\n\u0010T\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010X\u001a\u00020<X\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u0005X\u008a\u0084\u0002"}, d2 = {"increaseSemanticsBounds", "Landroidx/compose/ui/Modifier;", "LinearProgressIndicator", "", "progress", "", "modifier", "color", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "drawLinearIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startFraction", "endFraction", "strokeWidth", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "CircularProgressIndicator", "Landroidx/compose/ui/unit/Dp;", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "LinearIndicatorHeight", "F", "LinearIndicatorWidth", "CircularIndicatorDiameter", "LinearAnimationDuration", "", "FirstLineHeadDuration", "FirstLineTailDuration", "SecondLineHeadDuration", "SecondLineTailDuration", "FirstLineHeadDelay", "FirstLineTailDelay", "SecondLineHeadDelay", "SecondLineTailDelay", "FirstLineHeadEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "RotationsPerCycle", "RotationDuration", "StartAngleOffset", "BaseRotationAngle", "JumpRotationAngle", "RotationAngleOffset", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "CircularEasing", "material", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "currentRotation", "baseRotation", "endAngle"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m2095getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m8401constructorimpl(PsExtractor.VIDEO_STREAM_MASK);
    private static final float CircularIndicatorDiameter = Dp.m8401constructorimpl(40);
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_DUhRLBM$lambda$28(float f, Modifier modifier, long j, float f2, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2101CircularProgressIndicatorDUhRLBM(f, modifier, j, f2, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_LxG7B9w$lambda$40(Modifier modifier, long j, float f, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2102CircularProgressIndicatorLxG7B9w(modifier, j, f, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_MBs18nI$lambda$41(float f, Modifier modifier, long j, float f2, int i, int i2, Composer composer, int i3) {
        m2103CircularProgressIndicatorMBs18nI(f, modifier, j, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_aM_cp0Q$lambda$42(Modifier modifier, long j, float f, int i, int i2, Composer composer, int i3) {
        m2104CircularProgressIndicatoraMcp0Q(modifier, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator_2cYBFYY$lambda$21(Modifier modifier, long j, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2105LinearProgressIndicator2cYBFYY(modifier, j, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator_RIQooxk$lambda$23(Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        m2106LinearProgressIndicatorRIQooxk(modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator__5eSR_E$lambda$6(float f, Modifier modifier, long j, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m2107LinearProgressIndicator_5eSRE(f, modifier, j, j2, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator_eaDK9VM$lambda$22(float f, Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        m2108LinearProgressIndicatoreaDK9VM(f, modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult increaseSemanticsBounds$lambda$1(float f, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final int i = measureScope.mo418roundToPx0680j_4(f);
        long value = constraints.getValue();
        int i2 = i * 2;
        final Placeable mo7075measureBRTryo0 = measurable.mo7075measureBRTryo0(ConstraintsKt.m8373offsetNN6EwU(value, 0, i2));
        return MeasureScope.layout$default(measureScope, mo7075measureBRTryo0.getWidth(), mo7075measureBRTryo0.getHeight() - i2, null, new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit increaseSemanticsBounds$lambda$1$lambda$0;
                increaseSemanticsBounds$lambda$1$lambda$0 = ProgressIndicatorKt.increaseSemanticsBounds$lambda$1$lambda$0(Placeable.this, i, (Placeable.PlacementScope) obj);
                return increaseSemanticsBounds$lambda$1$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit increaseSemanticsBounds$lambda$1$lambda$0(Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, -i, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit increaseSemanticsBounds$lambda$2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2107LinearProgressIndicator_5eSRE(final float f, Modifier modifier, long j, long j2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        long j4;
        int i5;
        Modifier.Companion companion;
        final int i6;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        long j7;
        final int i7;
        final long j8;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-531984864);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)N(progress,modifier,color:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color,strokeCap:c#ui.graphics.StrokeCap)115@5390L204,110@5177L417:ProgressIndicator.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    i5 = i;
                    if (startRestartGroup.changed(i5)) {
                        i8 = 16384;
                        i4 |= i8;
                    }
                } else {
                    i5 = i;
                }
                i8 = 8192;
                i4 |= i8;
            } else {
                i5 = i;
            }
            boolean z = true;
            if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "105@4977L6");
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    companion = modifier2;
                } else {
                    companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) != 0) {
                        j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                        i4 &= -897;
                    }
                    long j9 = j3;
                    if ((i3 & 8) != 0) {
                        j7 = Color.m5656copywmQWz5c$default(j9, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -7169;
                    } else {
                        j7 = j4;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        i5 = StrokeCap.INSTANCE.m6027getButtKaPHkGw();
                    }
                    j4 = j7;
                    j3 = j9;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531984864, i4, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:108)");
                }
                float f2 = f < 0.0f ? 0.0f : f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                Modifier increaseSemanticsBounds = increaseSemanticsBounds(companion);
                Float valueOf = Float.valueOf(f2);
                if (Float.isNaN(valueOf.floatValue())) {
                    valueOf = null;
                }
                Modifier m891sizeVpY3zN4 = SizeKt.m891sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(increaseSemanticsBounds, valueOf != null ? valueOf.floatValue() : 0.0f, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -136327412, "CC(remember):ProgressIndicator.kt#9igjgp");
                boolean changed = ((((i4 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j4)) || (i4 & 3072) == 2048) | ((((57344 & i4) ^ 24576) > 16384 && startRestartGroup.changed(i5)) || (i4 & 24576) == 16384) | startRestartGroup.changed(f2);
                if ((((i4 & 896) ^ 384) <= 256 || !startRestartGroup.changed(j3)) && (i4 & 384) != 256) {
                    z = false;
                }
                boolean z2 = changed | z;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final float f3 = f2;
                    i7 = i5;
                    j5 = j3;
                    j8 = j4;
                    rememberedValue = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit LinearProgressIndicator__5eSR_E$lambda$5$lambda$4;
                            LinearProgressIndicator__5eSR_E$lambda$5$lambda$4 = ProgressIndicatorKt.LinearProgressIndicator__5eSR_E$lambda$5$lambda$4(j8, i7, f3, j5, (DrawScope) obj);
                            return LinearProgressIndicator__5eSR_E$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                } else {
                    i7 = i5;
                    j5 = j3;
                    j8 = j4;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(m891sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = j8;
                i6 = i7;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                i6 = i5;
                j5 = j3;
                j6 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                final long j10 = j5;
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit LinearProgressIndicator__5eSR_E$lambda$6;
                        LinearProgressIndicator__5eSR_E$lambda$6 = ProgressIndicatorKt.LinearProgressIndicator__5eSR_E$lambda$6(f, modifier3, j10, j6, i6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return LinearProgressIndicator__5eSR_E$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        boolean z3 = true;
        if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator__5eSR_E$lambda$5$lambda$4(long j, int i, float f, long j2, DrawScope drawScope) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6236getSizeNHjbRc() & 4294967295L));
        m2114drawLinearIndicatorBackgroundAZGd3zU(drawScope, j, intBitsToFloat, i);
        m2113drawLinearIndicatorqYKTg0g(drawScope, 0.0f, f, j2, intBitsToFloat, i);
        return Unit.INSTANCE;
    }

    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final void m2105LinearProgressIndicator2cYBFYY(Modifier modifier, long j, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long j3;
        long j4;
        int i5;
        final Modifier modifier3;
        final int i6;
        final long j5;
        final long j6;
        Modifier.Companion companion;
        long j7;
        int i7;
        long j8;
        long j9;
        final int i8;
        final long j10;
        final long j11;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1501635280);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)N(modifier,color:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color,strokeCap:c#ui.graphics.StrokeCap)145@6690L28,155@7116L236,150@6980L397,168@7566L236,163@7430L397,181@8017L240,176@7881L401,194@8472L240,189@8336L401,206@8908L434,201@8742L600:ProgressIndicator.kt#jmzs0o");
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            j4 = j2;
            i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                i5 = i;
                if (startRestartGroup.changed(i5)) {
                    i9 = 2048;
                    i4 |= i9;
                }
            } else {
                i5 = i;
            }
            i9 = 1024;
            i4 |= i9;
        } else {
            i5 = i;
        }
        if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "141@6521L6");
            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                companion = modifier2;
                j9 = j4;
                long j12 = j3;
                i7 = i4;
                j8 = j12;
            } else {
                companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                    i4 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
                long j13 = j3;
                if ((i3 & 4) != 0) {
                    j7 = Color.m5656copywmQWz5c$default(j13, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -897;
                } else {
                    j7 = j4;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    i5 = StrokeCap.INSTANCE.m6027getButtKaPHkGw();
                }
                long j14 = j7;
                i7 = i4;
                j8 = j13;
                j9 = j14;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501635280, i7, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:144)");
            }
            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -37484612, "CC(remember):ProgressIndicator.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LinearProgressIndicator_2cYBFYY$lambda$8$lambda$7;
                        LinearProgressIndicator_2cYBFYY$lambda$8$lambda$7 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$8$lambda$7((KeyframesSpec.KeyframesSpecConfig) obj);
                        return LinearProgressIndicator_2cYBFYY$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i11 = i7;
            long j15 = j9;
            final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue), null, 0L, 6, null), null, startRestartGroup, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | 432, 8);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -37470212, "CC(remember):ProgressIndicator.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LinearProgressIndicator_2cYBFYY$lambda$11$lambda$10;
                        LinearProgressIndicator_2cYBFYY$lambda$11$lambda$10 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$11$lambda$10((KeyframesSpec.KeyframesSpecConfig) obj);
                        return LinearProgressIndicator_2cYBFYY$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier modifier4 = companion;
            final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue2), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -37455776, "CC(remember):ProgressIndicator.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LinearProgressIndicator_2cYBFYY$lambda$14$lambda$13;
                        LinearProgressIndicator_2cYBFYY$lambda$14$lambda$13 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$14$lambda$13((KeyframesSpec.KeyframesSpecConfig) obj);
                        return LinearProgressIndicator_2cYBFYY$lambda$14$lambda$13;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long j16 = j8;
            final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue3), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -37441216, "CC(remember):ProgressIndicator.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LinearProgressIndicator_2cYBFYY$lambda$17$lambda$16;
                        LinearProgressIndicator_2cYBFYY$lambda$17$lambda$16 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$17$lambda$16((KeyframesSpec.KeyframesSpecConfig) obj);
                        return LinearProgressIndicator_2cYBFYY$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue4), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            Modifier m891sizeVpY3zN4 = SizeKt.m891sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(increaseSemanticsBounds(modifier4)), LinearIndicatorWidth, LinearIndicatorHeight);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -37427070, "CC(remember):ProgressIndicator.kt#9igjgp");
            boolean changed = ((((i11 & 896) ^ 384) > 256 && startRestartGroup.changed(j15)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(i5)) || (i11 & 3072) == 2048) | startRestartGroup.changed(animateFloat) | startRestartGroup.changed(animateFloat2) | ((((i11 & 112) ^ 48) > 32 && startRestartGroup.changed(j16)) || (i11 & 48) == 32) | startRestartGroup.changed(animateFloat3) | startRestartGroup.changed(animateFloat4);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                i8 = i5;
                j10 = j15;
                j11 = j16;
                rememberedValue5 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LinearProgressIndicator_2cYBFYY$lambda$20$lambda$19;
                        LinearProgressIndicator_2cYBFYY$lambda$20$lambda$19 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$20$lambda$19(j10, i8, j11, animateFloat, animateFloat2, animateFloat3, animateFloat4, (DrawScope) obj);
                        return LinearProgressIndicator_2cYBFYY$lambda$20$lambda$19;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                i8 = i5;
                j10 = j15;
                j11 = j16;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(m891sizeVpY3zN4, (Function1) rememberedValue5, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j6 = j10;
            i6 = i8;
            j5 = j11;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            i6 = i5;
            j5 = j3;
            j6 = j4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LinearProgressIndicator_2cYBFYY$lambda$21;
                    LinearProgressIndicator_2cYBFYY$lambda$21 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$21(Modifier.this, j5, j6, i6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return LinearProgressIndicator_2cYBFYY$lambda$21;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator_2cYBFYY$lambda$8$lambda$7(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 0), FirstLineHeadEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), FirstLineHeadDuration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator_2cYBFYY$lambda$11$lambda$10(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), FirstLineTailDelay), FirstLineTailEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), 1183);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator_2cYBFYY$lambda$14$lambda$13(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 1000), SecondLineHeadEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), 1567);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator_2cYBFYY$lambda$17$lambda$16(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(LinearAnimationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), SecondLineTailDelay), SecondLineTailEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(1.0f), LinearAnimationDuration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinearProgressIndicator_2cYBFYY$lambda$20$lambda$19(long j, int i, long j2, State state, State state2, State state3, State state4, DrawScope drawScope) {
        int i2;
        DrawScope drawScope2;
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6236getSizeNHjbRc() & 4294967295L));
        m2114drawLinearIndicatorBackgroundAZGd3zU(drawScope, j, intBitsToFloat, i);
        if (LinearProgressIndicator_2cYBFYY$lambda$9(state) - LinearProgressIndicator_2cYBFYY$lambda$12(state2) > 0.0f) {
            float LinearProgressIndicator_2cYBFYY$lambda$9 = LinearProgressIndicator_2cYBFYY$lambda$9(state);
            float LinearProgressIndicator_2cYBFYY$lambda$12 = LinearProgressIndicator_2cYBFYY$lambda$12(state2);
            i2 = i;
            f = intBitsToFloat;
            drawScope2 = drawScope;
            m2113drawLinearIndicatorqYKTg0g(drawScope2, LinearProgressIndicator_2cYBFYY$lambda$9, LinearProgressIndicator_2cYBFYY$lambda$12, j2, f, i2);
        } else {
            i2 = i;
            drawScope2 = drawScope;
            f = intBitsToFloat;
        }
        if (LinearProgressIndicator_2cYBFYY$lambda$15(state3) - LinearProgressIndicator_2cYBFYY$lambda$18(state4) > 0.0f) {
            m2113drawLinearIndicatorqYKTg0g(drawScope2, LinearProgressIndicator_2cYBFYY$lambda$15(state3), LinearProgressIndicator_2cYBFYY$lambda$18(state4), j2, f, i2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0060  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2108LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        long j7;
        long j8;
        long j9;
        Modifier modifier4;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-850309746);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)N(progress,modifier,color:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color)225@9657L95:ProgressIndicator.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                } else {
                    j3 = j;
                }
                i4 = 128;
                i3 |= i4;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "223@9560L6");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    j8 = j4;
                    modifier4 = modifier2;
                    j9 = j3;
                } else {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j7 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        modifier4 = companion;
                        j8 = Color.m5656copywmQWz5c$default(j7, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        j9 = j7;
                    } else {
                        j8 = j4;
                        j9 = j7;
                        modifier4 = companion;
                    }
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-850309746, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:225)");
                }
                m2107LinearProgressIndicator_5eSRE(f2, modifier4, j9, j8, StrokeCap.INSTANCE.m6027getButtKaPHkGw(), startRestartGroup, i3 & 8190, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j5 = j9;
                j6 = j8;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit LinearProgressIndicator_eaDK9VM$lambda$22;
                        LinearProgressIndicator_eaDK9VM$lambda$22 = ProgressIndicatorKt.LinearProgressIndicator_eaDK9VM$lambda$22(f, modifier3, j5, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return LinearProgressIndicator_eaDK9VM$lambda$22;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m2106LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        final Modifier modifier3;
        final long j5;
        final long j6;
        long j7;
        long j8;
        Modifier modifier4;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)N(modifier,color:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color)233@10044L85:ProgressIndicator.kt#jmzs0o");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j3 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j4 = j2;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j4 = j2;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "231@9947L6");
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                j7 = j4;
                modifier4 = modifier2;
                j8 = j3;
            } else {
                Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                    i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
                long j9 = j3;
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    modifier4 = companion;
                    j7 = Color.m5656copywmQWz5c$default(j9, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    j8 = j9;
                } else {
                    j7 = j4;
                    j8 = j9;
                    modifier4 = companion;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:233)");
            }
            m2105LinearProgressIndicator2cYBFYY(modifier4, j8, j7, StrokeCap.INSTANCE.m6027getButtKaPHkGw(), startRestartGroup, i3 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j5 = j8;
            j6 = j7;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j5 = j3;
            j6 = j4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LinearProgressIndicator_RIQooxk$lambda$23;
                    LinearProgressIndicator_RIQooxk$lambda$23 = ProgressIndicatorKt.LinearProgressIndicator_RIQooxk$lambda$23(Modifier.this, j5, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return LinearProgressIndicator_RIQooxk$lambda$23;
                }
            });
        }
    }

    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    private static final void m2113drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6236getSizeNHjbRc() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo6236getSizeNHjbRc() & 4294967295L));
        float f4 = 2;
        float f5 = intBitsToFloat2 / f4;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f : 1.0f - f2) * intBitsToFloat;
        float f7 = (z ? f2 : 1.0f - f) * intBitsToFloat;
        if (StrokeCap.m6023equalsimpl0(i, StrokeCap.INSTANCE.m6027getButtKaPHkGw()) || intBitsToFloat2 > intBitsToFloat) {
            DrawScope.m6222drawLineNGM6Ib0$default(drawScope, j, Offset.m5405constructorimpl((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), Offset.m5405constructorimpl((Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f8 = f3 / f4;
        ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(f8, intBitsToFloat - f8);
        float floatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f6), rangeTo)).floatValue();
        float floatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(f7), rangeTo)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m6222drawLineNGM6Ib0$default(drawScope, j, Offset.m5405constructorimpl((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), Offset.m5405constructorimpl((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    private static final void m2114drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m2113drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0142  */
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2101CircularProgressIndicatorDUhRLBM(final float f, Modifier modifier, long j, float f2, long j2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long j3;
        int i5;
        float f3;
        int i6;
        long j4;
        int i7;
        int i8;
        ScopeUpdateScope endRestartGroup;
        float f4;
        Float valueOf;
        boolean z;
        Object rememberedValue;
        Composer startRestartGroup = composer.startRestartGroup(1746618448);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)N(progress,modifier,color:c#ui.graphics.Color,strokeWidth:c#ui.unit.Dp,backgroundColor:c#ui.graphics.Color,strokeCap:c#ui.graphics.StrokeCap)315@13540L7,320@13765L251,316@13609L407:ProgressIndicator.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j3 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                f3 = f2;
                i4 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    j4 = j2;
                    i4 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        i7 = i;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(i7)) ? 131072 : 65536;
                    } else {
                        i7 = i;
                    }
                    boolean z2 = true;
                    if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "309@13277L6");
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                f3 = ProgressIndicatorDefaults.INSTANCE.m2095getStrokeWidthD9Ej5fM();
                            }
                            if (i6 != 0) {
                                j4 = Color.INSTANCE.m5692getTransparent0d7_KjU();
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                                i8 = StrokeCap.INSTANCE.m6027getButtKaPHkGw();
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1746618448, i4, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                                }
                                f4 = f >= 0.0f ? 0.0f : f;
                                if (f4 > 1.0f) {
                                    f4 = 1.0f;
                                }
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Stroke stroke = new Stroke(((Density) consume).mo424toPx0680j_4(f3), 0.0f, i8, 0, null, 26, null);
                                valueOf = Float.valueOf(f4);
                                if (Float.isNaN(valueOf.floatValue())) {
                                    valueOf = null;
                                }
                                Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, valueOf != null ? valueOf.floatValue() : 0.0f, null, 0, 6, null), CircularIndicatorDiameter);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -831863029, "CC(remember):ProgressIndicator.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(f4) | ((57344 & i4) != 16384) | startRestartGroup.changedInstance(stroke);
                                if ((((i4 & 896) ^ 384) > 256 || !startRestartGroup.changed(j3)) && (i4 & 384) != 256) {
                                    z2 = false;
                                }
                                z = changed | z2;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final float f5 = f4;
                                    final long j5 = j3;
                                    final long j6 = j4;
                                    rememberedValue = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26;
                                            CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26 = ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26(f5, j6, stroke, j5, (DrawScope) obj);
                                            return CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                CanvasKt.Canvas(m889size3ABfNKs, (Function1) rememberedValue, startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                        }
                        i8 = i7;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (f >= 0.0f) {
                        }
                        if (f4 > 1.0f) {
                        }
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Stroke stroke2 = new Stroke(((Density) consume2).mo424toPx0680j_4(f3), 0.0f, i8, 0, null, 26, null);
                        valueOf = Float.valueOf(f4);
                        if (Float.isNaN(valueOf.floatValue())) {
                        }
                        Modifier m889size3ABfNKs2 = SizeKt.m889size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, valueOf != null ? valueOf.floatValue() : 0.0f, null, 0, 6, null), CircularIndicatorDiameter);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -831863029, "CC(remember):ProgressIndicator.kt#9igjgp");
                        boolean changed2 = startRestartGroup.changed(f4) | ((57344 & i4) != 16384) | startRestartGroup.changedInstance(stroke2);
                        if (((i4 & 896) ^ 384) > 256) {
                        }
                        z2 = false;
                        z = changed2 | z2;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        final float f52 = f4;
                        final long j52 = j3;
                        final long j62 = j4;
                        rememberedValue = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26;
                                CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26 = ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26(f52, j62, stroke2, j52, (DrawScope) obj);
                                return CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CanvasKt.Canvas(m889size3ABfNKs2, (Function1) rememberedValue, startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        i8 = i7;
                    }
                    final long j7 = j3;
                    final long j8 = j4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final float f6 = f3;
                        final int i10 = i8;
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit CircularProgressIndicator_DUhRLBM$lambda$28;
                                CircularProgressIndicator_DUhRLBM$lambda$28 = ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$28(f, modifier3, j7, f6, j8, i10, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return CircularProgressIndicator_DUhRLBM$lambda$28;
                            }
                        });
                        return;
                    }
                    return;
                }
                j4 = j2;
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                boolean z22 = true;
                if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                }
                final long j72 = j3;
                final long j82 = j4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            j4 = j2;
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            boolean z222 = true;
            if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
            }
            final long j722 = j3;
            final long j822 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        j4 = j2;
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        boolean z2222 = true;
        if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
        }
        final long j7222 = j3;
        final long j8222 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_DUhRLBM$lambda$27$lambda$26(float f, long j, Stroke stroke, long j2, DrawScope drawScope) {
        m2110drawCircularIndicatorBackgroundbw27NRU(drawScope, j, stroke);
        m2111drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, f * 360.0f, j2, stroke);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c9  */
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2102CircularProgressIndicatorLxG7B9w(Modifier modifier, long j, float f, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long j3;
        float f2;
        int i5;
        int i6;
        final Modifier modifier3;
        final int i7;
        final long j4;
        final float f3;
        final long j5;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        final long j6;
        int m6029getSquareKaPHkGw;
        long j7;
        int i8;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changedInstance;
        Object rememberedValue3;
        final long j8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1119119072);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)N(modifier,color:c#ui.graphics.Color,strokeWidth:c#ui.unit.Dp,backgroundColor:c#ui.graphics.Color,strokeCap:c#ui.graphics.StrokeCap)354@15229L7,356@15316L28,359@15482L352,373@15957L209,387@16443L247,382@16292L423,401@16909L256,396@16758L432,408@17264L538,408@17195L607:ProgressIndicator.kt#jmzs0o");
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            i4 |= ((i3 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= startRestartGroup.changed(f2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        i6 = i;
                        if (startRestartGroup.changed(i6)) {
                            i9 = 16384;
                            i4 |= i9;
                        }
                    } else {
                        i6 = i;
                    }
                    i9 = 8192;
                    i4 |= i9;
                } else {
                    i6 = i;
                }
                if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "349@15020L6");
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        j6 = j2;
                        companion = modifier2;
                    } else {
                        companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            long m1953getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                            i4 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                            j3 = m1953getPrimary0d7_KjU;
                        }
                        if (i11 != 0) {
                            f2 = ProgressIndicatorDefaults.INSTANCE.m2095getStrokeWidthD9Ej5fM();
                        }
                        long m5692getTransparent0d7_KjU = i5 != 0 ? Color.INSTANCE.m5692getTransparent0d7_KjU() : j2;
                        if ((i3 & 16) != 0) {
                            j6 = m5692getTransparent0d7_KjU;
                            m6029getSquareKaPHkGw = StrokeCap.INSTANCE.m6029getSquareKaPHkGw();
                            j7 = j3;
                            i8 = i4 & (-57345);
                            final float f4 = f2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1119119072, i8, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:353)");
                            }
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Stroke stroke = new Stroke(((Density) consume).mo424toPx0680j_4(f4), 0.0f, m6029getSquareKaPHkGw, 0, null, 26, null);
                            int i12 = m6029getSquareKaPHkGw;
                            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                            Modifier modifier4 = companion;
                            final State animateValue = InfiniteTransitionKt.animateValue(rememberInfiniteTransition, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
                            final State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1731554857, "CC(remember):ProgressIndicator.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CircularProgressIndicator_LxG7B9w$lambda$33$lambda$32;
                                        CircularProgressIndicator_LxG7B9w$lambda$33$lambda$32 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$33$lambda$32((KeyframesSpec.KeyframesSpecConfig) obj);
                                        return CircularProgressIndicator_LxG7B9w$lambda$33$lambda$32;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1731539936, "CC(remember):ProgressIndicator.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CircularProgressIndicator_LxG7B9w$lambda$36$lambda$35;
                                        CircularProgressIndicator_LxG7B9w$lambda$36$lambda$35 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$36$lambda$35((KeyframesSpec.KeyframesSpecConfig) obj);
                                        return CircularProgressIndicator_LxG7B9w$lambda$36$lambda$35;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue2), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                            Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier4), CircularIndicatorDiameter);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1731528294, "CC(remember):ProgressIndicator.kt#9igjgp");
                            changedInstance = startRestartGroup.changedInstance(stroke) | ((i8 & 7168) != 2048) | startRestartGroup.changed(animateValue) | startRestartGroup.changed(animateFloat2) | startRestartGroup.changed(animateFloat3) | startRestartGroup.changed(animateFloat) | ((i8 & 896) != 256) | ((((i8 & 112) ^ 48) <= 32 && startRestartGroup.changed(j7)) || (i8 & 48) == 32);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                j8 = j7;
                                rememberedValue3 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38;
                                        CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38(j6, stroke, f4, j8, animateValue, animateFloat2, animateFloat3, animateFloat, (DrawScope) obj);
                                        return CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                j8 = j7;
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            CanvasKt.Canvas(m889size3ABfNKs, (Function1) rememberedValue3, startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i7 = i12;
                            j5 = j6;
                            f3 = f4;
                            j4 = j8;
                            modifier3 = modifier4;
                        } else {
                            j6 = m5692getTransparent0d7_KjU;
                        }
                    }
                    i8 = i4;
                    m6029getSquareKaPHkGw = i6;
                    j7 = j3;
                    final float f42 = f2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Stroke stroke2 = new Stroke(((Density) consume2).mo424toPx0680j_4(f42), 0.0f, m6029getSquareKaPHkGw, 0, null, 26, null);
                    int i122 = m6029getSquareKaPHkGw;
                    InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
                    Modifier modifier42 = companion;
                    final State animateValue2 = InfiniteTransitionKt.animateValue(rememberInfiniteTransition2, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
                    final State animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1731554857, "CC(remember):ProgressIndicator.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final State animateFloat22 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1731539936, "CC(remember):ProgressIndicator.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final State animateFloat32 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue2), null, 0L, 6, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    Modifier m889size3ABfNKs2 = SizeKt.m889size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier42), CircularIndicatorDiameter);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1731528294, "CC(remember):ProgressIndicator.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(stroke2) | ((i8 & 7168) != 2048) | startRestartGroup.changed(animateValue2) | startRestartGroup.changed(animateFloat22) | startRestartGroup.changed(animateFloat32) | startRestartGroup.changed(animateFloat4) | ((i8 & 896) != 256) | ((((i8 & 112) ^ 48) <= 32 && startRestartGroup.changed(j7)) || (i8 & 48) == 32);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance) {
                    }
                    j8 = j7;
                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38;
                            CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38(j6, stroke2, f42, j8, animateValue2, animateFloat22, animateFloat32, animateFloat4, (DrawScope) obj);
                            return CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CanvasKt.Canvas(m889size3ABfNKs2, (Function1) rememberedValue3, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = i122;
                    j5 = j6;
                    f3 = f42;
                    j4 = j8;
                    modifier3 = modifier42;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    i7 = i6;
                    j4 = j3;
                    f3 = f2;
                    j5 = j2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit CircularProgressIndicator_LxG7B9w$lambda$40;
                            CircularProgressIndicator_LxG7B9w$lambda$40 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$40(Modifier.this, j4, f3, j5, i7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return CircularProgressIndicator_LxG7B9w$lambda$40;
                        }
                    });
                    return;
                }
                return;
            }
            if ((i2 & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_LxG7B9w$lambda$33$lambda$32(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(RotationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 0), CircularEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(JumpRotationAngle), 666);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_LxG7B9w$lambda$36$lambda$35(KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig) {
        keyframesSpecConfig.setDurationMillis(RotationDuration);
        keyframesSpecConfig.using(keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 666), CircularEasing);
        keyframesSpecConfig.at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(JumpRotationAngle), keyframesSpecConfig.getDurationMillis());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CircularProgressIndicator_LxG7B9w$lambda$39$lambda$38(long j, Stroke stroke, float f, long j2, State state, State state2, State state3, State state4, DrawScope drawScope) {
        m2110drawCircularIndicatorBackgroundbw27NRU(drawScope, j, stroke);
        m2112drawIndeterminateCircularIndicatorhrjfTZI(drawScope, CircularProgressIndicator_LxG7B9w$lambda$37(state3) + ((CircularProgressIndicator_LxG7B9w$lambda$30(state) * RotationAngleOffset) % 360.0f) + StartAngleOffset + CircularProgressIndicator_LxG7B9w$lambda$31(state4), f, Math.abs(CircularProgressIndicator_LxG7B9w$lambda$34(state2) - CircularProgressIndicator_LxG7B9w$lambda$37(state3)), j2, stroke);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0061  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2103CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        float f3;
        int i3;
        Modifier modifier2;
        long j2;
        int i4;
        float f4;
        final Modifier modifier3;
        final long j3;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        float m2095getStrokeWidthD9Ej5fM;
        long j4;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-409649739);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)N(progress,modifier,color:c#ui.graphics.Color,strokeWidth:c#ui.unit.Dp)430@18107L185:ProgressIndicator.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f3 = f;
        } else if ((i & 6) == 0) {
            f3 = f;
            i3 = (startRestartGroup.changed(f3) ? 4 : 2) | i;
        } else {
            f3 = f;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "427@18022L6");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        m2095getStrokeWidthD9Ej5fM = f4;
                        j4 = j2;
                        modifier4 = modifier2;
                    } else {
                        Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            j2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                            i3 &= -897;
                        }
                        m2095getStrokeWidthD9Ej5fM = i4 != 0 ? ProgressIndicatorDefaults.INSTANCE.m2095getStrokeWidthD9Ej5fM() : f4;
                        j4 = j2;
                        modifier4 = companion;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:430)");
                    }
                    m2101CircularProgressIndicatorDUhRLBM(f3, modifier4, j4, m2095getStrokeWidthD9Ej5fM, Color.INSTANCE.m5692getTransparent0d7_KjU(), StrokeCap.INSTANCE.m6027getButtKaPHkGw(), startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j3 = j4;
                    f5 = m2095getStrokeWidthD9Ej5fM;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j3 = j2;
                    f5 = f4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit CircularProgressIndicator_MBs18nI$lambda$41;
                            CircularProgressIndicator_MBs18nI$lambda$41 = ProgressIndicatorKt.CircularProgressIndicator_MBs18nI$lambda$41(f, modifier3, j3, f5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return CircularProgressIndicator_MBs18nI$lambda$41;
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006b  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2104CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f2;
        final Modifier modifier3;
        final long j3;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        float m2095getStrokeWidthD9Ej5fM;
        long j4;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-392089979);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)N(modifier,color:c#ui.graphics.Color,strokeWidth:c#ui.unit.Dp)446@18574L169:ProgressIndicator.kt#jmzs0o");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "443@18489L6");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                    }
                    m2095getStrokeWidthD9Ej5fM = f2;
                    j4 = j2;
                    modifier4 = modifier2;
                } else {
                    Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        j2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                        i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                    }
                    m2095getStrokeWidthD9Ej5fM = i5 != 0 ? ProgressIndicatorDefaults.INSTANCE.m2095getStrokeWidthD9Ej5fM() : f2;
                    j4 = j2;
                    modifier4 = companion;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-392089979, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:446)");
                }
                m2102CircularProgressIndicatorLxG7B9w(modifier4, j4, m2095getStrokeWidthD9Ej5fM, Color.INSTANCE.m5692getTransparent0d7_KjU(), StrokeCap.INSTANCE.m6029getSquareKaPHkGw(), startRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j3 = j4;
                f3 = m2095getStrokeWidthD9Ej5fM;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
                f3 = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CircularProgressIndicator_aM_cp0Q$lambda$42;
                        CircularProgressIndicator_aM_cp0Q$lambda$42 = ProgressIndicatorKt.CircularProgressIndicator_aM_cp0Q$lambda$42(Modifier.this, j3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CircularProgressIndicator_aM_cp0Q$lambda$42;
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m2109drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6236getSizeNHjbRc() >> 32)) - (f3 * width);
        DrawScope.m6215drawArcyD3GUKo$default(drawScope, j, f, f2, false, Offset.m5405constructorimpl((Float.floatToRawIntBits(width) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), Size.m5473constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), 0.0f, stroke, null, 0, 832, null);
    }

    /* renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    private static final void m2110drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m2109drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m2111drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m2109drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    private static final void m2112drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m2109drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m6023equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m6027getButtKaPHkGw()) ? 0.0f : ((f2 / Dp.m8401constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    public static final Modifier increaseSemanticsBounds(Modifier modifier) {
        final float m8401constructorimpl = Dp.m8401constructorimpl(10);
        return PaddingKt.m839paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(modifier, new Function3() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult increaseSemanticsBounds$lambda$1;
                increaseSemanticsBounds$lambda$1 = ProgressIndicatorKt.increaseSemanticsBounds$lambda$1(m8401constructorimpl, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return increaseSemanticsBounds$lambda$1;
            }
        }), true, new Function1() { // from class: androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit increaseSemanticsBounds$lambda$2;
                increaseSemanticsBounds$lambda$2 = ProgressIndicatorKt.increaseSemanticsBounds$lambda$2((SemanticsPropertyReceiver) obj);
                return increaseSemanticsBounds$lambda$2;
            }
        }), 0.0f, m8401constructorimpl, 1, null);
    }

    private static final float LinearProgressIndicator_2cYBFYY$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float LinearProgressIndicator_2cYBFYY$lambda$12(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float LinearProgressIndicator_2cYBFYY$lambda$15(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float LinearProgressIndicator_2cYBFYY$lambda$18(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final int CircularProgressIndicator_LxG7B9w$lambda$30(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final float CircularProgressIndicator_LxG7B9w$lambda$31(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float CircularProgressIndicator_LxG7B9w$lambda$34(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float CircularProgressIndicator_LxG7B9w$lambda$37(State<Float> state) {
        return state.getValue().floatValue();
    }
}
