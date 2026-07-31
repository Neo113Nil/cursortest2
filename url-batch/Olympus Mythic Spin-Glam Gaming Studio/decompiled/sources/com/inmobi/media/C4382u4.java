package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4382u4 {
    public final String a;
    public final Config b;

    public C4382u4(String url, Config availableConfig) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(availableConfig, "availableConfig");
        this.a = url;
        this.b = availableConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4382u4) && Intrinsics.areEqual(this.b.getType(), ((C4382u4) obj).b.getType());
    }

    public final int hashCode() {
        return this.b.getType().hashCode();
    }
}
