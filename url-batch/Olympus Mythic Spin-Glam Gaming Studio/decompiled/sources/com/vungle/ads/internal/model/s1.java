package com.vungle.ads.internal.model;

import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s1 {

    @NotNull
    public static final r1 Companion = new r1();
    public g1 a;
    public w0 b;
    public z0 c;
    public FirstPartyData d;
    public j1 e;

    public /* synthetic */ s1(int i, g1 g1Var, w0 w0Var, z0 z0Var, FirstPartyData firstPartyData, j1 j1Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = g1Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = w0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = z0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = firstPartyData;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = j1Var;
        }
    }

    public static final void a(s1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, e1.a, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, u0.a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, x0.a, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FirstPartyData$$serializer.INSTANCE, self.d);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.e == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, h1.a, self.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Intrinsics.areEqual(this.a, s1Var.a) && Intrinsics.areEqual(this.b, s1Var.b) && Intrinsics.areEqual(this.c, s1Var.c) && Intrinsics.areEqual(this.d, s1Var.d) && Intrinsics.areEqual(this.e, s1Var.e);
    }

    public final int hashCode() {
        g1 g1Var = this.a;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        w0 w0Var = this.b;
        int hashCode2 = (hashCode + (w0Var == null ? 0 : w0Var.a.hashCode())) * 31;
        z0 z0Var = this.c;
        int hashCode3 = (hashCode2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        FirstPartyData firstPartyData = this.d;
        int hashCode4 = (hashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
        j1 j1Var = this.e;
        return hashCode4 + (j1Var != null ? j1Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("User(gdpr=");
        a.append(this.a);
        a.append(", ccpa=");
        a.append(this.b);
        a.append(", coppa=");
        a.append(this.c);
        a.append(", fpd=");
        a.append(this.d);
        a.append(", iab=");
        a.append(this.e);
        a.append(')');
        return a.toString();
    }

    public s1(g1 g1Var, w0 w0Var, z0 z0Var, FirstPartyData firstPartyData, j1 j1Var) {
        this.a = g1Var;
        this.b = w0Var;
        this.c = z0Var;
        this.d = firstPartyData;
        this.e = j1Var;
    }
}
