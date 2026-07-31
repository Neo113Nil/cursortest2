package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbzc extends NativeAd.Image {
    private final zzbmv zzb;

    @Nullable
    private final Drawable zzc;

    @Nullable
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|3)|(17:5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:23|24)|20|21)|40|6|7|8|9|10|11|12|13|14|15|16|17|18|(0)|20|21) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|2|3|(17:5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:23|24)|20|21)|40|6|7|8|9|10|11|12|13|14|15|16|17|18|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r2);
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0035, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r5);
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0026, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0027, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbzc(zzbmv zzbmvVar) {
        Drawable drawable;
        IObjectWrapper zza;
        this.zzb = zzbmvVar;
        Map map = null;
        try {
            zza = zzbmvVar.zza();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        if (zza != null) {
            drawable = (Drawable) ObjectWrapper.unwrap(zza);
            this.zzc = drawable;
            Uri uri = this.zzb.zzb();
            this.zzd = uri;
            double d = this.zzb.zzc();
            this.zze = d;
            int i = -1;
            int i2 = this.zzb.zzd();
            this.zzf = i2;
            i = this.zzb.zze();
            this.zzg = i;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeX)).booleanValue()) {
                try {
                    map = this.zzb.zzf();
                } catch (RemoteException unused) {
                }
            }
            this.zza = map;
        }
        drawable = null;
        this.zzc = drawable;
        Uri uri2 = this.zzb.zzb();
        this.zzd = uri2;
        double d2 = this.zzb.zzc();
        this.zze = d2;
        int i3 = -1;
        int i22 = this.zzb.zzd();
        this.zzf = i22;
        i3 = this.zzb.zze();
        this.zzg = i3;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeX)).booleanValue()) {
        }
        this.zza = map;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Drawable getDrawable() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Uri getUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zzg;
    }
}
