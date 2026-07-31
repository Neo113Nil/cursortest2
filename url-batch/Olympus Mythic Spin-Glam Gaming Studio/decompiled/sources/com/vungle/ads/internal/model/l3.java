package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class l3 {

    @NotNull
    public static final k3 Companion = new k3();
    public final String a;

    public /* synthetic */ l3(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public static final void a(l3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3) && Intrinsics.areEqual(this.a, ((l3) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("RtbRequest(sdkUserAgent=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }

    public l3(String str) {
        this.a = str;
    }
}
