package com.smaato.sdk.ng;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.inmobi.sdk.InMobiSdk;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.consent.UserConsentActivity;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NextGenAdvertisingId;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes9.dex */
public class UserDataManager {
    private static final String e = "UserDataManager";
    private final Context a;
    private final SharedPreferences b;
    private final SharedPreferences c;
    private final SharedPreferences.OnSharedPreferenceChangeListener d;

    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "IABGPP_GppSID":
                    String b = UserDataManager.this.b(sharedPreferences);
                    if (!TextUtils.isEmpty(b)) {
                        UserDataManager.this.setGppSid(b);
                        break;
                    } else {
                        UserDataManager.this.removeGppSid();
                        break;
                    }
                case "IABUSPrivacy_String":
                    String a = UserDataManager.this.a(sharedPreferences);
                    if (!TextUtils.isEmpty(a)) {
                        UserDataManager.this.setIABUSPrivacyString(a);
                        break;
                    } else {
                        UserDataManager.this.removeIABUSPrivacyString();
                        break;
                    }
                case "IABConsent_ConsentString":
                    String e = UserDataManager.this.e(sharedPreferences);
                    if (!TextUtils.isEmpty(e)) {
                        UserDataManager.this.setIABGDPRConsentString(e);
                        break;
                    } else {
                        UserDataManager.this.removeIABGDPRConsentString();
                        break;
                    }
                case "IABTCF_TCString":
                    String d = UserDataManager.this.d(sharedPreferences);
                    if (!TextUtils.isEmpty(d)) {
                        UserDataManager.this.setIABGDPRConsentString(d);
                        break;
                    } else {
                        UserDataManager.this.removeIABGDPRConsentString();
                        break;
                    }
                case "IABGPP_HDR_GppString":
                    String c = UserDataManager.this.c(sharedPreferences);
                    if (!TextUtils.isEmpty(c)) {
                        UserDataManager.this.setGppString(c);
                        break;
                    } else {
                        UserDataManager.this.removeGppString();
                        break;
                    }
            }
        }
    }

    public UserDataManager(Context context) {
        a aVar = new a();
        this.d = aVar;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = applicationContext.getSharedPreferences("com.smaato.sdk.ng.dataconsent", 0);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext.getApplicationContext());
        this.c = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(aVar);
        }
        f(defaultSharedPreferences);
    }

    private synchronized void a(final boolean z) {
        String advertisingId = NextGen.getDeviceInfo().getAdvertisingId();
        if (!TextUtils.isEmpty(advertisingId)) {
            a(advertisingId, z);
            return;
        }
        try {
            try {
                new NextGenAdvertisingId(this.a).execute(new NextGenAdvertisingId.Listener() { // from class: com.smaato.sdk.ng.UserDataManager$$ExternalSyntheticLambda0
                    @Override // com.smaato.sdk.ng.utils.NextGenAdvertisingId.Listener
                    public final void onNextGenAdvertisingIdFinish(String str, Boolean bool) {
                        UserDataManager.this.a(z, str, bool);
                    }
                });
            } catch (RejectedExecutionException e2) {
                Logger.e(e, "processConsent", e2);
                NextGen.reportException((Exception) e2);
            }
        } catch (Exception e3) {
            Logger.e(e, "Error executing NextGenAdvertisingId AsyncTask");
            NextGen.reportException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String b(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("IABGPP_GppSID", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("IABGPP_HDR_GppString", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String d(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("IABTCF_TCString", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String e(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("IABConsent_ConsentString", "");
    }

    private synchronized void f(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                String d = d(sharedPreferences);
                String e2 = e(sharedPreferences);
                String a2 = a(sharedPreferences);
                String c = c(sharedPreferences);
                String b = b(sharedPreferences);
                if (!TextUtils.isEmpty(d)) {
                    setIABGDPRConsentString(d);
                } else if (!TextUtils.isEmpty(e2)) {
                    setIABGDPRConsentString(e2);
                }
                if (!TextUtils.isEmpty(a2)) {
                    setIABUSPrivacyString(a2);
                }
                if (!TextUtils.isEmpty(c)) {
                    setGppString(c);
                }
                if (!TextUtils.isEmpty(b)) {
                    setGppSid(b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    public boolean canCollectData() {
        if (gdprApplies()) {
            return a() && this.b.getInt("gdpr_consent_state", 0) == 1;
        }
        return true;
    }

    @Deprecated
    public void denyConsent() {
        a(false);
    }

    public synchronized boolean gdprApplies() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null || !sharedPreferences.contains(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY)) {
            return false;
        }
        try {
            return a(this.c.getAll().get(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY)) == 1;
        } catch (Exception e2) {
            Logger.e(e, "Error reading GDPR value.", e2);
            return false;
        }
    }

    @Deprecated
    public String getConsentPageLink() {
        return "https://cdn.pubnative.net/static/consent/consent.html";
    }

    @Deprecated
    public Intent getConsentScreenIntent(Context context) {
        return new Intent(context, (Class<?>) UserConsentActivity.class);
    }

    public String getGppSid() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("gpp_id", null);
        }
        return null;
    }

    public synchronized String getGppString() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("gpp_string", null);
    }

    public synchronized String getIABGDPRConsentString() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null) {
            return null;
        }
        String string = sharedPreferences.getString(InMobiSdk.IM_GDPR_CONSENT_IAB, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = this.c.getString("IABTCF_TCString", null);
        if (!TextUtils.isEmpty(string2)) {
            return string2;
        }
        return this.c.getString("IABConsent_ConsentString", null);
    }

    public synchronized String getIABUSPrivacyString() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("ccpa_consent", null);
    }

    @Deprecated
    public String getPrivacyPolicyLink() {
        return Ad.CONTENT_INFO_LINK_URL;
    }

    @Deprecated
    public String getVendorListLink() {
        return "https://pubnative.net/monetization-partners/";
    }

    @Deprecated
    public void grantConsent() {
        a(true);
    }

    public synchronized boolean isCCPAOptOut() {
        String iABUSPrivacyString = getIABUSPrivacyString();
        if (TextUtils.isEmpty(iABUSPrivacyString) || iABUSPrivacyString.length() < 3) {
            return false;
        }
        char charAt = iABUSPrivacyString.charAt(2);
        return charAt == 'y' || charAt == 'Y';
    }

    public synchronized boolean isConsentDenied() {
        if (this.b.contains("gdpr_consent_state")) {
            if (this.b.getInt("gdpr_consent_state", 0) == 0) {
                return true;
            }
        }
        return false;
    }

    public void removeGppData() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("gpp_string").apply();
            this.b.edit().remove("gpp_id").apply();
        }
    }

    public void removeGppSid() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("gpp_id").apply();
        }
    }

    public void removeGppString() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("gpp_string").apply();
        }
    }

    public synchronized void removeIABGDPRConsentString() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove(InMobiSdk.IM_GDPR_CONSENT_IAB).apply();
        }
    }

    public synchronized void removeIABUSPrivacyString() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("ccpa_consent").apply();
        }
    }

    @Deprecated
    public void revokeConsent() {
        denyConsent();
    }

    public void setGppSid(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("gpp_id", str).apply();
        }
    }

    public synchronized void setGppString(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("gpp_string", str).apply();
        }
    }

    public synchronized void setIABGDPRConsentString(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(InMobiSdk.IM_GDPR_CONSENT_IAB, str).apply();
        }
    }

    public synchronized void setIABUSPrivacyString(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("ccpa_consent", str).apply();
        }
    }

    @Deprecated
    public boolean shouldAskConsent() {
        return gdprApplies() && !a();
    }

    @Deprecated
    public void showConsentRequestScreen(Context context) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, getConsentScreenIntent(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(e, "Consent request failed with an empty advertising ID.");
        } else {
            a(str, z);
        }
    }

    private synchronized void a(String str, boolean z) {
        a(z ? 1 : 0);
    }

    private static int a(Object obj) {
        if (obj == null) {
            Logger.w(e, "GDPR value is null. Defaulting to 0.");
            return 0;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if ("1".equals(str) || "true".equalsIgnoreCase(str)) {
                return 1;
            }
        } else {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? 1 : 0;
            }
        }
        return 0;
    }

    private synchronized boolean a() {
        boolean contains = this.b.contains("gdpr_consent_state");
        if (contains) {
            String string = this.b.getString("gdpr_advertising_id", "");
            if (!TextUtils.isEmpty(string)) {
                if (!string.equals(NextGen.getDeviceInfo().getAdvertisingId())) {
                    return false;
                }
            }
        }
        return contains;
    }

    private void a(int i) {
        if (i != 1 && i != 0) {
            throw new RuntimeException("Illegal consent state provided");
        }
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString("gdpr_advertising_id", NextGen.getDeviceInfo().getAdvertisingId());
        edit.putInt("gdpr_consent_state", i);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("IABUSPrivacy_String", "");
    }
}
