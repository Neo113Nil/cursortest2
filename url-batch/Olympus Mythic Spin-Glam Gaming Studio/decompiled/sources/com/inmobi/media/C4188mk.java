package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.mk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4188mk {
    public final String a;
    public final String b;

    public C4188mk(String tableName, String tableSchema) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(tableSchema, "tableSchema");
        this.a = tableName;
        this.b = tableSchema;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4188mk)) {
            return false;
        }
        C4188mk c4188mk = (C4188mk) obj;
        return Intrinsics.areEqual(this.a, c4188mk.a) && Intrinsics.areEqual(this.b, c4188mk.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TableInfo(tableName=" + this.a + ", tableSchema=" + this.b + ")";
    }
}
