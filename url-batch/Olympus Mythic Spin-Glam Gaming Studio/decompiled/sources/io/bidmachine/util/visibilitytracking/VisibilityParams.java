package io.bidmachine.util.visibilitytracking;

import io.bidmachine.util.Percent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: VisibilityParams.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "", "minVisiblePercentage", "", "isIgnoreWindowFocus", "", "isIgnoreOverlap", "(FZZ)V", "()Z", "getMinVisiblePercentage", "()F", "Builder", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class VisibilityParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy DEFAULT_VISIBILITY_PARAMS$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: io.bidmachine.util.visibilitytracking.VisibilityParams$Companion$DEFAULT_VISIBILITY_PARAMS$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final VisibilityParams mo4828invoke() {
            return VisibilityParams.INSTANCE.createDefaultBuilder().build();
        }
    });
    private static final boolean IGNORE_OVERLAP = false;
    private static final boolean IGNORE_WINDOW_FOCUS = false;
    private static final float MIN_VISIBLE_PERCENTAGE = 50.0f;
    private final boolean isIgnoreOverlap;
    private final boolean isIgnoreWindowFocus;
    private final float minVisiblePercentage;

    public VisibilityParams(@Percent float f, boolean z, boolean z2) {
        this.minVisiblePercentage = f;
        this.isIgnoreWindowFocus = z;
        this.isIgnoreOverlap = z2;
    }

    public final float getMinVisiblePercentage() {
        return this.minVisiblePercentage;
    }

    /* renamed from: isIgnoreWindowFocus, reason: from getter */
    public final boolean getIsIgnoreWindowFocus() {
        return this.isIgnoreWindowFocus;
    }

    /* renamed from: isIgnoreOverlap, reason: from getter */
    public final boolean getIsIgnoreOverlap() {
        return this.isIgnoreOverlap;
    }

    /* compiled from: VisibilityParams.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0004R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\r8\u0002X\u0083T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002¨\u0006\u0012"}, d2 = {"Lio/bidmachine/util/visibilitytracking/VisibilityParams$Companion;", "", "()V", "DEFAULT_VISIBILITY_PARAMS", "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "getDEFAULT_VISIBILITY_PARAMS", "()Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "DEFAULT_VISIBILITY_PARAMS$delegate", "Lkotlin/Lazy;", "IGNORE_OVERLAP", "", "IGNORE_WINDOW_FOCUS", "MIN_VISIBLE_PERCENTAGE", "", "getMIN_VISIBLE_PERCENTAGE$annotations", "createDefaultBuilder", "Lio/bidmachine/util/visibilitytracking/VisibilityParams$Builder;", "getDefault", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Percent
        private static /* synthetic */ void getMIN_VISIBLE_PERCENTAGE$annotations() {
        }

        private Companion() {
        }

        private final VisibilityParams getDEFAULT_VISIBILITY_PARAMS() {
            return (VisibilityParams) VisibilityParams.DEFAULT_VISIBILITY_PARAMS$delegate.getValue();
        }

        @NotNull
        public final Builder createDefaultBuilder() {
            return new Builder().setMinVisiblePercentage(50.0f).setIgnoreWindowFocus(true).setIgnoreOverlap(true);
        }

        @NotNull
        public final VisibilityParams getDefault() {
            return getDEFAULT_VISIBILITY_PARAMS();
        }
    }

    /* compiled from: VisibilityParams.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/visibilitytracking/VisibilityParams$Builder;", "", "()V", "isIgnoreOverlap", "", "isIgnoreWindowFocus", "minVisiblePercentage", "", "getMinVisiblePercentage$annotations", "build", "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "setIgnoreOverlap", "setIgnoreWindowFocus", "setMinVisiblePercentage", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private boolean isIgnoreOverlap;
        private boolean isIgnoreWindowFocus;
        private float minVisiblePercentage = 50.0f;

        @Percent
        private static /* synthetic */ void getMinVisiblePercentage$annotations() {
        }

        @NotNull
        public final Builder setMinVisiblePercentage(@Percent float minVisiblePercentage) {
            this.minVisiblePercentage = minVisiblePercentage;
            return this;
        }

        @NotNull
        public final Builder setIgnoreWindowFocus(boolean isIgnoreWindowFocus) {
            this.isIgnoreWindowFocus = isIgnoreWindowFocus;
            return this;
        }

        @NotNull
        public final Builder setIgnoreOverlap(boolean isIgnoreOverlap) {
            this.isIgnoreOverlap = isIgnoreOverlap;
            return this;
        }

        @NotNull
        public final VisibilityParams build() {
            return new VisibilityParams(this.minVisiblePercentage, this.isIgnoreWindowFocus, this.isIgnoreOverlap);
        }
    }
}
