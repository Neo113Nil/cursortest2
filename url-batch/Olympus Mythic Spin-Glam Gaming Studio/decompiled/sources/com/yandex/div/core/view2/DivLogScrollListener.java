package com.yandex.div.core.view2;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivLogScrollListener.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/DivLogScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "isVertical", "", "scrollGap", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/yandex/div/core/view2/OnViewHolderVisibleListener;", "(Landroidx/recyclerview/widget/LinearLayoutManager;ZILcom/yandex/div/core/view2/OnViewHolderVisibleListener;)V", "totalScroll", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivLogScrollListener extends RecyclerView.OnScrollListener {
    private final boolean isVertical;

    @NotNull
    private final LinearLayoutManager layoutManager;

    @NotNull
    private final OnViewHolderVisibleListener listener;
    private final int scrollGap;
    private int totalScroll;

    public DivLogScrollListener(@NotNull LinearLayoutManager linearLayoutManager, boolean z, int i, @NotNull OnViewHolderVisibleListener onViewHolderVisibleListener) {
        this.layoutManager = linearLayoutManager;
        this.isVertical = z;
        this.scrollGap = i;
        this.listener = onViewHolderVisibleListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        int i = this.totalScroll;
        if (this.isVertical) {
            dx = dy;
        }
        this.totalScroll = i + Math.abs(dx);
        if (this.totalScroll > (this.isVertical ? this.layoutManager.getHeight() : this.layoutManager.getWidth()) / this.scrollGap) {
            this.totalScroll = 0;
            int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
            for (int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition(); findFirstVisibleItemPosition < findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                this.listener.onViewHolderVisible(findFirstVisibleItemPosition);
            }
        }
    }
}
