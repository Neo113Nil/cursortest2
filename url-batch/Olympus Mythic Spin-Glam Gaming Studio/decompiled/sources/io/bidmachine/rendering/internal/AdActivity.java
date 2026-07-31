package io.bidmachine.rendering.internal;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.util.UiUtilsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"Lio/bidmachine/rendering/internal/AdActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "b", "a", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public class AdActivity extends Activity {
    protected void a() {
    }

    protected void b() {
        UiUtilsKt.setActivityBackgroundColor(this, -16777216);
        UiUtilsKt.setNoActivityTransition(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "io.bidmachine", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        a();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        b();
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: io.bidmachine.rendering.internal.AdActivity$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    AdActivity.a(AdActivity.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }
}
