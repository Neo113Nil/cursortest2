package com.sglib.easymobile.androidnative.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import androidx.core.content.FileProvider;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.media.listeners.IMediaCollectedListener;
import com.unity3d.player.UnityPlayer;
import java.io.File;
import java.io.IOException;

/* loaded from: classes15.dex */
public class CameraActivity extends Activity {
    private static final String FILE_PROVIDER_AUTHORITY_SUFFIX = ".easymobile_fileprovider";
    static final int REQUEST_TAKE_PHOTO = 101;
    static final int REQUEST_VIDEO_CAPTURE = 102;
    String mCameraResponseKey = "0";
    String mCurrentPhotoPath;
    private IMediaCollectedListener mImageResponseInterface;
    private IMediaCollectedListener mVideoResponseInterface;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        CameraType fromInt = CameraType.fromInt(intent.getIntExtra(DeviceCamera.CAMERA_TYPE_KEY, 0));
        this.mCameraResponseKey = intent.getStringExtra(DeviceCamera.REQUEST_CODE_KEY);
        String stringExtra = intent.getStringExtra(DeviceCamera.REQUEST_CODE_KEY);
        if (intent.getBooleanExtra(DeviceCamera.VIDEO_REQUEST_KEY, false)) {
            this.mVideoResponseInterface = DeviceCamera.recordVideoResponseDictionary.get(stringExtra);
            dispatchTakeVideoIntent(fromInt);
        } else {
            this.mImageResponseInterface = DeviceCamera.takePictureResponseDictionary.get(stringExtra);
            dispatchTakePictureIntent(fromInt);
        }
    }

    private void dispatchTakeVideoIntent(CameraType cameraType) {
        Intent intent = setupCameraFacing(new Intent("android.media.action.VIDEO_CAPTURE"), cameraType);
        if (intent.resolveActivity(getPackageManager()) != null) {
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, 102);
        } else {
            this.mImageResponseInterface.OnNativeMediaCollected("Fail to open camera intent.", new MediaResult(MediaType.Video, null, null));
        }
    }

    private void dispatchTakePictureIntent(CameraType cameraType) {
        File file;
        Intent intent = setupCameraFacing(new Intent("android.media.action.IMAGE_CAPTURE"), cameraType);
        if (intent.resolveActivity(getPackageManager()) != null) {
            try {
                file = createImageFile();
            } catch (IOException e) {
                this.mImageResponseInterface.OnNativeMediaCollected(e.getMessage(), new MediaResult(MediaType.Image, null, null));
                file = null;
            }
            Context applicationContext = getApplicationContext();
            if (file != null) {
                intent.putExtra("output", FileProvider.getUriForFile(this, applicationContext.getPackageName() + FILE_PROVIDER_AUTHORITY_SUFFIX, file));
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, 101);
                return;
            }
            this.mImageResponseInterface.OnNativeMediaCollected("Fail to create empty image.", new MediaResult(MediaType.Image, null, null));
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 101) {
            if (i2 != -1) {
                this.mImageResponseInterface.OnNativeMediaCollected("Fail to open camera intent.", new MediaResult(MediaType.Image, null, null));
            } else {
                this.mImageResponseInterface.OnNativeMediaCollected(null, new MediaResult(MediaType.Image, null, this.mCurrentPhotoPath));
                DeviceCamera.takePictureResponseDictionary.remove(this.mCameraResponseKey);
            }
        }
        if (i == 101) {
            finish();
        }
        if (i == 102) {
            if (i2 != -1) {
                this.mVideoResponseInterface.OnNativeMediaCollected("Fail to open camera intent.", new MediaResult(MediaType.Video, null, null));
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    grantUriPermission(UnityPlayer.currentActivity.getPackageName(), data, 1);
                    this.mVideoResponseInterface.OnNativeMediaCollected(null, new MediaResult(MediaType.Video, data.toString(), Utilities.getRealPath(this, data)));
                    DeviceCamera.recordVideoResponseDictionary.remove(this.mCameraResponseKey);
                } else {
                    this.mVideoResponseInterface.OnNativeMediaCollected("No video found.", new MediaResult(MediaType.Video, null, null));
                }
            }
        }
        if (i == 102) {
            finish();
        }
    }

    private File createImageFile() throws IOException {
        getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File createTempFile = File.createTempFile("ImageTemp", BrandSafetyUtils.a, getCacheDir());
        this.mCurrentPhotoPath = createTempFile.getAbsolutePath();
        return createTempFile;
    }

    private Intent setupCameraFacing(Intent intent, CameraType cameraType) {
        CameraType cameraType2 = CameraType.Front;
        intent.putExtra("android.intent.extras.CAMERA_FACING", cameraType == cameraType2 ? 1 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append("android.intent.extras.LENS_FACING_");
        sb.append(cameraType == cameraType2 ? "FRONT" : "BACK");
        intent.putExtra(sb.toString(), 1);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", cameraType == cameraType2 ? 1 : 0);
        return intent;
    }
}
