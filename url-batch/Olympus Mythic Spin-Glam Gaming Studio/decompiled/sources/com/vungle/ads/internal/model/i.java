package com.vungle.ads.internal.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();
    public final f0 A;
    public final Boolean B;
    public final Boolean C;
    public final Integer D;
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final Boolean g;
    public final Boolean h;
    public final String i;
    public final String j;
    public final Integer k;
    public final Integer l;
    public final Map m;
    public final String n;
    public final String o;
    public final String p;
    public final List q;
    public final List r;
    public final z s;
    public final String t;
    public final v u;
    public final String v;
    public final String w;
    public final Integer x;
    public final Integer y;
    public final f z;

    public /* synthetic */ i(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, z zVar, String str10, v vVar, String str11, String str12, Integer num5, Integer num6, f fVar, f0 f0Var, Boolean bool3, Boolean bool4, Integer num7) {
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
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
            this.k = num3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = map;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str7;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str8;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str9;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = list;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = list2;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = zVar;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str10;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = vVar;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str11;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str12;
        }
        this.x = (8388608 & i) == 0 ? 0 : num5;
        this.y = (16777216 & i) == 0 ? 0 : num6;
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = fVar;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = f0Var;
        }
        this.B = (134217728 & i) == 0 ? Boolean.FALSE : bool3;
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = bool4;
        }
        this.D = (i & 536870912) == 0 ? 0 : num7;
    }

    public static final void a(i self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Integer num;
        Integer num2;
        Integer num3;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.e != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.f != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.f);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.g != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.g);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.i != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.i);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.j != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.j);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.k != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, IntSerializer.INSTANCE, self.k);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.l != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, IntSerializer.INSTANCE, self.l);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.m != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, w.a, self.m);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.n != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.n);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.o != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.o);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.p != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.p);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.q != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, new ArrayListSerializer(StringSerializer.INSTANCE), self.q);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.r != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, new ArrayListSerializer(StringSerializer.INSTANCE), self.r);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.s != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, x.a, self.s);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.t != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, self.t);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.u != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, t.a, self.u);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.v != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, self.v);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.w != null) {
            output.encodeNullableSerializableElement(serialDesc, 22, StringSerializer.INSTANCE, self.w);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 23) || (num3 = self.x) == null || num3.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 23, IntSerializer.INSTANCE, self.x);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || (num2 = self.y) == null || num2.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 24, IntSerializer.INSTANCE, self.y);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 25) || self.z != null) {
            output.encodeNullableSerializableElement(serialDesc, 25, d.a, self.z);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 26) || self.A != null) {
            output.encodeNullableSerializableElement(serialDesc, 26, d0.a, self.A);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 27) || !Intrinsics.areEqual(self.B, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 27, BooleanSerializer.INSTANCE, self.B);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 28) || self.C != null) {
            output.encodeNullableSerializableElement(serialDesc, 28, BooleanSerializer.INSTANCE, self.C);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 29) || (num = self.D) == null || num.intValue() != 0) {
            output.encodeNullableSerializableElement(serialDesc, 29, IntSerializer.INSTANCE, self.D);
        }
    }

    public final Integer b() {
        return this.l;
    }

    public final Integer c() {
        return this.d;
    }

    public final String d() {
        return this.j;
    }

    public final List e() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.a, iVar.a) && Intrinsics.areEqual(this.b, iVar.b) && Intrinsics.areEqual(this.c, iVar.c) && Intrinsics.areEqual(this.d, iVar.d) && Intrinsics.areEqual(this.e, iVar.e) && Intrinsics.areEqual(this.f, iVar.f) && Intrinsics.areEqual(this.g, iVar.g) && Intrinsics.areEqual(this.h, iVar.h) && Intrinsics.areEqual(this.i, iVar.i) && Intrinsics.areEqual(this.j, iVar.j) && Intrinsics.areEqual(this.k, iVar.k) && Intrinsics.areEqual(this.l, iVar.l) && Intrinsics.areEqual(this.m, iVar.m) && Intrinsics.areEqual(this.n, iVar.n) && Intrinsics.areEqual(this.o, iVar.o) && Intrinsics.areEqual(this.p, iVar.p) && Intrinsics.areEqual(this.q, iVar.q) && Intrinsics.areEqual(this.r, iVar.r) && Intrinsics.areEqual(this.s, iVar.s) && Intrinsics.areEqual(this.t, iVar.t) && Intrinsics.areEqual(this.u, iVar.u) && Intrinsics.areEqual(this.v, iVar.v) && Intrinsics.areEqual(this.w, iVar.w) && Intrinsics.areEqual(this.x, iVar.x) && Intrinsics.areEqual(this.y, iVar.y) && Intrinsics.areEqual(this.z, iVar.z) && Intrinsics.areEqual(this.A, iVar.A) && Intrinsics.areEqual(this.B, iVar.B) && Intrinsics.areEqual(this.C, iVar.C) && Intrinsics.areEqual(this.D, iVar.D);
    }

    public final Integer f() {
        return this.D;
    }

    public final Integer g() {
        return this.x;
    }

    public final Integer h() {
        return this.y;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.k;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.l;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Map map = this.m;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        String str7 = this.n;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.p;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.q;
        int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.r;
        int hashCode18 = (hashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        z zVar = this.s;
        int hashCode19 = (hashCode18 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        String str10 = this.t;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        v vVar = this.u;
        int hashCode21 = (hashCode20 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str11 = this.v;
        int hashCode22 = (hashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.w;
        int hashCode23 = (hashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num5 = this.x;
        int hashCode24 = (hashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.y;
        int hashCode25 = (hashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
        f fVar = this.z;
        int hashCode26 = (hashCode25 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f0 f0Var = this.A;
        int hashCode27 = (hashCode26 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        Boolean bool3 = this.B;
        int hashCode28 = (hashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.C;
        int hashCode29 = (hashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.D;
        return hashCode29 + (num7 != null ? num7.hashCode() : 0);
    }

    public final Integer i() {
        return this.k;
    }

    public final v j() {
        return this.u;
    }

    public final Map k() {
        return this.m;
    }

    public final Boolean l() {
        return this.B;
    }

    public final String m() {
        return this.n;
    }

    public final String toString() {
        return "AdUnit(id=" + this.a + ", adType=" + this.b + ", adSource=" + this.c + ", expiry=" + this.d + ", expiryDuration=" + this.e + ", deeplinkUrl=" + this.f + ", clickCoordinatesEnabled=" + this.g + ", adLoadOptimizationEnabled=" + this.h + ", mediationName=" + this.i + ", info=" + this.j + ", sleep=" + this.k + ", errorCode=" + this.l + ", tpat=" + this.m + ", vmURL=" + this.n + ", vmVersion=" + this.o + ", adMarketId=" + this.p + ", notification=" + this.q + ", loadAdUrls=" + this.r + ", viewAbility=" + this.s + ", templateType=" + this.t + ", templateSettings=" + this.u + ", creativeId=" + this.v + ", advAppId=" + this.w + ", showClose=" + this.x + ", showCloseIncentivized=" + this.y + ", adSizeInfo=" + this.z + ", webViewSettings=" + this.A + ", usePreloading=" + this.B + ", partialDownloadEnabled=" + this.C + ", maxDownloadRetryAttempts=" + this.D + ')';
    }

    public final String a() {
        return this.f;
    }
}
