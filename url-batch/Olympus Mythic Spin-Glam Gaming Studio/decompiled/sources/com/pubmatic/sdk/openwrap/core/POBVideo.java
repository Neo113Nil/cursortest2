package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.video.player.POBVideoPlayer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class POBVideo {
    protected static final int BOXING_ALLOWED = 1;
    protected static final int PLAYBACK_END = 1;
    private final Linearity a;
    private POBRequest.AdPosition b;
    private final Placement c;
    private final Plcmt d;
    private final POBAdSize e;
    private JSONArray f;
    protected static final String[] MIMES = POBVideoPlayer.SupportedMediaType.getStringValues();
    protected static final int[] DELIVERY = {2};
    protected static final int[] COMPANION_TYPE = {1, 2, 3};

    public enum Linearity {
        LINEAR(1),
        NON_LINEAR(2);

        private final int a;

        Linearity(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    public enum Placement {
        IN_BANNER(2),
        INTERSTITIAL(5);

        private final int a;

        Placement(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    public enum Plcmt {
        STANDALONE(4),
        INTERSTITIAL(3);

        private final int a;

        Plcmt(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    public POBVideo(@NonNull Placement placement, @NonNull Plcmt plcmt, @NonNull Linearity linearity, @NonNull POBAdSize pOBAdSize) {
        this.e = pOBAdSize;
        this.c = placement;
        this.a = linearity;
        this.d = plcmt;
    }

    @NonNull
    public POBAdSize getAdSize() {
        return this.e;
    }

    @Nullable
    public JSONArray getCompanionAds() {
        return this.f;
    }

    @NonNull
    public Linearity getLinearity() {
        return this.a;
    }

    @Nullable
    public POBRequest.AdPosition getPosition() {
        return this.b;
    }

    @NonNull
    public JSONObject getRTBJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("w", this.e.getAdWidth());
        jSONObject.put("h", this.e.getAdHeight());
        if (this.f == null) {
            POBBanner pOBBanner = new POBBanner(this.e);
            POBRequest.AdPosition adPosition = this.b;
            if (adPosition != null) {
                pOBBanner.setAdPosition(adPosition);
            }
            this.f = new JSONArray(new JSONObject[]{pOBBanner.getRTBJson(new HashSet(), true)});
        }
        jSONObject.put(POBConstants.KEY_VIDEO_COMPANION_AD, this.f);
        POBRequest.AdPosition adPosition2 = this.b;
        if (adPosition2 != null) {
            jSONObject.put("pos", adPosition2.getValue());
        }
        jSONObject.put("protocols", new JSONArray(POBCommonConstants.VIDEO_PROTOCOLS_DEFAULT));
        jSONObject.put("mimes", new JSONArray(MIMES));
        jSONObject.put(POBConstants.KEY_VIDEO_LINEARITY, this.a.getValue());
        jSONObject.put(POBConstants.KEY_VIDEO_BOXING_ALLOWED, 1);
        jSONObject.put("delivery", new JSONArray(DELIVERY));
        jSONObject.put(POBConstants.KEY_VIDEO_COMPANION_TYPE, new JSONArray(COMPANION_TYPE));
        jSONObject.put("placement", this.c.getValue());
        jSONObject.put(POBConstants.KEY_VIDEO_PLCMT, this.d.getValue());
        jSONObject.put(POBConstants.KEY_VIDEO_MIN_BITRATE, POBCommonConstants.DEFAULT_MIN_BITRATE);
        jSONObject.put(POBConstants.KEY_VIDEO_MAX_BITRATE, 5000);
        jSONObject.put(POBConstants.KEY_VIDEO_PLAYBACK_END, 1);
        jSONObject.put(POBConstants.KEY_VIDEO_START_DELAY, 0);
        Set<Integer> supportedAPIs = getSupportedAPIs();
        if (!supportedAPIs.isEmpty()) {
            jSONObject.put("api", new JSONArray((Collection) supportedAPIs));
        }
        return jSONObject;
    }

    @NonNull
    protected Set<Integer> getSupportedAPIs() {
        HashSet hashSet = new HashSet();
        if (POBInstanceProvider.getSdkConfig().getMeasurementProvider(POBCommonConstants.VIDEO_MEASUREMENT_PROVIDER_CLASS) != null) {
            hashSet.add(Integer.valueOf(POBRequest.API.OMSDK.getValue()));
        }
        return hashSet;
    }

    public void setCompanionAds(@NonNull JSONArray jSONArray) {
        this.f = jSONArray;
    }

    public void setPosition(@Nullable POBRequest.AdPosition adPosition) {
        this.b = adPosition;
    }
}
