package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.c4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3907c4 {
    public final Context a;
    public final C4493y9 b;

    public C3907c4(Context context, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = c4493y9;
    }

    public final Mj a(Qi resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        resource.getClass();
        return new Mj(this.a, this.b);
    }
}
