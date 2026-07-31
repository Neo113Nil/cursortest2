package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Ye extends AbstractC3866af {
    public final String a;
    public final Ok b;

    public Ye(String url, Ok ok) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        this.b = ok;
    }

    @Override // com.inmobi.media.AbstractC3866af
    public final Map a() {
        return null;
    }

    @Override // com.inmobi.media.AbstractC3866af
    public final Vi b() {
        return null;
    }

    @Override // com.inmobi.media.AbstractC3866af
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ye)) {
            return false;
        }
        Ye ye = (Ye) obj;
        return Intrinsics.areEqual(this.a, ye.a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.b, ye.b) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 961);
    }

    public final String toString() {
        return "HeadRequest(url=" + this.a + ", headers=" + ((Object) null) + ", timeouts=" + this.b + ", retryPolicy=" + ((Object) null) + ", followRedirects=true)";
    }
}
