package com.vungle.ads.internal.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v2 {

    @NotNull
    public static final b2 Companion = new b2();
    public final a2 a;
    public final e2 b;
    public final h2 c;
    public final r2 d;
    public final List e;
    public final u2 f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public Long p;
    public x1 q;
    public Boolean r;

    public /* synthetic */ v2(int i, a2 a2Var, e2 e2Var, h2 h2Var, r2 r2Var, List list, u2 u2Var, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l, x1 x1Var, Boolean bool7) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = a2Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = e2Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = h2Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = r2Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = u2Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        this.h = (i & 128) == 0 ? Boolean.TRUE : bool;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = x1Var;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = bool7;
        }
    }

    public static final void a(v2 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, y1.a, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, c2.a, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, f2.a, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, p2.a, self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.e != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, new ArrayListSerializer(g3.a), self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.f != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, s2.a, self.f);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.g != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.g);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.h, Boolean.TRUE)) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.i != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.i);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.j != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.j);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.k != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, BooleanSerializer.INSTANCE, self.k);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.l != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.l);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.m != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, self.m);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.n != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, BooleanSerializer.INSTANCE, self.n);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.o != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, BooleanSerializer.INSTANCE, self.o);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.p != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, LongSerializer.INSTANCE, self.p);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.q != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, v1.a, self.q);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 17) && self.r == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 17, BooleanSerializer.INSTANCE, self.r);
    }

    public final Long b() {
        return this.p;
    }

    public final e2 c() {
        return this.b;
    }

    public final h2 d() {
        return this.c;
    }

    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Intrinsics.areEqual(this.a, v2Var.a) && Intrinsics.areEqual(this.b, v2Var.b) && Intrinsics.areEqual(this.c, v2Var.c) && Intrinsics.areEqual(this.d, v2Var.d) && Intrinsics.areEqual(this.e, v2Var.e) && Intrinsics.areEqual(this.f, v2Var.f) && Intrinsics.areEqual(this.g, v2Var.g) && Intrinsics.areEqual(this.h, v2Var.h) && Intrinsics.areEqual(this.i, v2Var.i) && Intrinsics.areEqual(this.j, v2Var.j) && Intrinsics.areEqual(this.k, v2Var.k) && Intrinsics.areEqual(this.l, v2Var.l) && Intrinsics.areEqual(this.m, v2Var.m) && Intrinsics.areEqual(this.n, v2Var.n) && Intrinsics.areEqual(this.o, v2Var.o) && Intrinsics.areEqual(this.p, v2Var.p) && Intrinsics.areEqual(this.q, v2Var.q) && Intrinsics.areEqual(this.r, v2Var.r);
    }

    public final int hashCode() {
        a2 a2Var = this.a;
        int hashCode = (a2Var == null ? 0 : a2Var.hashCode()) * 31;
        e2 e2Var = this.b;
        int hashCode2 = (hashCode + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        h2 h2Var = this.c;
        int hashCode3 = (hashCode2 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        r2 r2Var = this.d;
        int hashCode4 = (hashCode3 + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        u2 u2Var = this.f;
        int hashCode6 = (hashCode5 + (u2Var == null ? 0 : u2Var.hashCode())) * 31;
        String str = this.g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.j;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.k;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.l;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.m;
        int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.n;
        int hashCode14 = (hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.o;
        int hashCode15 = (hashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l = this.p;
        int hashCode16 = (hashCode15 + (l == null ? 0 : l.hashCode())) * 31;
        x1 x1Var = this.q;
        int hashCode17 = (hashCode16 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        Boolean bool7 = this.r;
        return hashCode17 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        return "ConfigPayload(cleverCache=" + this.a + ", configSettings=" + this.b + ", endpoints=" + this.c + ", logMetricsSettings=" + this.d + ", placements=" + this.e + ", userPrivacy=" + this.f + ", configExtension=" + this.g + ", disableAdId=" + this.h + ", isReportIncentivizedEnabled=" + this.i + ", sessionTimeout=" + this.j + ", waitForConnectivityForTPAT=" + this.k + ", signalSessionTimeout=" + this.l + ", signalsDisabled=" + this.m + ", fpdEnabled=" + this.n + ", rtaDebugging=" + this.o + ", configLastValidatedTimestamp=" + this.p + ", autoRedirect=" + this.q + ", enableOT=" + this.r + ')';
    }

    public final String a() {
        return this.g;
    }

    public final void a(Long l) {
        this.p = l;
    }
}
