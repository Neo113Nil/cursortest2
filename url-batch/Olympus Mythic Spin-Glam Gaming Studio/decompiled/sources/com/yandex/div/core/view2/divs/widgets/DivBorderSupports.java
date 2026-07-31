package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.DivBorder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivBorderSupports.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\"\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "", "needClipping", "", "getNeedClipping", "()Z", "setNeedClipping", "(Z)V", "getDivBorderDrawer", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "invalidateBorder", "", "onBoundsChanged", "width", "", "height", "releaseBorderDrawer", "setBorder", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "border", "Lcom/yandex/div2/DivBorder;", "view", "Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DivBorderSupports {
    @Nullable
    DivBorderDrawer getDivBorderDrawer();

    boolean getNeedClipping();

    void setBorder(@NotNull BindingContext bindingContext, @Nullable DivBorder border, @NotNull View view);

    void setNeedClipping(boolean z);

    default void onBoundsChanged(int width, int height) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.onBoundsChanged(width, height);
        }
    }

    default void releaseBorderDrawer() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.release();
        }
    }

    default void invalidateBorder() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.invalidateBorder();
        }
    }
}
