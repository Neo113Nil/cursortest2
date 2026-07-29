package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzenf implements zzetb {
    private final zzfvk zza;
    private final zzfvk zzb;
    private final Context zzc;
    private final zzfby zzd;
    private final View zze;

    public zzenf(zzfvk zzfvkVar, zzfvk zzfvkVar2, Context context, zzfby zzfbyVar, ViewGroup viewGroup) {
        this.zza = zzfvkVar;
        this.zzb = zzfvkVar2;
        this.zzc = context;
        this.zzd = zzfbyVar;
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

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        zzbhy.zzc(this.zzc);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzim)).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzend
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenf.this.zzc();
            }
        }) : this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenf.this.zzd();
            }
        });
    }

    final /* synthetic */ zzeng zzc() throws Exception {
        return new zzeng(this.zzc, this.zzd.zze, zze());
    }

    final /* synthetic */ zzeng zzd() throws Exception {
        return new zzeng(this.zzc, this.zzd.zze, zze());
    }
}
