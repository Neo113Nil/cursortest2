package io.bidmachine.util;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewUtils.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"io/bidmachine/util/ViewUtilsKt$doOnLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 176)
/* loaded from: classes12.dex */
public final class ViewUtilsKt$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ Function1 $action;

    public ViewUtilsKt$doOnLayout$1(Function1 function1) {
        this.$action = function1;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.$action.invoke(view);
    }
}
