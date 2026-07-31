package com.google.android.gms.internal.fido;

import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* loaded from: classes5.dex */
public final class zzdj extends zzdr {
    private final boolean zza;

    zzdj(boolean z) {
        this.zza = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzdr zzdrVar = (zzdr) obj;
        if (zzd(MessagePack.Code.NEGFIXINT_PREFIX) != zzdrVar.zza()) {
            return zzd(MessagePack.Code.NEGFIXINT_PREFIX) - zzdrVar.zza();
        }
        return (true != this.zza ? 20 : 21) - (true == ((zzdj) zzdrVar).zza ? 21 : 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zza == ((zzdj) obj).zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzd(MessagePack.Code.NEGFIXINT_PREFIX)), Boolean.valueOf(this.zza)});
    }

    public final String toString() {
        return Boolean.toString(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    protected final int zza() {
        return zzd(MessagePack.Code.NEGFIXINT_PREFIX);
    }
}
