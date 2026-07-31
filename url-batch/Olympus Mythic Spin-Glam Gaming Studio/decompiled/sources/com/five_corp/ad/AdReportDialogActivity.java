package com.five_corp.ad;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/five_corp/ad/AdReportDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdReportDialogActivity extends AppCompatActivity {

    @NotNull
    public static final String EXTRA_IS_FULLSCREEN = "is_fullscreen";

    public static void a(final Window window) {
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        final int i = 2822;
        decorView.setSystemUiVisibility(2822);
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.five_corp.ad.AdReportDialogActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i2) {
                AdReportDialogActivity.a(window, i, i2);
            }
        });
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.five_corp.ad", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WindowInsetsController windowInsetsController;
        int statusBars;
        int navigationBars;
        WindowInsetsController insetsController;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            EdgeToEdge.enable$default(this, null, null, 3, null);
        }
        super.onCreate(bundle);
        if (i >= 34) {
            overrideActivityTransition(0, 0, 0);
            overrideActivityTransition(1, 0, 0);
        }
        if (getIntent().getBooleanExtra(EXTRA_IS_FULLSCREEN, true)) {
            Window window = getWindow();
            if (i >= 30) {
                Intrinsics.checkNotNull(window);
                windowInsetsController = window.getDecorView().getWindowInsetsController();
                Intrinsics.checkNotNull(windowInsetsController);
                statusBars = WindowInsets.Type.statusBars();
                navigationBars = WindowInsets.Type.navigationBars();
                windowInsetsController.hide(statusBars | navigationBars);
                insetsController = window.getInsetsController();
                Intrinsics.checkNotNull(insetsController);
                insetsController.setSystemBarsBehavior(2);
            } else {
                Intrinsics.checkNotNull(window);
                window.addFlags(1536);
                a(window);
            }
        }
        if (com.five_corp.ad.internal.ad_report.d.a == null) {
            com.five_corp.ad.internal.ad_report.d.a = new com.five_corp.ad.internal.ad_report.a();
        }
        com.five_corp.ad.internal.ad_report.a aVar = com.five_corp.ad.internal.ad_report.d.a;
        com.five_corp.ad.internal.ad_report.c cVar = aVar.a;
        aVar.a = null;
        aVar.b = null;
        if (cVar != null) {
            cVar.a(this);
            return;
        }
        finish();
        if (i < 34) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (com.five_corp.ad.internal.ad_report.d.a == null) {
            com.five_corp.ad.internal.ad_report.d.a = new com.five_corp.ad.internal.ad_report.a();
        }
        com.five_corp.ad.internal.ad_report.a aVar = com.five_corp.ad.internal.ad_report.d.a;
        com.five_corp.ad.internal.ad_report.c cVar = aVar.a;
        aVar.a = null;
        aVar.b = null;
        if (cVar != null) {
            cVar.a(this);
            return;
        }
        finish();
        if (Build.VERSION.SDK_INT < 34) {
            overridePendingTransition(0, 0);
        }
    }

    public static final void a(Window window, int i, int i2) {
        window.getDecorView().setSystemUiVisibility(i);
    }
}
