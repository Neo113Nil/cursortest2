package expo.modules.devlauncher.launcher;

import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: DevLauncherIntentRegistry.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000bj\u0002`\fH&J \u0010\r\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000bj\u0002`\fH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0003H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lexpo/modules/devlauncher/launcher/DevLauncherIntentRegistryInterface;", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "subscribe", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lexpo/modules/devlauncher/launcher/DevLauncherPendingIntentListener;", "unsubscribe", "consumePendingIntent", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DevLauncherIntentRegistryInterface {
    Intent consumePendingIntent();

    Intent getIntent();

    void setIntent(Intent intent);

    void subscribe(Function1<? super Intent, Unit> listener);

    void unsubscribe(Function1<? super Intent, Unit> listener);
}
