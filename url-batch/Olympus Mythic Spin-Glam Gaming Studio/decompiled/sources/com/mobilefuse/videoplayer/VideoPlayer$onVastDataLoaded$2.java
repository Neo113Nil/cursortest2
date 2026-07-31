package com.mobilefuse.videoplayer;

import com.mobilefuse.videoplayer.model.VastMediaFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoPlayer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
final /* synthetic */ class VideoPlayer$onVastDataLoaded$2 extends FunctionReferenceImpl implements Function1 {
    VideoPlayer$onVastDataLoaded$2(VideoPlayer videoPlayer) {
        super(1, videoPlayer, VideoPlayer.class, "onMediaFileSelected", "onMediaFileSelected(Lcom/mobilefuse/videoplayer/model/VastMediaFile;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((VastMediaFile) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable VastMediaFile vastMediaFile) {
        ((VideoPlayer) this.receiver).onMediaFileSelected(vastMediaFile);
    }
}
