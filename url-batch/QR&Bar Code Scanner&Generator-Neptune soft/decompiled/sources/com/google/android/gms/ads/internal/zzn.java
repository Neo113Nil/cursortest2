package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzape;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzape zzapeVar;
        zzape zzapeVar2;
        zzs zzsVar = this.zza;
        zzapeVar = zzsVar.zzh;
        if (zzapeVar == null) {
            return false;
        }
        zzapeVar2 = zzsVar.zzh;
        zzapeVar2.zzd(motionEvent);
        return false;
    }
}
