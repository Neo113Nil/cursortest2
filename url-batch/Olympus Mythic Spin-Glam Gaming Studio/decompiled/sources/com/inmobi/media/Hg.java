package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes12.dex */
public final class Hg extends AbstractC4486y2 {
    public final Window b;
    public final AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hg(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(config, "config");
        this.b = window;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.N0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() {
        System.currentTimeMillis();
        int width = this.b.getDecorView().getWidth();
        int height = this.b.getDecorView().getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int layerType = this.b.getDecorView().getLayerType();
        this.b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.b, rect, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.inmobi.media.Hg$$ExternalSyntheticLambda0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                Hg.a(Ref$BooleanRef.this, this, i);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.c.get()) {
            Thread.sleep(500L);
        }
        System.currentTimeMillis();
        this.b.getDecorView().setLayerType(layerType, null);
        if (ref$BooleanRef.element) {
            return a(createBitmap);
        }
        return null;
    }

    public static final void a(Ref$BooleanRef ref$BooleanRef, Hg hg, int i) {
        if (i == 0) {
            ref$BooleanRef.element = true;
        }
        boolean z = ref$BooleanRef.element;
        hg.c.set(true);
    }
}
