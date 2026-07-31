package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();
    public final double a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public c1(double d, int i, boolean z, String parentAuctionId, String creativeId, String adUnitId, String str) {
        Intrinsics.checkNotNullParameter(parentAuctionId, "parentAuctionId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = parentAuctionId;
        this.e = creativeId;
        this.f = adUnitId;
        this.g = str;
    }

    public static final void a(c1 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeDoubleElement(serialDesc, 0, self.a);
        output.encodeIntElement(serialDesc, 1, self.b);
        output.encodeBooleanElement(serialDesc, 2, self.c);
        output.encodeStringElement(serialDesc, 3, self.d);
        output.encodeStringElement(serialDesc, 4, self.e);
        output.encodeStringElement(serialDesc, 5, self.f);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.g == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.a), (Object) Double.valueOf(c1Var.a)) && this.b == c1Var.b && this.c == c1Var.c && Intrinsics.areEqual(this.d, c1Var.d) && Intrinsics.areEqual(this.e, c1Var.e) && Intrinsics.areEqual(this.f, c1Var.f) && Intrinsics.areEqual(this.g, c1Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + i) * 31)) * 31)) * 31)) * 31;
        String str = this.g;
        return hashCode2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CSBParam(bidfloor=");
        a.append(this.a);
        a.append(", phase=");
        a.append(this.b);
        a.append(", isVXWinner=");
        a.append(this.c);
        a.append(", parentAuctionId=");
        a.append(this.d);
        a.append(", creativeId=");
        a.append(this.e);
        a.append(", adUnitId=");
        a.append(this.f);
        a.append(", ext=");
        a.append(this.g);
        a.append(')');
        return a.toString();
    }

    public /* synthetic */ c1(int i, double d, int i2, boolean z, String str, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, a1.a.getDescriptor());
        }
        this.a = d;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }
}
