package io.bidmachine.rendering.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.util.KeyHolder;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.gradient.GradientDrawable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lio/bidmachine/rendering/model/GradientDirection;", "", "Lio/bidmachine/util/KeyHolder;", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Lio/bidmachine/util/gradient/GradientDrawable$Orientation;", "toDrawableGradientOrientation", "()Lio/bidmachine/util/gradient/GradientDrawable$Orientation;", "a", "Ljava/lang/String;", "Companion", "LeftRight", "TopBottom", "RightLeft", "BottomTop", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public enum GradientDirection implements KeyHolder {
    LeftRight("right"),
    TopBottom("bottom"),
    RightLeft("left"),
    BottomTop(ViewHierarchyConstants.DIMENSION_TOP_KEY);


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final String key;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/bidmachine/rendering/model/GradientDirection$Companion;", "", "()V", "get", "Lio/bidmachine/rendering/model/GradientDirection;", "key", "", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final GradientDirection get(@Nullable String key) {
            return (GradientDirection) UtilsKt.find(GradientDirection.values(), key);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            try {
                iArr[GradientDirection.LeftRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDirection.TopBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDirection.RightLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDirection.BottomTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    GradientDirection(String str) {
        this.key = str;
    }

    @Nullable
    public static final GradientDirection get(@Nullable String str) {
        return INSTANCE.get(str);
    }

    @Override // io.bidmachine.util.KeyHolder
    @NotNull
    public String getKey() {
        return this.key;
    }

    @NotNull
    public final GradientDrawable.Orientation toDrawableGradientOrientation() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        if (i == 2) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if (i == 3) {
            return GradientDrawable.Orientation.RIGHT_LEFT;
        }
        if (i == 4) {
            return GradientDrawable.Orientation.BOTTOM_TOP;
        }
        throw new NoWhenBranchMatchedException();
    }
}
