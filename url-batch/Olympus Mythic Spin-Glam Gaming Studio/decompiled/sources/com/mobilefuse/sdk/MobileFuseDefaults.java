package com.mobilefuse.sdk;

import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseDefaults.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/mobilefuse/sdk/MobileFuseDefaults;", "", "()V", "ADVERTISING_ID_ZEROS", "", "BANNER_AD_REFRESH_DEFAULT_DELAY", "", "BANNER_AD_REFRESH_MIN_DELAY", "CACHE_MONITOR_LOAD_NEW_AD_BEFORE_MILLIS", "CACHE_MONITOR_MAX_RELOAD_ATTEMPTS", "", "CACHE_MONITOR_MIN_THRESHOLD_MILLIS", "DEFAULT_INTERSTITIAL_AD_CLOSE_BUTTON_DELAY_SEC", "", "DEFAULT_REWARDED_AD_CLOSE_BUTTON_DELAY_SEC", "DEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "getDEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR", "()Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "FABRICK_API_KEY", "LIVERAMP_PLACEMENT_ID", "OMID_PARTNER_NAME", "TEST_MODE_PLACEMENT_PREFIX", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final class MobileFuseDefaults {

    @NotNull
    public static final String ADVERTISING_ID_ZEROS = "00000000-0000-0000-0000-000000000000";
    public static final long BANNER_AD_REFRESH_DEFAULT_DELAY = 30;
    public static final long BANNER_AD_REFRESH_MIN_DELAY = 30;
    public static final long CACHE_MONITOR_LOAD_NEW_AD_BEFORE_MILLIS = 15000;
    public static final int CACHE_MONITOR_MAX_RELOAD_ATTEMPTS = 2;
    public static final long CACHE_MONITOR_MIN_THRESHOLD_MILLIS = 20000;
    public static final float DEFAULT_INTERSTITIAL_AD_CLOSE_BUTTON_DELAY_SEC = 5.0f;
    public static final float DEFAULT_REWARDED_AD_CLOSE_BUTTON_DELAY_SEC = 10.0f;

    @NotNull
    public static final String FABRICK_API_KEY = "2166430447";

    @NotNull
    public static final String LIVERAMP_PLACEMENT_ID = "13848";

    @NotNull
    public static final String OMID_PARTNER_NAME = "Mobilefuse";

    @NotNull
    public static final String TEST_MODE_PLACEMENT_PREFIX = "test:";

    @NotNull
    public static final MobileFuseDefaults INSTANCE = new MobileFuseDefaults();

    @NotNull
    private static final ClickthroughBehaviour DEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR = ClickthroughBehaviour.CTA_AND_VIDEO;

    private MobileFuseDefaults() {
    }

    @NotNull
    public final ClickthroughBehaviour getDEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR() {
        return DEFAULT_VIDEO_CLICKTHROUGH_BEHAVIOUR;
    }
}
