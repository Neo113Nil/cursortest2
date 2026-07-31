package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivPager;
import kotlin.Metadata;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPagerPaddingsHolder.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0014\u0010)\u001a\u00020\u001b*\n\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0002R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u000e\u0010 \u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010%\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010'\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001d¨\u0006,"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "", "paddings", "Lcom/yandex/div2/DivEdgeInsets;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "parent", "Landroid/view/View;", "metrics", "Landroid/util/DisplayMetrics;", "isHorizontal", "", "alignment", "Lcom/yandex/div2/DivPager$ItemAlignment;", "(Lcom/yandex/div2/DivEdgeInsets;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/view/View;Landroid/util/DisplayMetrics;ZLcom/yandex/div2/DivPager$ItemAlignment;)V", "alignedBottom", "", "getAlignedBottom", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "alignedLeft", "getAlignedLeft", "alignedRight", "getAlignedRight", "alignedTop", "getAlignedTop", "bottom", "", "getBottom", "()F", "end", "getEnd", "hasRelativePaddings", "left", "getLeft", "right", "getRight", "start", "getStart", ViewHierarchyConstants.DIMENSION_TOP_KEY, "getTop", "toPadding", "Lcom/yandex/div/json/expressions/Expression;", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivPagerPaddingsHolder {

    @Nullable
    private final Integer alignedBottom;

    @Nullable
    private final Integer alignedLeft;

    @Nullable
    private final Integer alignedRight;

    @Nullable
    private final Integer alignedTop;
    private final float bottom;
    private final float end;
    private final boolean hasRelativePaddings;
    private final float left;

    @NotNull
    private final DisplayMetrics metrics;

    @NotNull
    private final ExpressionResolver resolver;
    private final float right;
    private final float start;
    private final float top;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivPagerPaddingsHolder(@Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull DisplayMetrics displayMetrics, boolean z, @NotNull DivPager.ItemAlignment itemAlignment) {
        boolean z2;
        Expression<Long> expression;
        Expression<Long> expression2;
        float f;
        float f2;
        this.resolver = expressionResolver;
        this.metrics = displayMetrics;
        if ((divEdgeInsets != null ? divEdgeInsets.start : null) == null) {
            if ((divEdgeInsets != null ? divEdgeInsets.end : null) == null) {
                z2 = false;
                this.hasRelativePaddings = z2;
                if (z2) {
                    if (divEdgeInsets != null) {
                        expression = divEdgeInsets.left;
                    }
                    expression = null;
                } else if (ViewsKt.isLayoutRtl(view)) {
                    if (divEdgeInsets != null) {
                        expression = divEdgeInsets.end;
                    }
                    expression = null;
                } else {
                    if (divEdgeInsets != null) {
                        expression = divEdgeInsets.start;
                    }
                    expression = null;
                }
                float padding = toPadding(expression);
                this.left = padding;
                float padding2 = toPadding(divEdgeInsets == null ? divEdgeInsets.top : null);
                this.top = padding2;
                if (z2) {
                    if (divEdgeInsets != null) {
                        expression2 = divEdgeInsets.right;
                    }
                    expression2 = null;
                } else if (ViewsKt.isLayoutRtl(view)) {
                    if (divEdgeInsets != null) {
                        expression2 = divEdgeInsets.start;
                    }
                    expression2 = null;
                } else {
                    if (divEdgeInsets != null) {
                        expression2 = divEdgeInsets.end;
                    }
                    expression2 = null;
                }
                float padding3 = toPadding(expression2);
                this.right = padding3;
                float padding4 = toPadding(divEdgeInsets == null ? divEdgeInsets.bottom : null);
                this.bottom = padding4;
                if (z) {
                    f = padding2;
                } else {
                    f = ViewsKt.isLayoutRtl(view) ? padding3 : padding;
                }
                this.start = f;
                if (z) {
                    f2 = padding4;
                } else {
                    f2 = ViewsKt.isLayoutRtl(view) ? padding : padding3;
                }
                this.end = f2;
                this.alignedLeft = (z || (itemAlignment == DivPager.ItemAlignment.START && !ViewsKt.isLayoutRtl(view)) || (itemAlignment == DivPager.ItemAlignment.END && ViewsKt.isLayoutRtl(view))) ? Integer.valueOf(MathKt.roundToInt(padding)) : null;
                this.alignedTop = (!z || itemAlignment == DivPager.ItemAlignment.START) ? Integer.valueOf(MathKt.roundToInt(padding2)) : null;
                this.alignedRight = (z || (itemAlignment == DivPager.ItemAlignment.START && ViewsKt.isLayoutRtl(view)) || (itemAlignment == DivPager.ItemAlignment.END && !ViewsKt.isLayoutRtl(view))) ? Integer.valueOf(MathKt.roundToInt(padding3)) : null;
                this.alignedBottom = (!z || itemAlignment == DivPager.ItemAlignment.END) ? Integer.valueOf(MathKt.roundToInt(padding4)) : null;
            }
        }
        z2 = true;
        this.hasRelativePaddings = z2;
        if (z2) {
        }
        float padding5 = toPadding(expression);
        this.left = padding5;
        float padding22 = toPadding(divEdgeInsets == null ? divEdgeInsets.top : null);
        this.top = padding22;
        if (z2) {
        }
        float padding32 = toPadding(expression2);
        this.right = padding32;
        float padding42 = toPadding(divEdgeInsets == null ? divEdgeInsets.bottom : null);
        this.bottom = padding42;
        if (z) {
        }
        this.start = f;
        if (z) {
        }
        this.end = f2;
        this.alignedLeft = (z || (itemAlignment == DivPager.ItemAlignment.START && !ViewsKt.isLayoutRtl(view)) || (itemAlignment == DivPager.ItemAlignment.END && ViewsKt.isLayoutRtl(view))) ? Integer.valueOf(MathKt.roundToInt(padding5)) : null;
        this.alignedTop = (!z || itemAlignment == DivPager.ItemAlignment.START) ? Integer.valueOf(MathKt.roundToInt(padding22)) : null;
        this.alignedRight = (z || (itemAlignment == DivPager.ItemAlignment.START && ViewsKt.isLayoutRtl(view)) || (itemAlignment == DivPager.ItemAlignment.END && !ViewsKt.isLayoutRtl(view))) ? Integer.valueOf(MathKt.roundToInt(padding32)) : null;
        this.alignedBottom = (!z || itemAlignment == DivPager.ItemAlignment.END) ? Integer.valueOf(MathKt.roundToInt(padding42)) : null;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getBottom() {
        return this.bottom;
    }

    private final float toPadding(Expression<Long> expression) {
        if (expression != null) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(expression.evaluate(this.resolver).longValue()), this.metrics);
        }
        return 0.0f;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getEnd() {
        return this.end;
    }

    @Nullable
    public final Integer getAlignedLeft() {
        return this.alignedLeft;
    }

    @Nullable
    public final Integer getAlignedTop() {
        return this.alignedTop;
    }

    @Nullable
    public final Integer getAlignedRight() {
        return this.alignedRight;
    }

    @Nullable
    public final Integer getAlignedBottom() {
        return this.alignedBottom;
    }
}
