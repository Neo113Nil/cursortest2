package com.yandex.div.core.util;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafePopupWindow.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/util/SafePopupWindow;", "Landroid/widget/PopupWindow;", "contentView", "Landroid/view/View;", "width", "", "height", "focusable", "", "(Landroid/view/View;IIZ)V", "(Landroid/view/View;II)V", "setContentView", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public class SafePopupWindow extends PopupWindow {
    public SafePopupWindow(@NotNull View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
    }

    public SafePopupWindow(@NotNull View view, int i, int i2) {
        super(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(@Nullable View contentView) {
        if (contentView != null) {
            contentView.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(contentView);
    }
}
