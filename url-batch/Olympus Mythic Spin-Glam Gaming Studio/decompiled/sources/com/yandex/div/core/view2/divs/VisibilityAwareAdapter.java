package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.android.billingclient.api.BillingClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div2.DivVisibility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: VisibilityAwareAdapter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000e\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010!\u001a\u00020\u001aH\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ \u0010)\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\b\u0010*\u001a\u00020\u0018H\u0004J\u001a\u0010+\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006-"}, d2 = {"Lcom/yandex/div/core/view2/divs/VisibilityAwareAdapter;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "initialItems", "", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "(Ljava/util/List;)V", "isVisibleItemListValid", "", "itemList", "", "itemVisibilityList", "items", "getItems", "()Ljava/util/List;", BillingClient.FeatureType.SUBSCRIPTIONS, "Lcom/yandex/div/core/Disposable;", "getSubscriptions", "visibleItemList", "visibleItems", "getVisibleItems", "addItem", "", X3.i.L, "", "item", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "Lcom/yandex/div2/DivVisibility;", "addItems", "", "buildVisibleItemList", "getItemCount", "notifyRawItemChanged", "notifyRawItemInserted", "notifyRawItemRemoved", "notifyVisibleItemChanged", "notifyVisibleItemInserted", "notifyVisibleItemRemoved", "removeItem", "setItem", "subscribeOnElements", "updateItemVisibility", "visiblePositionOf", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class VisibilityAwareAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements ExpressionSubscriber {
    private boolean isVisibleItemListValid;

    @NotNull
    private final List<DivItemBuilderResult> itemList;

    @NotNull
    private final List<Boolean> itemVisibilityList;

    @NotNull
    private final List<Disposable> subscriptions;

    @NotNull
    private final List<DivItemBuilderResult> visibleItemList = new ArrayList();

    public VisibilityAwareAdapter(@NotNull List<DivItemBuilderResult> list) {
        boolean isVisible;
        this.itemList = CollectionsKt.toMutableList((Collection) list);
        List<DivItemBuilderResult> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            isVisible = VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next());
            arrayList.add(Boolean.valueOf(isVisible));
        }
        this.itemVisibilityList = CollectionsKt.toMutableList((Collection) arrayList);
        this.subscriptions = new ArrayList();
        subscribeOnElements();
    }

    @NotNull
    public final List<DivItemBuilderResult> getItems() {
        return this.itemList;
    }

    @NotNull
    public final List<DivItemBuilderResult> getVisibleItems() {
        return buildVisibleItemList();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    private final List<DivItemBuilderResult> buildVisibleItemList() {
        if (!this.isVisibleItemListValid) {
            this.visibleItemList.clear();
            List<DivItemBuilderResult> list = this.itemList;
            List<DivItemBuilderResult> list2 = this.visibleItemList;
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                if (!this.itemVisibilityList.get(i).booleanValue()) {
                    divItemBuilderResult = null;
                }
                if (divItemBuilderResult != null) {
                    list2.add(divItemBuilderResult);
                }
                i = i2;
            }
            this.isVisibleItemListValid = true;
        }
        return this.visibleItemList;
    }

    public static /* synthetic */ void addItem$default(VisibilityAwareAdapter visibilityAwareAdapter, int i, DivItemBuilderResult divItemBuilderResult, DivVisibility divVisibility, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItem");
        }
        if ((i2 & 4) != 0) {
            divVisibility = VisibilityAwareAdapterKt.getVisibility(divItemBuilderResult);
        }
        visibilityAwareAdapter.addItem(i, divItemBuilderResult, divVisibility);
    }

    public final void addItem(int position, @NotNull DivItemBuilderResult item, @NotNull DivVisibility visibility) {
        boolean z = visibility == DivVisibility.VISIBLE;
        this.itemList.add(position, item);
        this.itemVisibilityList.add(position, Boolean.valueOf(z));
        this.isVisibleItemListValid = false;
        if (z) {
            notifyVisibleItemInserted(position);
        }
    }

    public final void addItems(int position, @NotNull Collection<DivItemBuilderResult> items) {
        DivVisibility visibility;
        boolean isVisible;
        this.itemList.addAll(position, items);
        List<Boolean> list = this.itemVisibilityList;
        Collection<DivItemBuilderResult> collection = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            isVisible = VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next());
            arrayList.add(Boolean.valueOf(isVisible));
        }
        list.addAll(position, arrayList);
        int i = 0;
        this.isVisibleItemListValid = false;
        for (Object obj : collection) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            visibility = VisibilityAwareAdapterKt.getVisibility((DivItemBuilderResult) obj);
            if (visibility == DivVisibility.VISIBLE) {
                notifyVisibleItemInserted(i + position);
            }
            i = i2;
        }
    }

    public static /* synthetic */ void setItem$default(VisibilityAwareAdapter visibilityAwareAdapter, int i, DivItemBuilderResult divItemBuilderResult, DivVisibility divVisibility, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItem");
        }
        if ((i2 & 4) != 0) {
            divVisibility = VisibilityAwareAdapterKt.getVisibility(divItemBuilderResult);
        }
        visibilityAwareAdapter.setItem(i, divItemBuilderResult, divVisibility);
    }

    public final void setItem(int position, @NotNull DivItemBuilderResult item, @NotNull DivVisibility visibility) {
        boolean z = visibility == DivVisibility.VISIBLE;
        boolean booleanValue = this.itemVisibilityList.get(position).booleanValue();
        this.itemList.set(position, item);
        this.itemVisibilityList.set(position, Boolean.valueOf(z));
        if (z || booleanValue) {
            this.isVisibleItemListValid = false;
        }
        if (booleanValue && !z) {
            notifyVisibleItemRemoved(position);
            return;
        }
        if (!booleanValue && z) {
            notifyVisibleItemInserted(position);
        } else if (booleanValue && z) {
            notifyVisibleItemChanged(position);
        }
    }

    public final void removeItem(int position) {
        this.itemList.remove(position);
        boolean booleanValue = this.itemVisibilityList.remove(position).booleanValue();
        this.isVisibleItemListValid = false;
        if (booleanValue) {
            notifyVisibleItemRemoved(position);
        }
    }

    private final int visiblePositionOf(int position) {
        int i = 0;
        for (int i2 = 0; i2 < position; i2++) {
            if (this.itemVisibilityList.get(i2).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getVisibleItems().size();
    }

    protected final void subscribeOnElements() {
        closeAllSubscription();
        final int i = 0;
        for (Object obj : this.itemList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            addSubscription(divItemBuilderResult.getDiv().value().getVisibility().observe(divItemBuilderResult.getExpressionResolver(), new Function1(this) { // from class: com.yandex.div.core.view2.divs.VisibilityAwareAdapter$subscribeOnElements$1$subscription$1
                final /* synthetic */ VisibilityAwareAdapter<VH> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DivVisibility) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull DivVisibility divVisibility) {
                    this.this$0.updateItemVisibility(i, divVisibility);
                }
            }));
            i = i2;
        }
    }

    static /* synthetic */ void updateItemVisibility$default(VisibilityAwareAdapter visibilityAwareAdapter, int i, DivVisibility divVisibility, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateItemVisibility");
        }
        if ((i2 & 2) != 0) {
            divVisibility = VisibilityAwareAdapterKt.getVisibility(visibilityAwareAdapter.itemList.get(i));
        }
        visibilityAwareAdapter.updateItemVisibility(i, divVisibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemVisibility(int position, DivVisibility visibility) {
        boolean z = visibility == DivVisibility.VISIBLE;
        boolean booleanValue = this.itemVisibilityList.get(position).booleanValue();
        if (z == booleanValue) {
            return;
        }
        this.itemVisibilityList.set(position, Boolean.valueOf(z));
        this.isVisibleItemListValid = false;
        if (booleanValue) {
            notifyVisibleItemRemoved(position);
        } else {
            notifyVisibleItemInserted(position);
        }
    }

    private final void notifyVisibleItemRemoved(int position) {
        notifyRawItemRemoved(visiblePositionOf(position));
    }

    private final void notifyVisibleItemInserted(int position) {
        notifyRawItemInserted(visiblePositionOf(position));
    }

    private final void notifyVisibleItemChanged(int position) {
        notifyRawItemChanged(visiblePositionOf(position));
    }

    protected void notifyRawItemRemoved(int position) {
        notifyItemRemoved(position);
    }

    protected void notifyRawItemInserted(int position) {
        notifyItemInserted(position);
    }

    protected void notifyRawItemChanged(int position) {
        notifyItemChanged(position);
    }
}
