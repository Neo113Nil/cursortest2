package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.3.0 */
/* loaded from: classes5.dex */
final class zzfq implements zzge {
    private final zzfm zza;
    private final zzgs zzb;
    private final boolean zzc;
    private final zzdt zzd;

    private zzfq(zzgs zzgsVar, zzdt zzdtVar, zzfm zzfmVar) {
        this.zzb = zzgsVar;
        this.zzc = zzfmVar instanceof zzed;
        this.zzd = zzdtVar;
        this.zza = zzfmVar;
    }

    static zzfq zzc(zzgs zzgsVar, zzdt zzdtVar, zzfm zzfmVar) {
        return new zzfq(zzgsVar, zzdtVar, zzfmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(Object obj) {
        int zzb = ((zzeh) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzed) obj).zzb.zzb() : zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int hashCode = ((zzeh) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzed) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        zzfm zzfmVar = this.zza;
        return zzfmVar instanceof zzeh ? ((zzeh) zzfmVar).zzK() : zzfmVar.zzZ().zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzgg.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgg.zzo(this.zzd, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[EDGE_INSN: B:24:0x00be->B:25:0x00be BREAK  A[LOOP:1: B:10:0x0067->B:18:0x0067], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzcu zzcuVar) throws IOException {
        int i3;
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar == zzgt.zzc()) {
            zzgtVar = zzgt.zzf();
            zzehVar.zzc = zzgtVar;
        }
        zzgt zzgtVar2 = zzgtVar;
        zzdx zzc = ((zzed) obj).zzc();
        zzef zzefVar = null;
        while (i < i2) {
            int zzj = zzcv.zzj(bArr, i, zzcuVar);
            int i4 = zzcuVar.zza;
            if (i4 == 11) {
                int i5 = i2;
                zzcu zzcuVar2 = zzcuVar;
                int i6 = 0;
                zzdf zzdfVar = null;
                while (true) {
                    if (zzj >= i5) {
                        i3 = zzj;
                        break;
                    }
                    i3 = zzcv.zzj(bArr, zzj, zzcuVar2);
                    int i7 = zzcuVar2.zza;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (zzefVar != null) {
                                zzj = zzcv.zze(zzfu.zza().zzb(zzefVar.zza.getClass()), bArr, i3, i5, zzcuVar2);
                                zzc.zzi(zzefVar.zzb, zzcuVar2.zzc);
                            } else if (i9 == 2) {
                                zzj = zzcv.zza(bArr, i3, zzcuVar2);
                                zzdfVar = (zzdf) zzcuVar2.zzc;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            zzj = zzcv.zzp(i7, bArr, i3, i5, zzcuVar2);
                        }
                    } else if (i9 == 0) {
                        zzj = zzcv.zzj(bArr, i3, zzcuVar2);
                        i6 = zzcuVar2.zza;
                        zzefVar = zzcuVar2.zzd.zzb(this.zza, i6);
                    } else if (i7 != 12) {
                    }
                }
                if (zzdfVar != null) {
                    zzgtVar2.zzj((i6 << 3) | 2, zzdfVar);
                }
                i = i3;
                i2 = i5;
                zzcuVar = zzcuVar2;
            } else if ((i4 & 7) == 2) {
                zzefVar = zzcuVar.zzd.zzb(this.zza, i4 >>> 3);
                if (zzefVar != null) {
                    i = zzcv.zze(zzfu.zza().zzb(zzefVar.zza.getClass()), bArr, zzj, i2, zzcuVar);
                    zzc.zzi(zzefVar.zzb, zzcuVar.zzc);
                } else {
                    i = zzcv.zzi(i4, bArr, zzj, i2, zzgtVar2, zzcuVar);
                }
            } else {
                i = zzcv.zzp(i4, bArr, zzj, i2, zzcuVar);
            }
        }
        if (i != i2) {
            throw new zzer("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzi(Object obj, zzhh zzhhVar) throws IOException {
        Iterator zzf = ((zzed) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzdw zzdwVar = (zzdw) entry.getKey();
            if (zzdwVar.zze() != zzhg.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzdwVar.zzg();
            zzdwVar.zzf();
            if (entry instanceof zzeu) {
                zzhhVar.zzw(zzdwVar.zza(), ((zzeu) entry).zza().zzb());
            } else {
                zzhhVar.zzw(zzdwVar.zza(), entry.getValue());
            }
        }
        ((zzeh) obj).zzc.zzk(zzhhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        return ((zzed) obj).zzb.zzk();
    }
}
