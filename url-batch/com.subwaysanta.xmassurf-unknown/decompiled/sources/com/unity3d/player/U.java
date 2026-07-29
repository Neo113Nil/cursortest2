package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class U implements Handler.Callback {
    public final /* synthetic */ W a;

    public U(W w) {
        this.a = w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        if (r6.a.e != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
    
        if (r6.a.e == false) goto L67;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        if (message.what != 2269) {
            return false;
        }
        V v = (V) message.obj;
        V v2 = V.h;
        if (v == v2) {
            W w = this.a;
            w.g--;
            w.a.executeMainThreadJobs();
            W w2 = this.a;
            if (!w2.d) {
                return true;
            }
            if (w2.a.getHaveAndroidWindowSupport() && !this.a.e) {
                return true;
            }
            W w3 = this.a;
            int i = w3.j;
            if (i >= 0) {
                if (i == 0) {
                    if (w3.a.getSplashEnabled()) {
                        this.a.a.disableStaticSplashScreen();
                    }
                    if (this.a.a.shouldReportFullyDrawn()) {
                        this.a.a.reportFullyDrawn();
                    }
                }
                this.a.j--;
            }
            if (!this.a.a.isFinishing() && !this.a.a.nativeRender()) {
                this.a.a.finish();
            }
        } else if (v == V.c) {
            Looper.myLooper().quit();
        } else if (v == V.b) {
            this.a.d = true;
        } else if (v == V.a) {
            this.a.d = false;
        } else if (v == V.d) {
            this.a.e = false;
        } else if (v == V.e) {
            W w4 = this.a;
            w4.e = true;
            if (w4.f == 3) {
                if (w4.a.getHaveAndroidWindowSupport()) {
                }
                this.a.a.nativeFocusChanged(true);
                this.a.f = 1;
            }
        } else if (v == V.f) {
            W w5 = this.a;
            if (w5.f == 1) {
                w5.a.nativeFocusChanged(false);
            }
            this.a.f = 2;
        } else if (v == V.g) {
            W w6 = this.a;
            w6.f = 3;
            if (w6.a.getHaveAndroidWindowSupport()) {
            }
            this.a.a.nativeFocusChanged(true);
            this.a.f = 1;
        } else if (v == V.i) {
            W w7 = this.a;
            w7.a.nativeOrientationChanged(w7.h, w7.i);
        }
        W w8 = this.a;
        if (w8.d && w8.g <= 0) {
            Message.obtain(w8.c, 2269, v2).sendToTarget();
            this.a.g++;
        }
        return true;
    }
}
