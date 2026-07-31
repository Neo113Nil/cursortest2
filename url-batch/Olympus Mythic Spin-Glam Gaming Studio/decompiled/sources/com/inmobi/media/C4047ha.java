package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ha, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4047ha {
    public final JSONObject a;
    public final JSONArray b;
    public final Db c;

    public C4047ha(JSONObject vitals, JSONArray logs, Db data) {
        Intrinsics.checkNotNullParameter(vitals, "vitals");
        Intrinsics.checkNotNullParameter(logs, "logs");
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = vitals;
        this.b = logs;
        this.c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4047ha)) {
            return false;
        }
        C4047ha c4047ha = (C4047ha) obj;
        return Intrinsics.areEqual(this.a, c4047ha.a) && Intrinsics.areEqual(this.b, c4047ha.b) && Intrinsics.areEqual(this.c, c4047ha.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.a + ", logs=" + this.b + ", data=" + this.c + ")";
    }
}
