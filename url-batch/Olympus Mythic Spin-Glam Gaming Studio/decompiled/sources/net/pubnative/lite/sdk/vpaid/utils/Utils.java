package net.pubnative.lite.sdk.vpaid.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.ContentInfo;
import net.pubnative.lite.sdk.models.PositionX;
import net.pubnative.lite.sdk.models.PositionY;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.models.vast.Icon;
import net.pubnative.lite.sdk.vpaid.models.vast.IconClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.IconViewTracking;

/* loaded from: classes12.dex */
public class Utils {
    private static final String TAG = "Utils";
    private static boolean debugMode = true;

    public enum StretchOption {
        NONE,
        STRETCH,
        NO_STRETCH
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
    
        if (r3 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r0 = (r4 * 100.0f) / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r3 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (r3 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r3 != 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FrameLayout.LayoutParams calculateNewLayoutParams(FrameLayout.LayoutParams layoutParams, int i, int i2, int i3, int i4, StretchOption stretchOption) {
        int i5;
        int i6;
        layoutParams.gravity = 17;
        float f = 0.0f;
        if (i == i2) {
            if (i3 == i4) {
                layoutParams.width = i3;
                layoutParams.height = i4;
            } else if (i3 > i4) {
                layoutParams.height = i4;
                i5 = (int) ((i / i2) * i4);
                layoutParams.width = i5;
                i6 = i3 - i5;
            } else {
                layoutParams.width = i3;
                i5 = (int) ((i2 / i) * i3);
                layoutParams.height = i5;
                i6 = i4 - i5;
            }
        } else if (i > i2) {
            layoutParams.width = i3;
            float f2 = i2 / i;
            float f3 = i3;
            int i7 = (int) (f2 * f3);
            layoutParams.height = i7;
            if (i7 > i4) {
                layoutParams.height = i4;
                layoutParams.width = (int) (f3 * (i4 / i7));
            }
            i5 = layoutParams.height;
            i6 = i4 - i5;
        } else {
            layoutParams.height = i4;
            float f4 = i / i2;
            float f5 = i4;
            int i8 = (int) (f4 * f5);
            layoutParams.width = i8;
            if (i8 > i3) {
                layoutParams.width = i3;
                layoutParams.height = (int) (f5 * (i3 / i8));
            }
            i5 = layoutParams.width;
            i6 = i3 - i5;
        }
        int ordinal = stretchOption.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                layoutParams.width = i3;
                layoutParams.height = i4;
                return layoutParams;
            }
        } else if (f < 11.0f) {
            layoutParams.width = i3;
            layoutParams.height = i4;
        }
        return layoutParams;
    }

    public static String getStringFromStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static float getSystemVolume(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return 1.0f;
        }
        return Math.round((audioManager.getStreamVolume(3) * 100.0f) / audioManager.getStreamMaxVolume(3)) / 100.0f;
    }

    public static boolean isDebug() {
        return debugMode;
    }

    public static boolean isEmulator() {
        String str = Build.MODEL;
        return str.contains("google_sdk") || str.contains("Emulator") || str.contains("Android SDK") || Build.MANUFACTURER.contains("Genymotion");
    }

