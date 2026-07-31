package com.my.target;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.hls.DefaultHlsDataSourceFactory;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class oc {
    public static MediaSource a(Uri uri, Context context) {
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context, new DefaultHttpDataSource.Factory().setUserAgent(Util.getUserAgent(context, "myTarget")));
        return Util.inferContentType(uri) == 2 ? new HlsMediaSource.Factory(new DefaultHlsDataSourceFactory(factory)).createMediaSource(MediaItem.fromUri(uri)) : new ProgressiveMediaSource.Factory(factory).createMediaSource(MediaItem.fromUri(uri));
    }
}
