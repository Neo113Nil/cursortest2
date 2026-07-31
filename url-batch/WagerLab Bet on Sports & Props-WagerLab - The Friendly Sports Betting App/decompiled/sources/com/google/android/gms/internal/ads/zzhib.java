package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhib;
import com.google.android.gms.internal.ads.zzhih;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public class zzhib<MessageType extends zzhih<MessageType, BuilderType>, BuilderType extends zzhib<MessageType, BuilderType>> extends zzhgj<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzhib(MessageType messagetype) {
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
        zzhkc.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    /* renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzhgj zzbd(zzhhg zzhhgVar, zzhhr zzhhrVar) throws IOException {
        zzbr(zzhhgVar, zzhhrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    /* renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzhgj zzaZ(byte[] bArr, int i, int i2) throws zzhiw {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    /* renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzhgj zzaX(byte[] bArr, int i, int i2, zzhhr zzhhrVar) throws zzhiw {
        zzbp(bArr, i, i2, zzhhrVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhgj
    protected /* bridge */ /* synthetic */ zzhgj zzaQ(zzhgk zzhgkVar) {
        zzbn((zzhih) zzhgkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    public /* bridge */ /* synthetic */ zzhjr zzaX(byte[] bArr, int i, int i2, zzhhr zzhhrVar) throws zzhiw {
        zzbp(bArr, i, i2, zzhhrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    public /* bridge */ /* synthetic */ zzhjr zzaZ(byte[] bArr, int i, int i2) throws zzhiw {
        zzbq(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    public /* bridge */ /* synthetic */ zzhjr zzbd(zzhhg zzhhgVar, zzhhr zzhhrVar) throws IOException {
        zzbr(zzhhgVar, zzhhrVar);
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

    @Override // com.google.android.gms.internal.ads.zzhjt
    public final boolean zzbi() {
        return zzhih.zzcd(this.zza, false);
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhgj
    /* renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzdd();
        buildertype.zza = zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhjr
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
        throw zzaR(zzbt);
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

    public BuilderType zzbp(byte[] bArr, int i, int i2, zzhhr zzhhrVar) throws zzhiw {
        zzbg();
        try {
            zzhkc.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i, i + i2, new zzhgp(zzhhrVar));
            return this;
        } catch (zzhiw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i, int i2) throws zzhiw {
        int i3 = zzhhr.zzb;
        int i4 = zzhgo.zza;
        zzbp(bArr, i, i2, zzhhr.zza);
        return this;
    }

    public BuilderType zzbr(zzhhg zzhhgVar, zzhhr zzhhrVar) throws IOException {
        zzbg();
        try {
            zzhkc.zza().zzb(this.zza.getClass()).zzg(this.zza, zzhhh.zza(zzhhgVar), zzhhrVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhjt
    /* renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhjr zzbv() {
        zzbj();
        return this;
    }
}
