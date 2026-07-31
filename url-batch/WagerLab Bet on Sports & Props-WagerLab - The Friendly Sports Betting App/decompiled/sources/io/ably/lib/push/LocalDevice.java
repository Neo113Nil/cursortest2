package io.ably.lib.push;

import android.content.Context;
import com.google.gson.JsonObject;
import io.ably.lib.rest.DeviceDetails;
import io.ably.lib.types.Param;
import io.ably.lib.types.RegistrationToken;
import io.ably.lib.util.Base64Coder;
import io.ably.lib.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes7.dex */
public class LocalDevice extends DeviceDetails {
    private static final String DEVICE_IDENTITY_HEADER = "X-Ably-DeviceToken";
    private static final String TAG = "io.ably.lib.push.LocalDevice";
    private final ActivationContext activationContext;
    public String deviceIdentityToken;
    public String deviceSecret;
    private final Storage storage;

    public LocalDevice(ActivationContext activationContext, Storage storage) {
        Log.v(TAG, "LocalDevice(): initialising");
        this.platform = "android";
        this.formFactor = isTablet(activationContext.getContext()) ? "tablet" : "phone";
        this.activationContext = activationContext;
        this.push = new DeviceDetails.Push();
        this.storage = storage == null ? new SharedPreferenceStorage(activationContext) : storage;
        loadPersisted();
    }

    @Override // io.ably.lib.rest.DeviceDetails
    public JsonObject toJsonObject() {
        JsonObject jsonObject = super.toJsonObject();
        String str = this.deviceSecret;
        if (str != null) {
            jsonObject.addProperty("deviceSecret", str);
        }
        return jsonObject;
    }

    private void loadPersisted() {
        String str = this.storage.get("ABLY_DEVICE_ID", (String) null);
        this.id = str;
        if (str != null) {
            Log.v(TAG, "loadPersisted(): existing deviceId found; id: " + str);
            this.deviceSecret = this.storage.get("ABLY_DEVICE_SECRET", (String) null);
        } else {
            Log.v(TAG, "loadPersisted(): existing deviceId not found.");
        }
        this.clientId = this.storage.get("ABLY_CLIENT_ID", (String) null);
        this.deviceIdentityToken = this.storage.get("ABLY_DEVICE_IDENTITY_TOKEN", (String) null);
        RegistrationToken.Type fromOrdinal = RegistrationToken.Type.fromOrdinal(this.storage.get("ABLY_REGISTRATION_TOKEN_TYPE", -1));
        String str2 = TAG;
        Log.d(str2, "loadPersisted(): token type = " + fromOrdinal);
        if (fromOrdinal != null) {
            String str3 = this.storage.get("ABLY_REGISTRATION_TOKEN", (String) null);
            Log.d(str2, "loadPersisted(): token string = " + str3);
            if (str3 != null) {
                setRegistrationToken(new RegistrationToken(fromOrdinal, str3));
            }
        }
    }

    RegistrationToken getRegistrationToken() {
        JsonObject jsonObject = this.push.recipient;
        if (jsonObject == null) {
            Log.v(TAG, "getRegistrationToken(): returning null because push.recipient is null");
            return null;
        }
        Log.v(TAG, "getRegistrationToken(): returning a new registration token because push.recipient is set");
        return new RegistrationToken(RegistrationToken.Type.fromName(jsonObject.get("transportType").getAsString()), jsonObject.get("registrationToken").getAsString());
    }

    private void setRegistrationToken(RegistrationToken registrationToken) {
        Log.v(TAG, "setRegistrationToken(): token=" + registrationToken);
        this.push.recipient = new JsonObject();
        this.push.recipient.addProperty("transportType", registrationToken.type.toName());
        this.push.recipient.addProperty("registrationToken", registrationToken.token);
    }

    private void clearRegistrationToken() {
        Log.v(TAG, "clearRegistrationToken()");
        this.push.recipient = null;
    }

    void setAndPersistRegistrationToken(RegistrationToken registrationToken) {
        Log.v(TAG, "setAndPersistRegistrationToken(): token=" + registrationToken);
        setRegistrationToken(registrationToken);
        this.storage.put("ABLY_REGISTRATION_TOKEN_TYPE", registrationToken.type.ordinal());
        this.storage.put("ABLY_REGISTRATION_TOKEN", registrationToken.token);
    }

    void setClientId(String str) {
        Log.v(TAG, "setClientId(): clientId=" + str);
        this.clientId = str;
        this.storage.put("ABLY_CLIENT_ID", str);
    }

    public void setDeviceIdentityToken(String str) {
        Log.v(TAG, "setDeviceIdentityToken(): token=" + str);
        this.deviceIdentityToken = str;
        this.storage.put("ABLY_DEVICE_IDENTITY_TOKEN", str);
    }

    boolean isCreated() {
        return this.id != null;
    }

    void create() {
        Log.v(TAG, "create()");
        Storage storage = this.storage;
        String uuid = UUID.randomUUID().toString();
        this.id = uuid;
        storage.put("ABLY_DEVICE_ID", uuid);
        Storage storage2 = this.storage;
        String str = this.activationContext.clientId;
        this.clientId = str;
        storage2.put("ABLY_CLIENT_ID", str);
        Storage storage3 = this.storage;
        String generateSecret = generateSecret();
        this.deviceSecret = generateSecret;
        storage3.put("ABLY_DEVICE_SECRET", generateSecret);
        Storage storage4 = this.storage;
        this.deviceIdentityToken = null;
        storage4.put("ABLY_DEVICE_IDENTITY_TOKEN", (String) null);
    }

    public void reset() {
        Log.v(TAG, "reset()");
        this.id = null;
        this.deviceSecret = null;
        this.deviceIdentityToken = null;
        this.clientId = null;
        clearRegistrationToken();
        this.storage.clear(SharedPrefKeys.getAllKeys());
    }

    boolean isRegistered() {
        return this.deviceIdentityToken != null;
    }

    Param[] deviceIdentityHeaders() {
        if (this.deviceIdentityToken != null) {
            return new Param[]{new Param(DEVICE_IDENTITY_HEADER, Base64Coder.encodeString(this.deviceIdentityToken))};
        }
        return null;
    }

    private static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private static class SharedPrefKeys {
        static final String CLIENT_ID = "ABLY_CLIENT_ID";
        static final String DEVICE_ID = "ABLY_DEVICE_ID";
        static final String DEVICE_SECRET = "ABLY_DEVICE_SECRET";
        static final String DEVICE_TOKEN = "ABLY_DEVICE_IDENTITY_TOKEN";
        static final String TOKEN = "ABLY_REGISTRATION_TOKEN";
        static final String TOKEN_TYPE = "ABLY_REGISTRATION_TOKEN_TYPE";

        private SharedPrefKeys() {
        }

        static String[] getAllKeys() {
            return new String[]{DEVICE_ID, CLIENT_ID, DEVICE_SECRET, DEVICE_TOKEN, TOKEN_TYPE, TOKEN};
        }
    }

    private static String generateSecret() {
        MessageDigest messageDigest;
        Log.v(TAG, "generateSecret()");
        byte[] bArr = new byte[64];
        new SecureRandom().nextBytes(bArr);
        try {
            messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        return Base64Coder.encodeToString(messageDigest.digest(bArr));
    }
}
