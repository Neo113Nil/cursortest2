package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4412v7 {
    public long a;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x011c, code lost:
    
        if (r4 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r4).getColor() == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (((android.graphics.drawable.ColorDrawable) r9).getColor() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        if (r9 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
    
        if (r9.getForeground() == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ef, code lost:
    
        if (r9.getBackground() == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(View rootView, View adView, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(adView, "adView");
        ViewParent parent = rootView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        boolean z4 = viewGroup == null || a(viewGroup, adView, i);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int indexOfChild = viewGroup.indexOfChild(rootView) + 1; indexOfChild < childCount; indexOfChild++) {
                View childAt = viewGroup.getChildAt(indexOfChild);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                if (childAt.getVisibility() == 0) {
                    if (adView instanceof GestureDetectorOnGestureListenerC4476xi) {
                        if (!(childAt instanceof C4417vc)) {
                            if (!(childAt instanceof Fi)) {
                                Map<View, FriendlyObstructionPurpose> friendlyViews = ((GestureDetectorOnGestureListenerC4476xi) adView).getFriendlyViews();
                                if (!(friendlyViews != null ? friendlyViews.containsKey(childAt) : false)) {
                                    Rect rect = new Rect();
                                    adView.getGlobalVisibleRect(rect);
                                    Rect rect2 = new Rect();
                                    childAt.getGlobalVisibleRect(rect2);
                                    Rect rect3 = new Rect();
                                    boolean intersect = rect3.setIntersect(rect, rect2);
                                    Intrinsics.checkNotNullParameter(rect, "<this>");
                                    int i2 = (rect.bottom - rect.top) * (rect.right - rect.left);
                                    Intrinsics.checkNotNullParameter(rect3, "<this>");
                                    int i3 = i2 - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                    float configuredArea = (i / 100) * r10.getConfiguredArea();
                                    if (intersect && i3 < configuredArea) {
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
                                                if (z3) {
                                                }
                                            }
                                            z2 = false;
                                        }
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                            return false;
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
        }
        return z4;
    }

    public final boolean b(View view, View view2, int i) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = view2 instanceof GestureDetectorOnGestureListenerC4476xi ? (GestureDetectorOnGestureListenerC4476xi) view2 : null;
                if (gestureDetectorOnGestureListenerC4476xi == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC4476xi.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC4476xi.getHeight() <= 0 || gestureDetectorOnGestureListenerC4476xi.getWidth() <= 0)) {
                    return false;
                }
                if (!gestureDetectorOnGestureListenerC4476xi.getGlobalVisibleRect(new Rect())) {
                    return false;
                }
                this.a = r9.height() * r9.width();
                if (gestureDetectorOnGestureListenerC4476xi.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC4476xi.setConfiguredArea(gestureDetectorOnGestureListenerC4476xi.getHeight() * gestureDetectorOnGestureListenerC4476xi.getWidth());
                }
                if (gestureDetectorOnGestureListenerC4476xi.getArea() > 0) {
                    if (100 * this.a >= gestureDetectorOnGestureListenerC4476xi.getConfiguredArea() * i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
