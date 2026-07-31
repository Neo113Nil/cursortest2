package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import com.ironsource.X3;
import com.safedk.android.internal.special.SpecialsBridge;
import com.yandex.div.R;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivGalleryViewHolder.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryViewHolder;", "Lcom/yandex/div/core/view2/divs/DivCollectionViewHolder;", "parentContext", "Lcom/yandex/div/core/view2/BindingContext;", "rootView", "Lcom/yandex/div/core/widget/DivViewWrapper;", "divBinder", "Lcom/yandex/div/core/view2/DivBinder;", "viewCreator", "Lcom/yandex/div/core/view2/DivViewCreator;", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/widget/DivViewWrapper;Lcom/yandex/div/core/view2/DivBinder;Lcom/yandex/div/core/view2/DivViewCreator;)V", "bind", "", "bindingContext", "div", "Lcom/yandex/div2/Div;", X3.i.L, "", "path", "Lcom/yandex/div/core/state/DivStatePath;", "logReuseError", "updateWrapperLayoutParams", "childView", "Landroid/view/View;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DivGalleryViewHolder extends DivCollectionViewHolder {

    @NotNull
    public static final String TAG = "DivGalleryViewHolder";

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final DivViewWrapper rootView;

    public DivGalleryViewHolder(@NotNull BindingContext bindingContext, @NotNull DivViewWrapper divViewWrapper, @NotNull DivBinder divBinder, @NotNull DivViewCreator divViewCreator) {
        super(divViewWrapper, bindingContext, divBinder, divViewCreator);
        this.rootView = divViewWrapper;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(@NotNull BindingContext bindingContext, @NotNull Div div, int position, @NotNull DivStatePath path) {
        super.bind(bindingContext, div, position, path);
        SpecialsBridge.yandexViewSetTag(this.rootView, R.id.div_gallery_item_index, Integer.valueOf(position));
        this.divBinder.attachIndicators$div_release();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    protected void updateWrapperLayoutParams(@NotNull View childView) {
        this.rootView.setLayoutParams(childView.getLayoutParams());
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    protected void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, TAG, "Gallery holder reuse failed");
        }
    }
}
