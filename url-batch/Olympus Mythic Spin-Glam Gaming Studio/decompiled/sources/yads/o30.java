package yads;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;

/* loaded from: classes13.dex */
public final class o30 extends jn {
    public v30 e;
    public byte[] f;
    public int g;
    public int h;

    public o30() {
        super(false);
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        h();
        this.e = v30Var;
        Uri uri = v30Var.a;
        String scheme = uri.getScheme();
        oh.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = sb3.a;
        String[] split = schemeSpecificPart.split(StringUtils.COMMA, -1);
        if (split.length != 2) {
            throw new cc2("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new cc2("Error while parsing Base64 encoded string: " + str, e, true, 0);
            }
        } else {
            this.f = sb3.c(URLDecoder.decode(str, zt.a.name()));
        }
        long j = v30Var.f;
        byte[] bArr = this.f;
        if (j > bArr.length) {
            this.f = null;
            throw new r30(2008);
        }
        int i2 = (int) j;
        this.g = i2;
        int length = bArr.length - i2;
        this.h = length;
        long j2 = v30Var.g;
        if (j2 != -1) {
            this.h = (int) Math.min(length, j2);
        }
        b(v30Var);
        long j3 = v30Var.g;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = sb3.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        c(min);
        return min;
    }

    @Override // yads.q30
    public final void close() {
        if (this.f != null) {
            this.f = null;
            g();
        }
        this.e = null;
    }

    @Override // yads.q30
    public final Uri d() {
        v30 v30Var = this.e;
        if (v30Var != null) {
            return v30Var.a;
        }
        return null;
    }
}
