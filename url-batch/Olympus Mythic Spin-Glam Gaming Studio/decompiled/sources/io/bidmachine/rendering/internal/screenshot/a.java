package io.bidmachine.rendering.internal.screenshot;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.bidmachine.util.ViewUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class a {
    public static final a a = new a();

    /* renamed from: io.bidmachine.rendering.internal.screenshot.a$a, reason: collision with other inner class name */
    public static final class PixelCopyOnPixelCopyFinishedListenerC1811a implements PixelCopy.OnPixelCopyFinishedListener {
        final /* synthetic */ b a;
        final /* synthetic */ Bitmap b;

        PixelCopyOnPixelCopyFinishedListenerC1811a(b bVar, Bitmap bitmap) {
            this.a = bVar;
            this.b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.a.a(this.b);
            } else {
                this.a.a();
            }
        }
    }

    private a() {
    }

    public final void a(View view, Handler handler, Bitmap.Config config, b screenshotListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(screenshotListener, "screenshotListener");
        if (Build.VERSION.SDK_INT < 26) {
            screenshotListener.a();
            return;
        }
        Window findWindow = ViewUtilsKt.findWindow(view);
        if (findWindow == null) {
            screenshotListener.a();
            return;
        }
        Rect locationInWindow = ViewUtilsKt.getLocationInWindow(view);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(locationInWindow.width(), locationInWindow.height(), config);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "{\n            Bitmap.cre…ight(), config)\n        }");
            try {
                PixelCopy.request(findWindow, locationInWindow, createBitmap, new PixelCopyOnPixelCopyFinishedListenerC1811a(screenshotListener, createBitmap), handler);
            } catch (Throwable unused) {
                screenshotListener.a();
            }
        } catch (Throwable unused2) {
            screenshotListener.a();
        }
    }
}
