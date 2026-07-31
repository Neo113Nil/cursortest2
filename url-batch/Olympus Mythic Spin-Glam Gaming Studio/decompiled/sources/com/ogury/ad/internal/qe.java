package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class qe {
    public final JSONObject a;
    public final String b;
    public final String c;

    public qe(JSONObject profigRequestBody, String str, String str2) {
        Intrinsics.checkNotNullParameter(profigRequestBody, "profigRequestBody");
        this.a = profigRequestBody;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj;
        return Intrinsics.areEqual(this.a, qeVar.a) && Intrinsics.areEqual(this.b, qeVar.b) && Intrinsics.areEqual(this.c, qeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ProfigRequest(profigRequestBody=" + this.a + ", profigRequestBodyHash=" + this.b + ", privacyCompliancySectionHash=" + this.c + ")";
    }
}
