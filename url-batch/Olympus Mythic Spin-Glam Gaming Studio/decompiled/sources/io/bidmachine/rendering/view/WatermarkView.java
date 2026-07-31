package io.bidmachine.rendering.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.util.UiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lio/bidmachine/rendering/view/WatermarkView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "setWatermark", "", MBridgeConstans.EXTRA_KEY_WM, "Landroid/graphics/drawable/Drawable;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class WatermarkView extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatermarkView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setClickable(false);
        setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(WatermarkView this$0, Drawable drawable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setBackground(drawable);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setWatermark(@Nullable final Drawable watermark) {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.view.WatermarkView$$ExternalSyntheticLambda0
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                WatermarkView.a(WatermarkView.this, watermark);
            }
        });
    }
}
