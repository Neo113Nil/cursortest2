package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AlertDialogKt$AlertDialogBaselineLayout$2$1 implements MeasurePolicy {
    public static final AlertDialogKt$AlertDialogBaselineLayout$2$1 INSTANCE = new AlertDialogKt$AlertDialogBaselineLayout$2$1();

    AlertDialogKt$AlertDialogBaselineLayout$2$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$7(Placeable placeable, int i, Placeable placeable2, int i2, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(placementScope, placeable2, 0, i2, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult mo47measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        int i;
        int i2;
        long j2;
        final int i3;
        int i4;
        long j3;
        int i5;
        final int i6;
        long j4;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i7);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "title")) {
                break;
            }
            i7++;
        }
        Measurable measurable3 = measurable;
        final Placeable mo7075measureBRTryo0 = measurable3 != null ? measurable3.mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
        int size2 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i8);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "text")) {
                break;
            }
            i8++;
        }
        Measurable measurable4 = measurable2;
        final Placeable mo7075measureBRTryo02 = measurable4 != null ? measurable4.mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
        int max = Math.max(mo7075measureBRTryo0 != null ? mo7075measureBRTryo0.getWidth() : 0, mo7075measureBRTryo02 != null ? mo7075measureBRTryo02.getWidth() : 0);
        if (mo7075measureBRTryo0 != null) {
            int intValue = Integer.valueOf(mo7075measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())).intValue();
            Integer valueOf = intValue == Integer.MIN_VALUE ? null : Integer.valueOf(intValue);
            if (valueOf != null) {
                i = valueOf.intValue();
                if (mo7075measureBRTryo0 != null) {
                    int i9 = mo7075measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
                    Integer valueOf2 = i9 == Integer.MIN_VALUE ? null : Integer.valueOf(i9);
                    if (valueOf2 != null) {
                        i2 = valueOf2.intValue();
                        j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
                        i3 = measureScope.mo417roundToPxR2X_6o(j2) - i;
                        if (mo7075measureBRTryo02 != null) {
                            int i10 = mo7075measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                            Integer valueOf3 = i10 != Integer.MIN_VALUE ? Integer.valueOf(i10) : null;
                            if (valueOf3 != null) {
                                i4 = valueOf3.intValue();
                                if (mo7075measureBRTryo0 != null) {
                                    j4 = AlertDialogKt.TextBaselineDistanceFromTop;
                                    i5 = measureScope.mo417roundToPxR2X_6o(j4);
                                } else {
                                    j3 = AlertDialogKt.TextBaselineDistanceFromTitle;
                                    i5 = measureScope.mo417roundToPxR2X_6o(j3);
                                }
                                int height = mo7075measureBRTryo0 == null ? mo7075measureBRTryo0.getHeight() + i3 : 0;
                                if (mo7075measureBRTryo0 != null) {
                                    i6 = i5 - i4;
                                } else {
                                    i6 = (i2 == 0 ? height - i4 : (i3 + i2) - i4) + i5;
                                }
                                if (mo7075measureBRTryo02 != null) {
                                    if (i2 == 0) {
                                        r4 = (mo7075measureBRTryo02.getHeight() + i5) - i4;
                                    } else {
                                        r4 = ((mo7075measureBRTryo02.getHeight() + i5) - i4) - ((mo7075measureBRTryo0 != null ? mo7075measureBRTryo0.getHeight() : 0) - i2);
                                    }
                                }
                                return MeasureScope.layout$default(measureScope, max, height + r4, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit measure_3p2s80s$lambda$7;
                                        measure_3p2s80s$lambda$7 = AlertDialogKt$AlertDialogBaselineLayout$2$1.measure_3p2s80s$lambda$7(Placeable.this, i3, mo7075measureBRTryo02, i6, (Placeable.PlacementScope) obj);
                                        return measure_3p2s80s$lambda$7;
                                    }
                                }, 4, null);
                            }
                        }
                        i4 = 0;
                        if (mo7075measureBRTryo0 != null) {
                        }
                        if (mo7075measureBRTryo0 == null) {
                        }
                        if (mo7075measureBRTryo0 != null) {
                        }
                        if (mo7075measureBRTryo02 != null) {
                        }
                        return MeasureScope.layout$default(measureScope, max, height + r4, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit measure_3p2s80s$lambda$7;
                                measure_3p2s80s$lambda$7 = AlertDialogKt$AlertDialogBaselineLayout$2$1.measure_3p2s80s$lambda$7(Placeable.this, i3, mo7075measureBRTryo02, i6, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$7;
                            }
                        }, 4, null);
                    }
                }
                i2 = 0;
                j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
                i3 = measureScope.mo417roundToPxR2X_6o(j2) - i;
                if (mo7075measureBRTryo02 != null) {
                }
                i4 = 0;
                if (mo7075measureBRTryo0 != null) {
                }
                if (mo7075measureBRTryo0 == null) {
                }
                if (mo7075measureBRTryo0 != null) {
                }
                if (mo7075measureBRTryo02 != null) {
                }
                return MeasureScope.layout$default(measureScope, max, height + r4, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit measure_3p2s80s$lambda$7;
                        measure_3p2s80s$lambda$7 = AlertDialogKt$AlertDialogBaselineLayout$2$1.measure_3p2s80s$lambda$7(Placeable.this, i3, mo7075measureBRTryo02, i6, (Placeable.PlacementScope) obj);
                        return measure_3p2s80s$lambda$7;
                    }
                }, 4, null);
            }
        }
        i = 0;
        if (mo7075measureBRTryo0 != null) {
        }
        i2 = 0;
        j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
        i3 = measureScope.mo417roundToPxR2X_6o(j2) - i;
        if (mo7075measureBRTryo02 != null) {
        }
        i4 = 0;
        if (mo7075measureBRTryo0 != null) {
        }
        if (mo7075measureBRTryo0 == null) {
        }
        if (mo7075measureBRTryo0 != null) {
        }
        if (mo7075measureBRTryo02 != null) {
        }
        return MeasureScope.layout$default(measureScope, max, height + r4, null, new Function1() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$7;
                measure_3p2s80s$lambda$7 = AlertDialogKt$AlertDialogBaselineLayout$2$1.measure_3p2s80s$lambda$7(Placeable.this, i3, mo7075measureBRTryo02, i6, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$7;
            }
        }, 4, null);
    }
}
