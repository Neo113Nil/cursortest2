package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FloatingActionButtonContent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"FloatingActionButtonContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onRefreshPress", "Lkotlin/Function0;", "onEllipsisPress", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "VerticalActionPillPreview", "(Landroidx/compose/runtime/Composer;I)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: FloatingActionButtonContentKt, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class FloatingActionButtonContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingActionButtonContent$lambda$7(Modifier modifier, MutableInteractionSource mutableInteractionSource, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        FloatingActionButtonContent(modifier, mutableInteractionSource, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalActionPillPreview$lambda$9(int i, Composer composer, int i2) {
        VerticalActionPillPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FloatingActionButtonContent(Modifier modifier, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        MutableInteractionSource mutableInteractionSource2;
        int i4;
        Function0<Unit> function03;
        int i5;
        Function0<Unit> function04;
        MutableInteractionSource mutableInteractionSource3;
        Function0<Unit> function05;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource4;
        final Function0<Unit> function06;
        final Function0<Unit> function07;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-348550790);
        ComposerKt.sourceInformation(startRestartGroup, "C(FloatingActionButtonContent)P(1!1,3)36@1585L39,37@1657L2,38@1693L2,43@1838L27,44@1888L27,45@1930L24,52@2098L6,56@2202L6,60@2290L2293,47@1958L2625:FloatingActionButtonContent.kt");
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
            i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
                    if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 == 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i4 != 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new Function0() { // from class: FloatingActionButtonContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit unit;
                                        unit = Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            startRestartGroup.endReplaceGroup();
                            function03 = (Function0) rememberedValue5;
                        }
                        if (i5 == 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new Function0() { // from class: FloatingActionButtonContentKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit unit;
                                        unit = Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            startRestartGroup.endReplaceGroup();
                            function05 = (Function0) rememberedValue6;
                        } else {
                            function05 = function04;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-348550790, i3, -1, "FloatingActionButtonContent (FloatingActionButtonContent.kt:39)");
                        }
                        RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                        float m8401constructorimpl = Dp.m8401constructorimpl(14);
                        float m8401constructorimpl2 = Dp.m8401constructorimpl(16);
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        Animatable animatable = (Animatable) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        Animatable animatable2 = (Animatable) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier modifier5 = modifier4;
                        RoundedCornerShape roundedCornerShape = RoundedCornerShape;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                        Function0<Unit> function08 = function03;
                        BoxWithConstraintsKt.BoxWithConstraints(ClipKt.clip(BackgroundKt.m261backgroundbw27NRU(BorderKt.m274borderxT4_qwU(ShadowKt.m5260shadows4CzXII$default(modifier5, Dp.m8401constructorimpl(6), roundedCornerShape, false, 0L, 0L, 28, null), Dp.m8401constructorimpl(1), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBorder().getDefault(), roundedCornerShape), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getDefault(), roundedCornerShape), roundedCornerShape), null, false, ComposableLambdaKt.rememberComposableLambda(-883714864, true, new FloatingActionButtonContentKt$FloatingActionButtonContent$4(m8401constructorimpl, modifier5, RoundedCornerShape, m8401constructorimpl2, animatable, mutableInteractionSource5, function08, (CoroutineScope) rememberedValue3, animatable2, function05), startRestartGroup, 54), startRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        mutableInteractionSource4 = mutableInteractionSource5;
                        function06 = function08;
                        function07 = function05;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        function06 = function03;
                        function07 = function04;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: FloatingActionButtonContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit FloatingActionButtonContent$lambda$7;
                                FloatingActionButtonContent$lambda$7 = FloatingActionButtonContent.FloatingActionButtonContent$lambda$7(Modifier.this, mutableInteractionSource4, function06, function07, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return FloatingActionButtonContent$lambda$7;
                            }
                        });
                        return;
                    }
                    return;
                }
                function04 = function02;
                if ((i3 & 1171) == 1170) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                RoundedCornerShape RoundedCornerShape2 = RoundedCornerShapeKt.RoundedCornerShape(50);
                float m8401constructorimpl3 = Dp.m8401constructorimpl(14);
                float m8401constructorimpl22 = Dp.m8401constructorimpl(16);
                startRestartGroup.startReplaceGroup(1849434622);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                Animatable animatable3 = (Animatable) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                Animatable animatable22 = (Animatable) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier modifier52 = modifier4;
                RoundedCornerShape roundedCornerShape2 = RoundedCornerShape2;
                MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                Function0<Unit> function082 = function03;
                BoxWithConstraintsKt.BoxWithConstraints(ClipKt.clip(BackgroundKt.m261backgroundbw27NRU(BorderKt.m274borderxT4_qwU(ShadowKt.m5260shadows4CzXII$default(modifier52, Dp.m8401constructorimpl(6), roundedCornerShape2, false, 0L, 0L, 28, null), Dp.m8401constructorimpl(1), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBorder().getDefault(), roundedCornerShape2), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getDefault(), roundedCornerShape2), roundedCornerShape2), null, false, ComposableLambdaKt.rememberComposableLambda(-883714864, true, new FloatingActionButtonContentKt$FloatingActionButtonContent$4(m8401constructorimpl3, modifier52, RoundedCornerShape2, m8401constructorimpl22, animatable3, mutableInteractionSource52, function082, (CoroutineScope) rememberedValue3, animatable22, function05), startRestartGroup, 54), startRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                mutableInteractionSource4 = mutableInteractionSource52;
                function06 = function082;
                function07 = function05;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function04 = function02;
            if ((i3 & 1171) == 1170) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape RoundedCornerShape22 = RoundedCornerShapeKt.RoundedCornerShape(50);
            float m8401constructorimpl32 = Dp.m8401constructorimpl(14);
            float m8401constructorimpl222 = Dp.m8401constructorimpl(16);
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            Animatable animatable32 = (Animatable) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            Animatable animatable222 = (Animatable) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier modifier522 = modifier4;
            RoundedCornerShape roundedCornerShape22 = RoundedCornerShape22;
            MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
            Function0<Unit> function0822 = function03;
            BoxWithConstraintsKt.BoxWithConstraints(ClipKt.clip(BackgroundKt.m261backgroundbw27NRU(BorderKt.m274borderxT4_qwU(ShadowKt.m5260shadows4CzXII$default(modifier522, Dp.m8401constructorimpl(6), roundedCornerShape22, false, 0L, 0L, 28, null), Dp.m8401constructorimpl(1), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBorder().getDefault(), roundedCornerShape22), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getDefault(), roundedCornerShape22), roundedCornerShape22), null, false, ComposableLambdaKt.rememberComposableLambda(-883714864, true, new FloatingActionButtonContentKt$FloatingActionButtonContent$4(m8401constructorimpl32, modifier522, RoundedCornerShape22, m8401constructorimpl222, animatable32, mutableInteractionSource522, function0822, (CoroutineScope) rememberedValue3, animatable222, function05), startRestartGroup, 54), startRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier522;
            mutableInteractionSource4 = mutableInteractionSource522;
            function06 = function0822;
            function07 = function05;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function04 = function02;
        if ((i3 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape RoundedCornerShape222 = RoundedCornerShapeKt.RoundedCornerShape(50);
        float m8401constructorimpl322 = Dp.m8401constructorimpl(14);
        float m8401constructorimpl2222 = Dp.m8401constructorimpl(16);
        startRestartGroup.startReplaceGroup(1849434622);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        Animatable animatable322 = (Animatable) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):FloatingActionButtonContent.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        Animatable animatable2222 = (Animatable) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier modifier5222 = modifier4;
        RoundedCornerShape roundedCornerShape222 = RoundedCornerShape222;
        MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
        Function0<Unit> function08222 = function03;
        BoxWithConstraintsKt.BoxWithConstraints(ClipKt.clip(BackgroundKt.m261backgroundbw27NRU(BorderKt.m274borderxT4_qwU(ShadowKt.m5260shadows4CzXII$default(modifier5222, Dp.m8401constructorimpl(6), roundedCornerShape222, false, 0L, 0L, 28, null), Dp.m8401constructorimpl(1), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBorder().getDefault(), roundedCornerShape222), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getDefault(), roundedCornerShape222), roundedCornerShape222), null, false, ComposableLambdaKt.rememberComposableLambda(-883714864, true, new FloatingActionButtonContentKt$FloatingActionButtonContent$4(m8401constructorimpl322, modifier5222, RoundedCornerShape222, m8401constructorimpl2222, animatable322, mutableInteractionSource5222, function08222, (CoroutineScope) rememberedValue3, animatable2222, function05), startRestartGroup, 54), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier5222;
        mutableInteractionSource4 = mutableInteractionSource5222;
        function06 = function08222;
        function07 = function05;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void VerticalActionPillPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-681932508);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalActionPillPreview)140@4865L6,137@4781L244:FloatingActionButtonContent.kt");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-681932508, i, -1, "VerticalActionPillPreview (FloatingActionButtonContent.kt:134)");
            }
            Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(32)), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBorder().getDefault(), null, 2, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m262backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2091255858, "C143@4954L67:FloatingActionButtonContent.kt");
            FloatingActionButtonContent(SizeKt.m891sizeVpY3zN4(Modifier.INSTANCE, Dp.m8401constructorimpl(46), Dp.m8401constructorimpl(92)), null, null, null, startRestartGroup, 6, 14);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: FloatingActionButtonContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalActionPillPreview$lambda$9;
                    VerticalActionPillPreview$lambda$9 = FloatingActionButtonContent.VerticalActionPillPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalActionPillPreview$lambda$9;
                }
            });
        }
    }
}
