package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a®\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0013\b\u0002\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0013\b\u0002\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0084\u0001\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000b2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u00062\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u0010\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material3/FabPosition;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ScaffoldLayout", "fabPosition", "snackbar", "fab", "ScaffoldLayout-FMILGgc", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final float FabSpacing = Dp.m8401constructorimpl(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScaffoldLayout_FMILGgc$lambda$16(int i, Function2 function2, Function3 function3, Function2 function22, Function2 function23, WindowInsets windowInsets, Function2 function24, int i2, Composer composer, int i3) {
        m3199ScaffoldLayoutFMILGgc(i, function2, function3, function22, function23, windowInsets, function24, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scaffold_TvnljyQ$lambda$3(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i, long j, long j2, WindowInsets windowInsets, Function3 function3, int i2, int i3, Composer composer, int i4) {
        m3198ScaffoldTvnljyQ(modifier, function2, function22, function23, function24, i, j, j2, windowInsets, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0305  */
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3198ScaffoldTvnljyQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, int i, long j, long j2, WindowInsets windowInsets, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i8;
        int i9;
        Composer composer2;
        final Modifier modifier2;
        final WindowInsets windowInsets2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final int i10;
        final long j3;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> m2584getLambda$39202156$material3;
        Function2<? super Composer, ? super Integer, Unit> lambda$1582488484$material3;
        Function2<? super Composer, ? super Integer, Unit> lambda$414328099$material3;
        Function2<? super Composer, ? super Integer, Unit> m2583getLambda$1514016380$material3;
        int m2794getEndERTFSPs;
        int i11;
        long j5;
        long j6;
        final WindowInsets windowInsets3;
        int i12;
        long j7;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1211482744);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scaffold)N(modifier,topBar,bottomBar,snackbarHost,floatingActionButton,floatingActionButtonPosition:c#material3.FabPosition,containerColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,contentWindowInsets,content)94@4873L74,97@5031L224,103@5332L315,95@4952L695:Scaffold.kt#uh7d8r");
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            function25 = function2;
            i4 |= startRestartGroup.changedInstance(function25) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                function26 = function22;
                i4 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    function27 = function23;
                    i4 |= startRestartGroup.changedInstance(function27) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        function28 = function24;
                        i4 |= startRestartGroup.changedInstance(function28) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(i) ? 131072 : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i9 = i15;
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288;
                        } else {
                            i9 = i15;
                        }
                        if ((i2 & 12582912) == 0) {
                            i4 |= ((i3 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                                i14 = 67108864;
                                i4 |= i14;
                            }
                            i14 = 33554432;
                            i4 |= i14;
                        }
                        if ((i3 & 512) != 0) {
                            i4 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(function3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "89@4637L11,90@4687L31,91@4777L19");
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    companion = modifier;
                                    m2794getEndERTFSPs = i;
                                    j5 = j;
                                    m2584getLambda$39202156$material3 = function25;
                                    lambda$1582488484$material3 = function26;
                                    lambda$414328099$material3 = function27;
                                    m2583getLambda$1514016380$material3 = function28;
                                    i12 = 100663296;
                                    j7 = j2;
                                    windowInsets3 = windowInsets;
                                } else {
                                    companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                                    m2584getLambda$39202156$material3 = i16 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m2584getLambda$39202156$material3() : function25;
                                    lambda$1582488484$material3 = i5 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$1582488484$material3() : function26;
                                    lambda$414328099$material3 = i6 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$414328099$material3() : function27;
                                    m2583getLambda$1514016380$material3 = i7 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m2583getLambda$1514016380$material3() : function28;
                                    m2794getEndERTFSPs = i8 != 0 ? FabPosition.INSTANCE.m2794getEndERTFSPs() : i;
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                        i11 = -29360129;
                                        j5 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getBackground();
                                    } else {
                                        i11 = -29360129;
                                        j5 = j;
                                    }
                                    if ((i3 & 128) != 0) {
                                        j6 = ColorSchemeKt.m2543contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 18) & 14);
                                        i4 &= i11;
                                    } else {
                                        j6 = j2;
                                    }
                                    if ((i3 & 256) != 0) {
                                        windowInsets3 = ScaffoldDefaults.INSTANCE.getContentWindowInsets(startRestartGroup, 6);
                                        i4 &= -234881025;
                                    } else {
                                        windowInsets3 = windowInsets;
                                    }
                                    i12 = 100663296;
                                    j7 = j6;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i13 = i12;
                                    ComposerKt.traceEventStart(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                                } else {
                                    i13 = i12;
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -298760782, "CC(remember):Scaffold.kt#9igjgp");
                                int i17 = (234881024 & i4) ^ i13;
                                boolean z = (i17 > 67108864 && startRestartGroup.changed(windowInsets3)) || (i4 & i13) == 67108864;
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new MutableWindowInsets(windowInsets3);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                long j8 = j5;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -298755576, "CC(remember):Scaffold.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(mutableWindowInsets) | ((i17 > 67108864 && startRestartGroup.changed(windowInsets3)) || (i4 & i13) == 67108864);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function1() { // from class: androidx.compose.material3.ScaffoldKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit Scaffold_TvnljyQ$lambda$2$lambda$1;
                                            Scaffold_TvnljyQ$lambda$2$lambda$1 = ScaffoldKt.Scaffold_TvnljyQ$lambda$2$lambda$1(MutableWindowInsets.this, windowInsets3, (WindowInsets) obj);
                                            return Scaffold_TvnljyQ$lambda$2$lambda$1;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Function2<? super Composer, ? super Integer, Unit> function213 = m2584getLambda$39202156$material3;
                                final Function2<? super Composer, ? super Integer, Unit> function214 = lambda$1582488484$material3;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = lambda$414328099$material3;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = m2583getLambda$1514016380$material3;
                                final int i18 = m2794getEndERTFSPs;
                                int i19 = i4 >> 12;
                                composer2 = startRestartGroup;
                                SurfaceKt.m3409SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(companion, (Function1) rememberedValue2), null, j8, j7, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(848889571, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i20) {
                                        ComposerKt.sourceInformation(composer3, "C104@5342L299:Scaffold.kt#uh7d8r");
                                        if (composer3.shouldExecute((i20 & 3) != 2, i20 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(848889571, i20, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:104)");
                                            }
                                            ScaffoldKt.m3199ScaffoldLayoutFMILGgc(i18, function213, function3, function215, function216, mutableWindowInsets, function214, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), composer2, (i19 & 896) | 12582912 | (i19 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                function29 = m2584getLambda$39202156$material3;
                                function210 = lambda$1582488484$material3;
                                function211 = lambda$414328099$material3;
                                function212 = m2583getLambda$1514016380$material3;
                                i10 = m2794getEndERTFSPs;
                                windowInsets2 = windowInsets3;
                                j3 = j8;
                                j4 = j7;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                windowInsets2 = windowInsets;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                function212 = function28;
                                i10 = i;
                                j3 = j;
                                j4 = j2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ScaffoldKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Scaffold_TvnljyQ$lambda$3;
                                        Scaffold_TvnljyQ$lambda$3 = ScaffoldKt.Scaffold_TvnljyQ$lambda$3(Modifier.this, function29, function210, function211, function212, i10, j3, j4, windowInsets2, function3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return Scaffold_TvnljyQ$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function28 = function24;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function27 = function23;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                function28 = function24;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function26 = function22;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function27 = function23;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            function28 = function24;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function25 = function2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function26 = function22;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function27 = function23;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function28 = function24;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scaffold_TvnljyQ$lambda$2$lambda$1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m3199ScaffoldLayoutFMILGgc(final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        boolean z;
        ?? r2;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-280287501);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScaffoldLayout)N(fabPosition:c#material3.FabPosition,topBar,content,snackbar,fab,contentWindowInsets,bottomBar)142@6839L626,158@7515L41,159@7607L45,160@7698L35,162@7788L73,163@7913L47,164@7982L5885,164@7965L5902:Scaffold.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-280287501, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:137)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1226671013, "CC(remember):Scaffold.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$12 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1226692060, "CC(remember):Scaffold.kt#9igjgp");
            boolean z2 = (i3 & 112) == 32;
            ComposableLambda rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = ComposableLambdaKt.composableLambdaInstance(605195056, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$topBarContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C158@7536L16:Scaffold.kt#uh7d8r");
                        if (composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(605195056, i5, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:158)");
                            }
                            Function2<Composer, Integer, Unit> function25 = function2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -1154869819, "C158@7542L8:Scaffold.kt#uh7d8r");
                            function25.invoke(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final Function2 function25 = (Function2) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1226695008, "CC(remember):Scaffold.kt#9igjgp");
            boolean z3 = (i3 & 7168) == 2048;
            ComposableLambda rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = ComposableLambdaKt.composableLambdaInstance(418899191, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$snackbarContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C159@7630L18:Scaffold.kt#uh7d8r");
                        if (composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(418899191, i5, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:159)");
                            }
                            Function2<Composer, Integer, Unit> function26 = function22;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 367258716, "C159@7636L10:Scaffold.kt#uh7d8r");
                            function26.invoke(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final Function2 function26 = (Function2) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1226697910, "CC(remember):Scaffold.kt#9igjgp");
            boolean z4 = (57344 & i3) == 16384;
            ComposableLambda rememberedValue4 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = ComposableLambdaKt.composableLambdaInstance(338600263, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$fabContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C160@7716L13:Scaffold.kt#uh7d8r");
                        if (composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(338600263, i5, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:160)");
                            }
                            Function2<Composer, Integer, Unit> function27 = function23;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 2140512701, "C160@7722L5:Scaffold.kt#uh7d8r");
                            function27.invoke(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final Function2 function27 = (Function2) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1226700828, "CC(remember):Scaffold.kt#9igjgp");
            boolean z5 = (i3 & 896) == 256;
            ComposableLambda rememberedValue5 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                scaffoldKt$ScaffoldLayout$contentPadding$1$1 = scaffoldKt$ScaffoldLayout$contentPadding$1$12;
                rememberedValue5 = ComposableLambdaKt.composableLambdaInstance(-1776388365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$bodyContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C162@7826L31:Scaffold.kt#uh7d8r");
                        if (composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1776388365, i5, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:162)");
                            }
                            Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                            ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$13 = scaffoldKt$ScaffoldLayout$contentPadding$1$12;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, -931973261, "C162@7832L23:Scaffold.kt#uh7d8r");
                            function32.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$13, composer2, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                scaffoldKt$ScaffoldLayout$contentPadding$1$1 = scaffoldKt$ScaffoldLayout$contentPadding$1$12;
            }
            final Function2 function28 = (Function2) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1226704802, "CC(remember):Scaffold.kt#9igjgp");
            boolean z6 = (3670016 & i3) == 1048576;
            ComposableLambda rememberedValue6 = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                z = true;
                rememberedValue6 = ComposableLambdaKt.composableLambdaInstance(-1731662488, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$bottomBarContent$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C163@7937L19:Scaffold.kt#uh7d8r");
                        if (composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1731662488, i5, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:163)");
                            }
                            Function2<Composer, Integer, Unit> function29 = function24;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 79510070, "C163@7943L11:Scaffold.kt#uh7d8r");
                            function29.invoke(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                z = true;
            }
            final Function2 function29 = (Function2) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1226712848, "CC(remember):Scaffold.kt#9igjgp");
            boolean changed = ((458752 & i3) == 131072 ? z : false) | startRestartGroup.changed(function25) | startRestartGroup.changed(function26) | startRestartGroup.changed(function27) | ((i3 & 14) == 4 ? z : false) | startRestartGroup.changed(function29) | startRestartGroup.changed(function28);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                r2 = z;
                final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$13 = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
                i4 = 0;
                Function2 function210 = new Function2() { // from class: androidx.compose.material3.ScaffoldKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        MeasureResult ScaffoldLayout_FMILGgc$lambda$15$lambda$14;
                        ScaffoldLayout_FMILGgc$lambda$15$lambda$14 = ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$15$lambda$14(WindowInsets.this, function25, function26, function27, i, function29, scaffoldKt$ScaffoldLayout$contentPadding$1$13, function28, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                        return ScaffoldLayout_FMILGgc$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(function210);
                rememberedValue7 = function210;
            } else {
                r2 = z;
                i4 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue7, startRestartGroup, i4, r2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.ScaffoldKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ScaffoldLayout_FMILGgc$lambda$16;
                    ScaffoldLayout_FMILGgc$lambda$16 = ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$16(i, function2, function3, function22, function23, windowInsets, function24, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ScaffoldLayout_FMILGgc$lambda$16;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ScaffoldLayout_FMILGgc$lambda$15$lambda$14(final WindowInsets windowInsets, Function2 function2, Function2 function22, Function2 function23, int i, Function2 function24, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function25, final SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        int i2;
        int i3;
        int i4;
        final FabPlacement fabPlacement;
        Integer num;
        float f;
        float f2;
        int intValue;
        int height;
        int bottom;
        final int m8354getMaxWidthimpl = Constraints.m8354getMaxWidthimpl(constraints.getValue());
        final int m8353getMaxHeightimpl = Constraints.m8353getMaxHeightimpl(constraints.getValue());
        long m8344copyZbe2FdA$default = Constraints.m8344copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, 0, 10, null);
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        int left = windowInsets.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection());
        int right = windowInsets.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection());
        int bottom2 = windowInsets.getBottom(subcomposeMeasureScope2);
        final Placeable mo7075measureBRTryo0 = ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2))).mo7075measureBRTryo0(m8344copyZbe2FdA$default);
        int i5 = (-left) - right;
        int i6 = -bottom2;
        final Placeable mo7075measureBRTryo02 = ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22))).mo7075measureBRTryo0(ConstraintsKt.m8373offsetNN6EwU(m8344copyZbe2FdA$default, i5, i6));
        final Placeable mo7075measureBRTryo03 = ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function23))).mo7075measureBRTryo0(ConstraintsKt.m8373offsetNN6EwU(m8344copyZbe2FdA$default, i5, i6));
        if (mo7075measureBRTryo03.getWidth() == 0 && mo7075measureBRTryo03.getHeight() == 0) {
            fabPlacement = null;
        } else {
            int width = mo7075measureBRTryo03.getWidth();
            int height2 = mo7075measureBRTryo03.getHeight();
            if (FabPosition.m2789equalsimpl0(i, FabPosition.INSTANCE.m2796getStartERTFSPs())) {
                if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                    i2 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                    i4 = i2 + left;
                } else {
                    i3 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                    i4 = ((m8354getMaxWidthimpl - i3) - width) - right;
                }
            } else if (FabPosition.m2789equalsimpl0(i, FabPosition.INSTANCE.m2794getEndERTFSPs()) || FabPosition.m2789equalsimpl0(i, FabPosition.INSTANCE.m2795getEndOverlayERTFSPs())) {
                if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                    i3 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                    i4 = ((m8354getMaxWidthimpl - i3) - width) - right;
                } else {
                    i2 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                    i4 = i2 + left;
                }
            } else {
                i4 = (((m8354getMaxWidthimpl - width) + left) - right) / 2;
            }
            fabPlacement = new FabPlacement(i4, width, height2);
        }
        final Placeable mo7075measureBRTryo04 = ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, function24))).mo7075measureBRTryo0(m8344copyZbe2FdA$default);
        int i7 = 0;
        boolean z = mo7075measureBRTryo04.getWidth() == 0 && mo7075measureBRTryo04.getHeight() == 0;
        if (fabPlacement != null) {
            if (z || FabPosition.m2789equalsimpl0(i, FabPosition.INSTANCE.m2795getEndOverlayERTFSPs())) {
                height = fabPlacement.getHeight() + subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                bottom = windowInsets.getBottom(subcomposeMeasureScope2);
            } else {
                height = mo7075measureBRTryo04.getHeight() + fabPlacement.getHeight();
                bottom = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
            }
            num = Integer.valueOf(height + bottom);
        } else {
            num = null;
        }
        int height3 = mo7075measureBRTryo02.getHeight();
        if (height3 != 0) {
            if (num != null) {
                intValue = num.intValue();
            } else {
                Integer valueOf = Integer.valueOf(mo7075measureBRTryo04.getHeight());
                valueOf.intValue();
                if (z) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : windowInsets.getBottom(subcomposeMeasureScope2);
            }
            i7 = intValue + height3;
        }
        PaddingValues asPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets, subcomposeMeasureScope2);
        if (mo7075measureBRTryo0.getWidth() == 0 && mo7075measureBRTryo0.getHeight() == 0) {
            f = asPaddingValues.getTop();
        } else {
            f = subcomposeMeasureScope.mo421toDpu2uoSUM(mo7075measureBRTryo0.getHeight());
        }
        if (z) {
            f2 = asPaddingValues.getBottom();
        } else {
            f2 = subcomposeMeasureScope.mo421toDpu2uoSUM(mo7075measureBRTryo04.getHeight());
        }
        final Integer num2 = num;
        scaffoldKt$ScaffoldLayout$contentPadding$1$1.setPaddingHolder(PaddingKt.m833PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), f, PaddingKt.calculateEndPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), f2));
        final Placeable mo7075measureBRTryo05 = ((Measurable) CollectionsKt.first((List) subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, function25))).mo7075measureBRTryo0(m8344copyZbe2FdA$default);
        final int i8 = i7;
        return MeasureScope.layout$default(subcomposeMeasureScope, m8354getMaxWidthimpl, m8353getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material3.ScaffoldKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13;
                ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13 = ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13(Placeable.this, mo7075measureBRTryo0, mo7075measureBRTryo02, m8354getMaxWidthimpl, windowInsets, subcomposeMeasureScope, m8353getMaxHeightimpl, i8, mo7075measureBRTryo04, fabPlacement, mo7075measureBRTryo03, num2, (Placeable.PlacementScope) obj);
                return ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13(Placeable placeable, Placeable placeable2, Placeable placeable3, int i, WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, int i2, int i3, Placeable placeable4, FabPlacement fabPlacement, Placeable placeable5, Integer num, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        Placeable.PlacementScope.place$default(placementScope, placeable3, (((i - placeable3.getWidth()) + windowInsets.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) / 2, i2 - i3, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(placementScope, placeable4, 0, i2 - placeable4.getHeight(), 0.0f, 4, null);
        if (fabPlacement != null) {
            int left = fabPlacement.getLeft();
            Intrinsics.checkNotNull(num);
            Placeable.PlacementScope.place$default(placementScope, placeable5, left, i2 - num.intValue(), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
