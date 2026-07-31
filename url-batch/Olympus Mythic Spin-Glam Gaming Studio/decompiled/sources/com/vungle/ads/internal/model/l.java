package com.vungle.ads.internal.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();
    public final Double a;
    public final List b;
    public final List c;

    public /* synthetic */ l(int i, Double d, List list, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public static final void a(l self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, new ArrayListSerializer(StringSerializer.INSTANCE), self.b);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.c == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, new ArrayListSerializer(StringSerializer.INSTANCE), self.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) lVar.a) && Intrinsics.areEqual(this.b, lVar.b) && Intrinsics.areEqual(this.c, lVar.c);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CSBResponse(price=");
        a.append(this.a);
        a.append(", nurls=");
        a.append(this.b);
        a.append(", lurls=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }
}
