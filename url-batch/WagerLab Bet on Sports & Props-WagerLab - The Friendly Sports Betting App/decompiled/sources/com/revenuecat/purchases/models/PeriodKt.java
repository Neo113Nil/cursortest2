package com.revenuecat.purchases.models;

import com.revenuecat.purchases.models.Period;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: Period.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toPeriod", "Lkotlin/Pair;", "", "Lcom/revenuecat/purchases/models/Period$Unit;", "", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PeriodKt {

    /* compiled from: Period.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Period.Unit> toPeriod(String str) {
        Period.Unit unit;
        double d;
        double d2;
        double d3;
        MatchResult matchEntire = new Regex("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$").matchEntire(str);
        if (matchEntire != null) {
            PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = new Function1<String, Integer>() { // from class: com.revenuecat.purchases.models.PeriodKt$toPeriod$1$toInt$1
                @Override // kotlin.jvm.functions.Function1
                public final Integer invoke(String part) {
                    Intrinsics.checkNotNullParameter(part, "part");
                    Integer intOrNull = StringsKt.toIntOrNull(StringsKt.dropLast(part, 1));
                    return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0);
                }
            };
            MatchResult.Destructured destructured = matchEntire.getDestructured();
            String str2 = destructured.getMatch().getGroupValues().get(1);
            String str3 = destructured.getMatch().getGroupValues().get(2);
            String str4 = destructured.getMatch().getGroupValues().get(3);
            String str5 = destructured.getMatch().getGroupValues().get(4);
            int intValue = periodKt$toPeriod$1$toInt$1.invoke((PeriodKt$toPeriod$1$toInt$1) str2).intValue();
            int intValue2 = periodKt$toPeriod$1$toInt$1.invoke((PeriodKt$toPeriod$1$toInt$1) str3).intValue();
            int intValue3 = periodKt$toPeriod$1$toInt$1.invoke((PeriodKt$toPeriod$1$toInt$1) str4).intValue();
            int intValue4 = periodKt$toPeriod$1$toInt$1.invoke((PeriodKt$toPeriod$1$toInt$1) str5).intValue();
            if (intValue4 > 0) {
                unit = Period.Unit.DAY;
            } else if (intValue3 > 0) {
                unit = Period.Unit.WEEK;
            } else if (intValue2 > 0) {
                unit = Period.Unit.MONTH;
            } else if (intValue > 0) {
                unit = Period.Unit.YEAR;
            } else {
                unit = Period.Unit.UNKNOWN;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    d2 = intValue * 12.0d;
                    d3 = intValue2;
                } else if (i == 3) {
                    d2 = (intValue * 52.142857142857146d) + (intValue2 * 4.345238095238096d);
                    d3 = intValue3;
                } else if (i == 4) {
                    d2 = (intValue * 365.0d) + (intValue2 * 30.0d) + (intValue3 * 7.0d);
                    d3 = intValue4;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d = 0.0d;
                }
                d = d2 + d3;
            } else {
                d = intValue;
            }
            return new Pair<>(Integer.valueOf(MathKt.roundToInt(d)), unit);
        }
        return new Pair<>(0, Period.Unit.UNKNOWN);
    }
}
