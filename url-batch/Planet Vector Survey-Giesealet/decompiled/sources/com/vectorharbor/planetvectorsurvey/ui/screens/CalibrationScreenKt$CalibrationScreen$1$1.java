package com.vectorharbor.planetvectorsurvey.ui.screens;

import com.vectorharbor.planetvectorsurvey.model.CalibrationState;
import com.vectorharbor.planetvectorsurvey.model.RunPhase;
import com.vectorharbor.planetvectorsurvey.viewmodel.RelayViewModel;
import defpackage.bk;
import defpackage.bt0;
import defpackage.ck;
import defpackage.fj0;
import defpackage.fu0;
import defpackage.g8;
import defpackage.kj;
import defpackage.ky0;
import defpackage.mk;
import defpackage.mu;
import defpackage.nk;
import defpackage.qu;
import defpackage.rg0;
import defpackage.x40;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
@mk(c = "com.vectorharbor.planetvectorsurvey.ui.screens.CalibrationScreenKt$CalibrationScreen$1$1", f = "CalibrationScreen.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CalibrationScreenKt$CalibrationScreen$1$1 extends fu0 implements qu {
    final /* synthetic */ bt0 $latestState$delegate;
    final /* synthetic */ bt0 $state$delegate;
    final /* synthetic */ RelayViewModel $viewModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalibrationScreenKt$CalibrationScreen$1$1(bt0 bt0Var, bt0 bt0Var2, RelayViewModel relayViewModel, kj kjVar) {
        super(2, kjVar);
        this.$state$delegate = bt0Var;
        this.$latestState$delegate = bt0Var2;
        this.$viewModel = relayViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky0 invokeSuspend$lambda$0(fj0 fj0Var, RelayViewModel relayViewModel, long j) {
        if (fj0Var.d != 0) {
            relayViewModel.tick((j - r0) / 1.0E9f);
        }
        fj0Var.d = j;
        return ky0.a;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        return new CalibrationScreenKt$CalibrationScreen$1$1(this.$state$delegate, this.$latestState$delegate, this.$viewModel, kjVar);
    }

    @Override // defpackage.qu
    public final Object invoke(bk bkVar, kj kjVar) {
        return ((CalibrationScreenKt$CalibrationScreen$1$1) create(bkVar, kjVar)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        CalibrationState CalibrationScreen$lambda$0;
        final fj0 fj0Var;
        CalibrationState CalibrationScreen$lambda$1;
        int i = this.label;
        if (i == 0) {
            rg0.u(obj);
            CalibrationScreen$lambda$0 = CalibrationScreenKt.CalibrationScreen$lambda$0(this.$state$delegate);
            if (CalibrationScreen$lambda$0.getPhase() == RunPhase.Running) {
                fj0Var = new fj0();
            }
            return ky0.a;
        }
        if (i != 1) {
            g8.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fj0Var = (fj0) this.L$0;
        rg0.u(obj);
        while (nk.B(getContext())) {
            CalibrationScreen$lambda$1 = CalibrationScreenKt.CalibrationScreen$lambda$1(this.$latestState$delegate);
            if (CalibrationScreen$lambda$1.getPhase() != RunPhase.Running) {
                break;
            }
            final RelayViewModel relayViewModel = this.$viewModel;
            mu muVar = new mu() { // from class: com.vectorharbor.planetvectorsurvey.ui.screens.a
                @Override // defpackage.mu
                public final Object c(Object obj2) {
                    ky0 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = CalibrationScreenKt$CalibrationScreen$1$1.invokeSuspend$lambda$0(fj0.this, relayViewModel, ((Long) obj2).longValue());
                    return invokeSuspend$lambda$0;
                }
            };
            this.L$0 = fj0Var;
            this.label = 1;
            Object e = x40.D(getContext()).e(muVar, this);
            ck ckVar = ck.d;
            if (e == ckVar) {
                return ckVar;
            }
        }
        return ky0.a;
    }
}
