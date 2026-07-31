package expo.modules.devmenu.react;

import android.util.Log;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import expo.interfaces.devmenu.ReactHostWrapper;
import expo.modules.devmenu.helpers.DevMenuReflectionExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuShakeDetectorListenerSwapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lexpo/modules/devmenu/react/DevMenuShakeDetectorListenerSwapper;", "", "<init>", "()V", "swapShakeDetectorListener", "", "reactHost", "Lexpo/interfaces/devmenu/ReactHostWrapper;", "newListener", "Lcom/facebook/react/common/ShakeDetector$ShakeListener;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuShakeDetectorListenerSwapper {
    public static final int $stable = 0;

    public final void swapShakeDetectorListener(ReactHostWrapper reactHost, ShakeDetector.ShakeListener newListener) {
        Intrinsics.checkNotNullParameter(reactHost, "reactHost");
        Intrinsics.checkNotNullParameter(newListener, "newListener");
        try {
            DevSupportManager devSupportManager = reactHost.getDevSupportManager();
            if (devSupportManager == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (devSupportManager instanceof DevSupportManagerBase) {
                ShakeDetector shakeDetector = (ShakeDetector) DevMenuReflectionExtensionsKt.getPrivateDeclaredFieldValue(DevSupportManagerBase.class, "shakeDetector", devSupportManager);
                if (DevMenuReflectionExtensionsKt.hasDeclaredField(ShakeDetector.class, "shakeListener")) {
                    DevMenuReflectionExtensionsKt.setPrivateDeclaredFieldValue(ShakeDetector.class, "shakeListener", shakeDetector, newListener);
                } else {
                    DevMenuReflectionExtensionsKt.setPrivateDeclaredFieldValue(ShakeDetector.class, "mShakeListener", shakeDetector, newListener);
                }
            }
        } catch (Exception e) {
            Log.w("DevMenu", "Couldn't swap shake detector listener: " + e.getMessage(), e);
        }
    }
}
