package io.bidmachine.media3.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.PowerManager;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.media3.common.Player;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Clock;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

@UnstableApi
/* loaded from: classes5.dex */
public final class WearUnsuitableOutputPlaybackSuppressionResolverListener implements Player.Listener {
    public static final long DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS = TimeUnit.MINUTES.toMillis(5);
    private static final String EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT = "EXTRA_CLOSE_ON_CONNECT";
    private static final String EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY = "EXTRA_CONNECTION_ONLY";
    private static final String EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE = "android.bluetooth.devicepicker.extra.FILTER_TYPE";
    private static final String EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME = "com.android.settings.panel.extra.PACKAGE_NAME";
    private static final int FILTER_TYPE_AUDIO = 1;
    private static final String OUTPUT_SWITCHER_INTENT_ACTION_NAME = "com.android.settings.panel.action.MEDIA_OUTPUT";
    private static final String WAKE_LOCK_TAG = "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock";
    private final Context applicationContext;
    private final long autoResumeTimeoutAfterUnsuitableOutputSuppressionMs;
    private final Clock clock;
    private long unsuitableOutputPlaybackSuppressionStartRealtimeMs;

    @Nullable
    private final PowerManager.WakeLock wakeLock;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.bidmachine");
        p0.startActivity(p1);
    }

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context) {
        this(context, DEFAULT_PLAYBACK_SUPPRESSION_AUTO_RESUME_TIMEOUT_MS);
    }

    public WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context, @IntRange long j) {
        this(context, j, Clock.DEFAULT);
    }

    @VisibleForTesting
    WearUnsuitableOutputPlaybackSuppressionResolverListener(Context context, @IntRange long j, Clock clock) {
        PowerManager.WakeLock wakeLock;
        Assertions.checkArgument(j >= 0);
        Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs = j;
        this.clock = clock;
        this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = -9223372036854775807L;
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        if (powerManager != null) {
            wakeLock = powerManager.newWakeLock(1, WAKE_LOCK_TAG);
            wakeLock.setReferenceCounted(false);
        } else {
            wakeLock = null;
        }
        this.wakeLock = wakeLock;
    }

    @Override // io.bidmachine.media3.common.Player.Listener
    public void onEvents(Player player, Player.Events events) {
        if (Util.isWear(this.applicationContext)) {
            if ((events.contains(6) || events.contains(5)) && player.getPlayWhenReady() && player.getPlaybackSuppressionReason() == 3) {
                player.pause();
                this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = this.clock.elapsedRealtime();
                PowerManager.WakeLock wakeLock = this.wakeLock;
                if (wakeLock != null && !wakeLock.isHeld()) {
                    this.wakeLock.acquire(this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs);
                }
                if (events.contains(5)) {
                    launchSystemMediaOutputSwitcherUi(this.applicationContext);
                    return;
                }
                return;
            }
            if (!events.contains(6) || player.getPlaybackSuppressionReason() != 0 || this.unsuitableOutputPlaybackSuppressionStartRealtimeMs == -9223372036854775807L || this.clock.elapsedRealtime() - this.unsuitableOutputPlaybackSuppressionStartRealtimeMs >= this.autoResumeTimeoutAfterUnsuitableOutputSuppressionMs) {
                return;
            }
            this.unsuitableOutputPlaybackSuppressionStartRealtimeMs = -9223372036854775807L;
            player.play();
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
        }
    }

    private static void launchSystemMediaOutputSwitcherUi(Context context) {
        Intent putExtra = new Intent(OUTPUT_SWITCHER_INTENT_ACTION_NAME).addFlags(268435456).putExtra(EXTRA_OUTPUT_SWITCHER_PACKAGE_NAME, context.getPackageName());
        ComponentName systemOrSystemUpdatedAppComponent = getSystemOrSystemUpdatedAppComponent(context, putExtra);
        if (systemOrSystemUpdatedAppComponent != null) {
            putExtra.setComponent(systemOrSystemUpdatedAppComponent);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, putExtra);
            return;
        }
        Intent putExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra(EXTRA_BLUETOOTH_SETTINGS_CLOSE_ON_CONNECT, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_CONNECTION_ONLY, true).putExtra(EXTRA_BLUETOOTH_SETTINGS_FILTER_TYPE, 1);
        ComponentName systemOrSystemUpdatedAppComponent2 = getSystemOrSystemUpdatedAppComponent(context, putExtra2);
        if (systemOrSystemUpdatedAppComponent2 != null) {
            putExtra2.setComponent(systemOrSystemUpdatedAppComponent2);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, putExtra2);
        }
    }

    @Nullable
    private static ComponentName getSystemOrSystemUpdatedAppComponent(Context context, Intent intent) {
        ApplicationInfo applicationInfo;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }
}
