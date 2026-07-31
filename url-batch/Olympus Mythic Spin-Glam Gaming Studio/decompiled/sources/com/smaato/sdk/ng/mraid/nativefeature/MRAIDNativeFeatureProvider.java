package com.smaato.sdk.ng.mraid.nativefeature;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.SmaatoFilesBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.mraid.internal.MRAIDLog;
import com.smaato.sdk.ng.mraid.internal.MRAIDNativeFeatureManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class MRAIDNativeFeatureProvider {
    public static final String ACTION_HANDLE_CUSTOM_EVENT = "android.provider.calendar.action.HANDLE_CUSTOM_EVENT";
    public static final String AUTHORITY = "com.android.calendar";
    public static final String DESCRIPTION = "description";
    public static final String DISPLAY_COLOR = "displayColor";
    public static final String EVENT_COLOR = "eventColor";
    public static final String EVENT_COLOR_KEY = "eventColor_index";
    public static final String EVENT_LOCATION = "eventLocation";
    public static final String EXTRA_CUSTOM_APP_URI = "customAppUri";
    public static final String EXTRA_EVENT_ALL_DAY = "allDay";
    public static final String EXTRA_EVENT_BEGIN_TIME = "beginTime";
    public static final String EXTRA_EVENT_END_TIME = "endTime";
    public static final String STATUS = "eventStatus";
    private static final String TAG = "MRAIDNativeFeatureProvider";
    public static final String TITLE = "title";
    private final Context context;
    private final MRAIDNativeFeatureManager nativeFeatureManager;

    public MRAIDNativeFeatureProvider(Context context, MRAIDNativeFeatureManager mRAIDNativeFeatureManager) {
        this.context = context;
        this.nativeFeatureManager = mRAIDNativeFeatureManager;
    }

    private void copyStream(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
        } catch (Exception e) {
            MRAIDLog.i(TAG, "Error saving picture: " + e.getLocalizedMessage());
        }
    }

    private File getAlbumDir() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            MRAIDLog.i(TAG, "External storage is not mounted READ/WRITE.");
            return null;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Image");
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        MRAIDLog.i(TAG, "Failed to create camera directory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$storePicture$0(String str) {
        try {
            storePictureInGallery(str);
        } catch (Exception e) {
            MRAIDLog.e(TAG, e.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$storePictureInGallery$1(String str, Uri uri) {
        MRAIDLog.d("File saves successfully to " + str);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    @SuppressLint({"SimpleDateFormat"})
    private void storePictureInGallery(String str) {
        String str2 = getAlbumDir() + "/img" + new SimpleDateFormat("yyyy-MM-dd-HHmmss").format(new Date()) + ".png";
        String str3 = TAG;
        MRAIDLog.i(str3, "Saving image into: " + str2);
        File file = new File(str2);
        try {
            copyStream(new URL(str).openStream(), SmaatoFilesBridge.fileOutputStreamCtor(file));
            MediaScannerConnection.scanFile(this.context, new String[]{file.getAbsolutePath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.smaato.sdk.ng.mraid.nativefeature.MRAIDNativeFeatureProvider$$ExternalSyntheticLambda1
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str4, Uri uri) {
                    MRAIDNativeFeatureProvider.lambda$storePictureInGallery$1(str4, uri);
                }
            });
            MRAIDLog.i(str3, "Saved image successfully");
        } catch (MalformedURLException e) {
            MRAIDLog.e(TAG, "Not able to save image due to invalid URL: " + e.getLocalizedMessage());
        } catch (IOException e2) {
            MRAIDLog.e(TAG, "Unable to save image: " + e2.getLocalizedMessage());
        }
    }

    public final void callTel(String str) {
        if (this.nativeFeatureManager.isTelSupported()) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, new Intent("android.intent.action.DIAL", Uri.parse(str)));
        }
    }

    public void createCalendarEvent(String str) {
        if (this.nativeFeatureManager.isCalendarSupported()) {
            try {
                JSONObject jSONObject = new JSONObject(str.replace("\\", "").replace("\"{", "{").replace("}\"", "}"));
                String optString = jSONObject.optString("description", "Untitled");
                String optString2 = jSONObject.optString("location", "unknown");
                String optString3 = jSONObject.optString("summary");
                String[] strArr = {"yyyy-MM-dd'T'HH:mmZ", "yyyy-MM-dd'T'HH:mm:ssZ"};
                String[] strArr2 = new String[2];
                strArr2[0] = jSONObject.getString("start");
                strArr2[1] = jSONObject.optString("end");
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < 2; i++) {
                    if (!TextUtils.isEmpty(strArr2[i])) {
                        strArr2[i] = strArr2[i].replaceAll("([+-]\\d\\d):(\\d\\d)$", "$1$2");
                        int i2 = 0;
                        while (true) {
                            if (i2 < 2) {
                                try {
                                    Date parse = new SimpleDateFormat(strArr[i2], Locale.US).parse(strArr2[i]);
                                    if (parse != null) {
                                        if (i == 0) {
                                            j = parse.getTime();
                                        } else {
                                            j2 = parse.getTime();
                                        }
                                    }
                                } catch (ParseException unused) {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
                type.putExtra("title", optString);
                type.putExtra("description", optString3);
                type.putExtra("eventLocation", optString2);
                if (j > 0) {
                    type.putExtra("beginTime", j);
                }
                long j3 = j2;
                if (j3 > 0) {
                    type.putExtra("endTime", j3);
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, type);
            } catch (JSONException e) {
                MRAIDLog.e(TAG, "Error parsing JSON: " + e.getLocalizedMessage());
            }
        }
    }

    public void openBrowser(String str) {
        if (str.startsWith("market:")) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } else if (str.startsWith("http:") || str.startsWith("https:")) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public void playVideo(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "video/*");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, intent);
    }

    public void sendSms(String str) {
        if (this.nativeFeatureManager.isSmsSupported()) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, new Intent("android.intent.action.SENDTO", Uri.parse(str)));
        }
    }

    public void storePicture(final String str) {
        if (this.nativeFeatureManager.isStorePictureSupported()) {
            new Thread(new Runnable() { // from class: com.smaato.sdk.ng.mraid.nativefeature.MRAIDNativeFeatureProvider$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDNativeFeatureProvider.this.lambda$storePicture$0(str);
                }
            }).start();
        }
    }
}
