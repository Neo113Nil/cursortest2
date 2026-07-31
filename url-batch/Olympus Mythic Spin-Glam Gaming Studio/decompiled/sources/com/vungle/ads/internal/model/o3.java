package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class o3 {

    @NotNull
    public static final n3 Companion = new n3();
    public final b3 a;
    public final s1 b;
    public final m1 c;
    public final l3 d;
    public final int e;

    public /* synthetic */ o3(int i, b3 b3Var, s1 s1Var, m1 m1Var, l3 l3Var, int i2) {
        if (17 != (i & 17)) {
            PluginExceptionsKt.throwMissingFieldException(i, 17, m3.a.getDescriptor());
        }
        this.a = b3Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = s1Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = m1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3Var;
        }
        this.e = i2;
    }

    public static final void a(o3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, w2.a, self.a);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, q1.a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, k1.a, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, j3.a, self.d);
        }
        output.encodeIntElement(serialDesc, 4, self.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.areEqual(this.a, o3Var.a) && Intrinsics.areEqual(this.b, o3Var.b) && Intrinsics.areEqual(this.c, o3Var.c) && Intrinsics.areEqual(this.d, o3Var.d) && this.e == o3Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s1 s1Var = this.b;
        int hashCode2 = (hashCode + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        m1 m1Var = this.c;
        int hashCode3 = (hashCode2 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        l3 l3Var = this.d;
        return Integer.hashCode(this.e) + ((hashCode3 + (l3Var != null ? l3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("RtbToken(device=");
        a.append(this.a);
        a.append(", user=");
        a.append(this.b);
        a.append(", ext=");
        a.append(this.c);
        a.append(", request=");
        a.append(this.d);
        a.append(", ordinalView=");
        a.append(this.e);
        a.append(')');
        return a.toString();
    }

    public o3(b3 device, s1 s1Var, m1 m1Var, l3 l3Var, int i) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.a = device;
        this.b = s1Var;
        this.c = m1Var;
        this.d = l3Var;
        this.e = i;
    }
}
