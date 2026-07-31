package com.inmobi.media;

import android.media.MediaPlayer;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes10.dex */
public final class En {
    public final MediaPlayer a;
    public final CoroutineScope b;
    public final long c;
    public final MutableSharedFlow d;
    public final AtomicBoolean e;
    public Job f;
    public int g;

    public En(MediaPlayer mediaPlayer, CoroutineScope coroutineScope, long j, MutableSharedFlow progressEvents) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        this.a = mediaPlayer;
        this.b = coroutineScope;
        this.c = j;
        this.d = progressEvents;
        this.e = new AtomicBoolean(false);
        this.g = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(En en, ContinuationImpl continuationImpl) {
        Cn cn;
        Object coroutine_suspended;
        int i;
        boolean z;
        int currentPosition;
        Object emit;
        int i2;
        Object obj;
        int i3;
        Object emit2;
        en.getClass();
        if (continuationImpl instanceof Cn) {
            cn = (Cn) continuationImpl;
            int i4 = cn.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cn.e = i4 - Integer.MIN_VALUE;
                Object obj2 = cn.c;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cn.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    MediaPlayer mediaPlayer = en.a;
                    Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
                    try {
                        z = mediaPlayer.isPlaying();
                    } catch (IllegalStateException unused) {
                        z = false;
                    }
                    if (z) {
                        currentPosition = en.a.getCurrentPosition();
                        int duration = en.a.getDuration();
                        if (duration == -1) {
                            return Unit.INSTANCE;
                        }
                        int i5 = duration > 0 ? (currentPosition * 100) / duration : 0;
                        if (en.g == 4 && i5 < 25) {
                            en.g = -1;
                        }
                        cn.a = currentPosition;
                        cn.b = i5;
                        cn.e = 1;
                        if (en.g >= 0) {
                            emit = Unit.INSTANCE;
                        } else {
                            en.g = 0;
                            emit = en.d.emit(new Jn("VideoProgressTracker", duration), cn);
                            if (emit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                emit = Unit.INSTANCE;
                            }
                        }
                        if (emit == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = i5;
                        cn.a = currentPosition;
                        cn.b = i2;
                        cn.e = 2;
                        if (!en.a(i2, 25, 1)) {
                        }
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    i2 = cn.b;
                    int i6 = cn.a;
                    ResultKt.throwOnFailure(obj2);
                    currentPosition = i6;
                    cn.a = currentPosition;
                    cn.b = i2;
                    cn.e = 2;
                    if (!en.a(i2, 25, 1)) {
                        en.g = 1;
                        obj = en.d.emit(Wm.a, cn);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else if (en.a(i2, 50, 2)) {
                        en.g = 2;
                        obj = en.d.emit(Hn.a, cn);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else if (en.a(i2, 75, 3)) {
                        en.g = 3;
                        obj = en.d.emit(Qn.a, cn);
                        if (obj != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        obj = Unit.INSTANCE;
                    }
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = currentPosition;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    i2 = cn.b;
                    i3 = cn.a;
                    ResultKt.throwOnFailure(obj2);
                }
                cn.e = 3;
                if (en.g != 4) {
                    emit2 = Unit.INSTANCE;
                } else {
                    emit2 = en.d.emit(new C4454wn(i3, i2), cn);
                    if (emit2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        emit2 = Unit.INSTANCE;
                    }
                }
                if (emit2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        cn = new Cn(en, continuationImpl);
        Object obj22 = cn.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cn.e;
        if (i != 0) {
        }
        cn.e = 3;
        if (en.g != 4) {
        }
        if (emit2 == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final void b() {
        Job launch$default;
        if (this.e.getAndSet(true)) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new Dn(this, null), 3, null);
        this.f = launch$default;
        a();
    }

    public final void c() {
        if (this.e.getAndSet(false)) {
            this.a.setOnCompletionListener(null);
            P6.a(this.f);
            this.f = null;
        }
    }

    public final void a() {
        this.a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.inmobi.media.En$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/En$$ExternalSyntheticLambda0;->onCompletion(Landroid/media/MediaPlayer;)V");
                CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.i, mediaPlayer, "media-player");
                safedk_En$$ExternalSyntheticLambda0_onCompletion_769318897bf7329a88726cf518770904(mediaPlayer);
            }

            public void safedk_En$$ExternalSyntheticLambda0_onCompletion_769318897bf7329a88726cf518770904(MediaPlayer p0) {
                En.a(En.this, p0);
            }
        });
    }

    public static final void a(En en, MediaPlayer mediaPlayer) {
        en.g = 4;
        BuildersKt__Builders_commonKt.launch$default(en.b, null, null, new Bn(en, null), 3, null);
    }

    public final boolean a(int i, int i2, int i3) {
        return i3 >= -1 && i3 <= 4 && i >= i2 && this.g == i3 - 1;
    }
}
