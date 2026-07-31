package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Arrays;
import java.util.List;

/* compiled from: TCStringManager.java */
/* loaded from: classes3.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private a o;
    private final SharedPreferences p;
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private int f = 0;
    private int g = 0;
    private boolean h = false;
    private List<String> q = Arrays.asList(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, "IABTCF_TCString", "IABTCF_VendorConsents", "IABTCF_PurposeConsents", "IABTCF_AddtlConsent", "IABTCF_DisclosedVendors", "IABTCF_PolicyVersion");

    /* compiled from: TCStringManager.java */
    public interface a {
        void a();
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.p = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.p;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString("IABTCF_TCString", ""));
            b(this.p.getInt(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, 0));
            c(this.p.getString("IABTCF_PurposeConsents", ""));
            e(this.p.getString("IABTCF_VendorConsents", ""));
            b(this.p.getString("IABTCF_AddtlConsent", ""));
            a(this.p.getInt("IABTCF_PolicyVersion", 0));
            f(this.p.getString("IABTCF_DisclosedVendors", ""));
        }
    }

    public String b() {
        return this.a;
    }

    public void c(String str) {
        this.i = a(str, 1);
        this.j = a(str, 2);
        this.b = str;
    }

    public void d(String str) {
        this.a = str;
    }

    public void e(String str) {
        this.k = a(str, 867);
        this.c = str;
    }

    public void f(String str) {
        this.n = a(str, 867);
        this.e = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            List<String> list = this.q;
            if (list == null || list.contains(str)) {
                switch (str.hashCode()) {
                    case -2004976699:
                        if (str.equals("IABTCF_PurposeConsents")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1595774028:
                        if (str.equals("IABTCF_PolicyVersion")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1573968861:
                        if (str.equals("IABTCF_DisclosedVendors")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 83641339:
                        if (str.equals(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1218895378:
                        if (str.equals("IABTCF_TCString")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1342914771:
                        if (str.equals("IABTCF_AddtlConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1450203731:
                        if (str.equals("IABTCF_VendorConsents")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        d(sharedPreferences.getString("IABTCF_TCString", ""));
                        break;
                    case 1:
                        b(sharedPreferences.getInt(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, 0));
                        break;
                    case 2:
                        c(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
                        break;
                    case 3:
                        e(sharedPreferences.getString("IABTCF_VendorConsents", ""));
                        break;
                    case 4:
                        b(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                        break;
                    case 5:
                        a(sharedPreferences.getInt("IABTCF_PolicyVersion", 0));
                        break;
                    case 6:
                        f(sharedPreferences.getString("IABTCF_DisclosedVendors", ""));
                        break;
                }
                a aVar = this.o;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Throwable th) {
            q0.b("TCStringManager", th.getMessage());
        }
    }

    public void b(int i) {
        this.f = i;
    }

    public void b(String str) {
        this.d = str;
        if (TextUtils.isEmpty(str)) {
            this.l = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.m = false;
            return;
        }
        this.m = true;
        try {
            String[] split = str.split("~");
            if (split.length > 1) {
                if (TextUtils.isEmpty(split[1])) {
                    this.l = false;
                } else {
                    this.l = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th) {
            q0.b("TCStringManager", th.getMessage());
        }
    }

    public boolean c() {
        if (this.f == 0) {
            a(true);
            return this.h;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.k || (this.m && this.l)) && this.i && this.j);
        } else if (this.g >= 5) {
            a(this.n && this.k && this.i && this.j);
        } else {
            a(this.k && this.i && this.j);
        }
        return this.h;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.o = aVar;
        }
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(boolean z) {
        this.h = z;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i) {
        return a(str) && i <= str.length() && i >= 1 && '1' == str.charAt(i - 1);
    }
}
