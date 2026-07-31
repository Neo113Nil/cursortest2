package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class G1 extends Handler {
    public boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i == 1001 && this.a) {
            this.a = false;
            I1.a(false);
            Intrinsics.checkNotNullExpressionValue("I1", "access$getTAG$p(...)");
        } else {
            if (i != 1002 || this.a) {
                return;
            }
            this.a = true;
            I1.a(true);
            Intrinsics.checkNotNullExpressionValue("I1", "access$getTAG$p(...)");
        }
    }
}
