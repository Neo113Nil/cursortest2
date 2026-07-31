package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public /* synthetic */ g1(int i, String str, String str2, long j, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, e1.a.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }

    public static final void a(g1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.a);
        output.encodeStringElement(serialDesc, 1, self.b);
        output.encodeLongElement(serialDesc, 2, self.c);
        output.encodeStringElement(serialDesc, 3, self.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.areEqual(this.a, g1Var.a) && Intrinsics.areEqual(this.b, g1Var.b) && this.c == g1Var.c && Intrinsics.areEqual(this.d, g1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("GDPR(consentStatus=");
        a.append(this.a);
        a.append(", consentSource=");
        a.append(this.b);
        a.append(", consentTimestamp=");
        a.append(this.c);
        a.append(", consentMessageVersion=");
        a.append(this.d);
        a.append(')');
        return a.toString();
    }

    public g1(long j, String consentStatus, String consentSource, String consentMessageVersion) {
        Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
        Intrinsics.checkNotNullParameter(consentSource, "consentSource");
        Intrinsics.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
        this.a = consentStatus;
        this.b = consentSource;
        this.c = j;
        this.d = consentMessageVersion;
    }
}
