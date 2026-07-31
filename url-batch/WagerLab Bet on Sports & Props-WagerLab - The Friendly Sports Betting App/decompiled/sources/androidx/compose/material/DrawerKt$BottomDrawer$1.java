package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Drawer.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawerKt$BottomDrawer$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;

    /* compiled from: Drawer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomDrawerValue.values().length];
            try {
                iArr[BottomDrawerValue.Closed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomDrawerValue.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomDrawerValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    DrawerKt$BottomDrawer$1(boolean z, BottomDrawerState bottomDrawerState, Function2<? super Composer, ? super Integer, Unit> function2, long j, CoroutineScope coroutineScope, Shape shape, long j2, long j3, float f, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        this.$gesturesEnabled = z;
        this.$drawerState = bottomDrawerState;
        this.$content = function2;
        this.$scrimColor = j;
        this.$scope = coroutineScope;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$drawerContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i2;
        Modifier.Companion companion;
        ComposerKt.sourceInformation(composer, "C594@24017L7,606@24452L7,617@24824L3657:Drawer.kt#jmzs0o");
        if ((i & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i2 = i | (composer.changed(boxWithConstraintsScope2) ? 4 : 2);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(468886998, i2, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:591)");
        }
        final float m8353getMaxHeightimpl = Constraints.m8353getMaxHeightimpl(boxWithConstraintsScope2.mo723getConstraintsmsEJaDk());
        final boolean z = Constraints.m8354getMaxWidthimpl(boxWithConstraintsScope2.mo723getConstraintsmsEJaDk()) > Constraints.m8353getMaxHeightimpl(boxWithConstraintsScope2.mo723getConstraintsmsEJaDk());
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        Modifier m893sizeInqDBjuR0$default = SizeKt.m893sizeInqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, density.mo421toDpu2uoSUM(Constraints.m8354getMaxWidthimpl(boxWithConstraintsScope2.mo723getConstraintsmsEJaDk())), density.mo421toDpu2uoSUM(Constraints.m8353getMaxHeightimpl(boxWithConstraintsScope2.mo723getConstraintsmsEJaDk())), 3, null);
        if (this.$gesturesEnabled) {
            companion = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, this.$drawerState.getNestedScrollConnection(), null, 2, null);
        } else {
            companion = Modifier.INSTANCE;
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(Modifier.INSTANCE.then(companion), this.$drawerState.getAnchoredDraggableState$material(), Orientation.Vertical, this.$gesturesEnabled, consume2 == LayoutDirection.Rtl, null, false, 48, null);
        Function2<Composer, Integer, Unit> function2 = this.$content;
        long j = this.$scrimColor;
        final boolean z2 = this.$gesturesEnabled;
        final BottomDrawerState bottomDrawerState = this.$drawerState;
        final CoroutineScope coroutineScope = this.$scope;
        Shape shape = this.$drawerShape;
        long j2 = this.$drawerBackgroundColor;
        long j3 = this.$drawerContentColor;
        float f = this.$drawerElevation;
        final Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$drawerContent;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, anchoredDraggable$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer);
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -195134127, "C618@24853L9,621@24958L187,619@24875L346,628@25255L33,631@25379L2130,668@27538L66,669@27636L576,686@28408L63,629@25301L3170:Drawer.kt#jmzs0o");
        function2.invoke(composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -699031381, "CC(remember):Drawer.kt#9igjgp");
        boolean changed = composer.changed(z2) | composer.changedInstance(bottomDrawerState) | composer.changedInstance(coroutineScope);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$11$lambda$2$lambda$1;
                    invoke$lambda$11$lambda$2$lambda$1 = DrawerKt$BottomDrawer$1.invoke$lambda$11$lambda$2$lambda$1(z2, bottomDrawerState, coroutineScope);
                    return invoke$lambda$11$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        DrawerKt.m1999BottomDrawerScrim3JVO9M(j, function0, bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, 0);
        final String m2167getString4foXLRw = Strings_androidKt.m2167getString4foXLRw(Strings.INSTANCE.m2163getNavigationMenuUdPEhr4(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -699015966, "CC(remember):Drawer.kt#9igjgp");
        boolean changed2 = composer.changed(m8353getMaxHeightimpl) | composer.changed(z) | composer.changedInstance(bottomDrawerState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$11$lambda$5$lambda$4;
                    invoke$lambda$11$lambda$5$lambda$4 = DrawerKt$BottomDrawer$1.invoke$lambda$11$lambda$5$lambda$4(BottomDrawerState.this, m8353getMaxHeightimpl, z, (IntSize) obj);
                    return invoke$lambda$11$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m893sizeInqDBjuR0$default, (Function1) rememberedValue2);
        ComposerKt.sourceInformationMarkerStart(composer, -698948942, "CC(remember):Drawer.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(bottomDrawerState);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    IntOffset invoke$lambda$11$lambda$7$lambda$6;
                    invoke$lambda$11$lambda$7$lambda$6 = DrawerKt$BottomDrawer$1.invoke$lambda$11$lambda$7$lambda$6(BottomDrawerState.this, (Density) obj);
                    return invoke$lambda$11$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier offset = OffsetKt.offset(onSizeChanged, (Function1) rememberedValue3);
        ComposerKt.sourceInformationMarkerStart(composer, -698945296, "CC(remember):Drawer.kt#9igjgp");
        boolean changed3 = composer.changed(m2167getString4foXLRw) | composer.changedInstance(bottomDrawerState) | composer.changedInstance(coroutineScope);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$11$lambda$10$lambda$9;
                    invoke$lambda$11$lambda$10$lambda$9 = DrawerKt$BottomDrawer$1.invoke$lambda$11$lambda$10$lambda$9(m2167getString4foXLRw, bottomDrawerState, coroutineScope, (SemanticsPropertyReceiver) obj);
                    return invoke$lambda$11$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SurfaceKt.m2169SurfaceFjzlyU(SemanticsModifierKt.semantics$default(offset, false, (Function1) rememberedValue4, 1, null), shape, j2, j3, null, f, ComposableLambdaKt.rememberComposableLambda(1691510868, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                ComposerKt.sourceInformation(composer2, "C687@28426L31:Drawer.kt#jmzs0o");
                if (!composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1691510868, i3, -1, "androidx.compose.material.BottomDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:687)");
                }
                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer2);
                Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 1572864, 16);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$2$lambda$1(boolean z, BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope) {
        if (z && bottomDrawerState.confirmStateChange$material(BottomDrawerValue.Closed)) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DrawerKt$BottomDrawer$1$1$1$1$1(bottomDrawerState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$5$lambda$4(BottomDrawerState bottomDrawerState, final float f, final boolean z, IntSize intSize) {
        BottomDrawerValue bottomDrawerValue;
        final float m8576unboximpl = (int) (intSize.m8576unboximpl() & 4294967295L);
        DraggableAnchors<BottomDrawerValue> DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$11$lambda$5$lambda$4$lambda$3;
                invoke$lambda$11$lambda$5$lambda$4$lambda$3 = DrawerKt$BottomDrawer$1.invoke$lambda$11$lambda$5$lambda$4$lambda$3(f, m8576unboximpl, z, (DraggableAnchorsConfig) obj);
                return invoke$lambda$11$lambda$5$lambda$4$lambda$3;
            }
        });
        if (bottomDrawerState.getAnchoredDraggableState$material().getAnchors().getSize() <= 0 && DraggableAnchors.hasAnchorFor(bottomDrawerState.getCurrentValue())) {
            bottomDrawerValue = bottomDrawerState.getCurrentValue();
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[bottomDrawerState.getTargetValue().ordinal()];
            if (i == 1) {
                bottomDrawerValue = BottomDrawerValue.Closed;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (DraggableAnchors.hasAnchorFor(BottomDrawerValue.Open)) {
                    bottomDrawerValue = BottomDrawerValue.Open;
                } else {
                    bottomDrawerValue = DraggableAnchors.hasAnchorFor(BottomDrawerValue.Expanded) ? BottomDrawerValue.Expanded : BottomDrawerValue.Closed;
                }
            }
        }
        bottomDrawerState.getAnchoredDraggableState$material().updateAnchors(DraggableAnchors, bottomDrawerValue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$5$lambda$4$lambda$3(float f, float f2, boolean z, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(BottomDrawerValue.Closed, f);
        float f3 = 0.5f * f;
        if (f2 > f3 || z) {
            draggableAnchorsConfig.at(BottomDrawerValue.Open, f3);
        }
        if (f2 > 0.0f) {
            draggableAnchorsConfig.at(BottomDrawerValue.Expanded, Math.max(0.0f, f - f2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset invoke$lambda$11$lambda$7$lambda$6(BottomDrawerState bottomDrawerState, Density density) {
        return IntOffset.m8520boximpl(IntOffset.m8523constructorimpl((MathKt.roundToInt(bottomDrawerState.requireOffset$material()) & 4294967295L) | (0 << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10$lambda$9(String str, final BottomDrawerState bottomDrawerState, final CoroutineScope coroutineScope, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (bottomDrawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean invoke$lambda$11$lambda$10$lambda$9$lambda$8;
                    invoke$lambda$11$lambda$10$lambda$9$lambda$8 = DrawerKt$BottomDrawer$1.invoke$lambda$11$lambda$10$lambda$9$lambda$8(BottomDrawerState.this, coroutineScope);
                    return Boolean.valueOf(invoke$lambda$11$lambda$10$lambda$9$lambda$8);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$11$lambda$10$lambda$9$lambda$8(BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope) {
        if (!bottomDrawerState.confirmStateChange$material(BottomDrawerValue.Closed)) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DrawerKt$BottomDrawer$1$1$4$1$1$1(bottomDrawerState, null), 3, null);
        return true;
    }
}
