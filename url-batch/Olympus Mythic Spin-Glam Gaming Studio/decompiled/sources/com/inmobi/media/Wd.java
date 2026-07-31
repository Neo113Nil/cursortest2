package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes13.dex */
public final class Wd implements G8 {
    public final C4191mn a;
    public final AtomicBoolean b;
    public boolean c;
    public Long d;

    public Wd(C4191mn videoMRC50Model) {
        Intrinsics.checkNotNullParameter(videoMRC50Model, "videoMRC50Model");
        this.a = videoMRC50Model;
        this.b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.G8
    public final void a() {
    }

    @Override // com.inmobi.media.G8
    public final Flow b() {
        return FlowKt.channelFlow(new Vd(this, null));
    }
}
