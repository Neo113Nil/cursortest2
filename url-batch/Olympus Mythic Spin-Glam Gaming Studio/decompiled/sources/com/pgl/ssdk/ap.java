package com.pgl.ssdk;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes13.dex */
public class ap extends am {
    private Context n;
    private final int o;

    public ap(Context context, int i) {
        super(context);
        this.n = context;
        this.o = i;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        StringBuilder sb;
        String str;
        int i = this.o;
        if (i == 222) {
            sb = new StringBuilder("/ssdk/v2/r?os=0&ver=8.1.0.0.overseas-rc.2&mode=1&app_ver=");
            sb.append(ab.h(this.n));
            sb.append("&region=");
            sb.append(ad.a());
            sb.append("&did=");
            sb.append(com.pgl.ssdk.ces.b.b());
            sb.append("&aid=");
            str = com.pgl.ssdk.ces.b.a();
        } else {
            if (i != 301) {
                return null;
            }
            sb = new StringBuilder("/ssdk/sd/token?os=android&app_id=");
            sb.append(com.pgl.ssdk.ces.b.a());
            sb.append("&did=");
            sb.append(com.pgl.ssdk.ces.b.b());
            sb.append("&app_ver=");
            sb.append(ab.h(this.n));
            str = "&platform=android&ver=8.1.0.0.overseas-rc.2&mode=1";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.pgl.ssdk.am
    public void a(int i, byte[] bArr) {
        try {
            int i2 = this.o;
            if (i2 == 222) {
                ((Integer) com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null, bArr)).intValue();
            } else if (i2 == 301) {
                a4.a(bArr);
            }
        } catch (Throwable unused) {
        }
    }
}
