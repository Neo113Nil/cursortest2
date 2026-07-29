package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.unity3d.player.a.AbstractC0120t;

/* renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138j extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C0148o a;

    public C0138j(C0148o c0148o) {
        this.a = c0148o;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0148o c0148o = this.a;
        if (c0148o.b == null) {
            return;
        }
        synchronized (c0148o.t) {
            C0148o c0148o2 = this.a;
            c0148o2.r = cameraCaptureSession;
            try {
                c0148o2.q = c0148o2.b.createCaptureRequest(1);
                C0148o c0148o3 = this.a;
                c0148o3.q.addTarget(c0148o3.w);
                C0148o c0148o4 = this.a;
                c0148o4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0148o4.n);
                this.a.e();
            } catch (CameraAccessException e) {
                AbstractC0120t.Log(6, "Camera2: CameraAccessException " + e);
            } catch (IllegalStateException e2) {
                AbstractC0120t.Log(6, "Camera2: IllegalStateException " + e2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.A = 3;
        AbstractC0120t.Log(6, "Camera2: CaptureSession configuration failed.");
    }
}
