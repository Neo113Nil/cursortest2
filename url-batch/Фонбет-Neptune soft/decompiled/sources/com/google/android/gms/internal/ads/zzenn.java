package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import com.neptunesoft.gestionbacdz.QuizContract;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzenn implements zzevo {
    private final zzgcu zza;
    private final zzgcu zzb;
    private final Context zzc;
    private final zzffg zzd;
    private final View zze;

    public zzenn(zzgcu zzgcuVar, zzgcu zzgcuVar2, Context context, zzffg zzffgVar, ViewGroup viewGroup) {
        this.zza = zzgcuVar;
        this.zzb = zzgcuVar2;
        this.zzc = context;
        this.zzd = zzffgVar;
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
            bundle.putString(QuizContract.QuestionTable.COLUMN_TYPE, parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        zzbbw.zza(this.zzc);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkf)).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenn.this.zzc();
            }
        }) : this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenn.this.zzd();
            }
        });
    }

    final /* synthetic */ zzeno zzc() throws Exception {
        return new zzeno(this.zzc, this.zzd.zze, zze());
    }

    final /* synthetic */ zzeno zzd() throws Exception {
        return new zzeno(this.zzc, this.zzd.zze, zze());
    }
}
