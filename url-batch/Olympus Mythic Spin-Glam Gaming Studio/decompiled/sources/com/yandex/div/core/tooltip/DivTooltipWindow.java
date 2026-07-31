package com.yandex.div.core.tooltip;

import android.view.View;
import com.yandex.div.core.util.SafePopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTooltipWindow.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipWindow;", "Lcom/yandex/div/core/util/SafePopupWindow;", "contentView", "Landroid/view/View;", "width", "", "height", "focusable", "", "(Landroid/view/View;IIZ)V", "dismiss", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivTooltipWindow extends SafePopupWindow {
    public /* synthetic */ DivTooltipWindow(View view, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z);
    }

    public DivTooltipWindow(@NotNull View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }
}
