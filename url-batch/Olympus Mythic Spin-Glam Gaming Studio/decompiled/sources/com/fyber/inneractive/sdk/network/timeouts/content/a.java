package com.fyber.inneractive.sdk.network.timeouts.content;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.features.k;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes6.dex */
public final class a extends com.fyber.inneractive.sdk.network.timeouts.a {
    public final int h;

    public a(String str, String str2, int i, boolean z, String str3, r rVar) {
        int intValue;
        k kVar = (k) rVar.a(k.class);
        this.h = 0;
        Boolean c = kVar.c("reverse_retries");
        this.g = c != null ? c.booleanValue() : true;
        if (z) {
            intValue = kVar.b(str, str3);
        } else if (TextUtils.isEmpty(str3)) {
            String str4 = str + "_global_timeout";
            int i2 = k.d(str) ? 30000 : 10000;
            Integer a = kVar.a(str4);
            intValue = a != null ? a.intValue() : i2;
        } else {
            intValue = kVar.c(str, str3);
        }
        if (intValue > i) {
            if (TextUtils.isEmpty(str3)) {
                Integer a2 = kVar.a(k.a(str, str2, "retry_interval"));
                this.e = a2 != null ? a2.intValue() : 100;
                Integer a3 = kVar.a(k.a("timeout", "threshold"));
                this.f = a3 != null ? a3.intValue() : 300;
                String a4 = k.a(str, str2, "ilat");
                int i3 = k.d(str) ? 20000 : 10000;
                Integer a5 = kVar.a(a4);
                this.d = a5 != null ? a5.intValue() : i3;
            } else {
                String a6 = k.a(str, str2, "retry_interval", k.e(str3));
                Integer a7 = kVar.a(k.a("retry_interval", "all_mediators"));
                int intValue2 = a7 != null ? a7.intValue() : 100;
                Integer a8 = kVar.a(a6);
                this.e = a8 != null ? a8.intValue() : intValue2;
                String a9 = k.a("timeout", "threshold", k.e(str3));
                Integer a10 = kVar.a(k.a("timeout", "threshold", "all_mediators"));
                int intValue3 = a10 != null ? a10.intValue() : 300;
                Integer a11 = kVar.a(a9);
                this.f = a11 != null ? a11.intValue() : intValue3;
                String a12 = k.a(str, str2, "ilat", k.e(str3));
                String a13 = k.a(str, str2, "ilat", "all_mediators");
                int i4 = k.d(str) ? 20000 : 10000;
                Integer a14 = kVar.a(a13);
                i4 = a14 != null ? a14.intValue() : i4;
                Integer a15 = kVar.a(a12);
                this.d = a15 != null ? a15.intValue() : i4;
            }
        }
        int i5 = intValue - (this.f + i);
        IAlog.a("%s : LoadAdContentTimeout resolveLoadAdTimeout : usedTime: %d, global timeout: %d, timeout: %d", IAlog.a(a.class), Integer.valueOf(i), Integer.valueOf(intValue), Integer.valueOf(i5));
        this.c = Math.max(i5, 0);
        int a16 = a();
        this.a = a16;
        if (a16 == 0) {
            this.d = this.c;
        }
        IAlog.a("%s : LoadAdContentTimeout onFixedLoadAdTimeoutUpdated : Calculated: %d attempts with LeftoverTime: %d", IAlog.a(this), Integer.valueOf(this.a), 0);
        int i6 = this.a;
        if (i6 > 0) {
            int i7 = this.c;
            int i8 = this.f;
            int i9 = this.e;
            for (int i10 = 0; i10 <= i6; i10++) {
                i7 -= (this.b * i10) + this.d;
            }
            this.h = Math.max(0, i7 - ((i9 * i6) + (i8 * i6)));
        }
    }
}
