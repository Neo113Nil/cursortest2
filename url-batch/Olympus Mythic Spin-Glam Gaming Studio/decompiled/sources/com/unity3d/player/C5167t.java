package com.unity3d.player;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5167t extends CameraDevice.StateCallback {
    final /* synthetic */ C5173w a;

    C5167t(C5173w c5173w) {
        this.a = c5173w;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Semaphore semaphore;
        semaphore = C5173w.D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Semaphore semaphore;
        AbstractC5179z.Log(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
        semaphore = C5173w.D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        Semaphore semaphore;
        AbstractC5179z.Log(6, "Camera2: Error opeining CameraDevice " + i);
        this.a.a(cameraDevice);
        semaphore = C5173w.D;
        semaphore.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Semaphore semaphore;
        this.a.b = cameraDevice;
        semaphore = C5173w.D;
        semaphore.release();
    }
}
