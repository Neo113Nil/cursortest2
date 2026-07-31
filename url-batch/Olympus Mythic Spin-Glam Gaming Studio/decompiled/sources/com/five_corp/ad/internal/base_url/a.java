package com.five_corp.ad.internal.base_url;

import android.net.Uri;
import com.five_corp.ad.internal.cache.r;
import com.five_corp.ad.internal.hub.global.b;
import com.five_corp.ad.internal.hub.global.d;

/* loaded from: classes6.dex */
public final class a implements d {
    public String a = "adchk.fivecdm.com";
    public String b = "bc2.fivecdm.com";
    public String c = "er.fivecdm.com";
    public final com.five_corp.ad.a d;
    public final b e;

    public a(b bVar, com.five_corp.ad.a aVar) {
        this.e = bVar;
        this.d = aVar;
    }

    public static Uri.Builder a(com.five_corp.ad.a aVar, String str) {
        String str2;
        if (aVar == null) {
            return new Uri.Builder().scheme("https").authority(str);
        }
        if (aVar.c != null) {
            str2 = aVar.b + ":" + aVar.c;
        } else {
            str2 = aVar.b;
        }
        return new Uri.Builder().scheme(aVar.a).encodedAuthority(str2);
    }

    @Override // com.five_corp.ad.internal.hub.global.d
    public final void a(r rVar) {
        com.five_corp.ad.internal.media_config.b bVar = rVar.a.f;
        String str = bVar.a;
        if (str == null) {
            str = "adchk.fivecdm.com";
        }
        this.a = str;
        String str2 = bVar.b;
        if (str2 == null) {
            str2 = "bc2.fivecdm.com";
        }
        this.b = str2;
        String str3 = bVar.c;
        if (str3 == null) {
            str3 = "er.fivecdm.com";
        }
        this.c = str3;
    }
}
