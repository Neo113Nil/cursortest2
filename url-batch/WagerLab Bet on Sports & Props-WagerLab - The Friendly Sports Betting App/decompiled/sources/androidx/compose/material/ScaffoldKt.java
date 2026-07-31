package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import io.branch.referral.BranchError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a¤\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b)\u0010*\u001a\u009c\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b+\u0010,\u001a¥\u0001\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00162\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b02\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b0H\u0003¢\u0006\u0004\b3\u00104\"\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010706X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109\"\u0010\u0010:\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;¨\u0006<"}, d2 = {"rememberScaffoldState", "Landroidx/compose/material/ScaffoldState;", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "Scaffold", "", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "Landroidx/compose/ui/unit/Dp;", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-i1QSOvI", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "FabSpacing", "F", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            FabPlacement LocalFabPlacement$lambda$26;
            LocalFabPlacement$lambda$26 = ScaffoldKt.LocalFabPlacement$lambda$26();
            return LocalFabPlacement$lambda$26;
        }
    });
    private static final float FabSpacing = Dp.m8401constructorimpl(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final FabPlacement LocalFabPlacement$lambda$26() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScaffoldLayout_i1QSOvI$lambda$25(boolean z, int i, Function2 function2, Function3 function3, Function2 function22, Function2 function23, WindowInsets windowInsets, Function2 function24, int i2, Composer composer, int i3) {
        m2127ScaffoldLayouti1QSOvI(z, i, function2, function3, function22, function23, windowInsets, function24, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scaffold_27mzLpw$lambda$4(Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i, boolean z, Function3 function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, Function3 function33, int i2, int i3, int i4, Composer composer, int i5) {
        m2125Scaffold27mzLpw(modifier, scaffoldState, function2, function22, function3, function23, i, z, function32, z2, shape, f, j, j2, j3, j4, j5, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scaffold_u4IkXBM$lambda$3(WindowInsets windowInsets, Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, Function2 function23, int i, boolean z, Function3 function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, Function3 function33, int i2, int i3, int i4, Composer composer, int i5) {
        m2126Scaffoldu4IkXBM(windowInsets, modifier, scaffoldState, function2, function22, function3, function23, i, z, function32, z2, shape, f, j, j2, j3, j4, j5, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static final ScaffoldState rememberScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1569641925, "C(rememberScaffoldState)N(drawerState,snackbarHostState)71@2876L39,72@2960L32,73@3013L58:Scaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 892373989, "CC(remember):Scaffold.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 892375711, "CC(remember):Scaffold.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        ScaffoldState scaffoldState = (ScaffoldState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return scaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* renamed from: Scaffold-u4IkXBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2126Scaffoldu4IkXBM(final WindowInsets windowInsets, Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        ScaffoldState scaffoldState2;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i8;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final int i21;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35;
        final Modifier modifier3;
        final ScaffoldState scaffoldState3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final boolean z3;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function36;
        final boolean z4;
        final Shape shape2;
        final float f2;
        ScopeUpdateScope endRestartGroup;
        boolean z5;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37;
        boolean z6;
        CornerBasedShape cornerBasedShape;
        float m1992getElevationD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> function29;
        int i22;
        Shape shape3;
        long j11;
        long j12;
        int i23;
        long j13;
        int i24;
        int i25;
        long j14;
        Function2<? super Composer, ? super Integer, Unit> function210;
        long j15;
        int i26;
        long j16;
        int i27;
        Shape shape4;
        int i28;
        Shape shape5;
        Shape shape6;
        int i29;
        int i30;
        Composer startRestartGroup = composer.startRestartGroup(50073903);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scaffold)N(contentWindowInsets,modifier,scaffoldState,topBar,bottomBar,snackbarHost,floatingActionButton,floatingActionButtonPosition:c#material.FabPosition,isFloatingActionButtonDocked,drawerContent,drawerGesturesEnabled,drawerShape,drawerElevation:c#ui.unit.Dp,drawerBackgroundColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,drawerScrimColor:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,content)197@9490L74,199@9601L1024:Scaffold.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(windowInsets) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i31 = i4 & 2;
        if (i31 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    scaffoldState2 = scaffoldState;
                    if (startRestartGroup.changed(scaffoldState2)) {
                        i30 = 256;
                        i5 |= i30;
                    }
                } else {
                    scaffoldState2 = scaffoldState;
                }
                i30 = 128;
                i5 |= i30;
            } else {
                scaffoldState2 = scaffoldState;
            }
            i6 = i4 & 8;
            int i32 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function24 = function22;
                    i5 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function34 = function3;
                    } else {
                        function34 = function3;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changedInstance(function34) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        function25 = function23;
                    } else {
                        function25 = function23;
                        if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i12 = i11;
                        i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i14 = i13;
                            i5 |= startRestartGroup.changedInstance(function32) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (startRestartGroup.changed(z2) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            if ((i3 & 48) == 0) {
                                if ((i4 & 2048) == 0 && startRestartGroup.changed(shape)) {
                                    i29 = 32;
                                    i17 |= i29;
                                }
                                i29 = 16;
                                i17 |= i29;
                            }
                            int i33 = i17;
                            i18 = i4 & 4096;
                            if (i18 == 0) {
                                i19 = i33 | 384;
                            } else {
                                i19 = i33;
                                if ((i3 & 384) == 0) {
                                    i19 |= startRestartGroup.changed(f) ? 256 : 128;
                                    if ((i3 & 3072) == 0) {
                                        if ((i4 & 8192) == 0) {
                                            i20 = i18;
                                            if (startRestartGroup.changed(j)) {
                                                i32 = 2048;
                                            }
                                        } else {
                                            i20 = i18;
                                        }
                                        i19 |= i32;
                                    } else {
                                        i20 = i18;
                                    }
                                    int i34 = i20;
                                    if ((i3 & 24576) == 0) {
                                        i19 |= ((i4 & 16384) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
                                    }
                                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i19 |= ((32768 & i4) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                                    }
                                    if ((1572864 & i3) == 0) {
                                        i19 |= ((i4 & 65536) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
                                    }
                                    if ((12582912 & i3) == 0) {
                                        i19 |= ((i4 & 131072) == 0 && startRestartGroup.changed(j5)) ? 8388608 : 4194304;
                                    }
                                    if ((262144 & i4) != 0) {
                                        i19 |= 100663296;
                                    } else if ((i3 & 100663296) == 0) {
                                        i19 |= startRestartGroup.changedInstance(function33) ? 67108864 : 33554432;
                                        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                                            startRestartGroup.startDefaults();
                                            ComposerKt.sourceInformation(startRestartGroup, "179@8523L23,188@9033L6,190@9148L6,191@9196L38,192@9281L10,193@9336L6,194@9381L32");
                                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i4 & 4) != 0) {
                                                    i5 &= -897;
                                                }
                                                if ((i4 & 2048) != 0) {
                                                    i19 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                                }
                                                int i35 = i19;
                                                if ((i4 & 8192) != 0) {
                                                    i35 &= -7169;
                                                }
                                                if ((i4 & 16384) != 0) {
                                                    i35 &= -57345;
                                                }
                                                if ((32768 & i4) != 0) {
                                                    i35 &= -458753;
                                                }
                                                if ((i4 & 65536) != 0) {
                                                    i35 &= -3670017;
                                                }
                                                if ((i4 & 131072) != 0) {
                                                    i35 &= -29360129;
                                                }
                                                i27 = i;
                                                z5 = z;
                                                function37 = function32;
                                                z6 = z2;
                                                shape4 = shape;
                                                m1992getElevationD9Ej5fM = f;
                                                j12 = j2;
                                                j13 = j3;
                                                j16 = j4;
                                                j15 = j5;
                                                i26 = i35;
                                                i28 = i5;
                                                function210 = function2;
                                                j11 = j;
                                            } else {
                                                if (i31 != 0) {
                                                    modifier2 = Modifier.INSTANCE;
                                                }
                                                if ((i4 & 4) != 0) {
                                                    i5 &= -897;
                                                    scaffoldState2 = rememberScaffoldState(null, null, startRestartGroup, 0, 3);
                                                }
                                                Function2<? super Composer, ? super Integer, Unit> lambda$866784315$material = i6 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$866784315$material() : function2;
                                                if (i7 != 0) {
                                                    function24 = ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$1714259275$material();
                                                }
                                                if (i8 != 0) {
                                                    function34 = ComposableSingletons$ScaffoldKt.INSTANCE.m1980getLambda$1836397928$material();
                                                }
                                                if (i9 != 0) {
                                                    function25 = ComposableSingletons$ScaffoldKt.INSTANCE.m1978getLambda$1406416085$material();
                                                }
                                                int m2033getEnd5ygKITE = i10 != 0 ? FabPosition.INSTANCE.m2033getEnd5ygKITE() : i;
                                                z5 = i12 != 0 ? false : z;
                                                function37 = i14 != 0 ? null : function32;
                                                z6 = i16 != 0 ? true : z2;
                                                if ((i4 & 2048) != 0) {
                                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                                    i19 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                                } else {
                                                    cornerBasedShape = shape;
                                                }
                                                int i36 = i19;
                                                m1992getElevationD9Ej5fM = i34 != 0 ? DrawerDefaults.INSTANCE.m1992getElevationD9Ej5fM() : f;
                                                if ((i4 & 8192) != 0) {
                                                    function29 = lambda$866784315$material;
                                                    i22 = i5;
                                                    shape3 = cornerBasedShape;
                                                    j11 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                                                    i36 &= -7169;
                                                } else {
                                                    function29 = lambda$866784315$material;
                                                    i22 = i5;
                                                    shape3 = cornerBasedShape;
                                                    j11 = j;
                                                }
                                                if ((i4 & 16384) != 0) {
                                                    j12 = ColorsKt.m1971contentColorForek8zF_U(j11, startRestartGroup, (i36 >> 9) & 14);
                                                    i36 &= -57345;
                                                } else {
                                                    j12 = j2;
                                                }
                                                if ((32768 & i4) != 0) {
                                                    i23 = 6;
                                                    j13 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                                    i36 &= -458753;
                                                } else {
                                                    i23 = 6;
                                                    j13 = j3;
                                                }
                                                if ((i4 & 65536) != 0) {
                                                    i25 = i36 & (-3670017);
                                                    i24 = m2033getEnd5ygKITE;
                                                    j14 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i23).m1946getBackground0d7_KjU();
                                                } else {
                                                    i24 = m2033getEnd5ygKITE;
                                                    i25 = i36;
                                                    j14 = j4;
                                                }
                                                if ((i4 & 131072) != 0) {
                                                    function210 = function29;
                                                    i26 = i25 & (-29360129);
                                                    j15 = ColorsKt.m1971contentColorForek8zF_U(j14, startRestartGroup, (i25 >> 18) & 14);
                                                    i28 = i22;
                                                    j16 = j14;
                                                    i27 = i24;
                                                    shape4 = shape3;
                                                } else {
                                                    function210 = function29;
                                                    j15 = j5;
                                                    i26 = i25;
                                                    j16 = j14;
                                                    i27 = i24;
                                                    shape4 = shape3;
                                                    i28 = i22;
                                                }
                                            }
                                            startRestartGroup.endDefaults();
                                            int i37 = i27;
                                            if (ComposerKt.isTraceInProgress()) {
                                                shape5 = shape4;
                                                ComposerKt.traceEventStart(50073903, i28, i26, "androidx.compose.material.Scaffold (Scaffold.kt:196)");
                                            } else {
                                                shape5 = shape4;
                                            }
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 876415865, "CC(remember):Scaffold.kt#9igjgp");
                                            boolean z7 = (i28 & 14) == 4;
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (z7 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new MutableWindowInsets(windowInsets);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ScaffoldKt$Scaffold$child$1 scaffoldKt$Scaffold$child$1 = new ScaffoldKt$Scaffold$child$1((MutableWindowInsets) rememberedValue, windowInsets, j16, j15, z5, i37, function210, function33, function25, function24, function34, scaffoldState2);
                                            Function2<? super Composer, ? super Integer, Unit> function211 = function210;
                                            int i38 = i28;
                                            final ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1236753028, true, scaffoldKt$Scaffold$child$1, startRestartGroup, 54);
                                            if (function37 != null) {
                                                startRestartGroup.startReplaceGroup(1400260027);
                                                ComposerKt.sourceInformation(startRestartGroup, "234@11126L19,224@10668L488");
                                                int i39 = i26 << 9;
                                                Shape shape7 = shape5;
                                                DrawerKt.m2000ModalDrawerGs3lGvM(function37, modifier2, scaffoldState2.getDrawerState(), z6, shape7, m1992getElevationD9Ej5fM, j11, j12, j13, ComposableLambdaKt.rememberComposableLambda(-1888468172, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer3, int i40) {
                                                        ComposerKt.sourceInformation(composer3, "C234@11128L15:Scaffold.kt#jmzs0o");
                                                        if (!composer3.shouldExecute((i40 & 3) != 2, i40 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1888468172, i40, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:234)");
                                                        }
                                                        rememberComposableLambda.invoke(Modifier.INSTANCE, composer3, 54);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, startRestartGroup, 54), startRestartGroup, ((i38 >> 27) & 14) | 805306368 | (i38 & 112) | (i39 & 7168) | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (29360128 & i39) | (i39 & 234881024), 0);
                                                shape6 = shape7;
                                                composer2 = startRestartGroup;
                                                composer2.endReplaceGroup();
                                            } else {
                                                shape6 = shape5;
                                                composer2 = startRestartGroup;
                                                composer2.startReplaceGroup(1400751284);
                                                ComposerKt.sourceInformation(composer2, "237@11178L15");
                                                rememberComposableLambda.invoke(modifier2, composer2, Integer.valueOf(((i38 >> 3) & 14) | 48));
                                                composer2.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            function26 = function211;
                                            scaffoldState3 = scaffoldState2;
                                            function28 = function25;
                                            f2 = m1992getElevationD9Ej5fM;
                                            j7 = j12;
                                            j8 = j13;
                                            j9 = j16;
                                            j10 = j15;
                                            shape2 = shape6;
                                            modifier3 = modifier2;
                                            z4 = z6;
                                            boolean z8 = z5;
                                            i21 = i37;
                                            Function2<? super Composer, ? super Integer, Unit> function212 = function24;
                                            z3 = z8;
                                            long j17 = j11;
                                            function27 = function212;
                                            function35 = function34;
                                            function36 = function37;
                                            j6 = j17;
                                        } else {
                                            composer2 = startRestartGroup;
                                            composer2.skipToGroupEnd();
                                            function26 = function2;
                                            i21 = i;
                                            j6 = j;
                                            j7 = j2;
                                            j8 = j3;
                                            j9 = j4;
                                            j10 = j5;
                                            function27 = function24;
                                            function35 = function34;
                                            modifier3 = modifier2;
                                            scaffoldState3 = scaffoldState2;
                                            function28 = function25;
                                            z3 = z;
                                            function36 = function32;
                                            z4 = z2;
                                            shape2 = shape;
                                            f2 = f;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit Scaffold_u4IkXBM$lambda$3;
                                                    Scaffold_u4IkXBM$lambda$3 = ScaffoldKt.Scaffold_u4IkXBM$lambda$3(WindowInsets.this, modifier3, scaffoldState3, function26, function27, function35, function28, i21, z3, function36, z4, shape2, f2, j6, j7, j8, j9, j10, function33, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                    return Scaffold_u4IkXBM$lambda$3;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                    }
                                }
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i342 = i20;
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if ((1572864 & i3) == 0) {
                            }
                            if ((12582912 & i3) == 0) {
                            }
                            if ((262144 & i4) != 0) {
                            }
                            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        int i332 = i17;
                        i18 = i4 & 4096;
                        if (i18 == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i3422 = i20;
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if ((1572864 & i3) == 0) {
                        }
                        if ((12582912 & i3) == 0) {
                        }
                        if ((262144 & i4) != 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i3322 = i17;
                    i18 = i4 & 4096;
                    if (i18 == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i34222 = i20;
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((1572864 & i3) == 0) {
                    }
                    if ((12582912 & i3) == 0) {
                    }
                    if ((262144 & i4) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function24 = function22;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i33222 = i17;
                i18 = i4 & 4096;
                if (i18 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i342222 = i20;
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((1572864 & i3) == 0) {
                }
                if ((12582912 & i3) == 0) {
                }
                if ((262144 & i4) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            function24 = function22;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i332222 = i17;
            i18 = i4 & 4096;
            if (i18 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i3422222 = i20;
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((1572864 & i3) == 0) {
            }
            if ((12582912 & i3) == 0) {
            }
            if ((262144 & i4) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i6 = i4 & 8;
        int i322 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        function24 = function22;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i3322222 = i17;
        i18 = i4 & 4096;
        if (i18 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i34222222 = i20;
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((1572864 & i3) == 0) {
        }
        if ((12582912 & i3) == 0) {
        }
        if ((262144 & i4) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i19 & 38347923) != 38347922, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d3, code lost:
    
        if (r3.changed(r55) == false) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023d  */
    /* renamed from: Scaffold-27mzLpw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2125Scaffold27mzLpw(Modifier modifier, ScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        ScaffoldState scaffoldState2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        int i7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final float f2;
        final long j6;
        final long j7;
        final long j8;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35;
        final Modifier modifier3;
        final ScaffoldState scaffoldState3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final int i20;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function36;
        final boolean z5;
        final Shape shape2;
        final long j9;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        CornerBasedShape cornerBasedShape;
        float m1992getElevationD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37;
        long j11;
        long j12;
        long j13;
        int i21;
        long j14;
        long j15;
        boolean z6;
        Modifier modifier4;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Shape shape3;
        boolean z7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function38;
        ScaffoldState scaffoldState4;
        long j16;
        long j17;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function39;
        long j18;
        long j19;
        int i22;
        int i23;
        Function2<? super Composer, ? super Integer, Unit> function211;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(1135600301);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scaffold)N(modifier,scaffoldState,topBar,bottomBar,snackbarHost,floatingActionButton,floatingActionButtonPosition:c#material.FabPosition,isFloatingActionButtonDocked,drawerContent,drawerGesturesEnabled,drawerShape,drawerElevation:c#ui.unit.Dp,drawerBackgroundColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,drawerScrimColor:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,content)322@16008L496:Scaffold.kt#jmzs0o");
        int i26 = i4 & 1;
        if (i26 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i4 & 2) == 0) {
                scaffoldState2 = scaffoldState;
                if (startRestartGroup.changed(scaffoldState2)) {
                    i25 = 32;
                    i5 |= i25;
                }
            } else {
                scaffoldState2 = scaffoldState;
            }
            i25 = 16;
            i5 |= i25;
        } else {
            scaffoldState2 = scaffoldState;
        }
        int i27 = i4 & 4;
        if (i27 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            function24 = function2;
            i5 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                i7 = i4 & 16;
                int i28 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function34 = function3;
                    i5 |= startRestartGroup.changedInstance(function34) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function25 = function23;
                    } else {
                        function25 = function23;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        i10 = i;
                    } else {
                        i10 = i;
                        if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(i10) ? 1048576 : 524288;
                        }
                    }
                    i11 = i4 & 128;
                    if (i11 == 0) {
                        i5 |= 12582912;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i13 = i12;
                        i5 |= startRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
                        i14 = i4 & 512;
                        if (i14 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i15 = i14;
                            i5 |= startRestartGroup.changed(z2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            if ((i3 & 6) != 0) {
                                if ((i4 & 1024) == 0 && startRestartGroup.changed(shape)) {
                                    i24 = 4;
                                    i16 = i3 | i24;
                                }
                                i24 = 2;
                                i16 = i3 | i24;
                            } else {
                                i16 = i3;
                            }
                            i17 = i4 & 2048;
                            if (i17 == 0) {
                                i16 |= 48;
                            } else if ((i3 & 48) == 0) {
                                i18 = i17;
                                i16 |= startRestartGroup.changed(f) ? 32 : 16;
                                if ((i3 & 384) == 0) {
                                    i19 = i26;
                                    i16 |= ((i4 & 4096) == 0 && startRestartGroup.changed(j)) ? 256 : 128;
                                } else {
                                    i19 = i26;
                                }
                                if ((i3 & 3072) == 0) {
                                    i16 |= ((i4 & 8192) == 0 && startRestartGroup.changed(j2)) ? 2048 : 1024;
                                }
                                if ((i3 & 24576) == 0) {
                                    if ((i4 & 16384) != 0) {
                                    }
                                    i28 = 8192;
                                    i16 |= i28;
                                }
                                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i16 |= ((i4 & 32768) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                                }
                                if ((i3 & 1572864) == 0) {
                                    i16 |= ((i4 & 65536) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                                }
                                if ((i4 & 131072) != 0) {
                                    i16 |= 12582912;
                                } else if ((i3 & 12582912) == 0) {
                                    i16 |= startRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
                                }
                                if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 4793491) != 4793490, i5 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "304@15058L23,313@15568L6,315@15683L6,316@15731L38,317@15816L10,318@15871L6,319@15916L32");
                                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 2) != 0) {
                                            i5 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                        }
                                        if ((i4 & 1024) != 0) {
                                            i16 &= -15;
                                        }
                                        i22 = i16;
                                        if ((i4 & 4096) != 0) {
                                            i22 &= -897;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i22 &= -7169;
                                        }
                                        if ((i4 & 16384) != 0) {
                                            i22 &= -57345;
                                        }
                                        if ((32768 & i4) != 0) {
                                            i22 &= -458753;
                                        }
                                        if ((i4 & 65536) != 0) {
                                            i22 &= -3670017;
                                        }
                                        ScaffoldState scaffoldState5 = scaffoldState2;
                                        function38 = function34;
                                        scaffoldState4 = scaffoldState5;
                                        function39 = function32;
                                        m1992getElevationD9Ej5fM = f;
                                        j17 = j;
                                        j16 = j2;
                                        j14 = j3;
                                        j19 = j4;
                                        j18 = j5;
                                        modifier4 = modifier2;
                                        i23 = i5;
                                        z7 = z3;
                                        function210 = function24;
                                        function211 = function22;
                                        z6 = z2;
                                        shape3 = shape;
                                    } else {
                                        if (i19 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if ((i4 & 2) != 0) {
                                            ScaffoldState rememberScaffoldState = rememberScaffoldState(null, null, startRestartGroup, 0, 3);
                                            i5 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                            scaffoldState2 = rememberScaffoldState;
                                        }
                                        if (i27 != 0) {
                                            function24 = ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$566090785$material();
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> m1979getLambda$1624772335$material = i6 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1979getLambda$1624772335$material() : function22;
                                        if (i7 != 0) {
                                            function34 = ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$939725476$material();
                                        }
                                        if (i8 != 0) {
                                            function25 = ComposableSingletons$ScaffoldKt.INSTANCE.m1977getLambda$1341284559$material();
                                        }
                                        if (i9 != 0) {
                                            i10 = FabPosition.INSTANCE.m2033getEnd5ygKITE();
                                        }
                                        if (i11 != 0) {
                                            z3 = false;
                                        }
                                        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function310 = i13 != 0 ? null : function32;
                                        boolean z8 = i15 == 0 ? z2 : true;
                                        if ((i4 & 1024) != 0) {
                                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                            i16 &= -15;
                                        } else {
                                            cornerBasedShape = shape;
                                        }
                                        int i29 = i16;
                                        m1992getElevationD9Ej5fM = i18 != 0 ? DrawerDefaults.INSTANCE.m1992getElevationD9Ej5fM() : f;
                                        if ((i4 & 4096) != 0) {
                                            function29 = m1979getLambda$1624772335$material;
                                            i29 &= -897;
                                            function37 = function310;
                                            j11 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                                        } else {
                                            function29 = m1979getLambda$1624772335$material;
                                            function37 = function310;
                                            j11 = j;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            j12 = ColorsKt.m1971contentColorForek8zF_U(j11, startRestartGroup, (i29 >> 6) & 14);
                                            i29 &= -7169;
                                        } else {
                                            j12 = j2;
                                        }
                                        if ((i4 & 16384) != 0) {
                                            j13 = j11;
                                            i21 = 6;
                                            j14 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                            i29 &= -57345;
                                        } else {
                                            j13 = j11;
                                            i21 = 6;
                                            j14 = j3;
                                        }
                                        if ((32768 & i4) != 0) {
                                            j15 = MaterialTheme.INSTANCE.getColors(startRestartGroup, i21).m1946getBackground0d7_KjU();
                                            i29 &= -458753;
                                        } else {
                                            j15 = j4;
                                        }
                                        if ((i4 & 65536) != 0) {
                                            long m1971contentColorForek8zF_U = ColorsKt.m1971contentColorForek8zF_U(j15, startRestartGroup, (i29 >> 15) & 14);
                                            i29 &= -3670017;
                                            boolean z9 = z3;
                                            z6 = z8;
                                            modifier4 = modifier2;
                                            function210 = function24;
                                            shape3 = cornerBasedShape;
                                            z7 = z9;
                                            ScaffoldState scaffoldState6 = scaffoldState2;
                                            function38 = function34;
                                            scaffoldState4 = scaffoldState6;
                                            long j20 = j13;
                                            j16 = j12;
                                            j17 = j20;
                                            function39 = function37;
                                            j18 = m1971contentColorForek8zF_U;
                                        } else {
                                            boolean z10 = z3;
                                            z6 = z8;
                                            modifier4 = modifier2;
                                            function210 = function24;
                                            shape3 = cornerBasedShape;
                                            z7 = z10;
                                            ScaffoldState scaffoldState7 = scaffoldState2;
                                            function38 = function34;
                                            scaffoldState4 = scaffoldState7;
                                            long j21 = j13;
                                            j16 = j12;
                                            j17 = j21;
                                            function39 = function37;
                                            j18 = j5;
                                        }
                                        j19 = j15;
                                        i22 = i29;
                                        i23 = i5;
                                        function211 = function29;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1135600301, i23, i22, "androidx.compose.material.Scaffold (Scaffold.kt:321)");
                                    }
                                    int i30 = i22 << 3;
                                    composer2 = startRestartGroup;
                                    m2126Scaffoldu4IkXBM(WindowInsetsKt.m916WindowInsetsa9UjIt4$default(Dp.m8401constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), modifier4, scaffoldState4, function210, function211, function38, function25, i10, z7, function39, z6, shape3, m1992getElevationD9Ej5fM, j17, j16, j14, j19, j18, function33, composer2, (i23 << 3) & 2147483632, ((i23 >> 27) & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | (57344 & i30) | (458752 & i30) | (3670016 & i30) | (29360128 & i30) | (i30 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    scaffoldState3 = scaffoldState4;
                                    function28 = function210;
                                    function26 = function211;
                                    function35 = function38;
                                    function27 = function25;
                                    i20 = i10;
                                    z4 = z7;
                                    function36 = function39;
                                    z5 = z6;
                                    shape2 = shape3;
                                    f2 = m1992getElevationD9Ej5fM;
                                    j9 = j17;
                                    j10 = j16;
                                    j6 = j14;
                                    j7 = j19;
                                    j8 = j18;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    function26 = function22;
                                    f2 = f;
                                    j6 = j3;
                                    j7 = j4;
                                    j8 = j5;
                                    function35 = function34;
                                    modifier3 = modifier2;
                                    scaffoldState3 = scaffoldState2;
                                    function27 = function25;
                                    i20 = i10;
                                    z4 = z3;
                                    function28 = function24;
                                    function36 = function32;
                                    z5 = z2;
                                    shape2 = shape;
                                    j9 = j;
                                    j10 = j2;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Scaffold_27mzLpw$lambda$4;
                                            Scaffold_27mzLpw$lambda$4 = ScaffoldKt.Scaffold_27mzLpw$lambda$4(Modifier.this, scaffoldState3, function28, function26, function35, function27, i20, z4, function36, z5, shape2, f2, j9, j10, j6, j7, j8, function33, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                            return Scaffold_27mzLpw$lambda$4;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i18 = i17;
                            if ((i3 & 384) == 0) {
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if ((i3 & 1572864) == 0) {
                            }
                            if ((i4 & 131072) != 0) {
                            }
                            if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 4793491) != 4793490, i5 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        if ((i3 & 6) != 0) {
                        }
                        i17 = i4 & 2048;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        if ((i3 & 384) == 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if ((i3 & 1572864) == 0) {
                        }
                        if ((i4 & 131072) != 0) {
                        }
                        if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 4793491) != 4793490, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i4 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    if ((i3 & 6) != 0) {
                    }
                    i17 = i4 & 2048;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    if ((i3 & 384) == 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i4 & 131072) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 4793491) != 4793490, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function34 = function3;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i11 = i4 & 128;
                if (i11 == 0) {
                }
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                if ((i3 & 6) != 0) {
                }
                i17 = i4 & 2048;
                if (i17 == 0) {
                }
                i18 = i17;
                if ((i3 & 384) == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i4 & 131072) != 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 4793491) != 4793490, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            int i282 = 16384;
            if (i7 != 0) {
            }
            function34 = function3;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i11 = i4 & 128;
            if (i11 == 0) {
            }
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            if ((i3 & 6) != 0) {
            }
            i17 = i4 & 2048;
            if (i17 == 0) {
            }
            i18 = i17;
            if ((i3 & 384) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 4793491) != 4793490, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function24 = function2;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2822 = 16384;
        if (i7 != 0) {
        }
        function34 = function3;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        if ((i3 & 6) != 0) {
        }
        i17 = i4 & 2048;
        if (i17 == 0) {
        }
        i18 = i17;
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i16 & 4793491) != 4793490, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-i1QSOvI, reason: not valid java name */
    public static final void m2127ScaffoldLayouti1QSOvI(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(675142332);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScaffoldLayout)N(isFabDocked,fabPosition:c#material.FabPosition,topBar,content,snackbar,fab,contentWindowInsets,bottomBar)381@18185L626,397@18834L6945,397@18817L6962:Scaffold.kt#jmzs0o");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function32 = function3;
            i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
        } else {
            function32 = function3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function25 = function23;
            i3 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
        } else {
            function25 = function23;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(675142332, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:376)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 271742702, "CC(remember):Scaffold.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 271769789, "CC(remember):Scaffold.kt#9igjgp");
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33 = function32;
                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                i4 = 0;
                Function2 function27 = new Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        MeasureResult ScaffoldLayout_i1QSOvI$lambda$24$lambda$23;
                        ScaffoldLayout_i1QSOvI$lambda$24$lambda$23 = ScaffoldKt.ScaffoldLayout_i1QSOvI$lambda$24$lambda$23(Function2.this, function22, function26, i, z, windowInsets, scaffoldKt$ScaffoldLayout$contentPadding$1$1, function24, function33, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                        return ScaffoldLayout_i1QSOvI$lambda$24$lambda$23;
                    }
                };
                startRestartGroup.updateRememberedValue(function27);
                rememberedValue2 = function27;
            } else {
                i4 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue2, startRestartGroup, i4, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ScaffoldLayout_i1QSOvI$lambda$25;
                    ScaffoldLayout_i1QSOvI$lambda$25 = ScaffoldKt.ScaffoldLayout_i1QSOvI$lambda$25(z, i, function2, function3, function22, function23, windowInsets, function24, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ScaffoldLayout_i1QSOvI$lambda$25;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b7 A[LOOP:3: B:48:0x02b5->B:49:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03df A[LOOP:4: B:74:0x03dd->B:75:0x03df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult ScaffoldLayout_i1QSOvI$lambda$24$lambda$23(Function2 function2, Function2 function22, Function2 function23, int i, boolean z, WindowInsets windowInsets, final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, final Function2 function24, final Function3 function3, SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        Object obj;
        Object obj2;
        ArrayList arrayList;
        final FabPlacement fabPlacement;
        int size;
        int i2;
        final ArrayList arrayList2;
        Object obj3;
        final Integer num;
        final int i3;
        PaddingValues asPaddingValues;
        int i4;
        float m8401constructorimpl;
        float bottom;
        int size2;
        int i5;
        int intValue;
        int intValue2;
        int i6;
        Object obj4;
        Object obj5;
        int i7;
        int i8;
        int m8354getMaxWidthimpl = Constraints.m8354getMaxWidthimpl(constraints.getValue());
        final int m8353getMaxHeightimpl = Constraints.m8353getMaxHeightimpl(constraints.getValue());
        long m8344copyZbe2FdA$default = Constraints.m8344copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, 0, 10, null);
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
        ArrayList arrayList3 = new ArrayList(subcompose.size());
        int size3 = subcompose.size();
        for (int i9 = 0; i9 < size3; i9++) {
            arrayList3.add(subcompose.get(i9).mo7075measureBRTryo0(m8344copyZbe2FdA$default));
        }
        ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList4.get(0);
            int height = ((Placeable) obj).getHeight();
            int lastIndex = CollectionsKt.getLastIndex(arrayList4);
            if (1 <= lastIndex) {
                int i10 = 1;
                while (true) {
                    Object obj6 = arrayList4.get(i10);
                    int height2 = ((Placeable) obj6).getHeight();
                    if (height < height2) {
                        height = height2;
                        obj = obj6;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        final int height3 = placeable != null ? placeable.getHeight() : 0;
        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
        ArrayList arrayList5 = new ArrayList(subcompose2.size());
        int size4 = subcompose2.size();
        int i11 = 0;
        while (i11 < size4) {
            int i12 = m8354getMaxWidthimpl;
            Measurable measurable = subcompose2.get(i11);
            List<Measurable> list = subcompose2;
            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
            arrayList5.add(measurable.mo7075measureBRTryo0(ConstraintsKt.m8373offsetNN6EwU(m8344copyZbe2FdA$default, (-windowInsets.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope2))));
            i11++;
            subcompose2 = list;
            arrayList5 = arrayList5;
            arrayList4 = arrayList4;
            m8354getMaxWidthimpl = i12;
        }
        int i13 = m8354getMaxWidthimpl;
        final ArrayList arrayList6 = arrayList4;
        ArrayList arrayList7 = arrayList5;
        if (arrayList7.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList7.get(0);
            int height4 = ((Placeable) obj2).getHeight();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList7);
            if (1 <= lastIndex2) {
                Object obj7 = obj2;
                int i14 = height4;
                int i15 = 1;
                while (true) {
                    Object obj8 = arrayList7.get(i15);
                    int height5 = ((Placeable) obj8).getHeight();
                    if (i14 < height5) {
                        obj7 = obj8;
                        i14 = height5;
                    }
                    if (i15 == lastIndex2) {
                        break;
                    }
                    i15++;
                }
                obj2 = obj7;
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        int height6 = placeable2 != null ? placeable2.getHeight() : 0;
        List<Measurable> subcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function23);
        ArrayList arrayList8 = new ArrayList(subcompose3.size());
        int i16 = 0;
        for (int size5 = subcompose3.size(); i16 < size5; size5 = size5) {
            Measurable measurable2 = subcompose3.get(i16);
            List<Measurable> list2 = subcompose3;
            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
            arrayList8.add(measurable2.mo7075measureBRTryo0(ConstraintsKt.m8373offsetNN6EwU(m8344copyZbe2FdA$default, (-windowInsets.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope3))));
            i16++;
            height6 = height6;
            subcompose3 = list2;
            arrayList8 = arrayList8;
        }
        int i17 = height6;
        final ArrayList arrayList9 = arrayList8;
        if (arrayList9.isEmpty()) {
            arrayList = arrayList7;
        } else {
            if (arrayList9.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList9.get(0);
                int width = ((Placeable) obj4).getWidth();
                int lastIndex3 = CollectionsKt.getLastIndex(arrayList9);
                if (1 <= lastIndex3) {
                    Object obj9 = obj4;
                    int i18 = width;
                    int i19 = 1;
                    while (true) {
                        Object obj10 = arrayList9.get(i19);
                        Object obj11 = obj9;
                        int width2 = ((Placeable) obj10).getWidth();
                        if (i18 < width2) {
                            i18 = width2;
                            obj9 = obj10;
                        } else {
                            obj9 = obj11;
                        }
                        if (i19 == lastIndex3) {
                            break;
                        }
                        i19++;
                    }
                    obj4 = obj9;
                }
            }
            Placeable placeable3 = (Placeable) obj4;
            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
            if (arrayList9.isEmpty()) {
                arrayList = arrayList7;
                obj5 = null;
            } else {
                obj5 = arrayList9.get(0);
                int height7 = ((Placeable) obj5).getHeight();
                int lastIndex4 = CollectionsKt.getLastIndex(arrayList9);
                if (1 <= lastIndex4) {
                    Object obj12 = obj5;
                    int i20 = height7;
                    int i21 = 1;
                    while (true) {
                        Object obj13 = arrayList9.get(i21);
                        arrayList = arrayList7;
                        int height8 = ((Placeable) obj13).getHeight();
                        if (i20 < height8) {
                            i20 = height8;
                            obj12 = obj13;
                        }
                        if (i21 == lastIndex4) {
                            break;
                        }
                        i21++;
                        arrayList7 = arrayList;
                    }
                    obj5 = obj12;
                } else {
                    arrayList = arrayList7;
                }
            }
            Placeable placeable4 = (Placeable) obj5;
            int height9 = placeable4 != null ? placeable4.getHeight() : 0;
            if (width3 != 0 && height9 != 0) {
                if (FabPosition.m2028equalsimpl0(i, FabPosition.INSTANCE.m2034getStart5ygKITE())) {
                    if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                        i7 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                        fabPlacement = new FabPlacement(z, i7, width3, height9);
                    } else {
                        i8 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                        i7 = (i13 - i8) - width3;
                        fabPlacement = new FabPlacement(z, i7, width3, height9);
                    }
                } else {
                    if (FabPosition.m2028equalsimpl0(i, FabPosition.INSTANCE.m2033getEnd5ygKITE())) {
                        if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                            i8 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                            i7 = (i13 - i8) - width3;
                        } else {
                            i7 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                        }
                    } else {
                        i7 = (i13 - width3) / 2;
                    }
                    fabPlacement = new FabPlacement(z, i7, width3, height9);
                }
                List<Measurable> subcompose4 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-502652347, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num2) {
                        invoke(composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i22) {
                        ComposerKt.sourceInformation(composer, "C473@22415L157:Scaffold.kt#jmzs0o");
                        if (!composer.shouldExecute((i22 & 3) != 2, i22 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-502652347, i22, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:473)");
                        }
                        CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(FabPlacement.this), function24, composer, ProvidedValue.$stable);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                ArrayList arrayList10 = new ArrayList(subcompose4.size());
                size = subcompose4.size();
                for (i2 = 0; i2 < size; i2++) {
                    arrayList10.add(subcompose4.get(i2).mo7075measureBRTryo0(m8344copyZbe2FdA$default));
                }
                arrayList2 = arrayList10;
                if (arrayList2.isEmpty()) {
                    obj3 = arrayList2.get(0);
                    int height10 = ((Placeable) obj3).getHeight();
                    int lastIndex5 = CollectionsKt.getLastIndex(arrayList2);
                    if (1 <= lastIndex5) {
                        int i22 = 1;
                        while (true) {
                            Object obj14 = arrayList2.get(i22);
                            Object obj15 = obj3;
                            int height11 = ((Placeable) obj14).getHeight();
                            if (height10 < height11) {
                                height10 = height11;
                                obj3 = obj14;
                            } else {
                                obj3 = obj15;
                            }
                            if (i22 == lastIndex5) {
                                break;
                            }
                            i22++;
                        }
                    }
                } else {
                    obj3 = null;
                }
                Placeable placeable5 = (Placeable) obj3;
                Integer valueOf = placeable5 == null ? Integer.valueOf(placeable5.getHeight()) : null;
                if (fabPlacement == null) {
                    if (valueOf == null) {
                        intValue2 = fabPlacement.getHeight() + subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                        i6 = windowInsets.getBottom(subcomposeMeasureScope);
                    } else if (z) {
                        intValue2 = valueOf.intValue();
                        i6 = fabPlacement.getHeight() / 2;
                    } else {
                        intValue2 = valueOf.intValue() + fabPlacement.getHeight();
                        i6 = subcomposeMeasureScope.mo418roundToPx0680j_4(FabSpacing);
                    }
                    num = Integer.valueOf(intValue2 + i6);
                } else {
                    num = null;
                }
                if (i17 == 0) {
                    if (num != null) {
                        intValue = num.intValue();
                    } else {
                        intValue = valueOf != null ? valueOf.intValue() : windowInsets.getBottom(subcomposeMeasureScope);
                    }
                    i3 = i17 + intValue;
                } else {
                    i3 = 0;
                }
                asPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets, subcomposeMeasureScope);
                if (!arrayList6.isEmpty()) {
                    m8401constructorimpl = asPaddingValues.getTop();
                    i4 = 0;
                } else {
                    i4 = 0;
                    m8401constructorimpl = Dp.m8401constructorimpl(0);
                }
                if (!arrayList2.isEmpty() || valueOf == null) {
                    bottom = asPaddingValues.getBottom();
                } else {
                    bottom = subcomposeMeasureScope.mo421toDpu2uoSUM(valueOf.intValue());
                }
                scaffoldKt$ScaffoldLayout$contentPadding$1$1.setPaddingHolder(PaddingKt.m833PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), m8401constructorimpl, PaddingKt.calculateEndPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom));
                int i23 = m8353getMaxHeightimpl - height3;
                List<Measurable> subcompose5 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(-574531306, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num2) {
                        invoke(composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i24) {
                        ComposerKt.sourceInformation(composer, "C532@24859L23:Scaffold.kt#jmzs0o");
                        if (!composer.shouldExecute((i24 & 3) != 2, i24 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-574531306, i24, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:532)");
                        }
                        function3.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$1, composer, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                ArrayList arrayList11 = new ArrayList(subcompose5.size());
                size2 = subcompose5.size();
                i5 = i4;
                while (i5 < size2) {
                    long j = m8344copyZbe2FdA$default;
                    arrayList11.add(subcompose5.get(i5).mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(j, 0, 0, 0, i23, 7, null)));
                    i5++;
                    m8344copyZbe2FdA$default = j;
                }
                final ArrayList arrayList12 = arrayList11;
                final Integer num2 = valueOf;
                final ArrayList arrayList13 = arrayList;
                final FabPlacement fabPlacement2 = fabPlacement;
                return MeasureScope.layout$default(subcomposeMeasureScope, i13, m8353getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj16) {
                        Unit ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22;
                        ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22 = ScaffoldKt.ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22(arrayList12, arrayList6, arrayList13, arrayList2, arrayList9, height3, m8353getMaxHeightimpl, i3, num2, fabPlacement2, num, (Placeable.PlacementScope) obj16);
                        return ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22;
                    }
                }, 4, null);
            }
        }
        fabPlacement = null;
        List<Measurable> subcompose42 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-502652347, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num22) {
                invoke(composer, num22.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i222) {
                ComposerKt.sourceInformation(composer, "C473@22415L157:Scaffold.kt#jmzs0o");
                if (!composer.shouldExecute((i222 & 3) != 2, i222 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-502652347, i222, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:473)");
                }
                CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(FabPlacement.this), function24, composer, ProvidedValue.$stable);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ArrayList arrayList102 = new ArrayList(subcompose42.size());
        size = subcompose42.size();
        while (i2 < size) {
        }
        arrayList2 = arrayList102;
        if (arrayList2.isEmpty()) {
        }
        Placeable placeable52 = (Placeable) obj3;
        if (placeable52 == null) {
        }
        if (fabPlacement == null) {
        }
        if (i17 == 0) {
        }
        asPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets, subcomposeMeasureScope);
        if (!arrayList6.isEmpty()) {
        }
        if (!arrayList2.isEmpty()) {
        }
        bottom = asPaddingValues.getBottom();
        scaffoldKt$ScaffoldLayout$contentPadding$1$1.setPaddingHolder(PaddingKt.m833PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), m8401constructorimpl, PaddingKt.calculateEndPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom));
        int i232 = m8353getMaxHeightimpl - height3;
        List<Measurable> subcompose52 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(-574531306, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num22) {
                invoke(composer, num22.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i24) {
                ComposerKt.sourceInformation(composer, "C532@24859L23:Scaffold.kt#jmzs0o");
                if (!composer.shouldExecute((i24 & 3) != 2, i24 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-574531306, i24, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:532)");
                }
                function3.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$1, composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ArrayList arrayList112 = new ArrayList(subcompose52.size());
        size2 = subcompose52.size();
        i5 = i4;
        while (i5 < size2) {
        }
        final List arrayList122 = arrayList112;
        final Integer num22 = valueOf;
        final List arrayList132 = arrayList;
        final FabPlacement fabPlacement22 = fabPlacement;
        return MeasureScope.layout$default(subcomposeMeasureScope, i13, m8353getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj16) {
                Unit ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22;
                ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22 = ScaffoldKt.ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22(arrayList122, arrayList6, arrayList132, arrayList2, arrayList9, height3, m8353getMaxHeightimpl, i3, num22, fabPlacement22, num, (Placeable.PlacementScope) obj16);
                return ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22;
            }
        }, 4, null);
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScaffoldLayout_i1QSOvI$lambda$24$lambda$23$lambda$22(List list, List list2, List list3, List list4, List list5, int i, int i2, int i3, Integer num, FabPlacement fabPlacement, Integer num2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(i4), 0, i, 0.0f, 4, null);
        }
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list2.get(i5), 0, 0, 0.0f, 4, null);
        }
        int size3 = list3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list3.get(i6), 0, i2 - i3, 0.0f, 4, null);
        }
        int size4 = list4.size();
        for (int i7 = 0; i7 < size4; i7++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list4.get(i7), 0, i2 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
        }
        int size5 = list5.size();
        for (int i8 = 0; i8 < size5; i8++) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list5.get(i8), fabPlacement != null ? fabPlacement.getLeft() : 0, i2 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
