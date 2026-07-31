package com.inmobi.media;

import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import com.google.common.collect.ImmutableList;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes11.dex */
public final class N7 implements Player.Listener {
    public final /* synthetic */ V7 a;

    public N7(V7 v7) {
        this.a = v7;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z) {
        super.onIsLoadingChanged(z);
        if (z) {
            this.a.o.setVisibility(0);
        } else {
            this.a.o.setVisibility(8);
        }
        if (this.a.p.getPlaybackState() == 3 && this.a.p.getBufferedPercentage() == 100) {
            this.a.a(C3963e8.a);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        super.onPlaybackStateChanged(i);
        if (i == 4) {
            InterfaceC4466x9 interfaceC4466x9 = this.a.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("HtmlMediaPlayer", "Playback ended");
            }
            C6 c6 = this.a.x;
            if (c6.g != 2) {
                c6.g = 2;
                BuildersKt__Builders_commonKt.launch$default(c6.b, Dispatchers.getMain().getImmediate(), null, new C4490y6(c6, c6.a.getDuration(), null), 2, null);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4466x9 interfaceC4466x9 = this.a.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("HtmlMediaPlayer", "Playback error: " + error.getErrorCodeName(), error);
        }
        this.a.l.set(Jg.g);
        V7 v7 = this.a;
        int i = error.errorCode;
        String errorCodeName = error.getErrorCodeName();
        Intrinsics.checkNotNullExpressionValue(errorCodeName, "getErrorCodeName(...)");
        v7.a(new C4281q8(errorCodeName));
        this.a.f();
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        Tracks.Group group;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
        Iterator<Tracks.Group> it = groups.iterator();
        while (true) {
            if (it.hasNext()) {
                group = it.next();
                if (group.getType() == 2) {
                    break;
                }
            } else {
                group = null;
                break;
            }
        }
        Tracks.Group group2 = group;
        if (group2 != null) {
            V7 v7 = this.a;
            int i = group2.getMediaTrackGroup().length;
            for (int i2 = 0; i2 < i; i2++) {
                Format format = group2.getMediaTrackGroup().getFormat(i2);
                Intrinsics.checkNotNullExpressionValue(format, "getFormat(...)");
                InterfaceC4466x9 interfaceC4466x9 = v7.b;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).b("HtmlMediaPlayer", "Metadata loaded: " + format.width + VastAttributes.HORIZONTAL_POSITION + format.height + ", " + format.sampleMimeType);
                }
                v7.a(C4255p8.a);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        InterfaceC4466x9 interfaceC4466x9 = this.a.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("HtmlMediaPlayer", "onVideoSizeChanged: width=" + videoSize.width + ", height=" + videoSize.height + ", ratio=" + videoSize.pixelWidthHeightRatio);
        }
        this.a.i = (int) (videoSize.width * videoSize.pixelWidthHeightRatio);
        this.a.j = videoSize.height;
        V7 v7 = this.a;
        K1 k1 = v7.n;
        int i = v7.i;
        int i2 = this.a.j;
        k1.getClass();
        if (i > 0 && i2 > 0) {
            k1.a = i / i2;
            k1.requestLayout();
        }
        this.a.z.d.a(videoSize.width, videoSize.height);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f) {
        super.onVolumeChanged(f);
        if (f == 0.0f || f == 1.0f) {
            return;
        }
        V7 v7 = this.a;
        boolean z = v7.y.e;
        v7.a(new C4429vo());
    }
}
