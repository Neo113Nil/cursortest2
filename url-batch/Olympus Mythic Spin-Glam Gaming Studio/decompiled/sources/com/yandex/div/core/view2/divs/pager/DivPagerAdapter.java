package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.DivPager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivPagerAdapter.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FBI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u00101\u001a\u00020\u001bH\u0016J\u000e\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bJ\u000e\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u001bJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001bH\u0014J\u0010\u00109\u001a\u0002072\u0006\u00108\u001a\u00020\u001bH\u0014J\u0010\u0010:\u001a\u0002072\u0006\u00108\u001a\u00020\u001bH\u0014J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u001bH\u0002J\u0018\u0010=\u001a\u0002072\u0006\u0010>\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u001bH\u0016J\u0018\u0010?\u001a\u00020\u00022\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001bH\u0016J\u000e\u0010C\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bJ\u0016\u0010D\u001a\u0002072\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001dR\u001a\u0010,\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010/R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", "Lcom/yandex/div/core/view2/divs/DivCollectionAdapter;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerViewHolder;", "items", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "pageTranslations", "Landroid/util/SparseArray;", "", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "path", "Lcom/yandex/div/core/state/DivStatePath;", "pagerView", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "(Ljava/util/List;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/DivBinder;Landroid/util/SparseArray;Lcom/yandex/div/core/view2/DivViewCreator;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)V", "crossAxisAlignment", "Lcom/yandex/div2/DivPager$ItemAlignment;", "getCrossAxisAlignment", "()Lcom/yandex/div2/DivPager$ItemAlignment;", "setCrossAxisAlignment", "(Lcom/yandex/div2/DivPager$ItemAlignment;)V", "currentItem", "", "getCurrentItem", "()I", "value", "", "infiniteScrollEnabled", "getInfiniteScrollEnabled", "()Z", "setInfiniteScrollEnabled", "(Z)V", "isHorizontal", "itemsToShow", "Lkotlin/collections/AbstractList;", "getItemsToShow", "()Lkotlin/collections/AbstractList;", "offsetToRealItem", "getOffsetToRealItem", X3.i.n, "getOrientation", "setOrientation", "(I)V", "removedItems", "getItemCount", "getPosition", "visibleItemIndex", "getRealPosition", "rawPosition", "notifyRawItemChanged", "", X3.i.L, "notifyRawItemInserted", "notifyRawItemRemoved", "notifyVirtualItemsChanged", "originalPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "realItemPosition", "setItems", "newItems", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivPagerAdapter extends DivCollectionAdapter<DivPagerViewHolder> {
    public static final int OFFSET_TO_REAL_ITEM = 2;

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private DivPager.ItemAlignment crossAxisAlignment;

    @NotNull
    private final DivBinder divBinder;
    private boolean infiniteScrollEnabled;

    @NotNull
    private final AbstractList itemsToShow;
    private int orientation;

    @NotNull
    private final SparseArray<Float> pageTranslations;

    @NotNull
    private final DivPagerView pagerView;
    private int removedItems;

    @NotNull
    private final DivViewCreator viewCreator;

    public DivPagerAdapter(@NotNull List<DivItemBuilderResult> list, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull SparseArray<Float> sparseArray, @NotNull DivViewCreator divViewCreator, @NotNull DivStatePath divStatePath, @NotNull DivPagerView divPagerView) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.pageTranslations = sparseArray;
        this.viewCreator = divViewCreator;
        this.pagerView = divPagerView;
        this.itemsToShow = new AbstractList() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$itemsToShow$1
            public /* bridge */ boolean contains(DivItemBuilderResult divItemBuilderResult) {
                return super.contains((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return contains((DivItemBuilderResult) obj);
                }
                return false;
            }

            public /* bridge */ int indexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.indexOf((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractList, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return indexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            public /* bridge */ int lastIndexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.lastIndexOf((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractList, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return lastIndexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            @Override // kotlin.collections.AbstractCollection
            public int getSize() {
                return DivPagerAdapter.this.getVisibleItems().size() + (DivPagerAdapter.this.getInfiniteScrollEnabled() ? 4 : 0);
            }

            @Override // kotlin.collections.AbstractList, java.util.List
            @NotNull
            public DivItemBuilderResult get(int index) {
                return !DivPagerAdapter.this.getInfiniteScrollEnabled() ? DivPagerAdapter.this.getVisibleItems().get(index) : DivPagerAdapter.this.getVisibleItems().get(DivPagerAdapter.this.realItemPosition(index));
            }
        };
        this.crossAxisAlignment = DivPager.ItemAlignment.START;
    }

    @NotNull
    public final AbstractList getItemsToShow() {
        return this.itemsToShow;
    }

    public final int getCurrentItem() {
        return this.pagerView.getCurrentItem$div_release();
    }

    private final int getOffsetToRealItem() {
        return this.infiniteScrollEnabled ? 2 : 0;
    }

    public final int realItemPosition(int position) {
        Integer valueOf = Integer.valueOf(getVisibleItems().size());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0;
        }
        int intValue = valueOf.intValue();
        return (getRealPosition(position) + intValue) % intValue;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void setOrientation(int i) {
        this.orientation = i;
    }

    @NotNull
    public final DivPager.ItemAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final void setCrossAxisAlignment(@NotNull DivPager.ItemAlignment itemAlignment) {
        this.crossAxisAlignment = itemAlignment;
    }

    public final boolean getInfiniteScrollEnabled() {
        return this.infiniteScrollEnabled;
    }

    public final void setInfiniteScrollEnabled(boolean z) {
        if (this.infiniteScrollEnabled == z) {
            return;
        }
        this.infiniteScrollEnabled = z;
        notifyItemRangeChanged(0, getItemCount());
        DivPagerView divPagerView = this.pagerView;
        divPagerView.setCurrentItem$div_release(divPagerView.getCurrentItem$div_release() + (z ? 2 : -2));
    }

    public final int getPosition(int visibleItemIndex) {
        return visibleItemIndex + getOffsetToRealItem();
    }

    public final int getRealPosition(int rawPosition) {
        return rawPosition - getOffsetToRealItem();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DivPagerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new DivPagerViewHolder(this.bindingContext, new DivPagerPageLayout(this.bindingContext.getDivView().getContext(), new Function0() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$view$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                boolean isHorizontal;
                isHorizontal = DivPagerAdapter.this.isHorizontal();
                return Boolean.valueOf(isHorizontal);
            }
        }), this.divBinder, this.viewCreator, new Function0() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                boolean isHorizontal;
                isHorizontal = DivPagerAdapter.this.isHorizontal();
                return Boolean.valueOf(isHorizontal);
            }
        }, new Function0() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final DivPager.ItemAlignment mo4828invoke() {
                return DivPagerAdapter.this.getCrossAxisAlignment();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHorizontal() {
        return this.orientation == 0;
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemsToShow.size();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void onBindViewHolder(@NotNull DivPagerViewHolder holder, int position) {
        super.onBindViewHolder((DivPagerAdapter) holder, realItemPosition(position));
        Float f = this.pageTranslations.get(position);
        if (f != null) {
            float floatValue = f.floatValue();
            if (isHorizontal()) {
                holder.itemView.setTranslationX(floatValue);
            } else {
                holder.itemView.setTranslationY(floatValue);
            }
        }
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void setItems(@NotNull List<DivItemBuilderResult> newItems) {
        int size = getItems().size();
        this.removedItems = 0;
        int currentItem = getCurrentItem();
        super.setItems(newItems);
        if (this.removedItems == size) {
            this.pagerView.setCurrentItem$div_release(currentItem);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    protected void notifyRawItemRemoved(int position) {
        this.removedItems++;
        if (!this.infiniteScrollEnabled) {
            notifyItemRemoved(position);
        } else {
            notifyItemRemoved(position + 2);
            notifyVirtualItemsChanged(position);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    protected void notifyRawItemInserted(int position) {
        if (!this.infiniteScrollEnabled) {
            notifyItemInserted(position);
        } else {
            notifyItemInserted(position + 2);
            notifyVirtualItemsChanged(position);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    protected void notifyRawItemChanged(int position) {
        if (!this.infiniteScrollEnabled) {
            notifyItemChanged(position);
        } else {
            notifyItemChanged(position + 2);
            notifyVirtualItemsChanged(position);
        }
    }

    private final void notifyVirtualItemsChanged(int originalPosition) {
        if (originalPosition >= 0 && originalPosition < 2) {
            notifyItemRangeChanged(getVisibleItems().size() + originalPosition, 2 - originalPosition);
            return;
        }
        int size = getVisibleItems().size() - 2;
        if (originalPosition >= getVisibleItems().size() || size > originalPosition) {
            return;
        }
        notifyItemRangeChanged((originalPosition - getVisibleItems().size()) + 2, 2);
    }
}
