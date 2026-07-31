package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import com.ironsource.X3;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivNeighbourPageSize;
import com.yandex.div2.DivPager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* compiled from: NeighbourPageSizeProvider.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/NeighbourPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/FixedPageSizeProvider;", X3.a.t, "Lcom/yandex/div2/DivNeighbourPageSize;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "metrics", "Landroid/util/DisplayMetrics;", "parentSize", "", "itemSpacing", "", "paddings", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "alignment", "Lcom/yandex/div2/DivPager$ItemAlignment;", "(Lcom/yandex/div2/DivNeighbourPageSize;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/util/DisplayMetrics;IFLcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lcom/yandex/div2/DivPager$ItemAlignment;)V", "hasOffScreenPages", "", "getHasOffScreenPages", "()Z", "itemSize", "getItemSize", "()F", "neighbourPageWidth", "neighbourSize", "getNeighbourSize", X3.i.L, "(I)Ljava/lang/Float;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeighbourPageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourPageWidth;
    private final float neighbourSize;

    /* compiled from: NeighbourPageSizeProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivPager.ItemAlignment.values().length];
            try {
                iArr[DivPager.ItemAlignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivPager.ItemAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivPager.ItemAlignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NeighbourPageSizeProvider(@NotNull DivNeighbourPageSize divNeighbourPageSize, @NotNull ExpressionResolver expressionResolver, @NotNull DisplayMetrics displayMetrics, int i, float f, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull DivPager.ItemAlignment itemAlignment) {
        super(i, divPagerPaddingsHolder, itemAlignment);
        float start;
        float neighbourSize;
        float pxF = BaseDivViewExtensionsKt.toPxF(divNeighbourPageSize.neighbourPageWidth, displayMetrics, expressionResolver);
        this.neighbourPageWidth = pxF;
        this.neighbourSize = f + pxF;
        int i2 = WhenMappings.$EnumSwitchMapping$0[itemAlignment.ordinal()];
        if (i2 == 1) {
            start = i - divPagerPaddingsHolder.getStart();
            neighbourSize = getNeighbourSize();
        } else if (i2 == 2) {
            start = i;
            neighbourSize = getNeighbourSize() * 2;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = i - divPagerPaddingsHolder.getEnd();
            neighbourSize = getNeighbourSize();
        }
        this.itemSize = start - neighbourSize;
        this.hasOffScreenPages = pxF > 0.0f;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getNeighbourSize() {
        return this.neighbourSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getItemSize() {
        return this.itemSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public boolean getHasOffScreenPages() {
        return this.hasOffScreenPages;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    @NotNull
    public Float getItemSize(int position) {
        return Float.valueOf(getItemSize());
    }
}
