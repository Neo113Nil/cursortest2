package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Ze extends AbstractC3866af {
    public final String a;
    public final Map b;
    public final Ok c;
    public final Pi d;
    public final Vi e;
    public final boolean f;

    public Ze(String url, Map map, Ok ok, Pi pi, Vi vi, int i) {
        map = (i & 2) != 0 ? null : map;
        ok = (i & 4) != 0 ? null : ok;
        vi = (i & 16) != 0 ? null : vi;
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = map;
        this.c = ok;
        this.d = pi;
        this.e = vi;
        this.f = true;
    }

    @Override // com.inmobi.media.AbstractC3866af
    public final Map a() {
        return this.b;
    }

    @Override // com.inmobi.media.AbstractC3866af
    public final Vi b() {
        return this.e;
    }

    @Override // com.inmobi.media.AbstractC3866af
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ze)) {
            return false;
        }
        Ze ze = (Ze) obj;
        return Intrinsics.areEqual(this.a, ze.a) && Intrinsics.areEqual(this.b, ze.b) && Intrinsics.areEqual(this.c, ze.c) && Intrinsics.areEqual(this.d, ze.d) && Intrinsics.areEqual(this.e, ze.e) && this.f == ze.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Ok ok = this.c;
        int hashCode3 = (hashCode2 + (ok == null ? 0 : ok.hashCode())) * 31;
        Pi pi = this.d;
        int hashCode4 = (hashCode3 + (pi == null ? 0 : pi.hashCode())) * 31;
        Vi vi = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (vi != null ? vi.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PostRequest(url='" + this.a + "', headers=" + this.b + ", body=" + this.d + ", retryPolicy=" + this.e + ", timeouts=" + this.c + ", followRedirects=" + this.f + ")";
    }
}
