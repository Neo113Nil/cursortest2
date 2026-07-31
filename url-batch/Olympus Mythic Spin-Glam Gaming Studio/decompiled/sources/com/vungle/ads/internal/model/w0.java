package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();
    public final String a;

    public /* synthetic */ w0(int i, String str) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, u0.a.getDescriptor());
        }
        this.a = str;
    }

    public static final void a(w0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && Intrinsics.areEqual(this.a, ((w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CCPA(status=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }

    public w0(String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.a = status;
    }
}
