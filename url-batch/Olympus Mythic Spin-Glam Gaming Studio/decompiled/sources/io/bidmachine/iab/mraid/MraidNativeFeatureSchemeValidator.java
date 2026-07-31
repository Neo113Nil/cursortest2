package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class MraidNativeFeatureSchemeValidator {

    @NonNull
    public static final String SCHEME_CALENDAR = "calendar";

    @NonNull
    public static final String SCHEME_SMS = "sms";

    @NonNull
    public static final String SCHEME_STORE_PICTURE = "storePicture";

    @NonNull
    public static final String SCHEME_TEL = "tel";
    private final MraidNativeFeatureManager a;

    MraidNativeFeatureSchemeValidator(MraidNativeFeatureManager mraidNativeFeatureManager) {
        this.a = mraidNativeFeatureManager;
    }

    boolean a(String str) {
        if (str == null) {
            return true;
        }
        if (str.startsWith("sms")) {
            return this.a.isSmsFeatureAvailable();
        }
        if (str.startsWith("tel")) {
            return this.a.isTelFeatureAvailable();
        }
        if (str.startsWith("calendar")) {
            return this.a.isCalendarFeatureAvailable();
        }
        if (str.startsWith("storePicture")) {
            return this.a.isStorePictureFeatureAvailable();
        }
        return true;
    }
}
