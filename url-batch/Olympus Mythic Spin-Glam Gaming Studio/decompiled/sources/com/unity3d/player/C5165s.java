package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;

/* renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5165s extends CameraCaptureSession.StateCallback {
    final /* synthetic */ C5173w a;

    C5165s(C5173w c5173w) {
        this.a = c5173w;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        AbstractC5179z.Log(6, "Camera2: CaptureSession configuration failed.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraDevice cameraDevice;
        Object obj;
        String str;
        CameraDevice cameraDevice2;
        CaptureRequest.Builder builder;
        Surface surface;
        CaptureRequest.Builder builder2;
        Range range;
        C5173w c5173w = this.a;
        cameraDevice = c5173w.b;
        if (cameraDevice == null) {
            return;
        }
        obj = c5173w.s;
        synchronized (obj) {
            C5173w c5173w2 = this.a;
            c5173w2.r = cameraCaptureSession;
            try {
                try {
                    cameraDevice2 = c5173w2.b;
                    c5173w2.q = cameraDevice2.createCaptureRequest(1);
                    C5173w c5173w3 = this.a;
                    builder = c5173w3.q;
                    surface = c5173w3.v;
                    builder.addTarget(surface);
                    C5173w c5173w4 = this.a;
                    builder2 = c5173w4.q;
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    range = c5173w4.n;
                    builder2.set(key, range);
                    this.a.g();
                } catch (CameraAccessException e) {
                    str = "Camera2: CameraAccessException " + e;
                    AbstractC5179z.Log(6, str);
                }
            } catch (IllegalStateException e2) {
                str = "Camera2: IllegalStateException " + e2;
                AbstractC5179z.Log(6, str);
            }
        }
    }
}
