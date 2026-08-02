package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfed {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzff zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbls zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzbz zzl;
    private zzbsc zzn;
    private zzeof zzq;
    private com.google.android.gms.ads.internal.client.zzcd zzs;
    private int zzm = 1;
    private final zzfdq zzo = new zzfdq();
    private boolean zzp = false;
    private boolean zzr = false;

    public final zzfed zzA(zzbls zzblsVar) {
        this.zzh = zzblsVar;
        return this;
    }

    public final zzfed zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfed zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfed zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfed zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfed zzF(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        this.zzd = zzffVar;
        return this;
    }

    public final zzfef zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfef(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfed zzQ(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        this.zzs = zzcdVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzfdq zzo() {
        return this.zzo;
    }

    public final zzfed zzp(zzfef zzfefVar) {
        this.zzo.zza(zzfefVar.zzo.zza);
        this.zza = zzfefVar.zzd;
        this.zzb = zzfefVar.zze;
        this.zzs = zzfefVar.zzr;
        this.zzc = zzfefVar.zzf;
        this.zzd = zzfefVar.zza;
        this.zzf = zzfefVar.zzg;
        this.zzg = zzfefVar.zzh;
        this.zzh = zzfefVar.zzi;
        this.zzi = zzfefVar.zzj;
        zzq(zzfefVar.zzl);
        zzD(zzfefVar.zzm);
        this.zzp = zzfefVar.zzp;
        this.zzq = zzfefVar.zzc;
        this.zzr = zzfefVar.zzq;
        return this;
    }

    public final zzfed zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfed zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfed zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfed zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfed zzu(zzeof zzeofVar) {
        this.zzq = zzeofVar;
        return this;
    }

    public final zzfed zzv(zzbsc zzbscVar) {
        this.zzn = zzbscVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzff(false, true, false);
        return this;
    }

    public final zzfed zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfed zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfed zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfed zzz(int i) {
        this.zzm = i;
        return this;
    }
}
