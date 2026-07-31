package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Il {
    public final int a;
    public final Config b;

    public Il(int i, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = i;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Il)) {
            return false;
        }
        Il il = (Il) obj;
        return this.a == il.a && Intrinsics.areEqual(this.b, il.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.a + ", config=" + this.b + ")";
    }
}
