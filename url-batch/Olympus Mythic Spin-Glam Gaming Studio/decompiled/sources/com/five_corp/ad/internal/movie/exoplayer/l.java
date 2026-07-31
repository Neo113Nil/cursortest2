package com.five_corp.ad.internal.movie.exoplayer;

import android.content.Context;
import android.view.TextureView;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import com.five_corp.ad.internal.view.E;
import com.safedk.android.internal.partials.LINEVideoBridge;

/* loaded from: classes9.dex */
public final class l {
    public final Context a;
    public final DefaultMediaSourceFactory b;
    public final TextureView c;
    public final E d;
    public final MediaItem e;
    public final com.five_corp.ad.internal.ad.d f;
    public a g = null;

    public l(Context context, TextureView textureView, E e, MediaItem mediaItem, com.five_corp.ad.internal.ad.d dVar) {
        this.a = context;
        this.b = new DefaultMediaSourceFactory(context);
        this.c = textureView;
        this.d = e;
        this.e = mediaItem;
        this.f = dVar;
    }

    public final n a() {
        if (this.g == null) {
            throw new IllegalStateException("PlayerResourceBuilderImpl.registerCallback must be called.");
        }
        ExoPlayer.Builder builder = new ExoPlayer.Builder(this.a);
        builder.setMediaSourceFactory(this.b);
        ExoPlayer build = builder.build();
        LINEVideoBridge.exoPlayer3SetMediaItem(build, this.e);
        build.setPlayWhenReady(false);
        LINEVideoBridge.exoPlayer3SetVideoTextureView(build, this.c);
        com.five_corp.ad.internal.ad.d dVar = this.f;
        return new n(build, this.d, dVar != null ? dVar.a : null, this.g);
    }
}
