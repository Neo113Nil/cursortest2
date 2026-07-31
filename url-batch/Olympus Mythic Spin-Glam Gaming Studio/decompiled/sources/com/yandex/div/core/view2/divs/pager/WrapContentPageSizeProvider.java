package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.yandex.div2.DivPager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WrapContentPageSizeProvider.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/WrapContentPageSizeProvider;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "isHorizontal", "", "parentSize", "", "paddings", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "alignment", "Lcom/yandex/div2/DivPager$ItemAlignment;", "(Landroidx/recyclerview/widget/RecyclerView;ZILcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lcom/yandex/div2/DivPager$ItemAlignment;)V", "getItemSize", "", X3.i.L, "(I)Ljava/lang/Float;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WrapContentPageSizeProvider extends DivPagerPageSizeProvider {
    private final boolean isHorizontal;

    @NotNull
    private final RecyclerView recyclerView;

    public WrapContentPageSizeProvider(@NotNull RecyclerView recyclerView, boolean z, int i, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull DivPager.ItemAlignment itemAlignment) {
        super(i, divPagerPaddingsHolder, itemAlignment);
        this.recyclerView = recyclerView;
        this.isHorizontal = z;
    }

    @Override // com.yandex.div.core.view2.divs.pager.DivPagerPageSizeProvider
    @Nullable
    public Float getItemSize(int position) {
        View findViewByPosition;
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(position)) == null) {
            return null;
        }
        return Float.valueOf(this.isHorizontal ? findViewByPosition.getWidth() : findViewByPosition.getHeight());
    }
}
