package com.pgl.ssdk;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* loaded from: classes3.dex */
public class x {
    public static int a = -1;

    public static int a(Context context) {
        int i = a;
        if (i != -1) {
            return i;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                a = -1;
            }
        } else {
            a = -2;
        }
        return a;
    }
}
