package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzifg;
import com.google.android.gms.internal.ads.zzifm;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public class zzifg<MessageType extends zzifm<MessageType, BuilderType>, BuilderType extends zzifg<MessageType, BuilderType>> extends zzidq<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzifg(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzihg.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzidq zzbd(zziem zziemVar, zziew zziewVar) throws IOException {
        zzbr(zziemVar, zziewVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzidq zzaZ(byte[] bArr, int i, int i2) throws zzige {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzidq zzaX(byte[] bArr, int i, int i2, zziew zziewVar) throws zzige {
        zzbp(bArr, i, i2, zziewVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzidq
    protected /* bridge */ /* synthetic */ zzidq zzaQ(zzidr zzidrVar) {
        zzbn((zzifm) zzidrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    public /* bridge */ /* synthetic */ zzigv zzaX(byte[] bArr, int i, int i2, zziew zziewVar) throws zzige {
        zzbp(bArr, i, i2, zziewVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    public /* bridge */ /* synthetic */ zzigv zzaZ(byte[] bArr, int i, int i2) throws zzige {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    public /* bridge */ /* synthetic */ zzigv zzbd(zziem zziemVar, zziew zziewVar) throws IOException {
        zzbr(zziemVar, zziewVar);
        return this;
    }

    protected final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    protected void zzbh() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    public final boolean zzbi() {
        boolean zzg;
        zzg = zzifm.zzg(this.zza, false);
        return zzg;
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzcY();
        buildertype.zza = zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzigv
    /* renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType zzbt = zzbt();
        if (zzbt.zzbi()) {
            return zzbt;
        }
        throw zzidq.zzaR(zzbt);
    }

    protected BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i, int i2, zziew zziewVar) throws zzige {
        zzbg();
        try {
            zzihg.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i, i + i2, new zzidw(zziewVar));
            return this;
        } catch (zzige e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i, int i2) throws zzige {
        int i3 = zziew.zzb;
        int i4 = zzidv.zza;
        zzbp(bArr, i, i2, zziew.zza);
        return this;
    }

    public BuilderType zzbr(zziem zziemVar, zziew zziewVar) throws IOException {
        zzbg();
        try {
            zzihg.zza().zzb(this.zza.getClass()).zzg(this.zza, zzien.zza(zziemVar), zziewVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzigv zzbv() {
        zzbj();
        return this;
    }
}
