package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfef {
    public final com.google.android.gms.ads.internal.client.zzff zza;
    public final zzbsc zzb;
    public final zzeof zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbls zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzbz zzn;
    public final zzfds zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcd zzr;

    /* synthetic */ zzfef(zzfed zzfedVar, zzfee zzfeeVar) {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        String str;
        com.google.android.gms.ads.internal.client.zzcd zzcdVar;
        com.google.android.gms.ads.internal.client.zzl zzlVar;
        com.google.android.gms.ads.internal.client.zzl zzlVar2;
        com.google.android.gms.ads.internal.client.zzl zzlVar3;
        com.google.android.gms.ads.internal.client.zzl zzlVar4;
        com.google.android.gms.ads.internal.client.zzl zzlVar5;
        com.google.android.gms.ads.internal.client.zzl zzlVar6;
        com.google.android.gms.ads.internal.client.zzl zzlVar7;
        com.google.android.gms.ads.internal.client.zzl zzlVar8;
        com.google.android.gms.ads.internal.client.zzl zzlVar9;
        com.google.android.gms.ads.internal.client.zzl zzlVar10;
        com.google.android.gms.ads.internal.client.zzl zzlVar11;
        com.google.android.gms.ads.internal.client.zzl zzlVar12;
        com.google.android.gms.ads.internal.client.zzl zzlVar13;
        com.google.android.gms.ads.internal.client.zzl zzlVar14;
        com.google.android.gms.ads.internal.client.zzl zzlVar15;
        com.google.android.gms.ads.internal.client.zzl zzlVar16;
        com.google.android.gms.ads.internal.client.zzl zzlVar17;
        com.google.android.gms.ads.internal.client.zzl zzlVar18;
        com.google.android.gms.ads.internal.client.zzl zzlVar19;
        com.google.android.gms.ads.internal.client.zzl zzlVar20;
        com.google.android.gms.ads.internal.client.zzl zzlVar21;
        com.google.android.gms.ads.internal.client.zzl zzlVar22;
        com.google.android.gms.ads.internal.client.zzl zzlVar23;
        com.google.android.gms.ads.internal.client.zzl zzlVar24;
        com.google.android.gms.ads.internal.client.zzff zzffVar;
        zzbls zzblsVar;
        com.google.android.gms.ads.internal.client.zzff zzffVar2;
        zzbls zzblsVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zzbls zzblsVar3;
        zzbls zzblsVar4;
        com.google.android.gms.ads.internal.client.zzw zzwVar;
        int i;
        AdManagerAdViewOptions adManagerAdViewOptions;
        PublisherAdViewOptions publisherAdViewOptions;
        com.google.android.gms.ads.internal.client.zzbz zzbzVar;
        zzbsc zzbscVar;
        zzfdq zzfdqVar;
        boolean z;
        zzeof zzeofVar;
        boolean z2;
        boolean z3;
        zzqVar = zzfedVar.zzb;
        this.zze = zzqVar;
        str = zzfedVar.zzc;
        this.zzf = str;
        zzcdVar = zzfedVar.zzs;
        this.zzr = zzcdVar;
        zzlVar = zzfedVar.zza;
        int i2 = zzlVar.zza;
        zzlVar2 = zzfedVar.zza;
        long j = zzlVar2.zzb;
        zzlVar3 = zzfedVar.zza;
        Bundle bundle = zzlVar3.zzc;
        zzlVar4 = zzfedVar.zza;
        int i3 = zzlVar4.zzd;
        zzlVar5 = zzfedVar.zza;
        List list = zzlVar5.zze;
        zzlVar6 = zzfedVar.zza;
        boolean z4 = zzlVar6.zzf;
        zzlVar7 = zzfedVar.zza;
        int i4 = zzlVar7.zzg;
        zzlVar8 = zzfedVar.zza;
        boolean z5 = true;
        if (!zzlVar8.zzh) {
            z3 = zzfedVar.zze;
            if (!z3) {
                z5 = false;
            }
        }
        zzlVar9 = zzfedVar.zza;
        String str2 = zzlVar9.zzi;
        zzlVar10 = zzfedVar.zza;
        com.google.android.gms.ads.internal.client.zzfb zzfbVar = zzlVar10.zzj;
        zzlVar11 = zzfedVar.zza;
        Location location = zzlVar11.zzk;
        zzlVar12 = zzfedVar.zza;
        String str3 = zzlVar12.zzl;
        zzlVar13 = zzfedVar.zza;
        Bundle bundle2 = zzlVar13.zzm;
        zzlVar14 = zzfedVar.zza;
        Bundle bundle3 = zzlVar14.zzn;
        zzlVar15 = zzfedVar.zza;
        List list2 = zzlVar15.zzo;
        zzlVar16 = zzfedVar.zza;
        String str4 = zzlVar16.zzp;
        zzlVar17 = zzfedVar.zza;
        String str5 = zzlVar17.zzq;
        zzlVar18 = zzfedVar.zza;
        boolean z6 = zzlVar18.zzr;
        zzlVar19 = zzfedVar.zza;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar19.zzs;
        zzlVar20 = zzfedVar.zza;
        int i5 = zzlVar20.zzt;
        zzlVar21 = zzfedVar.zza;
        String str6 = zzlVar21.zzu;
        zzlVar22 = zzfedVar.zza;
        List list3 = zzlVar22.zzv;
        zzlVar23 = zzfedVar.zza;
        int zza = com.google.android.gms.ads.internal.util.zzs.zza(zzlVar23.zzw);
        zzlVar24 = zzfedVar.zza;
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i2, j, bundle, i3, list, z4, i4, z5, str2, zzfbVar, location, str3, bundle2, bundle3, list2, str4, str5, z6, zzcVar, i5, str6, list3, zza, zzlVar24.zzx);
        zzffVar = zzfedVar.zzd;
        if (zzffVar != null) {
            zzffVar2 = zzfedVar.zzd;
        } else {
            zzblsVar = zzfedVar.zzh;
            if (zzblsVar != null) {
                zzblsVar2 = zzfedVar.zzh;
                zzffVar2 = zzblsVar2.zzf;
            } else {
                zzffVar2 = null;
            }
        }
        this.zza = zzffVar2;
        arrayList = zzfedVar.zzf;
        this.zzg = arrayList;
        arrayList2 = zzfedVar.zzg;
        this.zzh = arrayList2;
        arrayList3 = zzfedVar.zzf;
        if (arrayList3 == null) {
            zzblsVar4 = null;
        } else {
            zzblsVar3 = zzfedVar.zzh;
            zzblsVar4 = zzblsVar3 == null ? new zzbls(new NativeAdOptions.Builder().build()) : zzfedVar.zzh;
        }
        this.zzi = zzblsVar4;
        zzwVar = zzfedVar.zzi;
        this.zzj = zzwVar;
        i = zzfedVar.zzm;
        this.zzk = i;
        adManagerAdViewOptions = zzfedVar.zzj;
        this.zzl = adManagerAdViewOptions;
        publisherAdViewOptions = zzfedVar.zzk;
        this.zzm = publisherAdViewOptions;
        zzbzVar = zzfedVar.zzl;
        this.zzn = zzbzVar;
        zzbscVar = zzfedVar.zzn;
        this.zzb = zzbscVar;
        zzfdqVar = zzfedVar.zzo;
        this.zzo = new zzfds(zzfdqVar, null);
        z = zzfedVar.zzp;
        this.zzp = z;
        zzeofVar = zzfedVar.zzq;
        this.zzc = zzeofVar;
        z2 = zzfedVar.zzr;
        this.zzq = z2;
    }

    public final zzbnv zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }
}
