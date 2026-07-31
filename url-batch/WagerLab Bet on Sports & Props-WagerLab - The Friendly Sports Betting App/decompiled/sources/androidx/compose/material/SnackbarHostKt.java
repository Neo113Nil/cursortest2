package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.util.ListUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000\u001a:\u0010\u0012\u001a\u00020\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u0015\u001a9\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003¢\u0006\u0002\u0010!\u001a)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010#\"\u000e\u0010$\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020%X\u0082T¢\u0006\u0002\n\u0000*b\b\u0002\u0010\u0016\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t2-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t¨\u0006("}, d2 = {"SnackbarHost", "", "hostState", "Landroidx/compose/material/SnackbarHostState;", "modifier", "Landroidx/compose/ui/Modifier;", "snackbar", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarData;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "toMillis", "", "Landroidx/compose/material/SnackbarDuration;", "hasAction", "", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "FadeInFadeOutWithScale", "current", "content", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FadeInFadeOutTransition", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "animatedOpacity", "Landroidx/compose/runtime/State;", "", "animation", "Landroidx/compose/animation/core/AnimationSpec;", ViewProps.VISIBLE, "onAnimationFinish", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "SnackbarFadeInMillis", "", "SnackbarFadeOutMillis", "SnackbarInBetweenDelayMillis", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostKt {
    private static final int SnackbarFadeInMillis = 150;
    private static final int SnackbarFadeOutMillis = 75;
    private static final int SnackbarInBetweenDelayMillis = 0;

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FadeInFadeOutWithScale$lambda$7(SnackbarData snackbarData, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        FadeInFadeOutWithScale(snackbarData, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SnackbarHost$lambda$1(SnackbarHostState snackbarHostState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        SnackbarHost(snackbarHostState, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SnackbarHost(final SnackbarHostState snackbarHostState, Modifier modifier, Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function32;
        Composer startRestartGroup = composer.startRestartGroup(1351125615);
        ComposerKt.sourceInformation(startRestartGroup, "C(SnackbarHost)N(hostState,modifier,snackbar)157@6684L7,158@6732L333,158@6696L369,169@7070L135:SnackbarHost.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(snackbarHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function32 = function3;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                function3 = ComposableSingletons$SnackbarHostKt.INSTANCE.getLambda$1890101041$material();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1351125615, i3, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            SnackbarData currentSnackbarData = snackbarHostState.getCurrentSnackbarData();
            ProvidableCompositionLocal<AccessibilityManager> localAccessibilityManager = CompositionLocalsKt.getLocalAccessibilityManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localAccessibilityManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AccessibilityManager accessibilityManager = (AccessibilityManager) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1351603740, "CC(remember):SnackbarHost.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(currentSnackbarData) | startRestartGroup.changedInstance(accessibilityManager);
            SnackbarHostKt$SnackbarHost$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SnackbarHostKt$SnackbarHost$1$1(currentSnackbarData, accessibilityManager, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(currentSnackbarData, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 0);
            Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function33 = function3;
            FadeInFadeOutWithScale(snackbarHostState.getCurrentSnackbarData(), modifier3, function33, startRestartGroup, i3 & 1008, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            function32 = function33;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SnackbarHost$lambda$1;
                    SnackbarHost$lambda$1 = SnackbarHostKt.SnackbarHost$lambda$1(SnackbarHostState.this, modifier2, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SnackbarHost$lambda$1;
                }
            });
        }
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z, AccessibilityManager accessibilityManager) {
        long j;
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = 4000;
        }
        long j2 = j;
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FadeInFadeOutWithScale(final SnackbarData snackbarData, Modifier modifier, final Function3<? super SnackbarData, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        SnackbarData snackbarData2 = snackbarData;
        Composer startRestartGroup = composer.startRestartGroup(1354335728);
        ComposerKt.sourceInformation(startRestartGroup, "C(FadeInFadeOutWithScale)N(current,modifier,content)246@9399L48,247@9472L36,315@12255L162:SnackbarHost.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(snackbarData2) : startRestartGroup.changedInstance(snackbarData2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1354335728, i3, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 141549728, "CC(remember):SnackbarHost.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new FadeInFadeOutState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                FadeInFadeOutState fadeInFadeOutState = (FadeInFadeOutState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i6 = 6;
                String m2167getString4foXLRw = Strings_androidKt.m2167getString4foXLRw(Strings.INSTANCE.m2166getSnackbarPaneTitleUdPEhr4(), startRestartGroup, 6);
                if (!Intrinsics.areEqual(snackbarData2, fadeInFadeOutState.getCurrent())) {
                    startRestartGroup.startReplaceGroup(141556995);
                    ComposerKt.sourceInformation(startRestartGroup, "*256@9859L2375");
                    fadeInFadeOutState.setCurrent(snackbarData2);
                    List items = fadeInFadeOutState.getItems();
                    ArrayList arrayList = new ArrayList(items.size());
                    int size = items.size();
                    int i7 = 0;
                    while (i7 < size) {
                        arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) items.get(i7)).getKey());
                        i7++;
                        i6 = i6;
                    }
                    i4 = i6;
                    List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(snackbarData2)) {
                        mutableList.add(snackbarData2);
                    }
                    fadeInFadeOutState.getItems().clear();
                    List fastFilterNotNull = ListUtilsKt.fastFilterNotNull(mutableList);
                    List items2 = fadeInFadeOutState.getItems();
                    int size2 = fastFilterNotNull.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        SnackbarData snackbarData3 = (SnackbarData) fastFilterNotNull.get(i8);
                        items2.add(new FadeInFadeOutAnimationItem(snackbarData3, ComposableLambdaKt.rememberComposableLambda(-1032415134, true, new SnackbarHostKt$FadeInFadeOutWithScale$1$1(snackbarData3, snackbarData2, mutableList, fadeInFadeOutState, m2167getString4foXLRw), startRestartGroup, 54)));
                        i8++;
                        snackbarData2 = snackbarData;
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    i4 = 6;
                    startRestartGroup.startReplaceGroup(95900978);
                    startRestartGroup.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1344811861, "C316@12293L21:SnackbarHost.kt#jmzs0o");
                fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0));
                startRestartGroup.startReplaceGroup(-1757732554);
                ComposerKt.sourceInformation(startRestartGroup, "");
                List items3 = fadeInFadeOutState.getItems();
                int size3 = items3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) items3.get(i9);
                    final SnackbarData snackbarData4 = (SnackbarData) fadeInFadeOutAnimationItem.component1();
                    Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> component2 = fadeInFadeOutAnimationItem.component2();
                    startRestartGroup.startMovableGroup(-1515535286, snackbarData4);
                    ComposerKt.sourceInformation(startRestartGroup, "317@12388L19,317@12380L27");
                    component2.invoke(ComposableLambdaKt.rememberComposableLambda(2017516783, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            ComposerKt.sourceInformation(composer2, "C317@12390L15:SnackbarHost.kt#jmzs0o");
                            if (!composer2.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2017516783, i10, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
                            }
                            Function3<SnackbarData, Composer, Integer, Unit> function32 = function3;
                            SnackbarData snackbarData5 = snackbarData4;
                            Intrinsics.checkNotNull(snackbarData5);
                            function32.invoke(snackbarData5, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, Integer.valueOf(i4));
                    startRestartGroup.endMovableGroup();
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FadeInFadeOutWithScale$lambda$7;
                        FadeInFadeOutWithScale$lambda$7 = SnackbarHostKt.FadeInFadeOutWithScale$lambda$7(SnackbarData.this, modifier3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FadeInFadeOutWithScale$lambda$7;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Float> animatedOpacity(AnimationSpec<Float> animationSpec, boolean z, Function0<Unit> function0, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1016418159, "C(animatedOpacity)N(animation,visible,onAnimationFinish)339@13029L2,341@13067L49,342@13145L111,342@13121L135:SnackbarHost.kt#jmzs0o");
        if ((i2 & 4) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 1820278961, "CC(remember):SnackbarHost.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function0 = (Function0) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        Function0<Unit> function02 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1820280224, "CC(remember):SnackbarHost.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        Animatable animatable = (Animatable) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Boolean valueOf = Boolean.valueOf(z);
        ComposerKt.sourceInformationMarkerStart(composer, 1820282782, "CC(remember):SnackbarHost.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(animatable) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32) | composer.changedInstance(animationSpec) | ((((i & 896) ^ 384) > 256 && composer.changed(function02)) || (i & 384) == 256);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (Function2) new SnackbarHostKt$animatedOpacity$2$1(animatable, z, animationSpec, function02, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer, (i >> 3) & 14);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State<Float> animatedScale(AnimationSpec<Float> animationSpec, boolean z, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 2003504988, "C(animatedScale)N(animation,visible)351@13408L51,352@13488L85,352@13464L109:SnackbarHost.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1222948783, "CC(remember):SnackbarHost.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Animatable animatable = (Animatable) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Boolean valueOf = Boolean.valueOf(z);
        ComposerKt.sourceInformationMarkerStart(composer, 1222951377, "CC(remember):SnackbarHost.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(animatable) | ((((i & 112) ^ 48) > 32 && composer.changed(z)) || (i & 48) == 32) | composer.changedInstance(animationSpec);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function2) new SnackbarHostKt$animatedScale$1$1(animatable, z, animationSpec, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, (i >> 3) & 14);
        State<Float> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return asState;
    }
}
