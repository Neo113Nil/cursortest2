package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.th, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4369th extends AbstractC4422vh {
    public final int a;
    public final String b;

    public C4369th(String message, int i) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = i;
        this.b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4369th)) {
            return false;
        }
        C4369th c4369th = (C4369th) obj;
        return this.a == c4369th.a && Intrinsics.areEqual(this.b, c4369th.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.a + ", message=" + this.b + ")";
    }
}
