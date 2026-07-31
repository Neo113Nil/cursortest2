package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.inmobi.media.uo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4403uo {
    public static final boolean a(View adView, H5 minDimension) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(minDimension, "minDimension");
        if (adView.getVisibility() == 0 && adView.getParent() != null && adView.isShown() && adView.getWidth() >= minDimension.a && adView.getHeight() >= minDimension.b) {
            if (adView.getHeight() * adView.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(View adView, Rect adViewRect, int i, H5 minDimension) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        Intrinsics.checkNotNullParameter(minDimension, "minDimension");
        if (a(adView, minDimension)) {
            return ((long) 100) * (((long) adViewRect.height()) * ((long) adViewRect.width())) >= ((long) (i * (adView.getHeight() * adView.getWidth())));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r3).getColor() == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r2).getColor() == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
    
        if (r2.getForeground() == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        if (r2.getBackground() == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(View adView, Rect adViewRect, int i, List friendlyViews) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adViewRect, "adViewRect");
        Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        float height = (i / 100.0f) * adView.getHeight() * adView.getWidth();
        while (adView.getParent() instanceof ViewGroup) {
            ViewParent parent = adView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            Iterable until = RangesKt.until(viewGroup.indexOfChild(adView) + 1, viewGroup.getChildCount());
            if (!(until instanceof Collection) || !((Collection) until).isEmpty()) {
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    View childAt = viewGroup.getChildAt(((IntIterator) it).nextInt());
                    if (childAt.getVisibility() == 0) {
                        Intrinsics.checkNotNull(childAt);
                        if (friendlyViews.contains(childAt)) {
                            continue;
                        } else {
                            Rect rect = new Rect();
                            childAt.getGlobalVisibleRect(rect);
                            Rect rect2 = new Rect();
                            boolean intersect = rect2.setIntersect(adViewRect, rect);
                            Intrinsics.checkNotNullParameter(adViewRect, "<this>");
                            int i2 = (adViewRect.bottom - adViewRect.top) * (adViewRect.right - adViewRect.left);
                            Intrinsics.checkNotNullParameter(rect2, "<this>");
                            int i3 = i2 - ((rect2.bottom - rect2.top) * (rect2.right - rect2.left));
                            if (intersect && i3 < height) {
                                Intrinsics.checkNotNullParameter(childAt, "<this>");
                                if (childAt.getAlpha() > 0.3f) {
                                    if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                        if (childAt.getBackground() instanceof ColorDrawable) {
                                            Drawable background = childAt.getBackground();
                                            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                        }
                                        if (childAt.getForeground() instanceof ColorDrawable) {
                                            Drawable foreground = childAt.getForeground();
                                            Intrinsics.checkNotNull(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                        }
                                        if (z && z2) {
                                        }
                                    }
                                    return false;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            adView = viewGroup;
        }
        return true;
    }
}
