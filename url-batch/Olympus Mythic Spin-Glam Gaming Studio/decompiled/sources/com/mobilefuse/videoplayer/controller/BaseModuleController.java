package com.mobilefuse.videoplayer.controller;

import android.content.Context;
import android.webkit.WebView;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseModuleController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0004J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/mobilefuse/videoplayer/controller/BaseModuleController;", "", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "endCardPresenter", "Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "getEndCardPresenter", "()Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "playerState", "Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "getPlayerState", "()Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "<set-?>", "Lcom/mobilefuse/videoplayer/VideoPlayer;", "videoPlayer", "getVideoPlayer", "()Lcom/mobilefuse/videoplayer/VideoPlayer;", "setVideoPlayer", "(Lcom/mobilefuse/videoplayer/VideoPlayer;)V", "videoPlayer$delegate", "Lkotlin/properties/ReadWriteProperty;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "callJsBridgeCmd", "", POBConstants.KEY_JS, "", "initialize", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public class BaseModuleController {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseModuleController.class, "videoPlayer", "getVideoPlayer()Lcom/mobilefuse/videoplayer/VideoPlayer;", 0))};

    /* renamed from: videoPlayer$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty videoPlayer = Delegates.INSTANCE.notNull();

    @NotNull
    protected final VideoPlayer getVideoPlayer() {
        return (VideoPlayer) this.videoPlayer.getValue(this, $$delegatedProperties[0]);
    }

    protected final void setVideoPlayer(@NotNull VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "<set-?>");
        this.videoPlayer.setValue(this, $$delegatedProperties[0], videoPlayer);
    }

    @Nullable
    protected final WebView getWebView() {
        return getVideoPlayer().getWebView();
    }

    @Nullable
    protected final EndCardPresenter getEndCardPresenter() {
        return getVideoPlayer().getEndCardPresenter();
    }

    @NotNull
    protected final VideoPlayer.PlayerState getPlayerState() {
        return getVideoPlayer().getPlayerState();
    }

    @NotNull
    protected final Context getContext() {
        Context context = getVideoPlayer().getContext();
        Intrinsics.checkNotNull(context);
        return context;
    }

    protected final void callJsBridgeCmd(@NotNull String js) {
        Intrinsics.checkNotNullParameter(js, "js");
        getVideoPlayer().callJsBridgeCmd$mobilefuse_video_player_release(js);
    }

    public final void initialize(@NotNull VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        setVideoPlayer(videoPlayer);
    }
}
