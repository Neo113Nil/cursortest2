package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4493y9 implements InterfaceC4466x9 {
    public Xh a;
    public final C4161lk b;

    public C4493y9(Context context, double d, Nb logLevel, boolean z, int i, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.b = new C4161lk();
        if (z) {
            return;
        }
        Xh xh = new Xh(context, d, logLevel, j, i);
        this.a = xh;
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        Intrinsics.checkNotNull(xh);
        Yb.b(xh);
    }

    public final void a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.b, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void b(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.c, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void c(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.a, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void d(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.d, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter("STATE_CHANGE: " + message, "message");
        }
    }

    public final void a(String tag, String message, Exception error) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        Xh xh = this.a;
        if (xh != null) {
            xh.a(Nb.c, tag, message + "\nError: " + ExceptionsKt.stackTraceToString(error));
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    public final void a(boolean z) {
        Xh xh = this.a;
        if (xh != null) {
            xh.b(z);
        }
        if (z) {
            return;
        }
        Xh xh2 = this.a;
        if (xh2 == null || !xh2.f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
            Yb.a(this.a);
            this.a = null;
        }
    }

    public final void a() {
        Xh xh = this.a;
        if (xh != null) {
            xh.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        Yb.a(this.a);
    }
}
