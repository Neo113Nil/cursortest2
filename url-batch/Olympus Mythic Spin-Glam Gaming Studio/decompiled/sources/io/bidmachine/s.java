package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.util.SharedPreferenceUtilsKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
class s implements InterfaceC6026r {
    private final SharedPreferences.OnSharedPreferenceChangeListener b = new a();
    private Boolean c;
    private Boolean d;
    private String e;
    private String f;
    private String g;
    private String h;
    private List i;

    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            s.this.a(sharedPreferences, str);
        }
    }

    s() {
    }

    private void b(SharedPreferences sharedPreferences) {
        String optStringOrNull = SharedPreferenceUtilsKt.optStringOrNull(sharedPreferences, "IABConsent_SubjectToGDPR", null);
        this.c = optStringOrNull != null ? Boolean.valueOf(optStringOrNull.equals("1")) : null;
    }

    private void c(SharedPreferences sharedPreferences) {
        String optStringOrNull = SharedPreferenceUtilsKt.optStringOrNull(sharedPreferences, "IABGPP_GppSID", null);
        if (TextUtils.isEmpty(optStringOrNull)) {
            this.i = null;
            return;
        }
        try {
            String[] split = optStringOrNull.split("_");
            if (split.length == 0) {
                this.i = null;
                return;
            }
            this.i = new ArrayList();
            for (String str : split) {
                Integer parseIntOrDefault = Utils.parseIntOrDefault(str, (Integer) null);
                if (parseIntOrDefault != null) {
                    this.i.add(parseIntOrDefault);
                }
            }
        } catch (Throwable th) {
            Logger.w(th);
            this.i = null;
        }
    }

    private void d(SharedPreferences sharedPreferences) {
        this.h = SharedPreferenceUtilsKt.optStringOrNull(sharedPreferences, "IABGPP_HDR_GppString", null);
    }

    private void e(SharedPreferences sharedPreferences) {
        int optInt = SharedPreferenceUtilsKt.optInt(sharedPreferences, POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, -1);
        if (optInt == 1) {
            this.d = Boolean.TRUE;
        } else if (optInt == 0) {
            this.d = Boolean.FALSE;
        } else {
            this.d = null;
        }
    }

    private void f(SharedPreferences sharedPreferences) {
        this.f = SharedPreferenceUtilsKt.optStringOrNull(sharedPreferences, "IABTCF_TCString", null);
    }

    private void g(SharedPreferences sharedPreferences) {
        this.g = SharedPreferenceUtilsKt.optStringOrNull(sharedPreferences, "IABUSPrivacy_String", null);
    }

    @Override // io.bidmachine.InterfaceC6026r
    public void a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.b);
        for (String str : InterfaceC6026r.a) {
            a(defaultSharedPreferences, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SharedPreferences sharedPreferences, String str) {
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "IABTCF_gdprApplies":
                e(sharedPreferences);
                break;
            case "IABGPP_GppSID":
                c(sharedPreferences);
                break;
            case "IABUSPrivacy_String":
                g(sharedPreferences);
                break;
            case "IABConsent_ConsentString":
                a(sharedPreferences);
                break;
            case "IABTCF_TCString":
                f(sharedPreferences);
                break;
            case "IABConsent_SubjectToGDPR":
                b(sharedPreferences);
                break;
            case "IABGPP_HDR_GppString":
                d(sharedPreferences);
                break;
        }
    }

    private void a(SharedPreferences sharedPreferences) {
        this.e = SharedPreferenceUtilsKt.optStringOrNull(sharedPreferences, "IABConsent_ConsentString", null);
    }
}
