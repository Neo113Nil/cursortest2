package com.sglib.easymobile.androidnative.media;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.AppUtil;
import com.sglib.easymobile.androidnative.Helper;
import com.sglib.easymobile.androidnative.media.listeners.ILoadImageListener;
import com.sglib.easymobile.androidnative.media.listeners.IPickFromGalleryListener;
import com.sglib.easymobile.androidnative.media.listeners.ISaveImageListener;
import com.unity3d.player.UnityPlayer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Dictionary;
import java.util.Hashtable;

/* loaded from: classes12.dex */
public class DeviceGallery {
    public static final String EXTRA_ALLOW_MULTI_SELECT_KEY = "EXTRA_ALLOW_MULTI_SELECT";
    public static final String EXTRA_RESPONSE_KEY = "EXTRA_RESPONSE";
    public static Dictionary<String, IPickFromGalleryListener> PickImgFromGalleryListeners = new Hashtable();
    private static int responseKey;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public boolean CheckExternalWritePermission() {
        return ContextCompat.checkSelfPermission(UnityPlayer.currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0;
    }

    public void RequestExternalStorageWritePermission() {
        ActivityCompat.requestPermissions(UnityPlayer.currentActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 402);
    }

    public void saveImage(Bitmap bitmap, String str, ImageFormat imageFormat, ISaveImageListener iSaveImageListener, boolean z, String str2) {
        if (!z) {
            if (ContextCompat.checkSelfPermission(UnityPlayer.currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                ActivityCompat.requestPermissions(UnityPlayer.currentActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 402);
                iSaveImageListener.OnNativeImageSaved("Permission hasn't been granted yet.", null);
                return;
            } else if (!isExternalStorageReadable()) {
                iSaveImageListener.OnNativeImageSaved("External storage isn't readable.", null);
                return;
            } else if (!isExternalStorageWritable()) {
                iSaveImageListener.OnNativeImageSaved("External storage isn't writable.", null);
                return;
            }
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = AppUtil.GetApplicationName(UnityPlayer.currentActivity);
        }
        String str3 = str2;
        if (Build.VERSION.SDK_INT >= 29) {
            ContentResolverImageSaving(bitmap, str, imageFormat, iSaveImageListener, z, str3);
        } else {
            LegacyImageSaving(bitmap, str, imageFormat, iSaveImageListener, z, str3);
        }
    }

    private void ContentResolverImageSaving(Bitmap bitmap, String str, ImageFormat imageFormat, ISaveImageListener iSaveImageListener, boolean z, String str2) throws UnsupportedOperationException {
        Uri contentUri;
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("This method only works from android 29");
        }
        ContentResolver contentResolver = UnityPlayer.currentActivity.getContentResolver();
        if (z) {
            contentUri = MediaStore.Images.Media.getContentUri(RedirectEvent.i);
        } else {
            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("_display_name", str);
        int i = AnonymousClass1.$SwitchMap$com$sglib$easymobile$androidnative$media$ImageFormat[imageFormat.ordinal()];
        if (i == 1) {
            contentValues.put("mime_type", "image/jpeg");
        } else if (i == 2) {
            contentValues.put("mime_type", "image/png");
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        contentValues.put("date_added", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + str2);
        try {
            Uri insert = contentResolver.insert(contentUri, contentValues);
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            WriteImageToOutputStream(bitmap, imageFormat, openOutputStream);
            openOutputStream.close();
            iSaveImageListener.OnNativeImageSaved(null, AppUtil.GetRealPathFromURI(insert));
        } catch (IOException e) {
            iSaveImageListener.OnNativeImageSaved(e.getMessage(), null);
        } catch (Exception e2) {
            iSaveImageListener.OnNativeImageSaved(e2.getMessage(), null);
        }
    }

    /* renamed from: com.sglib.easymobile.androidnative.media.DeviceGallery$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$sglib$easymobile$androidnative$media$ImageFormat;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            $SwitchMap$com$sglib$easymobile$androidnative$media$ImageFormat = iArr;
            try {
                iArr[ImageFormat.JPG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sglib$easymobile$androidnative$media$ImageFormat[ImageFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void LegacyImageSaving(Bitmap bitmap, String str, ImageFormat imageFormat, ISaveImageListener iSaveImageListener, boolean z, String str2) {
        File file;
        if (z) {
            file = UnityPlayer.currentActivity.getFilesDir();
        } else {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str2);
            if (!file.exists() && !file.mkdirs()) {
                iSaveImageListener.OnNativeImageSaved("Can not create directory:: " + file.toString(), null);
                return;
            }
        }
        try {
            File file2 = new File(file, str + "." + imageFormat.name());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            WriteImageToOutputStream(bitmap, imageFormat, fileOutputStream);
            fileOutputStream.close();
            galleryAddPic(Uri.fromFile(file2));
            iSaveImageListener.OnNativeImageSaved(null, file2.getAbsolutePath());
        } catch (FileNotFoundException e) {
            iSaveImageListener.OnNativeImageSaved(e.getMessage(), null);
        } catch (IOException e2) {
            iSaveImageListener.OnNativeImageSaved(e2.getMessage(), null);
        } catch (Exception e3) {
            iSaveImageListener.OnNativeImageSaved(e3.getMessage(), null);
        }
    }

    private void WriteImageToOutputStream(Bitmap bitmap, ImageFormat imageFormat, OutputStream outputStream) {
        int i = AnonymousClass1.$SwitchMap$com$sglib$easymobile$androidnative$media$ImageFormat[imageFormat.ordinal()];
        if (i == 1) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
        } else {
            if (i != 2) {
                return;
            }
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
        }
    }

    @Deprecated
    public void saveImage(Bitmap bitmap, String str, ImageFormat imageFormat, ISaveImageListener iSaveImageListener, String str2) {
        saveImage(bitmap, str, imageFormat, iSaveImageListener, false, str2);
    }

    public boolean isExternalStorageWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean isExternalStorageReadable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    private void galleryAddPic(Uri uri) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        UnityPlayer.currentActivity.sendBroadcast(intent);
    }

    public void pick(boolean z, IPickFromGalleryListener iPickFromGalleryListener) {
        Intent intent = new Intent(UnityPlayer.currentActivity, (Class<?>) GalleryActivity.class);
        intent.putExtra(EXTRA_ALLOW_MULTI_SELECT_KEY, z);
        int i = responseKey + 1;
        responseKey = i;
        PickImgFromGalleryListeners.put(String.valueOf(i), iPickFromGalleryListener);
        intent.putExtra(EXTRA_RESPONSE_KEY, String.valueOf(responseKey));
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, intent);
    }

    public void saveImage(String str, String str2, int i, ISaveImageListener iSaveImageListener, boolean z, String str3) {
        saveImage(Utilities.decodeBase64(str), str2, ImageFormat.fromInt(i), iSaveImageListener, z, str3);
    }

    public void loadImageFromContentUri(String str, ILoadImageListener iLoadImageListener) {
        try {
            iLoadImageListener.OnNativeImageLoaded(null, Utilities.bitmapToByteArray(LoadFullSizeImage(str, null)));
        } catch (Exception e) {
            iLoadImageListener.OnNativeImageLoaded(e.getMessage(), null);
        }
    }

    public void loadImageFromContentUri(String str, int i, ILoadImageListener iLoadImageListener) {
        try {
            iLoadImageListener.OnNativeImageLoaded(null, Utilities.bitmapToByteArray(LoadThumbnailImage(str, null, i)));
        } catch (Exception e) {
            iLoadImageListener.OnNativeImageLoaded(e.getMessage(), null);
        }
    }

    public void loadImageFromAbsoluteUri(String str, ILoadImageListener iLoadImageListener) {
        try {
            iLoadImageListener.OnNativeImageLoaded(null, Utilities.bitmapToByteArray(LoadFullSizeImage(null, str)));
        } catch (Exception e) {
            iLoadImageListener.OnNativeImageLoaded(e.getMessage(), null);
        }
    }

    public void loadImageFromAbsoluteUri(String str, int i, ILoadImageListener iLoadImageListener) {
        try {
            iLoadImageListener.OnNativeImageLoaded(null, Utilities.bitmapToByteArray(LoadThumbnailImage(null, str, i)));
        } catch (Exception e) {
            iLoadImageListener.OnNativeImageLoaded(e.getMessage(), null);
        }
    }

    public static Bitmap LoadThumbnailImage(String str, String str2, int i) throws FileNotFoundException {
        Bitmap LoadFullSizeImage = LoadFullSizeImage(str, str2);
        if (LoadFullSizeImage == null) {
            return null;
        }
        float max = i / Math.max(LoadFullSizeImage.getHeight(), LoadFullSizeImage.getWidth());
        return ThumbnailUtils.extractThumbnail(LoadFullSizeImage, (int) (LoadFullSizeImage.getWidth() * max), (int) (LoadFullSizeImage.getHeight() * max));
    }

    public static Bitmap LoadFullSizeImage(String str, String str2) throws FileNotFoundException {
        if (!Helper.IsNullOrEmptyString(str)) {
            return LoadFullSizeImageFromContentUri(str);
        }
        if (Helper.IsNullOrEmptyString(str2)) {
            return null;
        }
        return LoadFullSizeImageFromAbsolutePath(str2);
    }

    public static void DeleteTemporaryImage(String str) {
        File file = new File(str);
        if (file.exists() && str.endsWith(".tmp")) {
            file.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap LoadFullSizeImageFromAbsolutePath(String str) {
        ExifInterface exifInterface;
        IOException e;
        int i = 0;
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException e2) {
            exifInterface = null;
            e = e2;
        }
        try {
            i = exifInterface.getAttributeInt("Orientation", 0);
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            if (exifInterface == null) {
            }
        }
        if (exifInterface == null) {
            return rotateBitmap(BitmapFactory.decodeFile(str), i);
        }
        return BitmapFactory.decodeFile(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap LoadFullSizeImageFromContentUri(String str) throws FileNotFoundException {
        int i;
        ExifInterface exifInterface;
        InputStream openInputStream = UnityPlayer.currentActivity.getContentResolver().openInputStream(Uri.parse(str));
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
        ExifInterface exifInterface2 = null;
        try {
            exifInterface = new ExifInterface(openInputStream);
        } catch (IOException e) {
            e = e;
        }
        try {
            i = exifInterface.getAttributeInt("Orientation", 1);
        } catch (IOException e2) {
            e = e2;
            exifInterface2 = exifInterface;
            e.printStackTrace();
            i = 0;
            exifInterface = exifInterface2;
            if (exifInterface == null) {
            }
        }
        return exifInterface == null ? rotateBitmap(decodeStream, i) : decodeStream;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }
}
