package com.safedk.android.internal.partials;

import android.view.TextureView;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* compiled from: LINESourceFile */
/* loaded from: classes7.dex */
public class LINEVideoBridge {
    public static void exoPlayer3SetMediaItem(Player targetInstance, MediaItem mediaItem) {
        Logger.d("LINEVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LINEVideoBridge;->exoPlayer3SetMediaItem(Landroidx/media3/common/Player;Landroidx/media3/common/MediaItem;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3SetMediaItem triggered, targetInstance :  ", targetInstance, ",mediaItem = ", mediaItem);
                VideoEventsManager.a("com.five_corp.ad", targetInstance, mediaItem, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3SetMediaItem", th);
            }
        }
        targetInstance.setMediaItem(mediaItem);
    }

    public static void exoPlayer3Play(Player targetInstance) {
        Logger.d("LINEVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LINEVideoBridge;->exoPlayer3Play(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Play triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerPlay("com.five_corp.ad", targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Play", th);
            }
        }
        targetInstance.play();
    }

    public static void exoPlayer3Release(Player targetInstance) {
        Logger.d("LINEVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LINEVideoBridge;->exoPlayer3Release(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Release triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerStop("com.five_corp.ad", targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Release", th);
            }
        }
        targetInstance.release();
    }

    public static void exoPlayer3Pause(Player targetInstance) {
        Logger.d("LINEVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LINEVideoBridge;->exoPlayer3Pause(Landroidx/media3/common/Player;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3Pause triggered, targetInstance :  ", targetInstance);
                VideoEventsManager.onPlayerStop("com.five_corp.ad", targetInstance, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3Pause", th);
            }
        }
        targetInstance.pause();
    }

    public static void exoPlayer3SetVideoTextureView(Player targetInstance, TextureView view) {
        Logger.d("LINEVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LINEVideoBridge;->exoPlayer3SetVideoTextureView(Landroidx/media3/common/Player;Landroid/view/TextureView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "exoPlayer3SetVideoTextureView triggered, targetInstance :  ", targetInstance, ", view = ", view);
                VideoEventsManager.a("com.five_corp.ad", (Object) targetInstance, (View) view, "VideoBridge");
            } catch (Throwable th) {
                Logger.e("VideoBridge", "Exception in exoPlayer3SetVideoTextureView", th);
            }
        }
        targetInstance.setVideoTextureView(view);
    }
}
