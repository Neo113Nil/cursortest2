package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.net.Uri;
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

/* compiled from: PubMaticSourceFile */
/* loaded from: classes7.dex */
public class PubMaticVideoBridge {
    public static void VideoViewPlay(VideoView vv) {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.F, (Object) vv);
                CreativeInfoManager.a(h.F, BrandSafetyUtils.a(vv), false, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: ", e.getMessage());
            }
        }
        vv.start();
    }

    public static void VideoViewPause(VideoView vv) {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->VideoViewPause(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPause: player ", vv, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.F, BrandSafetyUtils.a(vv), true, "video-view");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewPause : ", e.getMessage());
            }
        }
        vv.suspend();
    }

    public static void VideoViewSetVideoUri(VideoView vv, Uri uri) {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->VideoViewSetVideoUri(Landroid/widget/VideoView;Landroid/net/Uri;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoUri: player ", vv, ", uri: ", uri, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.F, vv, uri);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: ", e.getMessage());
            }
        }
        vv.setVideoURI(uri);
    }

    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.F, mp);
                CreativeInfoManager.a(h.F, (String) null, false, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerStop(MediaPlayer mp) throws IllegalStateException {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->MediaPlayerStop(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.F, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: ", e.getMessage());
            }
        }
        mp.stop();
    }

    public static void MediaPlayerPause(MediaPlayer mp) throws IllegalStateException {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->MediaPlayerPause(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.F, (String) null, true, "media-player");
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e.getMessage());
            }
        }
        mp.pause();
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.F, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.F, (String) null, true, "media-player");
                }
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e.getMessage());
            }
        }
        mp.release();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, String path) throws IOException, IllegalArgumentException, IllegalStateException, SecurityException {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetDataSource: player ", mp, ", path ", path, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.F, mp, path);
            } catch (Exception e) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: ", e.getMessage());
            }
        }
        mp.setDataSource(path);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("PubMaticVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PubMaticVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
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
