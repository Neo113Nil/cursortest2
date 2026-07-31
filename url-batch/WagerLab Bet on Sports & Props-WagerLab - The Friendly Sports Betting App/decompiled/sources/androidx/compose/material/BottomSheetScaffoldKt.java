package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import io.branch.referral.BranchError;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001aý\u0001\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u00152\u0019\b\u0002\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020&2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b-\u0010.\u001ao\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020$2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001c\u0010+\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b1\u00102\u001a\u0098\u0001\u00103\u001a\u00020\u00122\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u00152\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\b\u00152\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\b\u00152\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001b¢\u0006\u0002\b\u00152\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00120\u001b¢\u0006\u0002\b\u00152\u0006\u0010(\u001a\u00020$2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u0001H\u0003¢\u0006\u0004\b8\u00109\u001a\u001c\u0010:\u001a\u00020;2\n\u00100\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010=\u001a\u00020>H\u0002\"\u0010\u0010?\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010A\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010@\"\u0010\u0010B\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010@¨\u0006C"}, d2 = {"rememberBottomSheetState", "Landroidx/compose/material/BottomSheetState;", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "rememberBottomSheetScaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "bottomSheetState", "snackbarHostState", "Landroidx/compose/material/SnackbarHostState;", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "BottomSheetScaffold", "", "sheetContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "topBar", "Lkotlin/Function0;", "snackbarHost", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetGesturesEnabled", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-HnlDQGw", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheet", "state", "BottomSheet-dAqlCkY", "(Landroidx/compose/material/BottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetScaffoldLayout", "body", "bottomSheet", "sheetOffset", "sheetState", "BottomSheetScaffoldLayout-HJHHjMs", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;ILandroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "FabSpacing", "F", "BottomSheetScaffoldPositionalThreshold", "BottomSheetScaffoldVelocityThreshold", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m8401constructorimpl(16);
    private static final float BottomSheetScaffoldPositionalThreshold = Dp.m8401constructorimpl(56);
    private static final float BottomSheetScaffoldVelocityThreshold = Dp.m8401constructorimpl(125);

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomSheetValue.values().length];
            try {
                iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomSheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffoldLayout_HJHHjMs$lambda$17(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, float f, Function0 function0, int i, BottomSheetState bottomSheetState, int i2, Composer composer, int i3) {
        m1912BottomSheetScaffoldLayoutHJHHjMs(function2, function22, function23, function24, function25, f, function0, i, bottomSheetState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetScaffold_HnlDQGw$lambda$6(Function3 function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2 function2, Function3 function32, Function2 function22, int i, boolean z, Shape shape, float f, long j, long j2, float f2, long j3, long j4, Function3 function33, int i2, int i3, int i4, Composer composer, int i5) {
        m1911BottomSheetScaffoldHnlDQGw(function3, modifier, bottomSheetScaffoldState, function2, function32, function22, i, z, shape, f, j, j2, f2, j3, j4, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_dAqlCkY$lambda$15(BottomSheetState bottomSheetState, boolean z, Shape shape, float f, long j, long j2, float f2, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1910BottomSheetdAqlCkY(bottomSheetState, z, shape, f, j, j2, f2, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberBottomSheetState$lambda$1$lambda$0(BottomSheetValue bottomSheetValue) {
        return true;
    }

    public static final BottomSheetState rememberBottomSheetState(final BottomSheetValue bottomSheetValue, final AnimationSpec<Float> animationSpec, final Function1<? super BottomSheetValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1808153344, "C(rememberBottomSheetState)N(initialValue,animationSpec,confirmStateChange)223@8800L8,225@8863L7,234@9135L211,226@8882L464:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -1826384280, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberBottomSheetState$lambda$1$lambda$0;
                        rememberBottomSheetState$lambda$1$lambda$0 = BottomSheetScaffoldKt.rememberBottomSheetState$lambda$1$lambda$0((BottomSheetValue) obj);
                        return Boolean.valueOf(rememberBottomSheetState$lambda$1$lambda$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume;
        Object[] objArr = {animationSpec};
        Saver<BottomSheetState, ?> Saver = BottomSheetState.INSTANCE.Saver(animationSpec, function1, density);
        ComposerKt.sourceInformationMarkerStart(composer, -1826373357, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean z = true;
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(bottomSheetValue.ordinal())) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(animationSpec);
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(function1)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = changed | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BottomSheetState rememberBottomSheetState$lambda$3$lambda$2;
                    rememberBottomSheetState$lambda$3$lambda$2 = BottomSheetScaffoldKt.rememberBottomSheetState$lambda$3$lambda$2(BottomSheetValue.this, density, animationSpec, function1);
                    return rememberBottomSheetState$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m5103rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetState rememberBottomSheetState$lambda$3$lambda$2(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1) {
        return new BottomSheetState(bottomSheetValue, density, animationSpec, function1);
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Composer composer2;
        ComposerKt.sourceInformationMarkerStart(composer, -1022285988, "C(rememberBottomSheetScaffoldState)N(bottomSheetState,snackbarHostState)264@10031L35,265@10111L32,267@10186L197:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            composer2 = composer;
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer2, 6, 6);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer2, 1130681820, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022285988, i, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        ComposerKt.sourceInformationMarkerStart(composer2, 1130684385, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer2.changed(bottomSheetState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i & 48) == 32);
        Object rememberedValue2 = composer2.rememberedValue();
        if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer2.updateRememberedValue(rememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        return bottomSheetScaffoldState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
    
        if (r4.changed(r53) == false) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
    /* renamed from: BottomSheetScaffold-HnlDQGw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1911BottomSheetScaffoldHnlDQGw(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z, Shape shape, float f, long j, long j2, float f2, long j3, long j4, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i6;
        int i7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i9;
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        long j5;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Shape shape2;
        final long j6;
        final long j7;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final int i14;
        final Modifier modifier3;
        final BottomSheetScaffoldState bottomSheetScaffoldState3;
        final boolean z3;
        final float f3;
        final long j8;
        final long j9;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        int m2033getEnd5ygKITE;
        CornerBasedShape cornerBasedShape;
        float f5;
        boolean z4;
        long j10;
        long j11;
        float f6;
        int i15;
        float f7;
        long j12;
        long j13;
        long j14;
        int i16;
        float f8;
        int i17;
        int i18;
        int i19;
        int i20;
        Composer startRestartGroup = composer.startRestartGroup(194495313);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffold)N(sheetContent,modifier,scaffoldState,topBar,snackbarHost,floatingActionButton,floatingActionButtonPosition:c#material.FabPosition,sheetGesturesEnabled,sheetShape,sheetElevation:c#ui.unit.Dp,sheetBackgroundColor:c#ui.graphics.Color,sheetContentColor:c#ui.graphics.Color,sheetPeekHeight:c#ui.unit.Dp,backgroundColor:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,content)337@14316L1792,337@14230L1878:BottomSheetScaffold.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i21 = i4 & 2;
        if (i21 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    if (startRestartGroup.changed(bottomSheetScaffoldState2)) {
                        i20 = 256;
                        i5 |= i20;
                    }
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i20 = 128;
                i5 |= i20;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                i7 = i4 & 16;
                int i22 = 16384;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function34 = function32;
                    i5 |= startRestartGroup.changedInstance(function34) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function23 = function22;
                    } else {
                        function23 = function22;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
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
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i4 & 256) == 0 && startRestartGroup.changed(shape)) {
                            i19 = 67108864;
                            i5 |= i19;
                        }
                        i19 = 33554432;
                        i5 |= i19;
                    }
                    if ((i2 & 805306368) == 0) {
                        if ((i4 & 512) == 0 && startRestartGroup.changed(f)) {
                            i18 = C.BUFFER_FLAG_LAST_SAMPLE;
                            i5 |= i18;
                        }
                        i18 = 268435456;
                        i5 |= i18;
                    }
                    if ((i3 & 6) != 0) {
                        i12 = i3 | (((i4 & 1024) == 0 && startRestartGroup.changed(j)) ? 4 : 2);
                    } else {
                        i12 = i3;
                    }
                    if ((i3 & 48) != 0) {
                        i12 |= ((i4 & 2048) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
                    }
                    int i23 = i12;
                    if ((i3 & 384) != 0) {
                        if ((i4 & 4096) == 0 && startRestartGroup.changed(f2)) {
                            i17 = 256;
                            i13 = i23 | i17;
                        }
                        i17 = 128;
                        i13 = i23 | i17;
                    } else {
                        i13 = i23;
                    }
                    if ((i3 & 3072) != 0) {
                        j5 = j3;
                        i13 |= ((i4 & 8192) == 0 && startRestartGroup.changed(j5)) ? 2048 : 1024;
                    } else {
                        j5 = j3;
                    }
                    if ((i3 & 24576) == 0) {
                        if ((i4 & 16384) != 0) {
                        }
                        i22 = 8192;
                        i13 |= i22;
                    }
                    if ((i4 & 32768) == 0) {
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i13 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
                    }
                    if (!startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i13 & 74899) != 74898, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "322@13393L34,328@13762L6,330@13893L6,331@13940L37,333@14093L6,334@14138L32");
                        if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            if ((i4 & 512) != 0) {
                                i5 &= -1879048193;
                            }
                            if ((i4 & 1024) != 0) {
                                i13 &= -15;
                            }
                            if ((i4 & 2048) != 0) {
                                i13 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                            }
                            i15 = i13;
                            if ((i4 & 4096) != 0) {
                                i15 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i15 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i15 &= -57345;
                            }
                            f5 = f;
                            j11 = j2;
                            f7 = f2;
                            j12 = j4;
                            j13 = j5;
                            i16 = i5;
                            m2033getEnd5ygKITE = i10;
                            cornerBasedShape = shape;
                            j14 = j;
                        } else {
                            if (i21 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                                bottomSheetScaffoldState2 = rememberBottomSheetScaffoldState(null, null, startRestartGroup, 0, 3);
                            }
                            Function2<? super Composer, ? super Integer, Unit> function26 = i6 != 0 ? null : function2;
                            if (i7 != 0) {
                                function34 = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$937349512$material();
                            }
                            if (i8 != 0) {
                                function23 = null;
                            }
                            m2033getEnd5ygKITE = i9 != 0 ? FabPosition.INSTANCE.m2033getEnd5ygKITE() : i10;
                            if (i11 != 0) {
                                z2 = true;
                            }
                            if ((i4 & 256) != 0) {
                                cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                                i5 &= -234881025;
                            } else {
                                cornerBasedShape = shape;
                            }
                            if ((i4 & 512) != 0) {
                                f5 = BottomSheetScaffoldDefaults.INSTANCE.m1904getSheetElevationD9Ej5fM();
                                i5 &= -1879048193;
                            } else {
                                f5 = f;
                            }
                            if ((i4 & 1024) != 0) {
                                i13 &= -15;
                                z4 = z2;
                                j10 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                            } else {
                                z4 = z2;
                                j10 = j;
                            }
                            if ((i4 & 2048) != 0) {
                                j11 = ColorsKt.m1971contentColorForek8zF_U(j10, startRestartGroup, i13 & 14);
                                i13 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                            } else {
                                j11 = j2;
                            }
                            int i24 = i13;
                            function2 = function26;
                            if ((i4 & 4096) != 0) {
                                f6 = BottomSheetScaffoldDefaults.INSTANCE.m1905getSheetPeekHeightD9Ej5fM();
                                i24 &= -897;
                            } else {
                                f6 = f2;
                            }
                            float f9 = f6;
                            if ((i4 & 8192) != 0) {
                                j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1946getBackground0d7_KjU();
                                i15 = i24 & (-7169);
                            } else {
                                i15 = i24;
                            }
                            if ((i4 & 16384) != 0) {
                                long m1971contentColorForek8zF_U = ColorsKt.m1971contentColorForek8zF_U(j5, startRestartGroup, (i15 >> 9) & 14);
                                i15 &= -57345;
                                f7 = f9;
                                j12 = m1971contentColorForek8zF_U;
                            } else {
                                f7 = f9;
                                j12 = j4;
                            }
                            j13 = j5;
                            j14 = j10;
                            z2 = z4;
                            i16 = i5;
                        }
                        int i25 = i15;
                        Function2<? super Composer, ? super Integer, Unit> function27 = function2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            f8 = f5;
                            ComposerKt.traceEventStart(194495313, i16, i25, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                        } else {
                            f8 = f5;
                        }
                        float f10 = f7;
                        long j15 = j14;
                        long j16 = j11;
                        float f11 = f8;
                        int i26 = i25 >> 3;
                        long j17 = j13;
                        long j18 = j12;
                        SurfaceKt.m2169SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j17, j18, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-747577963, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1(bottomSheetScaffoldState2, function27, function23, f10, m2033getEnd5ygKITE, function33, z2, cornerBasedShape, f8, j15, j16, function3, function34), startRestartGroup, 54), startRestartGroup, (i26 & 7168) | (i26 & 896) | 1572864, 50);
                        composer2 = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function24 = function27;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                        z3 = z2;
                        j6 = j18;
                        j9 = j16;
                        f4 = f10;
                        function25 = function23;
                        f3 = f11;
                        function35 = function34;
                        i14 = m2033getEnd5ygKITE;
                        shape2 = cornerBasedShape;
                        modifier3 = modifier2;
                        j8 = j15;
                        j7 = j17;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        function24 = function2;
                        shape2 = shape;
                        j6 = j4;
                        j7 = j5;
                        function35 = function34;
                        function25 = function23;
                        i14 = i10;
                        modifier3 = modifier2;
                        bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                        z3 = z2;
                        f3 = f;
                        j8 = j;
                        j9 = j2;
                        f4 = f2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BottomSheetScaffold_HnlDQGw$lambda$6;
                                BottomSheetScaffold_HnlDQGw$lambda$6 = BottomSheetScaffoldKt.BottomSheetScaffold_HnlDQGw$lambda$6(Function3.this, modifier3, bottomSheetScaffoldState3, function24, function35, function25, i14, z3, shape2, f3, j8, j9, f4, j7, j6, function33, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                return BottomSheetScaffold_HnlDQGw$lambda$6;
                            }
                        });
                        return;
                    }
                    return;
                }
                function34 = function32;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i11 = i4 & 128;
                if (i11 == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                if ((i3 & 6) != 0) {
                }
                if ((i3 & 48) != 0) {
                }
                int i232 = i12;
                if ((i3 & 384) != 0) {
                }
                if ((i3 & 3072) != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i4 & 32768) == 0) {
                }
                if (!startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i13 & 74899) != 74898, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            int i222 = 16384;
            if (i7 != 0) {
            }
            function34 = function32;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i11 = i4 & 128;
            if (i11 == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if ((i3 & 6) != 0) {
            }
            if ((i3 & 48) != 0) {
            }
            int i2322 = i12;
            if ((i3 & 384) != 0) {
            }
            if ((i3 & 3072) != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i4 & 32768) == 0) {
            }
            if (!startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i13 & 74899) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2222 = 16384;
        if (i7 != 0) {
        }
        function34 = function32;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i11 = i4 & 128;
        if (i11 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if ((i3 & 48) != 0) {
        }
        int i23222 = i12;
        if ((i3 & 384) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i4 & 32768) == 0) {
        }
        if (!startRestartGroup.shouldExecute((306783379 & i5) == 306783378 || (i13 & 74899) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a8  */
    /* renamed from: BottomSheet-dAqlCkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1910BottomSheetdAqlCkY(final BottomSheetState bottomSheetState, final boolean z, final Shape shape, final float f, final long j, final long j2, final float f2, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-426833549);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheet)N(state,sheetGesturesEnabled,sheetShape,sheetElevation:c#ui.unit.Dp,sheetBackgroundColor:c#ui.graphics.Color,sheetContentColor:c#ui.graphics.Color,sheetPeekHeight:c#ui.unit.Dp,modifier,content)388@16491L24,389@16557L7,392@16705L816,415@17745L893,440@18802L29,390@16597L2241:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(bottomSheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(shape) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(j) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                    }
                    i4 = i2 & 128;
                    if (i4 == 0) {
                        i3 |= 12582912;
                        i5 = 1572864;
                        modifier2 = modifier;
                    } else {
                        i5 = 1572864;
                        modifier2 = modifier;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
                    }
                    if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                    } else {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-426833549, i3, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float mo424toPx0680j_4 = ((Density) consume).mo424toPx0680j_4(f2);
                        AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material = bottomSheetState.getAnchoredDraggableState$material();
                        Orientation orientation = Orientation.Vertical;
                        int i6 = i3;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2129839619, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                        int i7 = i6 & 14;
                        boolean changed = startRestartGroup.changed(mo424toPx0680j_4) | (i7 == 4);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Pair BottomSheet_dAqlCkY$lambda$10$lambda$9;
                                    BottomSheet_dAqlCkY$lambda$10$lambda$9 = BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$10$lambda$9(BottomSheetState.this, mo424toPx0680j_4, (IntSize) obj, (Constraints) obj2);
                                    return BottomSheet_dAqlCkY$lambda$10$lambda$9;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifier2, anchoredDraggableState$material, orientation, (Function2) rememberedValue2), bottomSheetState.getAnchoredDraggableState$material(), Orientation.Vertical, z, false, null, false, 56, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2129872976, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                        boolean changedInstance = (i7 == 4) | startRestartGroup.changedInstance(coroutineScope);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit BottomSheet_dAqlCkY$lambda$14$lambda$13;
                                    BottomSheet_dAqlCkY$lambda$14$lambda$13 = BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$14$lambda$13(BottomSheetState.this, coroutineScope, (SemanticsPropertyReceiver) obj);
                                    return BottomSheet_dAqlCkY$lambda$14$lambda$13;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i8 = i6 >> 6;
                        int i9 = ((i6 >> 3) & 112) | i5 | (i8 & 896) | (i8 & 7168) | (458752 & (i6 << 6));
                        composer2 = startRestartGroup;
                        SurfaceKt.m2169SurfaceFjzlyU(SemanticsModifierKt.semantics$default(anchoredDraggable$default, false, (Function1) rememberedValue3, 1, null), shape, j, j2, null, f, ComposableLambdaKt.rememberComposableLambda(1065607095, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                ComposerKt.sourceInformation(composer3, "C440@18804L25:BottomSheetScaffold.kt#jmzs0o");
                                if (composer3.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1065607095, i10, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:440)");
                                    }
                                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
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
                                    function32.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), composer2, i9, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit BottomSheet_dAqlCkY$lambda$15;
                                BottomSheet_dAqlCkY$lambda$15 = BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$15(BottomSheetState.this, z, shape, f, j, j2, f2, modifier2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return BottomSheet_dAqlCkY$lambda$15;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                i4 = i2 & 128;
                if (i4 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i4 = i2 & 128;
            if (i4 == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair BottomSheet_dAqlCkY$lambda$10$lambda$9(BottomSheetState bottomSheetState, final float f, IntSize intSize, Constraints constraints) {
        BottomSheetValue bottomSheetValue;
        final int m8353getMaxHeightimpl = Constraints.m8353getMaxHeightimpl(constraints.getValue());
        final float m8576unboximpl = (int) (intSize.m8576unboximpl() & 4294967295L);
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomSheet_dAqlCkY$lambda$10$lambda$9$lambda$8;
                BottomSheet_dAqlCkY$lambda$10$lambda$9$lambda$8 = BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$10$lambda$9$lambda$8(m8353getMaxHeightimpl, f, m8576unboximpl, (DraggableAnchorsConfig) obj);
                return BottomSheet_dAqlCkY$lambda$10$lambda$9$lambda$8;
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getAnchoredDraggableState$material().getTargetValue().ordinal()];
        if (i == 1) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bottomSheetValue = DraggableAnchors.hasAnchorFor(BottomSheetValue.Expanded) ? BottomSheetValue.Expanded : BottomSheetValue.Collapsed;
        }
        return TuplesKt.to(DraggableAnchors, bottomSheetValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_dAqlCkY$lambda$10$lambda$9$lambda$8(int i, float f, float f2, DraggableAnchorsConfig draggableAnchorsConfig) {
        float f3 = i;
        draggableAnchorsConfig.at(BottomSheetValue.Collapsed, f3 - f);
        if (f2 > 0.0f && f2 != f) {
            draggableAnchorsConfig.at(BottomSheetValue.Expanded, f3 - f2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_dAqlCkY$lambda$14$lambda$13(final BottomSheetState bottomSheetState, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (bottomSheetState.getAnchoredDraggableState$material().getAnchors().getSize() > 1) {
            if (bottomSheetState.isCollapsed()) {
                SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$11;
                        BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$11 = BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$11(BottomSheetState.this, coroutineScope);
                        return Boolean.valueOf(BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$11);
                    }
                }, 1, null);
            } else {
                SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$12;
                        BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$12 = BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$12(BottomSheetState.this, coroutineScope);
                        return Boolean.valueOf(BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$12);
                    }
                }, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$11(BottomSheetState bottomSheetState, CoroutineScope coroutineScope) {
        if (!bottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(BottomSheetValue.Expanded).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$BottomSheet$2$1$1$1(bottomSheetState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomSheet_dAqlCkY$lambda$14$lambda$13$lambda$12(BottomSheetState bottomSheetState, CoroutineScope coroutineScope) {
        if (!bottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(BottomSheetValue.Collapsed).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetScaffoldKt$BottomSheet$2$1$2$1(bottomSheetState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomSheetScaffoldLayout-HJHHjMs, reason: not valid java name */
    public static final void m1912BottomSheetScaffoldLayoutHJHHjMs(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, final float f, final Function0<Float> function0, final int i, final BottomSheetState bottomSheetState, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(757616750);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomSheetScaffoldLayout)N(topBar,body,bottomSheet,floatingActionButton,snackbarHost,sheetPeekHeight:c#ui.unit.Dp,sheetOffset,floatingActionButtonPosition:c#material.FabPosition,sheetState)479@20010L2783,470@19764L3029:BottomSheetScaffold.kt#jmzs0o");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= startRestartGroup.changed(bottomSheetState) ? 67108864 : 33554432;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(757616750, i3, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            Function2[] function2Arr = new Function2[5];
            function2Arr[0] = function2 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1976getLambda$505419337$material() : function2;
            function2Arr[1] = function22;
            function2Arr[2] = function23;
            function2Arr[3] = function24 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$687232378$material() : function24;
            function2Arr[4] = function25;
            List listOf = CollectionsKt.listOf((Object[]) function2Arr);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2074718739, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            boolean z = ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((458752 & i3) == 131072) | ((i3 & 234881024) == 67108864);
            BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function0, i, f, bottomSheetState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1399185516, "CC(Layout)P(!1,2)168@6883L62,165@6769L182:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -290764973, "CC(remember):Layout.kt#9igjgp");
            boolean changed = startRestartGroup.changed(multiContentMeasurePolicy);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
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
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomSheetScaffoldLayout_HJHHjMs$lambda$17;
                    BottomSheetScaffoldLayout_HJHHjMs$lambda$17 = BottomSheetScaffoldKt.BottomSheetScaffoldLayout_HJHHjMs$lambda$17(Function2.this, function22, function23, function24, function25, f, function0, i, bottomSheetState, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomSheetScaffoldLayout_HJHHjMs$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }
}
