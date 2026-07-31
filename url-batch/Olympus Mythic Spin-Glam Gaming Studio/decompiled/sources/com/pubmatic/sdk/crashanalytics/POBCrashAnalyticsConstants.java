package com.pubmatic.sdk.crashanalytics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/pubmatic/sdk/crashanalytics/POBCrashAnalyticsConstants;", "", "()V", "AD_SESSIONS_KEY", "", "ANR_FULL_FORM", "ANR_TIMESTAMP_FILE", "ANR_TIMESTAMP_KEY", "APPLICATION_INFO_KEY", "BUNDLE_KEY", "CONNECTION_TYPE_KEY", "CRASHES_KEY", "CRASH_DATA_FILE", "CRASH_INFO_KEY", "CRASH_THRESHOLD", "", "DEVICE_INFO_KEY", "DEVICE_TYPE_KEY", "MAKE_KEY", "MODEL_KEY", "NAME_KEY", "NETWORK_TIMEOUT", "OS_KEY", "OS_NAME", "OS_VERSION_KEY", "OW_FILTER", "OW_SDK_VERSION_KEY", "PUBLISHER_ID_KEY", "REPORT_SERVER_URL", "RETRY_COUNT", "STACKTRACE_KEY", "TIMESTAMP_KEY", "VERSION_KEY", "crashanalytics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class POBCrashAnalyticsConstants {

    @NotNull
    public static final String AD_SESSIONS_KEY = "adSessions";

    @NotNull
    public static final String ANR_FULL_FORM = "Application Not Responding";

    @NotNull
    public static final String ANR_TIMESTAMP_FILE = "pob_anr.json";

    @NotNull
    public static final String ANR_TIMESTAMP_KEY = "POBLastSyncedANRTimeStamp";

    @NotNull
    public static final String APPLICATION_INFO_KEY = "applicationInfo";

    @NotNull
    public static final String BUNDLE_KEY = "bndl";

    @NotNull
    public static final String CONNECTION_TYPE_KEY = "con";

    @NotNull
    public static final String CRASHES_KEY = "crashes";

    @NotNull
    public static final String CRASH_DATA_FILE = "POBCrash.txt";

    @NotNull
    public static final String CRASH_INFO_KEY = "crashInfo";
    public static final int CRASH_THRESHOLD = 10;

    @NotNull
    public static final String DEVICE_INFO_KEY = "deviceInfo";

    @NotNull
    public static final String DEVICE_TYPE_KEY = "type";

    @NotNull
    public static final POBCrashAnalyticsConstants INSTANCE = new POBCrashAnalyticsConstants();

    @NotNull
    public static final String MAKE_KEY = "make";

    @NotNull
    public static final String MODEL_KEY = "model";

    @NotNull
    public static final String NAME_KEY = "name";
    public static final int NETWORK_TIMEOUT = 5000;

    @NotNull
    public static final String OS_KEY = "os";

    @NotNull
    public static final String OS_NAME = "Android";

    @NotNull
    public static final String OS_VERSION_KEY = "osv";

    @NotNull
    public static final String OW_FILTER = "com.pubmatic.sdk";

    @NotNull
    public static final String OW_SDK_VERSION_KEY = "owsdkver";

    @NotNull
    public static final String PUBLISHER_ID_KEY = "pubid";

    @NotNull
    public static final String REPORT_SERVER_URL = "https://owsdk.pubmatic.com/crashanalytics";
    public static final int RETRY_COUNT = 3;

    @NotNull
    public static final String STACKTRACE_KEY = "st";

    @NotNull
    public static final String TIMESTAMP_KEY = "timestamp";

    @NotNull
    public static final String VERSION_KEY = "ver";

    private POBCrashAnalyticsConstants() {
    }
}
