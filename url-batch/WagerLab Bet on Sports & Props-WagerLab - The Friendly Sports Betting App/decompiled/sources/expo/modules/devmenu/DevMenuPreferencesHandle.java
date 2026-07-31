package expo.modules.devmenu;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.media3.common.MimeTypes;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.interfaces.devmenu.DevMenuPreferencesInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuPreferences.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0018\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R$\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R$\u0010\"\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R$\u0010$\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018¨\u0006/"}, d2 = {"Lexpo/modules/devmenu/DevMenuPreferencesHandle;", "Lexpo/interfaces/devmenu/DevMenuPreferencesInterface;", "<init>", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "listeners", "", "Lkotlin/Function0;", "", "mainListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "init", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "addOnChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeOnChangeListener", "value", "", "motionGestureEnabled", "getMotionGestureEnabled", "()Z", "setMotionGestureEnabled", "(Z)V", "touchGestureEnabled", "getTouchGestureEnabled", "setTouchGestureEnabled", "keyCommandsEnabled", "getKeyCommandsEnabled", "setKeyCommandsEnabled", "showsAtLaunch", "getShowsAtLaunch", "setShowsAtLaunch", "isOnboardingFinished", "setOnboardingFinished", "showFab", "getShowFab", "setShowFab", "saveBoolean", "key", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "setPreferences", "settings", "Lcom/facebook/react/bridge/ReadableMap;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuPreferencesHandle implements DevMenuPreferencesInterface {
    private static SharedPreferences sharedPreferences;
    public static final DevMenuPreferencesHandle INSTANCE = new DevMenuPreferencesHandle();
    private static final List<Function0<Unit>> listeners = new ArrayList();
    private static final SharedPreferences.OnSharedPreferenceChangeListener mainListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: expo.modules.devmenu.DevMenuPreferencesHandle$$ExternalSyntheticLambda0
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
            DevMenuPreferencesHandle.mainListener$lambda$1(sharedPreferences2, str);
        }
    };
    public static final int $stable = 8;

    private DevMenuPreferencesHandle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mainListener$lambda$1(SharedPreferences sharedPreferences2, String str) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public final void init(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        SharedPreferences sharedPreferences2 = application.getSharedPreferences("expo.modules.devmenu.sharedpreferences", 0);
        sharedPreferences = sharedPreferences2;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        sharedPreferences2.registerOnSharedPreferenceChangeListener(mainListener);
    }

    public final void addOnChangeListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.add(listener);
    }

    public final void removeOnChangeListener(Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.remove(listener);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public boolean getMotionGestureEnabled() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getBoolean("motionGestureEnabled", true);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public void setMotionGestureEnabled(boolean z) {
        saveBoolean("motionGestureEnabled", z);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public boolean getTouchGestureEnabled() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getBoolean("touchGestureEnabled", true);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public void setTouchGestureEnabled(boolean z) {
        saveBoolean("touchGestureEnabled", z);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public boolean getKeyCommandsEnabled() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getBoolean("keyCommandsEnabled", true);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public void setKeyCommandsEnabled(boolean z) {
        saveBoolean("keyCommandsEnabled", z);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public boolean getShowsAtLaunch() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getBoolean("showsAtLaunch", false);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public void setShowsAtLaunch(boolean z) {
        saveBoolean("showsAtLaunch", z);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public boolean isOnboardingFinished() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getBoolean("isOnboardingFinished", false);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public void setOnboardingFinished(boolean z) {
        saveBoolean("isOnboardingFinished", z);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public boolean getShowFab() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        return sharedPreferences2.getBoolean("showFab", false);
    }

    @Override // expo.interfaces.devmenu.DevMenuPreferencesInterface
    public void setShowFab(boolean z) {
        saveBoolean("showFab", z);
    }

    private final void saveBoolean(String key, boolean value) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences2 = null;
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.putBoolean(key, value);
        edit.commit();
    }

    public final WritableMap serialize() {
        WritableMap createMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(createMap, "createMap(...)");
        DevMenuPreferencesHandle devMenuPreferencesHandle = INSTANCE;
        createMap.putBoolean("motionGestureEnabled", devMenuPreferencesHandle.getMotionGestureEnabled());
        createMap.putBoolean("touchGestureEnabled", devMenuPreferencesHandle.getTouchGestureEnabled());
        createMap.putBoolean("keyCommandsEnabled", devMenuPreferencesHandle.getKeyCommandsEnabled());
        createMap.putBoolean("showsAtLaunch", devMenuPreferencesHandle.getShowsAtLaunch());
        createMap.putBoolean("isOnboardingFinished", devMenuPreferencesHandle.isOnboardingFinished());
        createMap.putBoolean("showFab", devMenuPreferencesHandle.getShowFab());
        return createMap;
    }

    public final void setPreferences(ReadableMap settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (settings.hasKey("motionGestureEnabled")) {
            setMotionGestureEnabled(settings.getBoolean("motionGestureEnabled"));
        }
        if (settings.hasKey("keyCommandsEnabled")) {
            setKeyCommandsEnabled(settings.getBoolean("keyCommandsEnabled"));
        }
        if (settings.hasKey("showsAtLaunch")) {
            setShowsAtLaunch(settings.getBoolean("showsAtLaunch"));
        }
        if (settings.hasKey("touchGestureEnabled")) {
            setTouchGestureEnabled(settings.getBoolean("touchGestureEnabled"));
        }
        if (settings.hasKey("showFab")) {
            setShowFab(settings.getBoolean("showFab"));
        }
    }
}
