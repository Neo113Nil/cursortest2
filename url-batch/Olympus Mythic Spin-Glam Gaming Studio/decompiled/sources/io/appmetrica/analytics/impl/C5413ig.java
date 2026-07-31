package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5413ig implements Lo {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.Lo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(C5381h9 c5381h9, C5804xh c5804xh) {
        C5751vg c5751vg;
        int a;
        if (!StringUtils.isNullOrEmpty(c5381h9.b)) {
            try {
                byte[] decode = Base64.decode(c5381h9.b, 0);
                if (decode != null && decode.length != 0) {
                    c5751vg = new C5751vg(decode);
                    C5622qg c5622qg = new C5622qg();
                    String str = c5751vg.a;
                    c5622qg.a = str != null ? new byte[0] : str.getBytes();
                    c5622qg.c = c5751vg.b;
                    c5622qg.b = c5751vg.c;
                    a = AbstractC5251c8.a(c5751vg.d);
                    int i = 1;
                    if (a != 1) {
                        i = 2;
                        if (a != 2) {
                            i = 0;
                        }
                    }
                    c5622qg.d = i;
                    return MessageNano.toByteArray(c5622qg);
                }
                c5751vg = null;
                C5622qg c5622qg2 = new C5622qg();
                String str2 = c5751vg.a;
                c5622qg2.a = str2 != null ? new byte[0] : str2.getBytes();
                c5622qg2.c = c5751vg.b;
                c5622qg2.b = c5751vg.c;
                a = AbstractC5251c8.a(c5751vg.d);
                int i2 = 1;
                if (a != 1) {
                }
                c5622qg2.d = i2;
                return MessageNano.toByteArray(c5622qg2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
