package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.bg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3893bg implements Transformation {
    public final Bitmap.Config a;

    public C3893bg(Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.a + ")";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Bitmap copy = source.copy(this.a, false);
        source.recycle();
        Intrinsics.checkNotNull(copy);
        return copy;
    }
}
