package com.five_corp.ad.internal.http;

import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import com.ironsource.C4701ic;
import io.bidmachine.util.network.NetworkUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* loaded from: classes12.dex */
public final class d {
    public final com.five_corp.ad.internal.http.connection.b a;

    public d(com.five_corp.ad.internal.http.connection.b bVar) {
        this.a = bVar;
    }

    public final com.five_corp.ad.internal.util.b a(String str, String str2, String str3, String str4, String str5) {
        com.five_corp.ad.internal.util.b bVar;
        String str6;
        com.five_corp.ad.internal.util.b a;
        String str7;
        if (str3 != null) {
            " with body ".concat(str3);
        }
        com.five_corp.ad.internal.util.b a2 = this.a.a(str, str2, str3, null, "gzip, deflate", str4, str5, 10000, 10000);
        if (!a2.a) {
            return new com.five_corp.ad.internal.util.b(false, a2.b, null);
        }
        com.five_corp.ad.internal.http.connection.a aVar = (com.five_corp.ad.internal.http.connection.a) a2.c;
        com.five_corp.ad.internal.util.c a3 = aVar.a();
        if (!a3.a) {
            return new com.five_corp.ad.internal.util.b(false, a3.b, null);
        }
        com.five_corp.ad.internal.util.b c = aVar.c();
        if (c.a) {
            int intValue = ((Integer) c.c).intValue();
            if (200 > intValue || intValue >= 300) {
                if (300 > intValue || intValue >= 400) {
                    bVar = new com.five_corp.ad.internal.util.b(true, null, new c(intValue));
                } else {
                    try {
                        str6 = aVar.a.getHeaderField(NetworkUtils.HEADER_LOCATION);
                    } catch (Throwable unused) {
                        str6 = null;
                    }
                    if (str6 == null) {
                        bVar = new com.five_corp.ad.internal.util.b(true, null, new c(intValue));
                    } else {
                        try {
                            a = a(new URL(new URL(str), str6).toString(), C4701ic.a, null, null, str5);
                        } catch (MalformedURLException e) {
                            bVar = new com.five_corp.ad.internal.util.b(false, new l(m.t5, null, e), null);
                        }
                    }
                }
                a = bVar;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                while (true) {
                    com.five_corp.ad.internal.util.b a4 = aVar.a(bArr);
                    if (!a4.a) {
                        a = new com.five_corp.ad.internal.util.b(false, a4.b, null);
                        break;
                    }
                    int intValue2 = ((Integer) a4.c).intValue();
                    if (intValue2 > 0) {
                        byteArrayOutputStream.write(bArr, 0, intValue2);
                    } else {
                        try {
                            byteArrayOutputStream.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                str7 = aVar.a.getContentType();
                            } catch (Throwable unused2) {
                                str7 = null;
                            }
                            bVar = (str7 == null || !(str7.contains("text/") || str7.contains("javascript") || str7.contains("ecmascript") || str7.contains("application/json"))) ? new com.five_corp.ad.internal.util.b(true, null, new c(intValue, byteArray)) : new com.five_corp.ad.internal.util.b(true, null, new c(intValue, new String(byteArray, StandardCharsets.UTF_8)));
                        } catch (IOException e2) {
                            a = new com.five_corp.ad.internal.util.b(false, new l(m.s5, null, e2), null);
                        }
                    }
                }
                a = bVar;
            }
        } else {
            l lVar = c.b;
            int i = lVar.a.a;
            a = new com.five_corp.ad.internal.util.b(false, lVar, null);
        }
        aVar.b();
        return a;
    }
}
