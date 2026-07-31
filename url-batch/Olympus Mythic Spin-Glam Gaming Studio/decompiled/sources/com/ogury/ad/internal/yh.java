package com.ogury.ad.internal;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class yh extends Lambda implements Function1 {
    public final /* synthetic */ Bitmap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(Bitmap bitmap) {
        super(1);
        this.a = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.recycle();
        return Unit.INSTANCE;
    }
}
