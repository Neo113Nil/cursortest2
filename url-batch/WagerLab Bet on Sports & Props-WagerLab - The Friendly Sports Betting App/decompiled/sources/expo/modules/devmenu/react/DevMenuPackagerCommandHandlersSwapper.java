package expo.modules.devmenu.react;

import android.util.Log;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.packagerconnection.RequestHandler;
import expo.interfaces.devmenu.ReactHostWrapper;
import expo.modules.devmenu.DevMenuManager;
import expo.modules.devmenu.helpers.DevMenuReflectionExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: DevMenuPackagerCommandHandlersSwapper.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ$\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¨\u0006\r"}, d2 = {"Lexpo/modules/devmenu/react/DevMenuPackagerCommandHandlersSwapper;", "", "<init>", "()V", "swapPackagerCommandHandlers", "", "reactHost", "Lexpo/interfaces/devmenu/ReactHostWrapper;", "handlers", "", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "swapCurrentCommandHandlers", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuPackagerCommandHandlersSwapper {
    public static final int $stable = 0;

    public final void swapPackagerCommandHandlers(ReactHostWrapper reactHost, Map<String, ? extends RequestHandler> handlers) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(reactHost, "reactHost");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        try {
            DevSupportManager devSupportManager = reactHost.getDevSupportManager();
            if (devSupportManager == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (devSupportManager instanceof DevSupportManagerBase) {
                Map map = (Map) DevMenuReflectionExtensionsKt.getPrivateDeclaredFieldValue(DevSupportManagerBase.class, "customPackagerCommandHandlers", devSupportManager);
                if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.putAll(handlers);
                DevMenuReflectionExtensionsKt.setPrivateDeclaredFieldValue(DevSupportManagerBase.class, "customPackagerCommandHandlers", devSupportManager, linkedHashMap);
                swapCurrentCommandHandlers(reactHost, handlers);
            }
        } catch (Exception e) {
            Log.w("DevMenu", "Couldn't add packager command handlers to current client: " + e.getMessage(), e);
        }
    }

    private final void swapCurrentCommandHandlers(ReactHostWrapper reactHost, Map<String, ? extends RequestHandler> handlers) {
        BuildersKt__Builders_commonKt.launch$default(DevMenuManager.INSTANCE.getCoroutineScope(), null, null, new DevMenuPackagerCommandHandlersSwapper$swapCurrentCommandHandlers$1(reactHost, handlers, null), 3, null);
    }
}
