package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgre;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzgra<MessageType extends zzgre<MessageType, BuilderType>, BuilderType extends zzgra<MessageType, BuilderType>> extends zzgpe<MessageType, BuilderType> {
    protected zzgre zza;
    protected boolean zzb = false;
    private final zzgre zzc;

    protected zzgra(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzgre) messagetype.zzb(4, null, null);
    }

    private static final void zza(zzgre zzgreVar, zzgre zzgreVar2) {
        zzgsw.zza().zzb(zzgreVar.getClass()).zzg(zzgreVar, zzgreVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    protected final /* synthetic */ zzgpe zzah(zzgpf zzgpfVar) {
        zzak((zzgre) zzgpfVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzgra zzag() {
        zzgra zzgraVar = (zzgra) this.zzc.zzb(5, null, null);
        zzgraVar.zzak(zzao());
        return zzgraVar;
    }

    public final zzgra zzak(zzgre zzgreVar) {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        zza(this.zza, zzgreVar);
        return this;
    }

    public final zzgra zzal(byte[] bArr, int i, int i2, zzgqq zzgqqVar) throws zzgrq {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        try {
            zzgsw.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgpi(zzgqqVar));
            return this;
        } catch (zzgrq e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgrq.zzj();
        }
    }

    public final MessageType zzam() {
        MessageType zzao = zzao();
        if (zzao.zzaS()) {
            return zzao;
        }
        throw new zzgtx(zzao);
    }

    @Override // com.google.android.gms.internal.ads.zzgsn
    /* renamed from: zzan, reason: merged with bridge method [inline-methods] */
    public MessageType zzao() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzgre zzgreVar = this.zza;
        zzgsw.zza().zzb(zzgreVar.getClass()).zzf(zzgreVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    protected void zzaq() {
        zzgre zzgreVar = (zzgre) this.zza.zzb(4, null, null);
        zza(zzgreVar, this.zza);
        this.zza = zzgreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsp
    public final /* synthetic */ zzgso zzbh() {
        return this.zzc;
    }
}
