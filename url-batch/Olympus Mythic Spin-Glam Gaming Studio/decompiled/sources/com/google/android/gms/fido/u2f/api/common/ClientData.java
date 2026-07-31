package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@Deprecated
/* loaded from: classes3.dex */
public class ClientData {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final ChannelIdValue zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class Builder implements Cloneable {
        private String zza;
        private String zzb;
        private String zzc;
        private ChannelIdValue zzd;

        Builder() {
            this.zzd = ChannelIdValue.ABSENT;
        }

        Builder(String str, String str2, String str3, ChannelIdValue channelIdValue) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = channelIdValue;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder m3695clone() {
            return new Builder(this.zza, this.zzb, this.zzc, this.zzd);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientData)) {
            return false;
        }
        ClientData clientData = (ClientData) obj;
        return this.zza.equals(clientData.zza) && this.zzb.equals(clientData.zzb) && this.zzc.equals(clientData.zzc) && this.zzd.equals(clientData.zzd);
    }

    public int hashCode() {
        return ((((((this.zza.hashCode() + 31) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd.hashCode();
    }
}
