package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();
    public final c0 a;

    public /* synthetic */ z(int i, c0 c0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = c0Var;
        }
    }

    public static final void a(z self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, a0.a, self.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        c0 c0Var = this.a;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ViewAbility(om=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }
}
