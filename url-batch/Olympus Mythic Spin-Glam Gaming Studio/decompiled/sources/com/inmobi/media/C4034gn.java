package com.inmobi.media;

import android.media.MediaPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.gn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4034gn implements Function1 {
    public final /* synthetic */ MediaPlayer a;

    public C4034gn(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InMobiVideoBridge.MediaPlayerRelease(this.a);
        return Unit.INSTANCE;
    }
}
