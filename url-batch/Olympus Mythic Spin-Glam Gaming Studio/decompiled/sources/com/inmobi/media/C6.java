package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes11.dex */
public final class C6 {
    public final ExoPlayer a;
    public final CoroutineScope b;
    public final MutableSharedFlow c;
    public final AtomicBoolean d;
    public Job e;
    public Job f;
    public int g;
    public boolean[] h;
    public final int[] i;
    public final AbstractC4295qm[] j;
    public final long k;
    public final long l;

    public C6(ExoPlayer player, AdConfig.HybridNativeConfig hybridNativeConfig, CoroutineScope coroutineScope, long j, MutableSharedFlow progressEvents, TrackPercentage trackPercentage) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        Intrinsics.checkNotNullParameter(trackPercentage, "trackPercentage");
        this.a = player;
        this.b = coroutineScope;
        this.c = progressEvents;
        this.d = new AtomicBoolean(false);
        this.g = -1;
        boolean[] zArr = new boolean[4];
        for (int i = 0; i < 4; i++) {
            zArr[i] = false;
        }
        this.h = zArr;
        this.i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.j = new AbstractC4295qm[]{Wm.a, Hn.a, Qn.a, Xm.a};
        this.k = 200L;
        this.l = RangesKt.coerceAtLeast(j, hybridNativeConfig.getMinProgressInterval());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r9.a(r2, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C6 c6, ContinuationImpl continuationImpl) {
        C4516z6 c4516z6;
        int i;
        int currentPosition;
        Object emit;
        c6.getClass();
        if (continuationImpl instanceof C4516z6) {
            c4516z6 = (C4516z6) continuationImpl;
            int i2 = c4516z6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4516z6.d = i2 - Integer.MIN_VALUE;
                Object obj = c4516z6.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4516z6.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!c6.a.isPlaying()) {
                        return Unit.INSTANCE;
                    }
                    int duration = (int) c6.a.getDuration();
                    if (duration <= 0) {
                        return Unit.INSTANCE;
                    }
                    currentPosition = (((int) c6.a.getCurrentPosition()) * 100) / duration;
                    if (c6.g == 2 && currentPosition < c6.i[0]) {
                        c6.g = -1;
                        boolean[] zArr = new boolean[4];
                        for (int i3 = 0; i3 < 4; i3++) {
                            zArr[i3] = false;
                        }
                        c6.h = zArr;
                    }
                    c4516z6.a = currentPosition;
                    c4516z6.d = 1;
                    if (c6.g >= 0) {
                        emit = Unit.INSTANCE;
                    } else {
                        c6.g = 0;
                        emit = c6.c.emit(new Jn("ExoVideoProgressTracker", duration), c4516z6);
                        if (emit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            emit = Unit.INSTANCE;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    currentPosition = c4516z6.a;
                    ResultKt.throwOnFailure(obj);
                }
                c4516z6.d = 2;
            }
        }
        c4516z6 = new C4516z6(c6, continuationImpl);
        Object obj2 = c4516z6.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4516z6.d;
        if (i != 0) {
        }
        c4516z6.d = 2;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            P6.a(this.e);
            P6.a(this.f);
            this.e = null;
            this.f = null;
        }
    }

    public static final Object a(C6 c6, B6 b6) {
        Object emit;
        if (!c6.a.isPlaying()) {
            return Unit.INSTANCE;
        }
        long duration = c6.a.getDuration();
        if (duration <= 0) {
            return Unit.INSTANCE;
        }
        return (c6.g != 2 && (emit = c6.c.emit(new C4360t8(c6.a.getCurrentPosition(), duration), b6)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? emit : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:10:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:10:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:10:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, ContinuationImpl continuationImpl) {
        C4463x6 c4463x6;
        int i2;
        int i3;
        int i4;
        int length;
        if (continuationImpl instanceof C4463x6) {
            c4463x6 = (C4463x6) continuationImpl;
            int i5 = c4463x6.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c4463x6.f = i5 - Integer.MIN_VALUE;
                Object obj = c4463x6.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4463x6.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    i3 = 0;
                    i4 = i;
                    length = this.i.length;
                    if (i3 < length) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = c4463x6.c;
                    i3 = c4463x6.b;
                    int i6 = c4463x6.a;
                    ResultKt.throwOnFailure(obj);
                    i4 = i6;
                    i3++;
                    if (i3 < length) {
                        if (i4 >= this.i[i3]) {
                            boolean[] zArr = this.h;
                            if (!zArr[i3]) {
                                zArr[i3] = true;
                                MutableSharedFlow mutableSharedFlow = this.c;
                                AbstractC4295qm abstractC4295qm = this.j[i3];
                                c4463x6.a = i4;
                                c4463x6.b = i3;
                                c4463x6.c = length;
                                c4463x6.f = 1;
                                if (mutableSharedFlow.emit(abstractC4295qm, c4463x6) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        i3++;
                        if (i3 < length) {
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        c4463x6 = new C4463x6(this, continuationImpl);
        Object obj2 = c4463x6.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4463x6.f;
        if (i2 != 0) {
        }
    }
}
