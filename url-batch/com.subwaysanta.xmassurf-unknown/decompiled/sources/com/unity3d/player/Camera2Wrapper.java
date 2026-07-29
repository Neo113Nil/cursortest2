package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraManager;
import android.view.Surface;
import com.unity3d.player.a.AbstractC0120t;
import com.unity3d.player.a.C0115n;
import com.unity3d.player.a.InterfaceC0118q;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class Camera2Wrapper implements InterfaceC0118q {
    public final Context a;
    public C0148o b = null;

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    public int getCamera2Count() {
        return C0148o.getCameraIds(this.a).length;
    }

    public int getCamera2SensorOrientation(int i) {
        return C0148o.c(this.a, i);
    }

    public boolean isCamera2FrontFacing(int i) {
        return C0148o.e(this.a, i);
    }

    public int getCamera2FocalLengthEquivalent(int i) {
        return C0148o.a(this.a, i);
    }

    public int[] getCamera2Resolutions(int i) {
        return C0148o.b(this.a, i);
    }

    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        C0148o c0148o;
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        CameraManager cameraManager = C0148o.B;
        if (PlatformSupport.QUINCE_TART_SUPPORT) {
            c0148o = new C0115n(this);
        } else {
            c0148o = new C0148o(this);
        }
        C0148o c0148o2 = c0148o;
        this.b = c0148o2;
        return c0148o2.a(this.a, i, i2, i3, i4, i5, surface);
    }

    public boolean isCamera2AutoFocusPointSupported(int i) {
        return C0148o.d(this.a, i);
    }

    public boolean setAutoFocusPoint(float f, float f2) {
        C0148o c0148o = this.b;
        if (c0148o != null && c0148o.h > 0) {
            if (!c0148o.m) {
                c0148o.i = f;
                c0148o.j = f2;
                synchronized (c0148o.t) {
                    if (c0148o.r != null && c0148o.A != 2) {
                        c0148o.d();
                    }
                }
                return true;
            }
            AbstractC0120t.Log(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public Rect getFrameSizeCamera2() {
        C0148o c0148o = this.b;
        if (c0148o == null) {
            return new Rect();
        }
        return c0148o.e;
    }

    public void closeCamera2() {
        C0148o c0148o = this.b;
        if (c0148o != null) {
            c0148o.a();
        }
        this.b = null;
    }

    public void startCamera2() {
        C0148o c0148o = this.b;
        if (c0148o != null) {
            c0148o.f();
        }
    }

    public void pauseCamera2() {
        C0148o c0148o = this.b;
        if (c0148o != null) {
            c0148o.c();
        }
    }

    public void stopCamera2() {
        C0148o c0148o = this.b;
        if (c0148o != null) {
            c0148o.g();
        }
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }
}
