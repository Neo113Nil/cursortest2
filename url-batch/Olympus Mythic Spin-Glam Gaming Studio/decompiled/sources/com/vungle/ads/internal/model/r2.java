package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r2 {

    @NotNull
    public static final q2 Companion = new q2();
    public final Integer a;
    public final Boolean b;

    public /* synthetic */ r2(int i, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public static final void a(r2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return Intrinsics.areEqual(this.a, r2Var.a) && Intrinsics.areEqual(this.b, r2Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("LogMetricsSettings(errorLogLevel=");
        a.append(this.a);
        a.append(", metricsEnabled=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
