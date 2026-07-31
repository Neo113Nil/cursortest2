package io.intercom.android.sdk.m5.conversation.utils;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.SoundPool;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SoundPlayer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u001c\u0010\u0015\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0007H\u0002J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0011J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;", "", "<init>", "()V", "soundPool", "Landroid/media/SoundPool;", "messageReceivedId", "", "replyFailedId", "replySentId", "operatorReceivedId", "messageReceivedLoaded", "", "replyFailedLoaded", "replySentLoaded", "operatorReceivedLoaded", "loadSounds", "", "context", "Landroid/content/Context;", "release", "loadSound", "soundId", "playMessageFailedSound", "playMessageSentSound", "playAdminMessageReceivedSound", "playOperatorMessageReceivedSound", "playIfLoaded", "loaded", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SoundPlayer {
    public static final int NOT_FOUND_ID = -1;
    private int messageReceivedId;
    private boolean messageReceivedLoaded;
    private int operatorReceivedId;
    private boolean operatorReceivedLoaded;
    private int replyFailedId;
    private boolean replyFailedLoaded;
    private int replySentId;
    private boolean replySentLoaded;
    private final SoundPool soundPool;
    public static final int $stable = 8;
    private static final Twig TWIG = LumberMill.getLogger();

    public SoundPlayer() {
        SoundPool build = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(5).build()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.soundPool = build;
        this.messageReceivedId = -1;
        this.replyFailedId = -1;
        this.replySentId = -1;
        this.operatorReceivedId = -1;
    }

    public final void loadSounds(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: io.intercom.android.sdk.m5.conversation.utils.SoundPlayer$$ExternalSyntheticLambda0
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                SoundPlayer.loadSounds$lambda$0(SoundPlayer.this, soundPool, i, i2);
            }
        });
        this.messageReceivedId = loadSound(context, R.raw.intercom_received);
        this.replyFailedId = loadSound(context, R.raw.intercom_failed);
        this.replySentId = loadSound(context, R.raw.intercom_sent);
        this.operatorReceivedId = loadSound(context, R.raw.intercom_operator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadSounds$lambda$0(SoundPlayer this$0, SoundPool soundPool, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 == 0) {
            if (i == this$0.messageReceivedId) {
                this$0.messageReceivedLoaded = true;
                return;
            }
            if (i == this$0.replyFailedId) {
                this$0.replyFailedLoaded = true;
            } else if (i == this$0.replySentId) {
                this$0.replySentLoaded = true;
            } else if (i == this$0.operatorReceivedId) {
                this$0.operatorReceivedLoaded = true;
            }
        }
    }

    public final void release() {
        this.soundPool.release();
    }

    private final int loadSound(Context context, int soundId) {
        try {
            return this.soundPool.load(context, soundId, 1);
        } catch (Resources.NotFoundException e) {
            TWIG.e(e, "Could not play sound", new Object[0]);
            return -1;
        }
    }

    public final void playMessageFailedSound() {
        playIfLoaded(this.replyFailedLoaded, this.replyFailedId);
    }

    public final void playMessageSentSound() {
        playIfLoaded(this.replySentLoaded, this.replySentId);
    }

    public final void playAdminMessageReceivedSound() {
        playIfLoaded(this.messageReceivedLoaded, this.messageReceivedId);
    }

    public final void playOperatorMessageReceivedSound() {
        playIfLoaded(this.operatorReceivedLoaded, this.operatorReceivedId);
    }

    private final void playIfLoaded(boolean loaded, int soundId) {
        if (!loaded || soundId == -1) {
            return;
        }
        this.soundPool.play(soundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }
}
