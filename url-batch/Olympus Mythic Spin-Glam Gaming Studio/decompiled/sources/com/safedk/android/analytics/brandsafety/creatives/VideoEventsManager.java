package com.safedk.android.analytics.brandsafety.creatives;

import android.net.Uri;
import android.view.View;
import androidx.media3.common.MediaItem;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.video.VideoSize;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.u;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.p;
import com.safedk.android.utils.Logger;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class VideoEventsManager {
    static final String a = "VideoEventsManager";
    static final Map<String, View> b = new HashMap();
    static final Map<String, String> c = new HashMap();
    static final Map<String, Player.Listener> d = new HashMap();
    static final Map<String, Boolean> e = new HashMap();
    private static final Set<String> f = new HashSet(Arrays.asList("android.view.TextureView", "android.view.SurfaceView", "android.view.Surface", "com.yandex.div.core.player.DivPlayerView", "yads.r52"));

    public static void onPlayerPlay(String sdkPackageName, Object player, String originatedBy) {
        try {
            if (SafeDK.ad()) {
                View view = null;
                Logger.d(a, "onExoPlayerPlay started, sdk : ", sdkPackageName, " , player : ", player, ", originatedBy = ", originatedBy, ", isExoPlayer2Player ? ", Boolean.valueOf(b(player)), ", isExoPlayer2PlayerView ? ", Boolean.valueOf(e(player)));
                if (!b(player) && !e(player) && !c(player)) {
                    if (a(player) || c(player)) {
                        b(sdkPackageName, player, true);
                        return;
                    }
                    return;
                }
                if (e(player)) {
                    Logger.d(a, "onExoPlayerPlay styledPlayerView MediaItems : ", Integer.valueOf(((StyledPlayerView) player).getPlayer().getMediaItemCount()));
                    view = (View) player;
                } else if (b(player)) {
                    if (!b.containsKey(BrandSafetyUtils.a(player))) {
                        Logger.d(a, "onExoPlayerPlay styledPlayerView cannot find view");
                    } else {
                        view = b.get(BrandSafetyUtils.a(player));
                    }
                } else if (d(player) || c(player)) {
                    b(sdkPackageName, player, true);
                }
                Logger.d(a, "onExoPlayerPlay styledPlayerView view is  : ", view);
            }
        } catch (Throwable th) {
            Logger.d(a, "Exception in onExoPlayerPlay : ", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Player player, View view) {
        Uri a2 = a(player);
        Logger.d(a, "attempt to match ad, sdkPackageName : ", str, ", exoplayer 2 player obj : ", player, " uri is ", a2);
        if (a2 != null) {
            AdNetworkDiscovery j = CreativeInfoManager.j(str);
            if (j != null) {
                CreativeInfo a3 = j.a(a2);
                if (a3 != null && view != null && SafeDK.getInstance() != null && SafeDK.getInstance().z() != null) {
                    a3.b(BrandSafetyUtils.a(view), view.getClass().getName());
                    a3.u(CreativeInfo.k);
                    p pVar = new p(a3, CreativeInfo.k, null, a2.toString());
                    SafeDK.getInstance().z().a(pVar);
                    Logger.d(a, Logger.FeatureTag.CI_MATCHING, "attempt to match ad, CI set , matchingInfo : ", pVar);
                    return;
                }
                return;
            }
            Logger.d(a, "attempt to match ad, no discovery class found for ", str);
            return;
        }
        Logger.d(a, "attempt to match ad, Uri is null. skipping");
    }

    public static void a(String str, Object obj, Object obj2, String str2) {
        MediaItem mediaItem;
        try {
            if (SafeDK.ad()) {
                Logger.d(a, "onPlayerSetMediaItem started, sdk : ", str, ",player : ", obj, ", mediaItem : ", obj2, ", originatedBy : ", str2);
                String str3 = null;
                if (obj2.getClass().getCanonicalName().equals("com.google.android.exoplayer2.MediaItem")) {
                    com.google.android.exoplayer2.MediaItem mediaItem2 = (com.google.android.exoplayer2.MediaItem) obj2;
                    if (mediaItem2 != null && mediaItem2.localConfiguration != null && mediaItem2.localConfiguration.uri != null) {
                        str3 = mediaItem2.localConfiguration.uri.toString();
                    }
                } else if (obj2.getClass().getCanonicalName().equals("androidx.media3.common.MediaItem") && (mediaItem = (MediaItem) obj2) != null && mediaItem.localConfiguration != null) {
                    str3 = mediaItem.localConfiguration.uri.toString();
                }
                Logger.d(a, "onPlayerSetMediaItem  mediaItem uri : ", str3);
                synchronized (c) {
                    c.put(BrandSafetyUtils.a(obj), str3);
                }
            }
        } catch (Throwable th) {
            Logger.d(a, "Exception in onPlayerSetMediaItem : ", th.getMessage(), th);
        }
    }

    public static void onPlayerStop(String sdkPackageName, Object player, String originatedBy) {
        try {
            if (SafeDK.ad()) {
                Logger.d(a, "onExoPlayerStop started, sdk : ", sdkPackageName, ",player : ", player);
                b(sdkPackageName, player, false);
            }
        } catch (Throwable th) {
            Logger.e(a, "onPlayerStop exception", th);
        }
    }

    public static void a(String str, Object obj, View view, String str2) {
        if (SafeDK.ad()) {
            Logger.d(a, "onExoPlayerSetPlayer started, sdk : ", str, ",player : ", obj, ", view : ", view, ", viewToPlayerMap : ", b);
            if (obj == null) {
                String a2 = a(view);
                if (SafeDK.getInstance() != null && SafeDK.getInstance().z() != null) {
                    SafeDK.getInstance().z().a(str, BrandSafetyUtils.a(view), true, a);
                }
                Logger.d(a, "ExoPlayer2Listener onIsPlayingChanged videoCompleted triggered , value = true");
                a(a2);
                return;
            }
            synchronized (b) {
                b.put(BrandSafetyUtils.a(obj), view);
            }
            if (b(obj)) {
                Player player = (Player) obj;
                ExoPlayer2Listener exoPlayer2Listener = new ExoPlayer2Listener(str, player);
                player.addListener(exoPlayer2Listener);
                a(player, exoPlayer2Listener);
            }
        }
    }

    private static void a(Player player, Player.Listener listener) {
        if (!d.containsValue(listener)) {
            synchronized (d) {
                d.put(BrandSafetyUtils.a(player), listener);
            }
            Logger.d(a, "storePlayerListener added a listener");
        }
    }

    private static String a(Player.Listener listener) {
        if (d.containsValue(listener)) {
            synchronized (d) {
                for (Map.Entry<String, Player.Listener> entry : d.entrySet()) {
                    if (entry.getValue().equals(listener)) {
                        return entry.getKey();
                    }
                }
                return null;
            }
        }
        return null;
    }

    private static String a(View view) {
        if (b.containsValue(view)) {
            synchronized (b) {
                for (Map.Entry<String, View> entry : b.entrySet()) {
                    if (entry.getValue().equals(view)) {
                        return entry.getKey();
                    }
                }
                return null;
            }
        }
        return null;
    }

    private static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass().getCanonicalName().startsWith("androidx.media3.exoplayer.ExoPlayer");
    }

    private static boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Class.forName("com.google.android.exoplayer2.ExoPlayer", false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    private static boolean c(Object obj) {
        if (obj == null) {
            return false;
        }
        return a.a(obj);
    }

    private static boolean d(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Class.forName("androidx.media3.common.Player", false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    private static boolean e(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Class.forName("com.google.android.exoplayer2.ui.StyledPlayerView", false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    public static Uri a(Player player) {
        Uri uri;
        Logger.d(a, "getCurrentlyPlayingUri started , playerOrView : ", player);
        com.google.android.exoplayer2.MediaItem currentMediaItem = player.getCurrentMediaItem();
        if (currentMediaItem != null) {
            MediaItem.LocalConfiguration localConfiguration = currentMediaItem.localConfiguration;
            if (localConfiguration != null) {
                uri = localConfiguration.uri;
            } else if (currentMediaItem.playbackProperties == null) {
                uri = null;
            } else {
                uri = currentMediaItem.playbackProperties.uri;
            }
            Logger.d(a, "getCurrentlyPlayingUri , uri found : ", uri);
            if (uri != null || uri.toString().length() > 5) {
                return uri;
            }
        }
        return null;
    }

    public static void a(String str) {
        Logger.d(a, "clearRefs started, playerAddress = ", str);
        synchronized (b) {
            b.remove(str);
        }
        synchronized (c) {
            c.remove(str);
        }
        synchronized (d) {
            d.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Object obj, boolean z) {
        boolean z2;
        if (str.equals(com.safedk.android.utils.h.y) && !z) {
            Logger.d(a, "onPlayStatusChanged yandex. Skipping.");
            return;
        }
        String a2 = BrandSafetyUtils.a(obj);
        if (e.containsKey(a2) && z == e.get(a2).booleanValue()) {
            z2 = false;
        } else {
            synchronized (e) {
                e.put(a2, Boolean.valueOf(z));
            }
            Logger.d(a, "onPlayStatusChanged player added to playerPlayState, playerAddress : ", a2);
            z2 = true;
        }
        String a3 = BrandSafetyUtils.a(b.get(a2));
        if (z2 && SafeDK.getInstance() != null) {
            if (SafeDK.getInstance().z() != null) {
                SafeDK.getInstance().z().a(str, a3, !z, a);
            }
            if (SafeDK.getInstance().B() != null) {
                SafeDK.getInstance().B().a(str, a3, !z, a);
            }
            Logger.d(a, "onPlayStatusChanged videoCompleted invoked, isVideoCompleted = ", Boolean.valueOf(!z));
        }
    }

    public static class ExoPlayer2Listener implements Player.Listener {
        private Player player;
        private String sdkPackageName;

        public ExoPlayer2Listener(String sdkPackageName, Player player) {
            this.sdkPackageName = null;
            this.player = null;
            this.sdkPackageName = sdkPackageName;
            this.player = player;
        }

        private ExoPlayer2Listener() {
            this.sdkPackageName = null;
            this.player = null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            Logger.d(VideoEventsManager.a, "ExoPlayer2Listener onEvents started, player :  ", player, ", events : ", eventsToString(events));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAudioSessionIdChanged(int audioSessionId) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAvailableCommandsChanged(Player.Commands availableCommands) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(CueGroup cueGroup) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(List<Cue> cues) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceVolumeChanged(int volume, boolean muted) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsLoadingChanged(boolean isLoading) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onLoadingChanged(boolean isLoading) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long maxSeekToPreviousPositionMs) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            Logger.d(VideoEventsManager.a, "ExoPlayer2Listener onRenderedFirstFrame started");
            VideoEventsManager.b(this.sdkPackageName, this.player, VideoEventsManager.b.get(BrandSafetyUtils.a(this.player)));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRepeatModeChanged(int repeatMode) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekBackIncrementChanged(long seekBackIncrementMs) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekForwardIncrementChanged(long seekForwardIncrementMs) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSurfaceSizeChanged(int width, int height) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTimelineChanged(Timeline timeline, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTrackSelectionParametersChanged(TrackSelectionParameters parameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            Logger.d(VideoEventsManager.a, "onVideoSizeChanged started, videoSize : ", Integer.valueOf(videoSize.height), " , ", Integer.valueOf(videoSize.width));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVolumeChanged(float volume) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean isPlaying) {
            Logger.d(VideoEventsManager.a, "ExoPlayer2Listener onIsPlayingChanged started, isPlaying :  ", Boolean.valueOf(isPlaying));
            VideoEventsManager.b(this.sdkPackageName, this.player, isPlaying);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMediaItemTransition(com.google.android.exoplayer2.MediaItem mediaItem, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMetadata(Metadata metadata) {
            Logger.d(VideoEventsManager.a, "ExoPlayer2Listener onMetadata started, metadata :  ", metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int playbackState) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(PlaybackException error) {
            Logger.d(VideoEventsManager.a, "ExoPlayer2Listener onPlayerError started, error :  ", Integer.valueOf(error.errorCode), " , ", error.getErrorCodeName(), " , ", error.getMessage(), error.getCause());
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerErrorChanged(PlaybackException error) {
            Logger.d(VideoEventsManager.a, "ExoPlayer2Listener onPlayerErrorChanged started, error :  ", Integer.valueOf(error.errorCode), " , ", error.getErrorCodeName(), " , ", error.getMessage(), error.getCause());
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTracksChanged(Tracks tracks) {
            Logger.d(VideoEventsManager.a, "ExoPlayer2Listener onTracksChanged started, tracks :  ", tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekProcessed() {
        }

        public static String eventsToString(Player.Events events) {
            if (events == null) {
                return POBCommonConstants.NULL_VALUE;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < events.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(eventToName(events.get(i)));
            }
            return sb.toString();
        }

        private static String eventToName(int e) {
            switch (e) {
                case 0:
                    return "TIMELINE_CHANGED";
                case 1:
                    return "MEDIA_ITEM_TRANSITION";
                case 2:
                    return "TRACKS_CHANGED";
                case 3:
                    return "IS_LOADING_CHANGED";
                case 4:
                    return "PLAYBACK_STATE_CHANGED";
                case 5:
                    return "PLAY_WHEN_READY_CHANGED";
                case 6:
                    return "PLAYBACK_SUPPRESSION_REASON_CHANGED";
                case 7:
                    return "IS_PLAYING_CHANGED";
                case 8:
                    return "REPEAT_MODE_CHANGED";
                case 9:
                    return "SHUFFLE_MODE_ENABLED_CHANGED";
                case 10:
                    return "PLAYER_ERROR";
                case 11:
                    return "POSITION_DISCONTINUITY";
                case 12:
                    return "PLAYBACK_PARAMETERS_CHANGED";
                case 13:
                    return "AVAILABLE_COMMANDS_CHANGED";
                case 14:
                    return "MEDIA_METADATA_CHANGED";
                case 15:
                    return "PLAYLIST_METADATA_CHANGED";
                case 16:
                    return "SEEK_BACK_INCREMENT_CHANGED";
                case 17:
                    return "SEEK_FORWARD_INCREMENT_CHANGED";
                case 18:
                case 19:
                case 21:
                case 22:
                case 23:
                default:
                    return "UNKNOWN(" + e + ")";
                case 20:
                    return "AUDIO_ATTRIBUTES_CHANGED";
                case 24:
                    return "SURFACE_SIZE_CHANGED";
                case 25:
                    return "VIDEO_SIZE_CHANGED";
                case 26:
                    return "RENDERED_FIRST_FRAME";
                case 27:
                    return "CUES";
                case 28:
                    return "METADATA";
                case 29:
                    return "DEVICE_INFO_CHANGED";
                case 30:
                    return "DEVICE_VOLUME_CHANGED";
            }
        }
    }

    public static final class a {
        private static final Set<String> a = new HashSet(Arrays.asList("android.view.TextureView", "android.view.SurfaceView", "android.view.Surface", "android.view.SurfaceHolder", "android.graphics.SurfaceTexture", "android.widget.VideoView", "android.media.MediaPlayer", "android.media.MediaCodec", "com.google.android.exoplayer2.Player", "com.google.android.exoplayer2.SimpleExoPlayer", "com.yandex.div.core.player.DivPlayerView"));
        private static final int b = 4;
        private static final int c = 512;

        public static boolean a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return a(obj, 0, new IdentityHashMap(), new AtomicInteger(512));
            } catch (Throwable th) {
                return false;
            }
        }

        private static boolean a(Object obj, int i, IdentityHashMap<Object, Boolean> identityHashMap, AtomicInteger atomicInteger) {
            if (obj == null || i > 4 || atomicInteger.decrementAndGet() < 0 || identityHashMap.containsKey(obj)) {
                return false;
            }
            identityHashMap.put(obj, Boolean.TRUE);
            Class<?> cls = obj.getClass();
            if (a.contains(cls.getName())) {
                return true;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    if (a(it.next(), i + 1, identityHashMap, atomicInteger)) {
                        return true;
                    }
                }
                return false;
            }
            if (!cls.isArray()) {
                while (cls != null && cls != Object.class) {
                    try {
                        for (Field field : cls.getDeclaredFields()) {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                try {
                                    field.setAccessible(true);
                                    Object obj2 = field.get(obj);
                                    if (obj2 != null) {
                                        String name = obj2.getClass().getName();
                                        if (a.contains(name)) {
                                            return true;
                                        }
                                        if (a(name) && a(obj2, i + 1, identityHashMap, atomicInteger)) {
                                            return true;
                                        }
                                    }
                                } catch (Throwable th) {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                    }
                    cls = cls.getSuperclass();
                }
                return false;
            }
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                if (a(Array.get(obj, i2), i + 1, identityHashMap, atomicInteger)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean a(String str) {
            return str.startsWith(u.d) || str.startsWith("com.yandex.") || str.startsWith("android.view.") || str.startsWith("android.widget.");
        }
    }
}
