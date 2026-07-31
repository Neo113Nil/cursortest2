package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfdb {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzga zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbfl zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzco zzl;
    private zzblw zzn;
    private zzeli zzr;
    private Bundle zzt;
    private com.google.android.gms.ads.internal.client.zzcs zzv;
    private int zzm = 1;
    private final zzfcp zzo = new zzfcp();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();

    public final boolean zzA() {
        return this.zzp;
    }

    public final boolean zzB() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzm zzC() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzD() {
        return this.zzb;
    }

    final /* synthetic */ String zzE() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzga zzF() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzG() {
        return this.zze;
    }

    final /* synthetic */ ArrayList zzH() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzI() {
        return this.zzg;
    }

    final /* synthetic */ zzbfl zzJ() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzK() {
        return this.zzi;
    }

    final /* synthetic */ AdManagerAdViewOptions zzL() {
        return this.zzj;
    }

    final /* synthetic */ PublisherAdViewOptions zzM() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzco zzN() {
        return this.zzl;
    }

    final /* synthetic */ int zzO() {
        return this.zzm;
    }

    final /* synthetic */ zzblw zzP() {
        return this.zzn;
    }

    final /* synthetic */ zzfcp zzQ() {
        return this.zzo;
    }

    final /* synthetic */ boolean zzR() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzS() {
        return this.zzq;
    }

    final /* synthetic */ zzeli zzT() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzU() {
        return this.zzs;
    }

    final /* synthetic */ Bundle zzV() {
        return this.zzt;
    }

    final /* synthetic */ AtomicLong zzW() {
        return this.zzu;
    }

    public final zzfdb zzX(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzv = zzcsVar;
        return this;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcs zzY() {
        return this.zzv;
    }

    public final zzfdb zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final zzfdb zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfdb zzd(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfdb zze(boolean z) {
        this.zzq = z;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final zzfdb zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzfdb zzi(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zzd = zzgaVar;
        return this;
    }

    public final zzfcp zzj() {
        return this.zzo;
    }

    public final zzfdb zzk(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfdb zzl(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfdb zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfdb zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfdb zzo(zzbfl zzbflVar) {
        this.zzh = zzbflVar;
        return this;
    }

    public final zzfdb zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfdb zzq(zzblw zzblwVar) {
        this.zzn = zzblwVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzga(false, true, false);
        return this;
    }

    public final zzfdb zzr(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzfdb zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfdb zzt(zzeli zzeliVar) {
        this.zzr = zzeliVar;
        return this;
    }

    public final zzfdb zzu(boolean z) {
        this.zzs = true;
        return this;
    }

    public final zzfdb zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzfdb zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzfdb zzy(zzfdc zzfdcVar) {
        this.zzo.zza(zzfdcVar.zzp.zza);
        this.zza = zzfdcVar.zzd;
        this.zzb = zzfdcVar.zzf;
        this.zzv = zzfdcVar.zzv;
        this.zzc = zzfdcVar.zzg;
        this.zzd = zzfdcVar.zza;
        this.zzf = zzfdcVar.zzh;
        this.zzg = zzfdcVar.zzi;
        this.zzh = zzfdcVar.zzj;
        this.zzi = zzfdcVar.zzk;
        zzs(zzfdcVar.zzm);
        zzr(zzfdcVar.zzn);
        this.zzp = zzfdcVar.zzq;
        this.zzq = zzfdcVar.zzr;
        this.zzr = zzfdcVar.zzc;
        this.zzs = zzfdcVar.zzs;
        this.zzt = zzfdcVar.zzt;
        this.zzu.set(zzfdcVar.zzu.get());
        return this;
    }

    public final zzfdc zzz() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfdc(this, null);
    }
}
