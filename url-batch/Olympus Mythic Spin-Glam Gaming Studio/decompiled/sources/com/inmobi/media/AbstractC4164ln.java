package com.inmobi.media;

import android.media.MediaPlayer;
import android.webkit.URLUtil;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.inmobi.media.ln, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4164ln {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.inmobi.media.x9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0084 -> B:10:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(MediaPlayer mediaPlayer, ArrayList arrayList, C4493y9 c4493y9, ContinuationImpl continuationImpl) {
        C3980en c3980en;
        int i;
        Iterator it;
        C4493y9 c4493y92;
        if (continuationImpl instanceof C3980en) {
            c3980en = (C3980en) continuationImpl;
            int i2 = c3980en.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3980en.f = i2 - Integer.MIN_VALUE;
                Object obj = c3980en.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3980en.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    a(mediaPlayer, c4493y9);
                    it = arrayList.iterator();
                    c4493y92 = c4493y9;
                    while (it.hasNext()) {
                    }
                    return Ym.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = c3980en.d;
                it = c3980en.c;
                ?? r9 = c3980en.b;
                MediaPlayer mediaPlayer2 = c3980en.a;
                ResultKt.throwOnFailure(obj);
                C4493y9 c4493y93 = r9;
                if (!((Boolean) obj).booleanValue()) {
                    return new C3926cn(str);
                }
                mediaPlayer = mediaPlayer2;
                c4493y92 = c4493y93;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (URLUtil.isNetworkUrl(str2)) {
                        if (c4493y92 != null) {
                            c4493y92.a("VideoLoaderHelper", "Video Loading for URL: " + str2);
                        }
                        mediaPlayer.reset();
                        c3980en.a = mediaPlayer;
                        c3980en.b = c4493y92;
                        c3980en.c = it;
                        c3980en.d = str2;
                        c3980en.f = 1;
                        Object a = a(mediaPlayer, str2, c4493y92, c3980en);
                        if (a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mediaPlayer2 = mediaPlayer;
                        str = str2;
                        obj = a;
                        c4493y93 = c4493y92;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                }
                return Ym.a;
            }
        }
        c3980en = new C3980en(continuationImpl);
        Object obj2 = c3980en.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3980en.f;
        if (i != 0) {
        }
    }

    public static final void a(MediaPlayer mediaPlayer, final C4493y9 c4493y9) {
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: com.inmobi.media.ln$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i) {
                AbstractC4164ln.a(InterfaceC4466x9.this, mediaPlayer2, i);
            }
        });
    }

    public static final void a(InterfaceC4466x9 interfaceC4466x9, MediaPlayer mediaPlayer, int i) {
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("VideoLoaderHelper", "Buffering Percentage: " + i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x014f -> B:10:0x0156). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ExoPlayer exoPlayer, ArrayList arrayList, InterfaceC4466x9 interfaceC4466x9, P2 p2, boolean z, ContinuationImpl continuationImpl) {
        C4007fn c4007fn;
        int i;
        P2 p22;
        boolean z2;
        Iterator it;
        int i2;
        ExoPlayer exoPlayer2;
        C4007fn c4007fn2;
        InterfaceC4466x9 interfaceC4466x92;
        Object m8023constructorimpl;
        if (continuationImpl instanceof C4007fn) {
            c4007fn = (C4007fn) continuationImpl;
            int i3 = c4007fn.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4007fn.j = i3 - Integer.MIN_VALUE;
                Object obj = c4007fn.i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4007fn.j;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (arrayList.isEmpty()) {
                        if (interfaceC4466x9 != null) {
                            ((C4493y9) interfaceC4466x9).b("VideoLoaderHelper", "No URLs provided to load media");
                        }
                        return new C4123k8(Zm.e);
                    }
                    List distinct = CollectionsKt.distinct(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = distinct.iterator();
                    while (true) {
                        boolean z3 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        String str = (String) next;
                        if (!StringsKt.isBlank(str) && URLUtil.isNetworkUrl(str)) {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(new URI(str));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                            }
                            z3 = Result.m8029isSuccessimpl(m8023constructorimpl);
                        }
                        if (z3) {
                            arrayList2.add(next);
                        }
                    }
                    if (arrayList2.size() != arrayList.size() && interfaceC4466x9 != null) {
                        ((C4493y9) interfaceC4466x9).a("VideoLoaderHelper", "Filtered invalid or duplicate URLs. Valid set: " + arrayList2);
                    }
                    if (arrayList2.isEmpty()) {
                        if (interfaceC4466x9 != null) {
                            ((C4493y9) interfaceC4466x9).b("VideoLoaderHelper", "All provided URLs were invalid or non-network");
                        }
                        return new C4123k8(Zm.c);
                    }
                    if (interfaceC4466x9 != null) {
                        ((C4493y9) interfaceC4466x9).a("VideoLoaderHelper", "Attempting to load media from URLs: " + arrayList2);
                    }
                    Iterator it3 = arrayList2.iterator();
                    p22 = p2;
                    z2 = z;
                    it = it3;
                    i2 = 0;
                    exoPlayer2 = exoPlayer;
                    c4007fn2 = c4007fn;
                    interfaceC4466x92 = interfaceC4466x9;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = c4007fn.h;
                    int i5 = c4007fn.g;
                    boolean z4 = c4007fn.f;
                    String str2 = c4007fn.e;
                    it = c4007fn.d;
                    P2 p23 = c4007fn.c;
                    InterfaceC4466x9 interfaceC4466x93 = c4007fn.b;
                    ExoPlayer exoPlayer3 = c4007fn.a;
                    ResultKt.throwOnFailure(obj);
                    c4007fn2 = c4007fn;
                    interfaceC4466x92 = interfaceC4466x93;
                    int i6 = i5;
                    z2 = z4;
                    AbstractC4175m8 abstractC4175m8 = (AbstractC4175m8) obj;
                    if (abstractC4175m8 instanceof C4202n8) {
                        if (interfaceC4466x92 != null) {
                            ((C4493y9) interfaceC4466x92).b("VideoLoaderHelper", "Failed to load media from URL (" + i4 + "): " + str2);
                        }
                        p22 = p23;
                        i2 = i6;
                        exoPlayer2 = exoPlayer3;
                        if (!it.hasNext()) {
                            Object next2 = it.next();
                            i6 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            String str3 = (String) next2;
                            c4007fn2.a = exoPlayer2;
                            c4007fn2.b = interfaceC4466x92;
                            c4007fn2.c = p22;
                            c4007fn2.d = it;
                            c4007fn2.e = str3;
                            c4007fn2.f = z2;
                            c4007fn2.g = i6;
                            c4007fn2.h = i2;
                            c4007fn2.j = 1;
                            Object a = a(exoPlayer2, str3, interfaceC4466x92, p22, z2, c4007fn2);
                            if (a == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            exoPlayer3 = exoPlayer2;
                            obj = a;
                            p23 = p22;
                            i4 = i2;
                            str2 = str3;
                            AbstractC4175m8 abstractC4175m82 = (AbstractC4175m8) obj;
                            if (abstractC4175m82 instanceof C4202n8) {
                                if (interfaceC4466x92 != null) {
                                    ((C4493y9) interfaceC4466x92).a("VideoLoaderHelper", "Successfully loaded media from URL: " + str2);
                                }
                                return abstractC4175m82;
                            }
                        } else {
                            if (interfaceC4466x92 != null) {
                                ((C4493y9) interfaceC4466x92).b("VideoLoaderHelper", "All URLs failed to load");
                            }
                            return new C4123k8(Zm.d);
                        }
                    }
                }
            }
        }
        c4007fn = new C4007fn(continuationImpl);
        Object obj2 = c4007fn.i;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4007fn.j;
        if (i != 0) {
        }
    }

    public static final Object a(MediaPlayer mediaPlayer, String str, InterfaceC4466x9 interfaceC4466x9, C3980en c3980en) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c3980en), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C4034gn(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new C4060hn(interfaceC4466x9, str, cancellableContinuationImpl));
            mediaPlayer.setOnErrorListener(new C4086in(interfaceC4466x9, str, cancellableContinuationImpl));
            InMobiVideoBridge.MediaPlayerSetDataSource(mediaPlayer, str);
            mediaPlayer.prepareAsync();
        } catch (IOException e) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("VideoLoaderHelper", "Video Load Exception: " + e.getMessage());
            }
            X4.a(cancellableContinuationImpl, Boxing.boxBoolean(false));
        } catch (IllegalStateException e2) {
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).b("VideoLoaderHelper", "Video Load Exception: " + e2.getMessage());
            }
            X4.a(cancellableContinuationImpl, Boxing.boxBoolean(false));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c3980en);
        }
        return result;
    }

    public static final Object a(ExoPlayer exoPlayer, String str, InterfaceC4466x9 interfaceC4466x9, P2 p2, boolean z, C4007fn c4007fn) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c4007fn), 1);
        cancellableContinuationImpl.initCancellability();
        C4138kn c4138kn = new C4138kn(cancellableContinuationImpl, p2, str, interfaceC4466x9, exoPlayer);
        cancellableContinuationImpl.invokeOnCancellation(new C4112jn(exoPlayer, c4138kn));
        if (interfaceC4466x9 != null) {
            try {
                ((C4493y9) interfaceC4466x9).a("VideoLoaderHelper", "Trying URL with cache " + z + ": " + str);
            } catch (Exception e) {
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).b("VideoLoaderHelper", "Exception during media source preparation for URL (" + str + "): " + e.getMessage());
                }
                exoPlayer.removeListener(c4138kn);
                if (cancellableContinuationImpl.isActive()) {
                    X4.a(cancellableContinuationImpl, new C4123k8(Zm.b));
                }
                InMobiVideoBridge.exoPlayer3Stop(exoPlayer);
                exoPlayer.clearMediaItems();
            }
        }
        MediaSource a = p2.a(str, z);
        exoPlayer.addListener(c4138kn);
        exoPlayer.setMediaSource(a);
        exoPlayer.prepare();
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(c4007fn);
        }
        return result;
    }
}
