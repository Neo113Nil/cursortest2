package expo.interfaces.devmenu;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DevMenuManagerInterface.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010\u001c\u001a\u00020\u0003H&J\u001a\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H&J\b\u0010 \u001a\u00020\fH&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\fH&R\u0012\u0010#\u001a\u00020$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lexpo/interfaces/devmenu/DevMenuManagerInterface;", "", "openMenu", "", "activity", "Landroid/app/Activity;", "screen", "", "closeMenu", "hideMenu", "toggleMenu", "onKeyEvent", "", "keyCode", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onTouchEvent", "ev", "Landroid/view/MotionEvent;", "setDelegate", "newDelegate", "Lexpo/interfaces/devmenu/DevMenuDelegateInterface;", "initializeWithReactHost", "reactHost", "Lexpo/interfaces/devmenu/ReactHostWrapper;", "getSettings", "Lexpo/interfaces/devmenu/DevMenuPreferencesInterface;", "synchronizeDelegate", "sendEventToDelegateBridge", "eventName", "eventData", "isInitialized", "setCanLaunchDevMenuOnStart", "shouldAutoLaunch", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "expo-dev-menu-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DevMenuManagerInterface {
    void closeMenu();

    CoroutineScope getCoroutineScope();

    DevMenuPreferencesInterface getSettings();

    void hideMenu();

    void initializeWithReactHost(ReactHostWrapper reactHost);

    boolean isInitialized();

    boolean onKeyEvent(int keyCode, KeyEvent event);

    void onTouchEvent(MotionEvent ev);

    void openMenu(Activity activity, String screen);

    void sendEventToDelegateBridge(String eventName, Object eventData);

    void setCanLaunchDevMenuOnStart(boolean shouldAutoLaunch);

    void setDelegate(DevMenuDelegateInterface newDelegate);

    void synchronizeDelegate();

    void toggleMenu(Activity activity);

    /* compiled from: DevMenuManagerInterface.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void openMenu$default(DevMenuManagerInterface devMenuManagerInterface, Activity activity, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMenu");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            devMenuManagerInterface.openMenu(activity, str);
        }
    }
}
