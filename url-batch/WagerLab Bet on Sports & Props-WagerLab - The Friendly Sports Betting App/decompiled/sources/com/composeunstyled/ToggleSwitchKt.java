package com.composeunstyled;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToggleSwitch.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"ToggleSwitch", "", "toggled", "", "modifier", "Landroidx/compose/ui/Modifier;", "onToggled", "Lkotlin/Function1;", ViewProps.ENABLED, "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "thumb", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ToggleSwitch-Yod850M", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "core_release", "trackWidth", "Landroidx/compose/ui/unit/Dp;", "thumbWidth", "actualTrackWidth", "offset"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleSwitchKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleSwitch_Yod850M$lambda$19(boolean z, Modifier modifier, Function1 function1, boolean z2, Shape shape, long j, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Indication indication, Function2 function2, int i, int i2, Composer composer, int i3) {
        m9560ToggleSwitchYod850M(z, modifier, function1, z2, shape, j, paddingValues, mutableInteractionSource, indication, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0366 A[LOOP:0: B:85:0x0360->B:87:0x0366, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03f8  */
    /* renamed from: ToggleSwitch-Yod850M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9560ToggleSwitchYod850M(final boolean z, Modifier modifier, Function1<? super Boolean, Unit> function1, boolean z2, Shape shape, long j, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Indication indication, final Function2<? super Composer, ? super Integer, Unit> thumb, Composer composer, final int i, final int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        Function1<? super Boolean, Unit> function12;
        int i5;
        boolean z3;
        int i6;
        Shape shape2;
        int i7;
        int i8;
        long j2;
        int i9;
        int i10;
        int i11;
        boolean z4;
        Shape rectangleShape;
        PaddingValues noPadding;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        Indication indication3;
        boolean z5;
        Object rememberedValue;
        Object rememberedValue2;
        int i12;
        final MutableState mutableState;
        Function1<? super Boolean, Unit> function13;
        boolean changed;
        Object rememberedValue3;
        float m8401constructorimpl;
        boolean changed2;
        Object rememberedValue4;
        Indication indication4;
        boolean z6;
        Iterator it;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        boolean changed3;
        Object rememberedValue5;
        int currentCompositeKeyHash2;
        Composer m4976constructorimpl2;
        Composer composer2;
        final Shape shape3;
        final PaddingValues paddingValues2;
        final Indication indication5;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z7;
        final Function1<? super Boolean, Unit> function14;
        final long j3;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Composer startRestartGroup = composer.startRestartGroup(871364252);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        shape2 = shape;
                        i3 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i8 = i14;
                            j2 = j;
                            i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                            i9 = i2 & 64;
                            if (i9 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                            }
                            i10 = i2 & 128;
                            if (i10 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i11 = i10;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                if ((i & 100663296) == 0) {
                                    if ((i2 & 256) == 0 && startRestartGroup.changed(indication)) {
                                        i13 = 67108864;
                                        i3 |= i13;
                                    }
                                    i13 = 33554432;
                                    i3 |= i13;
                                }
                                if ((i2 & 512) != 0) {
                                    i3 |= 805306368;
                                } else if ((i & 805306368) == 0) {
                                    i3 |= startRestartGroup.changedInstance(thumb) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                }
                                if ((306783379 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i8 != 0) {
                                            companion = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function12 = null;
                                        }
                                        z4 = i5 != 0 ? true : z3;
                                        rectangleShape = i6 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                        if (i7 != 0) {
                                            j2 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                        }
                                        noPadding = i9 != 0 ? UtilsKt.getNoPadding() : paddingValues;
                                        mutableInteractionSource2 = i11 != 0 ? null : mutableInteractionSource;
                                        if ((i2 & 256) != 0) {
                                            ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localIndication);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            indication2 = (Indication) consume;
                                            i3 &= -234881025;
                                        } else {
                                            indication2 = indication;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 256) != 0) {
                                            i3 &= -234881025;
                                        }
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        indication2 = indication;
                                        z4 = z3;
                                        rectangleShape = shape2;
                                        noPadding = paddingValues;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        indication3 = indication2;
                                        z5 = z4;
                                        ComposerKt.traceEventStart(871364252, i3, -1, "com.composeunstyled.ToggleSwitch (ToggleSwitch.kt:69)");
                                    } else {
                                        indication3 = indication2;
                                        z5 = z4;
                                    }
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m8399boximpl(Dp.m8401constructorimpl(0)), null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    final MutableState mutableState2 = (MutableState) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        i12 = i3;
                                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m8399boximpl(Dp.m8401constructorimpl(0)), null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    } else {
                                        i12 = i3;
                                    }
                                    mutableState = (MutableState) rememberedValue2;
                                    startRestartGroup.endReplaceGroup();
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                    final float calculateStartPadding = PaddingKt.calculateStartPadding(noPadding, layoutDirection);
                                    final float calculateEndPadding = PaddingKt.calculateEndPadding(noPadding, layoutDirection);
                                    function13 = function12;
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    changed = startRestartGroup.changed(calculateStartPadding) | startRestartGroup.changed(calculateEndPadding);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function0() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Dp ToggleSwitch_Yod850M$lambda$7$lambda$6;
                                                ToggleSwitch_Yod850M$lambda$7$lambda$6 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$7$lambda$6(calculateStartPadding, calculateEndPadding, mutableState2);
                                                return ToggleSwitch_Yod850M$lambda$7$lambda$6;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    State derivedStateOf = SnapshotStateKt.derivedStateOf((Function0) rememberedValue3);
                                    if (z) {
                                        m8401constructorimpl = Dp.m8401constructorimpl(ToggleSwitch_Yod850M$lambda$8(derivedStateOf) - ToggleSwitch_Yod850M$lambda$4(mutableState));
                                    } else {
                                        m8401constructorimpl = Dp.m8401constructorimpl(0);
                                    }
                                    State<Dp> m145animateDpAsStateAjpBEmI = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl, null, null, null, startRestartGroup, 0, 14);
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Density density = (Density) consume3;
                                    Modifier m261backgroundbw27NRU = BackgroundKt.m261backgroundbw27NRU(ClipKt.clip(SizeKt.m896widthInVpY3zN4$default(companion, Dp.m8401constructorimpl(48), 0.0f, 2, null), rectangleShape), j2, rectangleShape);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changed2 = startRestartGroup.changed(density);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit ToggleSwitch_Yod850M$lambda$12$lambda$11;
                                                ToggleSwitch_Yod850M$lambda$12$lambda$11 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$12$lambda$11(Density.this, mutableState2, (LayoutCoordinates) obj);
                                                return ToggleSwitch_Yod850M$lambda$12$lambda$11;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Modifier onPlaced = OnPlacedModifierKt.onPlaced(m261backgroundbw27NRU, (Function1) rememberedValue4);
                                    List createListBuilder = CollectionsKt.createListBuilder();
                                    if (function13 != null) {
                                        Indication indication6 = indication3;
                                        boolean z8 = z5;
                                        indication4 = indication6;
                                        z6 = z8;
                                        createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource2, indication6, z8, Role.m7575boximpl(Role.INSTANCE.m7588getSwitcho7Vup1c()), function13));
                                    } else {
                                        indication4 = indication3;
                                        z6 = z5;
                                    }
                                    List build = CollectionsKt.build(createListBuilder);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Intrinsics.checkNotNull(companion2, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                                    Modifier.Companion companion3 = companion2;
                                    for (it = build.iterator(); it.hasNext(); it = it) {
                                        companion3 = companion3.then((Modifier) it.next());
                                    }
                                    Modifier then = onPlaced.then(PaddingKt.padding(companion3, noPadding));
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    long j4 = j2;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Modifier modifier3 = companion;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier m792offsetVpY3zN4$default = OffsetKt.m792offsetVpY3zN4$default(Modifier.INSTANCE, ToggleSwitch_Yod850M$lambda$9(m145animateDpAsStateAjpBEmI), 0.0f, 2, null);
                                    startRestartGroup.startReplaceGroup(-1633490746);
                                    changed3 = startRestartGroup.changed(density);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (!changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue5 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                                                ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15(Density.this, mutableState, (LayoutCoordinates) obj);
                                                return ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue5);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Modifier onPlaced2 = OnPlacedModifierKt.onPlaced(m792offsetVpY3zN4$default, (Function1) rememberedValue5);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onPlaced2);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor2);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                                    Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    thumb.invoke(startRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2 = startRestartGroup;
                                    shape3 = rectangleShape;
                                    paddingValues2 = noPadding;
                                    indication5 = indication4;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z6;
                                    function14 = function13;
                                    j3 = j4;
                                    modifier2 = modifier3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    composer2 = startRestartGroup;
                                    modifier2 = companion;
                                    function14 = function12;
                                    paddingValues2 = paddingValues;
                                    j3 = j2;
                                    z7 = z3;
                                    shape3 = shape2;
                                    indication5 = indication;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit ToggleSwitch_Yod850M$lambda$19;
                                            ToggleSwitch_Yod850M$lambda$19 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$19(z, modifier2, function14, z7, shape3, j3, paddingValues2, mutableInteractionSource3, indication5, thumb, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return ToggleSwitch_Yod850M$lambda$19;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i11 = i10;
                            if ((i & 100663296) == 0) {
                            }
                            if ((i2 & 512) != 0) {
                            }
                            if ((306783379 & i3) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
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
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if ((i2 & 256) != 0) {
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final MutableState mutableState22 = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState = (MutableState) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            LayoutDirection layoutDirection2 = (LayoutDirection) consume22;
                            final float calculateStartPadding2 = PaddingKt.calculateStartPadding(noPadding, layoutDirection2);
                            final float calculateEndPadding2 = PaddingKt.calculateEndPadding(noPadding, layoutDirection2);
                            function13 = function12;
                            startRestartGroup.startReplaceGroup(-1746271574);
                            changed = startRestartGroup.changed(calculateStartPadding2) | startRestartGroup.changed(calculateEndPadding2);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue3 = new Function0() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Dp ToggleSwitch_Yod850M$lambda$7$lambda$6;
                                    ToggleSwitch_Yod850M$lambda$7$lambda$6 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$7$lambda$6(calculateStartPadding2, calculateEndPadding2, mutableState22);
                                    return ToggleSwitch_Yod850M$lambda$7$lambda$6;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceGroup();
                            State derivedStateOf2 = SnapshotStateKt.derivedStateOf((Function0) rememberedValue3);
                            if (z) {
                            }
                            State<Dp> m145animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl, null, null, null, startRestartGroup, 0, 14);
                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume32 = startRestartGroup.consume(localDensity2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density2 = (Density) consume32;
                            Modifier m261backgroundbw27NRU2 = BackgroundKt.m261backgroundbw27NRU(ClipKt.clip(SizeKt.m896widthInVpY3zN4$default(companion, Dp.m8401constructorimpl(48), 0.0f, 2, null), rectangleShape), j2, rectangleShape);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed2 = startRestartGroup.changed(density2);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue4 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit ToggleSwitch_Yod850M$lambda$12$lambda$11;
                                    ToggleSwitch_Yod850M$lambda$12$lambda$11 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$12$lambda$11(Density.this, mutableState22, (LayoutCoordinates) obj);
                                    return ToggleSwitch_Yod850M$lambda$12$lambda$11;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            startRestartGroup.endReplaceGroup();
                            Modifier onPlaced3 = OnPlacedModifierKt.onPlaced(m261backgroundbw27NRU2, (Function1) rememberedValue4);
                            List createListBuilder2 = CollectionsKt.createListBuilder();
                            if (function13 != null) {
                            }
                            List build2 = CollectionsKt.build(createListBuilder2);
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            Intrinsics.checkNotNull(companion22, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                            Modifier.Companion companion32 = companion22;
                            while (it.hasNext()) {
                            }
                            Modifier then2 = onPlaced3.then(PaddingKt.padding(companion32, noPadding));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            long j42 = j2;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            Modifier modifier32 = companion;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl.getInserting()) {
                            }
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            Modifier m792offsetVpY3zN4$default2 = OffsetKt.m792offsetVpY3zN4$default(Modifier.INSTANCE, ToggleSwitch_Yod850M$lambda$9(m145animateDpAsStateAjpBEmI2), 0.0f, 2, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed3 = startRestartGroup.changed(density2);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue5 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                                    ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15(Density.this, mutableState, (LayoutCoordinates) obj);
                                    return ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            startRestartGroup.endReplaceGroup();
                            Modifier onPlaced22 = OnPlacedModifierKt.onPlaced(m792offsetVpY3zN4$default2, (Function1) rememberedValue5);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, onPlaced22);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl2.getInserting()) {
                            }
                            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            thumb.invoke(startRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            shape3 = rectangleShape;
                            paddingValues2 = noPadding;
                            indication5 = indication4;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z7 = z6;
                            function14 = function13;
                            j3 = j42;
                            modifier2 = modifier32;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i8 = i14;
                        j2 = j;
                        i9 = i2 & 64;
                        if (i9 == 0) {
                        }
                        i10 = i2 & 128;
                        if (i10 == 0) {
                        }
                        i11 = i10;
                        if ((i & 100663296) == 0) {
                        }
                        if ((i2 & 512) != 0) {
                        }
                        if ((306783379 & i3) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
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
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if ((i2 & 256) != 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState222 = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection22 = (LayoutDirection) consume222;
                        final float calculateStartPadding22 = PaddingKt.calculateStartPadding(noPadding, layoutDirection22);
                        final float calculateEndPadding22 = PaddingKt.calculateEndPadding(noPadding, layoutDirection22);
                        function13 = function12;
                        startRestartGroup.startReplaceGroup(-1746271574);
                        changed = startRestartGroup.changed(calculateStartPadding22) | startRestartGroup.changed(calculateEndPadding22);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue3 = new Function0() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Dp ToggleSwitch_Yod850M$lambda$7$lambda$6;
                                ToggleSwitch_Yod850M$lambda$7$lambda$6 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$7$lambda$6(calculateStartPadding22, calculateEndPadding22, mutableState222);
                                return ToggleSwitch_Yod850M$lambda$7$lambda$6;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceGroup();
                        State derivedStateOf22 = SnapshotStateKt.derivedStateOf((Function0) rememberedValue3);
                        if (z) {
                        }
                        State<Dp> m145animateDpAsStateAjpBEmI22 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl, null, null, null, startRestartGroup, 0, 14);
                        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume322 = startRestartGroup.consume(localDensity22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density22 = (Density) consume322;
                        Modifier m261backgroundbw27NRU22 = BackgroundKt.m261backgroundbw27NRU(ClipKt.clip(SizeKt.m896widthInVpY3zN4$default(companion, Dp.m8401constructorimpl(48), 0.0f, 2, null), rectangleShape), j2, rectangleShape);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed2 = startRestartGroup.changed(density22);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue4 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ToggleSwitch_Yod850M$lambda$12$lambda$11;
                                ToggleSwitch_Yod850M$lambda$12$lambda$11 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$12$lambda$11(Density.this, mutableState222, (LayoutCoordinates) obj);
                                return ToggleSwitch_Yod850M$lambda$12$lambda$11;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceGroup();
                        Modifier onPlaced32 = OnPlacedModifierKt.onPlaced(m261backgroundbw27NRU22, (Function1) rememberedValue4);
                        List createListBuilder22 = CollectionsKt.createListBuilder();
                        if (function13 != null) {
                        }
                        List build22 = CollectionsKt.build(createListBuilder22);
                        Modifier.Companion companion222 = Modifier.INSTANCE;
                        Intrinsics.checkNotNull(companion222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                        Modifier.Companion companion322 = companion222;
                        while (it.hasNext()) {
                        }
                        Modifier then22 = onPlaced32.then(PaddingKt.padding(companion322, noPadding));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        long j422 = j2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                        Modifier modifier322 = companion;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting()) {
                        }
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                        Modifier m792offsetVpY3zN4$default22 = OffsetKt.m792offsetVpY3zN4$default(Modifier.INSTANCE, ToggleSwitch_Yod850M$lambda$9(m145animateDpAsStateAjpBEmI22), 0.0f, 2, null);
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed3 = startRestartGroup.changed(density22);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue5 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                                ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15(Density.this, mutableState, (LayoutCoordinates) obj);
                                return ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        startRestartGroup.endReplaceGroup();
                        Modifier onPlaced222 = OnPlacedModifierKt.onPlaced(m792offsetVpY3zN4$default22, (Function1) rememberedValue5);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, onPlaced222);
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl2.getInserting()) {
                        }
                        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                        thumb.invoke(startRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        shape3 = rectangleShape;
                        paddingValues2 = noPadding;
                        indication5 = indication4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z7 = z6;
                        function14 = function13;
                        j3 = j422;
                        modifier2 = modifier322;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    shape2 = shape;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i14;
                    j2 = j;
                    i9 = i2 & 64;
                    if (i9 == 0) {
                    }
                    i10 = i2 & 128;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    if ((306783379 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
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
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState2222 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection222 = (LayoutDirection) consume2222;
                    final float calculateStartPadding222 = PaddingKt.calculateStartPadding(noPadding, layoutDirection222);
                    final float calculateEndPadding222 = PaddingKt.calculateEndPadding(noPadding, layoutDirection222);
                    function13 = function12;
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changed = startRestartGroup.changed(calculateStartPadding222) | startRestartGroup.changed(calculateEndPadding222);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = new Function0() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Dp ToggleSwitch_Yod850M$lambda$7$lambda$6;
                            ToggleSwitch_Yod850M$lambda$7$lambda$6 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$7$lambda$6(calculateStartPadding222, calculateEndPadding222, mutableState2222);
                            return ToggleSwitch_Yod850M$lambda$7$lambda$6;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    State derivedStateOf222 = SnapshotStateKt.derivedStateOf((Function0) rememberedValue3);
                    if (z) {
                    }
                    State<Dp> m145animateDpAsStateAjpBEmI222 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl, null, null, null, startRestartGroup, 0, 14);
                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3222 = startRestartGroup.consume(localDensity222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density222 = (Density) consume3222;
                    Modifier m261backgroundbw27NRU222 = BackgroundKt.m261backgroundbw27NRU(ClipKt.clip(SizeKt.m896widthInVpY3zN4$default(companion, Dp.m8401constructorimpl(48), 0.0f, 2, null), rectangleShape), j2, rectangleShape);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed2 = startRestartGroup.changed(density222);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue4 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ToggleSwitch_Yod850M$lambda$12$lambda$11;
                            ToggleSwitch_Yod850M$lambda$12$lambda$11 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$12$lambda$11(Density.this, mutableState2222, (LayoutCoordinates) obj);
                            return ToggleSwitch_Yod850M$lambda$12$lambda$11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    Modifier onPlaced322 = OnPlacedModifierKt.onPlaced(m261backgroundbw27NRU222, (Function1) rememberedValue4);
                    List createListBuilder222 = CollectionsKt.createListBuilder();
                    if (function13 != null) {
                    }
                    List build222 = CollectionsKt.build(createListBuilder222);
                    Modifier.Companion companion2222 = Modifier.INSTANCE;
                    Intrinsics.checkNotNull(companion2222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                    Modifier.Companion companion3222 = companion2222;
                    while (it.hasNext()) {
                    }
                    Modifier then222 = onPlaced322.then(PaddingKt.padding(companion3222, noPadding));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long j4222 = j2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
                    Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier3222 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting()) {
                    }
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                    Modifier m792offsetVpY3zN4$default222 = OffsetKt.m792offsetVpY3zN4$default(Modifier.INSTANCE, ToggleSwitch_Yod850M$lambda$9(m145animateDpAsStateAjpBEmI222), 0.0f, 2, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed3 = startRestartGroup.changed(density222);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue5 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                            ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15(Density.this, mutableState, (LayoutCoordinates) obj);
                            return ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    startRestartGroup.endReplaceGroup();
                    Modifier onPlaced2222 = OnPlacedModifierKt.onPlaced(m792offsetVpY3zN4$default222, (Function1) rememberedValue5);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, onPlaced2222);
                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl2.getInserting()) {
                    }
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                    Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                    thumb.invoke(startRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    shape3 = rectangleShape;
                    paddingValues2 = noPadding;
                    indication5 = indication4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z7 = z6;
                    function14 = function13;
                    j3 = j4222;
                    modifier2 = modifier3222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                shape2 = shape;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i14;
                j2 = j;
                i9 = i2 & 64;
                if (i9 == 0) {
                }
                i10 = i2 & 128;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i & 100663296) == 0) {
                }
                if ((i2 & 512) != 0) {
                }
                if ((306783379 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
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
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState22222 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2222 = (LayoutDirection) consume22222;
                final float calculateStartPadding2222 = PaddingKt.calculateStartPadding(noPadding, layoutDirection2222);
                final float calculateEndPadding2222 = PaddingKt.calculateEndPadding(noPadding, layoutDirection2222);
                function13 = function12;
                startRestartGroup.startReplaceGroup(-1746271574);
                changed = startRestartGroup.changed(calculateStartPadding2222) | startRestartGroup.changed(calculateEndPadding2222);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new Function0() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Dp ToggleSwitch_Yod850M$lambda$7$lambda$6;
                        ToggleSwitch_Yod850M$lambda$7$lambda$6 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$7$lambda$6(calculateStartPadding2222, calculateEndPadding2222, mutableState22222);
                        return ToggleSwitch_Yod850M$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                State derivedStateOf2222 = SnapshotStateKt.derivedStateOf((Function0) rememberedValue3);
                if (z) {
                }
                State<Dp> m145animateDpAsStateAjpBEmI2222 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl, null, null, null, startRestartGroup, 0, 14);
                ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume32222 = startRestartGroup.consume(localDensity2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density2222 = (Density) consume32222;
                Modifier m261backgroundbw27NRU2222 = BackgroundKt.m261backgroundbw27NRU(ClipKt.clip(SizeKt.m896widthInVpY3zN4$default(companion, Dp.m8401constructorimpl(48), 0.0f, 2, null), rectangleShape), j2, rectangleShape);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed2 = startRestartGroup.changed(density2222);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue4 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ToggleSwitch_Yod850M$lambda$12$lambda$11;
                        ToggleSwitch_Yod850M$lambda$12$lambda$11 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$12$lambda$11(Density.this, mutableState22222, (LayoutCoordinates) obj);
                        return ToggleSwitch_Yod850M$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                Modifier onPlaced3222 = OnPlacedModifierKt.onPlaced(m261backgroundbw27NRU2222, (Function1) rememberedValue4);
                List createListBuilder2222 = CollectionsKt.createListBuilder();
                if (function13 != null) {
                }
                List build2222 = CollectionsKt.build(createListBuilder2222);
                Modifier.Companion companion22222 = Modifier.INSTANCE;
                Intrinsics.checkNotNull(companion22222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                Modifier.Companion companion32222 = companion22222;
                while (it.hasNext()) {
                }
                Modifier then2222 = onPlaced3222.then(PaddingKt.padding(companion32222, noPadding));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                long j42222 = j2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222);
                Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier32222 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
                Modifier m792offsetVpY3zN4$default2222 = OffsetKt.m792offsetVpY3zN4$default(Modifier.INSTANCE, ToggleSwitch_Yod850M$lambda$9(m145animateDpAsStateAjpBEmI2222), 0.0f, 2, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed3 = startRestartGroup.changed(density2222);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue5 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                        ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15(Density.this, mutableState, (LayoutCoordinates) obj);
                        return ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceGroup();
                Modifier onPlaced22222 = OnPlacedModifierKt.onPlaced(m792offsetVpY3zN4$default2222, (Function1) rememberedValue5);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, onPlaced22222);
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl2.getInserting()) {
                }
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                thumb.invoke(startRestartGroup, Integer.valueOf((i12 >> 27) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                shape3 = rectangleShape;
                paddingValues2 = noPadding;
                indication5 = indication4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z7 = z6;
                function14 = function13;
                j3 = j42222;
                modifier2 = modifier32222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function12 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z3 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            shape2 = shape;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i14;
            j2 = j;
            i9 = i2 & 64;
            if (i9 == 0) {
            }
            i10 = i2 & 128;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i & 100663296) == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            if ((306783379 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
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
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState222222 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222222 = startRestartGroup.consume(localLayoutDirection22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection22222 = (LayoutDirection) consume222222;
            final float calculateStartPadding22222 = PaddingKt.calculateStartPadding(noPadding, layoutDirection22222);
            final float calculateEndPadding22222 = PaddingKt.calculateEndPadding(noPadding, layoutDirection22222);
            function13 = function12;
            startRestartGroup.startReplaceGroup(-1746271574);
            changed = startRestartGroup.changed(calculateStartPadding22222) | startRestartGroup.changed(calculateEndPadding22222);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new Function0() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Dp ToggleSwitch_Yod850M$lambda$7$lambda$6;
                    ToggleSwitch_Yod850M$lambda$7$lambda$6 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$7$lambda$6(calculateStartPadding22222, calculateEndPadding22222, mutableState222222);
                    return ToggleSwitch_Yod850M$lambda$7$lambda$6;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            State derivedStateOf22222 = SnapshotStateKt.derivedStateOf((Function0) rememberedValue3);
            if (z) {
            }
            State<Dp> m145animateDpAsStateAjpBEmI22222 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl, null, null, null, startRestartGroup, 0, 14);
            ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume322222 = startRestartGroup.consume(localDensity22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density22222 = (Density) consume322222;
            Modifier m261backgroundbw27NRU22222 = BackgroundKt.m261backgroundbw27NRU(ClipKt.clip(SizeKt.m896widthInVpY3zN4$default(companion, Dp.m8401constructorimpl(48), 0.0f, 2, null), rectangleShape), j2, rectangleShape);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed2 = startRestartGroup.changed(density22222);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue4 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ToggleSwitch_Yod850M$lambda$12$lambda$11;
                    ToggleSwitch_Yod850M$lambda$12$lambda$11 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$12$lambda$11(Density.this, mutableState222222, (LayoutCoordinates) obj);
                    return ToggleSwitch_Yod850M$lambda$12$lambda$11;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            Modifier onPlaced32222 = OnPlacedModifierKt.onPlaced(m261backgroundbw27NRU22222, (Function1) rememberedValue4);
            List createListBuilder22222 = CollectionsKt.createListBuilder();
            if (function13 != null) {
            }
            List build22222 = CollectionsKt.build(createListBuilder22222);
            Modifier.Companion companion222222 = Modifier.INSTANCE;
            Intrinsics.checkNotNull(companion222222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
            Modifier.Companion companion322222 = companion222222;
            while (it.hasNext()) {
            }
            Modifier then22222 = onPlaced32222.then(PaddingKt.padding(companion322222, noPadding));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long j422222 = j2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, then22222);
            Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier322222 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
            Modifier m792offsetVpY3zN4$default22222 = OffsetKt.m792offsetVpY3zN4$default(Modifier.INSTANCE, ToggleSwitch_Yod850M$lambda$9(m145animateDpAsStateAjpBEmI22222), 0.0f, 2, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed3 = startRestartGroup.changed(density22222);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue5 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                    ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15(Density.this, mutableState, (LayoutCoordinates) obj);
                    return ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            Modifier onPlaced222222 = OnPlacedModifierKt.onPlaced(m792offsetVpY3zN4$default22222, (Function1) rememberedValue5);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, onPlaced222222);
            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl2.getInserting()) {
            }
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
            thumb.invoke(startRestartGroup, Integer.valueOf((i12 >> 27) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            shape3 = rectangleShape;
            paddingValues2 = noPadding;
            indication5 = indication4;
            mutableInteractionSource3 = mutableInteractionSource2;
            z7 = z6;
            function14 = function13;
            j3 = j422222;
            modifier2 = modifier322222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        companion = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        shape2 = shape;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i14;
        j2 = j;
        i9 = i2 & 64;
        if (i9 == 0) {
        }
        i10 = i2 & 128;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
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
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2222222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222222 = startRestartGroup.consume(localLayoutDirection222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222222 = (LayoutDirection) consume2222222;
        final float calculateStartPadding222222 = PaddingKt.calculateStartPadding(noPadding, layoutDirection222222);
        final float calculateEndPadding222222 = PaddingKt.calculateEndPadding(noPadding, layoutDirection222222);
        function13 = function12;
        startRestartGroup.startReplaceGroup(-1746271574);
        changed = startRestartGroup.changed(calculateStartPadding222222) | startRestartGroup.changed(calculateEndPadding222222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new Function0() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Dp ToggleSwitch_Yod850M$lambda$7$lambda$6;
                ToggleSwitch_Yod850M$lambda$7$lambda$6 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$7$lambda$6(calculateStartPadding222222, calculateEndPadding222222, mutableState2222222);
                return ToggleSwitch_Yod850M$lambda$7$lambda$6;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        State derivedStateOf222222 = SnapshotStateKt.derivedStateOf((Function0) rememberedValue3);
        if (z) {
        }
        State<Dp> m145animateDpAsStateAjpBEmI222222 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl, null, null, null, startRestartGroup, 0, 14);
        ProvidableCompositionLocal<Density> localDensity222222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3222222 = startRestartGroup.consume(localDensity222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density222222 = (Density) consume3222222;
        Modifier m261backgroundbw27NRU222222 = BackgroundKt.m261backgroundbw27NRU(ClipKt.clip(SizeKt.m896widthInVpY3zN4$default(companion, Dp.m8401constructorimpl(48), 0.0f, 2, null), rectangleShape), j2, rectangleShape);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed2 = startRestartGroup.changed(density222222);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue4 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ToggleSwitch_Yod850M$lambda$12$lambda$11;
                ToggleSwitch_Yod850M$lambda$12$lambda$11 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$12$lambda$11(Density.this, mutableState2222222, (LayoutCoordinates) obj);
                return ToggleSwitch_Yod850M$lambda$12$lambda$11;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        Modifier onPlaced322222 = OnPlacedModifierKt.onPlaced(m261backgroundbw27NRU222222, (Function1) rememberedValue4);
        List createListBuilder222222 = CollectionsKt.createListBuilder();
        if (function13 != null) {
        }
        List build222222 = CollectionsKt.build(createListBuilder222222);
        Modifier.Companion companion2222222 = Modifier.INSTANCE;
        Intrinsics.checkNotNull(companion2222222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
        Modifier.Companion companion3222222 = companion2222222;
        while (it.hasNext()) {
        }
        Modifier then222222 = onPlaced322222.then(PaddingKt.padding(companion3222222, noPadding));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        long j4222222 = j2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222222);
        Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier3222222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322222 = BoxScopeInstance.INSTANCE;
        Modifier m792offsetVpY3zN4$default222222 = OffsetKt.m792offsetVpY3zN4$default(Modifier.INSTANCE, ToggleSwitch_Yod850M$lambda$9(m145animateDpAsStateAjpBEmI222222), 0.0f, 2, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed3 = startRestartGroup.changed(density222222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue5 = new Function1() { // from class: com.composeunstyled.ToggleSwitchKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
                ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15 = ToggleSwitchKt.ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15(Density.this, mutableState, (LayoutCoordinates) obj);
                return ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        Modifier onPlaced2222222 = OnPlacedModifierKt.onPlaced(m792offsetVpY3zN4$default222222, (Function1) rememberedValue5);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, onPlaced2222222);
        Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl2.getInserting()) {
        }
        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
        thumb.invoke(startRestartGroup, Integer.valueOf((i12 >> 27) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        shape3 = rectangleShape;
        paddingValues2 = noPadding;
        indication5 = indication4;
        mutableInteractionSource3 = mutableInteractionSource2;
        z7 = z6;
        function14 = function13;
        j3 = j4222222;
        modifier2 = modifier3222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final float ToggleSwitch_Yod850M$lambda$1(MutableState<Dp> mutableState) {
        return mutableState.getValue().m8415unboximpl();
    }

    private static final void ToggleSwitch_Yod850M$lambda$2(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m8399boximpl(f));
    }

    private static final float ToggleSwitch_Yod850M$lambda$4(MutableState<Dp> mutableState) {
        return mutableState.getValue().m8415unboximpl();
    }

    private static final void ToggleSwitch_Yod850M$lambda$5(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m8399boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp ToggleSwitch_Yod850M$lambda$7$lambda$6(float f, float f2, MutableState mutableState) {
        return Dp.m8399boximpl(Dp.m8401constructorimpl(Dp.m8401constructorimpl(ToggleSwitch_Yod850M$lambda$1(mutableState) - f) - f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleSwitch_Yod850M$lambda$12$lambda$11(Density density, MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ToggleSwitch_Yod850M$lambda$2(mutableState, density.mo421toDpu2uoSUM((int) (it.mo7083getSizeYbymL2g() >> 32)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleSwitch_Yod850M$lambda$18$lambda$16$lambda$15(Density density, MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ToggleSwitch_Yod850M$lambda$5(mutableState, density.mo421toDpu2uoSUM((int) (it.mo7083getSizeYbymL2g() >> 32)));
        return Unit.INSTANCE;
    }

    private static final float ToggleSwitch_Yod850M$lambda$8(State<Dp> state) {
        return state.getValue().m8415unboximpl();
    }

    private static final float ToggleSwitch_Yod850M$lambda$9(State<Dp> state) {
        return state.getValue().m8415unboximpl();
    }
}
