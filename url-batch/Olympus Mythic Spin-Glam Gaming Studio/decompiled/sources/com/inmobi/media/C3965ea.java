package com.inmobi.media;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.inmobi.media.ea, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3965ea {
    private final boolean GPID;

    public C3965ea() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3965ea) && this.GPID == ((C3965ea) obj).GPID;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.GPID);
    }

    public final String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + ")";
    }

    public C3965ea(boolean z) {
        this.GPID = z;
    }

    public /* synthetic */ C3965ea(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
