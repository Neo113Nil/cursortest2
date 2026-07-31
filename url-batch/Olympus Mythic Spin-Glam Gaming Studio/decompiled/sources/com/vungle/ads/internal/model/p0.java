package com.vungle.ads.internal.model;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();
    public final Integer a;
    public final String b;
    public final List c;
    public final Json d;
    public final h0 e;

    public /* synthetic */ p0(int i, Integer num, String str, List list, h0 h0Var) {
        String b;
        h0 h0Var2 = null;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        Json Json$default = JsonKt.Json$default(null, n0.a, 1, null);
        this.d = Json$default;
        if ((i & 8) != 0) {
            this.e = h0Var;
            return;
        }
        if (this.b != null && (b = b()) != null) {
            KSerializer serializer = SerializersKt.serializer(Json$default.getSerializersModule(), Reflection.typeOf(h0.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            h0Var2 = (h0) Json$default.decodeFromString(serializer, b);
        }
        this.e = h0Var2;
    }

    public static final void a(p0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        h0 h0Var;
        String b;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, new ArrayListSerializer(StringSerializer.INSTANCE), self.c);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3)) {
            h0 h0Var2 = self.e;
            if (self.b == null || (b = self.b()) == null) {
                h0Var = null;
            } else {
                Json json = self.d;
                KSerializer serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(h0.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                h0Var = (h0) json.decodeFromString(serializer, b);
            }
            if (Intrinsics.areEqual(h0Var2, h0Var)) {
                return;
            }
        }
        output.encodeNullableSerializableElement(serialDesc, 3, c.a, self.e);
    }

    public final String b() {
        byte[] decode = Base64.decode(this.b, 0);
        if (decode == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decode);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read == -1) {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(gZIPInputStream, null);
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        Intrinsics.checkNotNullExpressionValue(byteArrayOutputStream2, "result.toString()");
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public final Integer c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.areEqual(this.a, p0Var.a) && Intrinsics.areEqual(this.b, p0Var.b) && Intrinsics.areEqual(this.c, p0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("BidPayload(version=");
        a.append(this.a);
        a.append(", adunit=");
        a.append(this.b);
        a.append(", impression=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }

    public final h0 a() {
        return this.e;
    }
}
