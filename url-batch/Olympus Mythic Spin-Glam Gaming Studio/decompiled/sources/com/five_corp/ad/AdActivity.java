package com.five_corp.ad;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class AdActivity extends Activity {
    public f a;
    public com.five_corp.ad.internal.hub.ad_instance.e b;

    public interface Callback {
        void onAdActivityBackPressed();
    }

    public final void a() {
        f fVar = this.a;
        if (fVar != null) {
            fVar.onAdActivityBackPressed();
        } else {
            finish();
        }
    }

    public final void b() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: com.five_corp.ad.AdActivity$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    AdActivity.this.a();
                }
            });
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.five_corp.ad", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        f fVar = this.a;
        if (fVar != null) {
            fVar.onAdActivityBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        WindowInsetsController windowInsetsController;
        int statusBars;
        int navigationBars;
        WindowInsetsController insetsController;
        super.onCreate(bundle);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            windowInsetsController = window.getDecorView().getWindowInsetsController();
            statusBars = WindowInsets.Type.statusBars();
            navigationBars = WindowInsets.Type.navigationBars();
            windowInsetsController.hide(statusBars | navigationBars);
            insetsController = window.getInsetsController();
            insetsController.setSystemBarsBehavior(2);
        } else {
            window.addFlags(1536);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(2822);
            decorView.setOnSystemUiVisibilityChangeListener(new b(window));
        }
        b();
        if (com.five_corp.ad.internal.fullscreen.b.a == null) {
            com.five_corp.ad.internal.fullscreen.b.a = new com.five_corp.ad.internal.fullscreen.a();
        }
        com.five_corp.ad.internal.fullscreen.a aVar = com.five_corp.ad.internal.fullscreen.b.a;
        f fVar = aVar.b;
        aVar.b = null;
        if (fVar == null) {
            finish();
            return;
        }
        this.a = fVar;
        this.b = fVar.A;
        fVar.o.f();
        synchronized (fVar.m) {
            i = fVar.v;
        }
        if (i == 1) {
            com.five_corp.ad.internal.context.h hVar = fVar.l;
            com.five_corp.ad.internal.ad.fullscreen.h hVar2 = hVar.d.c;
            if (hVar2 != null) {
                com.five_corp.ad.internal.fullscreen.c cVar = new com.five_corp.ad.internal.fullscreen.c(this, fVar.h, hVar, hVar2, fVar, fVar.b.l, fVar.A, fVar.i, fVar.x);
                fVar.w = cVar;
                cVar.c();
                com.five_corp.ad.internal.viewability.a aVar2 = cVar.j;
                FrameLayout frameLayout = cVar.g;
                aVar2.e = frameLayout;
                cVar.a.setContentView(frameLayout);
                return;
            }
        }
        finish();
        fVar.a(0, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.b4, null, null));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.five_corp.ad.internal.hub.ad_instance.e eVar = this.b;
        if (eVar != null) {
            Iterator it = eVar.j.iterator();
            while (it.hasNext()) {
                f fVar = (f) ((com.five_corp.ad.internal.hub.ad_instance.a) it.next());
                fVar.getClass();
                try {
                    if (fVar.w != null) {
                        int currentPositionMs = fVar.h.getCurrentPositionMs();
                        fVar.a(currentPositionMs);
                        com.five_corp.ad.internal.fullscreen.c cVar = fVar.w;
                        if (!cVar.m.getAndSet(true)) {
                            cVar.g.removeAllViews();
                            cVar.k = null;
                            cVar.l = null;
                            cVar.a.finish();
                        }
                        fVar.w = null;
                        fVar.o.k(currentPositionMs, fVar.u);
                    }
                    fVar.o.e();
                } catch (Exception e) {
                    fVar.A.a(com.five_corp.ad.internal.logger.b.a(e));
                }
            }
        }
    }
}
