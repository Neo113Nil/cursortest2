package expo.modules.adapters.branch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BranchReactActivityLifecycleListener.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lexpo/modules/adapters/branch/BranchReactActivityLifecycleListener;", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "activityContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onCreate", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "config-plugins-react-native-branch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BranchReactActivityLifecycleListener implements ReactActivityLifecycleListener {
    public BranchReactActivityLifecycleListener(Context activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public void onCreate(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        RNBranchModule.initSession(activity.getIntent().getData(), activity);
    }

    @Override // expo.modules.core.interfaces.ReactActivityLifecycleListener
    public boolean onNewIntent(Intent intent) {
        if (intent != null) {
            RNBranchModule.onNewIntent(intent);
        }
        return super.onNewIntent(intent);
    }
}
