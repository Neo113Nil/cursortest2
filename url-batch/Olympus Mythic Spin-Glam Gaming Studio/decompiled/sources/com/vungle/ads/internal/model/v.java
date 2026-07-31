package com.vungle.ads.internal.model;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();
    public final Map a;
    public final Map b;

    public /* synthetic */ v(int i, Map map, Map map2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map2;
        }
    }

    public static final void a(v self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 0, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(StringSerializer.INSTANCE, m.a), self.b);
    }

    public final Map b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.a, vVar.a) && Intrinsics.areEqual(this.b, vVar.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("TemplateSettings(normalReplacements=");
        a.append(this.a);
        a.append(", cacheableReplacements=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }

    public final Map a() {
        return this.b;
    }
}
