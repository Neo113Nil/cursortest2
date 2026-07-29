package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public class zzaw {
    public final Uri zza;
    public final List zze;
    public final zzfrh zzg;

    @Deprecated
    public final List zzh;
    public final Object zzi;
    public final String zzb = null;
    public final zzaq zzc = null;
    public final zzag zzd = null;
    public final String zzf = null;

    /* synthetic */ zzaw(Uri uri, String str, zzaq zzaqVar, zzag zzagVar, List list, String str2, zzfrh zzfrhVar, Object obj, zzav zzavVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = zzfrhVar;
        zzfre zzi = zzfrh.zzi();
        if (zzfrhVar.size() > 0) {
            throw null;
        }
        this.zzh = zzi.zzg();
        this.zzi = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzawVar = (zzaw) obj;
        if (this.zza.equals(zzawVar.zza)) {
            String str = zzawVar.zzb;
            if (zzeg.zzS(null, null)) {
                zzaq zzaqVar = zzawVar.zzc;
                if (zzeg.zzS(null, null)) {
                    zzag zzagVar = zzawVar.zzd;
                    if (zzeg.zzS(null, null) && this.zze.equals(zzawVar.zze)) {
                        String str2 = zzawVar.zzf;
                        if (zzeg.zzS(null, null) && this.zzg.equals(zzawVar.zzg)) {
                            Object obj2 = zzawVar.zzi;
                            if (zzeg.zzS(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31;
    }
}
