package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ῒ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1094 extends AbstractC1100 implements InterfaceC1077 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public String f2798;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public boolean f2799;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public String f2802;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2796 = StringFog.decrypt("6G/qGhzEA63LTu8HHA==\n", "pQqOc32wasI=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2795 = StringFog.decrypt("cRQo79Ecz/VhBTPe8BPM9Q==\n", "AnFcrL5yoZA=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2794 = StringFog.decrypt("OneqtvsUg5g+ZrGH2huAmA==\n", "XRLe9ZR67f0=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2793 = StringFog.decrypt("dyRSSfwrzghwJEJK/DvQBnYqaGX0Kg==\n", "BEEmBJlPp2k=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f2792 = StringFog.decrypt("5pErW0iuecT1kTtYSL5nyvOfEXdArw==\n", "gfRfFi3KEKU=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2791 = StringFog.decrypt("Bm0+uvdEsJUQZj+e\n", "dQhK+5MW1eM=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f2790 = StringFog.decrypt("rhqX1HyjL2WsEZbw\n", "yX/jlRjxShM=\n");

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f2789 = StringFog.decrypt("nNtrAkI7Zg+DzXw5VBh9Ios=\n", "774fSzF9E2M=\n");

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f2788 = StringFog.decrypt("0JXPqvWSCbHbg9iR47ESnNM=\n", "t/C744bUfN0=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f2787 = StringFog.decrypt("qGwSQuaoOT22bAhmw60=\n", "2wlmEorJWlg=\n");

    /* renamed from: סּ, reason: contains not printable characters */
    public static final String f2786 = StringFog.decrypt("VHq+1rd5ElBeeqTyknw=\n", "Mx/KhtsYcTU=\n");

    /* renamed from: טּ, reason: contains not printable characters */
    public static final String f2785 = StringFog.decrypt("kQvSDZ+p9wGWAcs=\n", "4m6mROzqgnI=\n");

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2784 = StringFog.decrypt("QwxUdyqYr/ZQBk0=\n", "JGkgPlnb2oU=\n");

    /* renamed from: 爫, reason: contains not printable characters */
    public static final String f2783 = StringFog.decrypt("3UtM8q1DXYDZT0vEmlpZis5gWd26\n", "ui44sN8sPOQ=\n");

    /* renamed from: 乁, reason: contains not printable characters */
    public static final String f2782 = StringFog.decrypt("qVYn3AUg\n", "3Tltr2pOA3Q=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public String f2801 = "";

    /* renamed from: ｋ, reason: contains not printable characters */
    public double f2800 = -1.0d;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public boolean f2797 = false;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m4392() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit2.put(AbstractC1183.f3068, this.f2802);
            double d = this.f2800;
            if (d > -1.0d) {
                jsonObjectInit2.put(AbstractC1183.f3018, d);
            }
            jsonObjectInit2.put(AbstractC1183.f3017, this.f2798);
        } catch (JSONException unused) {
        }
        try {
            if (jsonObjectInit2.length() > 0) {
                if (this.f2797) {
                    jsonObjectInit2.put(AbstractC1183.f3016, true);
                }
                jsonObjectInit.put(AbstractC1183.f3019, jsonObjectInit2);
            }
        } catch (JSONException unused2) {
        }
        return jsonObjectInit;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4393() {
        String decrypt = this.f2799 ? StringFog.decrypt("UkTGekC7841RXw==\n", "NDGqFjPYgeg=\n") : StringFog.decrypt("jKdgsmOK\n", "7sYO3Ab4YAo=\n");
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("q4OSjxmf0puoyA==\n", "xub25njru/Q=\n"));
        sb.append(this.f2801);
        return AbstractC0584.m4083("EQ==\n", "P9vUDRxWft8=\n", sb, decrypt);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1077
    /* renamed from: ﾒ */
    public final Object mo4016(C0880 c0880, String str, ArrayList arrayList, C1189 c1189, C0785 c0785) {
        char c;
        try {
            switch (str.hashCode()) {
                case -2010356102:
                    if (str.equals(f2783)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1679773410:
                    if (str.equals(f2787)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1457409854:
                    if (str.equals(f2794)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1033133001:
                    if (str.equals(f2791)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -869156349:
                    if (str.equals(f2782)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -303276684:
                    if (str.equals(f2792)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 91962794:
                    if (str.equals(f2786)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 701278346:
                    if (str.equals(f2789)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1006114614:
                    if (str.equals(f2795)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1009851624:
                    if (str.equals(f2793)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1314266045:
                    if (str.equals(f2785)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1402845873:
                    if (str.equals(f2784)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1641431166:
                    if (str.equals(f2788)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1712841667:
                    if (str.equals(f2790)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Exception e) {
            AbstractC0844.m4219(c0880.m4231(), AbstractC1293.m4543("lw==\n", "sIKry3mR7Jw=\n", AbstractC0446.m4006("c7Nxw1IgG75frWaMRXgJtUO1asJHICGzUqhi2ElvApJXtWKMTmEYv0CkI8FFdAS5UuEk\n", "NsEDrCAAbNY=\n", new StringBuilder(), str)), e, null);
        }
        switch (c) {
            case 0:
                this.f2802 = (String) AbstractC1100.m4401(arrayList, 0, String.class);
                return null;
            case 1:
                return this.f2802;
            case 2:
                this.f2801 = (String) AbstractC1100.m4401(arrayList, 0, String.class);
                return null;
            case 3:
                return this.f2801;
            case 4:
                this.f2800 = ((Double) AbstractC1100.m4401(arrayList, 0, Double.class)).doubleValue();
                return null;
            case 5:
                return Double.valueOf(this.f2800);
            case 6:
                this.f2799 = ((Boolean) AbstractC1100.m4401(arrayList, 0, Boolean.class)).booleanValue();
                return null;
            case 7:
                return Boolean.valueOf(this.f2799);
            case '\b':
                this.f2798 = (String) AbstractC1100.m4401(arrayList, 0, String.class);
                return null;
            case '\t':
                return this.f2798;
            case '\n':
                this.f2797 = ((Boolean) AbstractC1100.m4401(arrayList, 0, Boolean.class)).booleanValue();
            case 11:
                return Boolean.valueOf(this.f2797);
            case '\f':
                return m4393();
            case '\r':
                return m4392();
            default:
                new C0789(c0880, c0785, f2796, str).m4002(c0880.m4231());
                return null;
        }
    }
}
