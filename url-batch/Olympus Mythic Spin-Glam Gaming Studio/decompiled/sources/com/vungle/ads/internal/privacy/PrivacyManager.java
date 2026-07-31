package com.vungle.ads.internal.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.C4538a2;
import com.ironsource.Wa;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.ServiceLocator;
import com.vungle.ads.internal.model.n2;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.v;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager;", "", "Lcom/vungle/ads/internal/privacy/PrivacyConsent;", "consent", "", "updateCcpaConsent", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class PrivacyManager {

    @NotNull
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    public static final AtomicReference a = new AtomicReference();
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static String d;
    public static String e;
    public static String f;
    public static Long g;
    public static PrivacyConsent h;
    public static FilePreferences i;
    public static SharedPreferences j;

    public static String b() {
        String str = d;
        return str == null ? "unknown" : str;
    }

    public static COPPA c() {
        AtomicReference atomicReference = b;
        return atomicReference.get() == null ? COPPA.COPPA_NOTSET : Intrinsics.areEqual(atomicReference.get(), Boolean.TRUE) ? COPPA.COPPA_ENABLED : Intrinsics.areEqual(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    public static Boolean d() {
        Object m8023constructorimpl;
        Integer num;
        String string;
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences sharedPreferences = j;
            m8023constructorimpl = Result.m8023constructorimpl(sharedPreferences != null ? Integer.valueOf(sharedPreferences.getInt(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, -1)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            try {
                SharedPreferences sharedPreferences2 = j;
                if (sharedPreferences2 == null || (string = sharedPreferences2.getString(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, C4538a2.f)) == null) {
                    num = null;
                } else {
                    Intrinsics.checkNotNullExpressionValue(string, "getString(IABTCF_GDPR_APPLIES, \"-1\")");
                    num = Integer.valueOf(Integer.parseInt(string));
                }
                m8023constructorimpl = Result.m8023constructorimpl(num);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th2));
            }
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        Integer num2 = (Integer) m8023constructorimpl;
        if (num2 != null && num2.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num2 != null && num2.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static boolean e() {
        int a2 = v.a(a());
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        Boolean bool = (Boolean) a.get();
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public static boolean f() {
        FilePreferences filePreferences;
        if (Intrinsics.areEqual(d(), Boolean.TRUE)) {
            ConfigManager.INSTANCE.getClass();
            n2 n = ConfigManager.n();
            int i2 = n == null ? -1 : a.a[n.ordinal()];
            if (i2 != -1) {
                if (i2 == 1 || i2 == 2) {
                    return true;
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            SharedPreferences sharedPreferences = j;
            String string = sharedPreferences != null ? sharedPreferences.getString("IABTCF_TCString", "") : null;
            String str = string != null ? string : "";
            FilePreferences filePreferences2 = i;
            if (!Intrinsics.areEqual(filePreferences2 != null ? filePreferences2.c() : null, str)) {
                if (str.length() == 0 || (filePreferences = i) == null) {
                    return true;
                }
                filePreferences.a("previous_tcf_token", str).b();
                return true;
            }
        }
        return false;
    }

    public final synchronized void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AtomicBoolean atomicBoolean = c;
        if (atomicBoolean.get()) {
            boolean z = u.a;
            t.c("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        j = PreferenceManager.getDefaultSharedPreferences(context);
        FilePreferences filePreferences = (FilePreferences) ServiceLocator.d.a(context).getService(FilePreferences.class);
        i = filePreferences;
        AtomicReference atomicReference = a;
        Boolean bool = (Boolean) atomicReference.get();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            FilePreferences filePreferences2 = i;
            if (filePreferences2 != null) {
                filePreferences2.a(booleanValue, "disable_ad_id").b();
            }
        } else {
            Boolean a2 = filePreferences.a("disable_ad_id");
            if (a2 != null) {
                atomicReference.set(a2);
            }
        }
        String str = d;
        if (str != null) {
            String str2 = e;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = f;
            if (str3 == null) {
                str3 = "";
            }
            Long l = g;
            long longValue = l != null ? l.longValue() : 0L;
            FilePreferences filePreferences3 = i;
            if (filePreferences3 != null) {
                filePreferences3.a("gdpr_status", str).a("gdpr_source", str2).a("gdpr_message_version", str3).b("gdpr_timestamp", longValue).b();
            }
        } else {
            String string = filePreferences.getString("gdpr_status");
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (Intrinsics.areEqual(string, privacyConsent.getValue())) {
                string = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                if (Intrinsics.areEqual(string, privacyConsent2.getValue())) {
                    string = privacyConsent2.getValue();
                }
            }
            d = string;
            e = filePreferences.getString("gdpr_source");
            f = filePreferences.getString("gdpr_message_version");
            g = Long.valueOf(filePreferences.a("gdpr_timestamp", 0L));
        }
        PrivacyConsent privacyConsent3 = h;
        if (privacyConsent3 != null) {
            FilePreferences filePreferences4 = i;
            if (filePreferences4 != null) {
                filePreferences4.a("ccpa_status", privacyConsent3.getValue()).b();
            }
        } else {
            String string2 = filePreferences.getString("ccpa_status");
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!Intrinsics.areEqual(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            h = privacyConsent4;
        }
        AtomicReference atomicReference2 = b;
        Boolean bool2 = (Boolean) atomicReference2.get();
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            FilePreferences filePreferences5 = i;
            if (filePreferences5 != null) {
                filePreferences5.a(booleanValue2, Wa.G).b();
            }
        } else {
            Boolean a3 = filePreferences.a(Wa.G);
            if (a3 != null) {
                atomicReference2.set(a3);
            }
        }
        atomicBoolean.set(true);
    }

    public final void updateCcpaConsent(@NotNull PrivacyConsent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        h = consent;
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a("ccpa_status", consent.getValue()).b();
        }
    }

    public static void a(String consent, String source, String str) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(source, "source");
        d = consent;
        e = source;
        f = str;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        g = Long.valueOf(currentTimeMillis);
        String str2 = f;
        if (str2 == null) {
            str2 = "";
        }
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a("gdpr_status", consent).a("gdpr_source", source).a("gdpr_message_version", str2).b("gdpr_timestamp", currentTimeMillis).b();
        }
    }

    public static void a(boolean z) {
        a.set(Boolean.valueOf(z));
        FilePreferences filePreferences = i;
        if (filePreferences != null) {
            filePreferences.a(z, "disable_ad_id").b();
        }
    }

    public static int a() {
        Boolean d2 = d();
        if (Intrinsics.areEqual(d2, Boolean.TRUE)) {
            ConfigManager.INSTANCE.getClass();
            n2 n = ConfigManager.n();
            int i2 = n == null ? -1 : a.a[n.ordinal()];
            if (i2 == -1) {
                return 3;
            }
            if (i2 == 1) {
                return 2;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (d2 == null) {
            return 3;
        }
        return 1;
    }
}
