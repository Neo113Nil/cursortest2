package com.ogury.ad.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class wi {
    public static Rect a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Rect rect = new Rect();
        try {
            if (!view.isAttachedToWindow()) {
                return rect;
            }
            view.getGlobalVisibleRect(rect);
            return rect;
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, "View is not ready: " + e.getMessage());
            return rect;
        }
    }

    public static Rect b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Rect rect = new Rect();
        try {
            if (!view.isAttachedToWindow()) {
                return rect;
            }
            view.getWindowVisibleDisplayFrame(rect);
            return rect;
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, "View is not ready: " + e.getMessage());
            return rect;
        }
    }

    public static Rect a(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.width() != view.getWidth()) {
            rect.right = view.getWidth() + rect.left;
        }
        if (rect.height() != view.getHeight()) {
            rect.bottom = view.getHeight() + rect.top;
        }
        return rect;
    }
}
