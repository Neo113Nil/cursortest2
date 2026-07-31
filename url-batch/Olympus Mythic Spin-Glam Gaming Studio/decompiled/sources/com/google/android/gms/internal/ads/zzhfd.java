package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhfd implements zzhfe {
    private final List zza;
    private final Map zzb;
    private final zzhfd zzc;

    private zzhfd(List list, Map map) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = map;
        if (zzhlv.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                zzhfb zzhfbVar = (zzhfb) it.next();
                if (hashSet.contains(Integer.valueOf(zzhfbVar.zzc()))) {
                    int zzc = zzhfbVar.zzc();
                    StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                    sb.append("KeyID ");
                    sb.append(zzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
                hashSet.add(Integer.valueOf(zzhfbVar.zzc()));
                z |= zzhfbVar.zzd();
            }
            if (!z) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    private zzhfd(List list, Map map, zzhfd zzhfdVar) {
        this.zza = list;
        this.zzb = map;
        this.zzc = zzhfdVar;
    }

    /* synthetic */ zzhfd(List list, Map map, byte[] bArr) {
        this(list, map);
    }

    static final zzhfd zza(zzhuc zzhucVar) throws GeneralSecurityException {
        if (zzhucVar == null || zzhucVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhfd(zzj(zzhucVar), new HashMap());
    }

    public static final zzhfd zzg(zzhfj zzhfjVar) throws GeneralSecurityException {
        zzhey zzheyVar = new zzhey();
        zzhew zzhewVar = new zzhew(zzhfjVar, null);
        zzhewVar.zzb();
        zzhewVar.zza();
        zzheyVar.zza(zzhewVar);
        return zzheyVar.zzb();
    }

    static /* synthetic */ zzhfd zzi(final zzhfd zzhfdVar) {
        final zzhnh zzhnhVar = (zzhnh) zzhfdVar.zzf(zzhnh.class);
        if (zzhnhVar == null) {
            return zzhfdVar;
        }
        zzhez zzhezVar = new zzhez() { // from class: com.google.android.gms.internal.ads.zzhfc
            @Override // com.google.android.gms.internal.ads.zzhez
            public final /* synthetic */ void zza(zzhfb zzhfbVar) {
                zzhnr.zza().zzb().zza(zzhfd.this, zzhnhVar, "keyset_handle", "get_key");
            }
        };
        List<zzhfb> list = zzhfdVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhfb zzhfbVar : list) {
            arrayList.add(new zzhfb(zzhfbVar.zzf(), zzhfbVar.zzj(), zzhfbVar.zzg(), zzhfbVar.zzh(), zzhfbVar.zzi(), zzhezVar, null));
        }
        return new zzhfd(arrayList, zzhfdVar.zzb, zzhfdVar);
    }

    private static List zzj(zzhuc zzhucVar) throws GeneralSecurityException {
        zzhes zzhneVar;
        boolean z;
        zzhez zzhezVar;
        ArrayList arrayList = new ArrayList(zzhucVar.zzc());
        for (zzhub zzhubVar : zzhucVar.zzb()) {
            int zzc = zzhubVar.zzc();
            try {
                zzhos zzl = zzl(zzhubVar);
                zzhnw zza = zzhnw.zza();
                zzhfr zza2 = zzhfr.zza();
                zzhes zzhneVar2 = !zza.zzf(zzl) ? new zzhne(zzl, zza2) : zza.zzg(zzl, zza2);
                z = false;
                zzhneVar = zzhneVar2;
            } catch (GeneralSecurityException e) {
                if (zzhlv.zza.zza()) {
                    throw e;
                }
                zzhneVar = new zzhne(zzl(zzhubVar), zzhfr.zza());
                z = true;
            }
            if (zzhlv.zza.zza() && !zzm(zzhubVar.zzi())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            int zzi = zzhubVar.zzi();
            boolean z2 = zzc == zzhucVar.zza();
            zzhezVar = zzhfb.zza;
            arrayList.add(new zzhfb(zzhneVar, zzi, zzc, z2, z, zzhezVar, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhfd zzk() {
        zzhfd zzhfdVar = this.zzc;
        return zzhfdVar == null ? this : zzhfdVar;
    }

    private static zzhos zzl(zzhub zzhubVar) throws GeneralSecurityException {
        return zzhos.zza(zzhubVar.zzb().zza(), zzhubVar.zzb().zzb(), zzhor.zzc(zzhubVar.zzb().zzi()), zzhor.zzd(zzhubVar.zzj()), zzhubVar.zzj() == 5 ? null : Integer.valueOf(zzhubVar.zzc()));
    }

    private static boolean zzm(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final String toString() {
        zzhuc zzb = zzb();
        int i = zzhfu.zza;
        zzhud zza = zzhug.zza();
        zza.zza(zzb.zza());
        for (zzhub zzhubVar : zzb.zzb()) {
            zzhue zza2 = zzhuf.zza();
            zza2.zza(zzhubVar.zzb().zza());
            zza2.zzc(zzhubVar.zzi());
            zza2.zzd(zzhubVar.zzj());
            zza2.zzb(zzhubVar.zzc());
            zza.zzb((zzhuf) zza2.zzbu());
        }
        return ((zzhug) zza.zzbu()).toString();
    }

    final zzhuc zzb() {
        try {
            zzhtz zzh = zzhuc.zzh();
            for (zzhfb zzhfbVar : this.zza) {
                zzhes zza = zzhfbVar.zza();
                int zzj = zzhfbVar.zzj();
                int zzc = zzhfbVar.zzc();
                zzhos zzhosVar = (zzhos) zzhnw.zza().zzh(zza, zzhos.class, zzhfr.zza());
                Integer zzb = zza.zzb();
                if (zzb != null && zzb.intValue() != zzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhua zzd = zzhub.zzd();
                zzhts zzc2 = zzhtt.zzc();
                zzc2.zza(zzhosVar.zzg());
                zzc2.zzb(zzhosVar.zzb());
                zzc2.zzc(zzhor.zzb(zzhosVar.zzc()));
                zzd.zzb(zzc2);
                zzd.zzd(zzj);
                zzd.zzc(zzc);
                zzd.zze(zzhor.zze(zzhosVar.zzd()));
                zzh.zzb((zzhub) zzd.zzbu());
                if (zzhfbVar.zzd()) {
                    zzh.zza(zzhfbVar.zzc());
                }
            }
            return (zzhuc) zzh.zzbu();
        } catch (GeneralSecurityException e) {
            throw new zzhpc(e);
        }
    }

    public final zzhfb zzc() {
        for (zzhfb zzhfbVar : this.zza) {
            if (zzhfbVar != null && zzhfbVar.zzd()) {
                if (zzhfbVar.zzb() == zzheu.zza) {
                    return zzhfbVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhfe
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhfb zze(int i) {
        if (i < 0 || i >= zzd()) {
            int zzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(zzd).length());
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(" for keyset of size ");
            sb.append(zzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.zza;
        zzhfb zzhfbVar = (zzhfb) list.get(i);
        if (!zzm(zzhfbVar.zzj())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!zzhfbVar.zzi()) {
            return (zzhfb) list.get(i);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhfe
    public final zzhel zzf(Class cls) {
        return (zzhel) this.zzb.get(cls);
    }

    public final Object zzh(zzhep zzhepVar, Class cls) throws GeneralSecurityException {
        zzhuc zzb = zzk().zzb();
        int i = zzhfu.zza;
        int zza = zzb.zza();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzhub zzhubVar : zzb.zzb()) {
            if (zzhubVar.zzi() == 3) {
                if (!zzhubVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhubVar.zzc())));
                }
                if (zzhubVar.zzj() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhubVar.zzc())));
                }
                if (zzhubVar.zzi() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhubVar.zzc())));
                }
                if (zzhubVar.zzc() == zza) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzhubVar.zzb().zzi() == 5;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            List list = this.zza;
            if (((zzhfb) list.get(i3)).zzi() || !zzm(((zzhfb) list.get(i3)).zzj())) {
                String zza2 = zzb.zzd(i3).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 44 + String.valueOf(zza2).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(zza2);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhepVar.zza(zzk(), cls);
    }
}
