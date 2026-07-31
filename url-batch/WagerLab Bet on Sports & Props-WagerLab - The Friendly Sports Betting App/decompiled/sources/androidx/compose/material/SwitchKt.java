package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a?\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\t\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0016\u0010\u001d\u001a\u00020\u001eX\u0080\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 \"\u0016\u0010\"\u001a\u00020\u001eX\u0080\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 \"\u0016\u0010$\u001a\u00020\u001eX\u0080\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 \"\u0010\u0010&\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010'\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010(\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010)\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010*\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120,X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010-\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u0010\u0010.\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!\"\u000e\u0010/\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00100\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!¨\u00061²\u0006\n\u00102\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\u0018\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/SwitchColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SwitchColors;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Lkotlin/Function0;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material/SwitchColors;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)V", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "trackWidth", "strokeWidth", "drawTrack-RPmYEkk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFF)V", "TrackWidth", "Landroidx/compose/ui/unit/Dp;", "getTrackWidth", "()F", "F", "TrackStrokeWidth", "getTrackStrokeWidth", "ThumbDiameter", "getThumbDiameter", "ThumbRippleRadius", "DefaultSwitchPadding", "SwitchWidth", "SwitchHeight", "ThumbPathLength", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "ThumbDefaultElevation", "ThumbPressedElevation", "SwitchPositionalThreshold", "SwitchVelocityThreshold", "material", "forceAnimationCheck", "currentOnCheckedChange", "currentChecked", "thumbColor", "resolvedThumbColor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchVelocityThreshold;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Switch$lambda$17(boolean z, Function1 function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, int i, int i2, Composer composer, int i3) {
        Switch(z, function1, modifier, z2, mutableInteractionSource, switchColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Switch$lambda$9$lambda$7(float f) {
        return f * 0.7f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Switch$lambda$9$lambda$8(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchImpl$lambda$27(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, Function0 function0, InteractionSource interactionSource, int i, Composer composer, int i2) {
        SwitchImpl(boxScope, z, z2, switchColors, function0, interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x044d, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, SwitchColors switchColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        SwitchColors switchColors2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource3;
        final SwitchColors switchColors3;
        ScopeUpdateScope endRestartGroup;
        MutableInteractionSource mutableInteractionSource4;
        SnapshotMutationPolicy snapshotMutationPolicy;
        boolean z4;
        SwitchColors switchColors4;
        int i7;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource5;
        AnchoredDraggableState anchoredDraggableState;
        SwitchKt$Switch$1$1 switchKt$Switch$1$1;
        Object obj;
        AnchoredDraggableState anchoredDraggableState2;
        Object obj2;
        boolean z5;
        MutableInteractionSource mutableInteractionSource6;
        ?? r10;
        int i8;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Object obj3;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(25866825);
        ComposerKt.sourceInformation(startRestartGroup, "C(Switch)N(checked,onCheckedChange,modifier,enabled,interactionSource,colors)103@4720L7,108@5102L34,109@5191L7,111@5276L524,124@5835L37,125@5899L29,126@5972L315,126@5933L354,135@6337L133,135@6292L178,140@6508L7,155@6950L1052:Switch.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            if (startRestartGroup.changed(switchColors2)) {
                                i9 = 131072;
                                i3 |= i9;
                            }
                        } else {
                            switchColors2 = switchColors;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "98@4526L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i7 = i6 & (-458753);
                                mutableInteractionSource4 = mutableInteractionSource2;
                                switchColors4 = switchColors2;
                                snapshotMutationPolicy = null;
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource2;
                                switchColors4 = switchColors2;
                                snapshotMutationPolicy = null;
                                i7 = i6;
                            }
                            z4 = false;
                            composer3 = startRestartGroup;
                        } else {
                            Modifier.Companion companion3 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i4 != 0 ? true : z3;
                            mutableInteractionSource4 = i5 != 0 ? null : mutableInteractionSource2;
                            if ((i2 & 32) != 0) {
                                snapshotMutationPolicy = null;
                                z4 = false;
                                SwitchColors m2189colorsSQMK_m0 = SwitchDefaults.INSTANCE.m2189colorsSQMK_m0(0L, 0L, 0.0f, 0L, 0L, 0.0f, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, AnalyticsListener.EVENT_DRM_KEYS_LOADED);
                                composer3 = startRestartGroup;
                                i7 = i6 & (-458753);
                                z3 = z6;
                                switchColors4 = m2189colorsSQMK_m0;
                                modifier2 = companion3;
                            } else {
                                snapshotMutationPolicy = null;
                                z4 = false;
                                modifier2 = companion3;
                                z3 = z6;
                                switchColors4 = switchColors2;
                                i7 = i6;
                                composer3 = startRestartGroup;
                            }
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(25866825, i7, -1, "androidx.compose.material.Switch (Switch.kt:99)");
                        }
                        if (mutableInteractionSource4 == null) {
                            composer3.startReplaceGroup(1799821714);
                            ComposerKt.sourceInformation(composer3, "101@4621L39");
                            ComposerKt.sourceInformationMarkerStart(composer3, -911772560, "CC(remember):Switch.kt#9igjgp");
                            Object rememberedValue = composer3.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceGroup();
                            mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                        } else {
                            composer3.startReplaceGroup(-911773211);
                            composer3.endReplaceGroup();
                            mutableInteractionSource5 = mutableInteractionSource4;
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        final float mo424toPx0680j_4 = ((Density) consume).mo424toPx0680j_4(ThumbPathLength);
                        ComposerKt.sourceInformationMarkerStart(composer3, -911757173, "CC(remember):Switch.kt#9igjgp");
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        MutableState mutableState = (MutableState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = composer3.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        final float mo424toPx0680j_42 = ((Density) consume2).mo424toPx0680j_4(SwitchVelocityThreshold);
                        ComposerKt.sourceInformationMarkerStart(composer3, -911751115, "CC(remember):Switch.kt#9igjgp");
                        boolean changed = composer3.changed(mo424toPx0680j_4) | composer3.changed(mo424toPx0680j_42);
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            final float f = 0.0f;
                            rememberedValue3 = new AnchoredDraggableState(Boolean.valueOf(z), AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    Unit Switch$lambda$9$lambda$6;
                                    Switch$lambda$9$lambda$6 = SwitchKt.Switch$lambda$9$lambda$6(f, mo424toPx0680j_4, (DraggableAnchorsConfig) obj4);
                                    return Switch$lambda$9$lambda$6;
                                }
                            }), new Function1() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    float Switch$lambda$9$lambda$7;
                                    Switch$lambda$9$lambda$7 = SwitchKt.Switch$lambda$9$lambda$7(((Float) obj4).floatValue());
                                    return Float.valueOf(Switch$lambda$9$lambda$7);
                                }
                            }, new Function0() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    float Switch$lambda$9$lambda$8;
                                    Switch$lambda$9$lambda$8 = SwitchKt.Switch$lambda$9$lambda$8(mo424toPx0680j_42);
                                    return Float.valueOf(Switch$lambda$9$lambda$8);
                                }
                            }, AnimationSpec, null, 32, null);
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        AnchoredDraggableState anchoredDraggableState3 = (AnchoredDraggableState) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        int i11 = i7 >> 3;
                        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer3, i11 & 14);
                        int i12 = i7 & 14;
                        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(z), composer3, i12);
                        ComposerKt.sourceInformationMarkerStart(composer3, -911729052, "CC(remember):Switch.kt#9igjgp");
                        boolean changed2 = composer3.changed(anchoredDraggableState3) | composer3.changed(rememberUpdatedState2) | composer3.changed(rememberUpdatedState);
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            SwitchKt$Switch$1$1 switchKt$Switch$1$12 = new SwitchKt$Switch$1$1(anchoredDraggableState3, rememberUpdatedState2, rememberUpdatedState, mutableState, null);
                            anchoredDraggableState = anchoredDraggableState3;
                            switchKt$Switch$1$1 = switchKt$Switch$1$12;
                            composer3.updateRememberedValue(switchKt$Switch$1$1);
                        } else {
                            switchKt$Switch$1$1 = rememberedValue4;
                            anchoredDraggableState = anchoredDraggableState3;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        EffectsKt.LaunchedEffect(anchoredDraggableState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) switchKt$Switch$1$1, composer3, z4 ? 1 : 0);
                        Boolean valueOf = Boolean.valueOf(z);
                        Boolean valueOf2 = Boolean.valueOf(Switch$lambda$3(mutableState));
                        ComposerKt.sourceInformationMarkerStart(composer3, -911717554, "CC(remember):Switch.kt#9igjgp");
                        boolean changed3 = (i12 == 4) | composer3.changed(anchoredDraggableState);
                        SwitchKt$Switch$2$1 rememberedValue5 = composer3.rememberedValue();
                        if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            obj = null;
                            rememberedValue5 = new SwitchKt$Switch$2$1(z, anchoredDraggableState, null);
                            composer3.updateRememberedValue(rememberedValue5);
                        } else {
                            obj = null;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue5, composer3, i12);
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        boolean z7 = consume3 == LayoutDirection.Rtl;
                        if (function1 != null) {
                            anchoredDraggableState2 = anchoredDraggableState;
                            obj2 = obj;
                            z5 = z3;
                            mutableInteractionSource6 = mutableInteractionSource5;
                            r10 = 0;
                            i8 = 2;
                            companion = ToggleableKt.m1171toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource6, null, z5, Role.m7575boximpl(Role.INSTANCE.m7588getSwitcho7Vup1c()), function1);
                        } else {
                            anchoredDraggableState2 = anchoredDraggableState;
                            obj2 = obj;
                            z5 = z3;
                            mutableInteractionSource6 = mutableInteractionSource5;
                            r10 = 0;
                            i8 = 2;
                            companion = Modifier.INSTANCE;
                        }
                        if (function1 != null) {
                            companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            companion2 = Modifier.INSTANCE;
                        }
                        final AnchoredDraggableState anchoredDraggableState4 = anchoredDraggableState2;
                        Modifier m883requiredSizeVpY3zN4 = SizeKt.m883requiredSizeVpY3zN4(PaddingKt.m837padding3ABfNKs(SizeKt.wrapContentSize$default(AnchoredDraggableKt.anchoredDraggable(modifier2.then(companion2).then(companion), anchoredDraggableState2, Orientation.Horizontal, (!z5 || function1 == null) ? r10 : true, z7, mutableInteractionSource6, false), Alignment.INSTANCE.getCenter(), r10, i8, obj2), DefaultSwitchPadding), SwitchWidth, SwitchHeight);
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r10);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, r10);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m883requiredSizeVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer3);
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 351089009, "C181@7892L42,177@7737L259:Switch.kt#jmzs0o");
                        boolean booleanValue = ((Boolean) anchoredDraggableState4.getTargetValue()).booleanValue();
                        ComposerKt.sourceInformationMarkerStart(composer3, -1928332455, "CC(remember):Switch.kt#9igjgp");
                        boolean changed4 = composer3.changed(anchoredDraggableState4);
                        Object rememberedValue6 = composer3.rememberedValue();
                        if (!changed4) {
                            obj3 = rememberedValue6;
                        }
                        Function0 function0 = new Function0() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float requireOffset;
                                requireOffset = AnchoredDraggableState.this.requireOffset();
                                return Float.valueOf(requireOffset);
                            }
                        };
                        composer3.updateRememberedValue(function0);
                        obj3 = function0;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        z3 = z5;
                        Modifier modifier4 = modifier2;
                        SwitchImpl(boxScopeInstance, booleanValue, z3, switchColors4, (Function0) obj3, mutableInteractionSource6, composer3, (i11 & 896) | 6 | ((i7 >> 6) & 7168));
                        composer2 = composer3;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        switchColors3 = switchColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        switchColors3 = switchColors2;
                    }
                    final boolean z8 = z3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Unit Switch$lambda$17;
                                Switch$lambda$17 = SwitchKt.Switch$lambda$17(z, function1, modifier3, z8, mutableInteractionSource3, switchColors3, i, i2, (Composer) obj4, ((Integer) obj5).intValue());
                                return Switch$lambda$17;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i6 & 1)) {
                }
                final boolean z82 = z3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i6 & 1)) {
            }
            final boolean z822 = z3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i6 & 1)) {
        }
        final boolean z8222 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Switch$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Switch$lambda$9$lambda$6(float f, float f2, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(false, f);
        draggableAnchorsConfig.at(true, f2);
        return Unit.INSTANCE;
    }

    private static final void SwitchImpl(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final Function0<Float> function0, final InteractionSource interactionSource, Composer composer, final int i) {
        int i2;
        float f;
        String str;
        boolean z3;
        long SwitchImpl$lambda$23;
        Composer startRestartGroup = composer.startRestartGroup(70908914);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchImpl)N(checked,enabled,colors,thumbValue,interactionSource)220@9074L46,222@9160L614,222@9126L648,242@10001L28,243@10089L81,243@10034L136,246@10200L28,247@10278L7,248@10337L7,251@10460L6,250@10395L252,259@10726L43,257@10652L455:Switch.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i3, -1, "androidx.compose.material.SwitchImpl (Switch.kt:219)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -576003520, "CC(remember):Switch.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -576000200, "CC(remember):Switch.kt#9igjgp");
            boolean z4 = (458752 & i3) == 131072;
            SwitchKt$SwitchImpl$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, (i3 >> 15) & 14);
            if (!snapshotStateList.isEmpty()) {
                f = ThumbPressedElevation;
            } else {
                f = ThumbDefaultElevation;
            }
            float f2 = f;
            int i4 = ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896);
            final State<Color> trackColor = switchColors.trackColor(z2, z, startRestartGroup, i4);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -575971005, "CC(remember):Switch.kt#9igjgp");
            boolean changed = startRestartGroup.changed(trackColor);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SwitchImpl$lambda$22$lambda$21;
                        SwitchImpl$lambda$22$lambda$21 = SwitchKt.SwitchImpl$lambda$22$lambda$21(State.this, (DrawScope) obj);
                        return SwitchImpl$lambda$22$lambda$21;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue3, startRestartGroup, 0);
            State<Color> thumbColor = switchColors.thumbColor(z2, z, startRestartGroup, i4);
            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localElevationOverlay);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ElevationOverlay elevationOverlay = (ElevationOverlay) consume;
            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localAbsoluteElevation);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m8401constructorimpl = Dp.m8401constructorimpl(((Dp) consume2).m8415unboximpl() + f2);
            if (!Color.m5658equalsimpl0(SwitchImpl$lambda$23(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU()) || elevationOverlay == null) {
                str = "CC(remember):Switch.kt#9igjgp";
                z3 = true;
                startRestartGroup.startReplaceGroup(-674731226);
                startRestartGroup.endReplaceGroup();
                SwitchImpl$lambda$23 = SwitchImpl$lambda$23(thumbColor);
            } else {
                startRestartGroup.startReplaceGroup(-674820165);
                ComposerKt.sourceInformation(startRestartGroup, "252@10539L36");
                str = "CC(remember):Switch.kt#9igjgp";
                z3 = true;
                SwitchImpl$lambda$23 = elevationOverlay.mo1984apply7g2Lkgo(SwitchImpl$lambda$23(thumbColor), m8401constructorimpl, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            State<Color> m125animateColorAsStateeuL9pac = SingleValueAnimationKt.m125animateColorAsStateeuL9pac(SwitchImpl$lambda$23, null, null, null, startRestartGroup, 0, 14);
            startRestartGroup = startRestartGroup;
            Modifier align = boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -575950659, str);
            boolean z5 = (57344 & i3) == 16384 ? z3 : false;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        IntOffset SwitchImpl$lambda$26$lambda$25;
                        SwitchImpl$lambda$26$lambda$25 = SwitchKt.SwitchImpl$lambda$26$lambda$25(Function0.this, (Density) obj);
                        return SwitchImpl$lambda$26$lambda$25;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(BackgroundKt.m261backgroundbw27NRU(ShadowKt.m5260shadows4CzXII$default(SizeKt.m881requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue4), interactionSource, RippleKt.m2121rippleH2RKhps$default(false, ThumbRippleRadius, 0L, 4, null)), ThumbDiameter), f2, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), SwitchImpl$lambda$24(m125animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SwitchKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SwitchImpl$lambda$27;
                    SwitchImpl$lambda$27 = SwitchKt.SwitchImpl$lambda$27(BoxScope.this, z, z2, switchColors, function0, interactionSource, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SwitchImpl$lambda$27;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchImpl$lambda$22$lambda$21(State state, DrawScope drawScope) {
        m2190drawTrackRPmYEkk(drawScope, SwitchImpl$lambda$20(state), drawScope.mo424toPx0680j_4(TrackWidth), drawScope.mo424toPx0680j_4(TrackStrokeWidth));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset SwitchImpl$lambda$26$lambda$25(Function0 function0, Density density) {
        return IntOffset.m8520boximpl(IntOffset.m8523constructorimpl((MathKt.roundToInt(((Number) function0.invoke()).floatValue()) << 32) | (0 & 4294967295L)));
    }

    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    private static final void m2190drawTrackRPmYEkk(DrawScope drawScope, long j, float f, float f2) {
        float f3 = f2 / 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6235getCenterF1C5BW0() & 4294967295L));
        long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo6235getCenterF1C5BW0() & 4294967295L));
        DrawScope.m6222drawLineNGM6Ib0$default(drawScope, j, m5405constructorimpl, Offset.m5405constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(f - f3) << 32)), f2, StrokeCap.INSTANCE.m6028getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Boolean, Unit> Switch$lambda$10(State<? extends Function1<? super Boolean, Unit>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final long SwitchImpl$lambda$20(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }

    private static final long SwitchImpl$lambda$23(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }

    private static final long SwitchImpl$lambda$24(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }

    static {
        float m8401constructorimpl = Dp.m8401constructorimpl(34);
        TrackWidth = m8401constructorimpl;
        TrackStrokeWidth = Dp.m8401constructorimpl(14);
        float m8401constructorimpl2 = Dp.m8401constructorimpl(20);
        ThumbDiameter = m8401constructorimpl2;
        ThumbRippleRadius = Dp.m8401constructorimpl(24);
        DefaultSwitchPadding = Dp.m8401constructorimpl(2);
        SwitchWidth = m8401constructorimpl;
        SwitchHeight = m8401constructorimpl2;
        ThumbPathLength = Dp.m8401constructorimpl(m8401constructorimpl - m8401constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m8401constructorimpl(1);
        ThumbPressedElevation = Dp.m8401constructorimpl(6);
        SwitchVelocityThreshold = Dp.m8401constructorimpl(125);
    }
}
