package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();
    public final String a;
    public final i b;
    public final l c;

    public /* synthetic */ s(int i, String str, i iVar, l lVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = lVar;
        }
    }

    public static final void a(s self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, g.a, self.b);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.c == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, j.a, self.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.a, sVar.a) && Intrinsics.areEqual(this.b, sVar.b) && Intrinsics.areEqual(this.c, sVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l lVar = this.c;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("PlacementAdUnit(placementReferenceId=");
        a.append(this.a);
        a.append(", adMarkup=");
        a.append(this.b);
        a.append(", csb=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }
}
