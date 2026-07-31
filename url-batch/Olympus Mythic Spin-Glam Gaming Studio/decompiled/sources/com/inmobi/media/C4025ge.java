package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4025ge implements InterfaceC4311rc {
    public final CoroutineScope a;
    public final C4270pn b;
    public final C4493y9 c;
    public final ArrayList d;
    public final CoroutineScope e;
    public final AtomicBoolean f;
    public Jg g;
    public final MutableSharedFlow h;
    public final RelativeLayout i;
    public final MediaPlayer j;
    public final C4235oe k;
    public final En l;
    public final On m;
    public final C3997fe n;
    public final MutableSharedFlow o;

    public C4025ge(Context context, CoroutineScope coroutineScope, C4270pn config, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = coroutineScope;
        this.b = config;
        this.c = c4493y9;
        this.d = new ArrayList();
        this.e = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));
        this.f = new AtomicBoolean(false);
        this.g = Jg.a;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.h = MutableSharedFlow$default;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.i = relativeLayout;
        Context context2 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        MediaPlayer a = AbstractC4296qn.a(context2);
        this.j = a;
        this.k = new C4235oe(relativeLayout, coroutineScope, a, config, MutableSharedFlow$default);
        this.l = new En(a, coroutineScope, config.c.f, MutableSharedFlow$default);
        this.m = new On(coroutineScope, a, relativeLayout, config, c4493y9);
        this.n = new C3997fe(this);
        this.o = MutableSharedFlow$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        C3969ee c3969ee;
        int i;
        AbstractC3900bn abstractC3900bn;
        C4493y9 c4493y9;
        if (continuationImpl instanceof C3969ee) {
            c3969ee = (C3969ee) continuationImpl;
            int i2 = c3969ee.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3969ee.c = i2 - Integer.MIN_VALUE;
                Object obj = c3969ee.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3969ee.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.g != Jg.a) {
                        throw new C4285qc();
                    }
                    this.g = Jg.b;
                    X4.a(this.h, this.a, C3874an.a);
                    C4493y9 c4493y92 = this.c;
                    if (c4493y92 != null) {
                        c4493y92.a("NativeMediaPlayer", "Media Player Load started");
                    }
                    MediaPlayer mediaPlayer = this.j;
                    C4493y9 c4493y93 = this.c;
                    c3969ee.c = 1;
                    obj = AbstractC4164ln.a(mediaPlayer, arrayList, c4493y93, c3969ee);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                abstractC3900bn = (AbstractC3900bn) obj;
                c4493y9 = this.c;
                if (c4493y9 != null) {
                    c4493y9.a("NativeMediaPlayer", "Media Player Load Status " + abstractC3900bn);
                }
                if (abstractC3900bn instanceof C3926cn) {
                    if (!(abstractC3900bn instanceof Ym)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.g = Jg.g;
                    X4.a(this.h, this.a, new C4269pm());
                    throw new C4285qc();
                }
                X4.a(this.h, this.a, new C3952dn(((C3926cn) abstractC3900bn).a));
                this.g = Jg.c;
                MediaPlayer mediaPlayer2 = this.j;
                Intrinsics.checkNotNullParameter(mediaPlayer2, "<this>");
                try {
                    mediaPlayer2.seekTo(0);
                } catch (IllegalStateException unused) {
                }
                On on = this.m;
                C3997fe surfaceViewabilityListener = this.n;
                on.getClass();
                Intrinsics.checkNotNullParameter(surfaceViewabilityListener, "surfaceViewabilityListener");
                X4.a(on.a, new Kn(on, surfaceViewabilityListener, null));
                C4235oe c4235oe = this.k;
                X4.a(c4235oe.b, new C4129ke(c4235oe, null));
                return this.i;
            }
        }
        c3969ee = new C3969ee(this, continuationImpl);
        Object obj2 = c3969ee.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3969ee.c;
        if (i != 0) {
        }
        abstractC3900bn = (AbstractC3900bn) obj2;
        c4493y9 = this.c;
        if (c4493y9 != null) {
        }
        if (abstractC3900bn instanceof C3926cn) {
        }
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            C4493y9 c4493y9 = this.c;
            if (c4493y9 != null) {
                c4493y9.a("NativeMediaPlayer", "destroy called");
            }
            this.g = Jg.h;
            X4.a(this.d);
            this.m.b();
            C4235oe c4235oe = this.k;
            c4235oe.g.removeAllViews();
            c4235oe.f.d();
            this.l.c();
            this.i.removeAllViews();
            BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new C3917ce(this, null), 3, null);
        }
    }
}
