package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes11.dex */
public class zzqj<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzoz<MessageType, BuilderType> {
    protected zzqm zza;
    private final zzqm zzb;

    protected zzqj(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzD()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzr();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzqj clone() {
        zzqj zzqjVar = (zzqj) this.zzb.zzb(5, null, null);
        zzqjVar.zza = zzk();
        return zzqjVar;
    }

    public final MessageType zzi() {
        MessageType zzk = zzk();
        if (zzk.zzo()) {
            return zzk;
        }
        throw new zzso(zzk);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrp
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzD()) {
            return (MessageType) this.zza;
        }
        this.zza.zzx();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final /* bridge */ /* synthetic */ zzrq zzl() {
        throw null;
    }

    protected final void zzm() {
        if (this.zza.zzD()) {
            return;
        }
        zzn();
    }

    protected void zzn() {
        zzqm zzr = this.zzb.zzr();
        zzrx.zza().zzb(zzr.getClass()).zze(zzr, this.zza);
        this.zza = zzr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        boolean zzc;
        zzc = zzqm.zzc(this.zza, false);
        return zzc;
    }
}
