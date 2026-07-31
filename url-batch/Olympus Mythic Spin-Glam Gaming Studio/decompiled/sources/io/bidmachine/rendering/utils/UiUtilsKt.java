package io.bidmachine.rendering.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.ironsource.X3;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.util.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"applyInsets", "", "Landroid/app/Activity;", "contentView", "Landroid/view/View;", "isRequestApplyInsets", "", "setupActivityOrientation", X3.i.n, "Lio/bidmachine/rendering/model/Orientation;", "bidmachine-android-sdk_bb_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class UiUtilsKt {
    public static final void applyInsets(@NotNull Activity activity, @NotNull View contentView, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            if (decorView == null) {
                decorView = contentView;
            }
            contentView.setPadding(0, 0, 0, 0);
            ViewUtils.setInsetsChanger(decorView);
            if (z) {
                decorView.requestApplyInsets();
            }
        }
    }

    public static /* synthetic */ void applyInsets$default(Activity activity, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        applyInsets(activity, view, z);
    }

    public static final void setupActivityOrientation(@NotNull Activity activity, @Nullable Orientation orientation) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.setRequestedOrientation(orientation != null ? orientation.getActivityOrientation() : 4);
    }
}
