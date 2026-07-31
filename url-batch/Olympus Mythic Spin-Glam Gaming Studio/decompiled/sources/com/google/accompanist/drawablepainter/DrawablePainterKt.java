package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawablePainter.kt */
/* loaded from: classes.dex */
public abstract class DrawablePainterKt {
    private static final Lazy MAIN_HANDLER$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.google.accompanist.drawablepainter.DrawablePainterKt$MAIN_HANDLER$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final Handler mo4828invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler getMAIN_HANDLER() {
        return (Handler) MAIN_HANDLER$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getIntrinsicSize(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return Size.INSTANCE.m1340getUnspecifiedNHjbRc();
    }
}
