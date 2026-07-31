package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.internal.LayoutUtilKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\n\u001a\u00020\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\"\u0010\u0019\u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\"\u0010\u001a\u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J\"\u0010\u001c\u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J8\u0010\u001d\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001b\u001a\u00020\u00152\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001fH\u0002J<\u0010 \u001a\u00020\u0015*\u00020\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0018\u001a\u00020\u00152\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "height", "minIntrinsicWidth", "intrinsicWidth", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        int i;
        Measurable measurable3;
        final int i2;
        Measurable measurable4;
        final int m2232calculateWidthVsPV1Ek;
        final int m2231calculateHeightO3s9Psw;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        final int i3 = measureScope2.mo418roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getTop());
        int i4 = measureScope2.mo418roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getBottom());
        final int i5 = measureScope2.mo418roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long m8344copyZbe2FdA$default = Constraints.m8344copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list3 = list2;
        int size = list3.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i6);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                break;
            }
            i6++;
        }
        Measurable measurable5 = measurable;
        Placeable mo7075measureBRTryo0 = measurable5 != null ? measurable5.mo7075measureBRTryo0(m8344copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo7075measureBRTryo0);
        int size2 = list3.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i7);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                break;
            }
            i7++;
        }
        Measurable measurable6 = measurable2;
        Placeable mo7075measureBRTryo02 = measurable6 != null ? measurable6.mo7075measureBRTryo0(ConstraintsKt.m8374offsetNN6EwU$default(m8344copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int i8 = -i4;
        int i9 = -(widthOrZero + TextFieldImplKt.widthOrZero(mo7075measureBRTryo02));
        long m8373offsetNN6EwU = ConstraintsKt.m8373offsetNN6EwU(m8344copyZbe2FdA$default, i9, i8);
        int size3 = list3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                i = i4;
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i10);
            i = i4;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Label")) {
                break;
            }
            i10++;
            i4 = i;
        }
        Measurable measurable7 = measurable3;
        Placeable mo7075measureBRTryo03 = measurable7 != null ? measurable7.mo7075measureBRTryo0(m8373offsetNN6EwU) : null;
        if (mo7075measureBRTryo03 != null) {
            i2 = mo7075measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (i2 == Integer.MIN_VALUE) {
                i2 = mo7075measureBRTryo03.getHeight();
            }
        } else {
            i2 = 0;
        }
        final int max = Math.max(i2, i3);
        Placeable placeable = mo7075measureBRTryo03;
        long m8373offsetNN6EwU2 = ConstraintsKt.m8373offsetNN6EwU(Constraints.m8344copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i9, mo7075measureBRTryo03 != null ? (i8 - i5) - max : (-i3) - i);
        int size4 = list3.size();
        int i11 = 0;
        while (i11 < size4) {
            Measurable measurable8 = list2.get(i11);
            int i12 = size4;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable8), "TextField")) {
                final Placeable mo7075measureBRTryo04 = measurable8.mo7075measureBRTryo0(m8373offsetNN6EwU2);
                long m8344copyZbe2FdA$default2 = Constraints.m8344copyZbe2FdA$default(m8373offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size5 = list3.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size5) {
                        measurable4 = null;
                        break;
                    }
                    measurable4 = list2.get(i13);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "Hint")) {
                        break;
                    }
                    i13++;
                    list2 = list;
                }
                Measurable measurable9 = measurable4;
                final Placeable mo7075measureBRTryo05 = measurable9 != null ? measurable9.mo7075measureBRTryo0(m8344copyZbe2FdA$default2) : null;
                m2232calculateWidthVsPV1Ek = TextFieldKt.m2232calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(mo7075measureBRTryo0), TextFieldImplKt.widthOrZero(mo7075measureBRTryo02), mo7075measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(mo7075measureBRTryo05), j);
                m2231calculateHeightO3s9Psw = TextFieldKt.m2231calculateHeightO3s9Psw(mo7075measureBRTryo04.getHeight(), placeable != null, max, TextFieldImplKt.heightOrZero(mo7075measureBRTryo0), TextFieldImplKt.heightOrZero(mo7075measureBRTryo02), TextFieldImplKt.heightOrZero(mo7075measureBRTryo05), j, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                final Placeable placeable2 = mo7075measureBRTryo02;
                final Placeable placeable3 = placeable;
                final Placeable placeable4 = mo7075measureBRTryo0;
                return MeasureScope.layout$default(measureScope, m2232calculateWidthVsPV1Ek, m2231calculateHeightO3s9Psw, null, new Function1() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit measure_3p2s80s$lambda$6;
                        measure_3p2s80s$lambda$6 = TextFieldMeasurePolicy.measure_3p2s80s$lambda$6(Placeable.this, i3, i2, m2232calculateWidthVsPV1Ek, m2231calculateHeightO3s9Psw, mo7075measureBRTryo04, mo7075measureBRTryo05, placeable4, placeable2, textFieldMeasurePolicy, max, i5, measureScope2, (Placeable.PlacementScope) obj);
                        return measure_3p2s80s$lambda$6;
                    }
                }, 4, null);
            }
            i11++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            list2 = list;
            placeable = placeable;
            size4 = i12;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$6(Placeable placeable, int i, int i2, int i3, int i4, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i5, int i6, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        if (placeable == null) {
            TextFieldKt.placeWithoutLabel(placementScope, i3, i4, placeable2, placeable3, placeable4, placeable5, textFieldMeasurePolicy.singleLine, measureScope.getDensity(), textFieldMeasurePolicy.paddingValues);
        } else {
            TextFieldKt.placeWithLabel(placementScope, i3, i4, placeable2, placeable, placeable3, placeable4, placeable5, textFieldMeasurePolicy.singleLine, RangesKt.coerceAtLeast(i - i2, 0), i5 + i6, textFieldMeasurePolicy.animationProgress, measureScope.getDensity());
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int maxIntrinsicHeight;
                maxIntrinsicHeight = ((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicHeight);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new Function2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int minIntrinsicHeight;
                minIntrinsicHeight = ((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicHeight);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int maxIntrinsicWidth;
                maxIntrinsicWidth = ((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(maxIntrinsicWidth);
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new Function2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int minIntrinsicWidth;
                minIntrinsicWidth = ((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue());
                return Integer.valueOf(minIntrinsicWidth);
            }
        });
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasurer) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m2232calculateWidthVsPV1Ek;
        List<? extends IntrinsicMeasurable> list = measurables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable5 = measurables.get(i);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), "TextField")) {
                int intValue = intrinsicMeasurer.invoke(intrinsicMeasurable5, Integer.valueOf(height)).intValue();
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i2 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = measurables.get(i2);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                        break;
                    }
                    i2++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
                int intValue2 = intrinsicMeasurable6 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable6, Integer.valueOf(height)).intValue() : 0;
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = measurables.get(i3);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
                int intValue3 = intrinsicMeasurable7 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable7, Integer.valueOf(height)).intValue() : 0;
                int size4 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = measurables.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
                int intValue4 = intrinsicMeasurable8 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable8, Integer.valueOf(height)).intValue() : 0;
                int size5 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = measurables.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m2232calculateWidthVsPV1Ek = TextFieldKt.m2232calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable10 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable10, Integer.valueOf(height)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
                return m2232calculateWidthVsPV1Ek;
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i2;
        int i3;
        int i4;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i5;
        IntrinsicMeasurable intrinsicMeasurable4;
        int m2231calculateHeightO3s9Psw;
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        int i6 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i6 >= size) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i6);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Leading")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i2 = i;
            i4 = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = function2.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue();
        } else {
            i2 = i;
            i3 = 0;
            i4 = i2;
        }
        int size2 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            i4 = LayoutUtilKt.subtractConstraintSafely(i4, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            i5 = function2.invoke(intrinsicMeasurable6, Integer.valueOf(i2)).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Label")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        int intValue = intrinsicMeasurable7 != null ? function2.invoke(intrinsicMeasurable7, Integer.valueOf(i4)).intValue() : 0;
        int size4 = list2.size();
        for (int i9 = 0; i9 < size4; i9++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i9);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), "TextField")) {
                int intValue2 = function2.invoke(intrinsicMeasurable8, Integer.valueOf(i4)).intValue();
                int size5 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i10);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i10++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                m2231calculateHeightO3s9Psw = TextFieldKt.m2231calculateHeightO3s9Psw(intValue2, intValue > 0, intValue, i3, i5, intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(i4)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m2231calculateHeightO3s9Psw;
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
