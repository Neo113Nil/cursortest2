package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Drawer.kt */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a;\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\n2\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\u0010\u000e\u001a\u0090\u0001\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100\"¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0090\u0001\u0010%\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00100\"¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b&\u0010'\u001a \u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0002\u001a-\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\"2\u0006\u0010/\u001a\u00020\u0006H\u0003¢\u0006\u0004\b0\u00101\u001a;\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00062\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\"2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\"2\u0006\u0010-\u001a\u00020\u001eH\u0003¢\u0006\u0004\b6\u00107\u001a\u0014\u0010?\u001a\u00020@2\n\u0010A\u001a\u0006\u0012\u0002\b\u00030BH\u0002\"\u0010\u00108\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0010\u0010:\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0010\u0010;\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u00109\"\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006C²\u0006\n\u0010D\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"rememberDrawerState", "Landroidx/compose/material/DrawerState;", "initialValue", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "rememberBottomDrawerState", "Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "ModalDrawer", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerState", "gesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "Landroidx/compose/ui/unit/Dp;", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawer", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "calculateFraction", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "pos", "BottomDrawerScrim", "color", "onDismiss", ViewProps.VISIBLE, "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Scrim", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "EndDrawerPadding", "F", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "BottomDrawerOpenFraction", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "material", "alpha"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float DrawerPositionalThreshold;
    private static final float EndDrawerPadding;
    private static final float DrawerVelocityThreshold = Dp.m8401constructorimpl(400);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomDrawerScrim_3J_VO9M$lambda$17(long j, Function0 function0, boolean z, int i, Composer composer, int i2) {
        m1999BottomDrawerScrim3JVO9M(j, function0, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomDrawer_Gs3lGvM$lambda$9(Function3 function3, Modifier modifier, BottomDrawerState bottomDrawerState, boolean z, Shape shape, float f, long j, long j2, long j3, Function2 function2, int i, int i2, Composer composer, int i3) {
        m1998BottomDrawerGs3lGvM(function3, modifier, bottomDrawerState, z, shape, f, j, j2, j3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalDrawer_Gs3lGvM$lambda$8(Function3 function3, Modifier modifier, DrawerState drawerState, boolean z, Shape shape, float f, long j, long j2, long j3, Function2 function2, int i, int i2, Composer composer, int i3) {
        m2000ModalDrawerGs3lGvM(function3, modifier, drawerState, z, shape, f, j, j2, j3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_Bx497Mc$lambda$24(boolean z, Function0 function0, Function0 function02, long j, int i, Composer composer, int i2) {
        m2001ScrimBx497Mc(z, function0, function02, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        float f4 = (f3 - f) / (f2 - f);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            return 1.0f;
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberBottomDrawerState$lambda$5$lambda$4(BottomDrawerValue bottomDrawerValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberDrawerState$lambda$1$lambda$0(DrawerValue drawerValue) {
        return true;
    }

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final Function1<? super DrawerValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1435874229, "C(rememberDrawerState)N(initialValue,confirmStateChange)389@14774L8,391@14876L61,391@14812L125:Drawer.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -1190628237, "CC(remember):Drawer.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberDrawerState$lambda$1$lambda$0;
                        rememberDrawerState$lambda$1$lambda$0 = DrawerKt.rememberDrawerState$lambda$1$lambda$0((DrawerValue) obj);
                        return Boolean.valueOf(rememberDrawerState$lambda$1$lambda$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:390)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        ComposerKt.sourceInformationMarkerStart(composer, -1190624920, "CC(remember):Drawer.kt#9igjgp");
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(drawerValue.ordinal())) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DrawerState rememberDrawerState$lambda$3$lambda$2;
                    rememberDrawerState$lambda$3$lambda$2 = DrawerKt.rememberDrawerState$lambda$3$lambda$2(DrawerValue.this, function1);
                    return rememberDrawerState$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m5103rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return drawerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawerState rememberDrawerState$lambda$3$lambda$2(DrawerValue drawerValue, Function1 function1) {
        return new DrawerState(drawerValue, function1);
    }

    public static final BottomDrawerState rememberBottomDrawerState(final BottomDrawerValue bottomDrawerValue, final Function1<? super BottomDrawerValue, Boolean> function1, final AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1477366969, "C(rememberBottomDrawerState)N(initialValue,confirmStateChange,animationSpec)407@15417L8,410@15553L7,414@15698L91,411@15572L217:Drawer.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -1884513375, "CC(remember):Drawer.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberBottomDrawerState$lambda$5$lambda$4;
                        rememberBottomDrawerState$lambda$5$lambda$4 = DrawerKt.rememberBottomDrawerState$lambda$5$lambda$4((BottomDrawerValue) obj);
                        return Boolean.valueOf(rememberBottomDrawerState$lambda$5$lambda$4);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if ((i2 & 4) != 0) {
            animationSpec = DrawerDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1477366969, i, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:409)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume;
        Object[] objArr = {density};
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.INSTANCE.Saver(density, function1, animationSpec);
        ComposerKt.sourceInformationMarkerStart(composer, -1884504300, "CC(remember):Drawer.kt#9igjgp");
        boolean z = true;
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(bottomDrawerValue.ordinal())) || (i & 6) == 4) | composer.changed(density);
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean changedInstance = changed | z | composer.changedInstance(animationSpec);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BottomDrawerState rememberBottomDrawerState$lambda$7$lambda$6;
                    rememberBottomDrawerState$lambda$7$lambda$6 = DrawerKt.rememberBottomDrawerState$lambda$7$lambda$6(BottomDrawerValue.this, density, function1, animationSpec);
                    return rememberBottomDrawerState$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m5103rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomDrawerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomDrawerState rememberBottomDrawerState$lambda$7$lambda$6(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1, AnimationSpec animationSpec) {
        return new BottomDrawerState(bottomDrawerValue, density, function1, animationSpec);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a1  */
    /* renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2000ModalDrawerGs3lGvM(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, DrawerState drawerState, boolean z, Shape shape, float f, long j, long j2, long j3, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        boolean z2;
        Shape shape2;
        int i5;
        float f2;
        int i6;
        final Modifier modifier3;
        final DrawerState drawerState3;
        final boolean z3;
        final Shape shape3;
        final float f3;
        final long j4;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        DrawerState drawerState4;
        Shape shape4;
        long j7;
        long j8;
        long j9;
        Shape shape5;
        float f4;
        long j10;
        long j11;
        DrawerState drawerState5;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1979404999);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalDrawer)N(drawerContent,modifier,drawerState,gesturesEnabled,drawerShape,drawerElevation:c#ui.unit.Dp,drawerBackgroundColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,scrimColor:c#ui.graphics.Color,content)462@17984L24,463@18056L3421,463@18013L3464:Drawer.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i10 = 256;
                        i3 |= i10;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i10 = 128;
                i3 |= i10;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            i7 = i3;
                            if (startRestartGroup.changed(j)) {
                                i8 = 1048576;
                                i6 = i7 | i8;
                            }
                        } else {
                            i7 = i3;
                        }
                        i8 = 524288;
                        i6 = i7 | i8;
                    } else {
                        i6 = i3;
                    }
                    if ((i & 12582912) == 0) {
                        i6 |= ((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i) == 0) {
                        i6 |= ((i2 & 256) == 0 && startRestartGroup.changed(j3)) ? 67108864 : 33554432;
                    }
                    if ((i2 & 512) == 0) {
                        i6 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i6 |= startRestartGroup.changedInstance(function2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        if (startRestartGroup.shouldExecute((306783379 & i6) != 306783378, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "453@17560L39,455@17678L5,457@17787L15,458@17836L38,459@17915L10");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i6 &= -897;
                                }
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i6 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i6 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i6 &= -234881025;
                                }
                                j10 = j;
                                j11 = j2;
                                j9 = j3;
                                companion = modifier2;
                                drawerState5 = drawerState2;
                                z4 = z2;
                                shape5 = shape2;
                                f4 = f2;
                            } else {
                                companion = i11 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) != 0) {
                                    drawerState4 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                                    i6 &= -897;
                                } else {
                                    drawerState4 = drawerState2;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    shape4 = DrawerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    i6 &= -57345;
                                } else {
                                    shape4 = shape2;
                                }
                                float m1992getElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m1992getElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    j7 = DrawerDefaults.INSTANCE.getBackgroundColor(startRestartGroup, 6);
                                    i6 &= -3670017;
                                } else {
                                    j7 = j;
                                }
                                if ((i2 & 128) != 0) {
                                    j8 = ColorsKt.m1971contentColorForek8zF_U(j7, startRestartGroup, (i6 >> 18) & 14);
                                    i6 = (-29360129) & i6;
                                } else {
                                    j8 = j2;
                                }
                                if ((i2 & 256) != 0) {
                                    j9 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                                    i6 &= -234881025;
                                } else {
                                    j9 = j3;
                                }
                                shape5 = shape4;
                                f4 = m1992getElevationD9Ej5fM;
                                j10 = j7;
                                j11 = j8;
                                drawerState5 = drawerState4;
                                z4 = z2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1979404999, i6, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1549911011, true, new DrawerKt$ModalDrawer$1(drawerState5, z4, (CoroutineScope) rememberedValue, j9, shape5, j10, j11, f4, function2, function3), startRestartGroup, 54), startRestartGroup, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            drawerState3 = drawerState5;
                            z3 = z4;
                            j6 = j9;
                            shape3 = shape5;
                            j4 = j10;
                            j5 = j11;
                            f3 = f4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            drawerState3 = drawerState2;
                            z3 = z2;
                            shape3 = shape2;
                            f3 = f2;
                            j4 = j;
                            j5 = j2;
                            j6 = j3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ModalDrawer_Gs3lGvM$lambda$8;
                                    ModalDrawer_Gs3lGvM$lambda$8 = DrawerKt.ModalDrawer_Gs3lGvM$lambda$8(Function3.this, modifier3, drawerState3, z3, shape3, f3, j4, j5, j6, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return ModalDrawer_Gs3lGvM$lambda$8;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i6) != 306783378, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((100663296 & i) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i6) != 306783378, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i6) != 306783378, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i6) != 306783378, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1998BottomDrawerGs3lGvM(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, BottomDrawerState bottomDrawerState, boolean z, Shape shape, float f, long j, long j2, long j3, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        int i3;
        BottomDrawerState bottomDrawerState2;
        int i4;
        boolean z2;
        Shape shape2;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        final Modifier modifier2;
        final long j4;
        Composer composer2;
        final BottomDrawerState bottomDrawerState3;
        final boolean z3;
        final Shape shape3;
        final float f3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        BottomDrawerState bottomDrawerState4;
        int i9;
        Shape shape4;
        long j7;
        long j8;
        long j9;
        BottomDrawerState bottomDrawerState5;
        Shape shape5;
        float f4;
        boolean z5;
        long j10;
        long j11;
        ?? r0;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1403479060);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomDrawer)N(drawerContent,modifier,drawerState,gesturesEnabled,drawerShape,drawerElevation:c#ui.unit.Dp,drawerBackgroundColor:c#ui.graphics.Color,drawerContentColor:c#ui.graphics.Color,scrimColor:c#ui.graphics.Color,content)589@23753L24,590@23825L4662,590@23782L4705:Drawer.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function32 = function3;
        } else {
            function32 = function3;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function32) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    bottomDrawerState2 = bottomDrawerState;
                    if (startRestartGroup.changedInstance(bottomDrawerState2)) {
                        i12 = 256;
                        i3 |= i12;
                    }
                } else {
                    bottomDrawerState2 = bottomDrawerState;
                }
                i12 = 128;
                i3 |= i12;
            } else {
                bottomDrawerState2 = bottomDrawerState;
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
            i5 = i2 & 32;
            if (i5 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f2 = f;
            } else {
                f2 = f;
                if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                }
            }
            if ((1572864 & i) != 0) {
                i6 = i3 | (((i2 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288);
            } else {
                i6 = i3;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i7 = i13;
                    if (startRestartGroup.changed(j2)) {
                        i11 = 8388608;
                        i6 |= i11;
                    }
                } else {
                    i7 = i13;
                }
                i11 = 4194304;
                i6 |= i11;
            } else {
                i7 = i13;
            }
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0 && startRestartGroup.changed(j3)) {
                    i10 = 67108864;
                    i6 |= i10;
                }
                i10 = 33554432;
                i6 |= i10;
            }
            if ((i2 & 512) == 0) {
                i6 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i6 |= startRestartGroup.changedInstance(function2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                i8 = i6;
                if (startRestartGroup.shouldExecute((306783379 & i8) != 306783378, i8 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "580@23335L33,582@23447L5,584@23556L15,585@23605L38,586@23684L10");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i8 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i8 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i8 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i8 &= -234881025;
                        }
                        j10 = j;
                        j11 = j2;
                        j9 = j3;
                        r0 = 1;
                        bottomDrawerState5 = bottomDrawerState2;
                        z5 = z2;
                        shape5 = shape2;
                        f4 = f2;
                        i9 = i8;
                    } else {
                        Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 4) != 0) {
                            modifier = companion;
                            z4 = true;
                            bottomDrawerState4 = rememberBottomDrawerState(BottomDrawerValue.Closed, null, null, startRestartGroup, 6, 6);
                            i9 = i8 & (-897);
                        } else {
                            modifier = companion;
                            z4 = true;
                            bottomDrawerState4 = bottomDrawerState2;
                            i9 = i8;
                        }
                        if (i4 != 0) {
                            z2 = z4 ? 1 : 0;
                        }
                        if ((i2 & 16) != 0) {
                            shape4 = DrawerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            i9 &= -57345;
                        } else {
                            shape4 = shape2;
                        }
                        float m1992getElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m1992getElevationD9Ej5fM() : f2;
                        if ((i2 & 64) != 0) {
                            j7 = DrawerDefaults.INSTANCE.getBackgroundColor(startRestartGroup, 6);
                            i9 &= -3670017;
                        } else {
                            j7 = j;
                        }
                        if ((i2 & 128) != 0) {
                            j8 = ColorsKt.m1971contentColorForek8zF_U(j7, startRestartGroup, (i9 >> 18) & 14);
                            i9 &= -29360129;
                        } else {
                            j8 = j2;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            shape5 = shape4;
                            f4 = m1992getElevationD9Ej5fM;
                            j10 = j7;
                            j11 = j8;
                            j9 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                            bottomDrawerState5 = bottomDrawerState4;
                            z5 = z2;
                            r0 = z4;
                        } else {
                            j9 = j3;
                            bottomDrawerState5 = bottomDrawerState4;
                            shape5 = shape4;
                            f4 = m1992getElevationD9Ej5fM;
                            z5 = z2;
                            j10 = j7;
                            j11 = j8;
                            r0 = z4;
                        }
                    }
                    Modifier modifier3 = modifier;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1403479060, i9, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:588)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, r0, null), null, false, ComposableLambdaKt.rememberComposableLambda(468886998, r0, new DrawerKt$BottomDrawer$1(z5, bottomDrawerState5, function2, j9, (CoroutineScope) rememberedValue, shape5, j10, j11, f4, function32), startRestartGroup, 54), startRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    composer2 = startRestartGroup;
                    z3 = z5;
                    bottomDrawerState3 = bottomDrawerState5;
                    j6 = j9;
                    shape3 = shape5;
                    j4 = j10;
                    j5 = j11;
                    f3 = f4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    j4 = j;
                    composer2 = startRestartGroup;
                    bottomDrawerState3 = bottomDrawerState2;
                    z3 = z2;
                    shape3 = shape2;
                    f3 = f2;
                    j5 = j2;
                    j6 = j3;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BottomDrawer_Gs3lGvM$lambda$9;
                            BottomDrawer_Gs3lGvM$lambda$9 = DrawerKt.BottomDrawer_Gs3lGvM$lambda$9(Function3.this, modifier2, bottomDrawerState3, z3, shape3, f3, j4, j5, j6, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BottomDrawer_Gs3lGvM$lambda$9;
                        }
                    });
                    return;
                }
                return;
            }
            i8 = i6;
            if (startRestartGroup.shouldExecute((306783379 & i8) != 306783378, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        i8 = i6;
        if (startRestartGroup.shouldExecute((306783379 & i8) != 306783378, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final void m1999BottomDrawerScrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-513067266);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomDrawerScrim)N(color:c#ui.graphics.Color,onDismiss,visible):Drawer.kt#jmzs0o");
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
                ComposerKt.traceEventStart(-513067266, i2, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:725)");
            }
            if (j != 16) {
                startRestartGroup.startReplaceGroup(1001834356);
                ComposerKt.sourceInformation(startRestartGroup, "728@29733L87,729@29847L30,744@30414L62,744@30361L115");
                int i3 = i2;
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                final String m2167getString4foXLRw = Strings_androidKt.m2167getString4foXLRw(Strings.INSTANCE.m2159getCloseDrawerUdPEhr4(), startRestartGroup, 6);
                if (z) {
                    startRestartGroup.startReplaceGroup(1002054704);
                    ComposerKt.sourceInformation(startRestartGroup, "732@29984L37,733@30078L213");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 863609635, "CC(remember):Drawer.kt#9igjgp");
                    int i4 = i3 & 112;
                    boolean z2 = i4 == 32;
                    DrawerKt$BottomDrawerScrim$dismissModifier$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (PointerInputEventHandler) rememberedValue);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 863612819, "CC(remember):Drawer.kt#9igjgp");
                    boolean changed = (i4 == 32) | startRestartGroup.changed(m2167getString4foXLRw);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13;
                                BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13 = DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13(m2167getString4foXLRw, function0, (SemanticsPropertyReceiver) obj);
                                return BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1002419388);
                    startRestartGroup.endReplaceGroup();
                    companion = Modifier.INSTANCE;
                }
                Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 863623420, "CC(remember):Drawer.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(animateFloatAsState) | ((i3 & 14) == 4);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BottomDrawerScrim_3J_VO9M$lambda$16$lambda$15;
                            BottomDrawerScrim_3J_VO9M$lambda$16$lambda$15 = DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$16$lambda$15(j, animateFloatAsState, (DrawScope) obj);
                            return BottomDrawerScrim_3J_VO9M$lambda$16$lambda$15;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1002587780);
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
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BottomDrawerScrim_3J_VO9M$lambda$17;
                    BottomDrawerScrim_3J_VO9M$lambda$17 = DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$17(j, function0, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BottomDrawerScrim_3J_VO9M$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13(String str, final Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13$lambda$12;
                BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13$lambda$12 = DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13$lambda$12(Function0.this);
                return Boolean.valueOf(BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13$lambda$12);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomDrawerScrim_3J_VO9M$lambda$14$lambda$13$lambda$12(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomDrawerScrim_3J_VO9M$lambda$16$lambda$15(long j, State state, DrawScope drawScope) {
        DrawScope.m6230drawRectnJ9OG0$default(drawScope, j, 0L, 0L, BottomDrawerScrim_3J_VO9M$lambda$10(state), null, null, 0, 118, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m2001ScrimBx497Mc(final boolean z, final Function0<Unit> function0, final Function0<Float> function02, final long j, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)N(open,onClose,fraction,color:c#ui.graphics.Color)752@30613L30,767@31111L39,767@31060L90:Drawer.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:751)");
            }
            final String m2167getString4foXLRw = Strings_androidKt.m2167getString4foXLRw(Strings.INSTANCE.m2159getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            if (z) {
                startRestartGroup.startReplaceGroup(1716233810);
                ComposerKt.sourceInformation(startRestartGroup, "755@30731L35,756@30819L187");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -914467799, "CC(remember):Drawer.kt#9igjgp");
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                DrawerKt$Scrim$dismissDrawer$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(function0);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (PointerInputEventHandler) rememberedValue);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -914464831, "CC(remember):Drawer.kt#9igjgp");
                boolean changed = (i3 == 32) | startRestartGroup.changed(m2167getString4foXLRw);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Scrim_Bx497Mc$lambda$21$lambda$20;
                            Scrim_Bx497Mc$lambda$21$lambda$20 = DrawerKt.Scrim_Bx497Mc$lambda$21$lambda$20(m2167getString4foXLRw, function0, (SemanticsPropertyReceiver) obj);
                            return Scrim_Bx497Mc$lambda$21$lambda$20;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1716557884);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -914455635, "CC(remember):Drawer.kt#9igjgp");
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Scrim_Bx497Mc$lambda$23$lambda$22;
                        Scrim_Bx497Mc$lambda$23$lambda$22 = DrawerKt.Scrim_Bx497Mc$lambda$23$lambda$22(j, function02, (DrawScope) obj);
                        return Scrim_Bx497Mc$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Scrim_Bx497Mc$lambda$24;
                    Scrim_Bx497Mc$lambda$24 = DrawerKt.Scrim_Bx497Mc$lambda$24(z, function0, function02, j, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Scrim_Bx497Mc$lambda$24;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_Bx497Mc$lambda$21$lambda$20(String str, final Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean Scrim_Bx497Mc$lambda$21$lambda$20$lambda$19;
                Scrim_Bx497Mc$lambda$21$lambda$20$lambda$19 = DrawerKt.Scrim_Bx497Mc$lambda$21$lambda$20$lambda$19(Function0.this);
                return Boolean.valueOf(Scrim_Bx497Mc$lambda$21$lambda$20$lambda$19);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Scrim_Bx497Mc$lambda$21$lambda$20$lambda$19(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_Bx497Mc$lambda$23$lambda$22(long j, Function0 function0, DrawScope drawScope) {
        DrawScope.m6230drawRectnJ9OG0$default(drawScope, j, 0L, 0L, ((Number) function0.invoke()).floatValue(), null, null, 0, 118, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState) {
        return new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
    }

    private static final float BottomDrawerScrim_3J_VO9M$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f = 56;
        EndDrawerPadding = Dp.m8401constructorimpl(f);
        DrawerPositionalThreshold = Dp.m8401constructorimpl(f);
    }
}
