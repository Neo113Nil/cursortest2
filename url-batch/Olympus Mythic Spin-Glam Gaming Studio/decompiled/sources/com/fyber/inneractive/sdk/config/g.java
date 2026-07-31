package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class g {
    public SharedPreferences k;
    public SharedPreferences l;
    public IabTcfGdprAppliesStatus n;
    public Boolean o;
    public Boolean a = null;
    public Boolean b = null;
    public Boolean c = null;
    public String d = null;
    public String e = null;
    public InneractiveAdManager.GdprConsentSource f = null;
    public String g = null;
    public String h = null;
    public Boolean i = null;
    public Boolean j = null;
    public final com.fyber.inneractive.sdk.gpp.a m = new com.fyber.inneractive.sdk.gpp.a();
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final AtomicBoolean q = new AtomicBoolean(false);

    public final boolean a(boolean z, String str) {
        if (com.fyber.inneractive.sdk.util.o.a == null) {
            return false;
        }
        i();
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
        return true;
    }

    public final void b() {
        IAlog.a("Clearing LGPD consent status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.a == null) {
            IAlog.f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        i();
        this.i = null;
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    public final void c() {
        IAlog.a("Clearing CCPA Consent String", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.a == null) {
            IAlog.f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        i();
        this.h = null;
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public final void d() {
        if (this.m.a.get() != null) {
            return;
        }
        if (this.l == null) {
            Application application = com.fyber.inneractive.sdk.util.o.a;
            if (application == null) {
                IAlog.a("%sensureGppManagerInitialization - Context is null - returning", "ConfigDataProtectionProvider: ");
                return;
            }
            this.l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
        }
        this.m.a(this.l);
    }

    public final Boolean e() {
        d();
        o();
        if (this.b == null) {
            l();
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.a)) {
            IAlog.a("%sB1: GDPR consent granted - Publisher API override", "ConfigDataProtectionProvider: ");
            return bool;
        }
        Boolean bool2 = Boolean.FALSE;
        boolean equals = bool2.equals(this.a);
        IabTcfGdprAppliesStatus m = m();
        if (m != IabTcfGdprAppliesStatus.APPLIES) {
            if (equals) {
                IAlog.a("%sB1.1/B2: Publisher denied, gdprApplies status: %s - checking GPP (strict)", "ConfigDataProtectionProvider: ", m);
                return a(bool2);
            }
            IAlog.a("%sB1.2/B2: Publisher API not used, gdprApplies status: %s - checking GPP (lenient)", "ConfigDataProtectionProvider: ", m);
            return a((Boolean) null);
        }
        IAlog.a("%sB2.2: GDPR applies - Checking TCF VendorConsents", "ConfigDataProtectionProvider: ");
        Boolean bool3 = this.b;
        if (bool3 == null) {
            IAlog.a("%sB3: TCF VendorConsents missing - checking GPP (strict)", "ConfigDataProtectionProvider: ");
            return a(bool2);
        }
        if (bool3.booleanValue()) {
            IAlog.a("%sB3.1: GDPR consent granted - TCF Vendor 262 present", "ConfigDataProtectionProvider: ");
            return bool;
        }
        IAlog.a("%sB3.2: TCF Vendor 262 denied - checking GPP (strict)", "ConfigDataProtectionProvider: ");
        return a(bool2);
    }

    public final Integer f() {
        SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            int i = sharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            if (i != -1) {
                return Integer.valueOf(i);
            }
        } catch (Exception e) {
            IAlog.a("%sError when trying to read IABTCF_CmpSdkID", e, "ConfigDataProtectionProvider: ");
        }
        com.fyber.inneractive.sdk.tcf.a aVar = this.m.c;
        if (aVar.c) {
            return Integer.valueOf(aVar.d);
        }
        return null;
    }

    public final Integer g() {
        SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            int i = sharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            if (i != -1) {
                return Integer.valueOf(i);
            }
        } catch (Exception e) {
            IAlog.a("%sError when trying to read IABTCF_CmpSdkVersion", e, "ConfigDataProtectionProvider: ");
        }
        com.fyber.inneractive.sdk.tcf.a aVar = this.m.c;
        if (aVar.c) {
            return Integer.valueOf(aVar.e);
        }
        return null;
    }

    public final boolean h() {
        Boolean bool = this.o;
        if (bool != null) {
            return bool.booleanValue();
        }
        d();
        if (this.c == null) {
            this.c = n();
        }
        IabTcfGdprAppliesStatus m = m();
        if (m == IabTcfGdprAppliesStatus.APPLIES) {
            IAlog.a("%sA1.2: GDPR applies - Checking Legacy TCF", "ConfigDataProtectionProvider: ");
            Boolean bool2 = this.c;
            if (bool2 != null && !bool2.booleanValue()) {
                IAlog.a("%sA2: TCF Purpose 1 consent granted - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
                this.o = Boolean.FALSE;
                return false;
            }
            Boolean bool3 = this.c;
            IAlog.a("%s%s: TCF Purpose 1 %s - Checking GPP", "ConfigDataProtectionProvider: ", bool3 == null ? "A2.1" : "A2.2", bool3 != null ? "denied" : "does not exist");
            com.fyber.inneractive.sdk.gpp.a aVar = this.m;
            String str = aVar.a.get() != null ? aVar.b : null;
            if (str != null && !str.isEmpty() && this.m.a()) {
                IAlog.a("%sA3.2: GppSID contains EU section - Checking GPP PurposeConsents", "ConfigDataProtectionProvider: ");
                return j();
            }
            IAlog.a("%sA.3.3: GppSID missing or no EU section when GDPR applies - BLOCK AD REQUESTS", "ConfigDataProtectionProvider: ");
            this.o = Boolean.TRUE;
            return true;
        }
        boolean z = m == IabTcfGdprAppliesStatus.NOT_FOUND;
        IAlog.a("%s%s: gdprApplies key %s, checking GPP", "ConfigDataProtectionProvider: ", z ? "A1.1" : "A1", z ? "not found" : "is false");
        com.fyber.inneractive.sdk.gpp.a aVar2 = this.m;
        String str2 = aVar2.a.get() == null ? null : aVar2.b;
        if (str2 != null && !str2.isEmpty()) {
            if (this.m.a()) {
                IAlog.a("%sA3.2: GppSID contains EU section - Checking GPP PurposeConsents", "ConfigDataProtectionProvider: ");
                return j();
            }
            IAlog.a("%sA3: GppSID doesn't contain EU section - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
            this.o = Boolean.FALSE;
            return false;
        }
        IAlog.a("%sA3.1: GppSID %s - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ", str2 != null ? "empty" : "does not exist");
        this.o = Boolean.FALSE;
        if (!z || str2 != null) {
            return false;
        }
        if (this.k == null) {
            IAlog.a("%sSkipping reportNoCmpFoundEvent - mSharedPrefs are null", "ConfigDataProtectionProvider: ");
            return false;
        }
        if (this.m.d != null) {
            IAlog.a("%sSkipping reportNoCmpFoundEvent - GPP string is not null", "ConfigDataProtectionProvider: ");
            return false;
        }
        if (!this.p.compareAndSet(false, true)) {
            IAlog.a("%sSkipping reportNoCmpFoundEvent - event already reported", "ConfigDataProtectionProvider: ");
            return false;
        }
        IAlog.a("%sreportNoCmpFoundEvent - reporting event", "ConfigDataProtectionProvider: ");
        this.k.edit().putBoolean("no_cmp_found_event_reported", true).apply();
        new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.IA_IAB_NO_CMP_FOUND, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a((String) null);
        return false;
    }

    public final void i() {
        Application application = com.fyber.inneractive.sdk.util.o.a;
        if (application != null) {
            if (this.l == null) {
                this.l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            this.m.a(this.l);
            if (this.k == null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.k = sharedPreferences;
                if (sharedPreferences == null) {
                    IAlog.a("%sretrievePersistedValues - Shared prefs is null - returning", "ConfigDataProtectionProvider: ");
                } else {
                    this.p.set(sharedPreferences.getBoolean("no_cmp_found_event_reported", false));
                    this.q.set(this.k.getBoolean("invalid_gdpr_applies_flag_event_reported", false));
                }
                SharedPreferences sharedPreferences2 = this.k;
                if (sharedPreferences2 != null) {
                    IAlog.a("%sInitializing privacy content info from shared prefs", "ConfigDataProtectionProvider: ");
                    this.c = n();
                    if (sharedPreferences2.contains("IAGDPRBool")) {
                        this.a = Boolean.valueOf(sharedPreferences2.getBoolean("IAGDPRBool", false));
                    }
                    this.b = l();
                    if (sharedPreferences2.contains("IAGdprConsentData")) {
                        this.d = sharedPreferences2.getString("IAGdprConsentData", null);
                    }
                    this.e = k();
                    if (sharedPreferences2.contains("IACCPAConsentData")) {
                        this.h = sharedPreferences2.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences2.contains("IAGdprSource")) {
                        try {
                            this.f = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences2.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (Exception unused) {
                            this.f = InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences2.contains("IALgpdConsentStatus")) {
                        this.i = Boolean.valueOf(sharedPreferences2.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences2.contains("keyUserID")) {
                        this.g = sharedPreferences2.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    public final boolean j() {
        com.fyber.inneractive.sdk.tcf.a aVar = this.m.c;
        Boolean valueOf = aVar.c ? Boolean.valueOf(aVar.g) : null;
        if (valueOf == null || valueOf.booleanValue()) {
            IAlog.a("%sA4.1: GPP Purpose 1 %s - BLOCK AD REQUESTS", "ConfigDataProtectionProvider: ", valueOf == null ? "does not exist" : "not granted");
            this.o = Boolean.TRUE;
            return true;
        }
        IAlog.a("%sA4: GPP Purpose 1 consent granted - Purpose 1 ENABLED", "ConfigDataProtectionProvider: ");
        this.o = Boolean.FALSE;
        return false;
    }

    public final String k() {
        o oVar;
        SharedPreferences sharedPreferences;
        if (m() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            IAlog.a("%sGDPR does not apply - returning null for GDPR consent string", "ConfigDataProtectionProvider: ");
            return null;
        }
        s sVar = IAConfigManager.N.t;
        if (sVar == null || (oVar = sVar.b) == null) {
            IAlog.a("%sGlobal config resolver is null - returning null for GDPR consent string", "ConfigDataProtectionProvider: ");
            return null;
        }
        if (oVar.a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.l) != null && sharedPreferences.contains("IABTCF_TCString")) {
            try {
                return this.l.getString("IABTCF_TCString", null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final Boolean l() {
        o oVar;
        SharedPreferences sharedPreferences;
        if (m() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            IAlog.a("%sGDPR does not apply - returning null for GDPR consent status", "ConfigDataProtectionProvider: ");
            return null;
        }
        s sVar = IAConfigManager.N.t;
        if (sVar != null && (oVar = sVar.b) != null) {
            int a = oVar.a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (a != 0 && (sharedPreferences = this.l) != null) {
                try {
                    String string = sharedPreferences.getString("IABTCF_VendorConsents", null);
                    if (string == null) {
                        return null;
                    }
                    int i = (a >= 0 ? a : 262) - 1;
                    return Boolean.valueOf(string.length() > i && string.charAt(i) == '1');
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final IabTcfGdprAppliesStatus m() {
        IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus = this.n;
        if (iabTcfGdprAppliesStatus != null) {
            return iabTcfGdprAppliesStatus;
        }
        SharedPreferences sharedPreferences = this.l;
        if (sharedPreferences == null) {
            IAlog.a("%sError reading gdprApplies mAppDefaultSharedPrefs is null", "ConfigDataProtectionProvider: ");
            IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus2 = IabTcfGdprAppliesStatus.NOT_FOUND;
            this.n = iabTcfGdprAppliesStatus2;
            return iabTcfGdprAppliesStatus2;
        }
        if (!sharedPreferences.contains(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY)) {
            IAlog.a("%sReading gdprApplies: key not found", "ConfigDataProtectionProvider: ");
            IabTcfGdprAppliesStatus iabTcfGdprAppliesStatus3 = IabTcfGdprAppliesStatus.NOT_FOUND;
            this.n = iabTcfGdprAppliesStatus3;
            return iabTcfGdprAppliesStatus3;
        }
        try {
            int i = this.l.getInt(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, -1);
            if (i == 1 || i == 0) {
                this.n = i == 1 ? IabTcfGdprAppliesStatus.APPLIES : IabTcfGdprAppliesStatus.DOES_NOT_APPLY;
                IAlog.a("%sReading gdprApplies: %s", "ConfigDataProtectionProvider: ", Integer.valueOf(i));
                return this.n;
            }
            IAlog.a("%sgdprApplies exists but its value is invalid, returning it as APPLIES", "ConfigDataProtectionProvider: ");
            this.n = IabTcfGdprAppliesStatus.APPLIES;
            Map<String, ?> all = this.l.getAll();
            Object obj = (all == null || !all.containsKey(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY)) ? null : all.get(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY);
            if (obj == null) {
                IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - invalidValue is null", "ConfigDataProtectionProvider: ");
            } else if (this.k == null) {
                IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - mSharedPrefs are null", "ConfigDataProtectionProvider: ");
            } else if (this.q.compareAndSet(false, true)) {
                this.k.edit().putBoolean("invalid_gdpr_applies_flag_event_reported", true).apply();
                IAlog.a("%sreportInvalidGdprAppliesFlagEvent - reporting event for invalid value: %s", "ConfigDataProtectionProvider: ", obj);
                new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.INVALID_GDPR_APPLIES_FLAG, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null).a("cmp_id", f(), "cmp_version", g(), "value", obj).a((String) null);
            } else {
                IAlog.a("%sSkipping reportInvalidGdprAppliesFlagEvent - event already reported", "ConfigDataProtectionProvider: ");
            }
            return this.n;
        } catch (ClassCastException unused) {
            IAlog.a("%sError reading gdprApplies as int, trying to read it as boolean", "ConfigDataProtectionProvider: ");
            try {
                boolean z = this.l.getBoolean(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, true);
                this.n = z ? IabTcfGdprAppliesStatus.APPLIES : IabTcfGdprAppliesStatus.DOES_NOT_APPLY;
                IAlog.a("%sReading gdprApplies: %s", "ConfigDataProtectionProvider: ", Boolean.valueOf(z));
                return this.n;
            } catch (Exception unused2) {
                IAlog.a("%sError reading gdprApplies as boolean", "ConfigDataProtectionProvider: ");
            }
        }
    }

    public final Boolean n() {
        if (m() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY) {
            IAlog.a("%sGDPR does not apply - returning false for GDPR Purpose1Disabled", "ConfigDataProtectionProvider: ");
            return Boolean.FALSE;
        }
        s sVar = IAConfigManager.N.t;
        if (sVar != null && sVar.b != null) {
            SharedPreferences sharedPreferences = this.l;
            if (sharedPreferences == null) {
                IAlog.a("%sApp default shared prefs is null - returning null for GDPR Purpose1Disabled", "ConfigDataProtectionProvider: ");
                return null;
            }
            try {
                String string = sharedPreferences.getString("IABTCF_PurposeConsents", null);
                if (string == null || string.isEmpty()) {
                    return null;
                }
                return Boolean.valueOf(string.charAt(0) != '1');
            } catch (Exception unused) {
                IAlog.b("%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs", "ConfigDataProtectionProvider: ");
            }
        }
        return null;
    }

    public final void o() {
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences == null) {
            IAlog.a("%sresolvePublisherApiConsentStatus shared prefs are null - returning", "ConfigDataProtectionProvider: ");
            return;
        }
        if (this.a == null && sharedPreferences.contains("IAGDPRBool")) {
            this.a = Boolean.valueOf(this.k.getBoolean("IAGDPRBool", false));
        }
        if (this.d == null && this.k.contains("IAGdprConsentData")) {
            this.d = this.k.getString("IAGdprConsentData", null);
        }
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.o.a == null) {
            return false;
        }
        i();
        if (this.k == null) {
            return false;
        }
        IAlog.a("Saving %s value = %s to sharedPrefs", str, str2);
        this.k.edit().putString(str, str2).apply();
        return true;
    }

    public final void a(String str) {
        if (com.fyber.inneractive.sdk.util.o.a != null) {
            i();
            if (TextUtils.isEmpty(str)) {
                this.g = str;
                SharedPreferences sharedPreferences = this.k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            SharedPreferences sharedPreferences2 = this.k;
            if (sharedPreferences2 != null) {
                this.g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public final void a() {
        IAlog.a("Clearing GDPR Consent String and status", new Object[0]);
        if (com.fyber.inneractive.sdk.util.o.a == null) {
            IAlog.f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        i();
        this.a = null;
        this.d = null;
        SharedPreferences sharedPreferences = this.k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }

    public final Boolean a(Boolean bool) {
        if (this.m.a()) {
            IAlog.a("%sB.4.1: GppSID contains EU section - checking GPP Vendor 262", "ConfigDataProtectionProvider: ");
            com.fyber.inneractive.sdk.tcf.a aVar = this.m.c;
            Boolean valueOf = aVar.c ? Boolean.valueOf(aVar.f) : null;
            if (valueOf != null && valueOf.booleanValue()) {
                IAlog.a("%sB5: GDPR consent granted - GPP Vendor 262 present", "ConfigDataProtectionProvider: ");
                return Boolean.TRUE;
            }
            IAlog.a("%sB5.1: GDPR consent denied - GPP Vendor 262 not present", "ConfigDataProtectionProvider: ");
            return Boolean.FALSE;
        }
        IAlog.a("%s%s: GppSID has no EU section - returning %s", "ConfigDataProtectionProvider: ", bool == null ? "B4" : "B4.2/B4.3", bool == null ? "UNKNOWN" : "DENIED");
        return bool;
    }
}
