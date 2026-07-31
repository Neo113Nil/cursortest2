package com.google.firebase.appcheck.internal;

import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.util.Clock;
import com.google.firebase.appcheck.internal.util.TokenParser;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class DefaultAppCheckToken extends AppCheckToken {
    static final String EXPIRATION_TIME_KEY = "exp";
    static final String EXPIRES_IN_MILLIS_KEY = "expiresIn";
    static final String ISSUED_AT_KEY = "iat";
    private static final long ONE_SECOND_MILLIS = 1000;
    static final String RECEIVED_AT_TIMESTAMP_KEY = "receivedAt";
    private static final String TAG = "com.google.firebase.appcheck.internal.DefaultAppCheckToken";
    static final String TOKEN_KEY = "token";
    private final long expiresInMillis;
    private final long receivedAtTimestamp;
    private final String token;

    DefaultAppCheckToken(String str, long j) {
        this(str, j, new Clock.DefaultClock().currentTimeMillis());
    }

    DefaultAppCheckToken(String str, long j, long j2) {
        Preconditions.checkNotEmpty(str);
        this.token = str;
        this.expiresInMillis = j;
        this.receivedAtTimestamp = j2;
    }

    public static DefaultAppCheckToken constructFromAppCheckTokenResponse(AppCheckTokenResponse appCheckTokenResponse) {
        long longFromClaimsSafely;
        Preconditions.checkNotNull(appCheckTokenResponse);
        try {
            longFromClaimsSafely = (long) (Double.parseDouble(appCheckTokenResponse.getTimeToLive().replace(CmcdData.STREAMING_FORMAT_SS, "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map<String, Object> parseTokenClaims = TokenParser.parseTokenClaims(appCheckTokenResponse.getToken());
            longFromClaimsSafely = 1000 * (getLongFromClaimsSafely(parseTokenClaims, "exp") - getLongFromClaimsSafely(parseTokenClaims, "iat"));
        }
        return new DefaultAppCheckToken(appCheckTokenResponse.getToken(), longFromClaimsSafely);
    }

    @Override // com.google.firebase.appcheck.AppCheckToken
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.appcheck.AppCheckToken
    public long getExpireTimeMillis() {
        return this.receivedAtTimestamp + this.expiresInMillis;
    }

    long getReceivedAtTimestamp() {
        return this.receivedAtTimestamp;
    }

    long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    String serializeTokenToString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", this.token);
            jSONObject.put(RECEIVED_AT_TIMESTAMP_KEY, this.receivedAtTimestamp);
            jSONObject.put(EXPIRES_IN_MILLIS_KEY, this.expiresInMillis);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.e(TAG, "Could not serialize token: " + e.getMessage());
            return null;
        }
    }

    static DefaultAppCheckToken deserializeTokenFromJsonString(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new DefaultAppCheckToken(jSONObject.getString("token"), jSONObject.getLong(EXPIRES_IN_MILLIS_KEY), jSONObject.getLong(RECEIVED_AT_TIMESTAMP_KEY));
        } catch (JSONException e) {
            Log.e(TAG, "Could not deserialize token: " + e.getMessage());
            return null;
        }
    }

    public static DefaultAppCheckToken constructFromRawToken(String str) {
        Preconditions.checkNotNull(str);
        Map<String, Object> parseTokenClaims = TokenParser.parseTokenClaims(str);
        long longFromClaimsSafely = getLongFromClaimsSafely(parseTokenClaims, "iat");
        return new DefaultAppCheckToken(str, (getLongFromClaimsSafely(parseTokenClaims, "exp") - longFromClaimsSafely) * 1000, longFromClaimsSafely * 1000);
    }

    private static long getLongFromClaimsSafely(Map<String, Object> map, String str) {
        Preconditions.checkNotNull(map);
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}
