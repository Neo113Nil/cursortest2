package yads;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class mw {
    public static final lw d;
    public static final /* synthetic */ mw[] e;
    public final String b;
    public final String c;

    static {
        mw[] mwVarArr = {new mw(0, "CONSENT_STRING", "IABConsent_ConsentString", "IABTCF_TCString"), new mw(1, "GDPR", "IABConsent_SubjectToGDPR", POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY), new mw(2, "CMP_PRESENT", "IABConsent_CMPPresent", "IABTCF_CmpSdkID"), new mw(3, "PURPOSE_CONSENTS", "IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"), new mw(4, "VENDOR_CONSENTS", "IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents"), new mw(5, "ADDITIONAL_CONSENT", null, "IABTCF_AddtlConsent")};
        e = mwVarArr;
        EnumEntriesKt.enumEntries(mwVarArr);
        d = new lw();
    }

    public mw(int i, String str, String str2, String str3) {
        this.b = str2;
        this.c = str3;
    }

    public static mw valueOf(String str) {
        return (mw) Enum.valueOf(mw.class, str);
    }

    public static mw[] values() {
        return (mw[]) e.clone();
    }
}
