package io.bidmachine.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BitmapUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¨\u0006\b"}, d2 = {"Lio/bidmachine/util/BitmapUtils;", "", "()V", "clampRect", "Landroid/graphics/Rect;", "bitmap", "Landroid/graphics/Bitmap;", "rect", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapUtils {

    @NotNull
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    private BitmapUtils() {
    }

    @Nullable
    public final Rect clampRect(@NotNull Bitmap bitmap, @Nullable Rect rect) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (rect == null) {
            return new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        Rect rect2 = new Rect(Math.max(0, rect.left), Math.max(0, rect.top), Math.min(bitmap.getWidth(), rect.right), Math.min(bitmap.getHeight(), rect.bottom));
        if (rect2.isEmpty()) {
            return null;
        }
        return rect2;
    }
}
