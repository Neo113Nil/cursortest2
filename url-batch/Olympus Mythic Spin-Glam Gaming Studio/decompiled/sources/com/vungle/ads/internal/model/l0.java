package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ l0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, j0.a.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final void a(l0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.a);
        output.encodeStringElement(serialDesc, 1, self.b);
        output.encodeStringElement(serialDesc, 2, self.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.areEqual(this.a, l0Var.a) && Intrinsics.areEqual(this.b, l0Var.b) && Intrinsics.areEqual(this.c, l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AppNode(bundle=");
        a.append(this.a);
        a.append(", ver=");
        a.append(this.b);
        a.append(", appId=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }

    public l0(String bundle, String ver, String appId) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(ver, "ver");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.a = bundle;
        this.b = ver;
        this.c = appId;
    }
}
