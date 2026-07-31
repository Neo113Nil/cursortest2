package com.inmobi.media;

import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes11.dex */
public final class An {
    public final CoroutineScope a;
    public final RelativeLayout b;
    public final Wg c;
    public final MutableSharedFlow d;
    public ProgressBar e;
    public Job f;

    public An(CoroutineScope coroutineScope, RelativeLayout experienceLayout, Wg progressConfig, MutableSharedFlow mediaPlayerFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experienceLayout, "experienceLayout");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.a = coroutineScope;
        this.b = experienceLayout;
        this.c = progressConfig;
        this.d = mediaPlayerFlow;
    }
}
