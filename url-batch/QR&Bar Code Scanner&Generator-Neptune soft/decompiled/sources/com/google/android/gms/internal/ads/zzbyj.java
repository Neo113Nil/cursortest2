package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbyj extends NativeAd.Image {
    private final zzbme zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:2|3)|(4:(13:5|6|7|8|9|10|11|12|13|14|16|17|18)|16|17|18)|33|6|7|8|9|10|11|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        com.google.android.gms.internal.ads.zzcgp.zzh("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        com.google.android.gms.internal.ads.zzcgp.zzh("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0023, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0024, code lost:
    
        com.google.android.gms.internal.ads.zzcgp.zzh("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbyj(zzbme zzbmeVar) {
        Drawable drawable;
        IObjectWrapper zzf;
        this.zza = zzbmeVar;
        Uri uri = null;
        try {
            zzf = zzbmeVar.zzf();
        } catch (RemoteException e) {
            zzcgp.zzh("", e);
        }
        try {
            if (zzf != null) {
                drawable = (Drawable) ObjectWrapper.unwrap(zzf);
                this.zzb = drawable;
                uri = this.zza.zze();
                this.zzc = uri;
                double d = this.zza.zzb();
                this.zzd = d;
                this.zza.zzd();
                this.zza.zzc();
                return;
            }
            this.zza.zzc();
            return;
        } catch (RemoteException e2) {
            zzcgp.zzh("", e2);
            return;
        }
        drawable = null;
        this.zzb = drawable;
        uri = this.zza.zze();
        this.zzc = uri;
        double d2 = this.zza.zzb();
        this.zzd = d2;
        this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }
}
