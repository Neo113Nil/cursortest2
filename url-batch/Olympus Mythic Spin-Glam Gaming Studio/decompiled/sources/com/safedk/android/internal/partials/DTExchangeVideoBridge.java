package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;

/* compiled from: DTExchangeSourceFile */
/* loaded from: classes7.dex */
public class DTExchangeVideoBridge {
    public static void VideoViewPlay(VideoView vv) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.p, (Object) vv);
                CreativeInfoManager.a(h.p, BrandSafetyUtils.a(vv), false, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: ", e.getMessage());
            }
        }
        vv.start();
    }

    public static void VideoViewPause(VideoView vv) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->VideoViewPause(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPause: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.p, BrandSafetyUtils.a(vv), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPause : ", e.getMessage());
            }
        }
        vv.suspend();
    }

    public static void VideoViewSetVideoPath(VideoView vv, String url) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->VideoViewSetVideoPath(Landroid/widget/VideoView;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoPath: player ", vv, ", path: ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.p, vv, url);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: ", e.getMessage());
            }
        }
        vv.setVideoPath(url);
    }

    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.p, mp);
                CreativeInfoManager.a(h.p, (String) null, false, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerStop(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerStop(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.p, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: ", e.getMessage());
            }
        }
        mp.stop();
    }

    public static void MediaPlayerPause(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerPause(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.p, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e.getMessage());
            }
        }
        mp.pause();
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.p, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.p, (String) null, true, "media-player");
                }
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.release();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, String path) throws IOException, IllegalArgumentException, IllegalStateException, SecurityException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetDataSource: player ", mp, ", path ", path, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.p, mp, path);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: ", e.getMessage());
            }
        }
        mp.setDataSource(path);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
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
