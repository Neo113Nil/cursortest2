package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes14.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ View a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WebView webView, i iVar) {
        super(0);
        this.a = webView;
        this.b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.a.getWidth(), this.a.getHeight(), Bitmap.Config.ARGB_8888);
            this.a.draw(new Canvas(createBitmap));
            this.b.invoke(createBitmap);
        } catch (Throwable th) {
            boolean z = u.a;
            t.a("BlackScreenDetector", "Bitmap capture failed", th);
            this.b.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
