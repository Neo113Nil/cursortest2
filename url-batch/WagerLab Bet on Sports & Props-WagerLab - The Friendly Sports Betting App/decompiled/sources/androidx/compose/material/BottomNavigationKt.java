package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.branch.referral.BranchError;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: BottomNavigation.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0091\u0001\u0010\u0014\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00162\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0018¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\"\u001aO\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162&\u0010\u000b\u001a\"\u0012\u0013\u0012\u00110&¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b*\u0010+\u001a?\u0010,\u001a\u00020\u00012\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0002\b\u000e2\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0018¢\u0006\u0002\b\u000e2\b\b\u0001\u0010-\u001a\u00020&H\u0003¢\u0006\u0002\u0010.\u001a#\u0010/\u001a\u000200*\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107\u001a5\u00108\u001a\u000200*\u0002012\u0006\u00109\u001a\u0002032\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\b\u0001\u0010-\u001a\u00020&H\u0002¢\u0006\u0004\b:\u0010;\"\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020&0=X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010>\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010?\"\u0010\u0010@\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010?\"\u0010\u0010A\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010?\"\u000e\u0010B\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C²\u0006\n\u0010)\u001a\u00020&X\u008a\u0084\u0002"}, d2 = {"BottomNavigation", "", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/ui/unit/Dp;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomNavigation-_UMDTes", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigationItem", "selected", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "icon", ViewProps.ENABLED, "label", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "BottomNavigationTransition", "activeColor", "inactiveColor", "", "Lkotlin/ParameterName;", "name", "animationProgress", "BottomNavigationTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "BottomNavigationItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "BottomNavigationAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "BottomNavigationHeight", "F", "BottomNavigationItemHorizontalPadding", "CombinedItemTextBaseline", "ZeroInsets", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomNavigationKt {
    private static final TweenSpec<Float> BottomNavigationAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float BottomNavigationHeight = Dp.m8401constructorimpl(56);
    private static final float BottomNavigationItemHorizontalPadding;
    private static final float CombinedItemTextBaseline;
    private static final WindowInsets ZeroInsets;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationItemBaselineLayout$lambda$11(Function2 function2, Function2 function22, float f, int i, Composer composer, int i2) {
        BottomNavigationItemBaselineLayout(function2, function22, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationItem_jY6E1Zs$lambda$4(RowScope rowScope, boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m1898BottomNavigationItemjY6E1Zs(rowScope, z, function0, function2, modifier, z2, function22, z3, mutableInteractionSource, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationTransition_Klgx_Pg$lambda$6(long j, long j2, boolean z, Function3 function3, int i, Composer composer, int i2) {
        m1899BottomNavigationTransitionKlgxPg(j, j2, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigation_PEIptTM$lambda$1(Modifier modifier, long j, long j2, float f, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1896BottomNavigationPEIptTM(modifier, j, j2, f, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigation__UMDTes$lambda$0(WindowInsets windowInsets, Modifier modifier, long j, long j2, float f, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1897BottomNavigation_UMDTes(windowInsets, modifier, j, j2, f, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0060  */
    /* renamed from: BottomNavigation-_UMDTes, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1897BottomNavigation_UMDTes(final WindowInsets windowInsets, Modifier modifier, long j, long j2, float f, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        int i4;
        float f2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        float m1891getElevationD9Ej5fM;
        long j7;
        long j8;
        Modifier modifier4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-636542119);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigation)N(windowInsets,modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp,content)112@4927L314,107@4782L459:BottomNavigation.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(windowInsets) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    j3 = j;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    j4 = j2;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "102@4589L6,103@4638L32");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            j4 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            m1891getElevationD9Ej5fM = BottomNavigationDefaults.INSTANCE.m1891getElevationD9Ej5fM();
                            j7 = j3;
                            j8 = j4;
                            modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-636542119, i3, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:106)");
                            }
                            composer2 = startRestartGroup;
                            SurfaceKt.m2169SurfaceFjzlyU(modifier4, null, j7, j8, null, m1891getElevationD9Ej5fM, ComposableLambdaKt.rememberComposableLambda(807373717, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    float f4;
                                    ComposerKt.sourceInformation(composer3, "C113@4937L298:BottomNavigation.kt#jmzs0o");
                                    if (!composer3.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(807373717, i8, -1, "androidx.compose.material.BottomNavigation.<anonymous> (BottomNavigation.kt:113)");
                                    }
                                    Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets.this);
                                    f4 = BottomNavigationKt.BottomNavigationHeight;
                                    Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m874defaultMinSizeVpY3zN4$default(windowInsetsPadding, 0.0f, f4, 1, null));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer3, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, selectableGroup);
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
                                    Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 1572864 | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            j5 = j7;
                            j6 = j8;
                            f3 = m1891getElevationD9Ej5fM;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    j8 = j4;
                    m1891getElevationD9Ej5fM = f2;
                    modifier4 = modifier2;
                    j7 = j3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    SurfaceKt.m2169SurfaceFjzlyU(modifier4, null, j7, j8, null, m1891getElevationD9Ej5fM, ComposableLambdaKt.rememberComposableLambda(807373717, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            float f4;
                            ComposerKt.sourceInformation(composer3, "C113@4937L298:BottomNavigation.kt#jmzs0o");
                            if (!composer3.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(807373717, i8, -1, "androidx.compose.material.BottomNavigation.<anonymous> (BottomNavigation.kt:113)");
                            }
                            Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets.this);
                            f4 = BottomNavigationKt.BottomNavigationHeight;
                            Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m874defaultMinSizeVpY3zN4$default(windowInsetsPadding, 0.0f, f4, 1, null));
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer3, 6);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, selectableGroup);
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
                            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 1572864 | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    j5 = j7;
                    j6 = j8;
                    f3 = m1891getElevationD9Ej5fM;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BottomNavigation__UMDTes$lambda$0;
                            BottomNavigation__UMDTes$lambda$0 = BottomNavigationKt.BottomNavigation__UMDTes$lambda$0(WindowInsets.this, modifier3, j5, j6, f3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BottomNavigation__UMDTes$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if ((i2 & 32) != 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i2 & 32) != 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0085  */
    /* renamed from: BottomNavigation-PEIptTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1896BottomNavigationPEIptTM(Modifier modifier, long j, long j2, float f, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i4;
        long j7;
        float f4;
        long j8;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(783675913);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigation)N(modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp,content)162@6934L89:BottomNavigation.kt#jmzs0o");
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
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                j3 = j;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "157@6741L6,158@6790L32");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        f4 = f2;
                        i4 = 6;
                        j8 = j3;
                        j7 = j4;
                        modifier4 = modifier2;
                    } else {
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                            i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i7 != 0) {
                            modifier4 = companion;
                            i4 = 6;
                            j7 = j4;
                            f4 = BottomNavigationDefaults.INSTANCE.m1891getElevationD9Ej5fM();
                        } else {
                            modifier4 = companion;
                            i4 = 6;
                            j7 = j4;
                            f4 = f2;
                        }
                        j8 = j3;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(783675913, i3, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:161)");
                    }
                    int i8 = i3 << 3;
                    composer2 = startRestartGroup;
                    m1897BottomNavigation_UMDTes(ZeroInsets, modifier4, j8, j7, f4, function3, composer2, i4 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j5 = j8;
                    j6 = j7;
                    f3 = f4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BottomNavigation_PEIptTM$lambda$1;
                            BottomNavigation_PEIptTM$lambda$1 = BottomNavigationKt.BottomNavigation_PEIptTM$lambda$1(Modifier.this, j5, j6, f3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BottomNavigation_PEIptTM$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        if ((i2 & 16) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: BottomNavigationItem-jY6E1Zs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1898BottomNavigationItemjY6E1Zs(final RowScope rowScope, final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        Function0<Unit> function02;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final boolean z6;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z7;
        final long j3;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final boolean z8;
        MutableInteractionSource mutableInteractionSource3;
        long j5;
        long j6;
        int i14;
        Modifier modifier4;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1744464261);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigationItem)N(selected,onClick,icon,modifier,enabled,label,alwaysShowLabel,interactionSource,selectedContentColor:c#ui.graphics.Color,unselectedContentColor:c#ui.graphics.Color)221@10008L773:BottomNavigation.kt#jmzs0o");
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z;
            i4 |= startRestartGroup.changed(z4) ? 32 : 16;
            if ((i3 & 2) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i4 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if ((i3 & 4) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                i5 = i3 & 8;
                if (i5 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    i6 = i3 & 16;
                    if (i6 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        z5 = z2;
                        i4 |= startRestartGroup.changed(z5) ? 131072 : 65536;
                        i7 = i3 & 32;
                        if (i7 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : 33554432;
                        }
                        if ((i & 805306368) == 0) {
                            if ((i3 & 256) == 0) {
                                i10 = i9;
                                if (startRestartGroup.changed(j)) {
                                    i15 = C.BUFFER_FLAG_LAST_SAMPLE;
                                    i4 |= i15;
                                }
                            } else {
                                i10 = i9;
                            }
                            i15 = 268435456;
                            i4 |= i15;
                        } else {
                            i10 = i9;
                        }
                        if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (((i3 & 512) == 0 && startRestartGroup.changed(j2)) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        i13 = i12;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "206@9325L7,207@9417L6");
                            ComposableLambda composableLambda = null;
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 256) != 0) {
                                    i4 &= -1879048193;
                                }
                                if ((i3 & 512) != 0) {
                                    function24 = function22;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    j5 = j;
                                    j6 = j2;
                                    i14 = i13 & (-15);
                                } else {
                                    function24 = function22;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    j5 = j;
                                    j6 = j2;
                                    i14 = i13;
                                }
                                companion = modifier2;
                                z8 = z3;
                            } else {
                                companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i6 != 0) {
                                    z5 = true;
                                }
                                function24 = i7 != 0 ? null : function22;
                                z8 = i8 != 0 ? true : z3;
                                mutableInteractionSource3 = i11 != 0 ? null : mutableInteractionSource;
                                if ((i3 & 256) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j5 = ((Color) consume).m5667unboximpl();
                                    i4 &= -1879048193;
                                } else {
                                    j5 = j;
                                }
                                if ((i3 & 512) != 0) {
                                    j6 = Color.m5656copywmQWz5c$default(j5, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i14 = i13 & (-15);
                                } else {
                                    j6 = j2;
                                    i14 = i13;
                                }
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1744464261, i4, i14, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:208)");
                            }
                            if (function24 == null) {
                                startRestartGroup.startReplaceGroup(-229962826);
                                startRestartGroup.endReplaceGroup();
                                modifier4 = companion;
                            } else {
                                startRestartGroup.startReplaceGroup(-229962825);
                                ComposerKt.sourceInformation(startRestartGroup, "*211@9524L168");
                                modifier4 = companion;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(2120789583, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i16) {
                                        ComposerKt.sourceInformation(composer3, "C212@9568L10,213@9638L40:BottomNavigation.kt#jmzs0o");
                                        if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2120789583, i16, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:212)");
                                        }
                                        TextKt.ProvideTextStyle(TextStyle.m7848copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getCaption(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m8257getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function24, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            }
                            final ComposableLambda composableLambda2 = composableLambda;
                            Modifier modifier5 = modifier4;
                            Modifier weight$default = RowScope.weight$default(rowScope, SelectableKt.m1164selectableO2vRcR0(modifier5, z4, mutableInteractionSource3, RippleKt.m2121rippleH2RKhps$default(false, 0.0f, j5, 2, null), z5, Role.m7575boximpl(Role.INSTANCE.m7589getTabo7Vup1c()), function02), 1.0f, false, 2, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            int i16 = i14;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642075038, "C234@10470L305,234@10387L388:BottomNavigation.kt#jmzs0o");
                            m1899BottomNavigationTransitionKlgxPg(j5, j6, z, ComposableLambdaKt.rememberComposableLambda(2011119551, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer3, Integer num) {
                                    invoke(f.floatValue(), composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(float f, Composer composer3, int i17) {
                                    ComposerKt.sourceInformation(composer3, "CN(progress)238@10583L182:BottomNavigation.kt#jmzs0o");
                                    if ((i17 & 6) == 0) {
                                        i17 |= composer3.changed(f) ? 4 : 2;
                                    }
                                    if (!composer3.shouldExecute((i17 & 19) != 18, i17 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2011119551, i17, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:236)");
                                    }
                                    if (z8) {
                                        f = 1.0f;
                                    }
                                    BottomNavigationKt.BottomNavigationItemBaselineLayout(function2, composableLambda2, f, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, ((i4 >> 27) & 14) | 3072 | ((i16 << 3) & 112) | ((i4 << 3) & 896));
                            composer2 = startRestartGroup;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            function23 = function24;
                            z6 = z8;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z7 = z5;
                            j4 = j6;
                            j3 = j5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            function23 = function22;
                            z6 = z3;
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            z7 = z5;
                            j3 = j;
                            j4 = j2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BottomNavigationItem_jY6E1Zs$lambda$4;
                                    BottomNavigationItem_jY6E1Zs$lambda$4 = BottomNavigationKt.BottomNavigationItem_jY6E1Zs$lambda$4(RowScope.this, z, function0, function2, modifier3, z7, function23, z6, mutableInteractionSource2, j3, j4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return BottomNavigationItem_jY6E1Zs$lambda$4;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z5 = z2;
                    i7 = i3 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    if ((i2 & 6) == 0) {
                    }
                    i13 = i12;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                modifier2 = modifier;
                i6 = i3 & 16;
                if (i6 == 0) {
                }
                z5 = z2;
                i7 = i3 & 32;
                if (i7 != 0) {
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) == 0) {
                }
                i13 = i12;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function02 = function0;
            if ((i3 & 4) != 0) {
            }
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            z5 = z2;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            i13 = i12;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z4 = z;
        if ((i3 & 2) == 0) {
        }
        function02 = function0;
        if ((i3 & 4) != 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        z5 = z2;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        i13 = i12;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: BottomNavigationTransition-Klgx-Pg, reason: not valid java name */
    private static final void m1899BottomNavigationTransitionKlgxPg(final long j, final long j2, final boolean z, final Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(616920545);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigationTransition)N(activeColor:c#ui.graphics.Color,inactiveColor:c#ui.graphics.Color,selected,content)281@12195L141,291@12550L42,288@12411L181:BottomNavigation.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(616920545, i2, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:279)");
            }
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, BottomNavigationAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m5708lerpjxsXWHM = ColorKt.m5708lerpjxsXWHM(j2, j, BottomNavigationTransition_Klgx_Pg$lambda$5(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(Color.m5656copywmQWz5c$default(m5708lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m5659getAlphaimpl(m5708lerpjxsXWHM)))}, ComposableLambdaKt.rememberComposableLambda(343660833, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    float BottomNavigationTransition_Klgx_Pg$lambda$5;
                    ComposerKt.sourceInformation(composer2, "C292@12560L26:BottomNavigation.kt#jmzs0o");
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(343660833, i3, -1, "androidx.compose.material.BottomNavigationTransition.<anonymous> (BottomNavigation.kt:292)");
                    }
                    Function3<Float, Composer, Integer, Unit> function32 = function3;
                    BottomNavigationTransition_Klgx_Pg$lambda$5 = BottomNavigationKt.BottomNavigationTransition_Klgx_Pg$lambda$5(animateFloatAsState);
                    function32.invoke(Float.valueOf(BottomNavigationTransition_Klgx_Pg$lambda$5), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomNavigationTransition_Klgx_Pg$lambda$6;
                    BottomNavigationTransition_Klgx_Pg$lambda$6 = BottomNavigationKt.BottomNavigationTransition_Klgx_Pg$lambda$6(j, j2, z, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomNavigationTransition_Klgx_Pg$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomNavigationItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1481587758);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomNavigationItemBaselineLayout)N(icon,label,iconPositionAnimationProgress)323@13622L928,312@13264L1286:BottomNavigation.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1481587758, i2, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:311)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2123326130, "CC(remember):BottomNavigation.kt#9igjgp");
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo47measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        Placeable placeable;
                        MeasureResult m1903placeLabelAndIconDIyivk0;
                        MeasureResult m1902placeIcon3p2s80s;
                        List<? extends Measurable> list2 = list;
                        int size = list2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                                Placeable mo7075measureBRTryo0 = measurable.mo7075measureBRTryo0(j);
                                if (function22 != null) {
                                    int size2 = list2.size();
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        Measurable measurable2 = list.get(i4);
                                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "label")) {
                                            placeable = measurable2.mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                        }
                                    }
                                    ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                    throw new KotlinNothingValueException();
                                }
                                placeable = null;
                                if (function22 == null) {
                                    m1902placeIcon3p2s80s = BottomNavigationKt.m1902placeIcon3p2s80s(measureScope, mo7075measureBRTryo0, j);
                                    return m1902placeIcon3p2s80s;
                                }
                                Intrinsics.checkNotNull(placeable);
                                m1903placeLabelAndIconDIyivk0 = BottomNavigationKt.m1903placeLabelAndIconDIyivk0(measureScope, placeable, mo7075measureBRTryo0, j, f);
                                return m1903placeLabelAndIconDIyivk0;
                            }
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1977638459, "C313@13281L41:BottomNavigation.kt#jmzs0o");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "icon");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
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
            Composer m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -430660824, "C313@13314L6:BottomNavigation.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (function22 != null) {
                startRestartGroup.startReplaceGroup(1977704767);
                ComposerKt.sourceInformation(startRestartGroup, "315@13364L240");
                Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.INSTANCE, "label"), f), BottomNavigationItemHorizontalPadding, 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m839paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4976constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1599731230, "C320@13583L7:BottomNavigation.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1977958471);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomNavigationKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomNavigationItemBaselineLayout$lambda$11;
                    BottomNavigationItemBaselineLayout$lambda$11 = BottomNavigationKt.BottomNavigationItemBaselineLayout$lambda$11(Function2.this, function22, f, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomNavigationItemBaselineLayout$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1902placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j) {
        int m8370constrainHeightK40F9xA = ConstraintsKt.m8370constrainHeightK40F9xA(j, measureScope.mo418roundToPx0680j_4(BottomNavigationHeight));
        final int height = (m8370constrainHeightK40F9xA - placeable.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, placeable.getWidth(), m8370constrainHeightK40F9xA, null, new Function1() { // from class: androidx.compose.material.BottomNavigationKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit placeIcon_3p2s80s$lambda$12;
                placeIcon_3p2s80s$lambda$12 = BottomNavigationKt.placeIcon_3p2s80s$lambda$12(Placeable.this, height, (Placeable.PlacementScope) obj);
                return placeIcon_3p2s80s$lambda$12;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeIcon_3p2s80s$lambda$12(Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m1903placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j, final float f) {
        int i = measureScope.mo418roundToPx0680j_4(CombinedItemTextBaseline) - placeable.get(AlignmentLineKt.getFirstBaseline());
        int height = placeable2.getHeight() + placeable.getHeight() + i;
        int m8370constrainHeightK40F9xA = ConstraintsKt.m8370constrainHeightK40F9xA(j, Math.max(height, measureScope.mo418roundToPx0680j_4(BottomNavigationHeight)));
        final int coerceAtLeast = RangesKt.coerceAtLeast((m8370constrainHeightK40F9xA - height) / 2, 0);
        int height2 = (m8370constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        final int height3 = placeable2.getHeight() + coerceAtLeast + i;
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        final int width = (max - placeable.getWidth()) / 2;
        final int width2 = (max - placeable2.getWidth()) / 2;
        final int roundToInt = MathKt.roundToInt((height2 - coerceAtLeast) * (1 - f));
        return MeasureScope.layout$default(measureScope, max, m8370constrainHeightK40F9xA, null, new Function1() { // from class: androidx.compose.material.BottomNavigationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit placeLabelAndIcon_DIyivk0$lambda$13;
                placeLabelAndIcon_DIyivk0$lambda$13 = BottomNavigationKt.placeLabelAndIcon_DIyivk0$lambda$13(f, placeable, width, height3, roundToInt, placeable2, width2, coerceAtLeast, (Placeable.PlacementScope) obj);
                return placeLabelAndIcon_DIyivk0$lambda$13;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeLabelAndIcon_DIyivk0$lambda$13(float f, Placeable placeable, int i, int i2, int i3, Placeable placeable2, int i4, int i5, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        if (f == 0.0f) {
            placementScope2 = placementScope;
        } else {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2 + i3, 0.0f, 4, null);
            placementScope2 = placementScope;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, i4, i5 + i3, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    static {
        float f = 12;
        BottomNavigationItemHorizontalPadding = Dp.m8401constructorimpl(f);
        CombinedItemTextBaseline = Dp.m8401constructorimpl(f);
        float f2 = 0;
        ZeroInsets = WindowInsetsKt.m915WindowInsetsa9UjIt4(Dp.m8401constructorimpl(f2), Dp.m8401constructorimpl(f2), Dp.m8401constructorimpl(f2), Dp.m8401constructorimpl(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomNavigationTransition_Klgx_Pg$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }
}
