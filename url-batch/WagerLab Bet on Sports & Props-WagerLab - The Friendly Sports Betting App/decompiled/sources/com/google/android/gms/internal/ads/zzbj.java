package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public class zzbj {
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzgjz zzi;
    private zzgjz zzj;
    private zzgjz zzk;
    private zzgjz zzl;
    private zzgjz zzm;
    private int zzn;
    private int zzo;
    private zzgjz zzp;
    private zzbi zzq;
    private zzgjz zzr;
    private boolean zzs;
    private zzgjz zzt;
    private HashMap zzu;
    private HashSet zzv;

    public zzbj() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = true;
        this.zzi = zzgjz.zzi();
        this.zzj = zzgjz.zzi();
        this.zzk = zzgjz.zzi();
        this.zzl = zzgjz.zzi();
        this.zzm = zzgjz.zzi();
        this.zzn = Integer.MAX_VALUE;
        this.zzo = Integer.MAX_VALUE;
        this.zzp = zzgjz.zzi();
        this.zzq = zzbi.zza;
        this.zzr = zzgjz.zzi();
        this.zzs = true;
        this.zzt = zzgjz.zzi();
        this.zzu = new HashMap();
        this.zzv = new HashSet();
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes", "preferredVideoLabels", "preferredAudioLabels", "preferredTextLabels"})
    private final void zzx(zzbk zzbkVar) {
        this.zza = zzbkVar.zza;
        this.zzb = zzbkVar.zzb;
        this.zzc = zzbkVar.zzc;
        this.zzd = zzbkVar.zzd;
        int i = zzbkVar.zze;
        int i2 = zzbkVar.zzf;
        int i3 = zzbkVar.zzg;
        int i4 = zzbkVar.zzh;
        this.zze = zzbkVar.zzi;
        this.zzf = zzbkVar.zzj;
        this.zzg = zzbkVar.zzk;
        this.zzh = zzbkVar.zzl;
        this.zzj = zzbkVar.zzn;
        this.zzi = zzbkVar.zzm;
        this.zzk = zzbkVar.zzo;
        int i5 = zzbkVar.zzp;
        this.zzl = zzbkVar.zzq;
        int i6 = zzbkVar.zzs;
        this.zzm = zzbkVar.zzr;
        this.zzn = zzbkVar.zzt;
        this.zzo = zzbkVar.zzu;
        this.zzp = zzbkVar.zzv;
        this.zzq = zzbkVar.zzw;
        boolean z = zzbkVar.zzx;
        this.zzr = zzbkVar.zzy;
        int i7 = zzbkVar.zzA;
        this.zzs = zzbkVar.zzB;
        this.zzt = zzbkVar.zzz;
        int i8 = zzbkVar.zzC;
        boolean z2 = zzbkVar.zzD;
        boolean z3 = zzbkVar.zzE;
        boolean z4 = zzbkVar.zzF;
        boolean z5 = zzbkVar.zzG;
        this.zzv = new HashSet(zzbkVar.zzI);
        this.zzu = new HashMap(zzbkVar.zzH);
    }

    protected final zzbj zza(zzbk zzbkVar) {
        zzx(zzbkVar);
        return this;
    }

    final /* synthetic */ int zzb() {
        return this.zza;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ int zzd() {
        return this.zzc;
    }

    final /* synthetic */ int zze() {
        return this.zzd;
    }

    final /* synthetic */ int zzf() {
        return this.zze;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzg;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzh;
    }

    final /* synthetic */ zzgjz zzj() {
        return this.zzi;
    }

    final /* synthetic */ zzgjz zzk() {
        return this.zzj;
    }

    final /* synthetic */ zzgjz zzl() {
        return this.zzk;
    }

    final /* synthetic */ zzgjz zzm() {
        return this.zzl;
    }

    final /* synthetic */ zzgjz zzn() {
        return this.zzm;
    }

    final /* synthetic */ int zzo() {
        return this.zzn;
    }

    final /* synthetic */ int zzp() {
        return this.zzo;
    }

    final /* synthetic */ zzgjz zzq() {
        return this.zzp;
    }

    final /* synthetic */ zzbi zzr() {
        return this.zzq;
    }

    final /* synthetic */ zzgjz zzs() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzs;
    }

    final /* synthetic */ zzgjz zzu() {
        return this.zzt;
    }

    final /* synthetic */ HashMap zzv() {
        return this.zzu;
    }

    final /* synthetic */ HashSet zzw() {
        return this.zzv;
    }

    protected zzbj(zzbk zzbkVar) {
        zzx(zzbkVar);
    }
}
