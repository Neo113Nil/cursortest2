package io.bidmachine.rendering.ad.view;

import android.os.Bundle;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.AdActivity;
import io.bidmachine.util.UiUtilsKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/bidmachine/rendering/ad/view/ExpandActivity;", "Lio/bidmachine/rendering/internal/AdActivity;", "<init>", "()V", "", "c", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lio/bidmachine/rendering/ad/view/AdView;", "a", "Lio/bidmachine/rendering/ad/view/AdView;", "adView", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class ExpandActivity extends AdActivity {

    /* renamed from: a, reason: from kotlin metadata */
    private AdView adView;

    private final void c() {
        UiUtilsKt.finishActivityWithoutAnimationSafely(this);
        AdView adView = this.adView;
        if (adView != null) {
            adView.collapse();
        }
        this.adView = null;
    }

    @Override // io.bidmachine.rendering.internal.AdActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "io.bidmachine", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // io.bidmachine.rendering.internal.AdActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        WeakReference weakReference;
        super.onCreate(savedInstanceState);
        weakReference = ExpandActivityKt.a;
        AdView adView = weakReference != null ? (AdView) weakReference.get() : null;
        this.adView = adView;
        if (adView == null) {
            c();
        } else {
            adView.showInActivity(this);
            adView.onExpanded();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        WeakReference weakReference;
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        weakReference = ExpandActivityKt.a;
        if (Intrinsics.areEqual(weakReference != null ? (AdView) weakReference.get() : null, this.adView)) {
            ExpandActivityKt.a();
        }
        c();
    }
}
