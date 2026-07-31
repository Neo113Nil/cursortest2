package com.vungle.ads.internal.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes15.dex */
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();
    public final List a;
    public t0 b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final c1 g;

    public /* synthetic */ p1(int i, List list, t0 t0Var, Long l, String str, String str2, String str3, c1 c1Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = t0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = c1Var;
        }
    }

    public static final void a(p1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(StringSerializer.INSTANCE), self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, r0.a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.e != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.f != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.f);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.g == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, a1.a, self.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.areEqual(this.a, p1Var.a) && Intrinsics.areEqual(this.b, p1Var.b) && Intrinsics.areEqual(this.c, p1Var.c) && Intrinsics.areEqual(this.d, p1Var.d) && Intrinsics.areEqual(this.e, p1Var.e) && Intrinsics.areEqual(this.f, p1Var.f) && Intrinsics.areEqual(this.g, p1Var.g);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        t0 t0Var = this.b;
        int hashCode2 = (hashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c1 c1Var = this.g;
        return hashCode6 + (c1Var != null ? c1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("RequestParam(placements=");
        a.append(this.a);
        a.append(", adSize=");
        a.append(this.b);
        a.append(", adStartTime=");
        a.append(this.c);
        a.append(", advAppId=");
        a.append(this.d);
        a.append(", placementReferenceId=");
        a.append(this.e);
        a.append(", user=");
        a.append(this.f);
        a.append(", csb=");
        a.append(this.g);
        a.append(')');
        return a.toString();
    }

    public p1(List list, t0 t0Var, Long l, String str, String str2, String str3, c1 c1Var) {
        this.a = list;
        this.b = t0Var;
        this.c = l;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = c1Var;
    }

    public final List a() {
        return this.a;
    }

    public final void a(t0 t0Var) {
        this.b = t0Var;
    }

    public /* synthetic */ p1(List list, Long l, String str, String str2, String str3, c1 c1Var, int i) {
        this((i & 1) != 0 ? null : list, (t0) null, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : c1Var);
    }
}
