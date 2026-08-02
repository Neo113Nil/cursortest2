package com.google.ads.consent;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class ConsentInformation {
    private static final String CONSENT_DATA_KEY = "consent_string";
    private static final String MOBILE_ADS_SERVER_URL = "https://adservice.google.com/getconfig/pubvendors";
    private static final String PREFERENCES_FILE_KEY = "mobileads_consent";
    private static final String TAG = "ConsentInformation";
    private static ConsentInformation instance;
    private final Context context;
    private DebugGeography debugGeography = DebugGeography.DEBUG_GEOGRAPHY_DISABLED;
    private List<String> testDevices = new ArrayList();
    private String hashedDeviceId = getHashedDeviceId();

    private static class ConsentInfoUpdateResponse {
        String responseInfo;
        boolean success;

        ConsentInfoUpdateResponse(boolean success, String responseInfo) {
            this.success = success;
            this.responseInfo = responseInfo;
        }
    }

    private ConsentInformation(Context context) {
        this.context = context.getApplicationContext();
    }

    public static synchronized ConsentInformation getInstance(Context context) {
        ConsentInformation consentInformation;
        synchronized (ConsentInformation.class) {
            if (instance == null) {
                instance = new ConsentInformation(context);
            }
            consentInformation = instance;
        }
        return consentInformation;
    }

    protected String getHashedDeviceId() {
        ContentResolver contentResolver = this.context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || isEmulator()) {
            string = "emulator";
        }
        return md5(string);
    }

    private String md5(String string) {
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(string.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    protected void setHashedDeviceId(String hashedDeviceId) {
        this.hashedDeviceId = hashedDeviceId;
    }

    private boolean isEmulator() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith(EnvironmentCompat.MEDIA_UNKNOWN) || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    public boolean isTestDevice() {
        return isEmulator() || this.testDevices.contains(this.hashedDeviceId);
    }

    public void addTestDevice(String hashedDeviceId) {
        this.testDevices.add(hashedDeviceId);
    }

    public DebugGeography getDebugGeography() {
        return this.debugGeography;
    }

    public void setDebugGeography(DebugGeography debugGeography) {
        this.debugGeography = debugGeography;
    }

    private static class AdNetworkLookupResponse {

        @SerializedName("company_ids")
        private List<String> companyIds;

        @SerializedName("ad_network_id")
        private String id;

        @SerializedName("is_npa")
        private boolean isNPA;

        @SerializedName("lookup_failed")
        private boolean lookupFailed;

        @SerializedName("not_found")
        private boolean notFound;

        private AdNetworkLookupResponse() {
        }
    }

    protected static class ServerResponse {

        @SerializedName("ad_network_ids")
        List<AdNetworkLookupResponse> adNetworkLookupResponses;
        List<AdProvider> companies;

        @SerializedName("is_request_in_eea_or_unknown")
        Boolean isRequestLocationInEeaOrUnknown;

        protected ServerResponse() {
        }
    }

    private static class ConsentInfoUpdateTask extends AsyncTask<Void, Void, ConsentInfoUpdateResponse> {
        private static final String UPDATE_SUCCESS = "Consent update successful.";
        private final ConsentInformation consentInformation;
        private final ConsentInfoUpdateListener listener;
        private final List<String> publisherIds;
        private final String url;

        ConsentInfoUpdateTask(String url, ConsentInformation consentInformation, List<String> publisherIds, ConsentInfoUpdateListener listener) {
            this.url = url;
            this.listener = listener;
            this.publisherIds = publisherIds;
            this.consentInformation = consentInformation;
        }

        private String readStream(InputStream inputStream) {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            while (true) {
                try {
                    try {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            sb.append(new String(bArr, 0, read));
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                            }
                        }
                    } finally {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e2) {
                            Log.e(ConsentInformation.TAG, e2.getLocalizedMessage());
                        }
                    }
                } catch (IOException e3) {
                    Log.e(ConsentInformation.TAG, e3.getLocalizedMessage());
                    try {
                        bufferedInputStream.close();
                        return null;
                    } catch (IOException e4) {
                        Log.e(ConsentInformation.TAG, e4.getLocalizedMessage());
                        return null;
                    }
                }
            }
            return sb.toString();
        }

        private ConsentInfoUpdateResponse makeConsentLookupRequest(String urlString) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(urlString).openConnection();
                if (httpURLConnection.getResponseCode() == 200) {
                    String readStream = readStream(httpURLConnection.getInputStream());
                    httpURLConnection.disconnect();
                    this.consentInformation.updateConsentData(readStream, this.publisherIds);
                    return new ConsentInfoUpdateResponse(true, UPDATE_SUCCESS);
                }
                return new ConsentInfoUpdateResponse(false, httpURLConnection.getResponseMessage());
            } catch (Exception e) {
                return new ConsentInfoUpdateResponse(false, e.getLocalizedMessage());
            }
        }

        @Override // android.os.AsyncTask
        public ConsentInfoUpdateResponse doInBackground(Void... unused) {
            String join = TextUtils.join(",", this.publisherIds);
            ConsentData loadConsentData = this.consentInformation.loadConsentData();
            Uri.Builder appendQueryParameter = Uri.parse(this.url).buildUpon().appendQueryParameter("pubs", join).appendQueryParameter("es", "2").appendQueryParameter("plat", loadConsentData.getSDKPlatformString()).appendQueryParameter("v", loadConsentData.getSDKVersionString());
            if (this.consentInformation.isTestDevice() && this.consentInformation.getDebugGeography() != DebugGeography.DEBUG_GEOGRAPHY_DISABLED) {
                appendQueryParameter = appendQueryParameter.appendQueryParameter("debug_geo", this.consentInformation.getDebugGeography().getCode().toString());
            }
            return makeConsentLookupRequest(appendQueryParameter.build().toString());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(ConsentInfoUpdateResponse result) {
            if (result.success) {
                this.listener.onConsentInfoUpdated(this.consentInformation.getConsentStatus());
            } else {
                this.listener.onFailedToUpdateConsentInfo(result.responseInfo);
            }
        }
    }

    public synchronized void setTagForUnderAgeOfConsent(boolean underAgeOfConsent) {
        ConsentData loadConsentData = loadConsentData();
        loadConsentData.tagForUnderAgeOfConsent(underAgeOfConsent);
        saveConsentData(loadConsentData);
    }

    public synchronized boolean isTaggedForUnderAgeOfConsent() {
        return loadConsentData().isTaggedForUnderAgeOfConsent();
    }

    public synchronized void reset() {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).edit();
        edit.clear();
        edit.apply();
        this.testDevices = new ArrayList();
    }

    public void requestConsentInfoUpdate(String[] publisherIds, ConsentInfoUpdateListener listener) {
        requestConsentInfoUpdate(publisherIds, MOBILE_ADS_SERVER_URL, listener);
    }

    protected void requestConsentInfoUpdate(String[] publisherIds, String url, ConsentInfoUpdateListener listener) {
        if (isTestDevice()) {
            Log.i(TAG, "This request is sent from a test device.");
        } else {
            String hashedDeviceId = getHashedDeviceId();
            StringBuilder sb = new StringBuilder(String.valueOf(hashedDeviceId).length() + 93);
            sb.append("Use ConsentInformation.getInstance(context).addTestDevice(\"");
            sb.append(hashedDeviceId);
            sb.append("\") to get test ads on this device.");
            Log.i(TAG, sb.toString());
        }
        new ConsentInfoUpdateTask(url, this, Arrays.asList(publisherIds), listener).execute(new Void[0]);
    }

    private void validatePublisherIds(final ServerResponse response) throws Exception {
        if (response.isRequestLocationInEeaOrUnknown == null) {
            throw new Exception("Could not parse Event FE preflight response.");
        }
        if (response.companies == null && response.isRequestLocationInEeaOrUnknown.booleanValue()) {
            throw new Exception("Could not parse Event FE preflight response.");
        }
        if (response.isRequestLocationInEeaOrUnknown.booleanValue()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (AdNetworkLookupResponse adNetworkLookupResponse : response.adNetworkLookupResponses) {
                if (adNetworkLookupResponse.lookupFailed) {
                    hashSet.add(adNetworkLookupResponse.id);
                }
                if (adNetworkLookupResponse.notFound) {
                    hashSet2.add(adNetworkLookupResponse.id);
                }
            }
            if (hashSet.isEmpty() && hashSet2.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Response error.");
            if (!hashSet.isEmpty()) {
                sb.append(String.format(" Lookup failure for: %s.", TextUtils.join(",", hashSet)));
            }
            if (!hashSet2.isEmpty()) {
                sb.append(String.format(" Publisher Ids not found: %s", TextUtils.join(",", hashSet2)));
            }
            throw new Exception(sb.toString());
        }
    }

    private HashSet<AdProvider> getNonPersonalizedAdProviders(List<AdProvider> adProviders, HashSet<String> nonPersonalizedAdProviderIds) {
        ArrayList arrayList = new ArrayList();
        for (AdProvider adProvider : adProviders) {
            if (nonPersonalizedAdProviderIds.contains(adProvider.getId())) {
                arrayList.add(adProvider);
            }
        }
        return new HashSet<>(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updateConsentData(String responseString, List<String> publisherIds) throws Exception {
        boolean z;
        HashSet<AdProvider> hashSet;
        ServerResponse serverResponse = (ServerResponse) new Gson().fromJson(responseString, ServerResponse.class);
        validatePublisherIds(serverResponse);
        HashSet<String> hashSet2 = new HashSet<>();
        boolean z2 = true;
        if (serverResponse.adNetworkLookupResponses != null) {
            z = false;
            for (AdNetworkLookupResponse adNetworkLookupResponse : serverResponse.adNetworkLookupResponses) {
                if (adNetworkLookupResponse.isNPA) {
                    List list = adNetworkLookupResponse.companyIds;
                    if (list != null) {
                        hashSet2.addAll(list);
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (serverResponse.companies == null) {
            hashSet = new HashSet<>();
        } else if (z) {
            hashSet = getNonPersonalizedAdProviders(serverResponse.companies, hashSet2);
        } else {
            hashSet = new HashSet<>(serverResponse.companies);
        }
        ConsentData loadConsentData = loadConsentData();
        if (loadConsentData.hasNonPersonalizedPublisherId() == z) {
            z2 = false;
        }
        loadConsentData.setHasNonPersonalizedPublisherId(z);
        loadConsentData.setRawResponse(responseString);
        loadConsentData.setPublisherIds(new HashSet<>(publisherIds));
        loadConsentData.setAdProviders(hashSet);
        loadConsentData.setRequestLocationInEeaOrUnknown(serverResponse.isRequestLocationInEeaOrUnknown.booleanValue());
        if (!serverResponse.isRequestLocationInEeaOrUnknown.booleanValue()) {
            saveConsentData(loadConsentData);
            return;
        }
        if (!loadConsentData.getConsentedAdProviders().containsAll(loadConsentData.getAdProviders()) || z2) {
            loadConsentData.setConsentSource("sdk");
            loadConsentData.setConsentStatus(ConsentStatus.UNKNOWN);
            loadConsentData.setConsentedAdProviders(new HashSet<>());
        }
        saveConsentData(loadConsentData);
    }

    public synchronized List<AdProvider> getAdProviders() {
        return new ArrayList(loadConsentData().getAdProviders());
    }

    protected ConsentData loadConsentData() {
        String string = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).getString(CONSENT_DATA_KEY, "");
        if (TextUtils.isEmpty(string)) {
            return new ConsentData();
        }
        return (ConsentData) new Gson().fromJson(string, ConsentData.class);
    }

    private void saveConsentData(ConsentData consentData) {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(PREFERENCES_FILE_KEY, 0).edit();
        edit.putString(CONSENT_DATA_KEY, new Gson().toJson(consentData));
        edit.apply();
    }

    public boolean isRequestLocationInEeaOrUnknown() {
        return loadConsentData().isRequestLocationInEeaOrUnknown();
    }

    public void setConsentStatus(ConsentStatus consentStatus) {
        setConsentStatus(consentStatus, "programmatic");
    }

    protected synchronized void setConsentStatus(ConsentStatus consentStatus, String source) {
        ConsentData loadConsentData = loadConsentData();
        if (consentStatus == ConsentStatus.UNKNOWN) {
            loadConsentData.setConsentedAdProviders(new HashSet<>());
        } else {
            loadConsentData.setConsentedAdProviders(loadConsentData.getAdProviders());
        }
        loadConsentData.setConsentSource(source);
        loadConsentData.setConsentStatus(consentStatus);
        saveConsentData(loadConsentData);
    }

    public synchronized ConsentStatus getConsentStatus() {
        return loadConsentData().getConsentStatus();
    }
}
