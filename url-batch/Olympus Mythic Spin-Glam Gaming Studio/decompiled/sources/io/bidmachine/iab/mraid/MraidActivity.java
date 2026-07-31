package io.bidmachine.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.internal.AdActivity;
import io.bidmachine.util.UiUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes15.dex */
public class MraidActivity extends AdActivity {
    private static final SparseArray d = new SparseArray();
    private Integer a;
    private MraidInterstitial b;
    private boolean c = false;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MraidType.values().length];
            a = iArr;
            try {
                iArr[MraidType.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MraidType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MraidType.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(Throwable th) {
        return "Exception during showing MraidActivity: " + th;
    }

    private void c() {
        a(this.a);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    public static void show(@Nullable Context context, @Nullable MraidInterstitial mraidInterstitial, @Nullable MraidType mraidType) {
        if (mraidInterstitial == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, "MraidInterstitial is null during showing MraidActivity", new Object[0]);
            return;
        }
        if (context == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, "Context is null during showing MraidActivity", new Object[0]);
            mraidInterstitial.c(IabError.noRequiredArguments("Context is null during showing MraidActivity"));
            return;
        }
        if (mraidType == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, "MraidType is null during showing MraidActivity", new Object[0]);
            mraidInterstitial.c(IabError.noRequiredArguments("MraidType is null during showing MraidActivity"));
            return;
        }
        try {
            a(mraidInterstitial);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a(context, mraidType, mraidInterstitial.id));
        } catch (Throwable th) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, new Function0() { // from class: io.bidmachine.iab.mraid.MraidActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String a2;
                    a2 = MraidActivity.a(th);
                    return a2;
                }
            });
            mraidInterstitial.c(IabError.throwable("Exception during showing MraidActivity", th));
            a(Integer.valueOf(mraidInterstitial.id));
        }
    }

    @Override // io.bidmachine.rendering.internal.AdActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "io.bidmachine", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // io.bidmachine.rendering.internal.AdActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().hasExtra("InterstitialId")) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, "Mraid display cache id not provided", new Object[0]);
            UiUtils.finishActivityWithoutAnimation(this);
            return;
        }
        int intExtra = getIntent().getIntExtra("InterstitialId", 0);
        this.a = Integer.valueOf(intExtra);
        MraidInterstitial mraidInterstitial = (MraidInterstitial) d.get(intExtra);
        this.b = mraidInterstitial;
        if (mraidInterstitial == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, "Mraid interstitial not found in display cache, id=%s", this.a);
            UiUtils.finishActivityWithoutAnimation(this);
            return;
        }
        MraidType mraidType = (MraidType) getIntent().getSerializableExtra("InterstitialType");
        if (mraidType == null) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, "MraidType is null", new Object[0]);
            UiUtils.finishActivityWithoutAnimation(this);
            this.b.c(IabError.internal("MraidType is null"));
            return;
        }
        UiUtils.prepareFullscreen(this);
        int i = a.a[mraidType.ordinal()];
        if (i == 1 || i == 2) {
            this.c = true;
        } else if (i == 3) {
            this.c = false;
        }
        try {
            this.b.a((Activity) this, false);
        } catch (Exception e) {
            MraidLog.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.i, new Function0() { // from class: io.bidmachine.iab.mraid.MraidActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    String a2;
                    a2 = MraidActivity.a(e);
                    return a2;
                }
            });
            UiUtils.finishActivityWithoutAnimation(this);
            this.b.c(IabError.throwable("Exception during showing MraidInterstitial in MraidActivity", e));
            c();
        }
        UiUtils.applyFullscreen(this);
        Utils.applyWindowInsets(this);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.b == null || isChangingConfigurations()) {
            return;
        }
        this.b.b();
        c();
    }

    private static void a(MraidInterstitial mraidInterstitial) {
        d.put(mraidInterstitial.id, mraidInterstitial);
    }

    private static void a(Integer num) {
        if (num == null) {
            return;
        }
        d.remove(num.intValue());
    }

    private static Intent a(Context context, MraidType mraidType, int i) {
        Intent a2 = io.bidmachine.rendering.internal.a.a(context, MraidActivity.class);
        a2.putExtra("InterstitialId", i);
        a2.putExtra("InterstitialType", mraidType);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(Exception exc) {
        return "Exception during showing MraidInterstitial in MraidActivity: " + exc;
    }

    @Override // io.bidmachine.rendering.internal.AdActivity
    protected void a() {
        if (this.c) {
            MraidInterstitial mraidInterstitial = this.b;
            if (mraidInterstitial != null) {
                mraidInterstitial.dispatchClose();
            } else {
                UiUtils.finishActivityWithoutAnimation(this);
            }
        }
    }
}
