package expo.modules.devlauncher.launcher;

import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* compiled from: DevLauncherIntentRegistry.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0012\u001a\u00020\b2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016J \u0010\u0014\u001a\u00020\b2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016R$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lexpo/modules/devlauncher/launcher/DevLauncherIntentRegistry;", "Lexpo/modules/devlauncher/launcher/DevLauncherIntentRegistryInterface;", "<init>", "()V", "pendingIntentListeners", "", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "Lexpo/modules/devlauncher/launcher/DevLauncherPendingIntentListener;", "<set-?>", SDKConstants.PARAM_INTENT, "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "intent$delegate", "Lkotlin/properties/ReadWriteProperty;", "subscribe", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unsubscribe", "consumePendingIntent", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherIntentRegistry implements DevLauncherIntentRegistryInterface {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevLauncherIntentRegistry.class, SDKConstants.PARAM_INTENT, "getIntent()Landroid/content/Intent;", 0))};
    public static final int $stable = 8;

    /* renamed from: intent$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty intent;
    private final List<Function1<Intent, Unit>> pendingIntentListeners = new ArrayList();

    public DevLauncherIntentRegistry() {
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.intent = new ObservableProperty<Intent>(obj) { // from class: expo.modules.devlauncher.launcher.DevLauncherIntentRegistry$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Intent oldValue, Intent newValue) {
                List list;
                Intrinsics.checkNotNullParameter(property, "property");
                Intent intent = newValue;
                if (intent != null) {
                    list = this.pendingIntentListeners;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(intent);
                    }
                }
            }
        };
    }

    @Override // expo.modules.devlauncher.launcher.DevLauncherIntentRegistryInterface
    public Intent getIntent() {
        return (Intent) this.intent.getValue(this, $$delegatedProperties[0]);
    }

    @Override // expo.modules.devlauncher.launcher.DevLauncherIntentRegistryInterface
    public void setIntent(Intent intent) {
        this.intent.setValue(this, $$delegatedProperties[0], intent);
    }

    @Override // expo.modules.devlauncher.launcher.DevLauncherIntentRegistryInterface
    public void subscribe(Function1<? super Intent, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.pendingIntentListeners.add(listener);
    }

    @Override // expo.modules.devlauncher.launcher.DevLauncherIntentRegistryInterface
    public void unsubscribe(Function1<? super Intent, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.pendingIntentListeners.remove(listener);
    }

    @Override // expo.modules.devlauncher.launcher.DevLauncherIntentRegistryInterface
    public Intent consumePendingIntent() {
        Intent intent = getIntent();
        setIntent(null);
        return intent;
    }
}
