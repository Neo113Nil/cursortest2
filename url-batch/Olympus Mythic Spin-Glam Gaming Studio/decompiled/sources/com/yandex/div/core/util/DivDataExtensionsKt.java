package com.yandex.div.core.util;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.downloader.DivPatchApply;
import com.yandex.div.core.downloader.DivPatchMap;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTransform;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivDataExtensions.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0013H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0016H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u0019H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001aH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0006H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\bH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\tH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\nH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u000bH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\fH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\rH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u000eH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u000fH\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0010H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0011H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0012H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0013H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0014H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0015H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0016H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0017H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0018H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u0019H\u0000\u001a\u000e\u0010\u001b\u001a\u00020\u0005*\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0000¨\u0006!"}, d2 = {"applyPatch", "Lcom/yandex/div2/DivData;", DivActionHandler.DivActionReason.PATCH, "Lcom/yandex/div2/DivPatch;", "equalsToConstant", "", "Lcom/yandex/div2/DivAbsoluteEdgeInsets;", "other", "Lcom/yandex/div2/DivBackground;", "Lcom/yandex/div2/DivBorder;", "Lcom/yandex/div2/DivCornersRadius;", "Lcom/yandex/div2/DivDimension;", "Lcom/yandex/div2/DivDrawable;", "Lcom/yandex/div2/DivEdgeInsets;", "Lcom/yandex/div2/DivFilter;", "Lcom/yandex/div2/DivFixedSize;", "Lcom/yandex/div2/DivInput$NativeInterface;", "Lcom/yandex/div2/DivLinearGradient$ColorPoint;", "Lcom/yandex/div2/DivPivot;", "Lcom/yandex/div2/DivPoint;", "Lcom/yandex/div2/DivRadialGradientCenter;", "Lcom/yandex/div2/DivRadialGradientRadius;", "Lcom/yandex/div2/DivShadow;", "Lcom/yandex/div2/DivShape;", "Lcom/yandex/div2/DivSize;", "Lcom/yandex/div2/DivStroke;", "Lcom/yandex/div2/DivTransform;", "isConstant", "toColormap", "Lcom/yandex/div/internal/graphics/Colormap;", "Lcom/yandex/div2/DivLinearGradient;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivDataExtensionsKt {
    public static final boolean equalsToConstant(@Nullable DivSize divSize, @Nullable DivSize divSize2) {
        if (divSize == null) {
            if (divSize2 != null) {
                return false;
            }
        } else if (divSize instanceof DivSize.Fixed) {
            if (!(divSize2 instanceof DivSize.Fixed)) {
                return false;
            }
            DivSize.Fixed fixed = (DivSize.Fixed) divSize;
            DivSize.Fixed fixed2 = (DivSize.Fixed) divSize2;
            if (!ExpressionsKt.equalsToConstant(fixed.getValue().value, fixed2.getValue().value) || !ExpressionsKt.equalsToConstant(fixed.getValue().unit, fixed2.getValue().unit)) {
                return false;
            }
        } else {
            if (divSize instanceof DivSize.MatchParent) {
                if (!(divSize2 instanceof DivSize.MatchParent)) {
                    return false;
                }
                DivSize.MatchParent matchParent = (DivSize.MatchParent) divSize;
                DivSize.MatchParent matchParent2 = (DivSize.MatchParent) divSize2;
                if (!ExpressionsKt.equalsToConstant(matchParent.getValue().weight, matchParent2.getValue().weight)) {
                    return false;
                }
                DivSizeUnitValue divSizeUnitValue = matchParent.getValue().minSize;
                Expression expression = divSizeUnitValue != null ? divSizeUnitValue.value : null;
                DivSizeUnitValue divSizeUnitValue2 = matchParent2.getValue().minSize;
                if (!ExpressionsKt.equalsToConstant(expression, divSizeUnitValue2 != null ? divSizeUnitValue2.value : null)) {
                    return false;
                }
                DivSizeUnitValue divSizeUnitValue3 = matchParent.getValue().minSize;
                Expression expression2 = divSizeUnitValue3 != null ? divSizeUnitValue3.unit : null;
                DivSizeUnitValue divSizeUnitValue4 = matchParent2.getValue().minSize;
                if (!ExpressionsKt.equalsToConstant(expression2, divSizeUnitValue4 != null ? divSizeUnitValue4.unit : null)) {
                    return false;
                }
                DivSizeUnitValue divSizeUnitValue5 = matchParent.getValue().maxSize;
                Expression expression3 = divSizeUnitValue5 != null ? divSizeUnitValue5.value : null;
                DivSizeUnitValue divSizeUnitValue6 = matchParent2.getValue().maxSize;
                if (!ExpressionsKt.equalsToConstant(expression3, divSizeUnitValue6 != null ? divSizeUnitValue6.value : null)) {
                    return false;
                }
                DivSizeUnitValue divSizeUnitValue7 = matchParent.getValue().maxSize;
                Expression expression4 = divSizeUnitValue7 != null ? divSizeUnitValue7.unit : null;
                DivSizeUnitValue divSizeUnitValue8 = matchParent2.getValue().maxSize;
                if (!ExpressionsKt.equalsToConstant(expression4, divSizeUnitValue8 != null ? divSizeUnitValue8.unit : null)) {
                    return false;
                }
            } else {
                if (!(divSize instanceof DivSize.WrapContent)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(divSize2 instanceof DivSize.WrapContent)) {
                    return false;
                }
                DivSize.WrapContent wrapContent = (DivSize.WrapContent) divSize;
                DivSize.WrapContent wrapContent2 = (DivSize.WrapContent) divSize2;
                if (!ExpressionsKt.equalsToConstant(wrapContent.getValue().constrained, wrapContent2.getValue().constrained)) {
                    return false;
                }
                DivSizeUnitValue divSizeUnitValue9 = wrapContent.getValue().minSize;
                Expression expression5 = divSizeUnitValue9 != null ? divSizeUnitValue9.value : null;
                DivSizeUnitValue divSizeUnitValue10 = wrapContent2.getValue().minSize;
                if (!ExpressionsKt.equalsToConstant(expression5, divSizeUnitValue10 != null ? divSizeUnitValue10.value : null)) {
                    return false;
                }
                DivSizeUnitValue divSizeUnitValue11 = wrapContent.getValue().minSize;
                Expression expression6 = divSizeUnitValue11 != null ? divSizeUnitValue11.unit : null;
                DivSizeUnitValue divSizeUnitValue12 = wrapContent2.getValue().minSize;
                if (!ExpressionsKt.equalsToConstant(expression6, divSizeUnitValue12 != null ? divSizeUnitValue12.unit : null)) {
                    return false;
                }
                DivSizeUnitValue divSizeUnitValue13 = wrapContent.getValue().maxSize;
                Expression expression7 = divSizeUnitValue13 != null ? divSizeUnitValue13.value : null;
                DivSizeUnitValue divSizeUnitValue14 = wrapContent2.getValue().maxSize;
                if (!ExpressionsKt.equalsToConstant(expression7, divSizeUnitValue14 != null ? divSizeUnitValue14.value : null)) {
                    return false;
                }
                DivSizeUnitValue divSizeUnitValue15 = wrapContent.getValue().maxSize;
                Expression expression8 = divSizeUnitValue15 != null ? divSizeUnitValue15.unit : null;
                DivSizeUnitValue divSizeUnitValue16 = wrapContent2.getValue().maxSize;
                if (!ExpressionsKt.equalsToConstant(expression8, divSizeUnitValue16 != null ? divSizeUnitValue16.unit : null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivSize divSize) {
        if (divSize == null) {
            return true;
        }
        if (divSize instanceof DivSize.Fixed) {
            DivSize.Fixed fixed = (DivSize.Fixed) divSize;
            if (ExpressionsKt.isConstant(fixed.getValue().value) && ExpressionsKt.isConstant(fixed.getValue().unit)) {
                return true;
            }
        } else {
            if (divSize instanceof DivSize.MatchParent) {
                DivSize.MatchParent matchParent = (DivSize.MatchParent) divSize;
                if (ExpressionsKt.isConstantOrNull(matchParent.getValue().weight)) {
                    DivSizeUnitValue divSizeUnitValue = matchParent.getValue().minSize;
                    if (ExpressionsKt.isConstantOrNull(divSizeUnitValue != null ? divSizeUnitValue.value : null)) {
                        DivSizeUnitValue divSizeUnitValue2 = matchParent.getValue().minSize;
                        if (ExpressionsKt.isConstantOrNull(divSizeUnitValue2 != null ? divSizeUnitValue2.unit : null)) {
                            DivSizeUnitValue divSizeUnitValue3 = matchParent.getValue().maxSize;
                            if (ExpressionsKt.isConstantOrNull(divSizeUnitValue3 != null ? divSizeUnitValue3.value : null)) {
                                DivSizeUnitValue divSizeUnitValue4 = matchParent.getValue().maxSize;
                                if (ExpressionsKt.isConstantOrNull(divSizeUnitValue4 != null ? divSizeUnitValue4.unit : null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(divSize instanceof DivSize.WrapContent)) {
                    throw new NoWhenBranchMatchedException();
                }
                DivSize.WrapContent wrapContent = (DivSize.WrapContent) divSize;
                if (ExpressionsKt.isConstantOrNull(wrapContent.getValue().constrained)) {
                    DivSizeUnitValue divSizeUnitValue5 = wrapContent.getValue().minSize;
                    if (ExpressionsKt.isConstantOrNull(divSizeUnitValue5 != null ? divSizeUnitValue5.value : null)) {
                        DivSizeUnitValue divSizeUnitValue6 = wrapContent.getValue().minSize;
                        if (ExpressionsKt.isConstantOrNull(divSizeUnitValue6 != null ? divSizeUnitValue6.unit : null)) {
                            DivSizeUnitValue divSizeUnitValue7 = wrapContent.getValue().maxSize;
                            if (ExpressionsKt.isConstantOrNull(divSizeUnitValue7 != null ? divSizeUnitValue7.value : null)) {
                                DivSizeUnitValue divSizeUnitValue8 = wrapContent.getValue().maxSize;
                                if (ExpressionsKt.isConstantOrNull(divSizeUnitValue8 != null ? divSizeUnitValue8.unit : null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivFixedSize divFixedSize, @Nullable DivFixedSize divFixedSize2) {
        if (divFixedSize == null && divFixedSize2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divFixedSize != null ? divFixedSize.value : null, divFixedSize2 != null ? divFixedSize2.value : null)) {
            if (ExpressionsKt.equalsToConstant(divFixedSize != null ? divFixedSize.unit : null, divFixedSize2 != null ? divFixedSize2.unit : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivFixedSize divFixedSize) {
        if (divFixedSize == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divFixedSize.value) && ExpressionsKt.isConstant(divFixedSize.unit);
    }

    public static final boolean equalsToConstant(@Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2) {
        if (divEdgeInsets == null && divEdgeInsets2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.left : null, divEdgeInsets2 != null ? divEdgeInsets2.left : null)) {
            if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.top : null, divEdgeInsets2 != null ? divEdgeInsets2.top : null)) {
                if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.right : null, divEdgeInsets2 != null ? divEdgeInsets2.right : null)) {
                    if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.bottom : null, divEdgeInsets2 != null ? divEdgeInsets2.bottom : null)) {
                        if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.start : null, divEdgeInsets2 != null ? divEdgeInsets2.start : null)) {
                            if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.end : null, divEdgeInsets2 != null ? divEdgeInsets2.end : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivEdgeInsets divEdgeInsets) {
        if (divEdgeInsets == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divEdgeInsets.left) && ExpressionsKt.isConstant(divEdgeInsets.top) && ExpressionsKt.isConstant(divEdgeInsets.right) && ExpressionsKt.isConstant(divEdgeInsets.bottom) && ExpressionsKt.isConstantOrNull(divEdgeInsets.start) && ExpressionsKt.isConstantOrNull(divEdgeInsets.end);
    }

    public static final boolean equalsToConstant(@Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, @Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets2) {
        if (divAbsoluteEdgeInsets == null && divAbsoluteEdgeInsets2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.left : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.left : null)) {
            if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.top : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.top : null)) {
                if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.right : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.right : null)) {
                    if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.bottom : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.bottom : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) {
        if (divAbsoluteEdgeInsets == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divAbsoluteEdgeInsets.left) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.top) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.right) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.bottom);
    }

    public static final boolean equalsToConstant(@Nullable DivTransform divTransform, @Nullable DivTransform divTransform2) {
        if (divTransform == null && divTransform2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divTransform != null ? divTransform.rotation : null, divTransform2 != null ? divTransform2.rotation : null)) {
            if (equalsToConstant(divTransform != null ? divTransform.pivotX : null, divTransform2 != null ? divTransform2.pivotX : null)) {
                if (equalsToConstant(divTransform != null ? divTransform.pivotY : null, divTransform2 != null ? divTransform2.pivotY : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivTransform divTransform) {
        if (divTransform == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divTransform.rotation) && isConstant(divTransform.pivotX) && isConstant(divTransform.pivotY);
    }

    public static final boolean equalsToConstant(@Nullable DivPivot divPivot, @Nullable DivPivot divPivot2) {
        if (divPivot == null) {
            if (divPivot2 != null) {
                return false;
            }
        } else if (divPivot instanceof DivPivot.Fixed) {
            if (!(divPivot2 instanceof DivPivot.Fixed)) {
                return false;
            }
            DivPivot.Fixed fixed = (DivPivot.Fixed) divPivot;
            DivPivot.Fixed fixed2 = (DivPivot.Fixed) divPivot2;
            if (!ExpressionsKt.equalsToConstant(fixed.getValue().value, fixed2.getValue().value) || !ExpressionsKt.equalsToConstant(fixed.getValue().unit, fixed2.getValue().unit)) {
                return false;
            }
        } else {
            if (!(divPivot instanceof DivPivot.Percentage)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(divPivot2 instanceof DivPivot.Percentage) || !ExpressionsKt.equalsToConstant(((DivPivot.Percentage) divPivot).getValue().value, ((DivPivot.Percentage) divPivot2).getValue().value)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivPivot divPivot) {
        if (divPivot == null) {
            return true;
        }
        if (divPivot instanceof DivPivot.Fixed) {
            DivPivot.Fixed fixed = (DivPivot.Fixed) divPivot;
            return ExpressionsKt.isConstantOrNull(fixed.getValue().value) && ExpressionsKt.isConstantOrNull(fixed.getValue().value);
        }
        if (divPivot instanceof DivPivot.Percentage) {
            return ExpressionsKt.isConstant(((DivPivot.Percentage) divPivot).getValue().value);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean equalsToConstant(@Nullable DivFilter divFilter, @Nullable DivFilter divFilter2) {
        if (divFilter == null) {
            if (divFilter2 != null) {
                return false;
            }
        } else {
            if (divFilter instanceof DivFilter.RtlMirror) {
                return divFilter2 instanceof DivFilter.RtlMirror;
            }
            if (!(divFilter instanceof DivFilter.Blur)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(divFilter2 instanceof DivFilter.Blur) || !ExpressionsKt.equalsToConstant(((DivFilter.Blur) divFilter).getValue().radius, ((DivFilter.Blur) divFilter2).getValue().radius)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivFilter divFilter) {
        if (divFilter == null || (divFilter instanceof DivFilter.RtlMirror)) {
            return true;
        }
        if (divFilter instanceof DivFilter.Blur) {
            return ExpressionsKt.isConstant(((DivFilter.Blur) divFilter).getValue().radius);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean equalsToConstant(@Nullable DivDrawable divDrawable, @Nullable DivDrawable divDrawable2) {
        if (divDrawable == null) {
            if (divDrawable2 != null) {
                return false;
            }
        } else {
            if (!(divDrawable instanceof DivDrawable.Shape)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(divDrawable2 instanceof DivDrawable.Shape)) {
                return false;
            }
            DivDrawable.Shape shape = (DivDrawable.Shape) divDrawable;
            DivDrawable.Shape shape2 = (DivDrawable.Shape) divDrawable2;
            if (!ExpressionsKt.equalsToConstant(shape.getValue().color, shape2.getValue().color) || !equalsToConstant(shape.getValue().shape, shape2.getValue().shape) || !equalsToConstant(shape.getValue().stroke, shape2.getValue().stroke)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivDrawable divDrawable) {
        if (divDrawable == null) {
            return true;
        }
        if (!(divDrawable instanceof DivDrawable.Shape)) {
            throw new NoWhenBranchMatchedException();
        }
        DivDrawable.Shape shape = (DivDrawable.Shape) divDrawable;
        return ExpressionsKt.isConstant(shape.getValue().color) && isConstant(shape.getValue().shape) && isConstant(shape.getValue().stroke);
    }

    public static final boolean equalsToConstant(@Nullable DivShape divShape, @Nullable DivShape divShape2) {
        if (divShape == null) {
            if (divShape2 != null) {
                return false;
            }
        } else if (divShape instanceof DivShape.RoundedRectangle) {
            if (!(divShape2 instanceof DivShape.RoundedRectangle)) {
                return false;
            }
            DivShape.RoundedRectangle roundedRectangle = (DivShape.RoundedRectangle) divShape;
            DivShape.RoundedRectangle roundedRectangle2 = (DivShape.RoundedRectangle) divShape2;
            if (!ExpressionsKt.equalsToConstant(roundedRectangle.getValue().backgroundColor, roundedRectangle2.getValue().backgroundColor) || !equalsToConstant(roundedRectangle.getValue().stroke, roundedRectangle2.getValue().stroke) || !equalsToConstant(roundedRectangle.getValue().itemWidth, roundedRectangle2.getValue().itemWidth) || !equalsToConstant(roundedRectangle.getValue().itemHeight, roundedRectangle2.getValue().itemHeight) || !equalsToConstant(roundedRectangle.getValue().cornerRadius, roundedRectangle2.getValue().cornerRadius)) {
                return false;
            }
        } else {
            if (!(divShape instanceof DivShape.Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(divShape2 instanceof DivShape.Circle)) {
                return false;
            }
            DivShape.Circle circle = (DivShape.Circle) divShape;
            DivShape.Circle circle2 = (DivShape.Circle) divShape2;
            if (!ExpressionsKt.equalsToConstant(circle.getValue().backgroundColor, circle2.getValue().backgroundColor) || !equalsToConstant(circle.getValue().stroke, circle2.getValue().stroke) || !equalsToConstant(circle.getValue().radius, circle2.getValue().radius)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivShape divShape) {
        DivStroke divStroke;
        if (divShape == null) {
            return true;
        }
        if (divShape instanceof DivShape.RoundedRectangle) {
            DivShape.RoundedRectangle roundedRectangle = (DivShape.RoundedRectangle) divShape;
            if (ExpressionsKt.isConstantOrNull(roundedRectangle.getValue().backgroundColor) && isConstant(roundedRectangle.getValue().stroke) && isConstant(roundedRectangle.getValue().itemWidth) && isConstant(roundedRectangle.getValue().itemHeight) && isConstant(roundedRectangle.getValue().cornerRadius)) {
                return true;
            }
        } else {
            if (!(divShape instanceof DivShape.Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            DivShape.Circle circle = (DivShape.Circle) divShape;
            if (ExpressionsKt.isConstantOrNull(circle.getValue().backgroundColor) && (((divStroke = circle.getValue().stroke) == null || isConstant(divStroke)) && isConstant(circle.getValue().radius))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivStroke divStroke, @Nullable DivStroke divStroke2) {
        if (divStroke == null && divStroke2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.color : null, divStroke2 != null ? divStroke2.color : null)) {
            if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.width : null, divStroke2 != null ? divStroke2.width : null)) {
                if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.unit : null, divStroke2 != null ? divStroke2.unit : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivStroke divStroke) {
        if (divStroke == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divStroke.color) && ExpressionsKt.isConstant(divStroke.width) && ExpressionsKt.isConstant(divStroke.unit);
    }

    public static final boolean equalsToConstant(@Nullable DivBorder divBorder, @Nullable DivBorder divBorder2) {
        if (divBorder == null && divBorder2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divBorder != null ? divBorder.cornerRadius : null, divBorder2 != null ? divBorder2.cornerRadius : null)) {
            if (equalsToConstant(divBorder != null ? divBorder.cornersRadius : null, divBorder2 != null ? divBorder2.cornersRadius : null)) {
                if (ExpressionsKt.equalsToConstant(divBorder != null ? divBorder.hasShadow : null, divBorder2 != null ? divBorder2.hasShadow : null)) {
                    if (equalsToConstant(divBorder != null ? divBorder.shadow : null, divBorder2 != null ? divBorder2.shadow : null)) {
                        if (equalsToConstant(divBorder != null ? divBorder.stroke : null, divBorder2 != null ? divBorder2.stroke : null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivBorder divBorder) {
        if (divBorder == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divBorder.cornerRadius) && isConstant(divBorder.cornersRadius) && ExpressionsKt.isConstant(divBorder.hasShadow) && isConstant(divBorder.shadow) && isConstant(divBorder.stroke);
    }

    public static final boolean equalsToConstant(@Nullable DivCornersRadius divCornersRadius, @Nullable DivCornersRadius divCornersRadius2) {
        if (divCornersRadius == null && divCornersRadius2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.topLeft : null, divCornersRadius2 != null ? divCornersRadius2.topLeft : null)) {
            if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.topRight : null, divCornersRadius2 != null ? divCornersRadius2.topRight : null)) {
                if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.bottomRight : null, divCornersRadius2 != null ? divCornersRadius2.bottomRight : null)) {
                    if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.bottomLeft : null, divCornersRadius2 != null ? divCornersRadius2.bottomLeft : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivCornersRadius divCornersRadius) {
        if (divCornersRadius == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divCornersRadius.topLeft) && ExpressionsKt.isConstantOrNull(divCornersRadius.topRight) && ExpressionsKt.isConstantOrNull(divCornersRadius.bottomRight) && ExpressionsKt.isConstantOrNull(divCornersRadius.bottomLeft);
    }

    public static final boolean equalsToConstant(@Nullable DivShadow divShadow, @Nullable DivShadow divShadow2) {
        if (divShadow == null && divShadow2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.alpha : null, divShadow2 != null ? divShadow2.alpha : null)) {
            if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.blur : null, divShadow2 != null ? divShadow2.blur : null)) {
                if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.color : null, divShadow2 != null ? divShadow2.color : null)) {
                    if (equalsToConstant(divShadow != null ? divShadow.offset : null, divShadow2 != null ? divShadow2.offset : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivShadow divShadow) {
        if (divShadow == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divShadow.alpha) && ExpressionsKt.isConstant(divShadow.blur) && ExpressionsKt.isConstant(divShadow.color) && isConstant(divShadow.offset);
    }

    public static final boolean equalsToConstant(@Nullable DivPoint divPoint, @Nullable DivPoint divPoint2) {
        if (divPoint == null && divPoint2 == null) {
            return true;
        }
        if (equalsToConstant(divPoint != null ? divPoint.x : null, divPoint2 != null ? divPoint2.x : null)) {
            if (equalsToConstant(divPoint != null ? divPoint.y : null, divPoint2 != null ? divPoint2.y : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivPoint divPoint) {
        if (divPoint == null) {
            return true;
        }
        return isConstant(divPoint.x) && isConstant(divPoint.y);
    }

    public static final boolean equalsToConstant(@Nullable DivDimension divDimension, @Nullable DivDimension divDimension2) {
        if (divDimension == null && divDimension2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divDimension != null ? divDimension.unit : null, divDimension2 != null ? divDimension2.unit : null)) {
            if (ExpressionsKt.equalsToConstant(divDimension != null ? divDimension.value : null, divDimension2 != null ? divDimension2.value : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivDimension divDimension) {
        if (divDimension == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divDimension.unit) && ExpressionsKt.isConstant(divDimension.value);
    }

    public static final boolean equalsToConstant(@Nullable DivBackground divBackground, @Nullable DivBackground divBackground2) {
        if (divBackground == null) {
            if (divBackground2 != null) {
                return false;
            }
        } else if (divBackground instanceof DivBackground.Solid) {
            if (!(divBackground2 instanceof DivBackground.Solid) || !ExpressionsKt.equalsToConstant(((DivBackground.Solid) divBackground).getValue().color, ((DivBackground.Solid) divBackground2).getValue().color)) {
                return false;
            }
        } else if (divBackground instanceof DivBackground.Image) {
            DivBackground.Image image = (DivBackground.Image) divBackground;
            List list = image.getValue().filters;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            if (!(divBackground2 instanceof DivBackground.Image)) {
                return false;
            }
            DivBackground.Image image2 = (DivBackground.Image) divBackground2;
            if (!ExpressionsKt.equalsToConstant(image.getValue().alpha, image2.getValue().alpha) || !ExpressionsKt.equalsToConstant(image.getValue().contentAlignmentHorizontal, image2.getValue().contentAlignmentHorizontal) || !ExpressionsKt.equalsToConstant(image.getValue().contentAlignmentVertical, image2.getValue().contentAlignmentVertical)) {
                return false;
            }
            List list2 = image2.getValue().filters;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            if (list.size() != list2.size()) {
                return false;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!equalsToConstant((DivFilter) obj, (DivFilter) list2.get(i))) {
                    return false;
                }
                i = i2;
            }
            if (!ExpressionsKt.equalsToConstant(image.getValue().imageUrl, image2.getValue().imageUrl) || !ExpressionsKt.equalsToConstant(image.getValue().preloadRequired, image2.getValue().preloadRequired) || !ExpressionsKt.equalsToConstant(image.getValue().scale, image2.getValue().scale)) {
                return false;
            }
        } else if (divBackground instanceof DivBackground.LinearGradient) {
            DivBackground.LinearGradient linearGradient = (DivBackground.LinearGradient) divBackground;
            List list3 = linearGradient.getValue().colorMap;
            if (list3 == null) {
                list3 = CollectionsKt.emptyList();
            }
            if (!(divBackground2 instanceof DivBackground.LinearGradient)) {
                return false;
            }
            DivBackground.LinearGradient linearGradient2 = (DivBackground.LinearGradient) divBackground2;
            if (!ExpressionsKt.equalsToConstant(linearGradient.getValue().angle, linearGradient2.getValue().angle) || !ExpressionsKt.equalsToConstant(linearGradient.getValue().colors, linearGradient2.getValue().colors)) {
                return false;
            }
            List list4 = linearGradient2.getValue().colorMap;
            if (list4 == null) {
                list4 = CollectionsKt.emptyList();
            }
            if (list3.size() != list4.size()) {
                return false;
            }
            int i3 = 0;
            for (Object obj2 : list3) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!equalsToConstant((DivLinearGradient.ColorPoint) obj2, (DivLinearGradient.ColorPoint) list4.get(i3))) {
                    return false;
                }
                i3 = i4;
            }
        } else if (divBackground instanceof DivBackground.RadialGradient) {
            if (!(divBackground2 instanceof DivBackground.RadialGradient)) {
                return false;
            }
            DivBackground.RadialGradient radialGradient = (DivBackground.RadialGradient) divBackground;
            DivBackground.RadialGradient radialGradient2 = (DivBackground.RadialGradient) divBackground2;
            if (!equalsToConstant(radialGradient.getValue().centerX, radialGradient2.getValue().centerX) || !equalsToConstant(radialGradient.getValue().centerY, radialGradient2.getValue().centerY) || !ExpressionsKt.equalsToConstant(radialGradient.getValue().colors, radialGradient2.getValue().colors) || !equalsToConstant(radialGradient.getValue().radius, radialGradient2.getValue().radius)) {
                return false;
            }
        } else {
            if (!(divBackground instanceof DivBackground.NinePatch)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(divBackground2 instanceof DivBackground.NinePatch)) {
                return false;
            }
            DivBackground.NinePatch ninePatch = (DivBackground.NinePatch) divBackground;
            DivBackground.NinePatch ninePatch2 = (DivBackground.NinePatch) divBackground2;
            if (!ExpressionsKt.equalsToConstant(ninePatch.getValue().imageUrl, ninePatch2.getValue().imageUrl) || !equalsToConstant(ninePatch.getValue().insets, ninePatch2.getValue().insets)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivBackground divBackground) {
        if (divBackground == null) {
            return true;
        }
        if (divBackground instanceof DivBackground.Solid) {
            return ExpressionsKt.isConstant(((DivBackground.Solid) divBackground).getValue().color);
        }
        if (divBackground instanceof DivBackground.Image) {
            DivBackground.Image image = (DivBackground.Image) divBackground;
            if (ExpressionsKt.isConstant(image.getValue().alpha) && ExpressionsKt.isConstant(image.getValue().contentAlignmentHorizontal) && ExpressionsKt.isConstant(image.getValue().contentAlignmentVertical)) {
                List list = image.getValue().filters;
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (!isConstant((DivFilter) it.next())) {
                                break;
                            }
                        }
                    }
                }
                if (ExpressionsKt.isConstant(image.getValue().imageUrl) && ExpressionsKt.isConstant(image.getValue().preloadRequired) && ExpressionsKt.isConstant(image.getValue().scale)) {
                    return true;
                }
            }
        } else if (divBackground instanceof DivBackground.LinearGradient) {
            DivBackground.LinearGradient linearGradient = (DivBackground.LinearGradient) divBackground;
            if (ExpressionsKt.isConstant(linearGradient.getValue().angle) && ExpressionsKt.isConstantOrNull(linearGradient.getValue().colors)) {
                return true;
            }
        } else if (divBackground instanceof DivBackground.RadialGradient) {
            DivBackground.RadialGradient radialGradient = (DivBackground.RadialGradient) divBackground;
            if (isConstant(radialGradient.getValue().centerX) && isConstant(radialGradient.getValue().centerY) && ExpressionsKt.isConstantOrNull(radialGradient.getValue().colors) && isConstant(radialGradient.getValue().radius)) {
                return true;
            }
        } else {
            if (!(divBackground instanceof DivBackground.NinePatch)) {
                throw new NoWhenBranchMatchedException();
            }
            DivBackground.NinePatch ninePatch = (DivBackground.NinePatch) divBackground;
            if (ExpressionsKt.isConstant(ninePatch.getValue().imageUrl) && isConstant(ninePatch.getValue().insets)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivLinearGradient.ColorPoint colorPoint, @Nullable DivLinearGradient.ColorPoint colorPoint2) {
        if (colorPoint == null && colorPoint2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(colorPoint != null ? colorPoint.color : null, colorPoint2 != null ? colorPoint2.color : null)) {
            if (ExpressionsKt.equalsToConstant(colorPoint != null ? colorPoint.position : null, colorPoint2 != null ? colorPoint2.position : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivLinearGradient.ColorPoint colorPoint) {
        if (colorPoint == null) {
            return true;
        }
        return ExpressionsKt.isConstant(colorPoint.color) && ExpressionsKt.isConstant(colorPoint.position);
    }

    @NotNull
    public static final Colormap toColormap(@NotNull DivLinearGradient divLinearGradient, @NotNull final ExpressionResolver expressionResolver) {
        List list = divLinearGradient.colorMap;
        List sortedWith = list != null ? CollectionsKt.sortedWith(list, new Comparator() { // from class: com.yandex.div.core.util.DivDataExtensionsKt$toColormap$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Double) ((DivLinearGradient.ColorPoint) t).position.evaluate(ExpressionResolver.this), (Double) ((DivLinearGradient.ColorPoint) t2).position.evaluate(ExpressionResolver.this));
            }
        }) : null;
        ExpressionList expressionList = divLinearGradient.colors;
        if (sortedWith == null) {
            if (expressionList != null) {
                return new Colormap(CollectionsKt.toIntArray(expressionList.evaluate(expressionResolver)), null, 2, null);
            }
            return Colormap.EMPTY;
        }
        int[] iArr = new int[sortedWith.size()];
        float[] fArr = new float[sortedWith.size()];
        int size = sortedWith.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Number) ((DivLinearGradient.ColorPoint) sortedWith.get(i)).color.evaluate(expressionResolver)).intValue();
            fArr[i] = (float) ((Number) ((DivLinearGradient.ColorPoint) sortedWith.get(i)).position.evaluate(expressionResolver)).doubleValue();
        }
        return new Colormap(iArr, fArr);
    }

    public static final boolean equalsToConstant(@Nullable DivRadialGradientCenter divRadialGradientCenter, @Nullable DivRadialGradientCenter divRadialGradientCenter2) {
        if (divRadialGradientCenter == null) {
            if (divRadialGradientCenter2 != null) {
                return false;
            }
        } else if (divRadialGradientCenter instanceof DivRadialGradientCenter.Fixed) {
            if (!(divRadialGradientCenter2 instanceof DivRadialGradientCenter.Fixed)) {
                return false;
            }
            DivRadialGradientCenter.Fixed fixed = (DivRadialGradientCenter.Fixed) divRadialGradientCenter;
            DivRadialGradientCenter.Fixed fixed2 = (DivRadialGradientCenter.Fixed) divRadialGradientCenter2;
            if (!ExpressionsKt.equalsToConstant(fixed.getValue().unit, fixed2.getValue().unit) || !ExpressionsKt.equalsToConstant(fixed.getValue().value, fixed2.getValue().value)) {
                return false;
            }
        } else {
            if (!(divRadialGradientCenter instanceof DivRadialGradientCenter.Relative)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(divRadialGradientCenter2 instanceof DivRadialGradientCenter.Relative) || !ExpressionsKt.equalsToConstant(((DivRadialGradientCenter.Relative) divRadialGradientCenter).getValue().value, ((DivRadialGradientCenter.Relative) divRadialGradientCenter2).getValue().value)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivRadialGradientCenter divRadialGradientCenter) {
        if (divRadialGradientCenter == null) {
            return true;
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.Fixed) {
            DivRadialGradientCenter.Fixed fixed = (DivRadialGradientCenter.Fixed) divRadialGradientCenter;
            return ExpressionsKt.isConstant(fixed.getValue().unit) && ExpressionsKt.isConstant(fixed.getValue().value);
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.Relative) {
            return ExpressionsKt.isConstant(((DivRadialGradientCenter.Relative) divRadialGradientCenter).getValue().value);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean equalsToConstant(@Nullable DivRadialGradientRadius divRadialGradientRadius, @Nullable DivRadialGradientRadius divRadialGradientRadius2) {
        if (divRadialGradientRadius == null) {
            if (divRadialGradientRadius2 != null) {
                return false;
            }
        } else if (divRadialGradientRadius instanceof DivRadialGradientRadius.FixedSize) {
            if (!(divRadialGradientRadius2 instanceof DivRadialGradientRadius.FixedSize)) {
                return false;
            }
            DivRadialGradientRadius.FixedSize fixedSize = (DivRadialGradientRadius.FixedSize) divRadialGradientRadius;
            DivRadialGradientRadius.FixedSize fixedSize2 = (DivRadialGradientRadius.FixedSize) divRadialGradientRadius2;
            if (!ExpressionsKt.equalsToConstant(fixedSize.getValue().unit, fixedSize2.getValue().unit) || !ExpressionsKt.equalsToConstant(fixedSize.getValue().value, fixedSize2.getValue().value)) {
                return false;
            }
        } else {
            if (!(divRadialGradientRadius instanceof DivRadialGradientRadius.Relative)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(divRadialGradientRadius2 instanceof DivRadialGradientRadius.Relative) || !ExpressionsKt.equalsToConstant(((DivRadialGradientRadius.Relative) divRadialGradientRadius).getValue().value, ((DivRadialGradientRadius.Relative) divRadialGradientRadius2).getValue().value)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivRadialGradientRadius divRadialGradientRadius) {
        if (divRadialGradientRadius == null) {
            return true;
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.FixedSize) {
            DivRadialGradientRadius.FixedSize fixedSize = (DivRadialGradientRadius.FixedSize) divRadialGradientRadius;
            return ExpressionsKt.isConstant(fixedSize.getValue().unit) && ExpressionsKt.isConstant(fixedSize.getValue().value);
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.Relative) {
            return ExpressionsKt.isConstant(((DivRadialGradientRadius.Relative) divRadialGradientRadius).getValue().value);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean equalsToConstant(@Nullable DivInput.NativeInterface nativeInterface, @Nullable DivInput.NativeInterface nativeInterface2) {
        if (nativeInterface == null && nativeInterface2 == null) {
            return true;
        }
        return ExpressionsKt.equalsToConstant(nativeInterface != null ? nativeInterface.color : null, nativeInterface2 != null ? nativeInterface2.color : null);
    }

    public static final boolean isConstant(@Nullable DivInput.NativeInterface nativeInterface) {
        if (nativeInterface == null) {
            return true;
        }
        return ExpressionsKt.isConstant(nativeInterface.color);
    }

    @Nullable
    public static final DivData applyPatch(@NotNull DivData divData, @NotNull DivPatch divPatch) {
        List<DivData.State> applyPatch = new DivPatchApply(new DivPatchMap(divPatch)).applyPatch(divData.states, ExpressionResolver.EMPTY);
        if (applyPatch == null) {
            return null;
        }
        return new DivData(null, divData.logId, applyPatch, divData.timers, divData.transitionAnimationSelector, divData.variableTriggers, divData.variables, divData.parsingErrors, 1, null);
    }
}
