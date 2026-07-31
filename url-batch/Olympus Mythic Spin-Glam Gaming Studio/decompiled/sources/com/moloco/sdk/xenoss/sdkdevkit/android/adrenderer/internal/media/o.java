package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o {
    @NotNull
    public static final i.a.AbstractC1586a a(@NotNull Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return e instanceof UnknownHostException ? i.a.AbstractC1586a.q.c : e instanceof SocketException ? i.a.AbstractC1586a.C1588i.c : e instanceof SSLHandshakeException ? i.a.AbstractC1586a.j.c : e instanceof IOException ? i.a.AbstractC1586a.f.c : e instanceof SecurityException ? i.a.AbstractC1586a.g.c : e instanceof p ? i.a.AbstractC1586a.m.c : e instanceof NumberFormatException ? i.a.AbstractC1586a.l.c : i.a.AbstractC1586a.r.c;
    }
}
