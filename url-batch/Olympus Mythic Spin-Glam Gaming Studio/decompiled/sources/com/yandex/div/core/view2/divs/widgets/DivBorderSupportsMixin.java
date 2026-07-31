package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewOutlineProvider;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.DivBorder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBorderSupportsMixin.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupportsMixin;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "()V", "borderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "value", "", "needClipping", "getNeedClipping", "()Z", "setNeedClipping", "(Z)V", "getDivBorderDrawer", "setBorder", "", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "border", "Lcom/yandex/div2/DivBorder;", "view", "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DivBorderSupportsMixin implements DivBorderSupports {

    @Nullable
    private DivBorderDrawer borderDrawer;
    private boolean needClipping = true;

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.needClipping;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        DivBorderDrawer divBorderDrawer = this.borderDrawer;
        if (divBorderDrawer != null) {
            divBorderDrawer.setNeedClipping(z);
        }
        this.needClipping = z;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getBorderDrawer() {
        return this.borderDrawer;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder border, @NotNull View view) {
        if (this.borderDrawer == null && border != null) {
            this.borderDrawer = new DivBorderDrawer(bindingContext.getDivView(), view);
        }
        DivBorderDrawer divBorderDrawer = this.borderDrawer;
        if (divBorderDrawer != null) {
            divBorderDrawer.setBorder(border, bindingContext.getExpressionResolver());
        }
        DivBorderDrawer divBorderDrawer2 = this.borderDrawer;
        if (divBorderDrawer2 != null) {
            divBorderDrawer2.setNeedClipping(getNeedClipping());
        }
        if (border == null) {
            view.setElevation(0.0f);
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            releaseBorderDrawer();
            this.borderDrawer = null;
        }
        view.invalidate();
    }
}
