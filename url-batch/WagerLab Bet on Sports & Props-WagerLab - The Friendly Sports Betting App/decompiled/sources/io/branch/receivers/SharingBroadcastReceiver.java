package io.branch.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.branch.referral.Branch;
import io.branch.referral.BranchLogger;
import io.branch.referral.NativeShareLinkManager;
import io.branch.referral.util.SharingUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharingBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lio/branch/receivers/SharingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharingBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        BranchLogger.v("Intent: " + intent);
        BranchLogger.v("Clicked component: " + componentName);
        Branch.BranchNativeLinkShareListener linkShareListenerCallback = NativeShareLinkManager.getInstance().getLinkShareListenerCallback();
        if (linkShareListenerCallback != null) {
            linkShareListenerCallback.onChannelSelected(String.valueOf(componentName));
        }
        Branch.BranchNativeLinkShareListener linkShareListenerCallback2 = NativeShareLinkManager.getInstance().getLinkShareListenerCallback();
        if (linkShareListenerCallback2 != null) {
            linkShareListenerCallback2.onLinkShareResponse(SharingUtil.INSTANCE.getSharedURL(), null);
        }
    }
}
