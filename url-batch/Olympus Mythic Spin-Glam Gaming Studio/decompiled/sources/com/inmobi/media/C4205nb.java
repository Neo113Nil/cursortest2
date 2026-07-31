package com.inmobi.media;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4205nb extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4205nb(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
