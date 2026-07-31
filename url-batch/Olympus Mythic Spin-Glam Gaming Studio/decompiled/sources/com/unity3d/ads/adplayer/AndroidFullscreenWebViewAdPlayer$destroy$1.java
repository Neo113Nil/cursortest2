package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {199, 204, 208, 210}, m = "destroy")
/* loaded from: classes9.dex */
final class AndroidFullscreenWebViewAdPlayer$destroy$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$destroy$1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Continuation continuation) {
        super(continuation);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.destroy(this);
    }
}
