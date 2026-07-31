package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t1 {

    @NotNull
    public static final d1 Companion = new d1();
    public final b3 a;
    public final l0 b;
    public final s1 c;
    public m1 d;
    public p1 e;

    public /* synthetic */ t1(int i, b3 b3Var, l0 l0Var, s1 s1Var, m1 m1Var, p1 p1Var) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, q0.a.getDescriptor());
        }
        this.a = b3Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = s1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = m1Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = p1Var;
        }
    }

    public static final void a(t1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, w2.a, self.a);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, j0.a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, q1.a, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, k1.a, self.d);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.e == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, n1.a, self.e);
    }

    public final m1 b() {
        return this.d;
    }

    public final p1 c() {
        return this.e;
    }

    public final s1 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return Intrinsics.areEqual(this.a, t1Var.a) && Intrinsics.areEqual(this.b, t1Var.b) && Intrinsics.areEqual(this.c, t1Var.c) && Intrinsics.areEqual(this.d, t1Var.d) && Intrinsics.areEqual(this.e, t1Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l0 l0Var = this.b;
        int hashCode2 = (hashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        s1 s1Var = this.c;
        int hashCode3 = (hashCode2 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        m1 m1Var = this.d;
        int hashCode4 = (hashCode3 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        p1 p1Var = this.e;
        return hashCode4 + (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CommonRequestBody(device=");
        a.append(this.a);
        a.append(", app=");
        a.append(this.b);
        a.append(", user=");
        a.append(this.c);
        a.append(", ext=");
        a.append(this.d);
        a.append(", request=");
        a.append(this.e);
        a.append(')');
        return a.toString();
    }

    public t1(b3 device, l0 l0Var, s1 s1Var, m1 m1Var, p1 p1Var) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.a = device;
        this.b = l0Var;
        this.c = s1Var;
        this.d = m1Var;
        this.e = p1Var;
    }

    public final b3 a() {
        return this.a;
    }

    public final void a(m1 m1Var) {
        this.d = m1Var;
    }

    public final void a(p1 p1Var) {
        this.e = p1Var;
    }

    public /* synthetic */ t1(b3 b3Var, l0 l0Var, s1 s1Var) {
        this(b3Var, l0Var, s1Var, null, null);
    }
}
