package com.vectorharbor.planetvectorsurvey.ui.screens;

import defpackage.bk;
import defpackage.bu;
import defpackage.ck;
import defpackage.fu0;
import defpackage.g8;
import defpackage.kj;
import defpackage.ky0;
import defpackage.mk;
import defpackage.mz;
import defpackage.qu;
import defpackage.rg0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
@mk(c = "com.vectorharbor.planetvectorsurvey.ui.screens.LoadingScreenKt$LoadingScreen$1$1", f = "LoadingScreen.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LoadingScreenKt$LoadingScreen$1$1 extends fu0 implements qu {
    final /* synthetic */ bu $onDone;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingScreenKt$LoadingScreen$1$1(bu buVar, kj kjVar) {
        super(2, kjVar);
        this.$onDone = buVar;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        return new LoadingScreenKt$LoadingScreen$1$1(this.$onDone, kjVar);
    }

    @Override // defpackage.qu
    public final Object invoke(bk bkVar, kj kjVar) {
        return ((LoadingScreenKt$LoadingScreen$1$1) create(bkVar, kjVar)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            rg0.u(obj);
            this.label = 1;
            Object B = mz.B(1500L, this);
            ck ckVar = ck.d;
            if (B == ckVar) {
                return ckVar;
            }
        } else {
            if (i != 1) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rg0.u(obj);
        }
        this.$onDone.a();
        return ky0.a;
    }
}
