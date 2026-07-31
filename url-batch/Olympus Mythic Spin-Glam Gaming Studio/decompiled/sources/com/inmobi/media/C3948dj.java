package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.dj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3948dj extends AbstractC4486y2 {
    public final WeakReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3948dj(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.N0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        View adView = (View) this.b.get();
        if (adView == null) {
            System.currentTimeMillis();
            return null;
        }
        Intrinsics.checkNotNullParameter(adView, "adView");
        Bitmap createBitmap = Bitmap.createBitmap(adView.getMeasuredWidth(), adView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = adView.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        adView.draw(canvas);
        if (createBitmap == null) {
            return null;
        }
        System.currentTimeMillis();
        return a(createBitmap);
    }
}
