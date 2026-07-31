package com.ogury.ad.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.ogury.core.OguryError;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes10.dex */
public final class ci {
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, WebView webView, int i, int i2, int i3, ContinuationImpl continuationImpl) {
        bi biVar;
        int i4;
        ci ciVar;
        Bitmap bitmap;
        try {
            try {
                if (continuationImpl instanceof bi) {
                    biVar = (bi) continuationImpl;
                    int i5 = biVar.f;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        biVar.f = i5 - Integer.MIN_VALUE;
                        Object obj = biVar.d;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i4 = biVar.f;
                        if (i4 != 0) {
                            ResultKt.throwOnFailure(obj);
                            Logger.INSTANCE.d(LogTag.QUALITY, SourceTag.ADS, "Blank ad detection is enabled. Proceeding to run algorithm...");
                            if (i <= 0 || i2 <= 0) {
                                throw new IllegalArgumentException("Capture width and height must be positive.");
                            }
                            biVar.a = this;
                            biVar.b = bVar;
                            biVar.c = i3;
                            biVar.f = 1;
                            obj = a(webView, i, i2, biVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ciVar = this;
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = biVar.c;
                            bVar = biVar.b;
                            ciVar = biVar.a;
                            ResultKt.throwOnFailure(obj);
                        }
                        bitmap = (Bitmap) obj;
                        ciVar.getClass();
                        return a(bVar, bitmap, i3);
                    }
                }
                ciVar.getClass();
                return a(bVar, bitmap, i3);
            } finally {
                bitmap.recycle();
            }
            if (i4 != 0) {
            }
            bitmap = (Bitmap) obj;
        } catch (OguryError e) {
            int code = e.getCode();
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new r1(code, message);
        } catch (Exception e2) {
            return new r1(106, "Ad quality analysis failed: " + e2.getMessage());
        }
        biVar = new bi(this, continuationImpl);
        Object obj2 = biVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i4 = biVar.f;
    }

    public static s1 a(b ad, Bitmap bitmap, int i) {
        Color valueOf;
        Color valueOf2;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        long currentTimeMillis = System.currentTimeMillis();
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            int red = Color.red(pixel);
            int green = Color.green(pixel);
            int blue = Color.blue(pixel);
            int width = bitmap.getWidth();
            int i2 = 0;
            for (int i3 = 0; i3 < width; i3++) {
                int height = bitmap.getHeight();
                for (int i4 = 0; i4 < height; i4++) {
                    int pixel2 = bitmap.getPixel(i3, i4);
                    i2 = Math.max(i2, Math.abs(Color.blue(pixel2) - blue) + Math.abs(Color.green(pixel2) - green) + Math.abs(Color.red(pixel2) - red));
                    if (i2 > i) {
                        valueOf2 = Color.valueOf(pixel);
                        Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(...)");
                        a(false, ad, valueOf2);
                        return a(false, currentTimeMillis, Integer.valueOf(pixel), i2);
                    }
                }
            }
            valueOf = Color.valueOf(pixel);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
            a(true, ad, valueOf);
            return a(true, currentTimeMillis, Integer.valueOf(pixel), i2);
        }
        return a(false, currentTimeMillis, (Integer) null, 0);
    }

    public static void a(boolean z, b bVar, Color color) {
        float red;
        float green;
        float blue;
        red = color.red();
        float f = 255;
        green = color.green();
        blue = color.blue();
        String str = "RGB(" + ((int) (red * f)) + ", " + ((int) (green * f)) + ", " + ((int) (blue * f)) + ")";
        IntegrationLogger.w(LogTag.QUALITY, SourceTag.ADS, "Blank ad detection - isBlank: " + z + ", color: " + str + ", ad:" + bVar.g + "/" + bVar.h);
    }

    public static s1 a(boolean z, long j, Integer num, int i) {
        String str;
        if (num != null) {
            int intValue = num.intValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(intValue & 16777215)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        return new s1(z, str, i, System.currentTimeMillis() - j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(WebView webView, int i, int i2, ContinuationImpl continuationImpl) {
        xh xhVar;
        int i3;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (continuationImpl instanceof xh) {
            xhVar = (xh) continuationImpl;
            int i4 = xhVar.d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xhVar.d = i4 - Integer.MIN_VALUE;
                Object obj = xhVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = xhVar.d;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    View rootView = webView.getRootView();
                    Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
                    Activity a = ii.a(rootView);
                    Window window = a != null ? a.getWindow() : null;
                    if (window == null || !webView.isShown() || !webView.isAttachedToWindow()) {
                        throw new OguryError(102, "WebView is not in a valid state for capturing. isWindowNull: " + (window == null) + ", isShown: " + webView.isShown() + ", isAttachedToWindow: " + webView.isAttachedToWindow());
                    }
                    if (i > 0 && i2 > 0) {
                        int width = webView.getWidth();
                        int height = webView.getHeight();
                        int coerceAtMost = RangesKt.coerceAtMost(i, width);
                        int coerceAtMost2 = RangesKt.coerceAtMost(i2, height);
                        int coerceIn = RangesKt.coerceIn((width / 2) - (i / 2), 0, width - coerceAtMost);
                        int coerceIn2 = RangesKt.coerceIn((height / 2) - (i2 / 2), 0, height - coerceAtMost2);
                        Rect rect = new Rect(coerceIn, coerceIn2, coerceAtMost + coerceIn, coerceAtMost2 + coerceIn2);
                        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
                        ai aiVar = new ai(webView, rect, window, createBitmap, null);
                        xhVar.a = createBitmap;
                        xhVar.d = 1;
                        obj = TimeoutKt.withTimeoutOrNull(1000L, aiVar, xhVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bitmap = createBitmap;
                    } else {
                        throw new OguryError(101, "Capture dimensions must be positive.");
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bitmap = xhVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    return bitmap2;
                }
                bitmap.recycle();
                throw new OguryError(105, "PixelCopy timed out after 1000 ms.");
            }
        }
        xhVar = new xh(this, continuationImpl);
        Object obj2 = xhVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = xhVar.d;
        if (i3 != 0) {
        }
        bitmap2 = (Bitmap) obj2;
        if (bitmap2 == null) {
        }
    }
}
