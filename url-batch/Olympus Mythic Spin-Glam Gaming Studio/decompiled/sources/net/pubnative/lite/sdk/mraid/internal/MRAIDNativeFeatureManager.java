package net.pubnative.lite.sdk.mraid.internal;

import android.content.Context;
import java.util.ArrayList;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes5.dex */
public class MRAIDNativeFeatureManager {
    private static final String TAG = "MRAIDNativeFeatureManager";
    private final Context context;
    private final ArrayList<String> supportedNativeFeatures;

    public MRAIDNativeFeatureManager(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.supportedNativeFeatures = arrayList;
    }

    public ArrayList<String> getSupportedNativeFeatures() {
        return this.supportedNativeFeatures;
    }

    public boolean isCalendarSupported() {
        boolean z = this.supportedNativeFeatures.contains("calendar") && this.context.checkCallingOrSelfPermission("android.permission.WRITE_CALENDAR") == 0;
        MRAIDLog.d(TAG, "isCalendarSupported " + z);
        return z;
    }

    public boolean isInlineVideoSupported() {
        boolean contains = this.supportedNativeFeatures.contains("inlineVideo");
        MRAIDLog.d(TAG, "isInlineVideoSupported " + contains);
        return contains;
    }

    public boolean isLocationSupported() {
        boolean z = this.supportedNativeFeatures.contains("location") && HyBid.isLocationTrackingEnabled() && (this.context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || this.context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0);
        MRAIDLog.d(TAG, "isLocationSupported " + z);
        return z;
    }

    public boolean isSmsSupported() {
        boolean z = this.supportedNativeFeatures.contains("sms") && this.context.checkCallingOrSelfPermission("android.permission.SEND_SMS") == 0;
        MRAIDLog.d(TAG, "isSmsSupported " + z);
        return z;
    }

    public boolean isStorePictureSupported() {
        boolean contains = this.supportedNativeFeatures.contains("storePicture");
        MRAIDLog.d(TAG, "isStorePictureSupported " + contains);
        return contains;
    }

    public boolean isTelSupported() {
        boolean z = this.supportedNativeFeatures.contains("tel") && this.context.checkCallingOrSelfPermission("android.permission.CALL_PHONE") == 0;
        MRAIDLog.d(TAG, "isTelSupported " + z);
        return z;
    }
}
