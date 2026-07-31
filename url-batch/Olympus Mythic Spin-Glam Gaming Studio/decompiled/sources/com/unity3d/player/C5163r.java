package com.unity3d.player;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5163r extends CameraCaptureSession.CaptureCallback {
    final /* synthetic */ C5173w a;

    C5163r(C5173w c5173w) {
        this.a = c5173w;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.a.a(captureRequest.getTag());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        AbstractC5179z.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
        this.a.a(captureRequest.getTag());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
    }
}
