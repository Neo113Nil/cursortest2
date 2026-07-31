package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.O6;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WrapContentPageSizeOffScreenPagesController.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0003H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/WrapContentPageSizeOffScreenPagesController;", "", "parent", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "itemSpacing", "", "pageSizeProvider", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "paddings", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", O6.G1, "Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;FLcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;)V", "sidePagesCount", "", "calcSidePagesCount", "pageSize", "page", "(I)Ljava/lang/Float;", "updateOffScreenPages", "", "setOffScreenPages", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrapContentPageSizeOffScreenPagesController {

    @NotNull
    private final DivPagerAdapter adapter;
    private final float itemSpacing;

    @NotNull
    private final DivPagerPaddingsHolder paddings;

    @NotNull
    private final DivPagerPageSizeProvider pageSizeProvider;

    @NotNull
    private final DivPagerView parent;
    private int sidePagesCount;

    public WrapContentPageSizeOffScreenPagesController(@NotNull DivPagerView divPagerView, float f, @NotNull DivPagerPageSizeProvider divPagerPageSizeProvider, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull DivPagerAdapter divPagerAdapter) {
        this.parent = divPagerView;
        this.itemSpacing = f;
        this.pageSizeProvider = divPagerPageSizeProvider;
        this.paddings = divPagerPaddingsHolder;
        this.adapter = divPagerAdapter;
        this.sidePagesCount = 1;
        this.sidePagesCount = calcSidePagesCount();
        setOffScreenPages(divPagerView);
        divPagerView.setChangePageCallbackForOffScreenPages$div_release(new DivPagerView.OffScreenPagesUpdateCallback() { // from class: com.yandex.div.core.view2.divs.pager.WrapContentPageSizeOffScreenPagesController.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                WrapContentPageSizeOffScreenPagesController.this.updateOffScreenPages();
            }

            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OffScreenPagesUpdateCallback, android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@Nullable View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                WrapContentPageSizeOffScreenPagesController.this.updateOffScreenPages();
            }
        });
    }

    private final int calcSidePagesCount() {
        Float prevNeighbourSize = this.pageSizeProvider.getPrevNeighbourSize(this.parent.getCurrentItem$div_release());
        if (prevNeighbourSize == null) {
            return 1;
        }
        float floatValue = prevNeighbourSize.floatValue();
        int currentItem$div_release = this.parent.getCurrentItem$div_release() - 1;
        int i = 0;
        int i2 = 0;
        while (floatValue > 0.0f && currentItem$div_release > 0) {
            i2++;
            Float pageSize = pageSize(currentItem$div_release);
            if (pageSize == null) {
                break;
            }
            floatValue -= pageSize.floatValue();
            currentItem$div_release--;
        }
        if (floatValue > this.paddings.getStart() && currentItem$div_release == 0) {
            i2++;
            Float pageSize2 = pageSize(currentItem$div_release);
            floatValue -= pageSize2 != null ? pageSize2.floatValue() : 0.0f;
        }
        Float nextNeighbourSize = this.pageSizeProvider.getNextNeighbourSize(this.parent.getCurrentItem$div_release());
        if (nextNeighbourSize == null) {
            return RangesKt.coerceAtLeast(i2, 1);
        }
        float floatValue2 = nextNeighbourSize.floatValue();
        if (floatValue > this.paddings.getStart()) {
            floatValue2 += floatValue;
        }
        int currentItem$div_release2 = this.parent.getCurrentItem$div_release() + 1;
        while (floatValue2 > 0.0f && currentItem$div_release2 < this.adapter.getItemCount() - 1) {
            i++;
            Float pageSize3 = pageSize(currentItem$div_release2);
            if (pageSize3 == null) {
                break;
            }
            floatValue2 -= pageSize3.floatValue();
            currentItem$div_release2++;
        }
        if (floatValue2 > this.paddings.getEnd() && currentItem$div_release2 == this.adapter.getItemCount() - 1) {
            i++;
            Float pageSize4 = pageSize(currentItem$div_release2);
            floatValue2 -= pageSize4 != null ? pageSize4.floatValue() : 0.0f;
        }
        while (floatValue2 > 0.0f && currentItem$div_release >= 0) {
            i2++;
            Float pageSize5 = pageSize(currentItem$div_release);
            if (pageSize5 == null) {
                break;
            }
            floatValue2 -= pageSize5.floatValue();
            currentItem$div_release--;
        }
        return RangesKt.coerceAtLeast(Math.max(i2, i), 1);
    }

    private final Float pageSize(int page) {
        Float itemSize = this.pageSizeProvider.getItemSize(page);
        if (itemSize != null) {
            return Float.valueOf(itemSize.floatValue() + this.itemSpacing);
        }
        return null;
    }

    private final void setOffScreenPages(DivPagerView divPagerView) {
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setItemViewCacheSize((this.sidePagesCount * 2) + 3);
        }
        divPagerView.getViewPager().setOffscreenPageLimit(this.sidePagesCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOffScreenPages() {
        int calcSidePagesCount = calcSidePagesCount();
        if (calcSidePagesCount <= this.sidePagesCount) {
            return;
        }
        this.sidePagesCount = calcSidePagesCount;
        setOffScreenPages(this.parent);
    }
}
