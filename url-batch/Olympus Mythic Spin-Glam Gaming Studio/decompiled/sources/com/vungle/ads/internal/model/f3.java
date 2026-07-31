package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class f3 {

    @NotNull
    public static final e3 Companion = new e3();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ f3(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public static final void a(f3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.b);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.c == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.c);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return Intrinsics.areEqual(this.a, f3Var.a) && Intrinsics.areEqual(this.b, f3Var.b) && Intrinsics.areEqual(this.c, f3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("OmSdkData(params=");
        a.append(this.a);
        a.append(", vendorKey=");
        a.append(this.b);
        a.append(", vendorURL=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }

    public final String a() {
        return this.a;
    }
}
