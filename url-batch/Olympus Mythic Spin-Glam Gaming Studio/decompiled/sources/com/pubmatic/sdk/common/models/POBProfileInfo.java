package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class POBProfileInfo {
    public static final String COUNTRY_FILTERING_ALLOW_MODE = "include";
    public static final String COUNTRY_FILTERING_BLOCK_MODE = "exclude";
    private int a;
    private int b;
    private String f;
    private Set g;
    private String h;
    private boolean d = true;
    private boolean e = true;
    private final long c = System.currentTimeMillis();

    @Retention(RetentionPolicy.SOURCE)
    public @interface CountryFilterMode {
    }

    public static POBProfileInfo build(@NonNull JSONObject jSONObject) throws JSONException {
        POBProfileInfo pOBProfileInfo = new POBProfileInfo();
        pOBProfileInfo.a = jSONObject.optInt("pid");
        pOBProfileInfo.b = jSONObject.optInt("pubid");
        pOBProfileInfo.f = jSONObject.optString("adserver");
        JSONObject optJSONObject = jSONObject.optJSONObject("ctFiltering");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            pOBProfileInfo.h = optJSONObject.optString(X3.a.t);
            pOBProfileInfo.g = POBUtils.parseJsonArrayToSet(optJSONObject.optJSONArray("codes"));
        }
        pOBProfileInfo.d = jSONObject.optInt("enableCrashAnalyticAndroid", 1) != 0;
        pOBProfileInfo.e = jSONObject.optInt("mraidAppInstallStatus", 1) != 0;
        return pOBProfileInfo;
    }

    @Nullable
    public String getAdServerName() {
        return this.f;
    }

    @Nullable
    public String getCountryFilteringMode() {
        return this.h;
    }

    public long getCreatedDateTime() {
        return this.c;
    }

    @Nullable
    public Set<String> getFilteringCountries() {
        return this.g;
    }

    public int getProfileId() {
        return this.a;
    }

    public int getPublisherId() {
        return this.b;
    }

    public boolean isAppInstallStatusEnabled() {
        return this.e;
    }

    public boolean isCrashAnalyticsEnabled() {
        return this.d;
    }

    public boolean isProfileInfoExpired() {
        return POBUtils.isExpired(this.c, 86400000L);
    }
}
