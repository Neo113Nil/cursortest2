package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzepi implements zzeve {
    private final zzfzq zza;
    private final zzfzq zzb;
    private final Context zzc;
    private final zzfef zzd;
    private final View zze;

    public zzepi(zzfzq zzfzqVar, zzfzq zzfzqVar2, Context context, zzfef zzfefVar, ViewGroup viewGroup) {
        this.zza = zzfzqVar;
        this.zzb = zzfzqVar2;
        this.zzc = context;
        this.zzd = zzfefVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        zzbjc.zzc(this.zzc);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziF)).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepi.this.zzc();
            }
        }) : this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeph
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepi.this.zzd();
            }
        });
    }

    final /* synthetic */ zzepj zzc() throws Exception {
        return new zzepj(this.zzc, this.zzd.zze, zze());
    }

    final /* synthetic */ zzepj zzd() throws Exception {
        return new zzepj(this.zzc, this.zzd.zze, zze());
    }
}
