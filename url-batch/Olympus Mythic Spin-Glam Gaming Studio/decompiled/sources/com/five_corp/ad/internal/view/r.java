package com.five_corp.ad.internal.view;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes15.dex */
public final class r implements com.five_corp.ad.internal.cache.e {
    public final /* synthetic */ s a;

    public r(s sVar) {
        this.a = sVar;
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(com.five_corp.ad.internal.l lVar) {
        this.a.d.a(0, lVar);
    }

    @Override // com.five_corp.ad.internal.cache.e
    public final void a(Bitmap bitmap) {
        this.a.k = new ImageView(this.a.a);
        this.a.k.setImageBitmap(bitmap);
        s sVar = this.a;
        C3848h c3848h = sVar.c;
        c3848h.addView(sVar.k, c3848h.a);
        this.a.d.a(-1L);
    }
}
