package com.mobilefuse.sdk.ad.rendering.omniad.service;

import android.app.Activity;
import android.graphics.Point;
import com.ironsource.X3;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.PositionModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.ScaleModifier;
import com.mobilefuse.sdk.ad.rendering.omniad.modifier.SizeModifier;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OmniAdPropertyService.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ(\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\t2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fJ0\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001d\u001a\u00020\t2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fJ&\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020&2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fJ0\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006*"}, d2 = {"Lcom/mobilefuse/sdk/ad/rendering/omniad/service/OmniAdPropertyService;", "", "activity", "Landroid/app/Activity;", "sizePx", "Landroid/graphics/Point;", "omniAdContainer", "Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "defaultPositionModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "defaultSizeModifier", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "(Landroid/app/Activity;Landroid/graphics/Point;Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;)V", "getActivity", "()Landroid/app/Activity;", "getDefaultPositionModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/PositionModifier;", "getDefaultSizeModifier", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/SizeModifier;", "lastModifier", "lastPosition", "getLastPosition", "()Landroid/graphics/Point;", "getOmniAdContainer", "()Lcom/mobilefuse/sdk/ad/rendering/omniad/container/OmniAdContainer;", "getSizePx", "changePosition", "", X3.i.L, "modifier", "completeAction", "Lkotlin/Function0;", VastAttributes.HORIZONTAL_POSITION, "", VastAttributes.VERTICAL_POSITION, "changeScale", "scale", "", "Lcom/mobilefuse/sdk/ad/rendering/omniad/modifier/ScaleModifier;", "changeSize", "width", "height", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes10.dex */
public final class OmniAdPropertyService {

    @NotNull
    private final Activity activity;

    @NotNull
    private final PositionModifier defaultPositionModifier;

    @NotNull
    private final SizeModifier defaultSizeModifier;
    private PositionModifier lastModifier;

    @NotNull
    private final Point lastPosition;

    @NotNull
    private final OmniAdContainer omniAdContainer;

    @NotNull
    private final Point sizePx;

    public final void changePosition(int x, int y, @NotNull PositionModifier modifier, @NotNull Function0 completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PositionModifier positionModifier = this.lastModifier;
            if (positionModifier != null) {
                positionModifier.cancel();
            }
            this.lastModifier = modifier;
            Point point = this.lastPosition;
            point.x = x;
            point.y = y;
            modifier.changePosition(x, y, completeAction);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void changeScale(float scale, @NotNull ScaleModifier modifier, @NotNull Function0 completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            modifier.changeScale(scale, completeAction);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void changeSize(int width, int height, @NotNull SizeModifier modifier, @NotNull Function0 completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            modifier.changeSize(width, height, completeAction);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public OmniAdPropertyService(@NotNull Activity activity, @NotNull Point sizePx, @NotNull OmniAdContainer omniAdContainer, @NotNull PositionModifier defaultPositionModifier, @NotNull SizeModifier defaultSizeModifier) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sizePx, "sizePx");
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(defaultPositionModifier, "defaultPositionModifier");
        Intrinsics.checkNotNullParameter(defaultSizeModifier, "defaultSizeModifier");
        this.activity = activity;
        this.sizePx = sizePx;
        this.omniAdContainer = omniAdContainer;
        this.defaultPositionModifier = defaultPositionModifier;
        this.defaultSizeModifier = defaultSizeModifier;
        this.lastPosition = new Point(0, 0);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final Point getSizePx() {
        return this.sizePx;
    }

    @NotNull
    public final OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    @NotNull
    public final PositionModifier getDefaultPositionModifier() {
        return this.defaultPositionModifier;
    }

    @NotNull
    public final SizeModifier getDefaultSizeModifier() {
        return this.defaultSizeModifier;
    }

    @NotNull
    public final Point getLastPosition() {
        return this.lastPosition;
    }

    public static /* synthetic */ void changePosition$default(OmniAdPropertyService omniAdPropertyService, Point point, PositionModifier positionModifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            positionModifier = omniAdPropertyService.defaultPositionModifier;
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService$changePosition$1
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
        omniAdPropertyService.changePosition(point, positionModifier, function0);
    }

    public final void changePosition(@NotNull Point position, @NotNull PositionModifier modifier, @NotNull Function0 completeAction) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        changePosition(position.x, position.y, modifier, completeAction);
    }

    public static /* synthetic */ void changePosition$default(OmniAdPropertyService omniAdPropertyService, int i, int i2, PositionModifier positionModifier, Function0 function0, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            positionModifier = omniAdPropertyService.defaultPositionModifier;
        }
        if ((i3 & 8) != 0) {
            function0 = new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService$changePosition$2
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
        omniAdPropertyService.changePosition(i, i2, positionModifier, function0);
    }

    public static /* synthetic */ void changeSize$default(OmniAdPropertyService omniAdPropertyService, int i, int i2, SizeModifier sizeModifier, Function0 function0, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            sizeModifier = omniAdPropertyService.defaultSizeModifier;
        }
        if ((i3 & 8) != 0) {
            function0 = new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService$changeSize$1
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
        omniAdPropertyService.changeSize(i, i2, sizeModifier, function0);
    }

    public static /* synthetic */ void changeScale$default(OmniAdPropertyService omniAdPropertyService, float f, ScaleModifier scaleModifier, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService$changeScale$1
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
        omniAdPropertyService.changeScale(f, scaleModifier, function0);
    }
}
