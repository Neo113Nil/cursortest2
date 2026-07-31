package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class e2 {

    @NotNull
    public static final d2 Companion = new d2();
    public final Long a;

    public /* synthetic */ e2(int i, Long l) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
    }

    public static final void a(e2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && Intrinsics.areEqual(this.a, ((e2) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ConfigSettings(refreshTime=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }

    public final Long a() {
        return this.a;
    }
}
