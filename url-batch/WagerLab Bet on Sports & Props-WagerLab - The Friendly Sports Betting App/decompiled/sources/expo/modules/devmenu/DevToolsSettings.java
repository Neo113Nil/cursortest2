package expo.modules.devmenu;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DevMenuDevSettings.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0013"}, d2 = {"Lexpo/modules/devmenu/DevToolsSettings;", "", "isElementInspectorShown", "", "isHotLoadingEnabled", "isPerfMonitorShown", "<init>", "(ZZZ)V", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DevToolsSettings {
    public static final int $stable = 0;
    private final boolean isElementInspectorShown;
    private final boolean isHotLoadingEnabled;
    private final boolean isPerfMonitorShown;

    public DevToolsSettings() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ DevToolsSettings copy$default(DevToolsSettings devToolsSettings, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = devToolsSettings.isElementInspectorShown;
        }
        if ((i & 2) != 0) {
            z2 = devToolsSettings.isHotLoadingEnabled;
        }
        if ((i & 4) != 0) {
            z3 = devToolsSettings.isPerfMonitorShown;
        }
        return devToolsSettings.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsElementInspectorShown() {
        return this.isElementInspectorShown;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsHotLoadingEnabled() {
        return this.isHotLoadingEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPerfMonitorShown() {
        return this.isPerfMonitorShown;
    }

    public final DevToolsSettings copy(boolean isElementInspectorShown, boolean isHotLoadingEnabled, boolean isPerfMonitorShown) {
        return new DevToolsSettings(isElementInspectorShown, isHotLoadingEnabled, isPerfMonitorShown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevToolsSettings)) {
            return false;
        }
        DevToolsSettings devToolsSettings = (DevToolsSettings) other;
        return this.isElementInspectorShown == devToolsSettings.isElementInspectorShown && this.isHotLoadingEnabled == devToolsSettings.isHotLoadingEnabled && this.isPerfMonitorShown == devToolsSettings.isPerfMonitorShown;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isElementInspectorShown) * 31) + Boolean.hashCode(this.isHotLoadingEnabled)) * 31) + Boolean.hashCode(this.isPerfMonitorShown);
    }

    public String toString() {
        return "DevToolsSettings(isElementInspectorShown=" + this.isElementInspectorShown + ", isHotLoadingEnabled=" + this.isHotLoadingEnabled + ", isPerfMonitorShown=" + this.isPerfMonitorShown + ")";
    }

    public DevToolsSettings(boolean z, boolean z2, boolean z3) {
        this.isElementInspectorShown = z;
        this.isHotLoadingEnabled = z2;
        this.isPerfMonitorShown = z3;
    }

    public /* synthetic */ DevToolsSettings(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3);
    }

    public final boolean isElementInspectorShown() {
        return this.isElementInspectorShown;
    }

    public final boolean isHotLoadingEnabled() {
        return this.isHotLoadingEnabled;
    }

    public final boolean isPerfMonitorShown() {
        return this.isPerfMonitorShown;
    }
}
