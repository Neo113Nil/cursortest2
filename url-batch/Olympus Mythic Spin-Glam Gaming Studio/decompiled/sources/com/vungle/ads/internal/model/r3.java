package com.vungle.ads.internal.model;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r3 {

    @NotNull
    public static final q3 Companion = new q3();
    public final String a;
    public String b;

    public /* synthetic */ r3(int i, String str, String str2) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, p3.a.getDescriptor());
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public static final void a(r3 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.a);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.b, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.b);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !Intrinsics.areEqual(r3.class, obj.getClass())) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return Intrinsics.areEqual(this.a, r3Var.a) && Intrinsics.areEqual(this.b, r3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("UnclosedAd(eventId=");
        a.append(this.a);
        a.append(", sessionId=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }

    public r3(String eventId, String sessionId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = eventId;
        this.b = sessionId;
    }

    public /* synthetic */ r3(String str) {
        this(str, "");
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }
}
