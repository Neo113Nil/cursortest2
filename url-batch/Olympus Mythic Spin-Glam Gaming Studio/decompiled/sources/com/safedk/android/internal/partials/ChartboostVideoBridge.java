package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: ChartboostSourceFile */
/* loaded from: classes7.dex */
public class ChartboostVideoBridge {
    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("ChartboostVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/ChartboostVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.c, mp);
                CreativeInfoManager.a(h.c, (String) null, false, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerStop(MediaPlayer mp) throws IllegalStateException {
        Logger.d("ChartboostVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/ChartboostVideoBridge;->MediaPlayerStop(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.c, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: ", e.getMessage());
            }
        }
        mp.stop();
    }

    public static void MediaPlayerPause(MediaPlayer mp) throws IllegalStateException {
        Logger.d("ChartboostVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/ChartboostVideoBridge;->MediaPlayerPause(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.c, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e.getMessage());
            }
        }
        mp.pause();
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("ChartboostVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/ChartboostVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.c, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.c, (String) null, true, "media-player");
                }
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.release();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, FileDescriptor fd) throws IOException, IllegalArgumentException, IllegalStateException {
        Logger.d("ChartboostVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/ChartboostVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Ljava/io/FileDescriptor;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetDataSource: player ", mp, ", fd ", fd, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.c, mp, fd);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: ", e.getMessage());
            }
        }
        mp.setDataSource(fd);
    }

    public static void exoPlayer3SetMediaItem(Player targetInstance, MediaItem mediaItem) {
        Logger.d("ChartboostVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/ChartboostVideoBridge;->exoPlayer3SetMediaItem(Landroidx/media3/common/Player;Landroidx/media3/common/MediaItem;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3SetMediaItem triggered, targetInstance :  ", targetInstance, ",mediaItem = ", mediaItem);
                VideoEventsManager.a(h.c, targetInstance, mediaItem, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3SetMediaItem", th);
            }
        }
        targetInstance.setMediaItem(mediaItem);
    }

    public static void exoPlayer3Release(Player targetInstance) {
        Logger.d("ChartboostVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/ChartboostVideoBridge;->exoPlayer3Release(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Release triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerStop(h.c, targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Release", th);
            }
        }
        targetInstance.release();
    }

    public static void exoPlayer3Stop(Player targetInstance) {
        Logger.d("ChartboostVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/ChartboostVideoBridge;->exoPlayer3Stop(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Stop triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerStop(h.c, targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Stop", th);
            }
        }
        targetInstance.stop();
    }
}
