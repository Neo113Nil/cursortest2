package com.unity3d.player;

import android.hardware.camera2.CameraDevice;
import com.unity3d.player.a.AbstractC0120t;

/* renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140k extends CameraDevice.StateCallback {
    public final /* synthetic */ C0148o a;

    public C0140k(C0148o c0148o) {
        this.a = c0148o;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.a.b = cameraDevice;
        C0148o.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C0148o.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        AbstractC0120t.Log(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
        C0148o.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        AbstractC0120t.Log(6, "Camera2: Error opening CameraDevice " + i);
        this.a.a(cameraDevice);
        C0148o.D.release();
    }
}
