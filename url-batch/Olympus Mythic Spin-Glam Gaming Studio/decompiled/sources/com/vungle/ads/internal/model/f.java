package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();
    public final Integer a;
    public final Integer b;

    public /* synthetic */ f(int i, Integer num, Integer num2) {
        this.a = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = num2;
        }
    }

    public static final void a(f self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || (num2 = self.a) == null || num2.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || (num = self.b) == null || num.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.a, fVar.a) && Intrinsics.areEqual(this.b, fVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdSizeInfo(width=");
        a.append(this.a);
        a.append(", height=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
