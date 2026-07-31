package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class i1 extends Lambda implements Function0 {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ImageView imageView, Bitmap bitmap) {
        super(0);
        this.a = imageView;
        this.b = bitmap;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.a.setImageBitmap(this.b);
        return Unit.INSTANCE;
    }
}
