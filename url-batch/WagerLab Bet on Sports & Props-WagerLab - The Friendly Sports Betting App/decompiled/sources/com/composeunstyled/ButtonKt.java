package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÁ\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Button", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", ViewProps.ENABLED, "", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", ViewProps.BORDER_COLOR, ViewProps.BORDER_WIDTH, "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ROLE, "Landroidx/compose/ui/semantics/Role;", "indication", "Landroidx/compose/foundation/Indication;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "Button-Y-0X4mI", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;JFLandroidx/compose/ui/Modifier;ILandroidx/compose/foundation/Indication;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Button_Y_0X4mI$lambda$2(Function0 function0, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, long j3, float f, Modifier modifier, int i, Indication indication, MutableInteractionSource mutableInteractionSource, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, Function3 function3, int i2, int i3, int i4, Composer composer, int i5) {
        m9489ButtonY0X4mI(function0, z, shape, j, j2, paddingValues, j3, f, modifier, i, indication, mutableInteractionSource, horizontal, vertical, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e4 A[LOOP:0: B:102:0x03de->B:104:0x03e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0390  */
    /* renamed from: Button-Y-0X4mI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9489ButtonY0X4mI(final Function0<Unit> onClick, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, long j3, float f, Modifier modifier, int i, Indication indication, MutableInteractionSource mutableInteractionSource, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Shape shape2;
        int i7;
        long j4;
        int i8;
        long j5;
        int i9;
        PaddingValues paddingValues2;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Modifier.Companion companion;
        int i21;
        boolean z2;
        Indication indication2;
        int i22;
        boolean z3;
        Alignment.Vertical vertical2;
        Indication indication3;
        long j6;
        Arrangement.Horizontal horizontal2;
        MutableInteractionSource mutableInteractionSource2;
        int i23;
        int i24;
        long j7;
        long j8;
        List createListBuilder;
        boolean z4;
        long j9;
        float f3;
        Iterator it;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        final long j10;
        final Alignment.Vertical vertical3;
        Composer composer2;
        final Shape shape3;
        final PaddingValues paddingValues3;
        final long j11;
        final Modifier modifier2;
        final int i25;
        final boolean z5;
        final Indication indication4;
        final MutableInteractionSource mutableInteractionSource3;
        final Arrangement.Horizontal horizontal3;
        final float f4;
        final long j12;
        ScopeUpdateScope endRestartGroup;
        int i26;
        int i27;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1972804324);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i28 = i4 & 2;
        if (i28 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(z) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                shape2 = shape;
                i5 |= startRestartGroup.changed(shape2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                    j4 = j;
                } else {
                    j4 = j;
                    if ((i2 & 3072) == 0) {
                        i5 |= startRestartGroup.changed(j4) ? 2048 : 1024;
                    }
                }
                if ((i2 & 24576) == 0) {
                    i8 = i28;
                    j5 = j2;
                    i5 |= ((i4 & 16) == 0 && startRestartGroup.changed(j5)) ? 16384 : 8192;
                } else {
                    i8 = i28;
                    j5 = j2;
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    }
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= startRestartGroup.changed(j3) ? 1048576 : 524288;
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                    i5 |= 12582912;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                    }
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
                    if ((i2 & 805306368) != 0) {
                        i13 = i12;
                        if ((i4 & 512) == 0 && startRestartGroup.changed(i)) {
                            i27 = C.BUFFER_FLAG_LAST_SAMPLE;
                            i5 |= i27;
                        }
                        i27 = 268435456;
                        i5 |= i27;
                    } else {
                        i13 = i12;
                    }
                    if ((i3 & 6) != 0) {
                        if ((i4 & 1024) == 0 && startRestartGroup.changed(indication)) {
                            i26 = 4;
                            i14 = i3 | i26;
                        }
                        i26 = 2;
                        i14 = i3 | i26;
                    } else {
                        i14 = i3;
                    }
                    i15 = i4 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                        i16 = i15;
                    } else if ((i3 & 48) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                    } else {
                        i16 = i15;
                    }
                    int i29 = i14;
                    i17 = i4 & 4096;
                    if (i17 == 0) {
                        i18 = i29 | 384;
                    } else if ((i3 & 384) == 0) {
                        i18 = i29 | (startRestartGroup.changed(horizontal) ? 256 : 128);
                    } else {
                        i18 = i29;
                    }
                    i19 = i4 & 8192;
                    if (i19 == 0) {
                        i20 = i18 | 3072;
                    } else {
                        int i30 = i18;
                        if ((i3 & 3072) == 0) {
                            i20 = i30 | (startRestartGroup.changed(vertical) ? 2048 : 1024);
                        } else {
                            i20 = i30;
                        }
                    }
                    if ((i4 & 16384) == 0) {
                        i20 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i20 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                    }
                    if ((306783379 & i5) == 306783378 || (i20 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            boolean z6 = i8 == 0 ? true : z;
                            if (i6 != 0) {
                                shape2 = RectangleShapeKt.getRectangleShape();
                            }
                            if (i7 != 0) {
                                j4 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                            }
                            if ((i4 & 16) != 0) {
                                ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContentColor);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j5 = ((Color) consume).m5667unboximpl();
                                i5 &= -57345;
                            }
                            if (i9 != 0) {
                                paddingValues2 = UtilsKt.getNoPadding();
                            }
                            long m5693getUnspecified0d7_KjU = i10 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                            if (i11 != 0) {
                                f2 = Dp.m8401constructorimpl(0);
                            }
                            companion = i13 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i4 & 512) == 0) {
                                i21 = Role.INSTANCE.m7582getButtono7Vup1c();
                                i5 &= -1879048193;
                            } else {
                                i21 = i;
                            }
                            if ((i4 & 1024) == 0) {
                                ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                int i31 = i20;
                                z2 = z6;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localIndication);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                indication2 = (Indication) consume2;
                                i22 = i31 & (-15);
                            } else {
                                int i32 = i20;
                                z2 = z6;
                                indication2 = indication;
                                i22 = i32;
                            }
                            MutableInteractionSource mutableInteractionSource4 = i16 == 0 ? null : mutableInteractionSource;
                            Arrangement.HorizontalOrVertical center = i17 == 0 ? Arrangement.INSTANCE.getCenter() : horizontal;
                            if (i19 == 0) {
                                z3 = z2;
                                indication3 = indication2;
                                j6 = j5;
                                horizontal2 = center;
                                vertical2 = Alignment.INSTANCE.getCenterVertically();
                            } else {
                                z3 = z2;
                                vertical2 = vertical;
                                indication3 = indication2;
                                j6 = j5;
                                horizontal2 = center;
                            }
                            mutableInteractionSource2 = mutableInteractionSource4;
                            i23 = i5;
                            i24 = i22;
                            j7 = m5693getUnspecified0d7_KjU;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 512) != 0) {
                                i5 &= -1879048193;
                            }
                            if ((i4 & 1024) != 0) {
                                i20 &= -15;
                            }
                            z3 = z;
                            j7 = j3;
                            companion = modifier;
                            i21 = i;
                            indication3 = indication;
                            mutableInteractionSource2 = mutableInteractionSource;
                            vertical2 = vertical;
                            j6 = j5;
                            i23 = i5;
                            i24 = i20;
                            horizontal2 = horizontal;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            j8 = j4;
                        } else {
                            j8 = j4;
                            ComposerKt.traceEventStart(-1972804324, i23, i24, "com.composeunstyled.Button (Button.kt:73)");
                        }
                        createListBuilder = CollectionsKt.createListBuilder();
                        long j13 = j8;
                        z4 = z3;
                        Indication indication5 = indication3;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                        createListBuilder.add(ClickableKt.m299clickableO2vRcR0$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j8, null, 2, null), mutableInteractionSource5, indication5, z4, null, Role.m7575boximpl(i21), onClick, 8, null));
                        int i33 = i24;
                        if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0 && j7 != 16) {
                            createListBuilder.add(BorderKt.m274borderxT4_qwU(Modifier.INSTANCE, f2, j7, shape2));
                        }
                        if (z4) {
                            j9 = j7;
                            f3 = f2;
                        } else {
                            j9 = j7;
                            f3 = f2;
                            createListBuilder.add(PointerIconKt.pointerHoverIcon$default(Modifier.INSTANCE, PointerIcon.INSTANCE.getDefault(), false, 2, null));
                        }
                        createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
                        List build = CollectionsKt.build(createListBuilder);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Intrinsics.checkNotNull(companion2, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                        Modifier.Companion companion3 = companion2;
                        it = build.iterator();
                        while (it.hasNext()) {
                            companion3 = companion3.then((Modifier) it.next());
                        }
                        Modifier then = companion.then(companion3);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i33 >> 3) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Arrangement.Horizontal horizontal4 = horizontal2;
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
                        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j6)), ComposableLambdaKt.rememberComposableLambda(834724160, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.ButtonKt$Button$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i34) {
                                if ((i34 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(834724160, i34, -1, "com.composeunstyled.Button.<anonymous>.<anonymous> (Button.kt:99)");
                                }
                                content.invoke(rowScopeInstance, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j10 = j9;
                        vertical3 = vertical2;
                        composer2 = startRestartGroup;
                        shape3 = shape2;
                        paddingValues3 = paddingValues2;
                        j11 = j13;
                        modifier2 = companion;
                        i25 = i21;
                        z5 = z4;
                        indication4 = indication5;
                        mutableInteractionSource3 = mutableInteractionSource5;
                        horizontal3 = horizontal4;
                        f4 = f3;
                        j12 = j6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z5 = z;
                        indication4 = indication;
                        mutableInteractionSource3 = mutableInteractionSource;
                        horizontal3 = horizontal;
                        vertical3 = vertical;
                        composer2 = startRestartGroup;
                        shape3 = shape2;
                        j12 = j5;
                        paddingValues3 = paddingValues2;
                        j10 = j3;
                        f4 = f2;
                        j11 = j4;
                        modifier2 = modifier;
                        i25 = i;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.ButtonKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Button_Y_0X4mI$lambda$2;
                                Button_Y_0X4mI$lambda$2 = ButtonKt.Button_Y_0X4mI$lambda$2(Function0.this, z5, shape3, j11, j12, paddingValues3, j10, f4, modifier2, i25, indication4, mutableInteractionSource3, horizontal3, vertical3, content, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                return Button_Y_0X4mI$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i2 & 805306368) != 0) {
                }
                if ((i3 & 6) != 0) {
                }
                i15 = i4 & 2048;
                if (i15 == 0) {
                }
                int i292 = i14;
                i17 = i4 & 4096;
                if (i17 == 0) {
                }
                i19 = i4 & 8192;
                if (i19 == 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((306783379 & i5) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i4 & 16) != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 != 0) {
                }
                if (i13 == 0) {
                }
                if ((i4 & 512) == 0) {
                }
                if ((i4 & 1024) == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource4;
                i23 = i5;
                i24 = i22;
                j7 = m5693getUnspecified0d7_KjU;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                createListBuilder = CollectionsKt.createListBuilder();
                long j132 = j8;
                z4 = z3;
                Indication indication52 = indication3;
                MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
                createListBuilder.add(ClickableKt.m299clickableO2vRcR0$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j8, null, 2, null), mutableInteractionSource52, indication52, z4, null, Role.m7575boximpl(i21), onClick, 8, null));
                int i332 = i24;
                if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
                    createListBuilder.add(BorderKt.m274borderxT4_qwU(Modifier.INSTANCE, f2, j7, shape2));
                }
                if (z4) {
                }
                createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
                List build2 = CollectionsKt.build(createListBuilder);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Intrinsics.checkNotNull(companion22, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                Modifier.Companion companion32 = companion22;
                it = build2.iterator();
                while (it.hasNext()) {
                }
                Modifier then2 = companion.then(companion32);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i332 >> 3) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Arrangement.Horizontal horizontal42 = horizontal2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                final RowScope rowScopeInstance2 = RowScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j6)), ComposableLambdaKt.rememberComposableLambda(834724160, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.ButtonKt$Button$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i34) {
                        if ((i34 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(834724160, i34, -1, "com.composeunstyled.Button.<anonymous>.<anonymous> (Button.kt:99)");
                        }
                        content.invoke(rowScopeInstance2, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                j10 = j9;
                vertical3 = vertical2;
                composer2 = startRestartGroup;
                shape3 = shape2;
                paddingValues3 = paddingValues2;
                j11 = j132;
                modifier2 = companion;
                i25 = i21;
                z5 = z4;
                indication4 = indication52;
                mutableInteractionSource3 = mutableInteractionSource52;
                horizontal3 = horizontal42;
                f4 = f3;
                j12 = j6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            shape2 = shape;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            if ((i2 & 805306368) != 0) {
            }
            if ((i3 & 6) != 0) {
            }
            i15 = i4 & 2048;
            if (i15 == 0) {
            }
            int i2922 = i14;
            i17 = i4 & 4096;
            if (i17 == 0) {
            }
            i19 = i4 & 8192;
            if (i19 == 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((306783379 & i5) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 16) != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 != 0) {
            }
            if (i13 == 0) {
            }
            if ((i4 & 512) == 0) {
            }
            if ((i4 & 1024) == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource4;
            i23 = i5;
            i24 = i22;
            j7 = m5693getUnspecified0d7_KjU;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            createListBuilder = CollectionsKt.createListBuilder();
            long j1322 = j8;
            z4 = z3;
            Indication indication522 = indication3;
            MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource2;
            createListBuilder.add(ClickableKt.m299clickableO2vRcR0$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j8, null, 2, null), mutableInteractionSource522, indication522, z4, null, Role.m7575boximpl(i21), onClick, 8, null));
            int i3322 = i24;
            if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
            }
            if (z4) {
            }
            createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
            List build22 = CollectionsKt.build(createListBuilder);
            Modifier.Companion companion222 = Modifier.INSTANCE;
            Intrinsics.checkNotNull(companion222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
            Modifier.Companion companion322 = companion222;
            it = build22.iterator();
            while (it.hasNext()) {
            }
            Modifier then22 = companion.then(companion322);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i3322 >> 3) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            Arrangement.Horizontal horizontal422 = horizontal2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            final RowScope rowScopeInstance22 = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j6)), ComposableLambdaKt.rememberComposableLambda(834724160, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.ButtonKt$Button$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i34) {
                    if ((i34 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(834724160, i34, -1, "com.composeunstyled.Button.<anonymous>.<anonymous> (Button.kt:99)");
                    }
                    content.invoke(rowScopeInstance22, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            j10 = j9;
            vertical3 = vertical2;
            composer2 = startRestartGroup;
            shape3 = shape2;
            paddingValues3 = paddingValues2;
            j11 = j1322;
            modifier2 = companion;
            i25 = i21;
            z5 = z4;
            indication4 = indication522;
            mutableInteractionSource3 = mutableInteractionSource522;
            horizontal3 = horizontal422;
            f4 = f3;
            j12 = j6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        shape2 = shape;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        if ((i2 & 805306368) != 0) {
        }
        if ((i3 & 6) != 0) {
        }
        i15 = i4 & 2048;
        if (i15 == 0) {
        }
        int i29222 = i14;
        i17 = i4 & 4096;
        if (i17 == 0) {
        }
        i19 = i4 & 8192;
        if (i19 == 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((306783379 & i5) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 != 0) {
        }
        if (i13 == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        if ((i4 & 1024) == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource4;
        i23 = i5;
        i24 = i22;
        j7 = m5693getUnspecified0d7_KjU;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        createListBuilder = CollectionsKt.createListBuilder();
        long j13222 = j8;
        z4 = z3;
        Indication indication5222 = indication3;
        MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource2;
        createListBuilder.add(ClickableKt.m299clickableO2vRcR0$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, shape2), j8, null, 2, null), mutableInteractionSource5222, indication5222, z4, null, Role.m7575boximpl(i21), onClick, 8, null));
        int i33222 = i24;
        if (Dp.m8400compareTo0680j_4(f2, Dp.m8401constructorimpl(0)) > 0) {
        }
        if (z4) {
        }
        createListBuilder.add(PaddingKt.padding(Modifier.INSTANCE, paddingValues2));
        List build222 = CollectionsKt.build(createListBuilder);
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        Intrinsics.checkNotNull(companion2222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
        Modifier.Companion companion3222 = companion2222;
        it = build222.iterator();
        while (it.hasNext()) {
        }
        Modifier then222 = companion.then(companion3222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(horizontal2, vertical2, startRestartGroup, (((i33222 >> 3) & 1008) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        Arrangement.Horizontal horizontal4222 = horizontal2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        final RowScope rowScopeInstance222 = RowScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j6)), ComposableLambdaKt.rememberComposableLambda(834724160, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.ButtonKt$Button$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i34) {
                if ((i34 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(834724160, i34, -1, "com.composeunstyled.Button.<anonymous>.<anonymous> (Button.kt:99)");
                }
                content.invoke(rowScopeInstance222, composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        j10 = j9;
        vertical3 = vertical2;
        composer2 = startRestartGroup;
        shape3 = shape2;
        paddingValues3 = paddingValues2;
        j11 = j13222;
        modifier2 = companion;
        i25 = i21;
        z5 = z4;
        indication4 = indication5222;
        mutableInteractionSource3 = mutableInteractionSource5222;
        horizontal3 = horizontal4222;
        f4 = f3;
        j12 = j6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
