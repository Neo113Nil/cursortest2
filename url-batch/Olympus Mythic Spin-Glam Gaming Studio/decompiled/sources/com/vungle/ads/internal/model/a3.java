package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class a3 {

    @NotNull
    public static final z2 Companion = new z2();
    public boolean a;
    public String b;
    public Integer c;
    public float d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public float l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public String q;
    public String r;
    public Long s;
    public Long t;
    public Long u;
    public Long v;
    public String w;

    public /* synthetic */ a3(int i, boolean z, String str, Integer num, float f, String str2, int i2, String str3, String str4, String str5, String str6, String str7, float f2, int i3, boolean z2, int i4, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = 0.0f;
        } else {
            this.d = f;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = 0.0f;
        } else {
            this.l = f2;
        }
        if ((i & 4096) == 0) {
            this.m = 1;
        } else {
            this.m = i3;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z2;
        }
        if ((i & 16384) == 0) {
            this.o = 1;
        } else {
            this.o = i4;
        }
        if ((32768 & i) == 0) {
            this.p = false;
        } else {
            this.p = z3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str8;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str9;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = l2;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = l3;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = l4;
        }
        if ((i & 4194304) == 0) {
            this.w = null;
        } else {
            this.w = str10;
        }
    }

    public static final void a(a3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a) {
            output.encodeBooleanElement(serialDesc, 0, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual((Object) Float.valueOf(self.d), (Object) Float.valueOf(0.0f))) {
            output.encodeFloatElement(serialDesc, 3, self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.e != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.f != 0) {
            output.encodeIntElement(serialDesc, 5, self.f);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.g != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.g);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.i != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.i);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.j != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.j);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.k != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.k);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !Intrinsics.areEqual((Object) Float.valueOf(self.l), (Object) Float.valueOf(0.0f))) {
            output.encodeFloatElement(serialDesc, 11, self.l);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.m != 1) {
            output.encodeIntElement(serialDesc, 12, self.m);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.n) {
            output.encodeBooleanElement(serialDesc, 13, self.n);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.o != 1) {
            output.encodeIntElement(serialDesc, 14, self.o);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.p) {
            output.encodeBooleanElement(serialDesc, 15, self.p);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.q != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, StringSerializer.INSTANCE, self.q);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.r != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, self.r);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.s != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, LongSerializer.INSTANCE, self.s);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.t != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, LongSerializer.INSTANCE, self.t);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.u != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, LongSerializer.INSTANCE, self.u);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.v != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, LongSerializer.INSTANCE, self.v);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 22) && self.w == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 22, StringSerializer.INSTANCE, self.w);
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.a == a3Var.a && Intrinsics.areEqual(this.b, a3Var.b) && Intrinsics.areEqual(this.c, a3Var.c) && Intrinsics.areEqual((Object) Float.valueOf(this.d), (Object) Float.valueOf(a3Var.d)) && Intrinsics.areEqual(this.e, a3Var.e) && this.f == a3Var.f && Intrinsics.areEqual(this.g, a3Var.g) && Intrinsics.areEqual(this.h, a3Var.h) && Intrinsics.areEqual(this.i, a3Var.i) && Intrinsics.areEqual(this.j, a3Var.j) && Intrinsics.areEqual(this.k, a3Var.k) && Intrinsics.areEqual((Object) Float.valueOf(this.l), (Object) Float.valueOf(a3Var.l)) && this.m == a3Var.m && this.n == a3Var.n && this.o == a3Var.o && this.p == a3Var.p && Intrinsics.areEqual(this.q, a3Var.q) && Intrinsics.areEqual(this.r, a3Var.r) && Intrinsics.areEqual(this.s, a3Var.s) && Intrinsics.areEqual(this.t, a3Var.t) && Intrinsics.areEqual(this.u, a3Var.u) && Intrinsics.areEqual(this.v, a3Var.v) && Intrinsics.areEqual(this.w, a3Var.w);
    }

    public final void f(String str) {
        this.q = str;
    }

    public final void g(String str) {
        this.w = str;
    }

    public final void h(String str) {
        this.j = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r2v31, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.b;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int hashCode2 = (Float.hashCode(this.d) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int hashCode3 = (Integer.hashCode(this.f) + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int hashCode8 = (Integer.hashCode(this.m) + ((Float.hashCode(this.l) + ((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31)) * 31;
        ?? r2 = this.n;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int hashCode9 = (Integer.hashCode(this.o) + ((hashCode8 + i2) * 31)) * 31;
        boolean z2 = this.p;
        int i3 = (hashCode9 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str8 = this.q;
        int hashCode10 = (i3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.r;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l = this.s;
        int hashCode12 = (hashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.t;
        int hashCode13 = (hashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.u;
        int hashCode14 = (hashCode13 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.v;
        int hashCode15 = (hashCode14 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str10 = this.w;
        return hashCode15 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void i(String str) {
        this.i = str;
    }

    public final void j(String str) {
        this.k = str;
    }

    public final String toString() {
        return "VungleExt(isGooglePlayServicesAvailable=" + this.a + ", appSetId=" + this.b + ", appSetIdScope=" + this.c + ", batteryLevel=" + this.d + ", batteryState=" + this.e + ", batterySaverEnabled=" + this.f + ", connectionType=" + this.g + ", connectionTypeDetail=" + this.h + ", locale=" + this.i + ", language=" + this.j + ", timeZone=" + this.k + ", volumeLevel=" + this.l + ", soundEnabled=" + this.m + ", isTv=" + this.n + ", sdCardAvailable=" + this.o + ", isSideloadEnabled=" + this.p + ", gaid=" + this.q + ", amazonAdvertisingId=" + this.r + ", sit=" + this.s + ", oit=" + this.t + ", ort=" + this.u + ", obt=" + this.v + ", gpVersion=" + this.w + ')';
    }

    public a3(boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10) {
        this.a = z;
        this.b = str;
        this.c = num;
        this.d = f;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = f2;
        this.m = i2;
        this.n = z2;
        this.o = i3;
        this.p = z3;
        this.q = str8;
        this.r = str9;
        this.s = l;
        this.t = l2;
        this.u = l3;
        this.v = l4;
        this.w = str10;
    }

    public final void b(float f) {
        this.l = f;
    }

    public final void c(int i) {
        this.m = i;
    }

    public final void d(Long l) {
        this.s = l;
    }

    public final void b(boolean z) {
        this.n = z;
    }

    public final void c(Long l) {
        this.u = l;
    }

    public final void b(int i) {
        this.o = i;
    }

    public final void b(Long l) {
        this.t = l;
    }

    public final void a(boolean z) {
        this.a = z;
    }

    public final void a(Integer num) {
        this.c = num;
    }

    public final void a(float f) {
        this.d = f;
    }

    public final void a(int i) {
        this.f = i;
    }

    public final void a() {
        this.p = false;
    }

    public /* synthetic */ a3() {
        this(false, null, null, 0.0f, null, 0, null, null, null, null, null, 0.0f, 1, false, 1, false, null, null, null, null, null, null, null);
    }

    public final void a(String str) {
        this.r = str;
    }

    public final void a(Long l) {
        this.v = l;
    }
}
