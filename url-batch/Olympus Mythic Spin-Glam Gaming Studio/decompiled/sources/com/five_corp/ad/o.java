package com.five_corp.ad;

import android.graphics.Bitmap;
import com.five_corp.ad.FiveAdNative;

/* loaded from: classes5.dex */
public final class o implements com.five_corp.ad.internal.cache.e {
    public final /* synthetic */ FiveAdNative.LoadImageCallback a;

    public o(FiveAdNative.LoadImageCallback loadImageCallback) {
        this.a = loadImageCallback;
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(com.five_corp.ad.internal.l lVar) {
        this.a.onImageLoad(null);
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(Bitmap bitmap) {
        this.a.onImageLoad(bitmap);
    }
}
