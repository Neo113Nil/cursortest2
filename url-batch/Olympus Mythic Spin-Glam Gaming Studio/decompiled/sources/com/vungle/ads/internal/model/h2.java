package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class h2 {

    @NotNull
    public static final g2 Companion = new g2();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ h2(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public static final void a(h2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.d);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.e == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return Intrinsics.areEqual(this.a, h2Var.a) && Intrinsics.areEqual(this.b, h2Var.b) && Intrinsics.areEqual(this.c, h2Var.c) && Intrinsics.areEqual(this.d, h2Var.d) && Intrinsics.areEqual(this.e, h2Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Endpoints(adsEndpoint=");
        a.append(this.a);
        a.append(", riEndpoint=");
        a.append(this.b);
        a.append(", errorLogsEndpoint=");
        a.append(this.c);
        a.append(", metricsEndpoint=");
        a.append(this.d);
        a.append(", csbEndpoint=");
        a.append(this.e);
        a.append(')');
        return a.toString();
    }
}
