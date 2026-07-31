package com.pubmatic.sdk.common.view.cta;

import android.content.Context;
import android.view.MotionEvent;
import com.pubmatic.sdk.common.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/pubmatic/sdk/common/view/cta/POBMrecCTAOverlayView;", "Lcom/pubmatic/sdk/common/view/cta/POBCTAOverlayView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class POBMrecCTAOverlayView extends POBCTAOverlayView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBMrecCTAOverlayView(@NotNull Context context) {
        super(context, R.layout.pob_cta_overlay_mrec);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pubmatic.sdk.common.view.cta.POBCTAOverlayView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.pubmatic.sdk.common.view.cta.POBCTAOverlayView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
