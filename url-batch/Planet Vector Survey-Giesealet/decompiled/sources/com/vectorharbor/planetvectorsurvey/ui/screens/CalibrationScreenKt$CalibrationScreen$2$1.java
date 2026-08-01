package com.vectorharbor.planetvectorsurvey.ui.screens;

import com.vectorharbor.planetvectorsurvey.model.CalibrationState;
import com.vectorharbor.planetvectorsurvey.model.RunPhase;
import defpackage.bk;
import defpackage.bt0;
import defpackage.bu;
import defpackage.fu0;
import defpackage.g8;
import defpackage.kj;
import defpackage.ky0;
import defpackage.mk;
import defpackage.qu;
import defpackage.rg0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
@mk(c = "com.vectorharbor.planetvectorsurvey.ui.screens.CalibrationScreenKt$CalibrationScreen$2$1", f = "CalibrationScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CalibrationScreenKt$CalibrationScreen$2$1 extends fu0 implements qu {
    final /* synthetic */ bu $onDebrief;
    final /* synthetic */ bt0 $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalibrationScreenKt$CalibrationScreen$2$1(bu buVar, bt0 bt0Var, kj kjVar) {
        super(2, kjVar);
        this.$onDebrief = buVar;
        this.$state$delegate = bt0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        return new CalibrationScreenKt$CalibrationScreen$2$1(this.$onDebrief, this.$state$delegate, kjVar);
    }

    @Override // defpackage.qu
    public final Object invoke(bk bkVar, kj kjVar) {
        return ((CalibrationScreenKt$CalibrationScreen$2$1) create(bkVar, kjVar)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        CalibrationState CalibrationScreen$lambda$0;
        if (this.label != 0) {
            g8.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rg0.u(obj);
        CalibrationScreen$lambda$0 = CalibrationScreenKt.CalibrationScreen$lambda$0(this.$state$delegate);
        if (CalibrationScreen$lambda$0.getPhase() == RunPhase.Complete) {
            this.$onDebrief.a();
        }
        return ky0.a;
    }
}
