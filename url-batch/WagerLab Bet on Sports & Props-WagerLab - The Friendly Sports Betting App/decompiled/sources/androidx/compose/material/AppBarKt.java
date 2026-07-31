package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.branch.referral.BranchError;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0004¢\u0006\u0002\b\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00042\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0004¢\u0006\u0002\b\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0004¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0004¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001as\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0004¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b!\u0010\"\u001ak\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0004¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0082\b\u001a\u0019\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020&H\u0080\b\u001a,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0,2\u0006\u0010-\u001a\u00020&2\u0006\u0010*\u001a\u00020&2\u0006\u0010.\u001a\u00020&H\u0000\u001ag\u0010/\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00100\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u0004¢\u0006\u0002\b\rH\u0003¢\u0006\u0004\b1\u00102\"\u0010\u00103\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u00104\"\u0010\u00105\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u00104\"\u000e\u00106\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u00108\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u00104\"\u0010\u00109\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u00104\"\u000e\u0010:\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"TopAppBar", "", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "navigationIcon", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "elevation", "Landroidx/compose/ui/unit/Dp;", "TopAppBar-Rx1qByU", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "TopAppBar-afqeVBk", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "cutoutShape", "Landroidx/compose/ui/graphics/Shape;", "BottomAppBar-DanWW-k", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "square", "", "x", "calculateCutoutCircleYIntercept", "cutoutRadius", "verticalOffset", "calculateRoundedEdgeIntercept", "Lkotlin/Pair;", "controlPointX", "radius", "AppBar", "shape", "AppBar-HkEspTQ", "(JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AppBarHeight", "F", "AppBarHorizontalPadding", "TitleInsetWithoutIcon", "TitleIconModifier", "BottomAppBarCutoutOffset", "BottomAppBarRoundedEdgeRadius", "ZeroInsets", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m8401constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;
    private static final Modifier TitleIconModifier;
    private static final Modifier TitleInsetWithoutIcon;
    private static final WindowInsets ZeroInsets;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBar_HkEspTQ$lambda$6(long j, long j2, float f, PaddingValues paddingValues, Shape shape, WindowInsets windowInsets, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1865AppBarHkEspTQ(j, j2, f, paddingValues, shape, windowInsets, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBar_DanWW_k$lambda$4(WindowInsets windowInsets, Modifier modifier, long j, long j2, Shape shape, float f, PaddingValues paddingValues, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1866BottomAppBarDanWWk(windowInsets, modifier, j, j2, shape, f, paddingValues, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomAppBar_Y1yfwus$lambda$5(Modifier modifier, long j, long j2, Shape shape, float f, PaddingValues paddingValues, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1867BottomAppBarY1yfwus(modifier, j, j2, shape, f, paddingValues, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBar_HsRjFd4$lambda$3(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1868TopAppBarHsRjFd4(modifier, j, j2, f, paddingValues, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBar_Rx1qByU$lambda$0(Function2 function2, WindowInsets windowInsets, Modifier modifier, Function2 function22, Function3 function3, long j, long j2, float f, int i, int i2, Composer composer, int i3) {
        m1869TopAppBarRx1qByU(function2, windowInsets, modifier, function22, function3, j, j2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBar_afqeVBk$lambda$2(WindowInsets windowInsets, Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1870TopAppBarafqeVBk(windowInsets, modifier, j, j2, f, paddingValues, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBar_xWeB9_s$lambda$1(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, long j, long j2, float f, int i, int i2, Composer composer, int i3) {
        m1871TopAppBarxWeB9s(function2, modifier, function22, function3, j, j2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final float square(float f) {
        return f * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0086  */
    /* renamed from: TopAppBar-Rx1qByU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1869TopAppBarRx1qByU(final Function2<? super Composer, ? super Integer, Unit> function2, final WindowInsets windowInsets, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, long j, long j2, float f, Composer composer, final int i, final int i2) {
        int i3;
        WindowInsets windowInsets2;
        int i4;
        Modifier modifier2;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        long j3;
        int i7;
        int i8;
        Composer composer2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final long j4;
        final float f2;
        ScopeUpdateScope endRestartGroup;
        long j5;
        Modifier modifier4;
        int i9;
        long j6;
        float f3;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(138090236);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)N(title,windowInsets,modifier,navigationIcon,actions,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp)101@4667L1063,93@4484L1246:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            windowInsets2 = windowInsets;
            i3 |= startRestartGroup.changed(windowInsets2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function23 = function22;
                    i3 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function32 = function3;
                        i3 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                j3 = j;
                                if (startRestartGroup.changed(j3)) {
                                    i10 = 131072;
                                    i3 |= i10;
                                }
                            } else {
                                j3 = j;
                            }
                            i10 = 65536;
                            i3 |= i10;
                        } else {
                            j3 = j;
                        }
                        if ((1572864 & i) == 0) {
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                        }
                        i8 = i3;
                        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i8 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "89@4338L6,90@4387L32");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    function23 = null;
                                }
                                if (i6 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$269254275$material();
                                }
                                if ((i2 & 32) != 0) {
                                    j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                    i8 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    j5 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i8 >> 15) & 14);
                                    i8 &= -3670017;
                                } else {
                                    j5 = j2;
                                }
                                if (i7 != 0) {
                                    long j7 = j5;
                                    f3 = AppBarDefaults.INSTANCE.m1863getTopAppBarElevationD9Ej5fM();
                                    i9 = i8;
                                    j6 = j7;
                                    modifier4 = modifier2;
                                } else {
                                    modifier4 = modifier2;
                                    i9 = i8;
                                    j6 = j5;
                                    f3 = f;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i8 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i8 &= -3670017;
                                }
                                f3 = f;
                                modifier4 = modifier2;
                                i9 = i8;
                                j6 = j2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(138090236, i9, -1, "androidx.compose.material.TopAppBar (AppBar.kt:92)");
                            }
                            int i11 = i9 >> 15;
                            int i12 = i9 << 12;
                            composer2 = startRestartGroup;
                            m1865AppBarHkEspTQ(j3, j6, f3, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), windowInsets2, modifier4, ComposableLambdaKt.rememberComposableLambda(-2019867954, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope rowScope, Composer composer3, int i13) {
                                    int i14;
                                    Modifier modifier5;
                                    char c;
                                    Modifier modifier6;
                                    ComposerKt.sourceInformation(composer3, "C113@5056L345,122@5476L6,122@5484L240,122@5411L313:AppBar.kt#jmzs0o");
                                    if ((i13 & 6) == 0) {
                                        i14 = i13 | (composer3.changed(rowScope) ? 4 : 2);
                                    } else {
                                        i14 = i13;
                                    }
                                    if (!composer3.shouldExecute((i14 & 19) != 18, i14 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2019867954, i14, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:102)");
                                    }
                                    if (function23 == null) {
                                        composer3.startReplaceGroup(-1394361313);
                                        ComposerKt.sourceInformation(composer3, "103@4719L29");
                                        modifier6 = AppBarKt.TitleInsetWithoutIcon;
                                        SpacerKt.Spacer(modifier6, composer3, 6);
                                        composer3.endReplaceGroup();
                                        c = 6;
                                    } else {
                                        composer3.startReplaceGroup(-1394295686);
                                        ComposerKt.sourceInformation(composer3, "105@4778L258");
                                        modifier5 = AppBarKt.TitleIconModifier;
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function2<Composer, Integer, Unit> function25 = function23;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, modifier5);
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
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2031468274, "C107@4953L4,106@4867L155:AppBar.kt#jmzs0o");
                                        c = 6;
                                        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer3, 6))), function25, composer3, ProvidedValue.$stable);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endReplaceGroup();
                                    }
                                    Modifier weight$default = RowScope.weight$default(rowScope, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                    final Function2<Composer, Integer, Unit> function26 = function2;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, weight$default);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer3);
                                    Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -297206295, "C114@5198L10,114@5213L178,114@5159L232:AppBar.kt#jmzs0o");
                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer3, 6).getH6(), ComposableLambdaKt.rememberComposableLambda(1206983395, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i15) {
                                            ComposerKt.sourceInformation(composer4, "C116@5317L4,115@5231L146:AppBar.kt#jmzs0o");
                                            if (!composer4.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1206983395, i15, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:115)");
                                            }
                                            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6))), function26, composer4, ProvidedValue.$stable);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 48);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)));
                                    final Function3<RowScope, Composer, Integer, Unit> function34 = function32;
                                    CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-1033635954, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i15) {
                                            ComposerKt.sourceInformation(composer4, "C123@5498L216:AppBar.kt#jmzs0o");
                                            if (!composer4.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1033635954, i15, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous> (AppBar.kt:123)");
                                            }
                                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                            Function3<RowScope, Composer, Integer, Unit> function35 = function34;
                                            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer4, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, fillMaxHeight$default);
                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor3);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer4);
                                            Updater.m4983setimpl(m4976constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                m4976constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                m4976constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            function35.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), composer2, (i11 & 896) | (i11 & 14) | 12610560 | (i11 & 112) | (458752 & i12) | (i12 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function24 = function23;
                            function33 = function32;
                            j4 = j6;
                            f2 = f3;
                            modifier3 = modifier4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            function24 = function23;
                            function33 = function32;
                            j4 = j2;
                            f2 = f;
                        }
                        final long j8 = j3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TopAppBar_Rx1qByU$lambda$0;
                                    TopAppBar_Rx1qByU$lambda$0 = AppBarKt.TopAppBar_Rx1qByU$lambda$0(Function2.this, windowInsets, modifier3, function24, function33, j8, j4, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return TopAppBar_Rx1qByU$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function32 = function3;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i3;
                    if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i8 & 1)) {
                    }
                    final long j82 = j3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function22;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function32 = function3;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i3;
                if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i8 & 1)) {
                }
                final long j822 = j3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function23 = function22;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function32 = function3;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i3;
            if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i8 & 1)) {
            }
            final long j8222 = j3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        windowInsets2 = windowInsets;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function23 = function22;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function32 = function3;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i3;
        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i8 & 1)) {
        }
        final long j82222 = j3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006a  */
    /* renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1871TopAppBarxWeB9s(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, long j, long j2, float f, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        long j3;
        long j4;
        int i6;
        int i7;
        Composer composer2;
        final float f2;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i8;
        float m1863getTopAppBarElevationD9Ej5fM;
        Composer startRestartGroup = composer.startRestartGroup(-350082398);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)N(title,modifier,navigationIcon,actions,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp)169@7728L176:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function24 = function22;
                i3 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                    } else {
                        j3 = j;
                    }
                    if ((196608 & i) != 0) {
                        j4 = j2;
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                    } else {
                        j4 = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                    }
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i7 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "165@7582L6,166@7631L32");
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function24 = null;
                            }
                            if (i5 != 0) {
                                function32 = ComposableSingletons$AppBarKt.INSTANCE.getLambda$1260131259$material();
                            }
                            if ((i2 & 16) != 0) {
                                j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i8 = i7 & (-57345);
                            } else {
                                i8 = i7;
                            }
                            if ((i2 & 32) != 0) {
                                j4 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i8 >> 12) & 14);
                                i8 &= -458753;
                            }
                            if (i6 != 0) {
                                m1863getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m1863getTopAppBarElevationD9Ej5fM();
                                long j7 = j3;
                                long j8 = j4;
                                Modifier modifier4 = modifier2;
                                Function2<? super Composer, ? super Integer, Unit> function26 = function24;
                                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34 = function32;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-350082398, i8, -1, "androidx.compose.material.TopAppBar (AppBar.kt:168)");
                                }
                                int i10 = (i8 & 14) | 48;
                                int i11 = i8 << 3;
                                composer2 = startRestartGroup;
                                m1869TopAppBarRx1qByU(function23, ZeroInsets, modifier4, function26, function34, j7, j8, m1863getTopAppBarElevationD9Ej5fM, composer2, i10 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                function25 = function26;
                                function33 = function34;
                                j5 = j7;
                                j6 = j8;
                                f2 = m1863getTopAppBarElevationD9Ej5fM;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i8 = (i2 & 16) != 0 ? i7 & (-57345) : i7;
                            if ((i2 & 32) != 0) {
                                i8 &= -458753;
                            }
                        }
                        m1863getTopAppBarElevationD9Ej5fM = f;
                        long j72 = j3;
                        long j82 = j4;
                        Modifier modifier42 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function262 = function24;
                        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function342 = function32;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = (i8 & 14) | 48;
                        int i112 = i8 << 3;
                        composer2 = startRestartGroup;
                        m1869TopAppBarRx1qByU(function23, ZeroInsets, modifier42, function262, function342, j72, j82, m1863getTopAppBarElevationD9Ej5fM, composer2, i102 | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (i112 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        function25 = function262;
                        function33 = function342;
                        j5 = j72;
                        j6 = j82;
                        f2 = m1863getTopAppBarElevationD9Ej5fM;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        f2 = f;
                        modifier3 = modifier2;
                        function25 = function24;
                        function33 = function32;
                        j5 = j3;
                        j6 = j4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TopAppBar_xWeB9_s$lambda$1;
                                TopAppBar_xWeB9_s$lambda$1 = AppBarKt.TopAppBar_xWeB9_s$lambda$1(Function2.this, modifier3, function25, function33, j5, j6, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TopAppBar_xWeB9_s$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function32 = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function24 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0087  */
    /* renamed from: TopAppBar-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1870TopAppBarafqeVBk(final WindowInsets windowInsets, Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        int i4;
        float f2;
        int i5;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        PaddingValues contentPadding;
        Modifier modifier4;
        long j7;
        float f4;
        long j8;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(684777089);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)N(windowInsets,modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp,contentPadding,content)222@10051L205:AppBar.kt#jmzs0o");
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
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
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
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 1024;
                i3 |= i6;
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
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "216@9792L6,217@9841L32");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i8 != 0) {
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
                                    f2 = AppBarDefaults.INSTANCE.m1863getTopAppBarElevationD9Ej5fM();
                                }
                                if (i5 != 0) {
                                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                    modifier4 = modifier2;
                                    j7 = j4;
                                    f4 = f2;
                                    j8 = j3;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(684777089, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:221)");
                                    }
                                    int i9 = i3 >> 6;
                                    int i10 = i3 << 15;
                                    composer2 = startRestartGroup;
                                    m1865AppBarHkEspTQ(j8, j7, f4, contentPadding, RectangleShapeKt.getRectangleShape(), windowInsets, modifier4, function3, composer2, (i9 & 7168) | (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (458752 & i10) | (i10 & 3670016) | ((i3 << 3) & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    j5 = j8;
                                    j6 = j7;
                                    f3 = f4;
                                    paddingValues3 = contentPadding;
                                    modifier3 = modifier4;
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
                            modifier4 = modifier2;
                            f4 = f2;
                            contentPadding = paddingValues2;
                            j8 = j3;
                            j7 = j4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i92 = i3 >> 6;
                            int i102 = i3 << 15;
                            composer2 = startRestartGroup;
                            m1865AppBarHkEspTQ(j8, j7, f4, contentPadding, RectangleShapeKt.getRectangleShape(), windowInsets, modifier4, function3, composer2, (i92 & 7168) | (i92 & 14) | 24576 | (i92 & 112) | (i92 & 896) | (458752 & i102) | (i102 & 3670016) | ((i3 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j5 = j8;
                            j6 = j7;
                            f3 = f4;
                            paddingValues3 = contentPadding;
                            modifier3 = modifier4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            paddingValues3 = paddingValues2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TopAppBar_afqeVBk$lambda$2;
                                    TopAppBar_afqeVBk$lambda$2 = AppBarKt.TopAppBar_afqeVBk$lambda$2(WindowInsets.this, modifier3, j5, j6, f3, paddingValues3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return TopAppBar_afqeVBk$lambda$2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
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
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0087  */
    /* renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1868TopAppBarHsRjFd4(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        long j7;
        float f4;
        PaddingValues contentPadding;
        long j8;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2030536439);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)N(modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp,contentPadding,content)270@12153L203:AppBar.kt#jmzs0o");
        int i7 = i2 & 1;
        if (i7 != 0) {
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
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                j4 = j2;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            j4 = j2;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "264@11894L6,265@11943L32");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                long primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                j3 = primarySurface;
                            }
                            if ((i2 & 4) != 0) {
                                long m1971contentColorForek8zF_U = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                                j4 = m1971contentColorForek8zF_U;
                            }
                            if (i8 != 0) {
                                f2 = AppBarDefaults.INSTANCE.m1863getTopAppBarElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                modifier4 = companion;
                                j7 = j4;
                                f4 = f2;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                j8 = j3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2030536439, i3, -1, "androidx.compose.material.TopAppBar (AppBar.kt:269)");
                                }
                                int i9 = i3 >> 3;
                                composer2 = startRestartGroup;
                                m1865AppBarHkEspTQ(j8, j7, f4, contentPadding, RectangleShapeKt.getRectangleShape(), ZeroInsets, modifier4, function3, composer2, (i9 & 7168) | (i9 & 14) | 221184 | (i9 & 112) | (i9 & 896) | ((i3 << 18) & 3670016) | ((i3 << 6) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j5 = j8;
                                j6 = j7;
                                f3 = f4;
                                paddingValues3 = contentPadding;
                                modifier3 = modifier4;
                            } else {
                                modifier4 = companion;
                            }
                        }
                        f4 = f2;
                        j8 = j3;
                        contentPadding = paddingValues2;
                        j7 = j4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = i3 >> 3;
                        composer2 = startRestartGroup;
                        m1865AppBarHkEspTQ(j8, j7, f4, contentPadding, RectangleShapeKt.getRectangleShape(), ZeroInsets, modifier4, function3, composer2, (i92 & 7168) | (i92 & 14) | 221184 | (i92 & 112) | (i92 & 896) | ((i3 << 18) & 3670016) | ((i3 << 6) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j5 = j8;
                        j6 = j7;
                        f3 = f4;
                        paddingValues3 = contentPadding;
                        modifier3 = modifier4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        paddingValues3 = paddingValues2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TopAppBar_HsRjFd4$lambda$3;
                                TopAppBar_HsRjFd4$lambda$3 = AppBarKt.TopAppBar_HsRjFd4$lambda$3(Modifier.this, j5, j6, f3, paddingValues3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TopAppBar_HsRjFd4$lambda$3;
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
            paddingValues2 = paddingValues;
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
        paddingValues2 = paddingValues;
        if ((i2 & 32) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c6  */
    /* renamed from: BottomAppBar-DanWW-k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1866BottomAppBarDanWWk(final WindowInsets windowInsets, Modifier modifier, long j, long j2, Shape shape, float f, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        int i4;
        Shape shape2;
        int i5;
        float f2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final Shape shape3;
        final float f3;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        PaddingValues contentPadding;
        Shape shape4;
        BottomAppBarCutoutShape rectangleShape;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1136595494);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)N(windowInsets,modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,cutoutShape,elevation:c#ui.unit.Dp,contentPadding,content)337@15398L7,344@15612L175:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(windowInsets) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "330@15067L6,331@15116L32");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i9 != 0) {
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
                                    shape2 = null;
                                }
                                if (i5 != 0) {
                                    f2 = AppBarDefaults.INSTANCE.m1862getBottomAppBarElevationD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                    Modifier modifier4 = modifier2;
                                    shape4 = shape2;
                                    float f4 = f2;
                                    long j7 = j3;
                                    long j8 = j4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1136595494, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:336)");
                                    }
                                    ProvidableCompositionLocal<FabPlacement> localFabPlacement = ScaffoldKt.getLocalFabPlacement();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localFabPlacement);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    FabPlacement fabPlacement = (FabPlacement) consume;
                                    if (shape4 == null && fabPlacement != null && fabPlacement.getIsDocked()) {
                                        rectangleShape = new BottomAppBarCutoutShape(shape4, fabPlacement);
                                    } else {
                                        rectangleShape = RectangleShapeKt.getRectangleShape();
                                    }
                                    Shape shape5 = rectangleShape;
                                    int i10 = i3 >> 9;
                                    int i11 = ((i3 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | (i10 & 896) | (i10 & 7168);
                                    int i12 = i3 << 15;
                                    composer2 = startRestartGroup;
                                    m1865AppBarHkEspTQ(j7, j8, f4, contentPadding, shape5, windowInsets, modifier4, function3, composer2, i11 | (458752 & i12) | (i12 & 3670016) | (i3 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape3 = shape4;
                                    j5 = j7;
                                    j6 = j8;
                                    f3 = f4;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier4;
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
                            contentPadding = paddingValues;
                            Modifier modifier42 = modifier2;
                            shape4 = shape2;
                            float f42 = f2;
                            long j72 = j3;
                            long j82 = j4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<FabPlacement> localFabPlacement2 = ScaffoldKt.getLocalFabPlacement();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localFabPlacement2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FabPlacement fabPlacement2 = (FabPlacement) consume2;
                            if (shape4 == null) {
                            }
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                            Shape shape52 = rectangleShape;
                            int i102 = i3 >> 9;
                            int i112 = ((i3 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | (i102 & 896) | (i102 & 7168);
                            int i122 = i3 << 15;
                            composer2 = startRestartGroup;
                            m1865AppBarHkEspTQ(j72, j82, f42, contentPadding, shape52, windowInsets, modifier42, function3, composer2, i112 | (458752 & i122) | (i122 & 3670016) | (i3 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            shape3 = shape4;
                            j5 = j72;
                            j6 = j82;
                            f3 = f42;
                            paddingValues2 = contentPadding;
                            modifier3 = modifier42;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            j5 = j3;
                            j6 = j4;
                            shape3 = shape2;
                            f3 = f2;
                            paddingValues2 = paddingValues;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BottomAppBar_DanWW_k$lambda$4;
                                    BottomAppBar_DanWW_k$lambda$4 = AppBarKt.BottomAppBar_DanWW_k$lambda$4(WindowInsets.this, modifier3, j5, j6, shape3, f3, paddingValues2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return BottomAppBar_DanWW_k$lambda$4;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            shape2 = shape;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
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
        shape2 = shape;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a8  */
    /* renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1867BottomAppBarY1yfwus(Modifier modifier, long j, long j2, Shape shape, float f, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        Shape shape2;
        int i4;
        float f2;
        int i5;
        int i6;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final Shape shape3;
        final float f3;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        PaddingValues contentPadding;
        Shape shape4;
        float f4;
        int i7;
        long j7;
        BottomAppBarCutoutShape rectangleShape;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-2058075642);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)N(modifier,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,cutoutShape,elevation:c#ui.unit.Dp,contentPadding,content)406@18576L7,413@18790L173:AppBar.kt#jmzs0o");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                j3 = j;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                j4 = j2;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            j4 = j2;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i6 = 196608;
                    paddingValues2 = paddingValues;
                } else {
                    i6 = 196608;
                    paddingValues2 = paddingValues;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "399@18245L6,400@18294L32");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier;
                    } else {
                        Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 2) != 0) {
                            j3 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                            i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i11 != 0) {
                            shape2 = null;
                        }
                        if (i4 != 0) {
                            f2 = AppBarDefaults.INSTANCE.m1862getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i5 != 0) {
                            modifier3 = companion;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            shape4 = shape2;
                            f4 = f2;
                            i7 = -2058075642;
                            j7 = j3;
                            long j8 = j4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:405)");
                            }
                            ProvidableCompositionLocal<FabPlacement> localFabPlacement = ScaffoldKt.getLocalFabPlacement();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localFabPlacement);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            FabPlacement fabPlacement = (FabPlacement) consume;
                            if (shape4 == null && fabPlacement != null && fabPlacement.getIsDocked()) {
                                rectangleShape = new BottomAppBarCutoutShape(shape4, fabPlacement);
                            } else {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            }
                            int i12 = i3 >> 3;
                            int i13 = i3 >> 6;
                            composer2 = startRestartGroup;
                            m1865AppBarHkEspTQ(j7, j8, f4, contentPadding, rectangleShape, ZeroInsets, modifier3, function3, composer2, (i12 & 112) | (i12 & 14) | i6 | (i13 & 896) | (i13 & 7168) | ((i3 << 18) & 3670016) | (29360128 & (i3 << 3)), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape3 = shape4;
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            paddingValues3 = contentPadding;
                            modifier2 = modifier3;
                        } else {
                            modifier3 = companion;
                        }
                    }
                    shape4 = shape2;
                    contentPadding = paddingValues2;
                    i7 = -2058075642;
                    j7 = j3;
                    f4 = f2;
                    long j82 = j4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<FabPlacement> localFabPlacement2 = ScaffoldKt.getLocalFabPlacement();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localFabPlacement2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    FabPlacement fabPlacement2 = (FabPlacement) consume2;
                    if (shape4 == null) {
                    }
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                    int i122 = i3 >> 3;
                    int i132 = i3 >> 6;
                    composer2 = startRestartGroup;
                    m1865AppBarHkEspTQ(j7, j82, f4, contentPadding, rectangleShape, ZeroInsets, modifier3, function3, composer2, (i122 & 112) | (i122 & 14) | i6 | (i132 & 896) | (i132 & 7168) | ((i3 << 18) & 3670016) | (29360128 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape3 = shape4;
                    j5 = j7;
                    j6 = j82;
                    f3 = f4;
                    paddingValues3 = contentPadding;
                    modifier2 = modifier3;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    j5 = j3;
                    j6 = j4;
                    shape3 = shape2;
                    f3 = f2;
                    paddingValues3 = paddingValues2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BottomAppBar_Y1yfwus$lambda$5;
                            BottomAppBar_Y1yfwus$lambda$5 = AppBarKt.BottomAppBar_Y1yfwus$lambda$5(Modifier.this, j5, j6, shape3, f3, paddingValues3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BottomAppBar_Y1yfwus$lambda$5;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final float calculateCutoutCircleYIntercept(float f, float f2) {
        return -((float) Math.sqrt((f * f) - (f2 * f2)));
    }

    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float f, float f2, float f3) {
        Float valueOf;
        Float valueOf2;
        Pair pair;
        Float valueOf3;
        Float valueOf4;
        float f4 = f2 * f2;
        float f5 = f3 * f3;
        float f6 = (f * f) + f4;
        float f7 = f4 * f5 * (f6 - f5);
        float f8 = f * f5;
        double d = f7;
        float sqrt = (f8 - ((float) Math.sqrt(d))) / f6;
        float sqrt2 = (f8 + ((float) Math.sqrt(d))) / f6;
        float sqrt3 = (float) Math.sqrt(f5 - (sqrt * sqrt));
        float sqrt4 = (float) Math.sqrt(f5 - (sqrt2 * sqrt2));
        if (f2 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = Float.valueOf(sqrt);
                valueOf4 = Float.valueOf(sqrt3);
            } else {
                valueOf3 = Float.valueOf(sqrt2);
                valueOf4 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.to(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = Float.valueOf(sqrt);
                valueOf2 = Float.valueOf(sqrt3);
            } else {
                valueOf = Float.valueOf(sqrt2);
                valueOf2 = Float.valueOf(sqrt4);
            }
            pair = TuplesKt.to(valueOf, valueOf2);
        }
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        if (floatValue < f) {
            floatValue2 = -floatValue2;
        }
        return TuplesKt.to(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0074  */
    /* renamed from: AppBar-HkEspTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1865AppBarHkEspTQ(final long j, final long j2, final float f, final PaddingValues paddingValues, final Shape shape, final WindowInsets windowInsets, Modifier modifier, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        Shape shape2;
        int i4;
        int i5;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1222317265);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppBar)N(backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp,contentPadding,shape,windowInsets,modifier,content)706@31596L472,700@31428L640:AppBar.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changed(windowInsets) ? 131072 : 65536;
                }
                i4 = i2 & 64;
                if (i4 != 0) {
                    i3 |= 1572864;
                    i5 = 1572864;
                    modifier2 = modifier;
                } else {
                    i5 = 1572864;
                    modifier2 = modifier;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1222317265, i3, -1, "androidx.compose.material.AppBar (AppBar.kt:699)");
                    }
                    int i6 = i3 << 6;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2169SurfaceFjzlyU(modifier4, shape2, j, j2, null, f2, ComposableLambdaKt.rememberComposableLambda(-1628734195, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            ComposerKt.sourceInformation(composer3, "C707@31671L6,707@31679L383,707@31606L456:AppBar.kt#jmzs0o");
                            if (!composer3.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1628734195, i7, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:707)");
                            }
                            ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer3, 6)));
                            final WindowInsets windowInsets2 = WindowInsets.this;
                            final PaddingValues paddingValues2 = paddingValues;
                            final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(597057613, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i8) {
                                    float f3;
                                    ComposerKt.sourceInformation(composer4, "C708@31693L359:AppBar.kt#jmzs0o");
                                    if (!composer4.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(597057613, i8, -1, "androidx.compose.material.AppBar.<anonymous>.<anonymous> (AppBar.kt:708)");
                                    }
                                    Modifier padding = PaddingKt.padding(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets.this), paddingValues2);
                                    f3 = AppBarKt.AppBarHeight;
                                    Modifier m875height3ABfNKs = SizeKt.m875height3ABfNKs(padding, f3);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer4, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m875height3ABfNKs);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer m4976constructorimpl = Updater.m4976constructorimpl(composer4);
                                    Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    function33.invoke(RowScopeInstance.INSTANCE, composer4, 6);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), composer2, ((i3 >> 18) & 14) | i5 | ((i3 >> 9) & 112) | (i6 & 896) | (i6 & 7168) | (458752 & (i3 << 9)), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AppBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit AppBar_HkEspTQ$lambda$6;
                            AppBar_HkEspTQ$lambda$6 = AppBarKt.AppBar_HkEspTQ$lambda$6(j, j2, f, paddingValues, shape, windowInsets, modifier3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return AppBar_HkEspTQ$lambda$6;
                        }
                    });
                    return;
                }
                return;
            }
            shape2 = shape;
            if ((i2 & 32) != 0) {
            }
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        shape2 = shape;
        if ((i2 & 32) != 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 4;
        float m8401constructorimpl = Dp.m8401constructorimpl(f);
        AppBarHorizontalPadding = m8401constructorimpl;
        TitleInsetWithoutIcon = SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(Dp.m8401constructorimpl(16) - m8401constructorimpl));
        TitleIconModifier = SizeKt.m894width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(Dp.m8401constructorimpl(72) - m8401constructorimpl));
        BottomAppBarCutoutOffset = Dp.m8401constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m8401constructorimpl(f);
        ZeroInsets = WindowInsetsKt.m916WindowInsetsa9UjIt4$default(Dp.m8401constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
    }
}
