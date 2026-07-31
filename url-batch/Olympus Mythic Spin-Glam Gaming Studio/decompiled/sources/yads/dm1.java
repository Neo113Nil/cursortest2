package yads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline48;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline49;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline50;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline51;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline52;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class dm1 implements sd {
    public boolean A;
    public final Context a;
    public final pe0 b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public ne2 n;
    public cm1 o;
    public cm1 p;
    public cm1 q;
    public jw0 r;
    public jw0 s;
    public jw0 t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final f73 e = new f73();
    public final d73 f = new d73();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public dm1(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        pe0 pe0Var = new pe0();
        this.b = pe0Var;
        pe0Var.e = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:312:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x041f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ye2 ye2Var, rd rdVar) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        bm1 bm1Var;
        bm1 bm1Var2;
        bm1 bm1Var3;
        bm1 bm1Var4;
        bm1 bm1Var5;
        char c;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        vk0 vk0Var;
        int i14;
        if (rdVar.a.a.size() == 0) {
            return;
        }
        for (int i15 = 0; i15 < rdVar.a.a.size(); i15++) {
            int a = rdVar.a.a(i15);
            qd qdVar = (qd) rdVar.b.get(a);
            qdVar.getClass();
            if (a == 0) {
                pe0 pe0Var = this.b;
                synchronized (pe0Var) {
                    try {
                        pe0Var.e.getClass();
                        g73 g73Var = pe0Var.f;
                        pe0Var.f = qdVar.b;
                        Iterator it = pe0Var.c.values().iterator();
                        while (it.hasNext()) {
                            oe0 oe0Var = (oe0) it.next();
                            g73 g73Var2 = pe0Var.f;
                            int i16 = oe0Var.b;
                            if (i16 >= g73Var.b()) {
                                if (i16 < g73Var2.b()) {
                                }
                                i16 = -1;
                            } else {
                                g73Var.a(i16, oe0Var.g.a, 0L);
                                for (int i17 = oe0Var.g.a.p; i17 <= oe0Var.g.a.q; i17++) {
                                    int a2 = g73Var2.a(g73Var.a(i17));
                                    if (a2 != -1) {
                                        i16 = g73Var2.a(a2, oe0Var.g.b, false).d;
                                        break;
                                    }
                                }
                                i16 = -1;
                            }
                            oe0Var.b = i16;
                            if (i16 != -1) {
                                pm1 pm1Var = oe0Var.d;
                                if (pm1Var != null && g73Var2.a(pm1Var.a) == -1) {
                                }
                                if (oe0Var.a(qdVar)) {
                                }
                            }
                            it.remove();
                            if (oe0Var.e) {
                                if (oe0Var.a.equals(pe0Var.g)) {
                                    pe0Var.g = null;
                                }
                                pe0Var.e.b(qdVar, oe0Var.a);
                            }
                        }
                        pe0Var.b(qdVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (a == 11) {
                this.b.a(qdVar, this.k);
            } else {
                this.b.c(qdVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (rdVar.a(0)) {
            qd qdVar2 = (qd) rdVar.b.get(0);
            qdVar2.getClass();
            if (this.j != null) {
                a(qdVar2.b, qdVar2.d);
            }
        }
        if (rdVar.a(2) && this.j != null) {
            xn0 xn0Var = (xn0) ye2Var;
            xn0Var.q();
            i41 listIterator = xn0Var.b0.i.d.b.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    vk0Var = null;
                    break;
                }
                d93 d93Var = (d93) listIterator.next();
                for (int i18 = 0; i18 < d93Var.b; i18++) {
                    if (d93Var.f[i18] && (vk0Var = d93Var.c.e[i18].p) != null) {
                        break loop3;
                    }
                }
            }
            if (vk0Var != null) {
                PlaybackMetrics.Builder builder = this.j;
                int i19 = sb3.a;
                int i20 = 0;
                while (true) {
                    if (i20 >= vk0Var.e) {
                        i14 = 1;
                        break;
                    }
                    UUID uuid = vk0Var.b[i20].c;
                    if (uuid.equals(xq.d)) {
                        i14 = 3;
                        break;
                    } else if (uuid.equals(xq.e)) {
                        i14 = 2;
                        break;
                    } else {
                        if (uuid.equals(xq.c)) {
                            i14 = 6;
                            break;
                        }
                        i20++;
                    }
                }
                builder.setDrmType(i14);
            }
        }
        if (rdVar.a(1011)) {
            this.z++;
        }
        ne2 ne2Var = this.n;
        if (ne2Var == null) {
            i5 = 1;
            i2 = 9;
            i4 = 8;
            i3 = 6;
        } else {
            Context context = this.a;
            boolean z2 = this.v == 4;
            if (ne2Var.b == 1001) {
                bm1Var5 = new bm1(20, 0);
            } else {
                if (ne2Var instanceof nn0) {
                    nn0 nn0Var = (nn0) ne2Var;
                    z = nn0Var.d == 1;
                    i = nn0Var.h;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = ne2Var.getCause();
                cause.getClass();
                char c2 = 6004;
                int i21 = 27;
                if (!(cause instanceof IOException)) {
                    i2 = 9;
                    i3 = 6;
                    if (z && (i == 0 || i == 1)) {
                        bm1Var3 = new bm1(35, 0);
                    } else if (z && i == 3) {
                        bm1Var3 = new bm1(15, 0);
                    } else if (z && i == 2) {
                        bm1Var3 = new bm1(23, 0);
                    } else {
                        if (cause instanceof fk1) {
                            bm1Var2 = new bm1(13, sb3.a(((fk1) cause).e));
                        } else if (cause instanceof bk1) {
                            bm1Var2 = new bm1(14, sb3.a(((bk1) cause).b));
                        } else if (cause instanceof OutOfMemoryError) {
                            bm1Var2 = new bm1(14, 0);
                        } else if (cause instanceof dk) {
                            bm1Var2 = new bm1(17, ((dk) cause).b);
                        } else if (cause instanceof fk) {
                            bm1Var2 = new bm1(18, ((fk) cause).b);
                        } else {
                            if (sb3.a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                i4 = 8;
                                bm1Var = new bm1(22, 0);
                            } else {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                if (errorCode2 == 2 || errorCode2 == 4) {
                                    i4 = 8;
                                } else {
                                    if (errorCode2 != 10) {
                                        i4 = 8;
                                        if (errorCode2 != 7) {
                                            if (errorCode2 != 8) {
                                                switch (errorCode2) {
                                                    case 15:
                                                        break;
                                                    case 16:
                                                    case 18:
                                                        break;
                                                    case 17:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                        break;
                                                    default:
                                                        switch (errorCode2) {
                                                            case 24:
                                                            case 25:
                                                            case 26:
                                                            case 27:
                                                            case 28:
                                                                c2 = 6002;
                                                                break;
                                                            default:
                                                                c2 = 6006;
                                                                break;
                                                        }
                                                }
                                            }
                                            c2 = 6003;
                                        }
                                    } else {
                                        i4 = 8;
                                    }
                                    switch (c2) {
                                        case 6002:
                                            i21 = 24;
                                            break;
                                        case 6003:
                                            i21 = 28;
                                            break;
                                        case 6004:
                                            i21 = 25;
                                            break;
                                        case 6005:
                                            i21 = 26;
                                            break;
                                    }
                                    bm1Var = new bm1(i21, errorCode2);
                                }
                                c2 = 6005;
                                switch (c2) {
                                }
                                bm1Var = new bm1(i21, errorCode2);
                            }
                            PlaybackSession playbackSession = this.c;
                            timeSinceCreatedMillis = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                            errorCode = timeSinceCreatedMillis.setErrorCode(bm1Var.a);
                            subErrorCode = errorCode.setSubErrorCode(bm1Var.b);
                            exception = subErrorCode.setException(ne2Var);
                            build = exception.build();
                            playbackSession.reportPlaybackErrorEvent(build);
                            i5 = 1;
                            this.A = true;
                            this.n = null;
                        }
                        bm1Var = bm1Var2;
                    }
                    bm1Var = bm1Var3;
                } else if (cause instanceof x01) {
                    bm1Var5 = new bm1(5, ((x01) cause).e);
                } else if (cause instanceof cc2) {
                    bm1Var5 = new bm1(z2 ? 10 : 11, 0);
                } else {
                    boolean z3 = cause instanceof v01;
                    if (z3 || (cause instanceof na3)) {
                        i2 = 9;
                        if (d92.a(context).a() == 1) {
                            bm1Var4 = new bm1(3, 0);
                        } else {
                            Throwable cause2 = cause.getCause();
                            if (cause2 instanceof UnknownHostException) {
                                i3 = 6;
                                bm1Var3 = new bm1(6, 0);
                                bm1Var = bm1Var3;
                            } else {
                                i3 = 6;
                                if (cause2 instanceof SocketTimeoutException) {
                                    i4 = 8;
                                    bm1Var = new bm1(7, 0);
                                } else {
                                    if (z3 && ((v01) cause).d == 1) {
                                        bm1Var = new bm1(4, 0);
                                    }
                                    bm1Var = new bm1(8, 0);
                                    i4 = 8;
                                }
                                PlaybackSession playbackSession2 = this.c;
                                timeSinceCreatedMillis = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                                errorCode = timeSinceCreatedMillis.setErrorCode(bm1Var.a);
                                subErrorCode = errorCode.setSubErrorCode(bm1Var.b);
                                exception = subErrorCode.setException(ne2Var);
                                build = exception.build();
                                playbackSession2.reportPlaybackErrorEvent(build);
                                i5 = 1;
                                this.A = true;
                                this.n = null;
                            }
                        }
                    } else if (ne2Var.b == 1002) {
                        bm1Var5 = new bm1(21, 0);
                    } else if (cause instanceof wk0) {
                        Throwable cause3 = cause.getCause();
                        cause3.getClass();
                        int i22 = sb3.a;
                        if (i22 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                            bm1Var5 = (i22 < 23 || !(cause3 instanceof MediaDrmResetException)) ? (i22 < 18 || !(cause3 instanceof NotProvisionedException)) ? (i22 < 18 || !(cause3 instanceof DeniedByServerException)) ? cause3 instanceof ya3 ? new bm1(23, 0) : new bm1(30, 0) : new bm1(29, 0) : new bm1(24, 0) : new bm1(27, 0);
                        } else {
                            int a3 = sb3.a(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            if (a3 != 2 && a3 != 4) {
                                if (a3 != 10) {
                                    if (a3 != 7) {
                                        if (a3 != 8) {
                                            switch (a3) {
                                                case 15:
                                                    break;
                                                case 16:
                                                case 18:
                                                    break;
                                                case 17:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                    break;
                                                default:
                                                    switch (a3) {
                                                        case 24:
                                                        case 25:
                                                        case 26:
                                                        case 27:
                                                        case 28:
                                                            c = 6002;
                                                            break;
                                                        default:
                                                            c = 6006;
                                                            break;
                                                    }
                                            }
                                            switch (c) {
                                                case 6002:
                                                    i21 = 24;
                                                    break;
                                                case 6003:
                                                    i21 = 28;
                                                    break;
                                                case 6004:
                                                    i21 = 25;
                                                    break;
                                                case 6005:
                                                    i21 = 26;
                                                    break;
                                            }
                                            bm1Var5 = new bm1(i21, a3);
                                        }
                                        c = 6003;
                                        switch (c) {
                                        }
                                        bm1Var5 = new bm1(i21, a3);
                                    }
                                }
                                c = 6004;
                                switch (c) {
                                }
                                bm1Var5 = new bm1(i21, a3);
                            }
                            c = 6005;
                            switch (c) {
                            }
                            bm1Var5 = new bm1(i21, a3);
                        }
                    } else if ((cause instanceof zt0) && (cause.getCause() instanceof FileNotFoundException)) {
                        Throwable cause4 = cause.getCause();
                        cause4.getClass();
                        Throwable cause5 = cause4.getCause();
                        bm1Var5 = (sb3.a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new bm1(32, 0) : new bm1(31, 0);
                    } else {
                        i2 = 9;
                        bm1Var4 = new bm1(9, 0);
                    }
                    bm1Var = bm1Var4;
                    i4 = 8;
                    i3 = 6;
                    PlaybackSession playbackSession22 = this.c;
                    timeSinceCreatedMillis = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                    errorCode = timeSinceCreatedMillis.setErrorCode(bm1Var.a);
                    subErrorCode = errorCode.setSubErrorCode(bm1Var.b);
                    exception = subErrorCode.setException(ne2Var);
                    build = exception.build();
                    playbackSession22.reportPlaybackErrorEvent(build);
                    i5 = 1;
                    this.A = true;
                    this.n = null;
                }
                i4 = 8;
                PlaybackSession playbackSession222 = this.c;
                timeSinceCreatedMillis = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                errorCode = timeSinceCreatedMillis.setErrorCode(bm1Var.a);
                subErrorCode = errorCode.setSubErrorCode(bm1Var.b);
                exception = subErrorCode.setException(ne2Var);
                build = exception.build();
                playbackSession222.reportPlaybackErrorEvent(build);
                i5 = 1;
                this.A = true;
                this.n = null;
            }
            bm1Var = bm1Var5;
            i2 = 9;
            i4 = 8;
            i3 = 6;
            PlaybackSession playbackSession2222 = this.c;
            timeSinceCreatedMillis = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
            errorCode = timeSinceCreatedMillis.setErrorCode(bm1Var.a);
            subErrorCode = errorCode.setSubErrorCode(bm1Var.b);
            exception = subErrorCode.setException(ne2Var);
            build = exception.build();
            playbackSession2222.reportPlaybackErrorEvent(build);
            i5 = 1;
            this.A = true;
            this.n = null;
        }
        if (rdVar.a(2)) {
            xn0 xn0Var2 = (xn0) ye2Var;
            xn0Var2.q();
            e93 e93Var = xn0Var2.b0.i.d;
            boolean a4 = e93Var.a(2);
            boolean a5 = e93Var.a(i5);
            boolean a6 = e93Var.a(3);
            if (a4 || a5 || a6) {
                if (a4 || sb3.a(this.r, (Object) null)) {
                    i6 = i2;
                    i7 = i4;
                    i9 = 7;
                    i10 = 13;
                    i8 = 3;
                } else {
                    int i23 = this.r == null ? 1 : 0;
                    this.r = null;
                    i9 = 7;
                    i7 = i4;
                    i6 = i2;
                    i10 = 13;
                    i8 = 3;
                    a(1, elapsedRealtime, null, i23);
                }
                if (!a5 && !sb3.a(this.s, (Object) null)) {
                    int i24 = this.s == null ? 1 : 0;
                    this.s = null;
                    a(0, elapsedRealtime, null, i24);
                }
                if (!a6 && !sb3.a(this.t, (Object) null)) {
                    int i25 = this.t == null ? 1 : 0;
                    this.t = null;
                    a(2, elapsedRealtime, null, i25);
                }
            } else {
                i6 = i2;
                i7 = i4;
                i9 = 7;
                i10 = 13;
                i8 = 3;
            }
        } else {
            i6 = i2;
            i7 = i4;
            i8 = 3;
            i9 = 7;
            i10 = 13;
        }
        if (a(this.o)) {
            cm1 cm1Var = this.o;
            jw0 jw0Var = cm1Var.a;
            if (jw0Var.s != -1) {
                int i26 = cm1Var.b;
                if (!sb3.a(this.r, jw0Var)) {
                    int i27 = (this.r == null && i26 == 0) ? 1 : i26;
                    this.r = jw0Var;
                    a(1, elapsedRealtime, jw0Var, i27);
                }
                this.o = null;
            }
        }
        if (a(this.p)) {
            cm1 cm1Var2 = this.p;
            jw0 jw0Var2 = cm1Var2.a;
            int i28 = cm1Var2.b;
            if (!sb3.a(this.s, jw0Var2)) {
                int i29 = (this.s == null && i28 == 0) ? 1 : i28;
                this.s = jw0Var2;
                a(0, elapsedRealtime, jw0Var2, i29);
            }
            this.p = null;
        }
        if (a(this.q)) {
            cm1 cm1Var3 = this.q;
            jw0 jw0Var3 = cm1Var3.a;
            int i30 = cm1Var3.b;
            if (!sb3.a(this.t, jw0Var3)) {
                int i31 = (this.t == null && i30 == 0) ? 1 : i30;
                this.t = jw0Var3;
                a(2, elapsedRealtime, jw0Var3, i31);
            }
            this.q = null;
        }
        switch (d92.a(this.a).a()) {
            case 0:
                i11 = 0;
                break;
            case 1:
                i11 = i6;
                break;
            case 2:
                i11 = 2;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 5;
                break;
            case 5:
                i11 = i3;
                break;
            case 6:
            case 8:
            default:
                i11 = 1;
                break;
            case 7:
                i11 = i8;
                break;
            case 9:
                i11 = i7;
                break;
            case 10:
                i11 = i9;
                break;
        }
        if (i11 != this.m) {
            this.m = i11;
            PlaybackSession playbackSession3 = this.c;
            networkType = MediaMetricsListener$$ExternalSyntheticApiModelOutline49.m().setNetworkType(i11);
            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.d);
            build3 = timeSinceCreatedMillis3.build();
            playbackSession3.reportNetworkEvent(build3);
        }
        xn0 xn0Var3 = (xn0) ye2Var;
        xn0Var3.q();
        if (xn0Var3.b0.e != 2) {
            this.u = false;
        }
        xn0Var3.q();
        if (xn0Var3.b0.f == null) {
            this.w = false;
            i12 = 10;
        } else {
            i12 = 10;
            if (rdVar.a(10)) {
                this.w = true;
            }
        }
        xn0Var3.q();
        int i32 = xn0Var3.b0.e;
        if (this.u) {
            i13 = 5;
        } else if (this.w) {
            i13 = i10;
        } else if (i32 == 4) {
            i13 = 11;
        } else if (i32 == 2) {
            int i33 = this.l;
            if (i33 == 0 || i33 == 2) {
                i13 = 2;
            } else {
                xn0Var3.q();
                if (xn0Var3.b0.l) {
                    xn0Var3.q();
                    i13 = xn0Var3.b0.m != 0 ? i12 : i3;
                } else {
                    i13 = i9;
                }
            }
        } else if (i32 == i8) {
            xn0Var3.q();
            if (xn0Var3.b0.l) {
                xn0Var3.q();
                i13 = xn0Var3.b0.m != 0 ? i6 : i8;
            } else {
                i13 = 4;
            }
        } else {
            i13 = (i32 != 1 || this.l == 0) ? this.l : 12;
        }
        if (this.l != i13) {
            this.l = i13;
            this.A = true;
            PlaybackSession playbackSession4 = this.c;
            state = MediaMetricsListener$$ExternalSyntheticApiModelOutline52.m().setState(this.l);
            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - this.d);
            build2 = timeSinceCreatedMillis2.build();
            playbackSession4.reportPlaybackStateEvent(build2);
        }
        if (rdVar.a(1028)) {
            pe0 pe0Var2 = this.b;
            qd qdVar3 = (qd) rdVar.b.get(1028);
            qdVar3.getClass();
            pe0Var2.a(qdVar3);
        }
    }

    public final void b(qd qdVar, String str) {
        pm1 pm1Var = qdVar.d;
        if ((pm1Var == null || !pm1Var.a()) && str.equals(this.i)) {
            a();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final void a(qd qdVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        pm1 pm1Var = qdVar.d;
        if (pm1Var == null || !pm1Var.a()) {
            a();
            this.i = str;
            playerName = MediaMetricsListener$$ExternalSyntheticApiModelOutline50.m().setPlayerName(ExoPlayerLibraryInfo.TAG);
            playerVersion = playerName.setPlayerVersion("2.18.1");
            this.j = playerVersion;
            a(qdVar.b, qdVar.d);
        }
    }

    public final boolean a(cm1 cm1Var) {
        String str;
        if (cm1Var != null) {
            String str2 = cm1Var.c;
            pe0 pe0Var = this.b;
            synchronized (pe0Var) {
                str = pe0Var.g;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(int i, long j, jw0 jw0Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        timeSinceCreatedMillis = MediaMetricsListener$$ExternalSyntheticApiModelOutline48.m(i).setTimeSinceCreatedMillis(j - this.d);
        if (jw0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = jw0Var.l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = jw0Var.m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = jw0Var.j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = jw0Var.i;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = jw0Var.r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = jw0Var.s;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = jw0Var.z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = jw0Var.A;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = jw0Var.d;
            if (str4 != null) {
                int i9 = sb3.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = jw0Var.t;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    public final void a(g73 g73Var, pm1 pm1Var) {
        int a;
        PlaybackMetrics.Builder builder = this.j;
        if (pm1Var == null || (a = g73Var.a(pm1Var.a)) == -1) {
            return;
        }
        int i = 0;
        g73Var.a(a, this.f, false);
        g73Var.a(this.f.d, this.e, 0L);
        rl1 rl1Var = this.e.d.c;
        if (rl1Var != null) {
            int a2 = sb3.a(rl1Var.a, (String) null);
            i = a2 != 0 ? a2 != 1 ? a2 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        f73 f73Var = this.e;
        if (f73Var.o != -9223372036854775807L && !f73Var.m && !f73Var.j && !f73Var.a()) {
            builder.setMediaDurationMillis(sb3.b(this.e.o));
        }
        builder.setPlaybackType(this.e.a() ? 2 : 1);
        this.A = true;
    }

    public final void a() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = (Long) this.g.get(this.i);
            this.j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            this.j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }
}
