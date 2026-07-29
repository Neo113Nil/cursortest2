package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaoc;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzaoc zzaocVar;
        zzaoc zzaocVar2;
        zzs zzsVar = this.zza;
        zzaocVar = zzsVar.zzh;
        if (zzaocVar == null) {
            return false;
        }
        zzaocVar2 = zzsVar.zzh;
        zzaocVar2.zzd(motionEvent);
        return false;
    }
}
