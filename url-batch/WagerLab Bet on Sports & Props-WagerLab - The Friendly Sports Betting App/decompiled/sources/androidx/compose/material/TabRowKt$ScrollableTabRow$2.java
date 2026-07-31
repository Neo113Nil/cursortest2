package androidx.compose.material;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowKt$ScrollableTabRow$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

    /* JADX WARN: Multi-variable type inference failed */
    TabRowKt$ScrollableTabRow$2(float f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i) {
        this.$edgePadding = f;
        this.$tabs = function2;
        this.$divider = function22;
        this.$indicator = function3;
        this.$selectedTabIndex = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C236@11913L21,237@11964L24,239@12033L147,248@12431L2377,242@12189L2619:TabRow.kt#jmzs0o");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1575164555, i, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:236)");
        }
        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1904644280, "CC(remember):TabRow.kt#9igjgp");
        boolean changed = composer.changed(rememberScrollState) | composer.changed(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
        ComposerKt.sourceInformationMarkerStart(composer, -1904629314, "CC(remember):TabRow.kt#9igjgp");
        boolean changed2 = composer.changed(this.$edgePadding) | composer.changed(this.$tabs) | composer.changed(this.$divider) | composer.changed(this.$indicator) | composer.changedInstance(scrollableTabData) | composer.changed(this.$selectedTabIndex);
        final float f = this.$edgePadding;
        final Function2<Composer, Integer, Unit> function2 = this.$tabs;
        final Function2<Composer, Integer, Unit> function22 = this.$divider;
        final int i2 = this.$selectedTabIndex;
        final Function3<List<TabPosition>, Composer, Integer, Unit> function3 = this.$indicator;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    MeasureResult invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = TabRowKt$ScrollableTabRow$2.invoke$lambda$8$lambda$7(f, function2, function22, scrollableTabData, i2, function3, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue3 = obj;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult invoke$lambda$8$lambda$7(float f, Function2 function2, final Function2 function22, final ScrollableTabData scrollableTabData, final int i, final Function3 function3, final SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        float f2;
        f2 = TabRowKt.ScrollableTabRowMinimumTabWidth;
        int i2 = subcomposeMeasureScope.mo418roundToPx0680j_4(f2);
        final int i3 = subcomposeMeasureScope.mo418roundToPx0680j_4(f);
        long m8344copyZbe2FdA$default = Constraints.m8344copyZbe2FdA$default(constraints.getValue(), i2, 0, 0, 0, 14, null);
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function2);
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size = subcompose.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(subcompose.get(i4).mo7075measureBRTryo0(m8344copyZbe2FdA$default));
        }
        final ArrayList arrayList2 = arrayList;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i3 * 2;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable placeable = (Placeable) arrayList2.get(i5);
            intRef.element += placeable.getWidth();
            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
        }
        return MeasureScope.layout$default(subcomposeMeasureScope, intRef.element, intRef2.element, null, new Function1() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$8$lambda$7$lambda$6;
                invoke$lambda$8$lambda$7$lambda$6 = TabRowKt$ScrollableTabRow$2.invoke$lambda$8$lambda$7$lambda$6(i3, arrayList2, subcomposeMeasureScope, function22, scrollableTabData, i, constraints, intRef, intRef2, function3, (Placeable.PlacementScope) obj);
                return invoke$lambda$8$lambda$7$lambda$6;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(int i, List list, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, ScrollableTabData scrollableTabData, int i2, Constraints constraints, Ref.IntRef intRef, Ref.IntRef intRef2, final Function3 function3, Placeable.PlacementScope placementScope) {
        final ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i3 = i;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i3, 0, 0.0f, 4, null);
            arrayList.add(new TabPosition(subcomposeMeasureScope.mo421toDpu2uoSUM(i3), subcomposeMeasureScope.mo421toDpu2uoSUM(placeable.getWidth()), null));
            i3 += placeable.getWidth();
        }
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Divider, function2);
        int size2 = subcompose.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable mo7075measureBRTryo0 = subcompose.get(i5).mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(constraints.getValue(), intRef.element, intRef.element, 0, 0, 8, null));
            Placeable.PlacementScope.placeRelative$default(placementScope, mo7075measureBRTryo0, 0, intRef2.element - mo7075measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-43203918, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i6) {
                ComposerKt.sourceInformation(composer, "C290@14341L23:TabRow.kt#jmzs0o");
                if (!composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-43203918, i6, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:290)");
                }
                function3.invoke(arrayList, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        int size3 = subcompose2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i6).mo7075measureBRTryo0(Constraints.INSTANCE.m8364fixedJhjzzOo(intRef.element, intRef2.element)), 0, 0, 0.0f, 4, null);
        }
        scrollableTabData.onLaidOut(subcomposeMeasureScope, i, arrayList, i2);
        return Unit.INSTANCE;
    }
}
