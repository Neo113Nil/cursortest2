package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class j1 extends Lambda implements Function1 {
    public final /* synthetic */ ImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ImageView imageView) {
        super(1);
        this.a = imageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap it = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ImageView imageView = this.a;
        if (imageView != null) {
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new i1(imageView, it));
        }
        return Unit.INSTANCE;
    }
}
