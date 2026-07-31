package com.unity3d.player;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes14.dex */
final class T0 implements Handler.Callback {
    final /* synthetic */ U0 a;

    T0(U0 u0) {
        this.a = u0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        if (r7.d == 3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e1, code lost:
    
        r7.i.nativeFocusChanged(true);
        r6.a.d = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        if (r7.c != false) goto L59;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        U0 u0;
        boolean haveAndroidWindowSupport;
        boolean nativeRender;
        boolean splashEnabled;
        Activity activity;
        boolean autoReportFullyDrawnEnabled;
        Activity activity2;
        if (message.what != 2269) {
            return false;
        }
        S0 s0 = (S0) message.obj;
        S0 s02 = S0.h;
        if (s0 == s02) {
            U0 u02 = this.a;
            u02.e--;
            u02.i.executeGLThreadJobs();
            U0 u03 = this.a;
            if (!u03.b) {
                return true;
            }
            haveAndroidWindowSupport = u03.i.getHaveAndroidWindowSupport();
            if (haveAndroidWindowSupport && !this.a.c) {
                return true;
            }
            U0 u04 = this.a;
            int i = u04.h;
            if (i >= 0) {
                if (i == 0) {
                    splashEnabled = u04.i.getSplashEnabled();
                    if (splashEnabled) {
                        this.a.i.DisableStaticSplashScreen();
                    }
                    UnityPlayer unityPlayer = this.a.i;
                    activity = unityPlayer.mActivity;
                    if (activity != null) {
                        autoReportFullyDrawnEnabled = unityPlayer.getAutoReportFullyDrawnEnabled();
                        if (autoReportFullyDrawnEnabled) {
                            activity2 = this.a.i.mActivity;
                            activity2.reportFullyDrawn();
                        }
                    }
                }
                this.a.h--;
            }
            if (!this.a.i.isFinishing()) {
                nativeRender = this.a.i.nativeRender();
                if (!nativeRender) {
                    this.a.i.finish();
                }
            }
        } else if (s0 == S0.c) {
            Looper.myLooper().quit();
        } else if (s0 == S0.b) {
            this.a.b = true;
        } else if (s0 == S0.a) {
            this.a.b = false;
        } else if (s0 == S0.d) {
            this.a.c = false;
        } else if (s0 == S0.e) {
            u0 = this.a;
            u0.c = true;
        } else if (s0 == S0.f) {
            U0 u05 = this.a;
            if (u05.d == 1) {
                u05.i.nativeFocusChanged(false);
            }
            this.a.d = 2;
        } else if (s0 == S0.g) {
            u0 = this.a;
            u0.d = 3;
        } else if (s0 == S0.i) {
            UnityPlayer unityPlayer2 = this.a.i;
            unityPlayer2.nativeSetLaunchURL(unityPlayer2.getLaunchURL());
        } else if (s0 == S0.j) {
            U0 u06 = this.a;
            u06.i.nativeOrientationChanged(u06.f, u06.g);
        }
        U0 u07 = this.a;
        if (u07.b && u07.e <= 0) {
            Message.obtain(u07.a, 2269, s02).sendToTarget();
            this.a.e++;
        }
        return true;
    }
}
