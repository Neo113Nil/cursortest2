package expo.modules.devmenu.fab;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.devmenu.compose.DevMenuState;
import expo.modules.devmenu.fab.ExpoVelocityTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MovableFloatingActionButton.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aC\u0010\u0019\u001a\u00020\r*\u00020\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000*$\b\u0002\u0010\b\"\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¨\u0006#"}, d2 = {"FabDefaultSize", "Landroidx/compose/ui/unit/DpSize;", "J", "Margin", "Landroidx/compose/ui/unit/Dp;", "F", "ClickDragTolerance", "", "AnimatableOffset", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/animation/core/AnimationVector2D;", "MovableFloatingActionButton", "", "state", "Lexpo/modules/devmenu/compose/DevMenuState;", "modifier", "Landroidx/compose/ui/Modifier;", "fabSize", ViewProps.MARGIN, "onRefreshPress", "Lkotlin/Function0;", "onOpenMenuPress", "MovableFloatingActionButton-_qgk6zs", "(Lexpo/modules/devmenu/compose/DevMenuState;Landroidx/compose/ui/Modifier;JFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "handleRelease", "Lkotlinx/coroutines/CoroutineScope;", "animatedOffset", "Lexpo/modules/devmenu/fab/AnimatableOffset;", "velocityTracker", "Lexpo/modules/devmenu/fab/ExpoVelocityTracker;", "totalFabSizePx", "bounds", "handleRelease-87Ui_GY", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/Animatable;Lexpo/modules/devmenu/fab/ExpoVelocityTracker;JJ)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MovableFloatingActionButtonKt {
    private static final float ClickDragTolerance = 40.0f;
    private static final long FabDefaultSize = DpKt.m8423DpSizeYgX7TsA(Dp.m8401constructorimpl(48), Dp.m8401constructorimpl(92));
    private static final float Margin = Dp.m8401constructorimpl(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MovableFloatingActionButton__qgk6zs$lambda$4(DevMenuState devMenuState, Modifier modifier, long j, float f, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        m10889MovableFloatingActionButton_qgk6zs(devMenuState, modifier, j, f, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0053  */
    /* renamed from: MovableFloatingActionButton-_qgk6zs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10889MovableFloatingActionButton_qgk6zs(final DevMenuState state, Modifier modifier, long j, float f, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        int i5;
        float f2;
        int i6;
        Function0<Unit> function03;
        int i7;
        Function0<Unit> function04;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(289105645);
        ComposerKt.sourceInformation(startRestartGroup, "C(MovableFloatingActionButton)P(5,2,0:c#ui.unit.DpSize,1:c#ui.unit.Dp,4)54@2233L2,55@2269L2,57@2332L3239,57@2278L3293:MovableFloatingActionButton.kt#c54gd2");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 384) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 256 : 128;
                }
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function03 = function0;
                    i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function04 = function02;
                        i3 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
                        if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                j2 = FabDefaultSize;
                            }
                            if (i5 != 0) {
                                f2 = Margin;
                            }
                            if (i6 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                function03 = (Function0) rememberedValue;
                            }
                            if (i7 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function0() { // from class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit unit;
                                            unit = Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                function04 = (Function0) rememberedValue2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(289105645, i3, -1, "expo.modules.devmenu.fab.MovableFloatingActionButton (MovableFloatingActionButton.kt:56)");
                            }
                            final long j3 = j2;
                            final float f3 = f2;
                            final Function0<Unit> function05 = function03;
                            final Function0<Unit> function06 = function04;
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-487586237, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i9) {
                                    int i10;
                                    long j4;
                                    long j5;
                                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                    ComposerKt.sourceInformation(composer3, "C59@2464L7,67@2708L24,68@2759L34,70@2877L62,71@2972L39,73@3052L515,73@3017L550,94@3677L1890,90@3573L1994:MovableFloatingActionButton.kt#c54gd2");
                                    if ((i9 & 6) == 0) {
                                        i10 = i9 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                    } else {
                                        i10 = i9;
                                    }
                                    if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-487586237, i10, -1, "expo.modules.devmenu.fab.MovableFloatingActionButton.<anonymous> (MovableFloatingActionButton.kt:58)");
                                    }
                                    float f4 = 2;
                                    long m8423DpSizeYgX7TsA = DpKt.m8423DpSizeYgX7TsA(Dp.m8401constructorimpl(DpSize.m8499getWidthD9Ej5fM(j3) + Dp.m8401constructorimpl(f3 * f4)), Dp.m8401constructorimpl(DpSize.m8497getHeightD9Ej5fM(j3) + Dp.m8401constructorimpl(f3 * f4)));
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) consume;
                                    long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8499getWidthD9Ej5fM(m8423DpSizeYgX7TsA))) << 32) | (Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8497getHeightD9Ej5fM(m8423DpSizeYgX7TsA))) & 4294967295L));
                                    long m5405constructorimpl2 = Offset.m5405constructorimpl((Float.floatToRawIntBits(Constraints.m8354getMaxWidthimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl >> 32))) << 32) | (Float.floatToRawIntBits(Constraints.m8353getMaxHeightimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl & 4294967295L))) & 4294967295L));
                                    Offset offset = (Offset) FabUtilsKt.rememberPrevious(Offset.m5402boximpl(m5405constructorimpl2), composer3, 0);
                                    composer3.startReplaceGroup(1849434622);
                                    ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                    Object rememberedValue3 = composer3.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        j4 = m8423DpSizeYgX7TsA;
                                        rememberedValue3 = new ExpoVelocityTracker(0L, 1, null);
                                        composer3.updateRememberedValue(rememberedValue3);
                                    } else {
                                        j4 = m8423DpSizeYgX7TsA;
                                    }
                                    ExpoVelocityTracker expoVelocityTracker = (ExpoVelocityTracker) rememberedValue3;
                                    composer3.endReplaceGroup();
                                    int i11 = (int) (m5405constructorimpl2 & 4294967295L);
                                    long m5407copydBAh8RU$default = Offset.m5407copydBAh8RU$default(m5405constructorimpl2, 0.0f, Float.intBitsToFloat(i11) * 0.75f, 1, null);
                                    composer3.startReplaceGroup(1849434622);
                                    ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                    Object rememberedValue4 = composer3.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new Animatable(Offset.m5402boximpl(m5407copydBAh8RU$default), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), null, null, 12, null);
                                        composer3.updateRememberedValue(rememberedValue4);
                                    }
                                    Animatable animatable = (Animatable) rememberedValue4;
                                    composer3.endReplaceGroup();
                                    composer3.startReplaceGroup(1849434622);
                                    ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                    Object rememberedValue5 = composer3.rememberedValue();
                                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                        composer3.updateRememberedValue(rememberedValue5);
                                    }
                                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue5;
                                    composer3.endReplaceGroup();
                                    Float valueOf = Float.valueOf(Float.intBitsToFloat((int) (m5405constructorimpl2 >> 32)));
                                    Float valueOf2 = Float.valueOf(Float.intBitsToFloat(i11));
                                    composer3.startReplaceGroup(-1224400529);
                                    ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                    boolean changed = composer3.changed(offset) | composer3.changedInstance(animatable) | composer3.changed(m5405constructorimpl2) | composer3.changed(m5405constructorimpl);
                                    Object rememberedValue6 = composer3.rememberedValue();
                                    if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        Object movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1 = new MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1(offset, animatable, m5405constructorimpl2, m5405constructorimpl, null);
                                        m5405constructorimpl2 = m5405constructorimpl2;
                                        j5 = m5405constructorimpl;
                                        rememberedValue6 = (Function2) movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1;
                                        composer3.updateRememberedValue(rememberedValue6);
                                    } else {
                                        j5 = m5405constructorimpl;
                                    }
                                    composer3.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue6, composer3, 0);
                                    AnimatedVisibilityKt.AnimatedVisibility(state.getShowFab(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1158864667, true, new AnonymousClass2(animatable, j4, f3, m5405constructorimpl2, expoVelocityTracker, j5, mutableInteractionSource, function05, function06), composer3, 54), composer3, 200064, 18);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: MovableFloatingActionButton.kt */
                                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                /* renamed from: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatedOffset;
                                    final /* synthetic */ long $bounds;
                                    final /* synthetic */ float $margin;
                                    final /* synthetic */ Function0<Unit> $onOpenMenuPress;
                                    final /* synthetic */ Function0<Unit> $onRefreshPress;
                                    final /* synthetic */ MutableInteractionSource $pillInteractionSource;
                                    final /* synthetic */ long $totalFabSize;
                                    final /* synthetic */ long $totalFabSizePx;
                                    final /* synthetic */ ExpoVelocityTracker $velocityTracker;

                                    AnonymousClass2(Animatable<Offset, AnimationVector2D> animatable, long j, float f, long j2, ExpoVelocityTracker expoVelocityTracker, long j3, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, Function0<Unit> function02) {
                                        this.$animatedOffset = animatable;
                                        this.$totalFabSize = j;
                                        this.$margin = f;
                                        this.$bounds = j2;
                                        this.$velocityTracker = expoVelocityTracker;
                                        this.$totalFabSizePx = j3;
                                        this.$pillInteractionSource = mutableInteractionSource;
                                        this.$onRefreshPress = function0;
                                        this.$onOpenMenuPress = function02;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                        invoke(animatedVisibilityScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        ComposerKt.sourceInformation(composer, "C97@3736L38,100@3876L1435,95@3685L1876:MovableFloatingActionButton.kt#c54gd2");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1158864667, i, -1, "expo.modules.devmenu.fab.MovableFloatingActionButton.<anonymous>.<anonymous> (MovableFloatingActionButton.kt:95)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        composer.startReplaceGroup(5004770);
                                        ComposerKt.sourceInformation(composer, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                        boolean changedInstance = composer.changedInstance(this.$animatedOffset);
                                        final Animatable<Offset, AnimationVector2D> animatable = this.$animatedOffset;
                                        Object rememberedValue = composer.rememberedValue();
                                        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR (r2v1 'rememberedValue' java.lang.Object) = 
                                                  (r1v0 'animatable' androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> A[DONT_INLINE])
                                                 A[MD:(androidx.compose.animation.core.Animatable):void (m)] (LINE:98) call: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0.<init>(androidx.compose.animation.core.Animatable):void type: CONSTRUCTOR in method: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 21 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 428
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.AnonymousClass2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final IntOffset invoke$lambda$1$lambda$0(Animatable animatable, Density offset) {
                                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                            return IntOffset.m8520boximpl(FabUtilsKt.m10887toIntOffsetk4lQ0M(((Offset) animatable.getValue()).m5423unboximpl()));
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                composer2 = startRestartGroup;
                                modifier3 = modifier2;
                            }
                            final long j4 = j2;
                            final float f4 = f2;
                            final Function0<Unit> function07 = function03;
                            final Function0<Unit> function08 = function04;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit MovableFloatingActionButton__qgk6zs$lambda$4;
                                        MovableFloatingActionButton__qgk6zs$lambda$4 = MovableFloatingActionButtonKt.MovableFloatingActionButton__qgk6zs$lambda$4(DevMenuState.this, modifier3, j4, f4, function07, function08, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return MovableFloatingActionButton__qgk6zs$lambda$4;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function04 = function02;
                        if ((i3 & 74899) == 74898) {
                        }
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final long j32 = j2;
                        final float f32 = f2;
                        final Function0<Unit> function052 = function03;
                        final Function0<Unit> function062 = function04;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-487586237, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                invoke(boxWithConstraintsScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i9) {
                                int i10;
                                long j42;
                                long j5;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                ComposerKt.sourceInformation(composer3, "C59@2464L7,67@2708L24,68@2759L34,70@2877L62,71@2972L39,73@3052L515,73@3017L550,94@3677L1890,90@3573L1994:MovableFloatingActionButton.kt#c54gd2");
                                if ((i9 & 6) == 0) {
                                    i10 = i9 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i10 = i9;
                                }
                                if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-487586237, i10, -1, "expo.modules.devmenu.fab.MovableFloatingActionButton.<anonymous> (MovableFloatingActionButton.kt:58)");
                                }
                                float f42 = 2;
                                long m8423DpSizeYgX7TsA = DpKt.m8423DpSizeYgX7TsA(Dp.m8401constructorimpl(DpSize.m8499getWidthD9Ej5fM(j32) + Dp.m8401constructorimpl(f32 * f42)), Dp.m8401constructorimpl(DpSize.m8497getHeightD9Ej5fM(j32) + Dp.m8401constructorimpl(f32 * f42)));
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume;
                                long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8499getWidthD9Ej5fM(m8423DpSizeYgX7TsA))) << 32) | (Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8497getHeightD9Ej5fM(m8423DpSizeYgX7TsA))) & 4294967295L));
                                long m5405constructorimpl2 = Offset.m5405constructorimpl((Float.floatToRawIntBits(Constraints.m8354getMaxWidthimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl >> 32))) << 32) | (Float.floatToRawIntBits(Constraints.m8353getMaxHeightimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl & 4294967295L))) & 4294967295L));
                                Offset offset = (Offset) FabUtilsKt.rememberPrevious(Offset.m5402boximpl(m5405constructorimpl2), composer3, 0);
                                composer3.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                Object rememberedValue3 = composer3.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    j42 = m8423DpSizeYgX7TsA;
                                    rememberedValue3 = new ExpoVelocityTracker(0L, 1, null);
                                    composer3.updateRememberedValue(rememberedValue3);
                                } else {
                                    j42 = m8423DpSizeYgX7TsA;
                                }
                                ExpoVelocityTracker expoVelocityTracker = (ExpoVelocityTracker) rememberedValue3;
                                composer3.endReplaceGroup();
                                int i11 = (int) (m5405constructorimpl2 & 4294967295L);
                                long m5407copydBAh8RU$default = Offset.m5407copydBAh8RU$default(m5405constructorimpl2, 0.0f, Float.intBitsToFloat(i11) * 0.75f, 1, null);
                                composer3.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                Object rememberedValue4 = composer3.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Animatable(Offset.m5402boximpl(m5407copydBAh8RU$default), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), null, null, 12, null);
                                    composer3.updateRememberedValue(rememberedValue4);
                                }
                                Animatable animatable = (Animatable) rememberedValue4;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                Object rememberedValue5 = composer3.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                    composer3.updateRememberedValue(rememberedValue5);
                                }
                                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue5;
                                composer3.endReplaceGroup();
                                Float valueOf = Float.valueOf(Float.intBitsToFloat((int) (m5405constructorimpl2 >> 32)));
                                Float valueOf2 = Float.valueOf(Float.intBitsToFloat(i11));
                                composer3.startReplaceGroup(-1224400529);
                                ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                                boolean changed = composer3.changed(offset) | composer3.changedInstance(animatable) | composer3.changed(m5405constructorimpl2) | composer3.changed(m5405constructorimpl);
                                Object rememberedValue6 = composer3.rememberedValue();
                                if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    Object movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1 = new MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1(offset, animatable, m5405constructorimpl2, m5405constructorimpl, null);
                                    m5405constructorimpl2 = m5405constructorimpl2;
                                    j5 = m5405constructorimpl;
                                    rememberedValue6 = (Function2) movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1;
                                    composer3.updateRememberedValue(rememberedValue6);
                                } else {
                                    j5 = m5405constructorimpl;
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue6, composer3, 0);
                                AnimatedVisibilityKt.AnimatedVisibility(state.getShowFab(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1158864667, true, new AnonymousClass2(animatable, j42, f32, m5405constructorimpl2, expoVelocityTracker, j5, mutableInteractionSource, function052, function062), composer3, 54), composer3, 200064, 18);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: MovableFloatingActionButton.kt */
                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatedOffset;
                                final /* synthetic */ long $bounds;
                                final /* synthetic */ float $margin;
                                final /* synthetic */ Function0<Unit> $onOpenMenuPress;
                                final /* synthetic */ Function0<Unit> $onRefreshPress;
                                final /* synthetic */ MutableInteractionSource $pillInteractionSource;
                                final /* synthetic */ long $totalFabSize;
                                final /* synthetic */ long $totalFabSizePx;
                                final /* synthetic */ ExpoVelocityTracker $velocityTracker;

                                AnonymousClass2(Animatable<Offset, AnimationVector2D> animatable, long j, float f, long j2, ExpoVelocityTracker expoVelocityTracker, long j3, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, Function0<Unit> function02) {
                                    this.$animatedOffset = animatable;
                                    this.$totalFabSize = j;
                                    this.$margin = f;
                                    this.$bounds = j2;
                                    this.$velocityTracker = expoVelocityTracker;
                                    this.$totalFabSizePx = j3;
                                    this.$pillInteractionSource = mutableInteractionSource;
                                    this.$onRefreshPress = function0;
                                    this.$onOpenMenuPress = function02;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                    invoke(animatedVisibilityScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR (r2v1 'rememberedValue' java.lang.Object) = 
                                      (r1v0 'animatable' androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> A[DONT_INLINE])
                                     A[MD:(androidx.compose.animation.core.Animatable):void (m)] (LINE:98) call: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0.<init>(androidx.compose.animation.core.Animatable):void type: CONSTRUCTOR in method: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 16 more
                                    */
                                public final void invoke(androidx.compose.animation.AnimatedVisibilityScope r11, androidx.compose.runtime.Composer r12, int r13) {
                                    /*
                                        Method dump skipped, instructions count: 428
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.AnonymousClass2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final IntOffset invoke$lambda$1$lambda$0(Animatable animatable, Density offset) {
                                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                    return IntOffset.m8520boximpl(FabUtilsKt.m10887toIntOffsetk4lQ0M(((Offset) animatable.getValue()).m5423unboximpl()));
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                        composer2 = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        final long j42 = j2;
                        final float f42 = f2;
                        final Function0 function072 = function03;
                        final Function0 function082 = function04;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function03 = function0;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                    }
                    function04 = function02;
                    if ((i3 & 74899) == 74898) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final long j322 = j2;
                    final float f322 = f2;
                    final Function0<Unit> function0522 = function03;
                    final Function0<Unit> function0622 = function04;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-487586237, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i9) {
                            int i10;
                            long j422;
                            long j5;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            ComposerKt.sourceInformation(composer3, "C59@2464L7,67@2708L24,68@2759L34,70@2877L62,71@2972L39,73@3052L515,73@3017L550,94@3677L1890,90@3573L1994:MovableFloatingActionButton.kt#c54gd2");
                            if ((i9 & 6) == 0) {
                                i10 = i9 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i10 = i9;
                            }
                            if ((i10 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-487586237, i10, -1, "expo.modules.devmenu.fab.MovableFloatingActionButton.<anonymous> (MovableFloatingActionButton.kt:58)");
                            }
                            float f422 = 2;
                            long m8423DpSizeYgX7TsA = DpKt.m8423DpSizeYgX7TsA(Dp.m8401constructorimpl(DpSize.m8499getWidthD9Ej5fM(j322) + Dp.m8401constructorimpl(f322 * f422)), Dp.m8401constructorimpl(DpSize.m8497getHeightD9Ej5fM(j322) + Dp.m8401constructorimpl(f322 * f422)));
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume;
                            long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8499getWidthD9Ej5fM(m8423DpSizeYgX7TsA))) << 32) | (Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8497getHeightD9Ej5fM(m8423DpSizeYgX7TsA))) & 4294967295L));
                            long m5405constructorimpl2 = Offset.m5405constructorimpl((Float.floatToRawIntBits(Constraints.m8354getMaxWidthimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl >> 32))) << 32) | (Float.floatToRawIntBits(Constraints.m8353getMaxHeightimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl & 4294967295L))) & 4294967295L));
                            Offset offset = (Offset) FabUtilsKt.rememberPrevious(Offset.m5402boximpl(m5405constructorimpl2), composer3, 0);
                            composer3.startReplaceGroup(1849434622);
                            ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                            Object rememberedValue3 = composer3.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                j422 = m8423DpSizeYgX7TsA;
                                rememberedValue3 = new ExpoVelocityTracker(0L, 1, null);
                                composer3.updateRememberedValue(rememberedValue3);
                            } else {
                                j422 = m8423DpSizeYgX7TsA;
                            }
                            ExpoVelocityTracker expoVelocityTracker = (ExpoVelocityTracker) rememberedValue3;
                            composer3.endReplaceGroup();
                            int i11 = (int) (m5405constructorimpl2 & 4294967295L);
                            long m5407copydBAh8RU$default = Offset.m5407copydBAh8RU$default(m5405constructorimpl2, 0.0f, Float.intBitsToFloat(i11) * 0.75f, 1, null);
                            composer3.startReplaceGroup(1849434622);
                            ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                            Object rememberedValue4 = composer3.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new Animatable(Offset.m5402boximpl(m5407copydBAh8RU$default), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), null, null, 12, null);
                                composer3.updateRememberedValue(rememberedValue4);
                            }
                            Animatable animatable = (Animatable) rememberedValue4;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1849434622);
                            ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                            Object rememberedValue5 = composer3.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                composer3.updateRememberedValue(rememberedValue5);
                            }
                            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue5;
                            composer3.endReplaceGroup();
                            Float valueOf = Float.valueOf(Float.intBitsToFloat((int) (m5405constructorimpl2 >> 32)));
                            Float valueOf2 = Float.valueOf(Float.intBitsToFloat(i11));
                            composer3.startReplaceGroup(-1224400529);
                            ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                            boolean changed = composer3.changed(offset) | composer3.changedInstance(animatable) | composer3.changed(m5405constructorimpl2) | composer3.changed(m5405constructorimpl);
                            Object rememberedValue6 = composer3.rememberedValue();
                            if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                Object movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1 = new MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1(offset, animatable, m5405constructorimpl2, m5405constructorimpl, null);
                                m5405constructorimpl2 = m5405constructorimpl2;
                                j5 = m5405constructorimpl;
                                rememberedValue6 = (Function2) movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1;
                                composer3.updateRememberedValue(rememberedValue6);
                            } else {
                                j5 = m5405constructorimpl;
                            }
                            composer3.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue6, composer3, 0);
                            AnimatedVisibilityKt.AnimatedVisibility(state.getShowFab(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1158864667, true, new AnonymousClass2(animatable, j422, f322, m5405constructorimpl2, expoVelocityTracker, j5, mutableInteractionSource, function0522, function0622), composer3, 54), composer3, 200064, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: MovableFloatingActionButton.kt */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                            final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatedOffset;
                            final /* synthetic */ long $bounds;
                            final /* synthetic */ float $margin;
                            final /* synthetic */ Function0<Unit> $onOpenMenuPress;
                            final /* synthetic */ Function0<Unit> $onRefreshPress;
                            final /* synthetic */ MutableInteractionSource $pillInteractionSource;
                            final /* synthetic */ long $totalFabSize;
                            final /* synthetic */ long $totalFabSizePx;
                            final /* synthetic */ ExpoVelocityTracker $velocityTracker;

                            AnonymousClass2(Animatable<Offset, AnimationVector2D> animatable, long j, float f, long j2, ExpoVelocityTracker expoVelocityTracker, long j3, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, Function0<Unit> function02) {
                                this.$animatedOffset = animatable;
                                this.$totalFabSize = j;
                                this.$margin = f;
                                this.$bounds = j2;
                                this.$velocityTracker = expoVelocityTracker;
                                this.$totalFabSizePx = j3;
                                this.$pillInteractionSource = mutableInteractionSource;
                                this.$onRefreshPress = function0;
                                this.$onOpenMenuPress = function02;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                invoke(animatedVisibilityScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR (r2v1 'rememberedValue' java.lang.Object) = 
                                  (r1v0 'animatable' androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> A[DONT_INLINE])
                                 A[MD:(androidx.compose.animation.core.Animatable):void (m)] (LINE:98) call: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0.<init>(androidx.compose.animation.core.Animatable):void type: CONSTRUCTOR in method: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 15 more
                                */
                            public final void invoke(androidx.compose.animation.AnimatedVisibilityScope r11, androidx.compose.runtime.Composer r12, int r13) {
                                /*
                                    Method dump skipped, instructions count: 428
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.AnonymousClass2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final IntOffset invoke$lambda$1$lambda$0(Animatable animatable, Density offset) {
                                Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                return IntOffset.m8520boximpl(FabUtilsKt.m10887toIntOffsetk4lQ0M(((Offset) animatable.getValue()).m5423unboximpl()));
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                    composer2 = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = companion;
                    final long j422 = j2;
                    final float f422 = f2;
                    final Function0 function0722 = function03;
                    final Function0 function0822 = function04;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function03 = function0;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                function04 = function02;
                if ((i3 & 74899) == 74898) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final long j3222 = j2;
                final float f3222 = f2;
                final Function0<Unit> function05222 = function03;
                final Function0<Unit> function06222 = function04;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-487586237, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i9) {
                        int i10;
                        long j4222;
                        long j5;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        ComposerKt.sourceInformation(composer3, "C59@2464L7,67@2708L24,68@2759L34,70@2877L62,71@2972L39,73@3052L515,73@3017L550,94@3677L1890,90@3573L1994:MovableFloatingActionButton.kt#c54gd2");
                        if ((i9 & 6) == 0) {
                            i10 = i9 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i10 = i9;
                        }
                        if ((i10 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-487586237, i10, -1, "expo.modules.devmenu.fab.MovableFloatingActionButton.<anonymous> (MovableFloatingActionButton.kt:58)");
                        }
                        float f4222 = 2;
                        long m8423DpSizeYgX7TsA = DpKt.m8423DpSizeYgX7TsA(Dp.m8401constructorimpl(DpSize.m8499getWidthD9Ej5fM(j3222) + Dp.m8401constructorimpl(f3222 * f4222)), Dp.m8401constructorimpl(DpSize.m8497getHeightD9Ej5fM(j3222) + Dp.m8401constructorimpl(f3222 * f4222)));
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume;
                        long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8499getWidthD9Ej5fM(m8423DpSizeYgX7TsA))) << 32) | (Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8497getHeightD9Ej5fM(m8423DpSizeYgX7TsA))) & 4294967295L));
                        long m5405constructorimpl2 = Offset.m5405constructorimpl((Float.floatToRawIntBits(Constraints.m8354getMaxWidthimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl >> 32))) << 32) | (Float.floatToRawIntBits(Constraints.m8353getMaxHeightimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl & 4294967295L))) & 4294967295L));
                        Offset offset = (Offset) FabUtilsKt.rememberPrevious(Offset.m5402boximpl(m5405constructorimpl2), composer3, 0);
                        composer3.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            j4222 = m8423DpSizeYgX7TsA;
                            rememberedValue3 = new ExpoVelocityTracker(0L, 1, null);
                            composer3.updateRememberedValue(rememberedValue3);
                        } else {
                            j4222 = m8423DpSizeYgX7TsA;
                        }
                        ExpoVelocityTracker expoVelocityTracker = (ExpoVelocityTracker) rememberedValue3;
                        composer3.endReplaceGroup();
                        int i11 = (int) (m5405constructorimpl2 & 4294967295L);
                        long m5407copydBAh8RU$default = Offset.m5407copydBAh8RU$default(m5405constructorimpl2, 0.0f, Float.intBitsToFloat(i11) * 0.75f, 1, null);
                        composer3.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Animatable(Offset.m5402boximpl(m5407copydBAh8RU$default), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), null, null, 12, null);
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        Animatable animatable = (Animatable) rememberedValue4;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                        Object rememberedValue5 = composer3.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                            composer3.updateRememberedValue(rememberedValue5);
                        }
                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue5;
                        composer3.endReplaceGroup();
                        Float valueOf = Float.valueOf(Float.intBitsToFloat((int) (m5405constructorimpl2 >> 32)));
                        Float valueOf2 = Float.valueOf(Float.intBitsToFloat(i11));
                        composer3.startReplaceGroup(-1224400529);
                        ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                        boolean changed = composer3.changed(offset) | composer3.changedInstance(animatable) | composer3.changed(m5405constructorimpl2) | composer3.changed(m5405constructorimpl);
                        Object rememberedValue6 = composer3.rememberedValue();
                        if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            Object movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1 = new MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1(offset, animatable, m5405constructorimpl2, m5405constructorimpl, null);
                            m5405constructorimpl2 = m5405constructorimpl2;
                            j5 = m5405constructorimpl;
                            rememberedValue6 = (Function2) movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1;
                            composer3.updateRememberedValue(rememberedValue6);
                        } else {
                            j5 = m5405constructorimpl;
                        }
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue6, composer3, 0);
                        AnimatedVisibilityKt.AnimatedVisibility(state.getShowFab(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1158864667, true, new AnonymousClass2(animatable, j4222, f3222, m5405constructorimpl2, expoVelocityTracker, j5, mutableInteractionSource, function05222, function06222), composer3, 54), composer3, 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: MovableFloatingActionButton.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                        final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatedOffset;
                        final /* synthetic */ long $bounds;
                        final /* synthetic */ float $margin;
                        final /* synthetic */ Function0<Unit> $onOpenMenuPress;
                        final /* synthetic */ Function0<Unit> $onRefreshPress;
                        final /* synthetic */ MutableInteractionSource $pillInteractionSource;
                        final /* synthetic */ long $totalFabSize;
                        final /* synthetic */ long $totalFabSizePx;
                        final /* synthetic */ ExpoVelocityTracker $velocityTracker;

                        AnonymousClass2(Animatable<Offset, AnimationVector2D> animatable, long j, float f, long j2, ExpoVelocityTracker expoVelocityTracker, long j3, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, Function0<Unit> function02) {
                            this.$animatedOffset = animatable;
                            this.$totalFabSize = j;
                            this.$margin = f;
                            this.$bounds = j2;
                            this.$velocityTracker = expoVelocityTracker;
                            this.$totalFabSizePx = j3;
                            this.$pillInteractionSource = mutableInteractionSource;
                            this.$onRefreshPress = function0;
                            this.$onOpenMenuPress = function02;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                            invoke(animatedVisibilityScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR (r2v1 'rememberedValue' java.lang.Object) = 
                              (r1v0 'animatable' androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> A[DONT_INLINE])
                             A[MD:(androidx.compose.animation.core.Animatable):void (m)] (LINE:98) call: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0.<init>(androidx.compose.animation.core.Animatable):void type: CONSTRUCTOR in method: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 14 more
                            */
                        public final void invoke(androidx.compose.animation.AnimatedVisibilityScope r11, androidx.compose.runtime.Composer r12, int r13) {
                            /*
                                Method dump skipped, instructions count: 428
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.AnonymousClass2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final IntOffset invoke$lambda$1$lambda$0(Animatable animatable, Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffset.m8520boximpl(FabUtilsKt.m10887toIntOffsetk4lQ0M(((Offset) animatable.getValue()).m5423unboximpl()));
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                composer2 = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                final long j4222 = j2;
                final float f4222 = f2;
                final Function0 function07222 = function03;
                final Function0 function08222 = function04;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i4 = i2 & 4;
            if (i4 == 0) {
            }
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            f2 = f;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function03 = function0;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            function04 = function02;
            if ((i3 & 74899) == 74898) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final long j32222 = j2;
            final float f32222 = f2;
            final Function0<Unit> function052222 = function03;
            final Function0<Unit> function062222 = function04;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-487586237, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i9) {
                    int i10;
                    long j42222;
                    long j5;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    ComposerKt.sourceInformation(composer3, "C59@2464L7,67@2708L24,68@2759L34,70@2877L62,71@2972L39,73@3052L515,73@3017L550,94@3677L1890,90@3573L1994:MovableFloatingActionButton.kt#c54gd2");
                    if ((i9 & 6) == 0) {
                        i10 = i9 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i10 = i9;
                    }
                    if ((i10 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-487586237, i10, -1, "expo.modules.devmenu.fab.MovableFloatingActionButton.<anonymous> (MovableFloatingActionButton.kt:58)");
                    }
                    float f42222 = 2;
                    long m8423DpSizeYgX7TsA = DpKt.m8423DpSizeYgX7TsA(Dp.m8401constructorimpl(DpSize.m8499getWidthD9Ej5fM(j32222) + Dp.m8401constructorimpl(f32222 * f42222)), Dp.m8401constructorimpl(DpSize.m8497getHeightD9Ej5fM(j32222) + Dp.m8401constructorimpl(f32222 * f42222)));
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume;
                    long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8499getWidthD9Ej5fM(m8423DpSizeYgX7TsA))) << 32) | (Float.floatToRawIntBits(density.mo424toPx0680j_4(DpSize.m8497getHeightD9Ej5fM(m8423DpSizeYgX7TsA))) & 4294967295L));
                    long m5405constructorimpl2 = Offset.m5405constructorimpl((Float.floatToRawIntBits(Constraints.m8354getMaxWidthimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl >> 32))) << 32) | (Float.floatToRawIntBits(Constraints.m8353getMaxHeightimpl(BoxWithConstraints.mo723getConstraintsmsEJaDk()) - Float.intBitsToFloat((int) (m5405constructorimpl & 4294967295L))) & 4294967295L));
                    Offset offset = (Offset) FabUtilsKt.rememberPrevious(Offset.m5402boximpl(m5405constructorimpl2), composer3, 0);
                    composer3.startReplaceGroup(1849434622);
                    ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        j42222 = m8423DpSizeYgX7TsA;
                        rememberedValue3 = new ExpoVelocityTracker(0L, 1, null);
                        composer3.updateRememberedValue(rememberedValue3);
                    } else {
                        j42222 = m8423DpSizeYgX7TsA;
                    }
                    ExpoVelocityTracker expoVelocityTracker = (ExpoVelocityTracker) rememberedValue3;
                    composer3.endReplaceGroup();
                    int i11 = (int) (m5405constructorimpl2 & 4294967295L);
                    long m5407copydBAh8RU$default = Offset.m5407copydBAh8RU$default(m5405constructorimpl2, 0.0f, Float.intBitsToFloat(i11) * 0.75f, 1, null);
                    composer3.startReplaceGroup(1849434622);
                    ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Animatable(Offset.m5402boximpl(m5407copydBAh8RU$default), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), null, null, 12, null);
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    Animatable animatable = (Animatable) rememberedValue4;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                    Object rememberedValue5 = composer3.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue5;
                    composer3.endReplaceGroup();
                    Float valueOf = Float.valueOf(Float.intBitsToFloat((int) (m5405constructorimpl2 >> 32)));
                    Float valueOf2 = Float.valueOf(Float.intBitsToFloat(i11));
                    composer3.startReplaceGroup(-1224400529);
                    ComposerKt.sourceInformation(composer3, "CC(remember):MovableFloatingActionButton.kt#9igjgp");
                    boolean changed = composer3.changed(offset) | composer3.changedInstance(animatable) | composer3.changed(m5405constructorimpl2) | composer3.changed(m5405constructorimpl);
                    Object rememberedValue6 = composer3.rememberedValue();
                    if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        Object movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1 = new MovableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1(offset, animatable, m5405constructorimpl2, m5405constructorimpl, null);
                        m5405constructorimpl2 = m5405constructorimpl2;
                        j5 = m5405constructorimpl;
                        rememberedValue6 = (Function2) movableFloatingActionButtonKt$MovableFloatingActionButton$3$1$1;
                        composer3.updateRememberedValue(rememberedValue6);
                    } else {
                        j5 = m5405constructorimpl;
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue6, composer3, 0);
                    AnimatedVisibilityKt.AnimatedVisibility(state.getShowFab(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1158864667, true, new AnonymousClass2(animatable, j42222, f32222, m5405constructorimpl2, expoVelocityTracker, j5, mutableInteractionSource, function052222, function062222), composer3, 54), composer3, 200064, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: MovableFloatingActionButton.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatedOffset;
                    final /* synthetic */ long $bounds;
                    final /* synthetic */ float $margin;
                    final /* synthetic */ Function0<Unit> $onOpenMenuPress;
                    final /* synthetic */ Function0<Unit> $onRefreshPress;
                    final /* synthetic */ MutableInteractionSource $pillInteractionSource;
                    final /* synthetic */ long $totalFabSize;
                    final /* synthetic */ long $totalFabSizePx;
                    final /* synthetic */ ExpoVelocityTracker $velocityTracker;

                    AnonymousClass2(Animatable<Offset, AnimationVector2D> animatable, long j, float f, long j2, ExpoVelocityTracker expoVelocityTracker, long j3, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, Function0<Unit> function02) {
                        this.$animatedOffset = animatable;
                        this.$totalFabSize = j;
                        this.$margin = f;
                        this.$bounds = j2;
                        this.$velocityTracker = expoVelocityTracker;
                        this.$totalFabSizePx = j3;
                        this.$pillInteractionSource = mutableInteractionSource;
                        this.$onRefreshPress = function0;
                        this.$onOpenMenuPress = function02;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                        invoke(animatedVisibilityScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR (r2v1 'rememberedValue' java.lang.Object) = 
                          (r1v0 'animatable' androidx.compose.animation.core.Animatable<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> A[DONT_INLINE])
                         A[MD:(androidx.compose.animation.core.Animatable):void (m)] (LINE:98) call: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0.<init>(androidx.compose.animation.core.Animatable):void type: CONSTRUCTOR in method: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 13 more
                        */
                    public final void invoke(androidx.compose.animation.AnimatedVisibilityScope r11, androidx.compose.runtime.Composer r12, int r13) {
                        /*
                            Method dump skipped, instructions count: 428
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: expo.modules.devmenu.fab.MovableFloatingActionButtonKt$MovableFloatingActionButton$3.AnonymousClass2.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final IntOffset invoke$lambda$1$lambda$0(Animatable animatable, Density offset) {
                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return IntOffset.m8520boximpl(FabUtilsKt.m10887toIntOffsetk4lQ0M(((Offset) animatable.getValue()).m5423unboximpl()));
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 6);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            final long j42222 = j2;
            final float f42222 = f2;
            final Function0 function072222 = function03;
            final Function0 function082222 = function04;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: handleRelease-87Ui_GY, reason: not valid java name */
        public static final void m10891handleRelease87Ui_GY(CoroutineScope coroutineScope, Animatable<Offset, AnimationVector2D> animatable, ExpoVelocityTracker expoVelocityTracker, long j, long j2) {
            ExpoVelocityTracker.PointF calculateVelocity = expoVelocityTracker.calculateVelocity();
            long m10883calculateTargetPositionIEwrmTk = FabUtilsKt.m10883calculateTargetPositionIEwrmTk(animatable.getValue().m5423unboximpl(), calculateVelocity, j2, Float.intBitsToFloat((int) (j >> 32)));
            expoVelocityTracker.clear();
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MovableFloatingActionButtonKt$handleRelease$1(animatable, m10883calculateTargetPositionIEwrmTk, calculateVelocity, null), 3, null);
        }
    }
