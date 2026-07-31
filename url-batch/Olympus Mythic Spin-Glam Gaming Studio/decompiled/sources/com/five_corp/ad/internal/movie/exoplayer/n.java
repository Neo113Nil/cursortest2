package com.five_corp.ad.internal.movie.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import com.five_corp.ad.internal.view.E;

/* loaded from: classes9.dex */
public final class n implements Player.Listener {
    public final ExoPlayer a;
    public final Handler b;
    public final E c;
    public final a d;
    public final Long e;
    public m f;

    public n(ExoPlayer exoPlayer, E e, Long l, a aVar) {
        this.a = exoPlayer;
        exoPlayer.addListener(this);
        this.b = new Handler(Looper.getMainLooper());
        this.c = e;
        this.e = l;
        this.d = aVar;
        this.f = null;
    }

    public final void a() {
        m mVar = this.f;
        if (mVar != null) {
            this.b.removeCallbacksAndMessages(mVar);
            this.f = null;
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            this.d.i();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                String.format("onPlaybackStateChanged: %d", Integer.valueOf(i));
                return;
            } else {
                this.d.j();
                return;
            }
        }
        long duration = this.a.getDuration();
        if (duration == -9223372036854775807L) {
            duration = -1;
        }
        this.d.c(duration);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        com.five_corp.ad.internal.m mVar;
        a aVar = this.d;
        int i = playbackException.errorCode;
        if (i == 5001) {
            mVar = com.five_corp.ad.internal.m.e6;
        } else if (i != 5002) {
            switch (i) {
                case 1000:
                    mVar = com.five_corp.ad.internal.m.L6;
                    break;
                case 1001:
                    mVar = com.five_corp.ad.internal.m.J6;
                    break;
                case 1002:
                    mVar = com.five_corp.ad.internal.m.g6;
                    break;
                case 1003:
                    mVar = com.five_corp.ad.internal.m.K6;
                    break;
                case 1004:
                    mVar = com.five_corp.ad.internal.m.v6;
                    break;
                default:
                    switch (i) {
                        case 2000:
                            mVar = com.five_corp.ad.internal.m.E6;
                            break;
                        case 2001:
                            mVar = com.five_corp.ad.internal.m.A6;
                            break;
                        case 2002:
                            mVar = com.five_corp.ad.internal.m.B6;
                            break;
                        case 2003:
                            mVar = com.five_corp.ad.internal.m.z6;
                            break;
                        case 2004:
                            mVar = com.five_corp.ad.internal.m.w6;
                            break;
                        case 2005:
                            mVar = com.five_corp.ad.internal.m.y6;
                            break;
                        case 2006:
                            mVar = com.five_corp.ad.internal.m.C6;
                            break;
                        case 2007:
                            mVar = com.five_corp.ad.internal.m.x6;
                            break;
                        case 2008:
                            mVar = com.five_corp.ad.internal.m.D6;
                            break;
                        default:
                            switch (i) {
                                case 3001:
                                    mVar = com.five_corp.ad.internal.m.F6;
                                    break;
                                case 3002:
                                    mVar = com.five_corp.ad.internal.m.H6;
                                    break;
                                case 3003:
                                    mVar = com.five_corp.ad.internal.m.G6;
                                    break;
                                case 3004:
                                    mVar = com.five_corp.ad.internal.m.I6;
                                    break;
                                default:
                                    switch (i) {
                                        case 4001:
                                            mVar = com.five_corp.ad.internal.m.h6;
                                            break;
                                        case 4002:
                                            mVar = com.five_corp.ad.internal.m.i6;
                                            break;
                                        case 4003:
                                            mVar = com.five_corp.ad.internal.m.j6;
                                            break;
                                        case 4004:
                                            mVar = com.five_corp.ad.internal.m.k6;
                                            break;
                                        case 4005:
                                            mVar = com.five_corp.ad.internal.m.l6;
                                            break;
                                        default:
                                            switch (i) {
                                                case 6000:
                                                    mVar = com.five_corp.ad.internal.m.u6;
                                                    break;
                                                case 6001:
                                                    mVar = com.five_corp.ad.internal.m.s6;
                                                    break;
                                                case 6002:
                                                    mVar = com.five_corp.ad.internal.m.r6;
                                                    break;
                                                case 6003:
                                                    mVar = com.five_corp.ad.internal.m.m6;
                                                    break;
                                                case 6004:
                                                    mVar = com.five_corp.ad.internal.m.p6;
                                                    break;
                                                case 6005:
                                                    mVar = com.five_corp.ad.internal.m.o6;
                                                    break;
                                                case 6006:
                                                    mVar = com.five_corp.ad.internal.m.t6;
                                                    break;
                                                case 6007:
                                                    mVar = com.five_corp.ad.internal.m.n6;
                                                    break;
                                                case 6008:
                                                    mVar = com.five_corp.ad.internal.m.q6;
                                                    break;
                                                default:
                                                    mVar = com.five_corp.ad.internal.m.M6;
                                                    break;
                                            }
                                    }
                            }
                    }
            }
        } else {
            mVar = com.five_corp.ad.internal.m.f6;
        }
        aVar.b(new com.five_corp.ad.internal.l(mVar, null, playbackException));
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(final m mVar) {
        if (SystemClock.uptimeMillis() > mVar.a) {
            this.d.b(new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.N6, null, null));
        } else {
            this.b.postAtTime(new Runnable() { // from class: com.five_corp.ad.internal.movie.exoplayer.n$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    n.this.b(mVar);
                }
            }, mVar, SystemClock.uptimeMillis() + 500);
        }
    }
}
