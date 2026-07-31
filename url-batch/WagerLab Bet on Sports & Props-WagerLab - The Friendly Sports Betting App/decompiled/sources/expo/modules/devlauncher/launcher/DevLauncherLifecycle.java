package expo.modules.devlauncher.launcher;

import com.facebook.react.ReactActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherLifecycle.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0007J\u001e\u0010\f\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tJ\u001e\u0010\u000e\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tR$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lexpo/modules/devlauncher/launcher/DevLauncherLifecycle;", "", "<init>", "()V", "delegateWillBeCreatedListeners", "Ljava/util/LinkedList;", "Lkotlin/Function1;", "Lcom/facebook/react/ReactActivity;", "", "Lexpo/modules/devlauncher/launcher/DevLauncherDelegateWillBeCreated;", "delegateWillBeCreated", "activity", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherLifecycle {
    public static final int $stable = 8;
    private final LinkedList<Function1<ReactActivity, Unit>> delegateWillBeCreatedListeners = new LinkedList<>();

    public final void delegateWillBeCreated(ReactActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = this.delegateWillBeCreatedListeners.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(activity);
        }
    }

    public final void addListener(Function1<? super ReactActivity, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.delegateWillBeCreatedListeners.add(listener);
    }

    public final void removeListener(Function1<? super ReactActivity, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.delegateWillBeCreatedListeners.remove(listener);
    }
}
