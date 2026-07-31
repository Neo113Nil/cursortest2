package com.ogury.ad.internal;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a5 implements Serializable {
    public final b5 a;

    public a5() {
        b5 loadedSource = b5.a;
        Intrinsics.checkNotNullParameter(loadedSource, "loadedSource");
        this.a = loadedSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5) && this.a == ((a5) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadedSettings(loadedSource=" + this.a + ")";
    }

    public a5(b5 loadedSource) {
        Intrinsics.checkNotNullParameter(loadedSource, "loadedSource");
        this.a = loadedSource;
    }
}
