package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class x {
    public static final Unit a(float f, long j, long j2, int i, int i2, Composer composer, int i3) {
        a(f, j, j2, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(float f, int i, float f2, long j, long j2, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        a(f, i, f2, j, j2, i2, modifier, composer, i3 | 1, i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029e A[LOOP:0: B:62:0x0204->B:66:0x029e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a2 A[EDGE_INSN: B:67:0x02a2->B:76:0x02a2 BREAK  A[LOOP:0: B:62:0x0204->B:66:0x029e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ae  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, int i, float f2, long j, long j2, int i2, @Nullable Modifier modifier, @Nullable Composer composer, final int i3, final int i4) {
        float f3;
        int i5;
        int i6;
        int i7;
        float f4;
        int i8;
        final long j3;
        int i9;
        int i10;
        int i11;
        final int i12;
        int i13;
        Modifier modifier2;
        int i14;
        final float m2507constructorimpl;
        long m1458getGray0d7_KjU;
        final Modifier modifier3;
        final int i15;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-293854230);
        int i16 = i4 & 1;
        if (i16 != 0) {
            i5 = i3 | 6;
            f3 = f;
        } else if ((i3 & 6) == 0) {
            f3 = f;
            i5 = (startRestartGroup.changed(f3) ? 4 : 2) | i3;
        } else {
            f3 = f;
            i5 = i3;
        }
        int i17 = i4 & 2;
        if (i17 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 = i;
            i5 |= startRestartGroup.changed(i6) ? 32 : 16;
            i7 = i4 & 4;
            if (i7 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                f4 = f2;
                i5 |= startRestartGroup.changed(f4) ? 256 : 128;
                i8 = i4 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    j3 = j;
                    i5 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                    i9 = i4 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                        i10 = i9;
                    } else {
                        i10 = i9;
                        if ((i3 & 24576) == 0) {
                            i5 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                        }
                    }
                    i11 = i4 & 32;
                    if (i11 == 0) {
                        i5 |= 196608;
                        i12 = i2;
                    } else {
                        i12 = i2;
                        if ((i3 & 196608) == 0) {
                            i5 |= startRestartGroup.changed(i12) ? 131072 : 65536;
                        }
                    }
                    i13 = i4 & 64;
                    if (i13 == 0) {
                        i5 |= 1572864;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        }
                    }
                    if ((i5 & 599187) != 599186 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        m1458getGray0d7_KjU = j2;
                        modifier3 = modifier2;
                        m2507constructorimpl = f4;
                        f5 = f3;
                        i15 = i6;
                    } else {
                        float f6 = i16 == 0 ? 4.8f : f3;
                        i14 = i17 == 0 ? 5 : i6;
                        m2507constructorimpl = i7 == 0 ? Dp.m2507constructorimpl(12) : f4;
                        if (i8 != 0) {
                            j3 = Color.INSTANCE.m1462getWhite0d7_KjU();
                        }
                        m1458getGray0d7_KjU = i10 == 0 ? Color.INSTANCE.m1458getGray0d7_KjU() : j2;
                        int i18 = i11 == 0 ? 9 : i12;
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-293854230, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RatingBar (RatingBar.kt:45)");
                        }
                        int floor = (int) Math.floor(f6);
                        int roundToInt = MathKt.roundToInt(10.0f * f6) - (floor * 10);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 constructor = companion.getConstructor();
                        int i19 = i18;
                        Function3 materializerOf = LayoutKt.materializerOf(modifier2);
                        if (startRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        startRestartGroup.disableReusing();
                        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                        Modifier modifier4 = modifier2;
                        Updater.m1153setimpl(m1149constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(-678309503);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(1767013527);
                        if (1 <= i14) {
                            int i20 = 1;
                            while (true) {
                                if (i20 <= floor) {
                                    startRestartGroup.startReplaceableGroup(-1057077637);
                                    IconKt.m887Iconww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m357size3ABfNKs(Modifier.INSTANCE, m2507constructorimpl), j3, startRestartGroup, (i5 & 7168) | 48, 0);
                                    startRestartGroup.endReplaceableGroup();
                                } else {
                                    if (i20 == floor + 1 && 1 <= roundToInt) {
                                        if (roundToInt < 10) {
                                            startRestartGroup.startReplaceableGroup(-1056685549);
                                            a(m2507constructorimpl, j3, m1458getGray0d7_KjU, startRestartGroup, (i5 >> 6) & 1022, 0);
                                            startRestartGroup.endReplaceableGroup();
                                        }
                                    }
                                    startRestartGroup.startReplaceableGroup(-1056438386);
                                    IconKt.m887Iconww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m357size3ABfNKs(Modifier.INSTANCE, m2507constructorimpl), m1458getGray0d7_KjU, startRestartGroup, ((i5 >> 3) & 7168) | 48, 0);
                                    startRestartGroup.endReplaceableGroup();
                                    if (i20 != i14) {
                                        break;
                                    } else {
                                        i20++;
                                    }
                                }
                                if (i20 != i14) {
                                }
                            }
                        }
                        startRestartGroup.endReplaceableGroup();
                        SpacerKt.Spacer(SizeKt.m362width3ABfNKs(Modifier.INSTANCE, Dp.m2507constructorimpl(4)), startRestartGroup, 6);
                        TextKt.m1056TextfLXpl1I(String.valueOf(f6), null, Color.INSTANCE.m1462getWhite0d7_KjU(), TextUnitKt.getSp(i19), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        i15 = i14;
                        i12 = i19;
                        f5 = f6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final long j4 = m1458getGray0d7_KjU;
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x.a(f5, i15, m2507constructorimpl, j3, j4, i12, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                j3 = j;
                i9 = i4 & 16;
                if (i9 == 0) {
                }
                i11 = i4 & 32;
                if (i11 == 0) {
                }
                i13 = i4 & 64;
                if (i13 == 0) {
                }
                if ((i5 & 599187) != 599186) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int floor2 = (int) Math.floor(f6);
                int roundToInt2 = MathKt.roundToInt(10.0f * f6) - (floor2 * 10);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 constructor2 = companion2.getConstructor();
                int i192 = i18;
                Function3 materializerOf2 = LayoutKt.materializerOf(modifier2);
                if (startRestartGroup.getApplier() == null) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                Modifier modifier42 = modifier2;
                Updater.m1153setimpl(m1149constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1767013527);
                if (1 <= i14) {
                }
                startRestartGroup.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m362width3ABfNKs(Modifier.INSTANCE, Dp.m2507constructorimpl(4)), startRestartGroup, 6);
                TextKt.m1056TextfLXpl1I(String.valueOf(f6), null, Color.INSTANCE.m1462getWhite0d7_KjU(), TextUnitKt.getSp(i192), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                i15 = i14;
                i12 = i192;
                f5 = f6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f4 = f2;
            i8 = i4 & 8;
            if (i8 != 0) {
            }
            j3 = j;
            i9 = i4 & 16;
            if (i9 == 0) {
            }
            i11 = i4 & 32;
            if (i11 == 0) {
            }
            i13 = i4 & 64;
            if (i13 == 0) {
            }
            if ((i5 & 599187) != 599186) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int floor22 = (int) Math.floor(f6);
            int roundToInt22 = MathKt.roundToInt(10.0f * f6) - (floor22 * 10);
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 constructor22 = companion22.getConstructor();
            int i1922 = i18;
            Function3 materializerOf22 = LayoutKt.materializerOf(modifier2);
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
            Modifier modifier422 = modifier2;
            Updater.m1153setimpl(m1149constructorimpl22, rowMeasurePolicy22, companion22.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl22, density22, companion22.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-678309503);
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1767013527);
            if (1 <= i14) {
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m362width3ABfNKs(Modifier.INSTANCE, Dp.m2507constructorimpl(4)), startRestartGroup, 6);
            TextKt.m1056TextfLXpl1I(String.valueOf(f6), null, Color.INSTANCE.m1462getWhite0d7_KjU(), TextUnitKt.getSp(i1922), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            i15 = i14;
            i12 = i1922;
            f5 = f6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i;
        i7 = i4 & 4;
        if (i7 == 0) {
        }
        f4 = f2;
        i8 = i4 & 8;
        if (i8 != 0) {
        }
        j3 = j;
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        i11 = i4 & 32;
        if (i11 == 0) {
        }
        i13 = i4 & 64;
        if (i13 == 0) {
        }
        if ((i5 & 599187) != 599186) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int floor222 = (int) Math.floor(f6);
        int roundToInt222 = MathKt.roundToInt(10.0f * f6) - (floor222 * 10);
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Function0 constructor222 = companion222.getConstructor();
        int i19222 = i18;
        Function3 materializerOf222 = LayoutKt.materializerOf(modifier2);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl222 = Updater.m1149constructorimpl(startRestartGroup);
        Modifier modifier4222 = modifier2;
        Updater.m1153setimpl(m1149constructorimpl222, rowMeasurePolicy222, companion222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl222, density222, companion222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl222, layoutDirection222, companion222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1767013527);
        if (1 <= i14) {
        }
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m362width3ABfNKs(Modifier.INSTANCE, Dp.m2507constructorimpl(4)), startRestartGroup, 6);
        TextKt.m1056TextfLXpl1I(String.valueOf(f6), null, Color.INSTANCE.m1462getWhite0d7_KjU(), TextUnitKt.getSp(i19222), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        i15 = i14;
        i12 = i19222;
        f5 = f6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004d  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        long j3;
        int i4;
        long j4;
        float m2507constructorimpl;
        long j5;
        Object rememberedValue;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-2016551008);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j3 = j;
            i3 |= startRestartGroup.changed(j3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                j4 = j2;
                i3 |= startRestartGroup.changed(j4) ? 256 : 128;
                if ((i3 & 147) != 146 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    m2507constructorimpl = f2;
                    j5 = j3;
                    j6 = j4;
                } else {
                    m2507constructorimpl = i5 != 0 ? Dp.m2507constructorimpl(12) : f2;
                    if (i6 != 0) {
                        j3 = Color.INSTANCE.m1462getWhite0d7_KjU();
                    }
                    j5 = j3;
                    long m1458getGray0d7_KjU = i4 != 0 ? Color.INSTANCE.m1458getGray0d7_KjU() : j4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2016551008, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HalfStar (RatingBar.kt:95)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier m357size3ABfNKs = SizeKt.m357size3ABfNKs(companion, m2507constructorimpl);
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion2.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(m357size3ABfNKs);
                    if (startRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Icons icons = Icons.INSTANCE;
                    IconKt.m887Iconww6aTOc(StarKt.getStar(icons.getDefault()), (String) null, boxScopeInstance.matchParentSize(companion), m1458getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
                    ImageVector star = StarKt.getStar(icons.getDefault());
                    Modifier matchParentSize = boxScopeInstance.matchParentSize(companion);
                    startRestartGroup.startReplaceableGroup(-1749569609);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return x.a((ContentDrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    IconKt.m887Iconww6aTOc(star, (String) null, DrawModifierKt.drawWithContent(matchParentSize, (Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j6 = m1458getGray0d7_KjU;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final float f3 = m2507constructorimpl;
                    final long j7 = j5;
                    endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return x.a(f3, j7, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            j4 = j2;
            if ((i3 & 147) != 146) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            j5 = j3;
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier m357size3ABfNKs2 = SizeKt.m357size3ABfNKs(companion3, m2507constructorimpl);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 constructor2 = companion22.getConstructor();
            Function3 materializerOf2 = LayoutKt.materializerOf(m357size3ABfNKs2);
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2, density2, companion22.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Icons icons2 = Icons.INSTANCE;
            IconKt.m887Iconww6aTOc(StarKt.getStar(icons2.getDefault()), (String) null, boxScopeInstance2.matchParentSize(companion3), m1458getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
            ImageVector star2 = StarKt.getStar(icons2.getDefault());
            Modifier matchParentSize2 = boxScopeInstance2.matchParentSize(companion3);
            startRestartGroup.startReplaceableGroup(-1749569609);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            IconKt.m887Iconww6aTOc(star2, (String) null, DrawModifierKt.drawWithContent(matchParentSize2, (Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            j6 = m1458getGray0d7_KjU;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j3 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j4 = j2;
        if ((i3 & 147) != 146) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        j5 = j3;
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier.Companion companion32 = Modifier.INSTANCE;
        Modifier m357size3ABfNKs22 = SizeKt.m357size3ABfNKs(companion32, m2507constructorimpl);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Function0 constructor22 = companion222.getConstructor();
        Function3 materializerOf22 = LayoutKt.materializerOf(m357size3ABfNKs22);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl22, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl22, density22, companion222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        Icons icons22 = Icons.INSTANCE;
        IconKt.m887Iconww6aTOc(StarKt.getStar(icons22.getDefault()), (String) null, boxScopeInstance22.matchParentSize(companion32), m1458getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
        ImageVector star22 = StarKt.getStar(icons22.getDefault());
        Modifier matchParentSize22 = boxScopeInstance22.matchParentSize(companion32);
        startRestartGroup.startReplaceableGroup(-1749569609);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        IconKt.m887Iconww6aTOc(star22, (String) null, DrawModifierKt.drawWithContent(matchParentSize22, (Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        j6 = m1458getGray0d7_KjU;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final Unit a(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float m1335getWidthimpl = Size.m1335getWidthimpl(drawWithContent.mo1708getSizeNHjbRc()) / 2.0f;
        float m1333getHeightimpl = Size.m1333getHeightimpl(drawWithContent.mo1708getSizeNHjbRc());
        int m1440getIntersectrtfAjoo = ClipOp.INSTANCE.m1440getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long mo1685getSizeNHjbRc = drawContext.mo1685getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1688clipRectN_I0leg(0.0f, 0.0f, m1335getWidthimpl, m1333getHeightimpl, m1440getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo1686setSizeuvyYCjk(mo1685getSizeNHjbRc);
        return Unit.INSTANCE;
    }
}
