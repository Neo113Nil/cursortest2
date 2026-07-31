package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.utils.Logger;

/* compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* loaded from: classes.dex */
final class zao implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    zao(zap zapVar, zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    public static void safedk_LifecycleFragment_startActivityForResult_7c538ba54b141748a728237c5bc5be87(LifecycleFragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/android/gms/common/api/internal/LifecycleFragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // java.lang.Runnable
    @MainThread
    public final void run() {
        if (this.zaa.zaa) {
            ConnectionResult zab = this.zab.zab();
            if (zab.hasResolution()) {
                zap zapVar = this.zaa;
                safedk_LifecycleFragment_startActivityForResult_7c538ba54b141748a728237c5bc5be87(zapVar.mLifecycleFragment, GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(zab.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            zap zapVar2 = this.zaa;
            if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), zab.getErrorCode(), null) != null) {
                zap zapVar3 = this.zaa;
                zapVar3.zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, zab.getErrorCode(), 2, this.zaa);
                return;
            }
            if (zab.getErrorCode() != 18) {
                this.zaa.zaa(zab, this.zab.zaa());
                return;
            }
            zap zapVar4 = this.zaa;
            Dialog zab2 = zapVar4.zac.zab(zapVar4.getActivity(), zapVar4);
            zap zapVar5 = this.zaa;
            zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new zan(this, zab2));
        }
    }
}
