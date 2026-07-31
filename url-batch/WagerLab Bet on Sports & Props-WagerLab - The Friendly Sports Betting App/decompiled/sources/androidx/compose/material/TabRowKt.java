package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u001a\u009c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u000723\b\u0002\u0010\t\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a¦\u0001\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u001923\b\u0002\u0010\t\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"\u0010\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d\"\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"TabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "edgePadding", "Landroidx/compose/ui/unit/Dp;", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowMinimumTabWidth", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m8401constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableTabRow_sKfQg0A$lambda$1(int i, Modifier modifier, long j, long j2, float f, Function3 function3, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m2203ScrollableTabRowsKfQg0A(i, modifier, j, j2, f, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabRow_pAZo6Ak$lambda$0(int i, Modifier modifier, long j, long j2, Function3 function3, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        m2204TabRowpAZo6Ak(i, modifier, j, j2, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0082  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2204TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        ComposableLambda rememberComposableLambda;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> m1981getLambda$1216856915$material;
        long j7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(113221600);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRow)N(selectedTabIndex,modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,indicator,divider,tabs)149@7291L1392,145@7159L1524:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i4 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i4 |= i8;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "136@6694L6,137@6743L32,139@6882L125");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            companion = modifier;
                            rememberComposableLambda = function32;
                        } else {
                            companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                j4 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(1896966245, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                    invoke((List<TabPosition>) list, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(List<TabPosition> list, Composer composer3, int i10) {
                                    ComposerKt.sourceInformation(composer3, "CN(tabPositions)140@6927L70:TabRow.kt#jmzs0o");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1896966245, i10, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:140)");
                                    }
                                    TabRowDefaults.INSTANCE.m2199Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54) : function32;
                            if (i6 != 0) {
                                long j8 = j3;
                                i7 = i4;
                                m1981getLambda$1216856915$material = ComposableSingletons$TabRowKt.INSTANCE.m1981getLambda$1216856915$material();
                                j7 = j8;
                                long j9 = j4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(113221600, i7, -1, "androidx.compose.material.TabRow (TabRow.kt:144)");
                                }
                                composer2 = startRestartGroup;
                                SurfaceKt.m2169SurfaceFjzlyU(SelectableGroupKt.selectableGroup(companion), null, j7, j9, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-638448612, true, new TabRowKt$TabRow$2(function22, m1981getLambda$1216856915$material, rememberComposableLambda), startRestartGroup, 54), composer2, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                function33 = rememberComposableLambda;
                                j6 = j9;
                                function24 = m1981getLambda$1216856915$material;
                                j5 = j7;
                            }
                        }
                        j7 = j3;
                        i7 = i4;
                        m1981getLambda$1216856915$material = function23;
                        long j92 = j4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        SurfaceKt.m2169SurfaceFjzlyU(SelectableGroupKt.selectableGroup(companion), null, j7, j92, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-638448612, true, new TabRowKt$TabRow$2(function22, m1981getLambda$1216856915$material, rememberComposableLambda), startRestartGroup, 54), composer2, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        function33 = rememberComposableLambda;
                        j6 = j92;
                        function24 = m1981getLambda$1216856915$material;
                        j5 = j7;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        j5 = j3;
                        j6 = j4;
                        function33 = function32;
                        function24 = function23;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TabRow_pAZo6Ak$lambda$0;
                                TabRow_pAZo6Ak$lambda$0 = TabRowKt.TabRow_pAZo6Ak$lambda$0(i, modifier2, j5, j6, function33, function24, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return TabRow_pAZo6Ak$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                function23 = function2;
                if ((i3 & 64) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c1  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2203ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        Composer composer2;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final float f3;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        float m2202getScrollableTabRowPaddingD9Ej5fM;
        Modifier modifier3;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1291546575);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRow)N(selectedTabIndex,modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,edgePadding:c#ui.unit.Dp,indicator,divider,tabs)235@11885L2929,235@11802L3012:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "225@11275L6,226@11324L32,229@11525L125");
                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                function24 = function2;
                                m2202getScrollableTabRowPaddingD9Ej5fM = f2;
                                function34 = function32;
                                modifier3 = modifier;
                            } else {
                                Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j4 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 6) & 14);
                                    i4 &= -7169;
                                }
                                m2202getScrollableTabRowPaddingD9Ej5fM = i5 != 0 ? TabRowDefaults.INSTANCE.m2202getScrollableTabRowPaddingD9Ej5fM() : f2;
                                ComposableLambda rememberComposableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(-233732148, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                        invoke((List<TabPosition>) list, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(List<TabPosition> list, Composer composer3, int i11) {
                                        ComposerKt.sourceInformation(composer3, "CN(tabPositions)230@11570L70:TabRow.kt#jmzs0o");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-233732148, i11, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:230)");
                                        }
                                        TabRowDefaults.INSTANCE.m2199Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54) : function32;
                                if (i7 != 0) {
                                    function24 = ComposableSingletons$TabRowKt.INSTANCE.m1982getLambda$222041980$material();
                                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = rememberComposableLambda;
                                    modifier3 = companion;
                                    function34 = function35;
                                } else {
                                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = rememberComposableLambda;
                                    modifier3 = companion;
                                    function34 = function36;
                                    function24 = function2;
                                }
                            }
                            long j7 = j3;
                            long j8 = j4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1291546575, i4, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:234)");
                            }
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function34;
                            Function2<? super Composer, ? super Integer, Unit> function25 = function24;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2169SurfaceFjzlyU(modifier3, null, j7, j8, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1575164555, true, new TabRowKt$ScrollableTabRow$2(m2202getScrollableTabRowPaddingD9Ej5fM, function22, function25, function37, i), startRestartGroup, 54), composer2, ((i4 >> 3) & 14) | 1572864 | (i4 & 896) | (i4 & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function33 = function37;
                            function23 = function25;
                            f3 = m2202getScrollableTabRowPaddingD9Ej5fM;
                            modifier2 = modifier3;
                            j5 = j7;
                            j6 = j8;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            function33 = function32;
                            function23 = function2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ScrollableTabRow_sKfQg0A$lambda$1;
                                    ScrollableTabRow_sKfQg0A$lambda$1 = TabRowKt.ScrollableTabRow_sKfQg0A$lambda$1(i, modifier2, j5, j6, f3, function33, function23, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return ScrollableTabRow_sKfQg0A$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
