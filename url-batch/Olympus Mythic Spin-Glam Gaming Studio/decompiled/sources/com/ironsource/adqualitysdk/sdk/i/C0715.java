package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.শ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0715 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1582 = StringFog.decrypt("xw02\n", "iSJ3J1G/d1I=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public String f1585;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public String f1586;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public String f1587;

    /* renamed from: ｋ, reason: contains not printable characters */
    public String f1588;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public String f1589;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public String f1590;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public EnumC0718 f1584 = EnumC0718.f1599;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public EnumC0724 f1583 = EnumC0724.f1645;

    public C0715(String str) {
        this.f1590 = str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4150(EnumC0718 enumC0718) {
        String str;
        String str2;
        this.f1584 = enumC0718;
        EnumC0718 enumC07182 = EnumC0718.f1594;
        if (enumC0718 != enumC07182) {
            this.f1583 = EnumC0724.f1645;
        }
        int ordinal = enumC0718.ordinal();
        if (ordinal == 1) {
            System.currentTimeMillis();
            return;
        }
        if (ordinal == 2) {
            System.currentTimeMillis();
            return;
        }
        if (ordinal == 3) {
            System.currentTimeMillis();
        } else if (ordinal != 4 && ordinal != 5) {
            return;
        }
        if (this.f1590.equals(StringFog.decrypt("EjPbw3VbiQ==\n", "RVa5lRw+/o8=\n"))) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(StringFog.decrypt("YSYLKo55JLVhJgsqjnkp\n", "TAsmB6NUCZg=\n"));
        sb3.append(this.f1590);
        String m4543 = AbstractC1293.m4543("lXDwS5EUFevaYb8=\n", "tROfJf9xdp8=\n", sb3);
        if (this.f1589 != null) {
            m4543 = m4543 + this.f1589 + " ";
        }
        sb2.append(m4543 + StringFog.decrypt("OjcqeA9OyDo6Nyp4D04=\n", "FxoHVSJj5Rc=\n"));
        sb2.append("\n");
        sb.append(sb2.toString());
        String str3 = null;
        if (this.f1590 == null || (str2 = this.f1588) == null) {
            str = null;
        } else {
            if (str2.equals(f1582) && this.f1584 != EnumC0718.f1595) {
                str2 = StringFog.decrypt("MAcqL6Y61fMWDTo=\n", "fmheD8BfoZA=\n");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f1590);
            str = AbstractC0584.m4083("LMu7ZGEXDq5/8ZBBe0E=\n", "DJj/L0Fha9w=\n", sb4, str2);
        }
        if (str != null) {
            sb.append(str.concat("\n"));
        }
        if (this.f1587 != null && this.f1586 != null) {
            str3 = StringFog.decrypt("XhyUIlENa9xkN7FxJxts3303rXZiDCOP\n", "DVjfAgdoGa8=\n") + this.f1587 + StringFog.decrypt("dIZu\n", "VKtOpmECBzo=\n") + this.f1586;
        }
        if (str3 != null) {
            sb.append(str3.concat("\n"));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(StringFog.decrypt("TX4O61RqLXo=\n", "HgpvnyEZF1o=\n"));
        EnumC0718 enumC07183 = this.f1584;
        sb5.append(enumC07183 == enumC07182 ? StringFog.decrypt("2cH+4oH8pQ==\n", "joCsrMiy4hk=\n") : enumC07183.name());
        sb5.append("\n");
        sb.append(sb5.toString());
        EnumC0718 enumC07184 = this.f1584;
        if (enumC07184 == EnumC0718.f1596 || enumC07184 == EnumC0718.f1595) {
            String decrypt = StringFog.decrypt("fQoJlW8pDr9FPRyr\n", "PG5Y4A5FZ8s=\n");
            AbstractC0580.m4081(decrypt, decrypt, sb.toString(), true);
            return;
        }
        String m4149 = m4149(this.f1583);
        if (m4149 != null) {
            sb.append(StringFog.decrypt("12nRAkotLhS6\n", "mgyicStKSy4=\n") + m4149);
        }
        String sb6 = sb.toString();
        String decrypt2 = StringFog.decrypt("eYnbM5Gk3IdBvs4N\n", "OO2KRvDItfM=\n");
        if (AbstractC0580.m4075()) {
            Log.w(AbstractC0580.m4077(decrypt2), sb6);
        } else if (AbstractC0580.m4076().shouldPrintLog(ISAdQualityLogLevel.WARNING)) {
            Log.w(AbstractC0580.m4077(decrypt2), sb6);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4149(EnumC0724 enumC0724) {
        if (enumC0724 == null) {
            return null;
        }
        int ordinal = enumC0724.ordinal();
        if (ordinal == 1) {
            return String.format(StringFog.decrypt("+ZMqdnEUm0C5knlsehGbE6/AeGBkCtJEuZMqTEY+32epgWZsYQabZZirKnNwDchfs44qIGZf1ET8\njm9ycA0=\n", "3OAKBRV/uzY=\n"), this.f1590, this.f1588, this.f1585);
        }
        if (ordinal == 2) {
            return String.format(StringFog.decrypt("72KDIl3HZ4yvY9AYduJn37kxygI54iiO6mjGBTn/Moq6ftEFfOhnmLMx1xl8rCSVpH/GEm3jNQ==\n", "yhGjcRmMR/o=\n"), this.f1590, this.f1588);
        }
        if (ordinal == 3) {
            return StringFog.decrypt("75asuXRJTrXG16y7eFkHoMWev7AxTgGvx5KmoX5f\n", "qffF1REtbsE=\n");
        }
        if (ordinal == 4) {
            return StringFog.decrypt("Mfr+5vp0rNYYu/T4+nH4x1f4+OTxde/WGOk=\n", "d5uXip8QjKI=\n");
        }
        if (ordinal != 5) {
            return null;
        }
        return StringFog.decrypt("GtJSxB9VLvwqzkvFAgIvvyzJS9gVRg==\n", "T7w5qnAiQNw=\n");
    }
}
