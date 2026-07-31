package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes11.dex */
public final class d extends AnimatorListenerAdapter {
    public final /* synthetic */ FyberAdIdentifierLocal a;

    public d(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.a = fyberAdIdentifierLocal;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.a;
        fyberAdIdentifierLocal.p = null;
        fyberAdIdentifierLocal.o = !fyberAdIdentifierLocal.o;
    }
}
