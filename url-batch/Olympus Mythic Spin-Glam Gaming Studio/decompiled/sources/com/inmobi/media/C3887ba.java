package com.inmobi.media;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3887ba extends AbstractC4196n2 {
    public final String e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3887ba(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.e = eventId;
        this.f = componentType;
    }

    public final String toString() {
        return this.a + "@" + this.f + " ";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3887ba(String str, String str2, String str3) {
        this(r0, str, str2, str3);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
    }
}
