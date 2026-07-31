package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();
    public final String a;

    public /* synthetic */ j1(int i, String str) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, h1.a.getDescriptor());
        }
        this.a = str;
    }

    public static final void a(j1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.areEqual(this.a, ((j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("IAB(tcf=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }

    public j1(String tcf) {
        Intrinsics.checkNotNullParameter(tcf, "tcf");
        this.a = tcf;
    }
}
