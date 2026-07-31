package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ƫ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0404 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0916 f224;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f225;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f226;

    static {
        StringFog.decrypt("DmQCCObFBqA/ZAYF\n", "TQVhYIOWcs8=\n");
    }

    public C0404(C0916 c0916, String str, String str2) {
        this.f225 = str2;
        this.f226 = str;
        this.f224 = c0916;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m3997(C0404 c0404) {
        c0404.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("23QonQ0hx97qdCyQSFo=\n", "mBVL9Whys7E=\n"));
        sb.append(c0404.f226);
        return AbstractC1293.m4543("sQ==\n", "mIY+V+H1Bpo=\n", sb);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3998(C0515 c0515, C1151 c1151) {
        synchronized (this) {
        }
        C0916.m4240().post(new C0419(this, c0515, c1151));
    }
}
