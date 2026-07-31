package com.composables.core;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import com.composeunstyled.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Separators.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\t\u001a1\u0010\f\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\f\u001a\u00020\u0001*\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"HorizontalSeparator", "", "color", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "HorizontalSeparator-DxzAY5Q", "(JLandroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "VerticalSeparator", "VerticalSeparator-DxzAY5Q", "Separator", "Landroidx/compose/foundation/layout/ColumnScope;", "Separator-MBs18nI", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeparatorsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalSeparator_DxzAY5Q$lambda$2(long j, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        m9410HorizontalSeparatorDxzAY5Q(j, modifier, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Separator_MBs18nI$lambda$6(ColumnScope columnScope, Modifier modifier, long j, float f, int i, int i2, Composer composer, int i3) {
        m9411SeparatorMBs18nI(columnScope, modifier, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Separator_MBs18nI$lambda$7(RowScope rowScope, Modifier modifier, long j, float f, int i, int i2, Composer composer, int i3) {
        m9412SeparatorMBs18nI(rowScope, modifier, j, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalSeparator_DxzAY5Q$lambda$5(long j, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        m9413VerticalSeparatorDxzAY5Q(j, modifier, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: HorizontalSeparator-DxzAY5Q, reason: not valid java name */
    public static final void m9410HorizontalSeparatorDxzAY5Q(final long j, Modifier modifier, final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-164002995);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = Dp.INSTANCE.m8419getHairlineD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-164002995, i3, -1, "com.composables.core.HorizontalSeparator (Separators.kt:41)");
            }
            Modifier m875height3ABfNKs = SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.composables.core.SeparatorsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HorizontalSeparator_DxzAY5Q$lambda$1$lambda$0;
                        HorizontalSeparator_DxzAY5Q$lambda$1$lambda$0 = SeparatorsKt.HorizontalSeparator_DxzAY5Q$lambda$1$lambda$0(f, j, (DrawScope) obj);
                        return HorizontalSeparator_DxzAY5Q$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(m875height3ABfNKs, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.SeparatorsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HorizontalSeparator_DxzAY5Q$lambda$2;
                    HorizontalSeparator_DxzAY5Q$lambda$2 = SeparatorsKt.HorizontalSeparator_DxzAY5Q$lambda$2(j, modifier2, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HorizontalSeparator_DxzAY5Q$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalSeparator_DxzAY5Q$lambda$1$lambda$0(float f, long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f2 = Canvas.mo424toPx0680j_4(f);
        float f3 = 2;
        float f4 = Canvas.mo424toPx0680j_4(f) / f3;
        long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6236getSizeNHjbRc() >> 32));
        float f5 = Canvas.mo424toPx0680j_4(f) / f3;
        DrawScope.m6222drawLineNGM6Ib0$default(Canvas, j, m5405constructorimpl, Offset.m5405constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), f2, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    /* renamed from: VerticalSeparator-DxzAY5Q, reason: not valid java name */
    public static final void m9413VerticalSeparatorDxzAY5Q(final long j, Modifier modifier, final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1185769697);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = Dp.INSTANCE.m8419getHairlineD9Ej5fM();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185769697, i3, -1, "com.composables.core.VerticalSeparator (Separators.kt:82)");
            }
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m894width3ABfNKs(modifier, f), 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.composables.core.SeparatorsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit VerticalSeparator_DxzAY5Q$lambda$4$lambda$3;
                        VerticalSeparator_DxzAY5Q$lambda$4$lambda$3 = SeparatorsKt.VerticalSeparator_DxzAY5Q$lambda$4$lambda$3(f, j, (DrawScope) obj);
                        return VerticalSeparator_DxzAY5Q$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(fillMaxHeight$default, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.SeparatorsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalSeparator_DxzAY5Q$lambda$5;
                    VerticalSeparator_DxzAY5Q$lambda$5 = SeparatorsKt.VerticalSeparator_DxzAY5Q$lambda$5(j, modifier2, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalSeparator_DxzAY5Q$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalSeparator_DxzAY5Q$lambda$4$lambda$3(float f, long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f2 = Canvas.mo424toPx0680j_4(f);
        long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(Canvas.mo424toPx0680j_4(f) / r3) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float f3 = Canvas.mo424toPx0680j_4(f) / 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6236getSizeNHjbRc() & 4294967295L));
        DrawScope.m6222drawLineNGM6Ib0$default(Canvas, j, m5405constructorimpl, Offset.m5405constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), f2, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* renamed from: Separator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9411SeparatorMBs18nI(final ColumnScope Separator, Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        int i3;
        final long j2;
        float f2;
        Modifier modifier2;
        float m8419getHairlineD9Ej5fM;
        final Modifier modifier3;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(Separator, "$this$Separator");
        Composer startRestartGroup = composer.startRestartGroup(-2024481017);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            if ((i3 & 1169) == 1168 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContentColor);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        j2 = ((Color) consume).m5667unboximpl();
                        i3 &= -897;
                    }
                    if (i6 != 0) {
                        modifier2 = modifier;
                        m8419getHairlineD9Ej5fM = Dp.INSTANCE.m8419getHairlineD9Ej5fM();
                        long j3 = j2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2024481017, i3, -1, "com.composables.core.Separator (Separators.kt:123)");
                        }
                        m9410HorizontalSeparatorDxzAY5Q(j3, modifier2, m8419getHairlineD9Ej5fM, startRestartGroup, ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = j3;
                        modifier3 = modifier2;
                        f3 = m8419getHairlineD9Ej5fM;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -897;
                    }
                }
                modifier2 = modifier;
                m8419getHairlineD9Ej5fM = f2;
                long j32 = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m9410HorizontalSeparatorDxzAY5Q(j32, modifier2, m8419getHairlineD9Ej5fM, startRestartGroup, ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j2 = j32;
                modifier3 = modifier2;
                f3 = m8419getHairlineD9Ej5fM;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                f3 = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.SeparatorsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Separator_MBs18nI$lambda$6;
                        Separator_MBs18nI$lambda$6 = SeparatorsKt.Separator_MBs18nI$lambda$6(ColumnScope.this, modifier3, j2, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Separator_MBs18nI$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((i3 & 1169) == 1168) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i6 != 0) {
        }
        modifier2 = modifier;
        m8419getHairlineD9Ej5fM = f2;
        long j322 = j2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m9410HorizontalSeparatorDxzAY5Q(j322, modifier2, m8419getHairlineD9Ej5fM, startRestartGroup, ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j2 = j322;
        modifier3 = modifier2;
        f3 = m8419getHairlineD9Ej5fM;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* renamed from: Separator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9412SeparatorMBs18nI(final RowScope Separator, Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        int i3;
        final long j2;
        float f2;
        Modifier modifier2;
        float m8419getHairlineD9Ej5fM;
        final Modifier modifier3;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(Separator, "$this$Separator");
        Composer startRestartGroup = composer.startRestartGroup(408838639);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            if ((i2 & 2) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            if ((i3 & 1169) == 1168 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    if ((i2 & 2) != 0) {
                        ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContentColor);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        j2 = ((Color) consume).m5667unboximpl();
                        i3 &= -897;
                    }
                    if (i6 != 0) {
                        modifier2 = modifier;
                        m8419getHairlineD9Ej5fM = Dp.INSTANCE.m8419getHairlineD9Ej5fM();
                        long j3 = j2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(408838639, i3, -1, "com.composables.core.Separator (Separators.kt:157)");
                        }
                        m9413VerticalSeparatorDxzAY5Q(j3, modifier2, m8419getHairlineD9Ej5fM, startRestartGroup, ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j2 = j3;
                        modifier3 = modifier2;
                        f3 = m8419getHairlineD9Ej5fM;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -897;
                    }
                }
                modifier2 = modifier;
                m8419getHairlineD9Ej5fM = f2;
                long j32 = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m9413VerticalSeparatorDxzAY5Q(j32, modifier2, m8419getHairlineD9Ej5fM, startRestartGroup, ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j2 = j32;
                modifier3 = modifier2;
                f3 = m8419getHairlineD9Ej5fM;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                f3 = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.SeparatorsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Separator_MBs18nI$lambda$7;
                        Separator_MBs18nI$lambda$7 = SeparatorsKt.Separator_MBs18nI$lambda$7(RowScope.this, modifier3, j2, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Separator_MBs18nI$lambda$7;
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((i3 & 1169) == 1168) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i6 != 0) {
        }
        modifier2 = modifier;
        m8419getHairlineD9Ej5fM = f2;
        long j322 = j2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m9413VerticalSeparatorDxzAY5Q(j322, modifier2, m8419getHairlineD9Ej5fM, startRestartGroup, ((i3 >> 6) & 14) | (i3 & 112) | ((i3 >> 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j2 = j322;
        modifier3 = modifier2;
        f3 = m8419getHairlineD9Ej5fM;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
