package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u2 {

    @NotNull
    public static final t2 Companion = new t2();
    public final k2 a;
    public final o2 b;

    public /* synthetic */ u2(int i, k2 k2Var, o2 o2Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = k2Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = o2Var;
        }
    }

    public static final void a(u2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, i2.a, self.a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, l2.a, self.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return Intrinsics.areEqual(this.a, u2Var.a) && Intrinsics.areEqual(this.b, u2Var.b);
    }

    public final int hashCode() {
        k2 k2Var = this.a;
        int hashCode = (k2Var == null ? 0 : k2Var.hashCode()) * 31;
        o2 o2Var = this.b;
        return hashCode + (o2Var != null ? o2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("UserPrivacy(gdpr=");
        a.append(this.a);
        a.append(", iab=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
