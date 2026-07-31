package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowKt$TabRow$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

    /* JADX WARN: Multi-variable type inference failed */
    TabRowKt$TabRow$2(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3) {
        this.$tabs = function2;
        this.$divider = function22;
        this.$indicator = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C150@7343L1334,150@7301L1376:TabRow.kt#jmzs0o");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-638448612, i, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:150)");
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composer, 631210194, "CC(remember):TabRow.kt#9igjgp");
        boolean changed = composer.changed(this.$tabs) | composer.changed(this.$divider) | composer.changed(this.$indicator);
        final Function2<Composer, Integer, Unit> function2 = this.$tabs;
        final Function2<Composer, Integer, Unit> function22 = this.$divider;
        final Function3<List<TabPosition>, Composer, Integer, Unit> function3 = this.$indicator;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function2() { // from class: androidx.compose.material.TabRowKt$TabRow$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    MeasureResult invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = TabRowKt$TabRow$2.invoke$lambda$8$lambda$7(Function2.this, function22, function3, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult invoke$lambda$8$lambda$7(Function2 function2, final Function2 function22, final Function3 function3, final SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        int i;
        Object obj;
        final int m8354getMaxWidthimpl = Constraints.m8354getMaxWidthimpl(constraints.getValue());
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function2);
        int size = subcompose.size();
        int i2 = m8354getMaxWidthimpl / size;
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size2 = subcompose.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4 = i2;
            arrayList.add(subcompose.get(i3).mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(constraints.getValue(), i4, i4, 0, 0, 12, null)));
            i3++;
            i2 = i4;
            subcompose = subcompose;
        }
        final int i5 = i2;
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            obj = null;
            i = 0;
        } else {
            i = 0;
            obj = arrayList2.get(0);
            int height = ((Placeable) obj).getHeight();
            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
            int i6 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Object obj2 = arrayList2.get(i6);
                    int height2 = ((Placeable) obj2).getHeight();
                    if (height < height2) {
                        obj = obj2;
                        height = height2;
                    }
                    if (i6 == lastIndex) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int height3 = placeable != null ? placeable.getHeight() : i;
        ArrayList arrayList3 = new ArrayList(size);
        for (int i7 = i; i7 < size; i7++) {
            arrayList3.add(new TabPosition(Dp.m8401constructorimpl(subcomposeMeasureScope.mo421toDpu2uoSUM(i5) * i7), subcomposeMeasureScope.mo421toDpu2uoSUM(i5), null));
        }
        final ArrayList arrayList4 = arrayList3;
        final int i8 = height3;
        return MeasureScope.layout$default(subcomposeMeasureScope, m8354getMaxWidthimpl, i8, null, new Function1() { // from class: androidx.compose.material.TabRowKt$TabRow$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                Unit invoke$lambda$8$lambda$7$lambda$6;
                invoke$lambda$8$lambda$7$lambda$6 = TabRowKt$TabRow$2.invoke$lambda$8$lambda$7$lambda$6(arrayList2, subcomposeMeasureScope, function22, i5, constraints, i8, function3, arrayList4, m8354getMaxWidthimpl, (Placeable.PlacementScope) obj3);
                return invoke$lambda$8$lambda$7$lambda$6;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(List list, SubcomposeMeasureScope subcomposeMeasureScope, Function2 function2, int i, Constraints constraints, int i2, final Function3 function3, final List list2, int i3, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i4), i4 * i, 0, 0.0f, 4, null);
        }
        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Divider, function2);
        int size2 = subcompose.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable mo7075measureBRTryo0 = subcompose.get(i5).mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, 0, 11, null));
            Placeable.PlacementScope.placeRelative$default(placementScope, mo7075measureBRTryo0, 0, i2 - mo7075measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-220665376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1$1$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i6) {
                ComposerKt.sourceInformation(composer, "C175@8470L23:TabRow.kt#jmzs0o");
                if (!composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-220665376, i6, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                }
                function3.invoke(list2, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        int size3 = subcompose2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose2.get(i6).mo7075measureBRTryo0(Constraints.INSTANCE.m8364fixedJhjzzOo(i3, i2)), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
