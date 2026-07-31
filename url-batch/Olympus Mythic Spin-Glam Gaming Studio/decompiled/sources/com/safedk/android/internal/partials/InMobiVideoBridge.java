package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.VideoView;
import androidx.media3.common.Player;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;

/* compiled from: InMobiSourceFile */
/* loaded from: classes7.dex */
public class InMobiVideoBridge {
    public static void VideoViewPlay(VideoView vv) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.i, (Object) vv);
                CreativeInfoManager.a(h.i, BrandSafetyUtils.a(vv), false, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: ", e.getMessage());
            }
        }
        vv.start();
    }

    public static void VideoViewStop(VideoView vv) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->VideoViewStop(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewStop: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.i, BrandSafetyUtils.a(vv), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewStop : ", e.getMessage());
            }
        }
        vv.stopPlayback();
    }

    public static void VideoViewPause(VideoView vv) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->VideoViewPause(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPause: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.i, BrandSafetyUtils.a(vv), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPause : ", e.getMessage());
            }
        }
        vv.suspend();
    }

    public static void VideoViewSetVideoPath(VideoView vv, String url) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->VideoViewSetVideoPath(Landroid/widget/VideoView;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoPath: player ", vv, ", path: ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.i, vv, url);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: ", e.getMessage());
            }
        }
        vv.setVideoPath(url);
    }

    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.i, mp);
                CreativeInfoManager.a(h.i, (String) null, false, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerPause(MediaPlayer mp) throws IllegalStateException {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->MediaPlayerPause(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.i, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e.getMessage());
            }
        }
        mp.pause();
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.i, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.i, (String) null, true, "media-player");
                }
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.release();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, String path) throws IOException, IllegalArgumentException, IllegalStateException, SecurityException {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetDataSource: player ", mp, ", path ", path, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.i, mp, path);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: ", e.getMessage());
            }
        }
        mp.setDataSource(path);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetSurface: player ", mp, ", surface ", surface, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetSurface: ", e.getMessage());
            }
        }
        mp.setSurface(surface);
    }

    public static void exoPlayer3Play(Player targetInstance) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->exoPlayer3Play(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Play triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerPlay(h.i, targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Play", th);
            }
        }
        targetInstance.play();
    }

    public static void exoPlayer3Release(Player targetInstance) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->exoPlayer3Release(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Release triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerStop(h.i, targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Release", th);
            }
        }
        targetInstance.release();
    }

    public static void exoPlayer3Pause(Player targetInstance) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->exoPlayer3Pause(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Pause triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerStop(h.i, targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Pause", th);
            }
        }
        targetInstance.pause();
    }

    public static void exoPlayer3Stop(Player targetInstance) {
        Logger.d("InMobiVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/InMobiVideoBridge;->exoPlayer3Stop(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Stop triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerStop(h.i, targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Stop", th);
            }
        }
        targetInstance.stop();
    }
}
