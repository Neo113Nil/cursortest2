package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x1 {

    @NotNull
    public static final w1 Companion = new w1();
    public final Boolean a;
    public final Long b;

    public /* synthetic */ x1(int i, Boolean bool, Long l) {
        this.a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = l;
        }
    }

    public static final void a(x1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Long l;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.a, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (l = self.b) == null || l.longValue() != Long.MAX_VALUE) {
            output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.areEqual(this.a, x1Var.a) && Intrinsics.areEqual(this.b, x1Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AutoRedirect(allowAutoRedirect=");
        a.append(this.a);
        a.append(", afterClickDuration=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
