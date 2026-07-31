package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes5.dex */
public class SoundUtils {
    private static final long CACHE_DURATION_MS = 2000;
    private static final String TAG = "SoundUtils";
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();
    private static volatile boolean isRefreshing = false;
    private static long lastCheckedTime = 0;
    private static boolean lastMutedState = true;

    public static boolean isSoundMuted(Context context) {
        if (context == null) {
            return true;
        }
        if (System.currentTimeMillis() - lastCheckedTime >= 2000 && !isRefreshing) {
            refreshInBackground(context.getApplicationContext());
        }
        return lastMutedState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$refreshInBackground$0(Context context) {
        try {
            try {
                try {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        lastMutedState = checkMuteState(audioManager);
                        Logger.d(TAG, "Update and return lastMutedState");
                    }
                } catch (SecurityException e) {
                    HyBid.reportException((Exception) e);
                    Logger.e(TAG, "Security Error fetching sound state: ", e);
                }
            } catch (Exception e2) {
                HyBid.reportException(e2);
                Logger.e(TAG, "Error fetching sound state: ", e2);
            } catch (OutOfMemoryError e3) {
                Logger.e(TAG, "OutOfMemoryError fetching sound state: ", e3);
            }
        } finally {
            lastCheckedTime = System.currentTimeMillis();
            isRefreshing = false;
        }
    }

    private static void refreshInBackground(final Context context) {
        isRefreshing = true;
        executor.execute(new Runnable() { // from class: net.pubnative.lite.sdk.utils.SoundUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SoundUtils.lambda$refreshInBackground$0(context);
            }
        });
    }

    private static boolean checkMuteState(AudioManager audioManager) {
        return audioManager.isStreamMute(2);
    }
}
