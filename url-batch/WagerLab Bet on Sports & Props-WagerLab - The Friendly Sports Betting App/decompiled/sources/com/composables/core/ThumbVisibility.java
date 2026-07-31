package com.composables.core;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/composables/core/ThumbVisibility;", "", "<init>", "()V", "AlwaysVisible", "HideWhileIdle", "Lcom/composables/core/ThumbVisibility$AlwaysVisible;", "Lcom/composables/core/ThumbVisibility$HideWhileIdle;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ThumbVisibility {
    public static final int $stable = 0;

    public /* synthetic */ ThumbVisibility(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ScrollArea.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/composables/core/ThumbVisibility$AlwaysVisible;", "Lcom/composables/core/ThumbVisibility;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AlwaysVisible extends ThumbVisibility {
        public static final int $stable = 0;
        public static final AlwaysVisible INSTANCE = new AlwaysVisible();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlwaysVisible)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -480873181;
        }

        public String toString() {
            return "AlwaysVisible";
        }

        private AlwaysVisible() {
            super(null);
        }
    }

    private ThumbVisibility() {
    }

    /* compiled from: ScrollArea.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/composables/core/ThumbVisibility$HideWhileIdle;", "Lcom/composables/core/ThumbVisibility;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "hideDelay", "Lkotlin/time/Duration;", "<init>", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "getExit", "()Landroidx/compose/animation/ExitTransition;", "getHideDelay-UwyO8pc", "()J", "J", "component1", "component2", "component3", "component3-UwyO8pc", "copy", "copy-SxA4cEA", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;J)Lcom/composables/core/ThumbVisibility$HideWhileIdle;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HideWhileIdle extends ThumbVisibility {
        public static final int $stable = 0;
        private final EnterTransition enter;
        private final ExitTransition exit;
        private final long hideDelay;

        public /* synthetic */ HideWhileIdle(EnterTransition enterTransition, ExitTransition exitTransition, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(enterTransition, exitTransition, j);
        }

        /* renamed from: copy-SxA4cEA$default, reason: not valid java name */
        public static /* synthetic */ HideWhileIdle m9417copySxA4cEA$default(HideWhileIdle hideWhileIdle, EnterTransition enterTransition, ExitTransition exitTransition, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                enterTransition = hideWhileIdle.enter;
            }
            if ((i & 2) != 0) {
                exitTransition = hideWhileIdle.exit;
            }
            if ((i & 4) != 0) {
                j = hideWhileIdle.hideDelay;
            }
            return hideWhileIdle.m9419copySxA4cEA(enterTransition, exitTransition, j);
        }

        /* renamed from: component1, reason: from getter */
        public final EnterTransition getEnter() {
            return this.enter;
        }

        /* renamed from: component2, reason: from getter */
        public final ExitTransition getExit() {
            return this.exit;
        }

        /* renamed from: component3-UwyO8pc, reason: not valid java name and from getter */
        public final long getHideDelay() {
            return this.hideDelay;
        }

        /* renamed from: copy-SxA4cEA, reason: not valid java name */
        public final HideWhileIdle m9419copySxA4cEA(EnterTransition enter, ExitTransition exit, long hideDelay) {
            Intrinsics.checkNotNullParameter(enter, "enter");
            Intrinsics.checkNotNullParameter(exit, "exit");
            return new HideWhileIdle(enter, exit, hideDelay, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HideWhileIdle)) {
                return false;
            }
            HideWhileIdle hideWhileIdle = (HideWhileIdle) other;
            return Intrinsics.areEqual(this.enter, hideWhileIdle.enter) && Intrinsics.areEqual(this.exit, hideWhileIdle.exit) && Duration.m13734equalsimpl0(this.hideDelay, hideWhileIdle.hideDelay);
        }

        public int hashCode() {
            return (((this.enter.hashCode() * 31) + this.exit.hashCode()) * 31) + Duration.m13750hashCodeimpl(this.hideDelay);
        }

        public String toString() {
            return "HideWhileIdle(enter=" + this.enter + ", exit=" + this.exit + ", hideDelay=" + Duration.m13769toStringimpl(this.hideDelay) + ")";
        }

        public final EnterTransition getEnter() {
            return this.enter;
        }

        public final ExitTransition getExit() {
            return this.exit;
        }

        /* renamed from: getHideDelay-UwyO8pc, reason: not valid java name */
        public final long m9420getHideDelayUwyO8pc() {
            return this.hideDelay;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private HideWhileIdle(EnterTransition enter, ExitTransition exit, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(enter, "enter");
            Intrinsics.checkNotNullParameter(exit, "exit");
            this.enter = enter;
            this.exit = exit;
            this.hideDelay = j;
        }
    }
}
