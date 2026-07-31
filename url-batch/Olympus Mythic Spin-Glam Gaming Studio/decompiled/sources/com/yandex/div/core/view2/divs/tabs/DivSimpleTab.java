package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTabsAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eJ\r\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivSimpleTab;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi$Input$SimpleTab;", "Lcom/yandex/div2/DivTabs$Item;", "Lcom/yandex/div2/DivAction;", "item", "displayMetrics", "Landroid/util/DisplayMetrics;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div2/DivTabs$Item;Landroid/util/DisplayMetrics;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "getActionable", "getItem", "getTabHeight", "", "()Ljava/lang/Integer;", "getTabHeightLayoutParam", "getTitle", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DivSimpleTab implements BaseDivTabbedCardUi.Input.SimpleTab<DivTabs.Item, DivAction> {

    @NotNull
    private final DisplayMetrics displayMetrics;

    @NotNull
    private final DivTabs.Item item;

    @NotNull
    private final ExpressionResolver resolver;

    public DivSimpleTab(@NotNull DivTabs.Item item, @NotNull DisplayMetrics displayMetrics, @NotNull ExpressionResolver expressionResolver) {
        this.item = item;
        this.displayMetrics = displayMetrics;
        this.resolver = expressionResolver;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public String getTitle() {
        return (String) this.item.title.evaluate(this.resolver);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    public DivAction getActionable() {
        return this.item.titleClickAction;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @Nullable
    public Integer getTabHeight() {
        DivSize height = this.item.div.value().getHeight();
        if (height instanceof DivSize.Fixed) {
            return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(height, this.displayMetrics, this.resolver, null, 4, null));
        }
        return null;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase
    @NotNull
    public Integer getTabHeightLayoutParam() {
        return Integer.valueOf(DivUtilKt.toLayoutParamsSize$default(this.item.div.value().getHeight(), this.displayMetrics, this.resolver, null, 4, null));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.SimpleTab
    @NotNull
    public DivTabs.Item getItem() {
        return this.item;
    }
}
