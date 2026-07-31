package com.vungle.ads.internal.model;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class b3 {

    @NotNull
    public static final x2 Companion = new x2();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public Integer j;
    public a3 k;

    public /* synthetic */ b3(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, a3 a3Var) {
        if (119 != (i & Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)) {
            PluginExceptionsKt.throwMissingFieldException(i, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, w2.a.getDescriptor());
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        this.f = i2;
        this.g = i3;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = a3Var;
        }
    }

    public static b3 a(b3 b3Var) {
        String make = b3Var.a;
        String model = b3Var.b;
        String osv = b3Var.c;
        String str = b3Var.d;
        String os = b3Var.e;
        int i = b3Var.f;
        int i2 = b3Var.g;
        String str2 = b3Var.h;
        String str3 = b3Var.i;
        Integer num = b3Var.j;
        a3 a3Var = b3Var.k;
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        return new b3(make, model, osv, str, os, i, i2, str2, str3, num, a3Var);
    }

    public final void b(int i) {
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Intrinsics.areEqual(this.a, b3Var.a) && Intrinsics.areEqual(this.b, b3Var.b) && Intrinsics.areEqual(this.c, b3Var.c) && Intrinsics.areEqual(this.d, b3Var.d) && Intrinsics.areEqual(this.e, b3Var.e) && this.f == b3Var.f && this.g == b3Var.g && Intrinsics.areEqual(this.h, b3Var.h) && Intrinsics.areEqual(this.i, b3Var.i) && Intrinsics.areEqual(this.j, b3Var.j) && Intrinsics.areEqual(this.k, b3Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (Integer.hashCode(this.g) + ((Integer.hashCode(this.f) + ((this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.j;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        a3 a3Var = this.k;
        return hashCode5 + (a3Var != null ? a3Var.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceNode(make=" + this.a + ", model=" + this.b + ", osv=" + this.c + ", carrier=" + this.d + ", os=" + this.e + ", w=" + this.f + ", h=" + this.g + ", ua=" + this.h + ", ifa=" + this.i + ", lmt=" + this.j + ", ext=" + this.k + ')';
    }

    public b3(String make, String model, String osv, String str, String os, int i, int i2, String str2, String str3, Integer num, a3 a3Var) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(osv, "osv");
        Intrinsics.checkNotNullParameter(os, "os");
        this.a = make;
        this.b = model;
        this.c = osv;
        this.d = str;
        this.e = os;
        this.f = i;
        this.g = i2;
        this.h = str2;
        this.i = str3;
        this.j = num;
        this.k = a3Var;
    }

    public static final void a(b3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.a);
        output.encodeStringElement(serialDesc, 1, self.b);
        output.encodeStringElement(serialDesc, 2, self.c);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.d);
        }
        output.encodeStringElement(serialDesc, 4, self.e);
        output.encodeIntElement(serialDesc, 5, self.f);
        output.encodeIntElement(serialDesc, 6, self.g);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.h != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.i != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.i);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.j != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.j);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.k == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, y2.a, self.k);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a(Integer num) {
        this.j = num;
    }

    public final void a(a3 a3Var) {
        this.k = a3Var;
    }

    public /* synthetic */ b3(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this(str, str2, str3, str4, str5, i, i2, str6, null, null, null);
    }
}
