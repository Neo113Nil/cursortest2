package expo.modules.devmenu.compose;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuAction.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction;", "", "shouldCloseMenu", "", "<init>", "(Z)V", "getShouldCloseMenu", "()Z", "Open", "Close", "Reload", "GoHome", "TogglePerformanceMonitor", "ToggleElementInspector", "ToggleFab", "OpenJSDebugger", "ToggleFastRefresh", "OpenReactNativeDevMenu", "FinishOnboarding", "TriggerCustomCallback", "Lexpo/modules/devmenu/compose/DevMenuAction$Close;", "Lexpo/modules/devmenu/compose/DevMenuAction$FinishOnboarding;", "Lexpo/modules/devmenu/compose/DevMenuAction$GoHome;", "Lexpo/modules/devmenu/compose/DevMenuAction$Open;", "Lexpo/modules/devmenu/compose/DevMenuAction$OpenJSDebugger;", "Lexpo/modules/devmenu/compose/DevMenuAction$OpenReactNativeDevMenu;", "Lexpo/modules/devmenu/compose/DevMenuAction$Reload;", "Lexpo/modules/devmenu/compose/DevMenuAction$ToggleElementInspector;", "Lexpo/modules/devmenu/compose/DevMenuAction$ToggleFab;", "Lexpo/modules/devmenu/compose/DevMenuAction$ToggleFastRefresh;", "Lexpo/modules/devmenu/compose/DevMenuAction$TogglePerformanceMonitor;", "Lexpo/modules/devmenu/compose/DevMenuAction$TriggerCustomCallback;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DevMenuAction {
    public static final int $stable = 0;
    private final boolean shouldCloseMenu;

    public /* synthetic */ DevMenuAction(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$Open;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Open extends DevMenuAction {
        public static final int $stable = 0;
        public static final Open INSTANCE = new Open();

        private Open() {
            super(false, 1, null);
        }
    }

    private DevMenuAction(boolean z) {
        this.shouldCloseMenu = z;
    }

    public /* synthetic */ DevMenuAction(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, null);
    }

    public final boolean getShouldCloseMenu() {
        return this.shouldCloseMenu;
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$Close;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Close extends DevMenuAction {
        public static final int $stable = 0;
        public static final Close INSTANCE = new Close();

        private Close() {
            super(false, 1, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$Reload;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Reload extends DevMenuAction {
        public static final int $stable = 0;
        public static final Reload INSTANCE = new Reload();

        private Reload() {
            super(true, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$GoHome;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoHome extends DevMenuAction {
        public static final int $stable = 0;
        public static final GoHome INSTANCE = new GoHome();

        private GoHome() {
            super(true, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$TogglePerformanceMonitor;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TogglePerformanceMonitor extends DevMenuAction {
        public static final int $stable = 0;
        public static final TogglePerformanceMonitor INSTANCE = new TogglePerformanceMonitor();

        private TogglePerformanceMonitor() {
            super(true, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$ToggleElementInspector;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ToggleElementInspector extends DevMenuAction {
        public static final int $stable = 0;
        public static final ToggleElementInspector INSTANCE = new ToggleElementInspector();

        private ToggleElementInspector() {
            super(true, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$ToggleFab;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ToggleFab extends DevMenuAction {
        public static final int $stable = 0;
        public static final ToggleFab INSTANCE = new ToggleFab();

        private ToggleFab() {
            super(false, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$OpenJSDebugger;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenJSDebugger extends DevMenuAction {
        public static final int $stable = 0;
        public static final OpenJSDebugger INSTANCE = new OpenJSDebugger();

        private OpenJSDebugger() {
            super(true, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$ToggleFastRefresh;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "newValue", "", "<init>", "(Z)V", "getNewValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ToggleFastRefresh extends DevMenuAction {
        public static final int $stable = 0;
        private final boolean newValue;

        public static /* synthetic */ ToggleFastRefresh copy$default(ToggleFastRefresh toggleFastRefresh, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = toggleFastRefresh.newValue;
            }
            return toggleFastRefresh.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getNewValue() {
            return this.newValue;
        }

        public final ToggleFastRefresh copy(boolean newValue) {
            return new ToggleFastRefresh(newValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToggleFastRefresh) && this.newValue == ((ToggleFastRefresh) other).newValue;
        }

        public int hashCode() {
            return Boolean.hashCode(this.newValue);
        }

        public String toString() {
            return "ToggleFastRefresh(newValue=" + this.newValue + ")";
        }

        public ToggleFastRefresh(boolean z) {
            super(false, null);
            this.newValue = z;
        }

        public final boolean getNewValue() {
            return this.newValue;
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$OpenReactNativeDevMenu;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenReactNativeDevMenu extends DevMenuAction {
        public static final int $stable = 0;
        public static final OpenReactNativeDevMenu INSTANCE = new OpenReactNativeDevMenu();

        private OpenReactNativeDevMenu() {
            super(true, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$FinishOnboarding;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "<init>", "()V", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FinishOnboarding extends DevMenuAction {
        public static final int $stable = 0;
        public static final FinishOnboarding INSTANCE = new FinishOnboarding();

        private FinishOnboarding() {
            super(false, null);
        }
    }

    /* compiled from: DevMenuAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuAction$TriggerCustomCallback;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "name", "", "shouldCollapse", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getShouldCollapse", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TriggerCustomCallback extends DevMenuAction {
        public static final int $stable = 0;
        private final String name;
        private final boolean shouldCollapse;

        public static /* synthetic */ TriggerCustomCallback copy$default(TriggerCustomCallback triggerCustomCallback, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = triggerCustomCallback.name;
            }
            if ((i & 2) != 0) {
                z = triggerCustomCallback.shouldCollapse;
            }
            return triggerCustomCallback.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldCollapse() {
            return this.shouldCollapse;
        }

        public final TriggerCustomCallback copy(String name, boolean shouldCollapse) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new TriggerCustomCallback(name, shouldCollapse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TriggerCustomCallback)) {
                return false;
            }
            TriggerCustomCallback triggerCustomCallback = (TriggerCustomCallback) other;
            return Intrinsics.areEqual(this.name, triggerCustomCallback.name) && this.shouldCollapse == triggerCustomCallback.shouldCollapse;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Boolean.hashCode(this.shouldCollapse);
        }

        public String toString() {
            return "TriggerCustomCallback(name=" + this.name + ", shouldCollapse=" + this.shouldCollapse + ")";
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getShouldCollapse() {
            return this.shouldCollapse;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TriggerCustomCallback(String name, boolean z) {
            super(z, null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.shouldCollapse = z;
        }
    }
}
