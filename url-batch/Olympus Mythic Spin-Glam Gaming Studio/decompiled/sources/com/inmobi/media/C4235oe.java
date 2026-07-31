package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.oe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4235oe {
    public final RelativeLayout a;
    public final CoroutineScope b;
    public final MediaPlayer c;
    public final C4270pn d;
    public final MutableSharedFlow e;
    public final U1 f;
    public final RelativeLayout g;
    public final float h;
    public boolean i;
    public final C4303r5 j;
    public final C4303r5 k;
    public final An l;

    public C4235oe(RelativeLayout parentView, CoroutineScope coroutineScope, MediaPlayer mediaPlayer, C4270pn config, MutableSharedFlow mediaPlayerFlow) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.a = parentView;
        this.b = coroutineScope;
        this.c = mediaPlayer;
        this.d = config;
        this.e = mediaPlayerFlow;
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        U1 u1 = new U1(context);
        this.f = u1;
        RelativeLayout relativeLayout = new RelativeLayout(parentView.getContext());
        this.g = relativeLayout;
        this.h = R5.b();
        this.l = new An(coroutineScope, relativeLayout, config.c, mediaPlayerFlow);
        C4103je listener = new C4103je(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        u1.c = new WeakReference(listener);
        Context context2 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.j = new C4303r5(context2, (byte) 9, null);
        Context context3 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.k = new C4303r5(context3, (byte) 10, null);
        b();
        relativeLayout.setWillNotDraw(true);
        relativeLayout.setBackgroundColor(0);
        AbstractC4296qn.a(mediaPlayer, u1);
    }

    public static final void a(C4235oe c4235oe, View view) {
        X4.a(c4235oe.b, new C4208ne(c4235oe, null));
    }

    public final void b() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oe$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/oe$$ExternalSyntheticLambda0;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                safedk_oe$$ExternalSyntheticLambda0_onClick_7343bcc695a200103f17be2b68043a9e(view);
            }

            public void safedk_oe$$ExternalSyntheticLambda0_onClick_7343bcc695a200103f17be2b68043a9e(View p0) {
                C4235oe.a(C4235oe.this, p0);
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.oe$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/oe$$ExternalSyntheticLambda1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                safedk_oe$$ExternalSyntheticLambda1_onClick_421a5c623430ac838375dd929f61b1c3(view);
            }

            public void safedk_oe$$ExternalSyntheticLambda1_onClick_421a5c623430ac838375dd929f61b1c3(View p0) {
                C4235oe.b(C4235oe.this, p0);
            }
        });
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        a(this.j, this.k);
        X4.a(this.e, this.b, new W1(0.0f, true));
        this.i = true;
    }

    public static final void b(C4235oe c4235oe, View view) {
        c4235oe.a();
        c4235oe.f.a();
    }

    public final void a(C4303r5 c4303r5, C4303r5 c4303r52) {
        if (Intrinsics.areEqual(c4303r5.getParent(), this.g)) {
            return;
        }
        this.g.removeView(c4303r52);
        S1 audioConfig = this.d.d;
        float f = this.h;
        Intrinsics.checkNotNullParameter(c4303r5, "<this>");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (audioConfig.b * f), (int) (audioConfig.c * f));
        int i = audioConfig.e;
        if (i == 0) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
        } else if (i == 1) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(10, -1);
        } else if (i == 2) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(12, -1);
        } else if (i == 3) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(12, -1);
        }
        C4153lc c4153lc = audioConfig.d;
        layoutParams.leftMargin = (int) (c4153lc.a * f);
        layoutParams.topMargin = (int) (c4153lc.b * f);
        layoutParams.rightMargin = (int) (c4153lc.c * f);
        layoutParams.bottomMargin = (int) (c4153lc.d * f);
        c4303r5.setLayoutParams(layoutParams);
        this.g.addView(c4303r5);
    }
}
