package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.MoreExecutors;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.mediacodec.LoudnessCodecController;
import java.util.HashSet;
import java.util.Iterator;

@RequiresApi
@UnstableApi
/* loaded from: classes9.dex */
public final class LoudnessCodecController {

    @Nullable
    private android.media.LoudnessCodecController loudnessCodecController;
    private final HashSet<MediaCodec> mediaCodecs;
    private final LoudnessParameterUpdateListener updateListener;

    public interface LoudnessParameterUpdateListener {
        public static final LoudnessParameterUpdateListener DEFAULT = new LoudnessParameterUpdateListener() { // from class: io.bidmachine.media3.exoplayer.mediacodec.LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0
            @Override // io.bidmachine.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
            public final Bundle onLoudnessParameterUpdate(Bundle bundle) {
                Bundle lambda$static$0;
                lambda$static$0 = LoudnessCodecController.LoudnessParameterUpdateListener.lambda$static$0(bundle);
                return lambda$static$0;
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Bundle lambda$static$0(Bundle bundle) {
            return bundle;
        }

        Bundle onLoudnessParameterUpdate(Bundle bundle);
    }

    public LoudnessCodecController() {
        this(LoudnessParameterUpdateListener.DEFAULT);
    }

    public LoudnessCodecController(LoudnessParameterUpdateListener loudnessParameterUpdateListener) {
        this.mediaCodecs = new HashSet<>();
        this.updateListener = loudnessParameterUpdateListener;
    }

    public void setAudioSessionId(int i) {
        android.media.LoudnessCodecController create;
        boolean addMediaCodec;
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.loudnessCodecController = null;
        }
        create = android.media.LoudnessCodecController.create(i, MoreExecutors.directExecutor(), new LoudnessCodecController$OnLoudnessCodecUpdateListener() { // from class: io.bidmachine.media3.exoplayer.mediacodec.LoudnessCodecController.1
            public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
                return LoudnessCodecController.this.updateListener.onLoudnessParameterUpdate(bundle);
            }
        });
        this.loudnessCodecController = create;
        Iterator<MediaCodec> it = this.mediaCodecs.iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec(it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public void addMediaCodec(MediaCodec mediaCodec) {
        boolean addMediaCodec;
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        Assertions.checkState(this.mediaCodecs.add(mediaCodec));
    }

    public void removeMediaCodec(MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.mediaCodecs.remove(mediaCodec) || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void release() {
        this.mediaCodecs.clear();
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
