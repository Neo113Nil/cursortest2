package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzfaq implements zzfdi {
    private final zzhdi zza;

    @Nullable
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzfaq(zzhdi zzhdiVar, @Nullable ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzhdiVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfap
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfaq.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 22;
    }

    final /* synthetic */ zzfar zzc() {
        ViewGroup viewGroup;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgX)).booleanValue() && (viewGroup = this.zzb) != null && this.zzd.contains("banner")) {
            return new zzfar(Boolean.valueOf(viewGroup.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgY)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zzfar(bool);
            }
        }
        return new zzfar(null);
    }
}
