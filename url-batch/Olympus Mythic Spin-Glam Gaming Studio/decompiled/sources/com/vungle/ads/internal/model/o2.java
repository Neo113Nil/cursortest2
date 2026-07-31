package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class o2 {

    @NotNull
    public static final m2 Companion = new m2();
    public final Integer a;

    public /* synthetic */ o2(int i, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
    }

    public static final void a(o2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && Intrinsics.areEqual(this.a, ((o2) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("IABSettings(tcfStatus=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }
}
