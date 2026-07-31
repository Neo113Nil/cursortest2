package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes6.dex */
final class zzjl implements Callable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjp zzc;

    zzjl(zzjp zzjpVar, zzbh zzbhVar, String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        this.zzc = zzjpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzpv zzpvVar;
        zzpv zzpvVar2;
        zzmc zzmcVar;
        byte[] bArr;
        zzpv zzpvVar3;
        zzqd zzqdVar;
        zzpv zzpvVar4;
        String str;
        zzpv zzpvVar5;
        zzh zzhVar;
        com.google.android.gms.internal.measurement.zzht zzhtVar;
        Bundle bundle;
        String str2;
        zzio zzioVar;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        String str3;
        Object obj;
        zzbd zzc;
        long j;
        zzaw zzj;
        zzjp zzjpVar = this.zzc;
        zzpvVar = zzjpVar.zza;
        zzpvVar.zzL();
        zzpvVar2 = zzjpVar.zza;
        zzmc zzv = zzpvVar2.zzv();
        zzv.zzg();
        zzio zzioVar2 = zzv.zzu;
        zzio.zzP();
        zzbh zzbhVar = this.zza;
        Preconditions.checkNotNull(zzbhVar);
        String str4 = this.zzb;
        Preconditions.checkNotEmpty(str4);
        String str5 = zzbhVar.zza;
        if (!"_iap".equals(str5) && !"_iapx".equals(str5)) {
            zzv.zzu.zzaW().zzd().zzc("Generating a payload for this event is not available. package_name, event_name", str4, str5);
            return null;
        }
        zzpv zzpvVar6 = zzv.zzg;
        com.google.android.gms.internal.measurement.zzht zzb = com.google.android.gms.internal.measurement.zzhv.zzb();
        zzpvVar6.zzj().zzH();
        try {
            zzh zzl = zzpvVar6.zzj().zzl(str4);
            if (zzl == null) {
                zzv.zzu.zzaW().zzd().zzb("Log and bundle not available. package_name", str4);
                bArr = new byte[0];
            } else {
                if (zzl.zzaJ()) {
                    com.google.android.gms.internal.measurement.zzhw zzz = com.google.android.gms.internal.measurement.zzhx.zzz();
                    zzz.zzar(1);
                    zzz.zzan("android");
                    if (!TextUtils.isEmpty(zzl.zzC())) {
                        zzz.zzI(zzl.zzC());
                    }
                    if (!TextUtils.isEmpty(zzl.zzE())) {
                        zzz.zzK((String) Preconditions.checkNotNull(zzl.zzE()));
                    }
                    if (!TextUtils.isEmpty(zzl.zzF())) {
                        zzz.zzL((String) Preconditions.checkNotNull(zzl.zzF()));
                    }
                    if (zzl.zze() != -2147483648L) {
                        zzz.zzM((int) zzl.zze());
                    }
                    zzz.zzai(zzl.zzq());
                    zzz.zzZ(zzl.zzo());
                    String zzH = zzl.zzH();
                    String zzA = zzl.zzA();
                    if (!TextUtils.isEmpty(zzH)) {
                        zzz.zzah(zzH);
                    } else if (!TextUtils.isEmpty(zzA)) {
                        zzz.zzH(zzA);
                    }
                    zzz.zzay(zzl.zzw());
                    zzjx zzu = zzv.zzg.zzu(str4);
                    zzz.zzW(zzl.zzn());
                    if (zzioVar2.zzJ() && zzv.zzu.zzf().zzy(zzz.zzaF()) && zzu.zzr(zzjw.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzz.zzY(null);
                    }
                    zzz.zzT(zzu.zzp());
                    if (zzu.zzr(zzjw.AD_STORAGE) && zzl.zzaI()) {
                        Pair zzd = zzpvVar6.zzw().zzd(zzl.zzC(), zzu);
                        if (zzl.zzaI() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                            try {
                                zzz.zzas(zzmc.zza((String) zzd.first, Long.toString(zzbhVar.zzd)));
                                Object obj2 = zzd.second;
                                if (obj2 != null) {
                                    zzz.zzal(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e) {
                                zzv.zzu.zzaW().zzd().zzb("Resettable device id encryption failed", e.getMessage());
                                bArr = new byte[0];
                                zzpvVar3 = zzv.zzg;
                                zzj = zzpvVar3.zzj();
                                zzj.zzL();
                                return bArr;
                            }
                        }
                    }
                    zzio zzioVar3 = zzv.zzu;
                    zzioVar3.zzg().zzv();
                    zzz.zzX(Build.MODEL);
                    zzioVar3.zzg().zzv();
                    zzz.zzam(Build.VERSION.RELEASE);
                    zzz.zzaz((int) zzioVar3.zzg().zza());
                    zzz.zzaD(zzioVar3.zzg().zzb());
                    try {
                        try {
                            if (zzu.zzr(zzjw.ANALYTICS_STORAGE) && zzl.zzD() != null) {
                                zzz.zzJ(zzmc.zza((String) Preconditions.checkNotNull(zzl.zzD()), Long.toString(zzbhVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzl.zzG())) {
                                zzz.zzag((String) Preconditions.checkNotNull(zzl.zzG()));
                            }
                            String zzC = zzl.zzC();
                            zzpv zzpvVar7 = zzv.zzg;
                            List zzE = zzpvVar7.zzj().zzE(zzC);
                            Iterator it = zzE.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    zzqdVar = null;
                                    break;
                                }
                                zzqdVar = (zzqd) it.next();
                                if ("_lte".equals(zzqdVar.zzc)) {
                                    break;
                                }
                            }
                            if (zzqdVar == null || zzqdVar.zze == null) {
                                zzqd zzqdVar2 = new zzqd(zzC, "auto", "_lte", zzv.zzu.zzaU().currentTimeMillis(), 0L);
                                zzE.add(zzqdVar2);
                                zzpvVar7.zzj().zzai(zzqdVar2);
                            }
                            com.google.android.gms.internal.measurement.zzio[] zzioVarArr = new com.google.android.gms.internal.measurement.zzio[zzE.size()];
                            for (int i = 0; i < zzE.size(); i++) {
                                com.google.android.gms.internal.measurement.zzin zze = com.google.android.gms.internal.measurement.zzio.zze();
                                zze.zzf(((zzqd) zzE.get(i)).zzc);
                                zze.zzg(((zzqd) zzE.get(i)).zzd);
                                zzpvVar7.zzA().zzx(zze, ((zzqd) zzE.get(i)).zze);
                                zzioVarArr[i] = (com.google.android.gms.internal.measurement.zzio) zze.zzba();
                            }
                            zzz.zzm(Arrays.asList(zzioVarArr));
                            zzpvVar4 = zzv.zzg;
                            zzpvVar4.zzQ(zzl, zzz);
                            zzpvVar4.zzaa(zzl, zzz);
                            zzhf zzb2 = zzhf.zzb(zzbhVar);
                            zzio zzioVar4 = zzv.zzu;
                            zzqf zzw = zzioVar4.zzw();
                            Bundle bundle2 = zzb2.zzd;
                            zzw.zzO(bundle2, zzpvVar7.zzj().zzk(str4));
                            zzioVar4.zzw().zzQ(zzb2, zzioVar4.zzf().zzf(str4));
                            try {
                                bundle2.putLong("_c", 1L);
                                zzioVar4.zzaW().zzd().zza("Marking in-app purchase as real-time");
                                bundle2.putLong("_r", 1L);
                                String str6 = zzbhVar.zzc;
                                bundle2.putString("_o", str6);
                                if (zzioVar4.zzw().zzak(zzz.zzaF(), zzl.zzM())) {
                                    zzioVar4.zzw().zzS(bundle2, "_dbg", 1L);
                                    zzioVar4.zzw().zzS(bundle2, "_r", 1L);
                                }
                                zzaw zzj2 = zzpvVar7.zzj();
                                str = zzbhVar.zza;
                                zzbd zzs = zzj2.zzs(str4, str);
                                if (zzs == null) {
                                    bundle = bundle2;
                                    str2 = str6;
                                    zzioVar = zzioVar4;
                                    zzhwVar = zzz;
                                    zzpvVar5 = zzpvVar7;
                                    zzhtVar = zzb;
                                    str3 = str4;
                                    zzhVar = zzl;
                                    obj = null;
                                    zzc = new zzbd(str4, str, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                    j = 0;
                                } else {
                                    zzpvVar5 = zzpvVar7;
                                    zzhVar = zzl;
                                    zzhtVar = zzb;
                                    bundle = bundle2;
                                    str2 = str6;
                                    zzioVar = zzioVar4;
                                    zzhwVar = zzz;
                                    str3 = str4;
                                    obj = null;
                                    long j2 = zzs.zzf;
                                    zzc = zzs.zzc(zzbhVar.zzd);
                                    j = j2;
                                }
                                zzpvVar5.zzj().zzV(zzc);
                            } catch (Throwable th) {
                                th = th;
                                zzmcVar = zzv;
                            }
                        } catch (SecurityException e2) {
                            zzv.zzu.zzaW().zzd().zzb("app instance id encryption failed", e2.getMessage());
                            bArr = new byte[0];
                            zzpvVar3 = zzv.zzg;
                            zzj = zzpvVar3.zzj();
                            zzj.zzL();
                            return bArr;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzmcVar = zzbhVar;
                    }
                    try {
                        zzbc zzbcVar = new zzbc(zzv.zzu, str2, str3, str, zzbhVar.zzd, j, bundle);
                        com.google.android.gms.internal.measurement.zzhl zze2 = com.google.android.gms.internal.measurement.zzhm.zze();
                        zze2.zzm(zzbcVar.zzd);
                        zze2.zzi(zzbcVar.zzb);
                        zze2.zzl(zzbcVar.zze);
                        zzbf zzbfVar = zzbcVar.zzf;
                        zzbe zzbeVar = new zzbe(zzbfVar);
                        while (zzbeVar.hasNext()) {
                            String next = zzbeVar.next();
                            com.google.android.gms.internal.measurement.zzhp zze3 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zze3.zzj(next);
                            Object zzf = zzbfVar.zzf(next);
                            if (zzf != null) {
                                zzpvVar5.zzA().zzw(zze3, zzf);
                                zze2.zze(zze3);
                            }
                        }
                        zzhwVar.zzn(zze2);
                        com.google.android.gms.internal.measurement.zzhy zza = com.google.android.gms.internal.measurement.zzia.zza();
                        com.google.android.gms.internal.measurement.zzhn zza2 = com.google.android.gms.internal.measurement.zzho.zza();
                        zza2.zza(zzc.zzc);
                        zza2.zzb(str);
                        zza.zza(zza2);
                        zzhwVar.zzao(zza);
                        zzhwVar.zzi(zzpvVar5.zzh().zza(zzhVar.zzC(), Collections.emptyList(), zzhwVar.zzaN(), Long.valueOf(zze2.zzc()), Long.valueOf(zze2.zzc()), false));
                        if (zze2.zzq()) {
                            zzhwVar.zzax(zze2.zzc());
                            zzhwVar.zzab(zze2.zzc());
                        }
                        long zzs2 = zzhVar.zzs();
                        if (zzs2 != 0) {
                            zzhwVar.zzap(zzs2);
                        }
                        long zzu2 = zzhVar.zzu();
                        if (zzu2 != 0) {
                            zzhwVar.zzaq(zzu2);
                        } else if (zzs2 != 0) {
                            zzhwVar.zzaq(zzs2);
                        }
                        String zzL = zzhVar.zzL();
                        zzrd.zzb();
                        String str7 = str3;
                        if (zzioVar.zzf().zzx(str7, zzgi.zzaL) && zzL != null) {
                            zzhwVar.zzav(zzL);
                        }
                        zzhVar.zzP();
                        zzhwVar.zzP((int) zzhVar.zzt());
                        zzioVar.zzf().zzj();
                        zzhwVar.zzaB(119002L);
                        zzhwVar.zzaA(zzioVar.zzaU().currentTimeMillis());
                        zzhwVar.zzau(true);
                        zzpvVar4.zzN(zzhwVar.zzaF(), zzhwVar);
                        com.google.android.gms.internal.measurement.zzht zzhtVar2 = zzhtVar;
                        zzhtVar2.zzc(zzhwVar);
                        zzh zzhVar2 = zzhVar;
                        zzhVar2.zzau(zzhwVar.zzf());
                        zzhVar2.zzas(zzhwVar.zze());
                        zzpvVar5.zzj().zzT(zzhVar2, false, false);
                        zzpvVar5.zzj().zzS();
                        zzpvVar5.zzj().zzL();
                        try {
                            return zzpvVar5.zzA().zzB(((com.google.android.gms.internal.measurement.zzhv) zzhtVar2.zzba()).zzcd());
                        } catch (IOException e3) {
                            zzv.zzu.zzaW().zze().zzc("Data loss. Failed to bundle and serialize. appId", zzhe.zzn(str7), e3);
                            return obj;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zzmcVar = zzv;
                        zzmcVar.zzg.zzj().zzL();
                        throw th;
                    }
                }
                zzv.zzu.zzaW().zzd().zzb("Log and bundle disabled. package_name", str4);
                bArr = new byte[0];
            }
            zzj = zzpvVar6.zzj();
            zzj.zzL();
            return bArr;
        } catch (Throwable th4) {
            th = th4;
            zzmcVar = zzv;
            zzmcVar.zzg.zzj().zzL();
            throw th;
        }
    }
}
