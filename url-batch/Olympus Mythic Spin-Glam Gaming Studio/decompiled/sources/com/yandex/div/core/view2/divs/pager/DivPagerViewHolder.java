package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import com.ironsource.X3;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivPager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivPagerViewHolder.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\u001c\u0010\u001a\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerViewHolder;", "Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;", "parentContext", "Lcom/yandex/div/core/view2/BindingContext;", "pageLayout", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageLayout;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "isHorizontal", "Lkotlin/Function0;", "", "crossAxisAlignment", "Lcom/yandex/div2/DivPager$ItemAlignment;", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/view2/divs/pager/DivPagerPageLayout;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/DivViewCreator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "bind", "", "bindingContext", "div", "Lcom/yandex/div2/Div;", X3.i.L, "", "path", "Lcom/yandex/div/core/state/DivStatePath;", "logReuseError", "setCrossAxisAlignment", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "Lcom/yandex/div2/DivBase;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DivPagerViewHolder extends DivCollectionViewHolder {

    @NotNull
    public static final String TAG = "DivPagerViewHolder";

    @NotNull
    private final Function0 crossAxisAlignment;

    @NotNull
    private final Function0 isHorizontal;

    @NotNull
    private final DivPagerPageLayout pageLayout;

    @NotNull
    private final BindingContext parentContext;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1] */
    public DivPagerViewHolder(@NotNull BindingContext bindingContext, @NotNull DivPagerPageLayout divPagerPageLayout, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator, @NotNull Function0 function0, @NotNull Function0 function02) {
        super(divPagerPageLayout, bindingContext, divBinder, divViewCreator);
        this.parentContext = bindingContext;
        this.pageLayout = divPagerPageLayout;
        this.isHorizontal = function0;
        this.crossAxisAlignment = function02;
        final View view = this.itemView;
        final ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                Div oldDiv;
                BindingContext bindingContext2;
                BindingContext bindingContext3;
                oldDiv = DivPagerViewHolder.this.getOldDiv();
                if (oldDiv == null) {
                    return;
                }
                bindingContext2 = DivPagerViewHolder.this.parentContext;
                DivVisibilityActionTracker visibilityActionTracker = bindingContext2.getDivView().getDiv2Component().getVisibilityActionTracker();
                bindingContext3 = DivPagerViewHolder.this.parentContext;
                visibilityActionTracker.startTrackingViewsHierarchy(bindingContext3, view2, oldDiv);
            }
        };
        view.addOnAttachStateChangeListener(r2);
        new Disposable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$2
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                view.removeOnAttachStateChangeListener(r2);
            }
        };
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(@NotNull BindingContext bindingContext, @NotNull Div div, int position, @NotNull DivStatePath path) {
        super.bind(bindingContext, div, position, path);
        View child = this.pageLayout.getChild();
        Object layoutParams = child != null ? child.getLayoutParams() : null;
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null) {
            setCrossAxisAlignment(divLayoutParams, div.value(), bindingContext.getExpressionResolver());
        }
    }

    private final void setCrossAxisAlignment(DivLayoutParams divLayoutParams, DivBase divBase, ExpressionResolver expressionResolver) {
        Enum r3;
        Expression alignmentVertical = ((Boolean) this.isHorizontal.mo4828invoke()).booleanValue() ? divBase.getAlignmentVertical() : divBase.getAlignmentHorizontal();
        if (alignmentVertical == null || (r3 = (Enum) alignmentVertical.evaluate(expressionResolver)) == null) {
            r3 = (Enum) this.crossAxisAlignment.mo4828invoke();
        }
        int i = 17;
        if (((Boolean) this.isHorizontal.mo4828invoke()).booleanValue()) {
            if (r3 != DivPager.ItemAlignment.CENTER && r3 != DivAlignmentVertical.CENTER) {
                i = (r3 == DivPager.ItemAlignment.END || r3 == DivAlignmentVertical.BOTTOM) ? 80 : 48;
            }
        } else if (r3 != DivPager.ItemAlignment.CENTER && r3 != DivAlignmentHorizontal.CENTER) {
            if (r3 == DivPager.ItemAlignment.END || r3 == DivAlignmentHorizontal.END) {
                i = 8388613;
            } else if (r3 == DivAlignmentHorizontal.LEFT) {
                i = 3;
            } else {
                i = r3 == DivAlignmentHorizontal.RIGHT ? 5 : 8388611;
            }
        }
        divLayoutParams.setGravity(i);
        this.pageLayout.requestLayout();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    protected void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, TAG, "Pager holder reuse failed");
        }
    }
}
