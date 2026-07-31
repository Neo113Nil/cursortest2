package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FloatCompanionObject;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¯\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2e\u0010\u0010\u001aa\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u0015\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TextFieldTransitionScope;", "", "<init>", "()V", "Transition", "", "inputState", "Landroidx/compose/material/InputPhase;", "focusedTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextStyleColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "showLabel", "", "content", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "Transition-DTcfvLk", "(Landroidx/compose/material/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Transition_DTcfvLk$lambda$7(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j, long j2, Function3 function3, boolean z, Function6 function6, int i, Composer composer, int i2) {
        textFieldTransitionScope.m2237TransitionDTcfvLk(inputPhase, j, j2, function3, z, function6, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private TextFieldTransitionScope() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0236, code lost:
    
        if (r32 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01eb, code lost:
    
        if (r32 != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2237TransitionDTcfvLk(final InputPhase inputPhase, final long j, final long j2, final Function3<? super InputPhase, ? super Composer, ? super Integer, Color> function3, final boolean z, final Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> function6, Composer composer, final int i) {
        int i2;
        Function6<? super Float, ? super Color, ? super Color, ? super Float, ? super Composer, ? super Integer, Unit> function62;
        Composer composer2;
        float f;
        Float f2;
        InputPhase inputPhase2;
        int i3;
        int i4;
        float f3;
        int i5;
        float f4;
        Float f5;
        int i6;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        Composer startRestartGroup = composer.startRestartGroup(509439888);
        ComposerKt.sourceInformation(startRestartGroup, "C(Transition)N(inputState,focusedTextStyleColor:c#ui.graphics.Color,unfocusedTextStyleColor:c#ui.graphics.Color,contentColor,showLabel,content)287@11617L59,290@11730L362,302@12151L1237,332@13448L332,343@13838L203,349@14051L82:TextFieldImpl.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(inputPhase.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function62 = function6;
            i2 |= startRestartGroup.changedInstance(function62) ? 131072 : 65536;
        } else {
            function62 = function6;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(509439888, i2, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:283)");
            }
            Transition updateTransition = TransitionKt.updateTransition(inputPhase, "TextFieldInputState", startRestartGroup, (i2 & 14) | 48, 0);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i7) {
                    composer3.startReplaceGroup(-883519390);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-883519390, i7, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:292)");
                    }
                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return tween$default;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
            InputPhase inputPhase3 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(389927550);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(389927550, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:294)");
            }
            int i7 = WhenMappings.$EnumSwitchMapping$0[inputPhase3.ordinal()];
            float f6 = 1.0f;
            if (i7 != 1) {
                if (i7 == 2) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf = Float.valueOf(f);
                    InputPhase inputPhase4 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(389927550);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                        f2 = valueOf;
                        inputPhase2 = inputPhase4;
                        i3 = -1;
                    } else {
                        f2 = valueOf;
                        inputPhase2 = inputPhase4;
                        i3 = -1;
                        ComposerKt.traceEventStart(389927550, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:294)");
                    }
                    i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            f3 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            int i8 = i3;
                            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, f2, Float.valueOf(f3), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                    return invoke(segment, composer3, num.intValue());
                                }

                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i9) {
                                    TweenSpec tween;
                                    composer3.startReplaceGroup(1849239065);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1849239065, i9, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
                                    }
                                    if (segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                        tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                                    } else if (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                        tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                                    } else {
                                        tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceGroup();
                                    return tween;
                                }
                            };
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                            InputPhase inputPhase5 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(1246942589);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1246942589, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:324)");
                            }
                            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase5.ordinal()];
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                f4 = 0.0f;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceGroup();
                                Float valueOf2 = Float.valueOf(f4);
                                InputPhase inputPhase6 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(1246942589);
                                ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                                if (ComposerKt.isTraceInProgress()) {
                                    f5 = valueOf2;
                                } else {
                                    f5 = valueOf2;
                                    ComposerKt.traceEventStart(1246942589, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:324)");
                                }
                                i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase6.ordinal()];
                                if (i6 != 1) {
                                    if (i6 != 2) {
                                        if (i6 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    f6 = 0.0f;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceGroup();
                                State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, f5, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                        return invoke(segment, composer3, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i9) {
                                        composer3.startReplaceGroup(-2017811095);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2017811095, i9, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
                                        }
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return tween$default;
                                    }
                                };
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
                                InputPhase inputPhase7 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-2001931362);
                                ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2001931362, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
                                }
                                long j3 = WhenMappings.$EnumSwitchMapping$0[inputPhase7.ordinal()] != 1 ? j : j2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceGroup();
                                ColorSpace m5661getColorSpaceimpl = Color.m5661getColorSpaceimpl(j3);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
                                changed = startRestartGroup.changed(m5661getColorSpaceimpl);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m5661getColorSpaceimpl);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                                InputPhase inputPhase8 = (InputPhase) updateTransition.getCurrentState();
                                startRestartGroup.startReplaceGroup(-2001931362);
                                ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2001931362, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
                                }
                                long j4 = WhenMappings.$EnumSwitchMapping$0[inputPhase8.ordinal()] != 1 ? j : j2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceGroup();
                                Color m5647boximpl = Color.m5647boximpl(j4);
                                InputPhase inputPhase9 = (InputPhase) updateTransition.getTargetState();
                                startRestartGroup.startReplaceGroup(-2001931362);
                                ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2001931362, 0, i8, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)");
                                }
                                long j5 = WhenMappings.$EnumSwitchMapping$0[inputPhase9.ordinal()] != 1 ? j : j2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                startRestartGroup.endReplaceGroup();
                                State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, m5647boximpl, Color.m5647boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                        return invoke(segment, composer3, num.intValue());
                                    }

                                    public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i9) {
                                        composer3.startReplaceGroup(-1176639650);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1176639650, i9, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
                                        }
                                        TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return tween$default;
                                    }
                                };
                                int i9 = (i2 & 7168) | 384;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
                                ColorSpace m5661getColorSpaceimpl2 = Color.m5661getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i9 >> 6) & 112)).m5667unboximpl());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
                                changed2 = startRestartGroup.changed(m5661getColorSpaceimpl2);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m5661getColorSpaceimpl2);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                                int i10 = ((((i9 << 3) & 57344) | 3072) >> 9) & 112;
                                State createTransitionAnimation4 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i10)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i10)), textFieldTransitionScope$Transition$labelContentColor$2.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                function62.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m5647boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation3)), Color.m5647boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation4)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2)), startRestartGroup, Integer.valueOf(57344 & (i2 >> 3)));
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                            f4 = 1.0f;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf22 = Float.valueOf(f4);
                            InputPhase inputPhase62 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(1246942589);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase62.ordinal()];
                            if (i6 != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, f5, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$2.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                    return invoke(segment, composer3, num.intValue());
                                }

                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i92) {
                                    composer3.startReplaceGroup(-2017811095);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2017811095, i92, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
                                    }
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceGroup();
                                    return tween$default;
                                }
                            };
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
                            InputPhase inputPhase72 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-2001931362);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase72.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            ColorSpace m5661getColorSpaceimpl3 = Color.m5661getColorSpaceimpl(j3);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
                            changed = startRestartGroup.changed(m5661getColorSpaceimpl3);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m5661getColorSpaceimpl3);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            TwoWayConverter twoWayConverter2 = (TwoWayConverter) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                            InputPhase inputPhase82 = (InputPhase) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceGroup(-2001931362);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase82.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Color m5647boximpl2 = Color.m5647boximpl(j4);
                            InputPhase inputPhase92 = (InputPhase) updateTransition.getTargetState();
                            startRestartGroup.startReplaceGroup(-2001931362);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (WhenMappings.$EnumSwitchMapping$0[inputPhase92.ordinal()] != 1) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, m5647boximpl2, Color.m5647boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$22.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter2, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                                    return invoke(segment, composer3, num.intValue());
                                }

                                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i92) {
                                    composer3.startReplaceGroup(-1176639650);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1176639650, i92, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
                                    }
                                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3.endReplaceGroup();
                                    return tween$default;
                                }
                            };
                            int i92 = (i2 & 7168) | 384;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
                            ColorSpace m5661getColorSpaceimpl22 = Color.m5661getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i92 >> 6) & 112)).m5667unboximpl());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
                            changed2 = startRestartGroup.changed(m5661getColorSpaceimpl22);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m5661getColorSpaceimpl22);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                            int i102 = ((((i92 << 3) & 57344) | 3072) >> 9) & 112;
                            State createTransitionAnimation42 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i102)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i102)), textFieldTransitionScope$Transition$labelContentColor$22.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            function62.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation)), Color.m5647boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation32)), Color.m5647boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation42)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation22)), startRestartGroup, Integer.valueOf(57344 & (i2 >> 3)));
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        } else if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    int i82 = i3;
                    State createTransitionAnimation5 = TransitionKt.createTransitionAnimation(updateTransition, f2, Float.valueOf(f3), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$22 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i93) {
                            TweenSpec tween;
                            composer3.startReplaceGroup(1849239065);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1849239065, i93, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
                            }
                            if (segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                                tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                            } else if (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                                tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                            } else {
                                tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return tween;
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                    InputPhase inputPhase52 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(1246942589);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase52.ordinal()];
                    if (i5 != 1) {
                    }
                    f4 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf222 = Float.valueOf(f4);
                    InputPhase inputPhase622 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(1246942589);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase622.ordinal()];
                    if (i6 != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, f5, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$22.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i922) {
                            composer3.startReplaceGroup(-2017811095);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2017811095, i922, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
                            }
                            TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return tween$default;
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
                    InputPhase inputPhase722 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-2001931362);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase722.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ColorSpace m5661getColorSpaceimpl32 = Color.m5661getColorSpaceimpl(j3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
                    changed = startRestartGroup.changed(m5661getColorSpaceimpl32);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m5661getColorSpaceimpl32);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    TwoWayConverter twoWayConverter22 = (TwoWayConverter) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                    InputPhase inputPhase822 = (InputPhase) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceGroup(-2001931362);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase822.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Color m5647boximpl22 = Color.m5647boximpl(j4);
                    InputPhase inputPhase922 = (InputPhase) updateTransition.getTargetState();
                    startRestartGroup.startReplaceGroup(-2001931362);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[inputPhase922.ordinal()] != 1) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    State createTransitionAnimation322 = TransitionKt.createTransitionAnimation(updateTransition, m5647boximpl22, Color.m5647boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter22, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                            return invoke(segment, composer3, num.intValue());
                        }

                        public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i922) {
                            composer3.startReplaceGroup(-1176639650);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1176639650, i922, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
                            }
                            TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return tween$default;
                        }
                    };
                    int i922 = (i2 & 7168) | 384;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
                    ColorSpace m5661getColorSpaceimpl222 = Color.m5661getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i922 >> 6) & 112)).m5667unboximpl());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
                    changed2 = startRestartGroup.changed(m5661getColorSpaceimpl222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m5661getColorSpaceimpl222);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
                    int i1022 = ((((i922 << 3) & 57344) | 3072) >> 9) & 112;
                    State createTransitionAnimation422 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i1022)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i1022)), textFieldTransitionScope$Transition$labelContentColor$222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    function62.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation5)), Color.m5647boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation322)), Color.m5647boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation422)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation222)), startRestartGroup, Integer.valueOf(57344 & (i2 >> 3)));
                    composer2 = startRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf3 = Float.valueOf(f);
            InputPhase inputPhase42 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(389927550);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[inputPhase2.ordinal()];
            if (i4 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            int i822 = i3;
            State createTransitionAnimation52 = TransitionKt.createTransitionAnimation(updateTransition, f2, Float.valueOf(f3), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextFieldTransitionScope$Transition$placeholderOpacity$2 textFieldTransitionScope$Transition$placeholderOpacity$222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i93) {
                    TweenSpec tween;
                    composer3.startReplaceGroup(1849239065);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1849239065, i93, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:305)");
                    }
                    if (segment.isTransitioningTo(InputPhase.Focused, InputPhase.UnfocusedEmpty)) {
                        tween = AnimationSpecKt.tween$default(67, 0, EasingKt.getLinearEasing(), 2, null);
                    } else if (segment.isTransitioningTo(InputPhase.UnfocusedEmpty, InputPhase.Focused) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, InputPhase.UnfocusedEmpty)) {
                        tween = AnimationSpecKt.tween(83, 67, EasingKt.getLinearEasing());
                    } else {
                        tween = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return tween;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
            InputPhase inputPhase522 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(1246942589);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i5 = WhenMappings.$EnumSwitchMapping$0[inputPhase522.ordinal()];
            if (i5 != 1) {
            }
            f4 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf2222 = Float.valueOf(f4);
            InputPhase inputPhase6222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(1246942589);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = WhenMappings.$EnumSwitchMapping$0[inputPhase6222.ordinal()];
            if (i6 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation2222 = TransitionKt.createTransitionAnimation(updateTransition, f5, Float.valueOf(f6), textFieldTransitionScope$Transition$placeholderOpacity$222.invoke((TextFieldTransitionScope$Transition$placeholderOpacity$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222, "PlaceholderOpacity", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextFieldTransitionScope$Transition$labelTextStyleColor$2 textFieldTransitionScope$Transition$labelTextStyleColor$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i9222) {
                    composer3.startReplaceGroup(-2017811095);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2017811095, i9222, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:333)");
                    }
                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return tween$default;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
            InputPhase inputPhase7222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-2001931362);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase7222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m5661getColorSpaceimpl322 = Color.m5661getColorSpaceimpl(j3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
            changed = startRestartGroup.changed(m5661getColorSpaceimpl322);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m5661getColorSpaceimpl322);
            startRestartGroup.updateRememberedValue(rememberedValue);
            TwoWayConverter twoWayConverter222 = (TwoWayConverter) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
            InputPhase inputPhase8222 = (InputPhase) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-2001931362);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase8222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Color m5647boximpl222 = Color.m5647boximpl(j4);
            InputPhase inputPhase9222 = (InputPhase) updateTransition.getTargetState();
            startRestartGroup.startReplaceGroup(-2001931362);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):TextFieldImpl.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$0[inputPhase9222.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation3222 = TransitionKt.createTransitionAnimation(updateTransition, m5647boximpl222, Color.m5647boximpl(j5), textFieldTransitionScope$Transition$labelTextStyleColor$2222.invoke((TextFieldTransitionScope$Transition$labelTextStyleColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter222, "LabelTextStyleColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextFieldTransitionScope$Transition$labelContentColor$2 textFieldTransitionScope$Transition$labelContentColor$2222 = new Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, Integer num) {
                    return invoke(segment, composer3, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<InputPhase> segment, Composer composer3, int i9222) {
                    composer3.startReplaceGroup(-1176639650);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1176639650, i9222, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:344)");
                    }
                    TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer3.endReplaceGroup();
                    return tween$default;
                }
            };
            int i9222 = (i2 & 7168) | 384;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
            ColorSpace m5661getColorSpaceimpl2222 = Color.m5661getColorSpaceimpl(function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf((i9222 >> 6) & 112)).m5667unboximpl());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
            changed2 = startRestartGroup.changed(m5661getColorSpaceimpl2222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m5661getColorSpaceimpl2222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
            int i10222 = ((((i9222 << 3) & 57344) | 3072) >> 9) & 112;
            State createTransitionAnimation4222 = TransitionKt.createTransitionAnimation(updateTransition, function3.invoke(updateTransition.getCurrentState(), startRestartGroup, Integer.valueOf(i10222)), function3.invoke(updateTransition.getTargetState(), startRestartGroup, Integer.valueOf(i10222)), textFieldTransitionScope$Transition$labelContentColor$2222.invoke((TextFieldTransitionScope$Transition$labelContentColor$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), (TwoWayConverter) rememberedValue2, "LabelContentColor", startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            function62.invoke(Float.valueOf(Transition_DTcfvLk$lambda$1(createTransitionAnimation52)), Color.m5647boximpl(Transition_DTcfvLk$lambda$5(createTransitionAnimation3222)), Color.m5647boximpl(Transition_DTcfvLk$lambda$6(createTransitionAnimation4222)), Float.valueOf(Transition_DTcfvLk$lambda$3(createTransitionAnimation2222)), startRestartGroup, Integer.valueOf(57344 & (i2 >> 3)));
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldTransitionScope$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Transition_DTcfvLk$lambda$7;
                    Transition_DTcfvLk$lambda$7 = TextFieldTransitionScope.Transition_DTcfvLk$lambda$7(TextFieldTransitionScope.this, inputPhase, j, j2, function3, z, function6, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Transition_DTcfvLk$lambda$7;
                }
            });
        }
    }

    private static final float Transition_DTcfvLk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float Transition_DTcfvLk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long Transition_DTcfvLk$lambda$5(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }

    private static final long Transition_DTcfvLk$lambda$6(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }
}