    public static boolean isOnline(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            HyBid.reportException(e);
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isPhoneMuted(Context context) {
        AudioManager audioManager;
        return (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null || audioManager.getRingerMode() != 0) ? false : true;
    }

    public static Integer parseDuration(String str) {
        try {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            return Integer.valueOf(Double.valueOf(split[2]).intValue() + (Integer.parseInt(split[1]) * 60) + (parseInt * 3600));
        } catch (RuntimeException e) {
            HyBid.reportException((Exception) e);
            Logger.e(TAG, "Error while parsing ad duration");
            return null;
        }
    }

    public static int parsePercent(String str) {
        return Integer.parseInt(str.replace("%", "").trim());
    }

    public static String readAssets(AssetManager assetManager, String str) {
        return getStringFromStream(assetManager.open(str));
    }

    public static void setDebugMode(boolean z) {
        debugMode = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ContentInfo parseContentInfo(Icon icon) {
        PositionX positionX;
        PositionY positionY;
        int i;
        int i2;
        int i3;
        int i4;
        if (icon == null) {
            return null;
        }
        String str = "";
        String text = (icon.getStaticResources() == null || icon.getStaticResources().isEmpty() || TextUtils.isEmpty(icon.getStaticResources().get(0).getText())) ? "" : icon.getStaticResources().get(0).getText();
        if (icon.getIconClicks() != null && icon.getIconClicks().getIconClickThrough() != null && !TextUtils.isEmpty(icon.getIconClicks().getIconClickThrough().getText())) {
            str = icon.getIconClicks().getIconClickThrough().getText();
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (icon.getIconClicks() != null && icon.getIconClicks().getIconClickTrackingList() != null && !icon.getIconClicks().getIconClickTrackingList().isEmpty()) {
            for (IconClickTracking iconClickTracking : icon.getIconClicks().getIconClickTrackingList()) {
                if (!TextUtils.isEmpty(iconClickTracking.getText())) {
                    arrayList.add(iconClickTracking.getText());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (icon.getIconViewTrackingList() != null && !icon.getIconViewTrackingList().isEmpty()) {
            for (IconViewTracking iconViewTracking : icon.getIconViewTrackingList()) {
                if (!TextUtils.isEmpty(iconViewTracking.getText())) {
                    arrayList2.add(iconViewTracking.getText());
                }
            }
        }
        PositionX positionX2 = PositionX.LEFT;
        PositionY positionY2 = PositionY.TOP;
        if (!TextUtils.isEmpty(icon.getXPosition())) {
            String xPosition = icon.getXPosition();
            PositionX positionX3 = PositionX.RIGHT;
            if (xPosition.equals(positionX3.getValue())) {
                positionX = positionX3;
                if (!TextUtils.isEmpty(icon.getYPosition())) {
                    String yPosition = icon.getYPosition();
                    PositionY positionY3 = PositionY.BOTTOM;
                    if (yPosition.equals(positionY3.getValue())) {
                        positionY = positionY3;
                        if (!TextUtils.isEmpty(icon.getWidth()) && !TextUtils.isEmpty(icon.getHeight())) {
                            try {
                                i3 = Integer.parseInt(icon.getWidth());
                                try {
                                    i4 = Integer.parseInt(icon.getHeight());
                                } catch (RuntimeException e) {
                                    e = e;
                                    HyBid.reportException((Exception) e);
                                    i4 = -1;
                                    if (i3 != -1) {
                                    }
                                    i = -1;
                                    i2 = -1;
                                    if (TextUtils.isEmpty(text)) {
                                    }
                                }
                            } catch (RuntimeException e2) {
                                e = e2;
                                i3 = -1;
                            }
                            if (i3 != -1 && i4 != -1) {
                                i2 = i4;
                                i = i3;
                                if (TextUtils.isEmpty(text)) {
                                    return new ContentInfo(text, str2, "", i, i2, positionX, positionY, arrayList2, arrayList);
                                }
                                return null;
                            }
                        }
                        i = -1;
                        i2 = -1;
                        if (TextUtils.isEmpty(text)) {
                        }
                    }
                }
                positionY = positionY2;
                if (!TextUtils.isEmpty(icon.getWidth())) {
                    i3 = Integer.parseInt(icon.getWidth());
                    i4 = Integer.parseInt(icon.getHeight());
                    if (i3 != -1) {
                        i2 = i4;
                        i = i3;
                        if (TextUtils.isEmpty(text)) {
                        }
                    }
                }
                i = -1;
                i2 = -1;
                if (TextUtils.isEmpty(text)) {
                }
            }
        }
        positionX = positionX2;
        if (!TextUtils.isEmpty(icon.getYPosition())) {
        }
        positionY = positionY2;
        if (!TextUtils.isEmpty(icon.getWidth())) {
        }
        i = -1;
        i2 = -1;
        if (TextUtils.isEmpty(text)) {
        }
    }
}
