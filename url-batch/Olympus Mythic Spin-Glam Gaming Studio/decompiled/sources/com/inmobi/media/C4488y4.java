package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4488y4 extends AbstractC4461x4 {
    public final int a;
    public final Config b;

    public C4488y4(int i, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = i;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4488y4)) {
            return false;
        }
        C4488y4 c4488y4 = (C4488y4) obj;
        return this.a == c4488y4.a && Intrinsics.areEqual(this.b, c4488y4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.a + ", config=" + this.b + ")";
    }
}
