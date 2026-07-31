package expo.interfaces.devmenu;

import kotlin.Metadata;

/* compiled from: DevMenuPreferencesInterface.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007R\u0018\u0010\u0013\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0005\"\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lexpo/interfaces/devmenu/DevMenuPreferencesInterface;", "", "motionGestureEnabled", "", "getMotionGestureEnabled", "()Z", "setMotionGestureEnabled", "(Z)V", "touchGestureEnabled", "getTouchGestureEnabled", "setTouchGestureEnabled", "keyCommandsEnabled", "getKeyCommandsEnabled", "setKeyCommandsEnabled", "showsAtLaunch", "getShowsAtLaunch", "setShowsAtLaunch", "isOnboardingFinished", "setOnboardingFinished", "showFab", "getShowFab", "setShowFab", "expo-dev-menu-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DevMenuPreferencesInterface {
    boolean getKeyCommandsEnabled();

    boolean getMotionGestureEnabled();

    boolean getShowFab();

    boolean getShowsAtLaunch();

    boolean getTouchGestureEnabled();

    boolean isOnboardingFinished();

    void setKeyCommandsEnabled(boolean z);

    void setMotionGestureEnabled(boolean z);

    void setOnboardingFinished(boolean z);

    void setShowFab(boolean z);

    void setShowsAtLaunch(boolean z);

    void setTouchGestureEnabled(boolean z);
}
