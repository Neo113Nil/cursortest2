package com.yandex.div.core.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.experiments.Experiment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AccessibilityStateProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/core/util/AccessibilityStateProvider;", "", "a11yConfigurationEnabled", "", "(Z)V", "getA11yConfigurationEnabled", "()Z", "isAccessibilityEnabled", "context", "Landroid/content/Context;", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes9.dex */
public final class AccessibilityStateProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static Boolean touchExplorationEnabled;
    private final boolean a11yConfigurationEnabled;

    public AccessibilityStateProvider(@ExperimentFlag(experiment = Experiment.ACCESSIBILITY_ENABLED) boolean z) {
        this.a11yConfigurationEnabled = z;
    }

    public final boolean getA11yConfigurationEnabled() {
        return this.a11yConfigurationEnabled;
    }

    public final boolean isAccessibilityEnabled(@NotNull Context context) {
        if (!this.a11yConfigurationEnabled) {
            return false;
        }
        Boolean bool = touchExplorationEnabled;
        if (bool != null) {
            Intrinsics.checkNotNull(bool);
            return bool.booleanValue();
        }
        INSTANCE.evaluateTouchModeEnabled(context);
        Boolean bool2 = touchExplorationEnabled;
        Intrinsics.checkNotNull(bool2);
        return bool2.booleanValue();
    }

    /* compiled from: AccessibilityStateProvider.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/util/AccessibilityStateProvider$Companion;", "", "()V", "touchExplorationEnabled", "", "getTouchExplorationEnabled", "()Ljava/lang/Boolean;", "setTouchExplorationEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "evaluateTouchModeEnabled", "", "context", "Landroid/content/Context;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final Boolean getTouchExplorationEnabled() {
            return AccessibilityStateProvider.touchExplorationEnabled;
        }

        public final void setTouchExplorationEnabled(@Nullable Boolean bool) {
            AccessibilityStateProvider.touchExplorationEnabled = bool;
        }

        public final void evaluateTouchModeEnabled(@NotNull Context context) {
            if (getTouchExplorationEnabled() != null) {
                return;
            }
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            setTouchExplorationEnabled(accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE);
        }
    }
}
