package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public abstract class MBBaseActivity extends Activity {
    private Display a;
    private OrientationEventListener b;
    private int c = -1;
    private volatile boolean d = false;
    private Runnable e;
    private com.mbridge.msdk.config.activity.backdispatcher.a f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e) {
                q0.b("MBBaseActivity", e.getMessage());
            }
        }
    }

    class b extends OrientationEventListener {
        b(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int rotation = MBBaseActivity.this.a != null ? MBBaseActivity.this.a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.c != 1) {
                MBBaseActivity.this.c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.c != 2) {
                MBBaseActivity.this.c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.c != 3) {
                MBBaseActivity.this.c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.c == 4) {
                    return;
                }
                MBBaseActivity.this.c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    class c implements com.mbridge.msdk.config.activity.backdispatcher.b {
        c() {
        }

        @Override // com.mbridge.msdk.config.activity.backdispatcher.b
        public void a() {
            MBBaseActivity.this.onBackDispatched();
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.b = bVar;
        if (bVar.canDetectOrientation()) {
            this.b.enable();
        } else {
            this.b.disable();
            this.b = null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.o, me);
        return super.dispatchTouchEvent(me);
    }

    public void getNotchParams() {
        if (this.d) {
            return;
        }
        this.e = new a();
        getWindow().getDecorView().postDelayed(this.e, 500L);
    }

    public abstract void onBackDispatched();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
            if (Build.VERSION.SDK_INT >= 33) {
                registerBackInvokedDispatcher();
            }
        } catch (Exception e) {
            q0.b("MBBaseActivity", e.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.b = null;
            }
            if (this.e != null) {
                getWindow().getDecorView().removeCallbacks(this.e);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                unRegisterBackInvokedDispatcher();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        c();
    }

    public void registerBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = new com.mbridge.msdk.config.activity.backdispatcher.a();
            this.f = aVar;
            aVar.a(getWindow(), new c());
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    public void unRegisterBackInvokedDispatcher() {
        try {
            com.mbridge.msdk.config.activity.backdispatcher.a aVar = this.f;
            if (aVar == null) {
                return;
            }
            aVar.a(getWindow());
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r0 = r1.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        DisplayCutout displayCutout;
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int i6 = Build.VERSION.SDK_INT;
        if (this.d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i7 = -1;
        if (rootWindowInsets == null || i6 < 28 || displayCutout == null) {
            i = -1;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            safeInsetRight = displayCutout.getSafeInsetRight();
            safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.c == -1) {
                this.c = rotation == 0 ? 3 : rotation == 1 ? 1 : rotation == 2 ? 4 : rotation == 3 ? 2 : -1;
                q0.b("MBBaseActivity", this.c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i7 = 90;
                } else if (rotation == 2) {
                    i7 = 180;
                } else if (rotation == 3) {
                    i7 = 270;
                }
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i = i7;
            } else {
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i = 0;
            }
            i3 = safeInsetRight;
            i4 = safeInsetTop;
        }
        setTopControllerPadding(i, i2, i3, i4, i5);
        if (this.b == null) {
            d();
        }
    }

    private int a() {
        Display display;
        if (this.a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                display = getDisplay();
                this.a = display;
            } else {
                this.a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display2 = this.a;
        if (display2 != null) {
            return display2.getRotation();
        }
        return -1;
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            q0.b("MBBaseActivity", th.getMessage());
        }
    }
}
