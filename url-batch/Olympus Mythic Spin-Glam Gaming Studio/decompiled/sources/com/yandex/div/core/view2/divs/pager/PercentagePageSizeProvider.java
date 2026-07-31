package com.yandex.div.core.view2.divs.pager;

import com.ironsource.X3;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivPageSize;
import com.yandex.div2.DivPager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* compiled from: PercentagePageSizeProvider.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/PercentagePageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/FixedPageSizeProvider;", X3.a.t, "Lcom/yandex/div2/DivPageSize;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "parentSize", "", "paddings", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "alignment", "Lcom/yandex/div2/DivPager$ItemAlignment;", "(Lcom/yandex/div2/DivPageSize;Lcom/yandex/div/json/expressions/ExpressionResolver;ILcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lcom/yandex/div2/DivPager$ItemAlignment;)V", "hasOffScreenPages", "", "getHasOffScreenPages", "()Z", "itemSize", "", "getItemSize", "()F", "neighbourSize", "getNeighbourSize", "pageWidthPercentage", "", X3.i.L, "(I)Ljava/lang/Float;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PercentagePageSizeProvider extends DivPagerPageSizeProvider implements FixedPageSizeProvider {
    private final boolean hasOffScreenPages;
    private final float itemSize;
    private final float neighbourSize;
    private final double pageWidthPercentage;

    /* compiled from: PercentagePageSizeProvider.kt */
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PercentagePageSizeProvider(@NotNull DivPageSize divPageSize, @NotNull ExpressionResolver expressionResolver, int i, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull DivPager.ItemAlignment itemAlignment) {
        super(i, divPagerPaddingsHolder, itemAlignment);
        float start;
        float itemSize;
        float f;
        double doubleValue = ((Number) divPageSize.pageWidth.value.evaluate(expressionResolver)).doubleValue();
        this.pageWidthPercentage = doubleValue;
        this.itemSize = (float) ((i * doubleValue) / 100);
        int i2 = WhenMappings.$EnumSwitchMapping$0[itemAlignment.ordinal()];
        if (i2 == 1) {
            start = i - divPagerPaddingsHolder.getStart();
            itemSize = getItemSize();
        } else if (i2 == 2) {
            f = (i - getItemSize()) / 2;
            this.neighbourSize = f;
            this.hasOffScreenPages = doubleValue < 100.0d;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            start = i - divPagerPaddingsHolder.getEnd();
            itemSize = getItemSize();
        }
        f = start - itemSize;
        this.neighbourSize = f;
        this.hasOffScreenPages = doubleValue < 100.0d;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getItemSize() {
        return this.itemSize;
    }

    @Override // com.yandex.div.core.view2.divs.pager.FixedPageSizeProvider
    public float getNeighbourSize() {
        return this.neighbourSize;
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
