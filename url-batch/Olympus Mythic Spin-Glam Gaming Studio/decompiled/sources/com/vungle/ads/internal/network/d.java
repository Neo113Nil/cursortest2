package com.vungle.ads.internal.network;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public final g a;
    public final Map b;
    public final String c;
    public int d;
    public int e;
    public String f;

    public /* synthetic */ d(int i, g gVar, Map map, String str, int i2, int i3, String str2) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, b.a.getDescriptor());
        }
        this.a = (i & 1) == 0 ? g.GET : gVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        this.e = i3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public static d a(d dVar, int i) {
        g method = dVar.a;
        Map map = dVar.b;
        String str = dVar.c;
        int i2 = dVar.e;
        String str2 = dVar.f;
        Intrinsics.checkNotNullParameter(method, "method");
        return new d(method, map, str, i, i2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && Intrinsics.areEqual(this.f, dVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (Integer.hashCode(this.e) + ((Integer.hashCode(this.d) + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("FailedTpat(method=");
        a.append(this.a);
        a.append(", headers=");
        a.append(this.b);
        a.append(", body=");
        a.append(this.c);
        a.append(", retryAttempt=");
        a.append(this.d);
        a.append(", retryCount=");
        a.append(this.e);
        a.append(", tpatKey=");
        a.append(this.f);
        a.append(')');
        return a.toString();
    }

    public static final void a(d self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != g.GET) {
            output.encodeSerializableElement(serialDesc, 0, e.a, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != 0) {
            output.encodeIntElement(serialDesc, 3, self.d);
        }
        output.encodeIntElement(serialDesc, 4, self.e);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.f == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.f);
    }

    public d(g method, Map map, String str, int i, int i2, String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.a = method;
        this.b = map;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    public final int a() {
        return this.d;
    }
}
