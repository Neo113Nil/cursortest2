package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();
    public final int a;
    public final int b;

    public t0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static final void a(t0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.a);
        output.encodeIntElement(serialDesc, 1, self.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b == t0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdSizeParam(width=");
        a.append(this.a);
        a.append(", height=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }

    public /* synthetic */ t0(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, r0.a.getDescriptor());
        }
        this.a = i2;
        this.b = i3;
    }
}
