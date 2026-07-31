package sg.bigo.ads.ay;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.g;

/* loaded from: classes14.dex */
public class a {
    public final String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public boolean f;
    public long g;
    public long h;
    public long i;
    long m;
    public String q;
    public final boolean r;
    private c t;
    public int j = 0;
    public int k = 0;
    public long l = 0;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    private C1845a s = new C1845a();

    /* renamed from: sg.bigo.ads.ay.a$a, reason: collision with other inner class name */
    public static class C1845a {
        int a = -1;
        public boolean b = false;

        final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("support_pd_flag", Integer.valueOf(this.a));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public a(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, boolean z2, boolean z3, @Nullable c cVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z ? 1 : 0;
        this.f = z3;
        this.r = z2;
        String a = a();
        long a2 = g.a(a, 1);
        this.g = a2 <= 0 ? g.a(g.e(a), 1) : a2;
        this.a = String.valueOf(str.hashCode());
        this.t = cVar;
        c();
    }

    public final String a() {
        return this.c + File.separator + this.d;
    }

    public final boolean b() {
        return this.j == 3;
    }

    public final boolean c() {
        c cVar = this.t;
        return cVar != null && cVar.a;
    }

    public final boolean d() {
        c cVar = this.t;
        return cVar != null && cVar.b;
    }

    public final int e() {
        c cVar = this.t;
        if (cVar != null) {
            return cVar.c;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && this.d.equals(aVar.d) && this.c.equals(aVar.c);
    }

    public final int f() {
        c cVar = this.t;
        if (cVar != null) {
            return cVar.d;
        }
        return 5;
    }

    public final int g() {
        c cVar = this.t;
        if (cVar != null) {
            return cVar.e;
        }
        return 20;
    }

    public final boolean h() {
        if (this.b.endsWith(".mp4") && this.s.a == -1) {
            if (g.b(g.e(a()))) {
                this.s.a = 1;
            } else {
                this.s.a = 0;
            }
        }
        return this.s.a == 1;
    }

    @NonNull
    public String toString() {
        return " url = " + this.b + StringUtils.COMMA + " fileName = " + this.d + StringUtils.COMMA + " filePath = " + this.c + StringUtils.COMMA + " downloadCount = " + this.k + StringUtils.COMMA + " totalSize = " + this.i + StringUtils.COMMA + " loadedSize = " + this.g + StringUtils.COMMA + " mState = " + this.j + StringUtils.COMMA + " mLastDownloadEndTime = " + this.l + StringUtils.COMMA + " mExt = " + this.s.a() + StringUtils.COMMA + " contentType = " + this.q + " isSupportFillTime = " + c() + " adFillTime = " + e() + " adCheckProcessTime = " + f() + " adCheckMinProcess = " + g();
    }
}
