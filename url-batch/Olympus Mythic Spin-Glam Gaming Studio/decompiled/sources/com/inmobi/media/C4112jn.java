package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4112jn implements Function1 {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ C4138kn b;

    public C4112jn(ExoPlayer exoPlayer, C4138kn c4138kn) {
        this.a = exoPlayer;
        this.b = c4138kn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.removeListener(this.b);
        InMobiVideoBridge.exoPlayer3Stop(this.a);
        this.a.clearMediaItems();
        return Unit.INSTANCE;
    }
}
