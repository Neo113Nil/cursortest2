package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.h2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class HandlerC4039h2 extends Handler {
    public final InMobiBanner a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HandlerC4039h2(InMobiBanner mInmobiBanner) {
        super(looper);
        Intrinsics.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        Looper looper = Looper.getMainLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        Intrinsics.checkNotNullParameter(mInmobiBanner, "mInmobiBanner");
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.a = mInmobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 1) {
            this.a.refreshBanner$media_release();
        } else {
            Intrinsics.checkNotNullExpressionValue("h2", "TAG");
        }
    }
}
