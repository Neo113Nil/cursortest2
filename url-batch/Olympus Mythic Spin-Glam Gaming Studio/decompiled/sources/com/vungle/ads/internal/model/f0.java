package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();
    public final Boolean a;
    public final Boolean b;

    public /* synthetic */ f0(int i, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
    }

    public static final void a(f0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.b);
    }

    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.areEqual(this.a, f0Var.a) && Intrinsics.areEqual(this.b, f0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("WebViewSettings(allowFileAccessFromFileUrls=");
        a.append(this.a);
        a.append(", allowUniversalAccessFromFileUrls=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }

    public final Boolean a() {
        return this.a;
    }
}
