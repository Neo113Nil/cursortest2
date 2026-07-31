package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class i3 {

    @NotNull
    public static final h3 Companion = new h3();
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ i3(int i, String str, boolean z, String str2) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, g3.a.getDescriptor());
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public static final void a(i3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.a);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b) {
            output.encodeBooleanElement(serialDesc, 1, self.b);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.c == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.c);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return Intrinsics.areEqual(this.c, "appopen");
    }

    public final boolean e() {
        return Intrinsics.areEqual(this.c, "banner");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return Intrinsics.areEqual(this.a, i3Var.a) && this.b == i3Var.b && Intrinsics.areEqual(this.c, i3Var.c);
    }

    public final boolean f() {
        return Intrinsics.areEqual(this.c, "in_line");
    }

    public final boolean g() {
        return Intrinsics.areEqual(this.c, "interstitial");
    }

    public final boolean h() {
        return Intrinsics.areEqual(this.c, "mrec");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.c;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return Intrinsics.areEqual(this.c, "native");
    }

    public final boolean j() {
        return Intrinsics.areEqual(this.c, "rewarded");
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Placement(referenceId=");
        a.append(this.a);
        a.append(", headerBidding=");
        a.append(this.b);
        a.append(", type=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }

    public i3(String referenceId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.a = referenceId;
        this.b = z;
        this.c = str;
    }

    public final boolean a() {
        return this.b;
    }

    public /* synthetic */ i3(String str) {
        this(str, null, false);
    }
}
