package com.mobilefuse.sdk.ad.rendering.omniad.service;

import android.graphics.Point;
import android.graphics.Rect;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.omniad.WindowUtils;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OmniAdFullscreenService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00072\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dJ*\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00072\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dJ\"\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdFullscreenService;", "", "propertyService", "Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "defaultPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "defaultSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "(Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;)V", "getDefaultPositionModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "getDefaultSizeModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "enteringFullscreenPosition", "Landroid/graphics/Point;", "<set-?>", "", "fullscreenMode", "getFullscreenMode$annotations", "()V", "getFullscreenMode", "()Z", "getPropertyService", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "enterFullscreen", "", "positionModifier", "sizeModifier", "completeAction", "Lkotlin/Function0;", "exitFullscreen", "invalidateLayout", "invalidStatePosition", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final class OmniAdFullscreenService {

    @NotNull
    private final PositionModifier defaultPositionModifier;

    @NotNull
    private final SizeModifier defaultSizeModifier;
    private Point enteringFullscreenPosition;
    private boolean fullscreenMode;

    @NotNull
    private final OmniAdPropertyService propertyService;

    public static /* synthetic */ void getFullscreenMode$annotations() {
    }

    public OmniAdFullscreenService(@NotNull OmniAdPropertyService propertyService, @NotNull PositionModifier defaultPositionModifier, @NotNull SizeModifier defaultSizeModifier) {
        Intrinsics.checkNotNullParameter(propertyService, "propertyService");
        Intrinsics.checkNotNullParameter(defaultPositionModifier, "defaultPositionModifier");
        Intrinsics.checkNotNullParameter(defaultSizeModifier, "defaultSizeModifier");
        this.propertyService = propertyService;
        this.defaultPositionModifier = defaultPositionModifier;
        this.defaultSizeModifier = defaultSizeModifier;
    }

    public final void enterFullscreen(@NotNull PositionModifier positionModifier, @NotNull SizeModifier sizeModifier, @NotNull Function0 completeAction) {
        Intrinsics.checkNotNullParameter(positionModifier, "positionModifier");
        Intrinsics.checkNotNullParameter(sizeModifier, "sizeModifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.enteringFullscreenPosition = new Point(this.propertyService.getLastPosition().x, this.propertyService.getLastPosition().y);
            this.fullscreenMode = true;
            Rect windowRect = WindowUtils.getWindowRect(this.propertyService.getActivity());
            OmniAdPropertyService.changePosition$default(this.propertyService, windowRect.left, windowRect.top, positionModifier, null, 8, null);
            this.propertyService.changeSize(windowRect.width(), windowRect.height(), sizeModifier, completeAction);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void exitFullscreen(@NotNull PositionModifier positionModifier, @NotNull SizeModifier sizeModifier, @NotNull Function0 completeAction) {
        Intrinsics.checkNotNullParameter(positionModifier, "positionModifier");
        Intrinsics.checkNotNullParameter(sizeModifier, "sizeModifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.fullscreenMode = false;
            Point point = this.enteringFullscreenPosition;
            if (point != null) {
                OmniAdPropertyService.changePosition$default(this.propertyService, point.x, point.y, positionModifier, null, 8, null);
            }
            this.enteringFullscreenPosition = null;
            OmniAdPropertyService omniAdPropertyService = this.propertyService;
            omniAdPropertyService.changeSize(omniAdPropertyService.getSizePx().x, this.propertyService.getSizePx().y, sizeModifier, completeAction);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final OmniAdPropertyService getPropertyService() {
        return this.propertyService;
    }

    @NotNull
    public final PositionModifier getDefaultPositionModifier() {
        return this.defaultPositionModifier;
    }

    @NotNull
    public final SizeModifier getDefaultSizeModifier() {
        return this.defaultSizeModifier;
    }

    public final boolean getFullscreenMode() {
        return this.fullscreenMode;
    }

    public static /* synthetic */ void enterFullscreen$default(OmniAdFullscreenService omniAdFullscreenService, PositionModifier positionModifier, SizeModifier sizeModifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            positionModifier = omniAdFullscreenService.defaultPositionModifier;
        }
        if ((i & 2) != 0) {
            sizeModifier = omniAdFullscreenService.defaultSizeModifier;
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdFullscreenService$enterFullscreen$1
                public final void invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }
            };
        }
        omniAdFullscreenService.enterFullscreen(positionModifier, sizeModifier, function0);
    }

    public static /* synthetic */ void exitFullscreen$default(OmniAdFullscreenService omniAdFullscreenService, PositionModifier positionModifier, SizeModifier sizeModifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            positionModifier = omniAdFullscreenService.defaultPositionModifier;
        }
        if ((i & 2) != 0) {
            sizeModifier = omniAdFullscreenService.defaultSizeModifier;
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdFullscreenService$exitFullscreen$1
                public final void invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }
            };
        }
        omniAdFullscreenService.exitFullscreen(positionModifier, sizeModifier, function0);
    }

    public static /* synthetic */ void invalidateLayout$default(OmniAdFullscreenService omniAdFullscreenService, Point point, PositionModifier positionModifier, SizeModifier sizeModifier, int i, Object obj) {
        if ((i & 2) != 0) {
            positionModifier = omniAdFullscreenService.defaultPositionModifier;
        }
        if ((i & 4) != 0) {
            sizeModifier = omniAdFullscreenService.defaultSizeModifier;
        }
        omniAdFullscreenService.invalidateLayout(point, positionModifier, sizeModifier);
    }

    public final void invalidateLayout(@NotNull Point invalidStatePosition, @NotNull PositionModifier positionModifier, @NotNull SizeModifier sizeModifier) {
        Intrinsics.checkNotNullParameter(invalidStatePosition, "invalidStatePosition");
        Intrinsics.checkNotNullParameter(positionModifier, "positionModifier");
        Intrinsics.checkNotNullParameter(sizeModifier, "sizeModifier");
        if (this.fullscreenMode) {
            enterFullscreen$default(this, positionModifier, sizeModifier, null, 4, null);
            this.enteringFullscreenPosition = invalidStatePosition;
        } else {
            OmniAdPropertyService.changePosition$default(this.propertyService, invalidStatePosition, positionModifier, null, 4, null);
        }
    }
}
