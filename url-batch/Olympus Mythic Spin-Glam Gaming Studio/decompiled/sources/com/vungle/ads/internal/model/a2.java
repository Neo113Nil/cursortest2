package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class a2 {

    @NotNull
    public static final z1 Companion = new z1();
    public final Long a;
    public final Integer b;

    public /* synthetic */ a2(int i, Long l, Integer num) {
        this.a = (i & 1) == 0 ? 1000L : l;
        if ((i & 2) == 0) {
            this.b = 3;
        } else {
            this.b = num;
        }
    }

    public static final void a(a2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Integer num;
        Long l;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || (l = self.a) == null || l.longValue() != 1000) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (num = self.b) == null || num.intValue() != 3) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Intrinsics.areEqual(this.a, a2Var.a) && Intrinsics.areEqual(this.b, a2Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CleverCache(diskSize=");
        a.append(this.a);
        a.append(", diskPercentage=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
