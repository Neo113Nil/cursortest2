package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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

/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aw\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u008d\u0001\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00172\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010#\u001aO\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172&\u0010\u0010\u001a\"\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b+\u0010,\u001a?\u0010-\u001a\u00020\u00012\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u000e2\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019¢\u0006\u0002\b\u000e2\b\b\u0001\u0010.\u001a\u00020'H\u0003¢\u0006\u0002\u0010/\u001a#\u00100\u001a\u000201*\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108\u001a5\u00109\u001a\u000201*\u0002022\u0006\u0010:\u001a\u0002042\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\b\u0001\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b;\u0010<\"\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020'0>X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010?\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010A\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010B\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010C\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010D\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010E\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u000e\u0010F\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G²\u0006\n\u0010*\u001a\u00020'X\u008a\u0084\u0002"}, d2 = {"NavigationRail", "", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/ui/unit/Dp;", "header", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationRail-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRailItem", "selected", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "icon", ViewProps.ENABLED, "label", "alwaysShowLabel", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "unselectedContentColor", "NavigationRailItem-0S3VyRs", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "NavigationRailTransition", "activeColor", "inactiveColor", "", "Lkotlin/ParameterName;", "name", "animationProgress", "NavigationRailTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "NavigationRailItemBaselineLayout", "iconPositionAnimationProgress", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "placeIcon", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "iconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placeIcon-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "placeLabelAndIcon", "labelPlaceable", "placeLabelAndIcon-DIyivk0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "NavigationRailAnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "NavigationRailItemSize", "F", "NavigationRailItemCompactSize", "NavigationRailPadding", "HeaderPadding", "ItemLabelBaselineBottomOffset", "ItemIconTopOffset", "ZeroInsets", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailKt {
    private static final float HeaderPadding;
    private static final float NavigationRailPadding;
    private static final TweenSpec<Float> NavigationRailAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float NavigationRailItemSize = Dp.m8401constructorimpl(72);
    private static final float NavigationRailItemCompactSize = Dp.m8401constructorimpl(56);
    private static final float ItemLabelBaselineBottomOffset = Dp.m8401constructorimpl(16);
    private static final float ItemIconTopOffset = Dp.m8401constructorimpl(14);
    private static final WindowInsets ZeroInsets = WindowInsetsKt.m916WindowInsetsa9UjIt4$default(Dp.m8401constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationRailItemBaselineLayout$lambda$11(Function2 function2, Function2 function22, float f, int i, Composer composer, int i2) {
        NavigationRailItemBaselineLayout(function2, function22, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationRailItem_0S3VyRs$lambda$4(boolean z, Function0 function0, Function2 function2, Modifier modifier, boolean z2, Function2 function22, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, int i, int i2, Composer composer, int i3) {
        m2074NavigationRailItem0S3VyRs(z, function0, function2, modifier, z2, function22, z3, mutableInteractionSource, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationRailTransition_Klgx_Pg$lambda$6(long j, long j2, boolean z, Function3 function3, int i, Composer composer, int i2) {
        m2075NavigationRailTransitionKlgxPg(j, j2, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationRail_HsRjFd4$lambda$1(Modifier modifier, long j, long j2, float f, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        m2072NavigationRailHsRjFd4(modifier, j, j2, f, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationRail_afqeVBk$lambda$0(WindowInsets windowInsets, Modifier modifier, long j, long j2, float f, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        m2073NavigationRailafqeVBk(windowInsets, modifier, j, j2, f, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0082  */
    /* renamed from: NavigationRail-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2073NavigationRailafqeVBk(final WindowInsets windowInsets, Modifier modifier, long j, long j2, float f, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        int i4;
        float f2;
        int i5;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33;
        Composer composer2;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final float f3;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        ScopeUpdateScope endRestartGroup;
        float f4;
        long j7;
        long j8;
        Modifier modifier3;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-171916405);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRail)N(windowInsets,modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp,header,content)114@5148L442,109@5003L587:NavigationRail.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(windowInsets) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function33 = function3;
                    i3 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "103@4758L6,104@4800L32");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            f4 = f2;
                            function34 = function33;
                            i6 = -171916405;
                            j7 = j3;
                            j8 = j4;
                            modifier3 = modifier;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 4) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            float m2069getElevationD9Ej5fM = i4 != 0 ? NavigationRailDefaults.INSTANCE.m2069getElevationD9Ej5fM() : f2;
                            if (i5 != 0) {
                                function34 = null;
                                f4 = m2069getElevationD9Ej5fM;
                                j7 = j3;
                            } else {
                                f4 = m2069getElevationD9Ej5fM;
                                j7 = j3;
                                function34 = function33;
                            }
                            j8 = j4;
                            modifier3 = companion;
                            i6 = -171916405;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:108)");
                        }
                        composer2 = startRestartGroup;
                        SurfaceKt.m2169SurfaceFjzlyU(modifier3, null, j7, j8, null, f4, ComposableLambdaKt.rememberComposableLambda(366031815, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                float f5;
                                float f6;
                                ComposerKt.sourceInformation(composer3, "C115@5158L426:NavigationRail.kt#jmzs0o");
                                if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(366031815, i9, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:115)");
                                }
                                Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets.this);
                                f5 = NavigationRailKt.NavigationRailPadding;
                                Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m839paddingVpY3zN4$default(windowInsetsPadding, 0.0f, f5, 1, null));
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Function3<ColumnScope, Composer, Integer, Unit> function35 = function34;
                                Function3<ColumnScope, Composer, Integer, Unit> function36 = function32;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
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
                                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, -1703433687, "C126@5565L9:NavigationRail.kt#jmzs0o");
                                if (function35 != null) {
                                    composer3.startReplaceGroup(-1703415150);
                                    ComposerKt.sourceInformation(composer3, "123@5475L8,124@5500L38");
                                    function35.invoke(columnScopeInstance, composer3, 6);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    f6 = NavigationRailKt.HeaderPadding;
                                    SpacerKt.Spacer(SizeKt.m875height3ABfNKs(companion2, f6), composer3, 6);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1703323855);
                                    composer3.endReplaceGroup();
                                }
                                function36.invoke(columnScopeInstance, composer3, 6);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
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
                        modifier2 = modifier3;
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        function34 = function33;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit NavigationRail_afqeVBk$lambda$0;
                                NavigationRail_afqeVBk$lambda$0 = NavigationRailKt.NavigationRail_afqeVBk$lambda$0(WindowInsets.this, modifier2, j5, j6, f3, function34, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return NavigationRail_afqeVBk$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                function33 = function3;
                if ((i2 & 64) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function33 = function3;
            if ((i2 & 64) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function33 = function3;
        if ((i2 & 64) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0087  */
    /* renamed from: NavigationRail-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2072NavigationRailHsRjFd4(Modifier modifier, long j, long j2, float f, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        ScopeUpdateScope endRestartGroup;
        float f4;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function35;
        int i5;
        Modifier modifier4;
        long j7;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-2116369751);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRail)N(modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp,header,content)173@7644L95:NavigationRail.kt#jmzs0o");
        int i9 = i2 & 1;
        if (i9 != 0) {
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
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function33 = function3;
                i3 |= startRestartGroup.changedInstance(function33) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "167@7399L6,168@7441L32");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            f4 = f2;
                            function35 = function33;
                            i6 = 6;
                            i5 = -2116369751;
                            modifier4 = modifier2;
                            j7 = j3;
                        } else {
                            Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                long m1957getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                                i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                j3 = m1957getSurface0d7_KjU;
                            }
                            if ((i2 & 4) != 0) {
                                long m1971contentColorForek8zF_U = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                                j4 = m1971contentColorForek8zF_U;
                            }
                            if (i10 != 0) {
                                f2 = NavigationRailDefaults.INSTANCE.m2069getElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                function35 = null;
                                j7 = j3;
                                f4 = f2;
                                i5 = -2116369751;
                                modifier4 = companion;
                            } else {
                                f4 = f2;
                                function35 = function33;
                                i5 = -2116369751;
                                modifier4 = companion;
                                j7 = j3;
                            }
                            i6 = 6;
                        }
                        long j8 = j4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i5, i3, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:172)");
                        }
                        int i11 = i3 << 3;
                        composer2 = startRestartGroup;
                        m2073NavigationRailafqeVBk(ZeroInsets, modifier4, j7, j8, f4, function35, function32, composer2, i6 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                        function34 = function35;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        function34 = function33;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit NavigationRail_HsRjFd4$lambda$1;
                                NavigationRail_HsRjFd4$lambda$1 = NavigationRailKt.NavigationRail_HsRjFd4$lambda$1(Modifier.this, j5, j6, f3, function34, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return NavigationRail_HsRjFd4$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function33 = function3;
            if ((i2 & 32) != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function33 = function3;
        if ((i2 & 32) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: NavigationRailItem-0S3VyRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2074NavigationRailItem0S3VyRs(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z3, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        int i7;
        final boolean z5;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final long j3;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        MutableInteractionSource mutableInteractionSource3;
        long j5;
        int i12;
        long j6;
        Composer startRestartGroup = composer.startRestartGroup(83562179);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItem)N(selected,onClick,icon,modifier,enabled,label,alwaysShowLabel,interactionSource,selectedContentColor:c#ui.graphics.Color,unselectedContentColor:c#ui.graphics.Color)227@10507L773:NavigationRail.kt#jmzs0o");
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
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function23 = function22;
                        i3 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            z5 = z3;
                            i3 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                            i8 = i2 & 128;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                if ((i & 100663296) == 0) {
                                    i10 = i3 | (((i2 & 256) == 0 && startRestartGroup.changed(j)) ? 67108864 : 33554432);
                                } else {
                                    i10 = i3;
                                }
                                if ((i & 805306368) == 0) {
                                    i10 |= ((i2 & 512) == 0 && startRestartGroup.changed(j2)) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                }
                                i11 = i10;
                                if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "209@9518L6,210@9588L7,210@9622L6");
                                    ComposableLambda composableLambda = null;
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i4 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            z4 = true;
                                        }
                                        if (i6 != 0) {
                                            function23 = null;
                                        }
                                        if (i7 != 0) {
                                            z5 = true;
                                        }
                                        mutableInteractionSource3 = i9 != 0 ? null : mutableInteractionSource;
                                        if ((i2 & 256) != 0) {
                                            j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1953getPrimary0d7_KjU();
                                            i12 = i11 & (-234881025);
                                        } else {
                                            j5 = j;
                                            i12 = i11;
                                        }
                                        if ((i2 & 512) != 0) {
                                            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localContentColor);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            j6 = Color.m5656copywmQWz5c$default(((Color) consume).m5667unboximpl(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                            i12 &= -1879048193;
                                        } else {
                                            j6 = j2;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        int i13 = (i2 & 256) != 0 ? i11 & (-234881025) : i11;
                                        if ((i2 & 512) != 0) {
                                            i13 &= -1879048193;
                                        }
                                        j5 = j;
                                        j6 = j2;
                                        i12 = i13;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(83562179, i12, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:211)");
                                    }
                                    if (function23 == null) {
                                        startRestartGroup.startReplaceGroup(-1679605042);
                                    } else {
                                        startRestartGroup.startReplaceGroup(-1679605041);
                                        ComposerKt.sourceInformation(startRestartGroup, "*214@9729L168");
                                        composableLambda = ComposableLambdaKt.rememberComposableLambda(-674640273, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i14) {
                                                ComposerKt.sourceInformation(composer3, "C215@9773L10,216@9843L40:NavigationRail.kt#jmzs0o");
                                                if (!composer3.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-674640273, i14, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:215)");
                                                }
                                                TextKt.ProvideTextStyle(TextStyle.m7848copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getCaption(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m8257getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function23, composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54);
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    final ComposableLambda composableLambda2 = composableLambda;
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                    boolean z7 = z4;
                                    Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(SelectableKt.m1164selectableO2vRcR0(modifier2, z, mutableInteractionSource4, RippleKt.m2121rippleH2RKhps$default(false, 0.0f, j5, 2, null), z7, Role.m7575boximpl(Role.INSTANCE.m7589getTabo7Vup1c()), function0), function23 == null ? NavigationRailItemCompactSize : NavigationRailItemSize);
                                    Alignment center = Alignment.INSTANCE.getCenter();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m889size3ABfNKs);
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
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 415492902, "C240@10971L303,240@10890L384:NavigationRail.kt#jmzs0o");
                                    int i14 = i12 >> 24;
                                    m2075NavigationRailTransitionKlgxPg(j5, j6, z, ComposableLambdaKt.rememberComposableLambda(317431928, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$1$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer3, Integer num) {
                                            invoke(f.floatValue(), composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(float f, Composer composer3, int i15) {
                                            ComposerKt.sourceInformation(composer3, "CN(progress)244@11084L180:NavigationRail.kt#jmzs0o");
                                            if ((i15 & 6) == 0) {
                                                i15 |= composer3.changed(f) ? 4 : 2;
                                            }
                                            if (!composer3.shouldExecute((i15 & 19) != 18, i15 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(317431928, i15, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:242)");
                                            }
                                            if (z5) {
                                                f = 1.0f;
                                            }
                                            NavigationRailKt.NavigationRailItemBaselineLayout(function2, composableLambda2, f, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i14 & 112) | (i14 & 14) | 3072 | ((i12 << 6) & 896));
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
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    function24 = function23;
                                    z6 = z7;
                                    j4 = j6;
                                    j3 = j5;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z6 = z4;
                                    function24 = function23;
                                    j3 = j;
                                    j4 = j2;
                                }
                                final Modifier modifier3 = modifier2;
                                final boolean z8 = z5;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit NavigationRailItem_0S3VyRs$lambda$4;
                                            NavigationRailItem_0S3VyRs$lambda$4 = NavigationRailKt.NavigationRailItem_0S3VyRs$lambda$4(z, function0, function2, modifier3, z6, function24, z8, mutableInteractionSource2, j3, j4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return NavigationRailItem_0S3VyRs$lambda$4;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i9 = i8;
                            if ((i & 100663296) == 0) {
                            }
                            if ((i & 805306368) == 0) {
                            }
                            i11 = i10;
                            if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                            }
                            final Modifier modifier32 = modifier2;
                            final boolean z82 = z5;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z5 = z3;
                        i8 = i2 & 128;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        if ((i & 100663296) == 0) {
                        }
                        if ((i & 805306368) == 0) {
                        }
                        i11 = i10;
                        if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                        }
                        final Modifier modifier322 = modifier2;
                        final boolean z822 = z5;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function23 = function22;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    z5 = z3;
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    i11 = i10;
                    if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                    }
                    final Modifier modifier3222 = modifier2;
                    final boolean z8222 = z5;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function23 = function22;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                z5 = z3;
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i11 = i10;
                if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                }
                final Modifier modifier32222 = modifier2;
                final boolean z82222 = z5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function23 = function22;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            z5 = z3;
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i11 = i10;
            if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
            }
            final Modifier modifier322222 = modifier2;
            final boolean z822222 = z5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function23 = function22;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        z5 = z3;
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i11 = i10;
        if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
        }
        final Modifier modifier3222222 = modifier2;
        final boolean z8222222 = z5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: NavigationRailTransition-Klgx-Pg, reason: not valid java name */
    private static final void m2075NavigationRailTransitionKlgxPg(final long j, final long j2, final boolean z, final Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(140356545);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailTransition)N(activeColor:c#ui.graphics.Color,inactiveColor:c#ui.graphics.Color,selected,content)287@12657L139,297@13010L42,294@12871L181:NavigationRail.kt#jmzs0o");
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
                ComposerKt.traceEventStart(140356545, i2, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:285)");
            }
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, NavigationRailAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m5708lerpjxsXWHM = ColorKt.m5708lerpjxsXWHM(j2, j, NavigationRailTransition_Klgx_Pg$lambda$5(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(Color.m5656copywmQWz5c$default(m5708lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m5659getAlphaimpl(m5708lerpjxsXWHM)))}, ComposableLambdaKt.rememberComposableLambda(1330097921, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    float NavigationRailTransition_Klgx_Pg$lambda$5;
                    ComposerKt.sourceInformation(composer2, "C298@13020L26:NavigationRail.kt#jmzs0o");
                    if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1330097921, i3, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:298)");
                    }
                    Function3<Float, Composer, Integer, Unit> function32 = function3;
                    NavigationRailTransition_Klgx_Pg$lambda$5 = NavigationRailKt.NavigationRailTransition_Klgx_Pg$lambda$5(animateFloatAsState);
                    function32.invoke(Float.valueOf(NavigationRailTransition_Klgx_Pg$lambda$5), composer2, 0);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NavigationRailTransition_Klgx_Pg$lambda$6;
                    NavigationRailTransition_Klgx_Pg$lambda$6 = NavigationRailKt.NavigationRailTransition_Klgx_Pg$lambda$6(j, j2, z, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                    return NavigationRailTransition_Klgx_Pg$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationRailItemBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final float f, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1276874318);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationRailItemBaselineLayout)N(icon,label,iconPositionAnimationProgress)323@13918L928,318@13720L1126:NavigationRail.kt#jmzs0o");
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
                ComposerKt.traceEventStart(-1276874318, i2, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:317)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1284441170, "CC(remember):NavigationRail.kt#9igjgp");
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo47measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        Placeable placeable;
                        MeasureResult m2079placeLabelAndIconDIyivk0;
                        MeasureResult m2078placeIcon3p2s80s;
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
                                    m2078placeIcon3p2s80s = NavigationRailKt.m2078placeIcon3p2s80s(measureScope, mo7075measureBRTryo0, j);
                                    return m2078placeIcon3p2s80s;
                                }
                                Intrinsics.checkNotNull(placeable);
                                m2079placeLabelAndIconDIyivk0 = NavigationRailKt.m2079placeLabelAndIconDIyivk0(measureScope, placeable, mo7075measureBRTryo0, j, f);
                                return m2079placeLabelAndIconDIyivk0;
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1177287557, "C319@13737L41:NavigationRail.kt#jmzs0o");
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -491319352, "C319@13770L6:NavigationRail.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (function22 != null) {
                startRestartGroup.startReplaceGroup(-1177221249);
                ComposerKt.sourceInformation(startRestartGroup, "321@13820L80");
                Modifier alpha = AlphaKt.alpha(LayoutIdKt.layoutId(Modifier.INSTANCE, "label"), f);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, alpha);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1391280638, "C321@13891L7:NavigationRail.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1177121305);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.NavigationRailKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NavigationRailItemBaselineLayout$lambda$11;
                    NavigationRailItemBaselineLayout$lambda$11 = NavigationRailKt.NavigationRailItemBaselineLayout$lambda$11(Function2.this, function22, f, i, (Composer) obj, ((Integer) obj2).intValue());
                    return NavigationRailItemBaselineLayout$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m2078placeIcon3p2s80s(MeasureScope measureScope, final Placeable placeable, long j) {
        final int max = Math.max(0, (Constraints.m8354getMaxWidthimpl(j) - placeable.getWidth()) / 2);
        final int max2 = Math.max(0, (Constraints.m8353getMaxHeightimpl(j) - placeable.getHeight()) / 2);
        return MeasureScope.layout$default(measureScope, Constraints.m8354getMaxWidthimpl(j), Constraints.m8353getMaxHeightimpl(j), null, new Function1() { // from class: androidx.compose.material.NavigationRailKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit placeIcon_3p2s80s$lambda$12;
                placeIcon_3p2s80s$lambda$12 = NavigationRailKt.placeIcon_3p2s80s$lambda$12(Placeable.this, max, max2, (Placeable.PlacementScope) obj);
                return placeIcon_3p2s80s$lambda$12;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit placeIcon_3p2s80s$lambda$12(Placeable placeable, int i, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m2079placeLabelAndIconDIyivk0(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j, final float f) {
        final int m8353getMaxHeightimpl = (Constraints.m8353getMaxHeightimpl(j) - placeable.get(AlignmentLineKt.getLastBaseline())) - measureScope.mo418roundToPx0680j_4(ItemLabelBaselineBottomOffset);
        final int m8354getMaxWidthimpl = (Constraints.m8354getMaxWidthimpl(j) - placeable.getWidth()) / 2;
        final int i = measureScope.mo418roundToPx0680j_4(ItemIconTopOffset);
        int m8353getMaxHeightimpl2 = (Constraints.m8353getMaxHeightimpl(j) - placeable2.getHeight()) / 2;
        final int m8354getMaxWidthimpl2 = (Constraints.m8354getMaxWidthimpl(j) - placeable2.getWidth()) / 2;
        final int roundToInt = MathKt.roundToInt((m8353getMaxHeightimpl2 - i) * (1 - f));
        return MeasureScope.layout$default(measureScope, Constraints.m8354getMaxWidthimpl(j), Constraints.m8353getMaxHeightimpl(j), null, new Function1() { // from class: androidx.compose.material.NavigationRailKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit placeLabelAndIcon_DIyivk0$lambda$13;
                placeLabelAndIcon_DIyivk0$lambda$13 = NavigationRailKt.placeLabelAndIcon_DIyivk0$lambda$13(f, placeable, m8354getMaxWidthimpl, m8353getMaxHeightimpl, roundToInt, placeable2, m8354getMaxWidthimpl2, i, (Placeable.PlacementScope) obj);
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
        float f = 8;
        NavigationRailPadding = Dp.m8401constructorimpl(f);
        HeaderPadding = Dp.m8401constructorimpl(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavigationRailTransition_Klgx_Pg$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }
}
