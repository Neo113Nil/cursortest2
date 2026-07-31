package com.sglib.easymobile.androidnative.media;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.media.listeners.IMediaCollectedListener;
import com.unity3d.player.UnityPlayer;
import java.util.Dictionary;
import java.util.Hashtable;

/* loaded from: classes6.dex */
public class DeviceCamera {
    public static final String CAMERA_TYPE_KEY = "CAMERA_TYPE";
    public static final String REQUEST_CODE_KEY = "REQUEST_CODE";
    public static final String VIDEO_REQUEST_KEY = "VIDEO_REQUEST";
    public static Dictionary<String, IMediaCollectedListener> takePictureResponseDictionary = new Hashtable();
    public static Dictionary<String, IMediaCollectedListener> recordVideoResponseDictionary = new Hashtable();
    private static int mRequestCode = 0;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public boolean isCameraAvailable(int i) {
        return isCameraAvailable(CameraType.fromInt(i));
    }

    public void takePicture(int i, IMediaCollectedListener iMediaCollectedListener) {
        takePicture(CameraType.fromInt(i), iMediaCollectedListener);
    }

    public void recordVideo(int i, IMediaCollectedListener iMediaCollectedListener) {
        recordVideo(CameraType.fromInt(i), iMediaCollectedListener);
    }

    public boolean isCameraAvailable(CameraType cameraType) {
        return isCameraAvailableCamera2Api(cameraType);
    }

    public void takePicture(CameraType cameraType, IMediaCollectedListener iMediaCollectedListener) {
        Intent intent = new Intent(UnityPlayer.currentActivity, (Class<?>) CameraActivity.class);
        int i = mRequestCode + 1;
        mRequestCode = i;
        takePictureResponseDictionary.put(String.valueOf(i), iMediaCollectedListener);
        intent.putExtra(VIDEO_REQUEST_KEY, false);
        intent.putExtra(REQUEST_CODE_KEY, String.valueOf(mRequestCode));
        intent.putExtra(CAMERA_TYPE_KEY, cameraType.getValue());
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, intent);
    }

    public void recordVideo(CameraType cameraType, IMediaCollectedListener iMediaCollectedListener) {
        Intent intent = new Intent(UnityPlayer.currentActivity, (Class<?>) CameraActivity.class);
        int i = mRequestCode + 1;
        mRequestCode = i;
        recordVideoResponseDictionary.put(String.valueOf(i), iMediaCollectedListener);
        intent.putExtra(VIDEO_REQUEST_KEY, true);
        intent.putExtra(REQUEST_CODE_KEY, String.valueOf(mRequestCode));
        intent.putExtra(CAMERA_TYPE_KEY, cameraType.getValue());
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, intent);
    }

    private boolean isCameraAvailableCameraApi(CameraType cameraType) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = cameraType == CameraType.Front ? 1 : 0;
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    private boolean isCameraAvailableCamera2Api(CameraType cameraType) {
        try {
            for (String str : ((CameraManager) UnityPlayer.currentActivity.getSystemService("camera")).getCameraIdList()) {
                if (str.equals(cameraType == CameraType.Front ? "1" : "0")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
