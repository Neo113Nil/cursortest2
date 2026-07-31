package com.mobilefuse.sdk.ad.rendering.omniad.service;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.utils.DimConversionsKt;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OmniAdTouchService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R/\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdTouchService;", "", "Landroid/app/Activity;", "activity", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "omniAdContainer", "Landroid/graphics/Point;", "sizeDp", "", "marginDp", "Lkotlin/Function3;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/TouchEventType;", "", "touchCallback", "<init>", "(Landroid/app/Activity;Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;Landroid/graphics/Point;ILkotlin/jvm/functions/Function3;)V", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "type", "onTouchEvent", "(FFLcom/mobilefuse/sdk/ad/rendering/omniad/service/TouchEventType;)V", "destroy", "()V", "", "dragEnabled", "Z", "getDragEnabled", "()Z", "setDragEnabled", "(Z)V", "value", "touchInteractionEnabled", "getTouchInteractionEnabled", "setTouchInteractionEnabled", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "getOmniAdContainer", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "Landroid/graphics/Point;", "getSizeDp", "()Landroid/graphics/Point;", "I", "getMarginDp", "()I", "Lkotlin/jvm/functions/Function3;", "getTouchCallback", "()Lkotlin/jvm/functions/Function3;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public final class OmniAdTouchService {

    @NotNull
    private final Activity activity;
    private boolean dragEnabled;
    private final int marginDp;

    @NotNull
    private final OmniAdContainer omniAdContainer;

    @NotNull
    private final Point sizeDp;

    @NotNull
    private final Function3 touchCallback;
    private boolean touchInteractionEnabled;

    public OmniAdTouchService(@NotNull Activity activity, @NotNull OmniAdContainer omniAdContainer, @NotNull Point sizeDp, int i, @NotNull Function3 touchCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(sizeDp, "sizeDp");
        Intrinsics.checkNotNullParameter(touchCallback, "touchCallback");
        this.activity = activity;
        this.omniAdContainer = omniAdContainer;
        this.sizeDp = sizeDp;
        this.marginDp = i;
        this.touchCallback = touchCallback;
        this.dragEnabled = true;
        this.touchInteractionEnabled = true;
        omniAdContainer.getFloatingContainer().setFloatingTouchListener(new View.OnTouchListener() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdTouchService.1
            private final int adHeightPx;
            private final int adWidthPx;

            @NotNull
            private final ViewGroup androidContentView;

            @NotNull
            private final FloatingContainer floatingContainer;
            private final int margin;
            private float offsetX;
            private float offsetY;
            private float orgX;
            private float orgY;

            @NotNull
            private final ViewGroup rootView;
            private boolean wasAnyMoveSinceDownEvent;

            {
                Window window = OmniAdTouchService.this.getActivity().getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "activity.window");
                View decorView = window.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
                View rootView = decorView.getRootView();
                if (rootView == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                ViewGroup viewGroup = (ViewGroup) rootView;
                this.rootView = viewGroup;
                View findViewById = viewGroup.findViewById(R.id.content);
                if (findViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                this.androidContentView = (ViewGroup) findViewById;
                this.adWidthPx = DimConversionsKt.dpToPx(OmniAdTouchService.this.getSizeDp().x, (Context) OmniAdTouchService.this.getActivity());
                this.adHeightPx = DimConversionsKt.dpToPx(OmniAdTouchService.this.getSizeDp().y, (Context) OmniAdTouchService.this.getActivity());
                this.margin = DimConversionsKt.dpToPx(OmniAdTouchService.this.getMarginDp(), (Context) OmniAdTouchService.this.getActivity());
                this.floatingContainer = OmniAdTouchService.this.getOmniAdContainer().getFloatingContainer();
            }

            public final float getOrgX() {
                return this.orgX;
            }

            public final void setOrgX(float f) {
                this.orgX = f;
            }

            public final float getOrgY() {
                return this.orgY;
            }

            public final void setOrgY(float f) {
                this.orgY = f;
            }

            public final float getOffsetX() {
                return this.offsetX;
            }

            public final void setOffsetX(float f) {
                this.offsetX = f;
            }

            public final float getOffsetY() {
                return this.offsetY;
            }

            public final void setOffsetY(float f) {
                this.offsetY = f;
            }

            public final boolean getWasAnyMoveSinceDownEvent() {
                return this.wasAnyMoveSinceDownEvent;
            }

            public final void setWasAnyMoveSinceDownEvent(boolean z) {
                this.wasAnyMoveSinceDownEvent = z;
            }

            @NotNull
            public final ViewGroup getRootView() {
                return this.rootView;
            }

            @NotNull
            public final ViewGroup getAndroidContentView() {
                return this.androidContentView;
            }

            public final int getAdWidthPx() {
                return this.adWidthPx;
            }

            public final int getAdHeightPx() {
                return this.adHeightPx;
            }

            public final int getMargin() {
                return this.margin;
            }

            @NotNull
            public final FloatingContainer getFloatingContainer() {
                return this.floatingContainer;
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!OmniAdTouchService.this.getDragEnabled()) {
                    return true;
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Rect rect = new Rect();
                    int[] iArr = new int[2];
                    this.androidContentView.getLocationOnScreen(iArr);
                    this.androidContentView.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
                    int action = event.getAction();
                    if (action == 0) {
                        this.wasAnyMoveSinceDownEvent = false;
                        this.orgX = event.getX();
                        this.orgY = event.getY();
                        OmniAdTouchService omniAdTouchService = OmniAdTouchService.this;
                        float f = this.orgX;
                        omniAdTouchService.onTouchEvent(f, f, TouchEventType.TOUCH_DOWN);
                    } else if (action == 1) {
                        Point currentPosition = OmniAdTouchService.this.getOmniAdContainer().getCurrentPosition();
                        float f2 = currentPosition.x;
                        float f3 = currentPosition.y;
                        int i2 = rect.left;
                        int i3 = this.margin;
                        float f4 = f2 < ((float) ((i3 * 5) + i2)) ? i2 + i3 : f2;
                        int i4 = rect.top;
                        float f5 = f3 < ((float) ((i3 * 5) + i4)) ? i4 + i3 : f3;
                        if (f2 + this.adWidthPx > (i2 + rect.width()) - (this.margin * 5)) {
                            f4 = ((rect.left + rect.width()) - this.adWidthPx) - this.margin;
                        }
                        if (f3 + this.adHeightPx > (rect.top + rect.height()) - (this.margin * 5)) {
                            f5 = ((rect.top + rect.height()) - this.adHeightPx) - this.margin;
                        }
                        OmniAdTouchService.this.onTouchEvent(f4, f5, TouchEventType.TOUCH_UP);
                    } else if (action == 2) {
                        this.offsetX = event.getRawX() - this.orgX;
                        this.offsetY = event.getRawY() - this.orgY;
                        this.floatingContainer.getLocationOnScreen(new int[2]);
                        float f6 = this.offsetX;
                        float f7 = this.offsetY;
                        int i5 = rect.left;
                        if (f6 < i5) {
                            f6 = i5;
                        }
                        int i6 = rect.top;
                        if (f7 < i6) {
                            f7 = i6;
                        }
                        if (this.adWidthPx + f6 > i5 + rect.width()) {
                            f6 = (rect.left + rect.width()) - this.adWidthPx;
                        }
                        if (this.adHeightPx + f7 > rect.top + rect.height()) {
                            f7 = (rect.top + rect.height()) - this.adHeightPx;
                        }
                        OmniAdTouchService.this.onTouchEvent(f6, f7, TouchEventType.DRAG);
                    }
                    return true;
                } catch (Throwable th) {
                    int i7 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i7 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return true;
                }
            }
        });
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    @NotNull
    public final Point getSizeDp() {
        return this.sizeDp;
    }

    public /* synthetic */ OmniAdTouchService(Activity activity, OmniAdContainer omniAdContainer, Point point, int i, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, omniAdContainer, point, (i2 & 8) != 0 ? 10 : i, function3);
    }

    public final int getMarginDp() {
        return this.marginDp;
    }

    @NotNull
    public final Function3 getTouchCallback() {
        return this.touchCallback;
    }

    public final boolean getDragEnabled() {
        return this.dragEnabled;
    }

    public final void setDragEnabled(boolean z) {
        this.dragEnabled = z;
    }

    public final boolean getTouchInteractionEnabled() {
        return this.touchInteractionEnabled;
    }

    public final void setTouchInteractionEnabled(boolean z) {
        this.touchInteractionEnabled = z;
        this.omniAdContainer.getFloatingContainer().setTouchInteractionEnabled(z);
    }

    public final void onTouchEvent(float x, float y, @NotNull TouchEventType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.touchCallback.invoke(Integer.valueOf((int) x), Integer.valueOf((int) y), type);
    }

    public final void destroy() {
        this.omniAdContainer.getFloatingContainer().setFloatingTouchListener(null);
    }
}
