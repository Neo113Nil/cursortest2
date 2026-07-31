package com.mbridge.msdk.config.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class BaseActivity extends Activity {
    a a;

    private void a() {
        try {
            if (getIntent().getIntExtra("155", 0) == 1) {
                f1.a(getWindow());
                f1.d(getWindow());
                f1.c(getWindow());
            } else {
                f1.b(getWindow());
                f1.c(getWindow());
            }
        } catch (Exception e) {
            q0.b("BaseActivity", e.getMessage());
        }
    }

    private void b() {
        if (getIntent().getIntExtra("154", 0) == 1) {
            getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#80000000")));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.o, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.a("onBackPressed");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        b();
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.a("onDestroy");
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.a(X3.i.t0);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.a("onReStart");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.a(X3.i.u0);
        c.n().a(this);
        if (getIntent().getIntExtra("155", 0) == 1) {
            f1.a(getWindow());
        } else {
            f1.b(getWindow());
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.a("onStart");
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.a("onStop");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (getIntent().getIntExtra("155", 0) == 1) {
            f1.a(getWindow());
        } else {
            f1.b(getWindow());
        }
    }
}
