package com.yandex.div.core.util;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.div.core.animation.EaseInInterpolator;
import com.yandex.div.core.animation.EaseInOutInterpolator;
import com.yandex.div.core.animation.EaseInterpolator;
import com.yandex.div.core.animation.EaseOutInterpolator;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.drawable.CircleDrawable;
import com.yandex.div.internal.drawable.RoundedRectDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeDrawable;
import com.yandex.div2.DivSightAction;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivState;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivVisibilityAction;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivUtil.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0000\u001a\u001c\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010'2\b\u0010%\u001a\u0004\u0018\u00010(H\u0000\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010)\u001a\u00020\u0012H\u0000\u001a\u001c\u0010*\u001a\u00020\u0012*\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-H\u0000\u001a\u0014\u0010.\u001a\u00020\u0012*\u00020/2\u0006\u0010,\u001a\u00020-H\u0002\u001a\u0014\u00100\u001a\u00020\u0012*\u00020\u00192\u0006\u0010,\u001a\u00020-H\u0000\u001a,\u00101\u001a\u000202*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u0010,\u001a\u00020-H\u0000\u001a\u0016\u00109\u001a\u0004\u0018\u00010:*\u00020;2\u0006\u0010,\u001a\u00020-H\u0000\u001a\u001c\u0010<\u001a\u000205*\u00020=2\u0006\u00107\u001a\u0002082\u0006\u0010,\u001a\u00020-H\u0002\u001a\u0014\u0010>\u001a\u00020\u0012*\u00020?2\u0006\u0010,\u001a\u00020-H\u0000\u001a\u0014\u0010@\u001a\u00020\u0012*\u00020?2\u0006\u0010,\u001a\u00020-H\u0000\u001a\f\u0010A\u001a\u00020$*\u00020'H\u0000\u001a\f\u0010B\u001a\u00020&*\u00020(H\u0000\u001a\u001e\u0010C\u001a\u0004\u0018\u00010D*\u00020E2\u0006\u00107\u001a\u0002082\u0006\u0010,\u001a\u00020-H\u0000\u001a\u001e\u0010C\u001a\u0004\u0018\u00010D*\u00020F2\u0006\u00107\u001a\u0002082\u0006\u0010,\u001a\u00020-H\u0000\u001a\f\u0010G\u001a\u00020H*\u00020IH\u0000\u001a*\u0010J\u001a\u00020\"*\u0004\u0018\u00010/2\u0006\u00107\u001a\u0002082\u0006\u0010,\u001a\u00020-2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010LH\u0000\u001a\f\u0010M\u001a\u00020N*\u00020OH\u0000\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005\"\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\"\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017\"\u0018\u0010\u0018\u001a\u00020\u0012*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001a\"\u0018\u0010\u001b\u001a\u00020\u0012*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a\"\u0018\u0010\u001c\u001a\u00020\u0012*\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017\"\u0018\u0010\u001d\u001a\u00020\u001e*\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006P"}, d2 = {"allAppearActions", "", "Lcom/yandex/div2/DivVisibilityAction;", "Lcom/yandex/div2/DivBase;", "getAllAppearActions", "(Lcom/yandex/div2/DivBase;)Ljava/util/List;", "allDisappearActions", "Lcom/yandex/div2/DivDisappearAction;", "getAllDisappearActions", "allSightActions", "Lcom/yandex/div2/DivSightAction;", "getAllSightActions", "androidInterpolator", "Landroid/view/animation/Interpolator;", "Lcom/yandex/div2/DivAnimationInterpolator;", "getAndroidInterpolator", "(Lcom/yandex/div2/DivAnimationInterpolator;)Landroid/view/animation/Interpolator;", "hasSightActions", "", "getHasSightActions", "(Lcom/yandex/div2/DivBase;)Z", "isAlternated", "Lcom/yandex/div2/DivAnimationDirection;", "(Lcom/yandex/div2/DivAnimationDirection;)Z", "isBranch", "Lcom/yandex/div2/Div;", "(Lcom/yandex/div2/Div;)Z", "isLeaf", "isReversed", "type", "", "getType", "(Lcom/yandex/div2/Div;)Ljava/lang/String;", "evaluateGravity", "", "horizontal", "Lcom/yandex/div2/DivAlignmentHorizontal;", "vertical", "Lcom/yandex/div2/DivAlignmentVertical;", "Lcom/yandex/div2/DivContentAlignmentHorizontal;", "Lcom/yandex/div2/DivContentAlignmentVertical;", "reverse", "canBeReused", "other", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "canWrap", "Lcom/yandex/div2/DivSize;", "containsStateInnerTransitions", "getCornerRadii", "", "Lcom/yandex/div2/DivBorder;", "widthPx", "", "heightPx", "metrics", "Landroid/util/DisplayMetrics;", "getDefaultState", "Lcom/yandex/div2/DivState$State;", "Lcom/yandex/div2/DivState;", "getWidthPxF", "Lcom/yandex/div2/DivStroke;", "isHorizontal", "Lcom/yandex/div2/DivContainer;", "isWrapContainer", "toAlignmentHorizontal", "toAlignmentVertical", "toDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/yandex/div2/DivDrawable;", "Lcom/yandex/div2/DivShapeDrawable;", "toImageScale", "Lcom/yandex/div/internal/widget/AspectImageView$Scale;", "Lcom/yandex/div2/DivImageScale;", "toLayoutParamsSize", "lp", "Landroid/view/ViewGroup$LayoutParams;", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "Lcom/yandex/div2/DivBlendMode;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DivUtilKt {

    /* compiled from: DivUtil.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[DivAnimationInterpolator.values().length];
            try {
                iArr[DivAnimationInterpolator.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_IN_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAnimationInterpolator.SPRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivAnimationDirection.values().length];
            try {
                iArr2[DivAnimationDirection.REVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DivAnimationDirection.ALTERNATE_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DivAnimationDirection.ALTERNATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr3[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivAlignmentVertical.values().length];
            try {
                iArr4[DivAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[DivAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[DivAlignmentVertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[DivContentAlignmentHorizontal.values().length];
            try {
                iArr5[DivContentAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_AROUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_EVENLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[DivContentAlignmentVertical.values().length];
            try {
                iArr6[DivContentAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[DivContentAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[DivContentAlignmentVertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_BETWEEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[DivContentAlignmentVertical.BASELINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[DivBlendMode.values().length];
            try {
                iArr7[DivBlendMode.SOURCE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[DivBlendMode.SOURCE_ATOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[DivBlendMode.DARKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[DivBlendMode.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr7[DivBlendMode.MULTIPLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr7[DivBlendMode.SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[DivImageScale.values().length];
            try {
                iArr8[DivImageScale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[DivImageScale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[DivImageScale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr8[DivImageScale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    @NotNull
    public static final String getType(@NotNull Div div) {
        if (div instanceof Div.Text) {
            return "text";
        }
        if (div instanceof Div.Image) {
            return "image";
        }
        if (div instanceof Div.GifImage) {
            return "gif";
        }
        if (div instanceof Div.Separator) {
            return "separator";
        }
        if (div instanceof Div.Indicator) {
            return "indicator";
        }
        if (div instanceof Div.Slider) {
            return "slider";
        }
        if (div instanceof Div.Input) {
            return "input";
        }
        if (div instanceof Div.Video) {
            return "video";
        }
        if (div instanceof Div.Container) {
            return "container";
        }
        if (div instanceof Div.Grid) {
            return "grid";
        }
        if (div instanceof Div.State) {
            return "state";
        }
        if (div instanceof Div.Gallery) {
            return "gallery";
        }
        if (div instanceof Div.Pager) {
            return "pager";
        }
        if (div instanceof Div.Tabs) {
            return "tabs";
        }
        if (div instanceof Div.Custom) {
            return "custom";
        }
        if (div instanceof Div.Select) {
            return "select";
        }
        if (div instanceof Div.Switch) {
            return "switch";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean canBeReused(@NotNull Div div, @NotNull Div div2, @NotNull ExpressionResolver expressionResolver) {
        if (!Intrinsics.areEqual(getType(div), getType(div2))) {
            return false;
        }
        DivBase value = div.value();
        DivBase value2 = div2.value();
        if ((value instanceof DivImage) && (value2 instanceof DivImage)) {
            return Intrinsics.areEqual(((DivImage) value).imageUrl.evaluate(expressionResolver), ((DivImage) value2).imageUrl.evaluate(expressionResolver));
        }
        return value.getBackground() == value2.getBackground();
    }

    @NotNull
    public static final Interpolator getAndroidInterpolator(@NotNull DivAnimationInterpolator divAnimationInterpolator) {
        switch (WhenMappings.$EnumSwitchMapping$0[divAnimationInterpolator.ordinal()]) {
            case 1:
                return new LinearInterpolator();
            case 2:
                return new EaseInterpolator();
            case 3:
                return new EaseInInterpolator();
            case 4:
                return new EaseOutInterpolator();
            case 5:
                return new EaseInOutInterpolator();
            case 6:
                return new SpringInterpolator();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final Interpolator androidInterpolator(@NotNull DivAnimationInterpolator divAnimationInterpolator, boolean z) {
        if (z) {
            return ReverseInterpolatorKt.reversed(getAndroidInterpolator(divAnimationInterpolator));
        }
        return getAndroidInterpolator(divAnimationInterpolator);
    }

    public static final boolean isReversed(@NotNull DivAnimationDirection divAnimationDirection) {
        int i = WhenMappings.$EnumSwitchMapping$1[divAnimationDirection.ordinal()];
        return i == 1 || i == 2;
    }

    public static final boolean isAlternated(@NotNull DivAnimationDirection divAnimationDirection) {
        int i = WhenMappings.$EnumSwitchMapping$1[divAnimationDirection.ordinal()];
        return i == 2 || i == 3;
    }

    @NotNull
    public static final float[] getCornerRadii(@NotNull DivBorder divBorder, float f, float f2, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        DivCornersRadius divCornersRadius = divBorder.cornersRadius;
        if (divCornersRadius == null || (expression = divCornersRadius.topLeft) == null) {
            expression = divBorder.cornerRadius;
        }
        float dpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? (Long) expression.evaluate(expressionResolver) : null, displayMetrics);
        DivCornersRadius divCornersRadius2 = divBorder.cornersRadius;
        if (divCornersRadius2 == null || (expression2 = divCornersRadius2.topRight) == null) {
            expression2 = divBorder.cornerRadius;
        }
        float dpToPx2 = BaseDivViewExtensionsKt.dpToPx(expression2 != null ? (Long) expression2.evaluate(expressionResolver) : null, displayMetrics);
        DivCornersRadius divCornersRadius3 = divBorder.cornersRadius;
        if (divCornersRadius3 == null || (expression3 = divCornersRadius3.bottomLeft) == null) {
            expression3 = divBorder.cornerRadius;
        }
        float dpToPx3 = BaseDivViewExtensionsKt.dpToPx(expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null, displayMetrics);
        DivCornersRadius divCornersRadius4 = divBorder.cornersRadius;
        if (divCornersRadius4 == null || (expression4 = divCornersRadius4.bottomRight) == null) {
            expression4 = divBorder.cornerRadius;
        }
        float dpToPx4 = BaseDivViewExtensionsKt.dpToPx(expression4 != null ? (Long) expression4.evaluate(expressionResolver) : null, displayMetrics);
        Float f3 = (Float) Collections.min(CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f / (dpToPx + dpToPx2)), Float.valueOf(f / (dpToPx3 + dpToPx4)), Float.valueOf(f2 / (dpToPx + dpToPx3)), Float.valueOf(f2 / (dpToPx2 + dpToPx4))}));
        if (f3.floatValue() > 0.0f && f3.floatValue() < 1.0f) {
            dpToPx *= f3.floatValue();
            dpToPx2 *= f3.floatValue();
            dpToPx3 *= f3.floatValue();
            dpToPx4 *= f3.floatValue();
        }
        return new float[]{dpToPx, dpToPx, dpToPx2, dpToPx2, dpToPx4, dpToPx4, dpToPx3, dpToPx3};
    }

    public static final boolean containsStateInnerTransitions(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        DivBase value = div.value();
        if (value.getTransitionIn() != null || value.getTransitionChange() != null || value.getTransitionOut() != null) {
            return true;
        }
        if (!(div instanceof Div.Container)) {
            if (!(div instanceof Div.Grid)) {
                if (!(div instanceof Div.Text) && !(div instanceof Div.Image) && !(div instanceof Div.GifImage) && !(div instanceof Div.Separator) && !(div instanceof Div.Indicator) && !(div instanceof Div.State) && !(div instanceof Div.Gallery) && !(div instanceof Div.Pager) && !(div instanceof Div.Tabs) && !(div instanceof Div.Custom) && !(div instanceof Div.Select) && !(div instanceof Div.Slider) && !(div instanceof Div.Video) && !(div instanceof Div.Input) && !(div instanceof Div.Switch)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                List<Div> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(((Div.Grid) div).getValue());
                if (!(nonNullItems instanceof Collection) || !nonNullItems.isEmpty()) {
                    Iterator<T> it = nonNullItems.iterator();
                    while (it.hasNext()) {
                        if (containsStateInnerTransitions((Div) it.next(), expressionResolver)) {
                            return true;
                        }
                    }
                }
            }
        } else {
            List<DivItemBuilderResult> buildItems = DivCollectionExtensionsKt.buildItems(((Div.Container) div).getValue(), expressionResolver);
            if (!(buildItems instanceof Collection) || !buildItems.isEmpty()) {
                for (DivItemBuilderResult divItemBuilderResult : buildItems) {
                    if (containsStateInnerTransitions(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    public static final DivState.State getDefaultState(@NotNull DivState divState, @NotNull ExpressionResolver expressionResolver) {
        Object obj;
        Expression expression = divState.defaultStateId;
        if (expression != null) {
            Iterator it = divState.states.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((DivState.State) obj).stateId, expression.evaluate(expressionResolver))) {
                    break;
                }
            }
            DivState.State state = (DivState.State) obj;
            if (state != null) {
                return state;
            }
        }
        return (DivState.State) CollectionsKt.firstOrNull(divState.states);
    }

    public static final boolean isBranch(@NotNull Div div) {
        boolean z = false;
        if (!(div instanceof Div.Text) && !(div instanceof Div.Image) && !(div instanceof Div.GifImage) && !(div instanceof Div.Separator) && !(div instanceof Div.Indicator) && !(div instanceof Div.Slider) && !(div instanceof Div.Input) && !(div instanceof Div.Custom) && !(div instanceof Div.Select) && !(div instanceof Div.Video) && !(div instanceof Div.Switch)) {
            z = true;
            if (!(div instanceof Div.Container) && !(div instanceof Div.Grid) && !(div instanceof Div.Gallery) && !(div instanceof Div.Pager) && !(div instanceof Div.Tabs) && !(div instanceof Div.State)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return z;
    }

    public static final boolean isLeaf(@NotNull Div div) {
        return !isBranch(div);
    }

    public static final boolean isHorizontal(@NotNull DivContainer divContainer, @NotNull ExpressionResolver expressionResolver) {
        return divContainer.orientation.evaluate(expressionResolver) == DivContainer.Orientation.HORIZONTAL;
    }

    public static final boolean isWrapContainer(@NotNull DivContainer divContainer, @NotNull ExpressionResolver expressionResolver) {
        if (divContainer.layoutMode.evaluate(expressionResolver) != DivContainer.LayoutMode.WRAP || divContainer.orientation.evaluate(expressionResolver) == DivContainer.Orientation.OVERLAP) {
            return false;
        }
        if (isHorizontal(divContainer, expressionResolver)) {
            return canWrap(divContainer.getWidth(), expressionResolver);
        }
        if (canWrap(divContainer.getHeight(), expressionResolver)) {
            return true;
        }
        DivAspect divAspect = divContainer.aspect;
        if (divAspect != null) {
            return !(((float) ((Number) divAspect.ratio.evaluate(expressionResolver)).doubleValue()) == 0.0f);
        }
        return false;
    }

    private static final boolean canWrap(DivSize divSize, ExpressionResolver expressionResolver) {
        if (!(divSize instanceof DivSize.WrapContent)) {
            return true;
        }
        Expression expression = ((DivSize.WrapContent) divSize).getValue().constrained;
        return expression != null && ((Boolean) expression.evaluate(expressionResolver)).booleanValue();
    }

    public static final boolean getHasSightActions(@NotNull DivBase divBase) {
        List visibilityActions;
        List disappearActions;
        return (divBase.getVisibilityAction() == null && ((visibilityActions = divBase.getVisibilityActions()) == null || visibilityActions.isEmpty()) && ((disappearActions = divBase.getDisappearActions()) == null || disappearActions.isEmpty())) ? false : true;
    }

    @NotNull
    public static final List<DivVisibilityAction> getAllAppearActions(@NotNull DivBase divBase) {
        List<DivVisibilityAction> visibilityActions = divBase.getVisibilityActions();
        if (visibilityActions != null) {
            return visibilityActions;
        }
        DivVisibilityAction visibilityAction = divBase.getVisibilityAction();
        List<DivVisibilityAction> listOf = visibilityAction != null ? CollectionsKt.listOf(visibilityAction) : null;
        return listOf == null ? CollectionsKt.emptyList() : listOf;
    }

    @NotNull
    public static final List<DivDisappearAction> getAllDisappearActions(@NotNull DivBase divBase) {
        List<DivDisappearAction> disappearActions = divBase.getDisappearActions();
        return disappearActions == null ? CollectionsKt.emptyList() : disappearActions;
    }

    @NotNull
    public static final List<DivSightAction> getAllSightActions(@NotNull DivBase divBase) {
        return CollectionsKt.plus((Collection) getAllDisappearActions(divBase), (Iterable) getAllAppearActions(divBase));
    }

    public static /* synthetic */ int toLayoutParamsSize$default(DivSize divSize, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        return toLayoutParamsSize(divSize, displayMetrics, expressionResolver, layoutParams);
    }

    public static final int toLayoutParamsSize(@Nullable DivSize divSize, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (divSize == null) {
            return -2;
        }
        if (divSize instanceof DivSize.MatchParent) {
            return -1;
        }
        if (divSize instanceof DivSize.Fixed) {
            return BaseDivViewExtensionsKt.toPx(((DivSize.Fixed) divSize).getValue(), displayMetrics, expressionResolver);
        }
        if (divSize instanceof DivSize.WrapContent) {
            Expression expression = ((DivSize.WrapContent) divSize).getValue().constrained;
            return (expression != null && ((Boolean) expression.evaluate(expressionResolver)).booleanValue() && (layoutParams instanceof DivLayoutParams)) ? -3 : -2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int evaluateGravity(@Nullable DivAlignmentHorizontal divAlignmentHorizontal, @Nullable DivAlignmentVertical divAlignmentVertical) {
        int i;
        int i2 = divAlignmentHorizontal == null ? -1 : WhenMappings.$EnumSwitchMapping$2[divAlignmentHorizontal.ordinal()];
        if (i2 == 1) {
            i = 3;
        } else if (i2 != 2) {
            i = 5;
            if (i2 != 3) {
                i = (i2 == 4 || i2 != 5) ? 8388611 : 8388613;
            }
        } else {
            i = 1;
        }
        int i3 = divAlignmentVertical != null ? WhenMappings.$EnumSwitchMapping$3[divAlignmentVertical.ordinal()] : -1;
        int i4 = 48;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 16;
            } else if (i3 == 3) {
                i4 = 80;
            }
        }
        return i4 | i;
    }

    public static final int evaluateGravity(@Nullable DivContentAlignmentHorizontal divContentAlignmentHorizontal, @Nullable DivContentAlignmentVertical divContentAlignmentVertical) {
        int i = 8388611;
        switch (divContentAlignmentHorizontal == null ? -1 : WhenMappings.$EnumSwitchMapping$4[divContentAlignmentHorizontal.ordinal()]) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 5;
                break;
            case 5:
                i = 8388613;
                break;
            case 6:
                i = 16777216;
                break;
            case 7:
                i = 33554432;
                break;
            case 8:
                i = 67108864;
                break;
        }
        int i2 = 48;
        switch (divContentAlignmentVertical != null ? WhenMappings.$EnumSwitchMapping$5[divContentAlignmentVertical.ordinal()] : -1) {
            case 2:
                i2 = 16;
                break;
            case 3:
                i2 = 80;
                break;
            case 4:
                i2 = 268435456;
                break;
            case 5:
                i2 = 536870912;
                break;
            case 6:
                i2 = 1073741824;
                break;
        }
        return i2 | i;
    }

    @NotNull
    public static final PorterDuff.Mode toPorterDuffMode(@NotNull DivBlendMode divBlendMode) {
        switch (WhenMappings.$EnumSwitchMapping$6[divBlendMode.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final AspectImageView.Scale toImageScale(@NotNull DivImageScale divImageScale) {
        int i = WhenMappings.$EnumSwitchMapping$7[divImageScale.ordinal()];
        if (i == 1) {
            return AspectImageView.Scale.NO_SCALE;
        }
        if (i == 2) {
            return AspectImageView.Scale.FIT;
        }
        if (i == 3) {
            return AspectImageView.Scale.FILL;
        }
        if (i == 4) {
            return AspectImageView.Scale.STRETCH;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final Drawable toDrawable(@NotNull DivDrawable divDrawable, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        if (divDrawable instanceof DivDrawable.Shape) {
            return toDrawable(((DivDrawable.Shape) divDrawable).getValue(), displayMetrics, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public static final Drawable toDrawable(@NotNull DivShapeDrawable divShapeDrawable, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        Drawable circleDrawable;
        Expression expression;
        Expression expression2;
        DivShape divShape = divShapeDrawable.shape;
        if (divShape instanceof DivShape.RoundedRectangle) {
            DivShape.RoundedRectangle roundedRectangle = (DivShape.RoundedRectangle) divShape;
            float pxF = BaseDivViewExtensionsKt.toPxF(roundedRectangle.getValue().itemWidth, displayMetrics, expressionResolver);
            float pxF2 = BaseDivViewExtensionsKt.toPxF(roundedRectangle.getValue().itemHeight, displayMetrics, expressionResolver);
            Expression expression3 = roundedRectangle.getValue().backgroundColor;
            if (expression3 == null) {
                expression3 = divShapeDrawable.color;
            }
            int intValue = ((Number) expression3.evaluate(expressionResolver)).intValue();
            float pxF3 = BaseDivViewExtensionsKt.toPxF(roundedRectangle.getValue().cornerRadius, displayMetrics, expressionResolver);
            DivStroke divStroke = roundedRectangle.getValue().stroke;
            if (divStroke == null) {
                divStroke = divShapeDrawable.stroke;
            }
            Integer num = (divStroke == null || (expression2 = divStroke.color) == null) ? null : (Integer) expression2.evaluate(expressionResolver);
            DivStroke divStroke2 = roundedRectangle.getValue().stroke;
            if (divStroke2 == null) {
                divStroke2 = divShapeDrawable.stroke;
            }
            circleDrawable = new RoundedRectDrawable(new RoundedRectDrawable.Params(pxF, pxF2, intValue, pxF3, num, divStroke2 != null ? Float.valueOf(getWidthPxF(divStroke2, displayMetrics, expressionResolver)) : null));
        } else {
            if (!(divShape instanceof DivShape.Circle)) {
                return null;
            }
            DivShape.Circle circle = (DivShape.Circle) divShape;
            float pxF4 = BaseDivViewExtensionsKt.toPxF(circle.getValue().radius, displayMetrics, expressionResolver);
            Expression expression4 = circle.getValue().backgroundColor;
            if (expression4 == null) {
                expression4 = divShapeDrawable.color;
            }
            int intValue2 = ((Number) expression4.evaluate(expressionResolver)).intValue();
            DivStroke divStroke3 = circle.getValue().stroke;
            if (divStroke3 == null) {
                divStroke3 = divShapeDrawable.stroke;
            }
            Integer num2 = (divStroke3 == null || (expression = divStroke3.color) == null) ? null : (Integer) expression.evaluate(expressionResolver);
            DivStroke divStroke4 = circle.getValue().stroke;
            if (divStroke4 == null) {
                divStroke4 = divShapeDrawable.stroke;
            }
            circleDrawable = new CircleDrawable(new CircleDrawable.Params(pxF4, intValue2, num2, divStroke4 != null ? Float.valueOf(getWidthPxF(divStroke4, displayMetrics, expressionResolver)) : null));
        }
        return circleDrawable;
    }

    private static final float getWidthPxF(DivStroke divStroke, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.unitToPxF((Number) divStroke.width.evaluate(expressionResolver), displayMetrics, (DivSizeUnit) divStroke.unit.evaluate(expressionResolver));
    }

    @NotNull
    public static final DivAlignmentHorizontal toAlignmentHorizontal(@NotNull DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
        int i = WhenMappings.$EnumSwitchMapping$4[divContentAlignmentHorizontal.ordinal()];
        if (i == 1) {
            return DivAlignmentHorizontal.LEFT;
        }
        if (i == 2) {
            return DivAlignmentHorizontal.CENTER;
        }
        if (i == 3) {
            return DivAlignmentHorizontal.RIGHT;
        }
        if (i == 4) {
            return DivAlignmentHorizontal.START;
        }
        if (i == 5) {
            return DivAlignmentHorizontal.END;
        }
        return DivAlignmentHorizontal.START;
    }

    @NotNull
    public static final DivAlignmentVertical toAlignmentVertical(@NotNull DivContentAlignmentVertical divContentAlignmentVertical) {
        int i = WhenMappings.$EnumSwitchMapping$5[divContentAlignmentVertical.ordinal()];
        if (i == 1) {
            return DivAlignmentVertical.TOP;
        }
        if (i == 2) {
            return DivAlignmentVertical.CENTER;
        }
        if (i == 3) {
            return DivAlignmentVertical.BOTTOM;
        }
        if (i == 7) {
            return DivAlignmentVertical.BASELINE;
        }
        return DivAlignmentVertical.TOP;
    }
}
