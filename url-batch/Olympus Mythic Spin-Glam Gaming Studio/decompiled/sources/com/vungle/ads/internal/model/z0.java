package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();
    public final Boolean a;

    public /* synthetic */ z0(int i, Boolean bool) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, x0.a.getDescriptor());
        }
        this.a = bool;
    }

    public static final void a(z0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Intrinsics.areEqual(this.a, ((z0) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("COPPA(isCoppa=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }

    public z0(Boolean bool) {
        this.a = bool;
    }
}
