package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.view.Surface;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;

/* compiled from: MobileFuseSourceFile */
/* loaded from: classes7.dex */
public class MobileFuseVideoBridge {
    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("MobileFuseVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MobileFuseVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.E, mp);
                CreativeInfoManager.a(h.E, (String) null, false, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerPause(MediaPlayer mp) throws IllegalStateException {
        Logger.d("MobileFuseVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MobileFuseVideoBridge;->MediaPlayerPause(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.E, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e.getMessage());
            }
        }
        mp.pause();
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("MobileFuseVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MobileFuseVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.E, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.E, (String) null, true, "media-player");
                }
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.release();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, String path) throws IOException, IllegalArgumentException, IllegalStateException, SecurityException {
        Logger.d("MobileFuseVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MobileFuseVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetDataSource: player ", mp, ", path ", path, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.E, mp, path);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: ", e.getMessage());
            }
        }
        mp.setDataSource(path);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("MobileFuseVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/MobileFuseVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetSurface: player ", mp, ", surface ", surface, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetSurface: ", e.getMessage());
            }
        }
        mp.setSurface(surface);
    }
}
