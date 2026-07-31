package com.ogury.ad.internal;

import android.net.Uri;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ti implements v4 {
    public final /* synthetic */ ui a;

    public ti(ui uiVar) {
        this.a = uiVar;
    }

    public final void a(b ad, String errorMessage, boolean z) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (!z) {
            ui uiVar = this.a;
            lb lbVar = lb.c;
            uiVar.h.removeCallbacksAndMessages(null);
            uiVar.g = true;
            l0 l0Var = uiVar.l;
            if (l0Var != null) {
                kb.a(l0Var, ad, lbVar, errorMessage, 28);
                return;
            }
            return;
        }
        ui uiVar2 = this.a;
        String str = uiVar2.m + " -- " + errorMessage;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        uiVar2.m = str;
    }

    public final void a(b ad, boolean z, Uri failingUri) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(failingUri, "failingUri");
        Logger logger = Logger.INSTANCE;
        LogTag logTag = LogTag.INTERNAL;
        SourceTag sourceTag = SourceTag.ADS;
        logger.w(logTag, sourceTag, "onRenderProcessGone ------> " + ad.K + " " + ad.L);
        if (ad.K == ad.L) {
            logger.w(logTag, sourceTag, "Ad reload attempts exceeded ------> removing timeout handler");
        }
        this.a.h.removeCallbacksAndMessages(null);
        ui uiVar = this.a;
        uiVar.g = true;
        l0 l0Var = uiVar.l;
        if (l0Var != null) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            Intrinsics.checkNotNullParameter(failingUri, "failingUri");
            o0 o0Var = l0Var.a;
            if (o0Var.o) {
                o0Var.a(ad, z, failingUri);
            } else {
                o0Var.a(ad, z, failingUri, false);
            }
        }
    }
}
