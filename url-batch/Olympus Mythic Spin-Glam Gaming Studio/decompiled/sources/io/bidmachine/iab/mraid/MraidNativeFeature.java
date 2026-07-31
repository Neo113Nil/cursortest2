package io.bidmachine.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class MraidNativeFeature {

    @NonNull
    public static final String FEATURE_CALENDAR = "calendar";

    @NonNull
    public static final String FEATURE_INLINE_VIDEO = "inlineVideo";

    @NonNull
    public static final String FEATURE_SMS = "sms";

    @NonNull
    public static final String FEATURE_STORE_PICTURE = "storePicture";

    @NonNull
    public static final String FEATURE_TEL = "tel";
    private static final String[] a = {"sms", "tel", "inlineVideo", "calendar", "storePicture"};

    private MraidNativeFeature() {
    }

    private static ArrayList a(MraidNativeFeatureManager mraidNativeFeatureManager) {
        ArrayList arrayList = new ArrayList();
        if (mraidNativeFeatureManager.isTelFeatureAvailable()) {
            arrayList.add("tel");
        }
        if (mraidNativeFeatureManager.isSmsFeatureAvailable()) {
            arrayList.add("sms");
        }
        if (mraidNativeFeatureManager.isInlineVideoFeatureAvailable()) {
            arrayList.add("inlineVideo");
        }
        if (mraidNativeFeatureManager.isCalendarFeatureAvailable()) {
            arrayList.add("calendar");
        }
        if (mraidNativeFeatureManager.isStorePictureFeatureAvailable()) {
            arrayList.add("storePicture");
        }
        return arrayList;
    }

    @NonNull
    public static String[] getSupportedFeatures(@NonNull Context context) {
        return (String[]) a(new MraidNativeFeatureManager(context, a)).toArray(new String[0]);
    }
}
