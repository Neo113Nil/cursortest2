package com.ogury.ad;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ogury/ad/OguryLoadErrorCode;", "", "()V", "AD_DISABLED_CONSENT_DENIED", "", "AD_DISABLED_CONSENT_MISSING", "AD_DISABLED_COUNTRY_NOT_OPENED", "AD_DISABLED_UNSPECIFIED_REASON", "AD_PARSING_FAILED", "AD_PRECACHING_FAILED", "AD_PRECACHING_TIMEOUT", "AD_REQUEST_FAILED", "INVALID_CONFIGURATION", "NO_ACTIVE_INTERNET_CONNECTION", "NO_FILL", "SDK_NOT_PROPERLY_INITIALIZED", "SDK_NOT_STARTED", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OguryLoadErrorCode {
    public static final int AD_DISABLED_CONSENT_DENIED = 2102;
    public static final int AD_DISABLED_CONSENT_MISSING = 2103;
    public static final int AD_DISABLED_COUNTRY_NOT_OPENED = 2101;
    public static final int AD_DISABLED_UNSPECIFIED_REASON = 2104;
    public static final int AD_PARSING_FAILED = 2202;
    public static final int AD_PRECACHING_FAILED = 2300;
    public static final int AD_PRECACHING_TIMEOUT = 2301;
    public static final int AD_REQUEST_FAILED = 2200;

    @NotNull
    public static final OguryLoadErrorCode INSTANCE = new OguryLoadErrorCode();
    public static final int INVALID_CONFIGURATION = 2100;
    public static final int NO_ACTIVE_INTERNET_CONNECTION = 2002;
    public static final int NO_FILL = 2201;
    public static final int SDK_NOT_PROPERLY_INITIALIZED = 2001;
    public static final int SDK_NOT_STARTED = 2000;

    private OguryLoadErrorCode() {
    }
}
