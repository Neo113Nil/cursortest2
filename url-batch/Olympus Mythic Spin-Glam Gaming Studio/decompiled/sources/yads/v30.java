package yads;

import android.net.Uri;
import com.ironsource.C4701ic;
import com.ironsource.X3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class v30 {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        go0.a("goog.exo.datasource");
    }

    public v30(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        if (j + j2 < 0) {
            throw new IllegalArgumentException();
        }
        if (j2 < 0) {
            throw new IllegalArgumentException();
        }
        if (j3 <= 0 && j3 != -1) {
            throw new IllegalArgumentException();
        }
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
        this.j = obj;
    }

    public final v30 a(long j, long j2) {
        return (j == 0 && this.g == j2) ? this : new v30(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i, this.j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.c;
        if (i == 1) {
            str = C4701ic.a;
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(X3.j.e);
        return sb.toString();
    }
}
