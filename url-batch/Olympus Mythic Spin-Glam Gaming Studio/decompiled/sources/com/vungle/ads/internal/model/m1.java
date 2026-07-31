package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();
    public final String a;
    public String b;
    public final Long c;

    public /* synthetic */ m1(int i, String str, String str2, Long l) {
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
            this.c = l;
        }
    }

    public static final void a(m1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
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
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Intrinsics.areEqual(this.a, m1Var.a) && Intrinsics.areEqual(this.b, m1Var.b) && Intrinsics.areEqual(this.c, m1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("RequestExt(configExtension=");
        a.append(this.a);
        a.append(", signals=");
        a.append(this.b);
        a.append(", configLastValidatedTimestamp=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }

    public m1(String str, String str2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }
}
