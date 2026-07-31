package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
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

/* compiled from: CheckBox.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Checkbox", "", "checked", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", ViewProps.ENABLED, "onCheckedChange", "Lkotlin/Function1;", "shape", "Landroidx/compose/ui/graphics/Shape;", ViewProps.BORDER_COLOR, ViewProps.BORDER_WIDTH, "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "contentDescription", "", "checkIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Checkbox-jVfCSGM", "(ZLandroidx/compose/ui/Modifier;JJZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;JFLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckBoxKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Checkbox_jVfCSGM$lambda$4(boolean z, Modifier modifier, long j, long j2, boolean z2, Function1 function1, Shape shape, long j3, float f, MutableInteractionSource mutableInteractionSource, Indication indication, String str, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m9492CheckboxjVfCSGM(z, modifier, j, j2, z2, function1, shape, j3, f, mutableInteractionSource, indication, str, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0378 A[LOOP:0: B:101:0x0372->B:103:0x0378, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0319  */
    /* renamed from: Checkbox-jVfCSGM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9492CheckboxjVfCSGM(final boolean z, Modifier modifier, long j, long j2, boolean z2, Function1<? super Boolean, Unit> function1, Shape shape, long j3, float f, MutableInteractionSource mutableInteractionSource, Indication indication, String str, final Function2<? super Composer, ? super Integer, Unit> checkIcon, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        long j4;
        long j5;
        int i7;
        boolean z3;
        int i8;
        Function1<? super Boolean, Unit> function12;
        int i9;
        Shape shape2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape3;
        Indication indication2;
        int i18;
        final String str2;
        Indication indication3;
        float f2;
        boolean z4;
        int i19;
        int i20;
        long j6;
        List createListBuilder;
        Indication indication4;
        boolean z5;
        long j7;
        float f3;
        Iterator it;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        final Shape shape4;
        Composer composer2;
        final boolean z6;
        final long j8;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource3;
        final Function1<? super Boolean, Unit> function13;
        final Indication indication5;
        final long j9;
        final float f4;
        final String str3;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        int i21;
        Intrinsics.checkNotNullParameter(checkIcon, "checkIcon");
        Composer startRestartGroup = composer.startRestartGroup(1311293288);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i22 = i3 & 2;
        if (i22 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
                i6 = i22;
                j4 = j;
            } else {
                i6 = i22;
                j4 = j;
                if ((i & 384) == 0) {
                    i4 |= startRestartGroup.changed(j4) ? 256 : 128;
                }
            }
            if ((i & 3072) != 0) {
                j5 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j5)) ? 2048 : 1024;
            } else {
                j5 = j2;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function12 = function1;
                } else {
                    function12 = function1;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    shape2 = shape;
                } else {
                    shape2 = shape;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(shape2) ? 1048576 : 524288;
                    }
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i11 = i10;
                    i4 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
                    i12 = i3 & 256;
                    if (i12 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(f) ? 67108864 : 33554432;
                        i13 = i3 & 512;
                        if (i13 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i14 = i13;
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            if ((i2 & 6) != 0) {
                                if ((i3 & 1024) == 0 && startRestartGroup.changed(indication)) {
                                    i21 = 4;
                                    i15 = i2 | i21;
                                }
                                i21 = 2;
                                i15 = i2 | i21;
                            } else {
                                i15 = i2;
                            }
                            i16 = i3 & 2048;
                            if (i16 == 0) {
                                i15 |= 48;
                                i17 = i16;
                            } else if ((i2 & 48) == 0) {
                                i17 = i16;
                                i15 |= startRestartGroup.changed(str) ? 32 : 16;
                            } else {
                                i17 = i16;
                            }
                            int i23 = i15;
                            if ((i3 & 4096) == 0) {
                                i23 |= 384;
                            } else if ((i2 & 384) == 0) {
                                i23 |= startRestartGroup.changedInstance(checkIcon) ? 256 : 128;
                            }
                            if ((306783379 & i4) == 306783378 || (i23 & 147) != 146 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i6 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        j4 = Color.INSTANCE.m5692getTransparent0d7_KjU();
                                    }
                                    if ((i3 & 8) != 0) {
                                        ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        j5 = ((Color) consume).m5667unboximpl();
                                        i4 &= -7169;
                                    }
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if (i8 != 0) {
                                        function12 = null;
                                    }
                                    Shape rectangleShape = i9 == 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                    long m5693getUnspecified0d7_KjU = i11 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                                    float m8401constructorimpl = i12 == 0 ? Dp.m8401constructorimpl(1) : f;
                                    mutableInteractionSource2 = i14 == 0 ? null : mutableInteractionSource;
                                    if ((i3 & 1024) == 0) {
                                        ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                        int i24 = i23;
                                        shape3 = rectangleShape;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume2 = startRestartGroup.consume(localIndication);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        indication2 = (Indication) consume2;
                                        i18 = i24 & (-15);
                                    } else {
                                        int i25 = i23;
                                        shape3 = rectangleShape;
                                        indication2 = indication;
                                        i18 = i25;
                                    }
                                    if (i17 == 0) {
                                        indication3 = indication2;
                                        f2 = m8401constructorimpl;
                                        z4 = z3;
                                        str2 = null;
                                    } else {
                                        str2 = str;
                                        indication3 = indication2;
                                        f2 = m8401constructorimpl;
                                        z4 = z3;
                                    }
                                    shape2 = shape3;
                                    i19 = i4;
                                    i20 = i18;
                                    j6 = m5693getUnspecified0d7_KjU;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 1024) != 0) {
                                        i23 &= -15;
                                    }
                                    f2 = f;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    indication3 = indication;
                                    str2 = str;
                                    z4 = z3;
                                    i19 = i4;
                                    i20 = i23;
                                    j6 = j3;
                                }
                                startRestartGroup.endDefaults();
                                long j11 = j4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1311293288, i19, i20, "com.composeunstyled.Checkbox (CheckBox.kt:77)");
                                }
                                startRestartGroup.startReplaceGroup(1727452370);
                                createListBuilder = CollectionsKt.createListBuilder();
                                if (j6 != 16 && !Float.isNaN(f2)) {
                                    createListBuilder.add(BorderKt.m274borderxT4_qwU(Modifier.INSTANCE, f2, j6, shape2));
                                }
                                createListBuilder.add(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j11, null, 2, null));
                                if (function12 == null) {
                                    Indication indication6 = indication3;
                                    boolean z7 = z4;
                                    indication4 = indication6;
                                    z5 = z7;
                                    createListBuilder.add(ToggleableKt.m1171toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource2, indication6, z7, Role.m7575boximpl(Role.INSTANCE.m7584getCheckboxo7Vup1c()), function12));
                                } else {
                                    indication4 = indication3;
                                    z5 = z4;
                                }
                                startRestartGroup.startReplaceGroup(1727474277);
                                if (str2 == null) {
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    j7 = j6;
                                    startRestartGroup.startReplaceGroup(5004770);
                                    boolean z8 = (i20 & 112) == 32;
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: com.composeunstyled.CheckBoxKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit Checkbox_jVfCSGM$lambda$2$lambda$1$lambda$0;
                                                Checkbox_jVfCSGM$lambda$2$lambda$1$lambda$0 = CheckBoxKt.Checkbox_jVfCSGM$lambda$2$lambda$1$lambda$0(str2, (SemanticsPropertyReceiver) obj);
                                                return Checkbox_jVfCSGM$lambda$2$lambda$1$lambda$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    f3 = f2;
                                    createListBuilder.add(SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null));
                                } else {
                                    j7 = j6;
                                    f3 = f2;
                                }
                                startRestartGroup.endReplaceGroup();
                                List build = CollectionsKt.build(createListBuilder);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Intrinsics.checkNotNull(companion2, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                                Modifier.Companion companion3 = companion2;
                                it = build.iterator();
                                while (it.hasNext()) {
                                    companion3 = companion3.then((Modifier) it.next());
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier then = modifier2.then(companion3);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
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
                                startRestartGroup.startReplaceGroup(-469484480);
                                if (z) {
                                    CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-914495223, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.CheckBoxKt$Checkbox$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i26) {
                                            if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-914495223, i26, -1, "com.composeunstyled.Checkbox.<anonymous>.<anonymous> (CheckBox.kt:108)");
                                            }
                                            checkIcon.invoke(composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                }
                                startRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape4 = shape2;
                                composer2 = startRestartGroup;
                                z6 = z5;
                                j8 = j5;
                                modifier3 = modifier2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function13 = function12;
                                indication5 = indication4;
                                j9 = j7;
                                f4 = f3;
                                str3 = str2;
                                j10 = j11;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                indication5 = indication;
                                composer2 = startRestartGroup;
                                z6 = z3;
                                j10 = j4;
                                modifier3 = modifier2;
                                function13 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                str3 = str;
                                shape4 = shape2;
                                j8 = j5;
                                j9 = j3;
                                f4 = f;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.CheckBoxKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Checkbox_jVfCSGM$lambda$4;
                                        Checkbox_jVfCSGM$lambda$4 = CheckBoxKt.Checkbox_jVfCSGM$lambda$4(z, modifier3, j10, j8, z6, function13, shape4, j9, f4, mutableInteractionSource3, indication5, str3, checkIcon, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return Checkbox_jVfCSGM$lambda$4;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = i13;
                        if ((i2 & 6) != 0) {
                        }
                        i16 = i3 & 2048;
                        if (i16 == 0) {
                        }
                        int i232 = i15;
                        if ((i3 & 4096) == 0) {
                        }
                        if ((306783379 & i4) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if (i17 == 0) {
                        }
                        shape2 = shape3;
                        i19 = i4;
                        i20 = i18;
                        j6 = m5693getUnspecified0d7_KjU;
                        startRestartGroup.endDefaults();
                        long j112 = j4;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(1727452370);
                        createListBuilder = CollectionsKt.createListBuilder();
                        if (j6 != 16) {
                            createListBuilder.add(BorderKt.m274borderxT4_qwU(Modifier.INSTANCE, f2, j6, shape2));
                        }
                        createListBuilder.add(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j112, null, 2, null));
                        if (function12 == null) {
                        }
                        startRestartGroup.startReplaceGroup(1727474277);
                        if (str2 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        List build2 = CollectionsKt.build(createListBuilder);
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Intrinsics.checkNotNull(companion22, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                        Modifier.Companion companion32 = companion22;
                        it = build2.iterator();
                        while (it.hasNext()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier then2 = modifier2.then(companion32);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting()) {
                        }
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-469484480);
                        if (z) {
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape4 = shape2;
                        composer2 = startRestartGroup;
                        z6 = z5;
                        j8 = j5;
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        function13 = function12;
                        indication5 = indication4;
                        j9 = j7;
                        f4 = f3;
                        str3 = str2;
                        j10 = j112;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i2 & 6) != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 == 0) {
                    }
                    int i2322 = i15;
                    if ((i3 & 4096) == 0) {
                    }
                    if ((306783379 & i4) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if (i17 == 0) {
                    }
                    shape2 = shape3;
                    i19 = i4;
                    i20 = i18;
                    j6 = m5693getUnspecified0d7_KjU;
                    startRestartGroup.endDefaults();
                    long j1122 = j4;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1727452370);
                    createListBuilder = CollectionsKt.createListBuilder();
                    if (j6 != 16) {
                    }
                    createListBuilder.add(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j1122, null, 2, null));
                    if (function12 == null) {
                    }
                    startRestartGroup.startReplaceGroup(1727474277);
                    if (str2 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    List build22 = CollectionsKt.build(createListBuilder);
                    Modifier.Companion companion222 = Modifier.INSTANCE;
                    Intrinsics.checkNotNull(companion222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                    Modifier.Companion companion322 = companion222;
                    it = build22.iterator();
                    while (it.hasNext()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier then22 = modifier2.then(companion322);
                    Alignment center22 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting()) {
                    }
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-469484480);
                    if (z) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape4 = shape2;
                    composer2 = startRestartGroup;
                    z6 = z5;
                    j8 = j5;
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    function13 = function12;
                    indication5 = indication4;
                    j9 = j7;
                    f4 = f3;
                    str3 = str2;
                    j10 = j1122;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i2 & 6) != 0) {
                }
                i16 = i3 & 2048;
                if (i16 == 0) {
                }
                int i23222 = i15;
                if ((i3 & 4096) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if (i17 == 0) {
                }
                shape2 = shape3;
                i19 = i4;
                i20 = i18;
                j6 = m5693getUnspecified0d7_KjU;
                startRestartGroup.endDefaults();
                long j11222 = j4;
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1727452370);
                createListBuilder = CollectionsKt.createListBuilder();
                if (j6 != 16) {
                }
                createListBuilder.add(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j11222, null, 2, null));
                if (function12 == null) {
                }
                startRestartGroup.startReplaceGroup(1727474277);
                if (str2 == null) {
                }
                startRestartGroup.endReplaceGroup();
                List build222 = CollectionsKt.build(createListBuilder);
                Modifier.Companion companion2222 = Modifier.INSTANCE;
                Intrinsics.checkNotNull(companion2222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                Modifier.Companion companion3222 = companion2222;
                it = build222.iterator();
                while (it.hasNext()) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier then222 = modifier2.then(companion3222);
                Alignment center222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-469484480);
                if (z) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape4 = shape2;
                composer2 = startRestartGroup;
                z6 = z5;
                j8 = j5;
                modifier3 = modifier2;
                mutableInteractionSource3 = mutableInteractionSource2;
                function13 = function12;
                indication5 = indication4;
                j9 = j7;
                f4 = f3;
                str3 = str2;
                j10 = j11222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i2 & 6) != 0) {
            }
            i16 = i3 & 2048;
            if (i16 == 0) {
            }
            int i232222 = i15;
            if ((i3 & 4096) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if (i17 == 0) {
            }
            shape2 = shape3;
            i19 = i4;
            i20 = i18;
            j6 = m5693getUnspecified0d7_KjU;
            startRestartGroup.endDefaults();
            long j112222 = j4;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1727452370);
            createListBuilder = CollectionsKt.createListBuilder();
            if (j6 != 16) {
            }
            createListBuilder.add(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j112222, null, 2, null));
            if (function12 == null) {
            }
            startRestartGroup.startReplaceGroup(1727474277);
            if (str2 == null) {
            }
            startRestartGroup.endReplaceGroup();
            List build2222 = CollectionsKt.build(createListBuilder);
            Modifier.Companion companion22222 = Modifier.INSTANCE;
            Intrinsics.checkNotNull(companion22222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
            Modifier.Companion companion32222 = companion22222;
            it = build2222.iterator();
            while (it.hasNext()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier then2222 = modifier2.then(companion32222);
            Alignment center2222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-469484480);
            if (z) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape4 = shape2;
            composer2 = startRestartGroup;
            z6 = z5;
            j8 = j5;
            modifier3 = modifier2;
            mutableInteractionSource3 = mutableInteractionSource2;
            function13 = function12;
            indication5 = indication4;
            j9 = j7;
            f4 = f3;
            str3 = str2;
            j10 = j112222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if ((i & 3072) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        z3 = z2;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i2 & 6) != 0) {
        }
        i16 = i3 & 2048;
        if (i16 == 0) {
        }
        int i2322222 = i15;
        if ((i3 & 4096) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if (i17 == 0) {
        }
        shape2 = shape3;
        i19 = i4;
        i20 = i18;
        j6 = m5693getUnspecified0d7_KjU;
        startRestartGroup.endDefaults();
        long j1122222 = j4;
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1727452370);
        createListBuilder = CollectionsKt.createListBuilder();
        if (j6 != 16) {
        }
        createListBuilder.add(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j1122222, null, 2, null));
        if (function12 == null) {
        }
        startRestartGroup.startReplaceGroup(1727474277);
        if (str2 == null) {
        }
        startRestartGroup.endReplaceGroup();
        List build22222 = CollectionsKt.build(createListBuilder);
        Modifier.Companion companion222222 = Modifier.INSTANCE;
        Intrinsics.checkNotNull(companion222222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
        Modifier.Companion companion322222 = companion222222;
        it = build22222.iterator();
        while (it.hasNext()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier then22222 = modifier2.then(companion322222);
        Alignment center22222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(center22222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, then22222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-469484480);
        if (z) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape4 = shape2;
        composer2 = startRestartGroup;
        z6 = z5;
        j8 = j5;
        modifier3 = modifier2;
        mutableInteractionSource3 = mutableInteractionSource2;
        function13 = function12;
        indication5 = indication4;
        j9 = j7;
        f4 = f3;
        str3 = str2;
        j10 = j1122222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Checkbox_jVfCSGM$lambda$2$lambda$1$lambda$0(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }
}
