package com.yandex.div.core.view2.divs;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SizeUnitUtils.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\b\u001a#\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\n*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a#\u0010\u000f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u000f\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\b\u001a#\u0010\u0010\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u0011\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\b\u001a#\u0010\u0012\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000b\u001a#\u0010\u0013\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u0013\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\b\u001a#\u0010\u0014\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u000b\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u000eH\u0000\u001a\u001c\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u001a\u001c\u0010\u0016\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u001a\u001c\u0010\u0016\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u001a\u001c\u0010\u0016\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u001c\u001a\u00020\n*\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u001a\u001c\u0010\u001c\u001a\u00020\n*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a+\u0010\u001d\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u001e\u001a!\u0010\u001d\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u001f\u001a+\u0010 \u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0004\u0018\u0001H\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"dpToPx", "", "T", "", "metrics", "Landroid/util/DisplayMetrics;", "(Ljava/lang/Number;Landroid/util/DisplayMetrics;)I", "", "(Ljava/lang/Long;Landroid/util/DisplayMetrics;)I", "dpToPxF", "", "(Ljava/lang/Number;Landroid/util/DisplayMetrics;)F", "fontSizeToPx", "unit", "Lcom/yandex/div2/DivSizeUnit;", "pxToDp", "pxToDpF", "pxToSp", "pxToSpF", "spToPx", "spToPxF", "toAndroidUnit", "toPx", "Lcom/yandex/div2/DivDimension;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div2/DivSizeUnitValue;", "toPxF", "unitToPx", "(Ljava/lang/Number;Landroid/util/DisplayMetrics;Lcom/yandex/div2/DivSizeUnit;)I", "(Ljava/lang/Long;Landroid/util/DisplayMetrics;Lcom/yandex/div2/DivSizeUnit;)I", "unitToPxF", "(Ljava/lang/Number;Landroid/util/DisplayMetrics;Lcom/yandex/div2/DivSizeUnit;)F", "div_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "com/yandex/div/core/view2/divs/BaseDivViewExtensionsKt")
/* loaded from: classes5.dex */
final /* synthetic */ class BaseDivViewExtensionsKt__SizeUnitUtilsKt {

    /* compiled from: SizeUnitUtils.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends Number> float dpToPxF(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, t != null ? t.floatValue() : 0.0f, displayMetrics);
    }

    public static final <T extends Number> float spToPxF(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, t != null ? t.floatValue() : 0.0f, displayMetrics);
    }

    public static final <T extends Number> float unitToPxF(@Nullable T t, @NotNull DisplayMetrics displayMetrics, @NotNull DivSizeUnit divSizeUnit) {
        return TypedValue.applyDimension(BaseDivViewExtensionsKt.toAndroidUnit(divSizeUnit), t != null ? t.floatValue() : 0.0f, displayMetrics);
    }

    public static final <T extends Number> float pxToDpF(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        float deriveDimension;
        if (Build.VERSION.SDK_INT < 34) {
            return (t != null ? t.floatValue() : 0.0f) / displayMetrics.density;
        }
        deriveDimension = TypedValue.deriveDimension(1, t != null ? t.floatValue() : 0.0f, displayMetrics);
        return deriveDimension;
    }

    public static final <T extends Number> float pxToSpF(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        float deriveDimension;
        if (Build.VERSION.SDK_INT < 34) {
            return (t != null ? t.floatValue() : 0.0f) / displayMetrics.scaledDensity;
        }
        deriveDimension = TypedValue.deriveDimension(2, t != null ? t.floatValue() : 0.0f, displayMetrics);
        return deriveDimension;
    }

    public static final <T extends Number> int dpToPx(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return MathKt.roundToInt(BaseDivViewExtensionsKt.dpToPxF(t, displayMetrics));
    }

    public static final <T extends Number> int spToPx(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return MathKt.roundToInt(BaseDivViewExtensionsKt.spToPxF(t, displayMetrics));
    }

    public static final <T extends Number> int unitToPx(@Nullable T t, @NotNull DisplayMetrics displayMetrics, @NotNull DivSizeUnit divSizeUnit) {
        return MathKt.roundToInt(BaseDivViewExtensionsKt.unitToPxF(t, displayMetrics, divSizeUnit));
    }

    public static final <T extends Number> int pxToDp(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return MathKt.roundToInt(BaseDivViewExtensionsKt.pxToDpF(t, displayMetrics));
    }

    public static final <T extends Number> int pxToSp(@Nullable T t, @NotNull DisplayMetrics displayMetrics) {
        return MathKt.roundToInt(BaseDivViewExtensionsKt.pxToSpF(t, displayMetrics));
    }

    public static final int dpToPx(@Nullable Long l, @NotNull DisplayMetrics displayMetrics) {
        Integer num;
        int i;
        if (l != null) {
            long longValue = l.longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return BaseDivViewExtensionsKt.dpToPx(num, displayMetrics);
    }

    public static final int spToPx(@Nullable Long l, @NotNull DisplayMetrics displayMetrics) {
        Integer num;
        int i;
        if (l != null) {
            long longValue = l.longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return BaseDivViewExtensionsKt.spToPx(num, displayMetrics);
    }

    public static final int unitToPx(@Nullable Long l, @NotNull DisplayMetrics displayMetrics, @NotNull DivSizeUnit divSizeUnit) {
        Integer num;
        int i;
        if (l != null) {
            long longValue = l.longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return BaseDivViewExtensionsKt.unitToPx(num, displayMetrics, divSizeUnit);
    }

    public static final int pxToDp(@Nullable Long l, @NotNull DisplayMetrics displayMetrics) {
        Integer num;
        int i;
        if (l != null) {
            long longValue = l.longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return BaseDivViewExtensionsKt.pxToDp(num, displayMetrics);
    }

    public static final int pxToSp(@Nullable Long l, @NotNull DisplayMetrics displayMetrics) {
        Integer num;
        int i;
        if (l != null) {
            long longValue = l.longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        return BaseDivViewExtensionsKt.pxToSp(num, displayMetrics);
    }

    public static final int toPx(long j, @NotNull DivSizeUnit divSizeUnit, @NotNull DisplayMetrics displayMetrics) {
        int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j), displayMetrics);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = j >> 31;
        if (j2 == 0 || j2 == -1) {
            return (int) j;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + j + "' to Int");
        }
        return j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final int toPx(@NotNull DivFixedSize divFixedSize, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        int i = WhenMappings.$EnumSwitchMapping$0[((DivSizeUnit) divFixedSize.unit.evaluate(expressionResolver)).ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPx((Long) divFixedSize.value.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPx((Long) divFixedSize.value.evaluate(expressionResolver), displayMetrics);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        long longValue = ((Number) divFixedSize.value.evaluate(expressionResolver)).longValue();
        long j = longValue >> 31;
        if (j == 0 || j == -1) {
            return (int) longValue;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + longValue + "' to Int");
        }
        return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final int toPx(@NotNull DivSizeUnitValue divSizeUnitValue, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        int i = WhenMappings.$EnumSwitchMapping$0[((DivSizeUnit) divSizeUnitValue.unit.evaluate(expressionResolver)).ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPx((Long) divSizeUnitValue.value.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPx((Long) divSizeUnitValue.value.evaluate(expressionResolver), displayMetrics);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        long longValue = ((Number) divSizeUnitValue.value.evaluate(expressionResolver)).longValue();
        long j = longValue >> 31;
        if (j == 0 || j == -1) {
            return (int) longValue;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + longValue + "' to Int");
        }
        return longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final float toPxF(@NotNull DivFixedSize divFixedSize, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.toPxF(((Number) divFixedSize.value.evaluate(expressionResolver)).longValue(), (DivSizeUnit) divFixedSize.unit.evaluate(expressionResolver), displayMetrics);
    }

    public static final float toPxF(long j, @NotNull DivSizeUnit divSizeUnit, @NotNull DisplayMetrics displayMetrics) {
        int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(j), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPxF(Long.valueOf(j), displayMetrics);
        }
        if (i == 3) {
            return j;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toPx(@NotNull DivDimension divDimension, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        int i = WhenMappings.$EnumSwitchMapping$0[((DivSizeUnit) divDimension.unit.evaluate(expressionResolver)).ordinal()];
        if (i == 1) {
            return BaseDivViewExtensionsKt.dpToPx((Number) divDimension.value.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 2) {
            return BaseDivViewExtensionsKt.spToPx((Number) divDimension.value.evaluate(expressionResolver), displayMetrics);
        }
        if (i == 3) {
            return (int) ((Number) divDimension.value.evaluate(expressionResolver)).doubleValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toAndroidUnit(@NotNull DivSizeUnit divSizeUnit) {
        int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float fontSizeToPx(long j, @NotNull DivSizeUnit divSizeUnit, @NotNull DisplayMetrics displayMetrics) {
        Number valueOf;
        int i = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i == 1) {
            valueOf = Integer.valueOf(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j), displayMetrics));
        } else if (i == 2) {
            valueOf = Integer.valueOf(BaseDivViewExtensionsKt.spToPx(Long.valueOf(j), displayMetrics));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = Long.valueOf(j);
        }
        return valueOf.floatValue();
    }
}
