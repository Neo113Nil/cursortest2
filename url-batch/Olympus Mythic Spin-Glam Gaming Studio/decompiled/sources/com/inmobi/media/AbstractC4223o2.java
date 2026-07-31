package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.o2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4223o2 {
    public final Context a;

    public AbstractC4223o2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public abstract Object a(FrameLayout frameLayout, C4470xc c4470xc);

    public abstract Object a(ContinuationImpl continuationImpl);

    public abstract void a();

    public abstract void a(MutableStateFlow mutableStateFlow);

    public abstract void b();
}
