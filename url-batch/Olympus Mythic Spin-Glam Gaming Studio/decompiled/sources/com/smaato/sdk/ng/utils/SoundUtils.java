package com.smaato.sdk.ng.utils;

import android.content.Context;
import android.media.AudioManager;
import com.smaato.sdk.ng.NextGen;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes12.dex */
public class SoundUtils {
    private static final String a = "SoundUtils";
    private static long b = 0;
    private static boolean c = true;
    private static final ExecutorService d = Executors.newSingleThreadExecutor();
    private static volatile boolean e = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context) {
        try {
            try {
                try {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        c = a(audioManager);
                        Logger.d(a, "Update and return lastMutedState");
                    }
                } catch (SecurityException e2) {
                    NextGen.reportException((Exception) e2);
                    Logger.e(a, "Security Error fetching sound state: ", e2);
                }
            } catch (Exception e3) {
                NextGen.reportException(e3);
                Logger.e(a, "Error fetching sound state: ", e3);
            } catch (OutOfMemoryError e4) {
                Logger.e(a, "OutOfMemoryError fetching sound state: ", e4);
            }
        } finally {
            b = System.currentTimeMillis();
            e = false;
        }
    }

    private static void b(final Context context) {
        e = true;
        d.execute(new Runnable() { // from class: com.smaato.sdk.ng.utils.SoundUtils$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SoundUtils.a(context);
            }
        });
    }

    public static boolean isSoundMuted(Context context) {
        if (context == null) {
            return true;
        }
        if (System.currentTimeMillis() - b >= 2000 && !e) {
            b(context.getApplicationContext());
        }
        return c;
    }

    private static boolean a(AudioManager audioManager) {
        return audioManager.isStreamMute(2);
    }
}
