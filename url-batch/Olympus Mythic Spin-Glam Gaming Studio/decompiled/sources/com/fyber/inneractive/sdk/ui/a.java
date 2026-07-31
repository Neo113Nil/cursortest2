package com.fyber.inneractive.sdk.ui;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.network.f0;

/* loaded from: classes11.dex */
public final class a implements f0 {
    public final /* synthetic */ FyberAdIdentifierLocal a;

    public a(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.a = fyberAdIdentifierLocal;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        Bitmap bitmap = (Bitmap) obj;
        if (exc != null || bitmap == null) {
            return;
        }
        this.a.r = bitmap;
    }
}
