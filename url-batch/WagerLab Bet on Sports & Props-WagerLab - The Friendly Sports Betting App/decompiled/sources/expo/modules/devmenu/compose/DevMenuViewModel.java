package expo.modules.devmenu.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.interfaces.devmenu.DevMenuPreferencesInterface;
import expo.interfaces.devmenu.ReactHostWrapper;
import expo.modules.devmenu.DevMenuManager;
import expo.modules.devmenu.DevMenuPreferencesHandle;
import expo.modules.devmenu.compose.DevMenuAction;
import expo.modules.devmenu.compose.DevMenuState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuViewModel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "menuPreferences", "Lexpo/modules/devmenu/DevMenuPreferencesHandle;", "_state", "Landroidx/compose/runtime/MutableState;", "Lexpo/modules/devmenu/compose/DevMenuState;", "state", "getState", "()Lexpo/modules/devmenu/compose/DevMenuState;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "onCleared", "updateAppInfo", "appInfo", "Lexpo/modules/devmenu/compose/DevMenuState$AppInfo;", "updateCustomItems", "callbacks", "", "Lexpo/modules/devmenu/DevMenuManager$Callback;", "closeMenu", "openMenu", "onAction", "action", "Lexpo/modules/devmenu/compose/DevMenuAction;", "(Lexpo/modules/devmenu/compose/DevMenuAction;)Lkotlin/Unit;", "Companion", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuViewModel extends ViewModel {
    private final MutableState<DevMenuState> _state;
    private final Function0<Unit> listener;
    private final DevMenuPreferencesHandle menuPreferences;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DevMenuViewModel() {
        DevMenuPreferencesHandle devMenuPreferencesHandle = DevMenuPreferencesHandle.INSTANCE;
        this.menuPreferences = devMenuPreferencesHandle;
        this._state = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new DevMenuState(null, false, DevMenuManager.INSTANCE.getDevSettings(), false, false, INSTANCE.mapCallbacks(DevMenuManager.INSTANCE.getRegisteredCallbacks()), 27, null), null, 2, null);
        Function0<Unit> function0 = new Function0() { // from class: expo.modules.devmenu.compose.DevMenuViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit listener$lambda$0;
                listener$lambda$0 = DevMenuViewModel.listener$lambda$0(DevMenuViewModel.this);
                return listener$lambda$0;
            }
        };
        this.listener = function0;
        devMenuPreferencesHandle.addOnChangeListener(function0);
    }

    public final DevMenuState getState() {
        return this._state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listener$lambda$0(DevMenuViewModel devMenuViewModel) {
        devMenuViewModel._state.setValue(DevMenuState.copy$default(devMenuViewModel.getState(), null, false, null, false, devMenuViewModel.menuPreferences.getShowFab(), null, 47, null));
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        this.menuPreferences.removeOnChangeListener(this.listener);
    }

    public final void updateAppInfo(DevMenuState.AppInfo appInfo) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        MutableState<DevMenuState> mutableState = this._state;
        DevMenuState value = mutableState.getValue();
        DevMenuPreferencesInterface settings = DevMenuManager.INSTANCE.getSettings();
        mutableState.setValue(DevMenuState.copy$default(value, appInfo, false, null, settings != null ? settings.isOnboardingFinished() : true, false, null, 54, null));
    }

    public final void updateCustomItems(List<DevMenuManager.Callback> callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        MutableState<DevMenuState> mutableState = this._state;
        mutableState.setValue(DevMenuState.copy$default(mutableState.getValue(), null, false, null, false, false, INSTANCE.mapCallbacks(callbacks), 31, null));
    }

    private final void closeMenu() {
        MutableState<DevMenuState> mutableState = this._state;
        mutableState.setValue(DevMenuState.copy$default(mutableState.getValue(), null, false, null, false, false, null, 61, null));
    }

    private final void openMenu() {
        MutableState<DevMenuState> mutableState = this._state;
        mutableState.setValue(DevMenuState.copy$default(mutableState.getValue(), null, true, DevMenuManager.INSTANCE.getDevSettings(), false, false, null, 57, null));
    }

    public final Unit onAction(DevMenuAction action) {
        DevSupportManager devSupportManager;
        Intrinsics.checkNotNullParameter(action, "action");
        DevMenuManager devMenuManager = DevMenuManager.INSTANCE;
        if (Intrinsics.areEqual(action, DevMenuAction.Open.INSTANCE)) {
            openMenu();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(action, DevMenuAction.Close.INSTANCE)) {
            closeMenu();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(action, DevMenuAction.Reload.INSTANCE)) {
            devMenuManager.reload();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(action, DevMenuAction.GoHome.INSTANCE)) {
            devMenuManager.goToHome();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(action, DevMenuAction.TogglePerformanceMonitor.INSTANCE)) {
            devMenuManager.togglePerformanceMonitor();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(action, DevMenuAction.OpenJSDebugger.INSTANCE)) {
            devMenuManager.openJSInspector();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(action, DevMenuAction.OpenReactNativeDevMenu.INSTANCE)) {
            ReactHostWrapper reactHost = devMenuManager.getReactHost();
            if (reactHost == null || (devSupportManager = reactHost.getDevSupportManager()) == null) {
                return null;
            }
            devSupportManager.showDevOptionsDialog();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(action, DevMenuAction.ToggleElementInspector.INSTANCE)) {
            devMenuManager.toggleInspector();
            return Unit.INSTANCE;
        }
        if (action instanceof DevMenuAction.ToggleFastRefresh) {
            devMenuManager.toggleFastRefresh();
            MutableState<DevMenuState> mutableState = this._state;
            mutableState.setValue(DevMenuState.copy$default(mutableState.getValue(), null, false, DevMenuManager.INSTANCE.getDevSettings(), false, false, null, 59, null));
            return Unit.INSTANCE;
        }
        if (action instanceof DevMenuAction.ToggleFab) {
            devMenuManager.toggleFab();
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(action, DevMenuAction.FinishOnboarding.INSTANCE)) {
            DevMenuPreferencesInterface settings = DevMenuManager.INSTANCE.getSettings();
            if (settings != null) {
                settings.setOnboardingFinished(true);
            }
            MutableState<DevMenuState> mutableState2 = this._state;
            mutableState2.setValue(DevMenuState.copy$default(mutableState2.getValue(), null, false, null, true, false, null, 55, null));
            return Unit.INSTANCE;
        }
        if (!(action instanceof DevMenuAction.TriggerCustomCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        devMenuManager.sendEventToDelegateBridge("registeredCallbackFired", ((DevMenuAction.TriggerCustomCallback) action).getName());
        return Unit.INSTANCE;
    }

    /* compiled from: DevMenuViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002¨\u0006\t"}, d2 = {"Lexpo/modules/devmenu/compose/DevMenuViewModel$Companion;", "", "<init>", "()V", "mapCallbacks", "", "Lexpo/modules/devmenu/compose/DevMenuState$CustomItem;", "callbacks", "Lexpo/modules/devmenu/DevMenuManager$Callback;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<DevMenuState.CustomItem> mapCallbacks(List<DevMenuManager.Callback> callbacks) {
            List<DevMenuManager.Callback> list = callbacks;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (DevMenuManager.Callback callback : list) {
                arrayList.add(new DevMenuState.CustomItem(callback.getName(), callback.getShouldCollapse()));
            }
            return arrayList;
        }
    }
}
