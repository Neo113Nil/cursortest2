package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἷ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1079 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2725;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2726;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2727;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2728 = StringFog.decrypt("2Dtek2qVdkXpEFmObpRuT9g7XptmkQ==\n", "m1Qw/Q/2Aio=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f2729;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List f2730;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final EnumC1097 f2731;

    static {
        StringFog.decrypt("2ms8gg==\n", "rhJM548FUEg=\n");
        StringFog.decrypt("SGY=\n", "PghI0IcEkaA=\n");
        StringFog.decrypt("TUquXMs4\n", "Py/PL6RWZao=\n");
        f2727 = StringFog.decrypt("v4DtxVA=\n", "3uKCszVDSZQ=\n");
        f2726 = StringFog.decrypt("H61S/uU=\n", "fcg+kZJbcXc=\n");
        f2725 = StringFog.decrypt("26Fa5UA=\n", "vtk7hjQRNd0=\n");
    }

    public C1079(JSONObject jSONObject) {
        char c;
        String optString = jSONObject.optString(StringFog.decrypt("1jyx5Q==\n", "okXBgFO3IXI=\n"));
        int hashCode = optString.hashCode();
        if (hashCode == 92611485) {
            if (optString.equals(f2727)) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 93621297) {
            if (hashCode == 96946943 && optString.equals(f2725)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (optString.equals(f2726)) {
                c = 2;
            }
            c = 65535;
        }
        this.f2731 = c != 0 ? c != 1 ? c != 2 ? EnumC1097.f2807 : EnumC1097.f2805 : EnumC1097.f2806 : EnumC1097.f2804;
        String optString2 = jSONObject.optString(StringFog.decrypt("+8M=\n", "ja0HQd2ODAk=\n"));
        this.f2730 = TextUtils.isEmpty(optString2) ? new ArrayList() : Arrays.asList(optString2.split(StringFog.decrypt("sQ==\n", "ne+1TCyPfh0=\n")));
        String optString3 = jSONObject.optString(StringFog.decrypt("qF5RRnkO\n", "2jswNRZgCtY=\n"));
        this.f2729 = (TextUtils.isEmpty(optString3) || optString3.equals(StringFog.decrypt("enTgwQ==\n", "FAGMrSUNN5E=\n"))) ? null : optString3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4366(String str) {
        int ordinal;
        try {
            ordinal = this.f2731.ordinal();
        } catch (Exception e) {
            AbstractC0577.m4068(f2728, StringFog.decrypt("9SOWO+CjGt2QIow75+8X99kihTb+5g==\n", "sFHkVJKDc7M=\n"), (Throwable) e, false);
        }
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return false;
                }
                return this.f2730.contains(str);
            }
            if (this.f2730.size() > 0) {
                return AbstractC1246.m4506(str, (String) this.f2730.get(0)) < 0;
            }
        }
        return this.f2730.size() > 0 && AbstractC1246.m4506(str, (String) this.f2730.get(0)) >= 0;
    }
}
