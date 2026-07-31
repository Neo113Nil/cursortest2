package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.impl.n7$$ExternalSyntheticBackport2;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ỉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1064 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f2692 = -1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final C1064 f2693;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1219 f2694;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String[] f2695;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f2696;

    static {
        StringFog.decrypt("tai7KA==\n", "1NrcW0Ztrt8=\n");
        StringFog.decrypt("acXD1g==\n", "C6qnr90+l7s=\n");
    }

    public C1064(String str, String str2, String str3, JSONObject jSONObject, C1064 c1064) {
        ArrayList arrayList;
        this.f2696 = AbstractC0471.m4008(str3);
        this.f2693 = c1064;
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("FBBnew==\n", "dWIACI1Ekqk=\n"));
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String m4008 = AbstractC0471.m4008(optJSONArray.optString(i));
                if (m4008 != null) {
                    arrayList.add(m4008);
                }
            }
        } else {
            arrayList = null;
        }
        String[] strArr = new String[arrayList.size()];
        this.f2695 = strArr;
        arrayList.toArray(strArr);
        try {
            this.f2694 = AbstractC1257.m4511(str, str3, jSONObject.optString(StringFog.decrypt("zl35Bw==\n", "rDKdfspjPIU=\n")));
        } catch (C0911 e) {
            new C1047(str, str2, str3, m4336(), StringFog.decrypt("dXe/aZux+dRCdqRojrHk0ERtomLJtg==\n", "MAXNBumRibU=\n") + this.f2696 + StringFog.decrypt("Y/JrsCU3IBoh8g==\n", "RNIKxAVbSXQ=\n") + (m4336() + e.f2204) + StringFog.decrypt("fj4=\n", "RB7NxXzNE4s=\n") + e.getMessage(), e).m4002(str);
        } catch (Throwable th) {
            String str4 = StringFog.decrypt("n23+m2PtGfmobOWadu0E/a5345Ax6g==\n", "2h+M9BHNaZg=\n") + this.f2696 + StringFog.decrypt("bC9Y\n", "SxV4HltvjkQ=\n") + th.getMessage();
            AbstractC0844.m4219(str, str4, th, new C1047(str, str2, str3, m4336(), str4));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("oFl6FfEDvKLm\n", "xiwUdoVq08w=\n"));
        sb.append(this.f2696);
        sb.append(StringFog.decrypt("2A==\n", "8JuNmgp8hJY=\n"));
        sb.append(n7$$ExternalSyntheticBackport2.m(StringFog.decrypt("2b4=\n", "9Z7aPVp/LH0=\n"), this.f2695));
        sb.append(StringFog.decrypt("IYw=\n", "CKwumELbkUY=\n"));
        C1219 c1219 = this.f2694;
        sb.append(c1219 != null ? c1219.toString() : StringFog.decrypt("L2hn\n", "VEgaL4MlUfQ=\n"));
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0954 m4337(C0785 c0785, C0880 c0880, List list) {
        HashMap hashMap;
        List asList = Arrays.asList(this.f2695);
        if (list.size() != asList.size()) {
            AbstractC0844.m4219(c0880.m4231(), this.f2696 + StringFog.decrypt("no8wMCksht/bmiUhIjeHm54=\n", "vuJVREFD4v8=\n") + asList.size() + StringFog.decrypt("hbmrD+IlePnRq/kK4jw95cC7vAHhLXm3\n", "pdjZaJdIHZc=\n") + list.size(), null, null);
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put((String) asList.get(i), list.get(i));
            }
        }
        C0785 c07852 = c0785.f1848;
        C0785 c07853 = new C0785(hashMap, c07852, this, c0785, c07852 == null);
        C1219 c1219 = this.f2694;
        if (c1219 != null) {
            return c1219.m4026(c07853, c0880);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("kkW0xg47/xihWK3AEny2G7JDrsYYO7E=\n", "1zfGqXwblnY=\n"));
        sb.append(this.f2696);
        new C1262(c0880, c07853, AbstractC1293.m4543("FuF2f7ELJNZV+z5zp18izF23dnC7GzU=\n", "MdtWEtR/TLk=\n", sb), null).m4002(c0880.m4231());
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m4336() {
        if (this.f2692 == -1) {
            C1064 c1064 = this.f2693;
            if (c1064 == null) {
                this.f2692 = 1;
            } else {
                int m4336 = c1064.m4336();
                C1219 c1219 = this.f2693.f2694;
                this.f2692 = m4336 + (c1219 != null ? c1219.mo3960() : 1) + 1;
            }
        }
        return this.f2692;
    }
}
