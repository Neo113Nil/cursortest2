package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
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
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0090\u0001\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b \u0010!\u001a\u0014\u0010\"\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\u001a-\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u001f2\u0006\u0010&\u001a\u00020\tH\u0003¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010)\u001a\u00020*2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010-\u001a\u00020.H\u0002\"\u0010\u0010/\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00101\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00102\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u00100¨\u00063²\u0006\n\u00104\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"rememberModalBottomSheetState", "Landroidx/compose/material/ModalBottomSheetState;", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "ModalBottomSheetLayout", "", "sheetContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "sheetGesturesEnabled", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalBottomSheetLayout-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "modalBottomSheetAnchors", "Scrim", "color", "onDismiss", ViewProps.VISIBLE, "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "ModalBottomSheetPositionalThreshold", "F", "ModalBottomSheetVelocityThreshold", "MaxModalBottomSheetWidth", "material", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float ModalBottomSheetPositionalThreshold = Dp.m8401constructorimpl(56);
    private static final float ModalBottomSheetVelocityThreshold = Dp.m8401constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m8401constructorimpl(640);

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetLayout_Gs3lGvM$lambda$14(Function3 function3, Modifier modifier, ModalBottomSheetState modalBottomSheetState, boolean z, Shape shape, float f, long j, long j2, long j3, Function2 function2, int i, int i2, Composer composer, int i3) {
        m2066ModalBottomSheetLayoutGs3lGvM(function3, modifier, modalBottomSheetState, z, shape, f, j, j2, j3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_3J_VO9M$lambda$24(long j, Function0 function0, boolean z, int i, Composer composer, int i2) {
        m2067Scrim3JVO9M(j, function0, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberModalBottomSheetState$lambda$1$lambda$0(ModalBottomSheetValue modalBottomSheetValue) {
        return true;
    }

    public static final ModalBottomSheetState rememberModalBottomSheetState(final ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -126412120, "C(rememberModalBottomSheetState)N(initialValue,animationSpec,confirmValueChange,skipHalfExpanded)275@11458L8,278@11565L7:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            animationSpec = ModalBottomSheetDefaults.INSTANCE.getAnimationSpec();
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -1222955632, "CC(remember):ModalBottomSheet.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberModalBottomSheetState$lambda$1$lambda$0;
                        rememberModalBottomSheetState$lambda$1$lambda$0 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$1$lambda$0((ModalBottomSheetValue) obj);
                        return Boolean.valueOf(rememberModalBottomSheetState$lambda$1$lambda$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        final Function1<? super ModalBottomSheetValue, Boolean> function12 = function1;
        final boolean z2 = (i2 & 8) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume;
        composer.startMovableGroup(-1222943993, modalBottomSheetValue);
        ComposerKt.sourceInformation(composer, "296@12260L299,283@11826L733");
        Object[] objArr = {modalBottomSheetValue, animationSpec2, Boolean.valueOf(z2), function12, density};
        Saver<ModalBottomSheetState, ?> Saver = ModalBottomSheetState.INSTANCE.Saver(animationSpec2, function12, z2, density);
        ComposerKt.sourceInformationMarkerStart(composer, -1222929677, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean z3 = true;
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(modalBottomSheetValue.ordinal())) || (i & 6) == 4) | composer.changed(density) | ((((i & 896) ^ 384) > 256 && composer.changed(function12)) || (i & 384) == 256) | composer.changedInstance(animationSpec2);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(z2)) && (i & 3072) != 2048) {
            z3 = false;
        }
        boolean z4 = changed | z3;
        Object rememberedValue2 = composer.rememberedValue();
        if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ModalBottomSheetState rememberModalBottomSheetState$lambda$3$lambda$2;
                    rememberModalBottomSheetState$lambda$3$lambda$2 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$3$lambda$2(ModalBottomSheetValue.this, density, function12, animationSpec2, z2);
                    return rememberModalBottomSheetState$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue2 = obj;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m5103rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue2, composer, 0);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return modalBottomSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModalBottomSheetState rememberModalBottomSheetState$lambda$3$lambda$2(ModalBottomSheetValue modalBottomSheetValue, Density density, Function1 function1, AnimationSpec animationSpec, boolean z) {
        return new ModalBottomSheetState(modalBottomSheetValue, density, function1, animationSpec, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0260  */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2066ModalBottomSheetLayoutGs3lGvM(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, ModalBottomSheetState modalBottomSheetState, boolean z, Shape shape, float f, long j, long j2, long j3, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        ModalBottomSheetState modalBottomSheetState2;
        int i4;
        boolean z2;
        Shape shape2;
        float f2;
        int i5;
        long j4;
        int i6;
        int i7;
        final Modifier modifier2;
        final ModalBottomSheetState modalBottomSheetState3;
        Composer composer2;
        final long j5;
        final boolean z3;
        final Shape shape3;
        final float f3;
        final long j6;
        final long j7;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        final ModalBottomSheetState modalBottomSheetState4;
        CornerBasedShape cornerBasedShape;
        float f4;
        long j8;
        long j9;
        Shape shape4;
        float f5;
        long j10;
        long j11;
        long scrimColor;
        int i8;
        int i9;
        ?? r1;
        Object rememberedValue;
        final CoroutineScope coroutineScope;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4976constructorimpl2;
        boolean changedInstance;
        Object rememberedValue2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        boolean z5;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-336264970);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalBottomSheetLayout)N(sheetContent,modifier,sheetState,sheetGesturesEnabled,sheetShape,sheetElevation:c#ui.unit.Dp,sheetBackgroundColor:c#ui.graphics.Color,sheetContentColor:c#ui.graphics.Color,scrimColor:c#ui.graphics.Color,content)353@15034L24,355@15106L3927:ModalBottomSheet.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    modalBottomSheetState2 = modalBottomSheetState;
                    if (startRestartGroup.changedInstance(modalBottomSheetState2)) {
                        i12 = 256;
                        i3 |= i12;
                    }
                } else {
                    modalBottomSheetState2 = modalBottomSheetState;
                }
                i12 = 128;
                i3 |= i12;
            } else {
                modalBottomSheetState2 = modalBottomSheetState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                }
            }
            if ((i & 24576) != 0) {
                shape2 = shape;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(shape2)) ? 16384 : 8192;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (startRestartGroup.changed(f2)) {
                        i11 = 131072;
                        i3 |= i11;
                    }
                } else {
                    f2 = f;
                }
                i11 = 65536;
                i3 |= i11;
            } else {
                f2 = f;
            }
            if ((i & 1572864) != 0) {
                i5 = i4;
                j4 = j;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
            } else {
                i5 = i4;
                j4 = j;
            }
            if ((12582912 & i) == 0) {
                i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i6 = i13;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 67108864;
                        i3 |= i10;
                    }
                } else {
                    i6 = i13;
                }
                i10 = 33554432;
                i3 |= i10;
            } else {
                i6 = i13;
            }
            if ((i2 & 512) == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            }
            i7 = i3;
            if (!startRestartGroup.shouldExecute((306783379 & i7) == 306783378, i7 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "344@14588L37,346@14707L6,348@14830L6,349@14877L37,350@14965L10");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i7 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        i7 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i7 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i7 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i7 &= -29360129;
                    }
                    if ((i2 & 256) != 0) {
                        i7 &= -234881025;
                    }
                    j11 = j2;
                    z5 = false;
                    modalBottomSheetState4 = modalBottomSheetState2;
                    f5 = f2;
                    j10 = j4;
                    shape4 = shape2;
                } else {
                    Modifier.Companion companion3 = i6 != 0 ? Modifier.INSTANCE : modifier;
                    if ((i2 & 4) != 0) {
                        modifier = companion3;
                        z4 = false;
                        modalBottomSheetState4 = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, false, startRestartGroup, 6, 14);
                        i7 &= -897;
                    } else {
                        modifier = companion3;
                        z4 = false;
                        modalBottomSheetState4 = modalBottomSheetState2;
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getLarge();
                        i7 &= -57345;
                    } else {
                        cornerBasedShape = shape2;
                    }
                    if ((i2 & 32) != 0) {
                        f4 = ModalBottomSheetDefaults.INSTANCE.m2060getElevationD9Ej5fM();
                        i7 &= -458753;
                    } else {
                        f4 = f;
                    }
                    if ((i2 & 64) != 0) {
                        j8 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                        i7 &= -3670017;
                    } else {
                        j8 = j4;
                    }
                    if ((i2 & 128) != 0) {
                        j9 = ColorsKt.m1971contentColorForek8zF_U(j8, startRestartGroup, (i7 >> 18) & 14);
                        i7 &= -29360129;
                    } else {
                        j9 = j2;
                    }
                    if ((i2 & 256) != 0) {
                        shape4 = cornerBasedShape;
                        f5 = f4;
                        scrimColor = ModalBottomSheetDefaults.INSTANCE.getScrimColor(startRestartGroup, z4 ? 1 : 0);
                        i8 = i7 & (-234881025);
                        j10 = j8;
                        j11 = j9;
                        i9 = -336264970;
                        r1 = z4;
                        Modifier modifier3 = modifier;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i9, i8, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        coroutineScope = (CoroutineScope) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Orientation orientation = Orientation.Vertical;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r1);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, r1);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        long j12 = scrimColor;
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
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 350779258, "C356@15130L431,437@18973L54,368@15570L3457:ModalBottomSheet.kt#jmzs0o");
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1832269826, "C357@15172L9,360@15265L188,358@15194L357:ModalBottomSheet.kt#jmzs0o");
                        function2.invoke(startRestartGroup, Integer.valueOf((i8 >> 27) & 14));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -751839354, "CC(remember):ModalBottomSheet.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(modalBottomSheetState4) | startRestartGroup.changedInstance(coroutineScope);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4;
                                    ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4 = ModalBottomSheetKt.ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4(ModalBottomSheetState.this, coroutineScope);
                                    return ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        Function0 function0 = (Function0) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        m2067Scrim3JVO9M(j12, function0, modalBottomSheetState4.getAnchoredDraggableState$material().getTargetValue() == ModalBottomSheetValue.Hidden, startRestartGroup, (i8 >> 24) & 14);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i14 = i8;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m896widthInVpY3zN4$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                        if (!z2) {
                            startRestartGroup.startReplaceGroup(351375666);
                            ComposerKt.sourceInformation(startRestartGroup, "375@15915L355");
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState$material = modalBottomSheetState4.getAnchoredDraggableState$material();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1258263027, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            boolean changed = startRestartGroup.changed(anchoredDraggableState$material);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(modalBottomSheetState4.getAnchoredDraggableState$material(), orientation);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            companion = NestedScrollModifierKt.nestedScroll$default(companion4, (NestedScrollConnection) rememberedValue3, null, 2, null);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1258275768);
                            startRestartGroup.endReplaceGroup();
                            companion = Modifier.INSTANCE;
                        }
                        Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(modalBottomSheetAnchors(fillMaxWidth$default.then(companion), modalBottomSheetState4), modalBottomSheetState4.getAnchoredDraggableState$material(), orientation, (z2 || modalBottomSheetState4.getAnchoredDraggableState$material().getCurrentValue() == ModalBottomSheetValue.Hidden) ? false : true, false, null, false, 56, null);
                        if (!z2) {
                            startRestartGroup.startReplaceGroup(352377090);
                            ComposerKt.sourceInformation(startRestartGroup, "394@16846L1901");
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1258294365, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            boolean changedInstance2 = startRestartGroup.changedInstance(modalBottomSheetState4) | startRestartGroup.changedInstance(coroutineScope);
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11;
                                        ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11 = ModalBottomSheetKt.ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11(ModalBottomSheetState.this, coroutineScope, (SemanticsPropertyReceiver) obj);
                                        return ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            companion2 = SemanticsModifierKt.semantics$default(companion5, false, (Function1) rememberedValue4, 1, null);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1258354200);
                            startRestartGroup.endReplaceGroup();
                            companion2 = Modifier.INSTANCE;
                        }
                        int i15 = i14 >> 12;
                        SurfaceKt.m2169SurfaceFjzlyU(anchoredDraggable$default.then(companion2), shape4, j10, j11, null, f5, ComposableLambdaKt.rememberComposableLambda(-1557535116, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i16) {
                                ComposerKt.sourceInformation(composer3, "C438@18987L30:ModalBottomSheet.kt#jmzs0o");
                                if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1557535116, i16, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
                                }
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion6);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer3);
                                Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m4976constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                function32.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i14 >> 9) & 112) | 1572864 | (i15 & 896) | (i15 & 7168) | (i14 & 458752), 16);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modalBottomSheetState3 = modalBottomSheetState4;
                        composer2 = startRestartGroup;
                        z3 = z2;
                        shape3 = shape4;
                        j5 = j10;
                        f3 = f5;
                        modifier2 = modifier3;
                        j7 = j12;
                        j6 = j11;
                    } else {
                        shape4 = cornerBasedShape;
                        f5 = f4;
                        j10 = j8;
                        j11 = j9;
                        z5 = z4;
                    }
                }
                i9 = -336264970;
                scrimColor = j3;
                i8 = i7;
                r1 = z5;
                Modifier modifier32 = modifier;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                coroutineScope = (CoroutineScope) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Orientation orientation2 = Orientation.Vertical;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r1);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, r1);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier32);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                long j122 = scrimColor;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 350779258, "C356@15130L431,437@18973L54,368@15570L3457:ModalBottomSheet.kt#jmzs0o");
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl2.getInserting()) {
                }
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1832269826, "C357@15172L9,360@15265L188,358@15194L357:ModalBottomSheet.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf((i8 >> 27) & 14));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -751839354, "CC(remember):ModalBottomSheet.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(modalBottomSheetState4) | startRestartGroup.changedInstance(coroutineScope);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4;
                        ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4 = ModalBottomSheetKt.ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4(ModalBottomSheetState.this, coroutineScope);
                        return ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                Function0 function02 = (Function0) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                m2067Scrim3JVO9M(j122, function02, modalBottomSheetState4.getAnchoredDraggableState$material().getTargetValue() == ModalBottomSheetValue.Hidden, startRestartGroup, (i8 >> 24) & 14);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i142 = i8;
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m896widthInVpY3zN4$default(boxScopeInstance3.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopCenter()), 0.0f, MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
                if (!z2) {
                }
                Modifier anchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(modalBottomSheetAnchors(fillMaxWidth$default2.then(companion), modalBottomSheetState4), modalBottomSheetState4.getAnchoredDraggableState$material(), orientation2, (z2 || modalBottomSheetState4.getAnchoredDraggableState$material().getCurrentValue() == ModalBottomSheetValue.Hidden) ? false : true, false, null, false, 56, null);
                if (!z2) {
                }
                int i152 = i142 >> 12;
                SurfaceKt.m2169SurfaceFjzlyU(anchoredDraggable$default2.then(companion2), shape4, j10, j11, null, f5, ComposableLambdaKt.rememberComposableLambda(-1557535116, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i16) {
                        ComposerKt.sourceInformation(composer3, "C438@18987L30:ModalBottomSheet.kt#jmzs0o");
                        if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1557535116, i16, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
                        }
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, companion6);
                        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor32);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer3);
                        Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4976constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4976constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                        }
                        Updater.m4983setimpl(m4976constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        function32.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i142 >> 9) & 112) | 1572864 | (i152 & 896) | (i152 & 7168) | (i142 & 458752), 16);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modalBottomSheetState3 = modalBottomSheetState4;
                composer2 = startRestartGroup;
                z3 = z2;
                shape3 = shape4;
                j5 = j10;
                f3 = f5;
                modifier2 = modifier32;
                j7 = j122;
                j6 = j11;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                modalBottomSheetState3 = modalBottomSheetState2;
                composer2 = startRestartGroup;
                j5 = j4;
                z3 = z2;
                shape3 = shape2;
                f3 = f;
                j6 = j2;
                j7 = j3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ModalBottomSheetLayout_Gs3lGvM$lambda$14;
                        ModalBottomSheetLayout_Gs3lGvM$lambda$14 = ModalBottomSheetKt.ModalBottomSheetLayout_Gs3lGvM$lambda$14(Function3.this, modifier2, modalBottomSheetState3, z3, shape3, f3, j5, j6, j7, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ModalBottomSheetLayout_Gs3lGvM$lambda$14;
                    }
                });
                return;
            }
            return;
        }
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if ((100663296 & i) != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i7 = i3;
        if (!startRestartGroup.shouldExecute((306783379 & i7) == 306783378, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$6$lambda$5$lambda$4(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
        if (modalBottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11(final ModalBottomSheetState modalBottomSheetState, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (modalBottomSheetState.isVisible()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$8;
                    ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$8 = ModalBottomSheetKt.ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$8(ModalBottomSheetState.this, coroutineScope);
                    return Boolean.valueOf(ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$8);
                }
            }, 1, null);
            if (modalBottomSheetState.getAnchoredDraggableState$material().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$9;
                        ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$9 = ModalBottomSheetKt.ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$9(ModalBottomSheetState.this, coroutineScope);
                        return Boolean.valueOf(ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$9);
                    }
                }, 1, null);
            } else if (modalBottomSheetState.getHasHalfExpandedState$material()) {
                SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$10;
                        ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$10 = ModalBottomSheetKt.ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$10(ModalBottomSheetState.this, coroutineScope);
                        return Boolean.valueOf(ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$10);
                    }
                }, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$8(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
        if (!modalBottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1(modalBottomSheetState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$9(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
        if (!modalBottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1(modalBottomSheetState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalBottomSheetLayout_Gs3lGvM$lambda$13$lambda$12$lambda$11$lambda$10(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope) {
        if (!modalBottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1(modalBottomSheetState, null), 3, null);
        return true;
    }

    private static final Modifier modalBottomSheetAnchors(Modifier modifier, final ModalBottomSheetState modalBottomSheetState) {
        return AnchoredDraggableKt.draggableAnchors(modifier, modalBottomSheetState.getAnchoredDraggableState$material(), Orientation.Vertical, new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Pair modalBottomSheetAnchors$lambda$16;
                modalBottomSheetAnchors$lambda$16 = ModalBottomSheetKt.modalBottomSheetAnchors$lambda$16(ModalBottomSheetState.this, (IntSize) obj, (Constraints) obj2);
                return modalBottomSheetAnchors$lambda$16;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair modalBottomSheetAnchors$lambda$16(final ModalBottomSheetState modalBottomSheetState, final IntSize intSize, Constraints constraints) {
        ModalBottomSheetValue modalBottomSheetValue;
        final float m8353getMaxHeightimpl = Constraints.m8353getMaxHeightimpl(constraints.getValue());
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit modalBottomSheetAnchors$lambda$16$lambda$15;
                modalBottomSheetAnchors$lambda$16$lambda$15 = ModalBottomSheetKt.modalBottomSheetAnchors$lambda$16$lambda$15(m8353getMaxHeightimpl, modalBottomSheetState, intSize, (DraggableAnchorsConfig) obj);
                return modalBottomSheetAnchors$lambda$16$lambda$15;
            }
        });
        boolean z = modalBottomSheetState.getAnchoredDraggableState$material().getAnchors().getSize() > 0;
        ModalBottomSheetValue currentValue = modalBottomSheetState.getCurrentValue();
        if (z || !DraggableAnchors.hasAnchorFor(currentValue)) {
            int i = WhenMappings.$EnumSwitchMapping$0[modalBottomSheetState.getTargetValue().ordinal()];
            if (i == 1) {
                currentValue = ModalBottomSheetValue.Hidden;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (DraggableAnchors.hasAnchorFor(ModalBottomSheetValue.HalfExpanded)) {
                    modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                } else if (DraggableAnchors.hasAnchorFor(ModalBottomSheetValue.Expanded)) {
                    modalBottomSheetValue = ModalBottomSheetValue.Expanded;
                } else {
                    modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                }
                currentValue = modalBottomSheetValue;
            }
        }
        return TuplesKt.to(DraggableAnchors, currentValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit modalBottomSheetAnchors$lambda$16$lambda$15(float f, ModalBottomSheetState modalBottomSheetState, IntSize intSize, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(ModalBottomSheetValue.Hidden, f);
        float f2 = f / 2.0f;
        if (!modalBottomSheetState.getIsSkipHalfExpanded() && ((int) (intSize.m8576unboximpl() & 4294967295L)) > f2) {
            draggableAnchorsConfig.at(ModalBottomSheetValue.HalfExpanded, f2);
        }
        if (((int) (intSize.m8576unboximpl() & 4294967295L)) != 0) {
            draggableAnchorsConfig.at(ModalBottomSheetValue.Expanded, Math.max(0.0f, f - ((int) (intSize.m8576unboximpl() & 4294967295L))));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    private static final void m2067Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)N(color:c#ui.graphics.Color,onDismiss,visible):ModalBottomSheet.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i2, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j != 16) {
                startRestartGroup.startReplaceGroup(-714009568);
                ComposerKt.sourceInformation(startRestartGroup, "492@21083L87,493@21196L29,508@21761L79,508@21708L132");
                int i3 = i2;
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                final String m2167getString4foXLRw = Strings_androidKt.m2167getString4foXLRw(Strings.INSTANCE.m2160getCloseSheetUdPEhr4(), startRestartGroup, 6);
                if (z) {
                    startRestartGroup.startReplaceGroup(-713791669);
                    ComposerKt.sourceInformation(startRestartGroup, "496@21332L37,497@21426L212");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 808259753, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    int i4 = i3 & 112;
                    boolean z2 = i4 == 32;
                    ModalBottomSheetKt$Scrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (PointerInputEventHandler) rememberedValue);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 808262936, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    boolean changed = (i4 == 32) | startRestartGroup.changed(m2167getString4foXLRw);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit Scrim_3J_VO9M$lambda$21$lambda$20;
                                Scrim_3J_VO9M$lambda$21$lambda$20 = ModalBottomSheetKt.Scrim_3J_VO9M$lambda$21$lambda$20(m2167getString4foXLRw, function0, (SemanticsPropertyReceiver) obj);
                                return Scrim_3J_VO9M$lambda$21$lambda$20;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-713427946);
                    startRestartGroup.endReplaceGroup();
                    companion = Modifier.INSTANCE;
                }
                Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 808273523, "CC(remember):ModalBottomSheet.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(animateFloatAsState) | ((i3 & 14) == 4);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Scrim_3J_VO9M$lambda$23$lambda$22;
                            Scrim_3J_VO9M$lambda$23$lambda$22 = ModalBottomSheetKt.Scrim_3J_VO9M$lambda$23$lambda$22(j, animateFloatAsState, (DrawScope) obj);
                            return Scrim_3J_VO9M$lambda$23$lambda$22;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-713242690);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Scrim_3J_VO9M$lambda$24;
                    Scrim_3J_VO9M$lambda$24 = ModalBottomSheetKt.Scrim_3J_VO9M$lambda$24(j, function0, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Scrim_3J_VO9M$lambda$24;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_3J_VO9M$lambda$21$lambda$20(String str, final Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean Scrim_3J_VO9M$lambda$21$lambda$20$lambda$19;
                Scrim_3J_VO9M$lambda$21$lambda$20$lambda$19 = ModalBottomSheetKt.Scrim_3J_VO9M$lambda$21$lambda$20$lambda$19(Function0.this);
                return Boolean.valueOf(Scrim_3J_VO9M$lambda$21$lambda$20$lambda$19);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Scrim_3J_VO9M$lambda$21$lambda$20$lambda$19(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_3J_VO9M$lambda$23$lambda$22(long j, State state, DrawScope drawScope) {
        DrawScope.m6230drawRectnJ9OG0$default(drawScope, j, 0L, 0L, RangesKt.coerceIn(Scrim_3J_VO9M$lambda$17(state), 0.0f, 1.0f), null, null, 0, 118, null);
        return Unit.INSTANCE;
    }

    private static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    private static final float Scrim_3J_VO9M$lambda$17(State<Float> state) {
        return state.getValue().floatValue();
    }
}
