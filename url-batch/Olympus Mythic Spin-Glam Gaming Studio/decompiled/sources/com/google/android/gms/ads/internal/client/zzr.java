package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes10.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final int zzb;

    @SafeParcelable.Field(id = 4)
    public final int zzc;

    @SafeParcelable.Field(id = 5)
    public final boolean zzd;

    @SafeParcelable.Field(id = 6)
    public final int zze;

    @SafeParcelable.Field(id = 7)
    public final int zzf;

    @SafeParcelable.Field(id = 8)
    public final zzr[] zzg;

    @SafeParcelable.Field(id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(id = 11)
    public boolean zzj;

    @SafeParcelable.Field(id = 12)
    public boolean zzk;

    @SafeParcelable.Field(id = 13)
    public boolean zzl;

    @SafeParcelable.Field(id = 14)
    public boolean zzm;

    @SafeParcelable.Field(id = 15)
    public boolean zzn;

    @SafeParcelable.Field(id = 16)
    public boolean zzo;

    @SafeParcelable.Field(id = 17)
    public boolean zzp;

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    public static zzr zzb() {
        return new zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static zzr zzc() {
        return new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public static zzr zzd() {
        return new zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    private static int zze(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzr(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzr(Context context, AdSize[] adSizeArr) {
        int height;
        int i;
        int i2;
        String sb;
        int i3;
        double d;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean isFluid = adSize.isFluid();
        this.zzi = isFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        this.zzo = com.google.android.gms.ads.zzc.zzd(adSize);
        this.zzp = com.google.android.gms.ads.zzc.zzi(adSize);
        if (isFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzh(adSize);
            this.zzb = height;
        } else if (this.zzo) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zze(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z = this.zze == -1;
        boolean z2 = height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            zzay.zza();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r7.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzay.zza();
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i4 = displayMetrics2.heightPixels;
                        int i5 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i6 = displayMetrics2.heightPixels;
                        int i7 = displayMetrics2.widthPixels;
                        if (i6 == i4 && i7 == i5) {
                            int i8 = displayMetrics.widthPixels;
                            zzay.zza();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i3 = i8 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = i3;
                            d = i3 / displayMetrics.density;
                            i = (int) d;
                            if (d - i >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i3 = displayMetrics.widthPixels;
            this.zzf = i3;
            d = i3 / displayMetrics.density;
            i = (int) d;
            if (d - i >= 0.01d) {
            }
        } else {
            i = this.zze;
            zzay.zza();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, this.zze);
        }
        if (z2) {
            i2 = zze(displayMetrics);
        } else {
            i2 = this.zzb;
        }
        zzay.zza();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, i2);
        if (z || z2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length() + 3);
            sb2.append(i);
            sb2.append(VastAttributes.HORIZONTAL_POSITION);
            sb2.append(i2);
            sb2.append("_as");
            this.zza = sb2.toString();
        } else {
            if (this.zzn || this.zzo) {
                int i9 = this.zze;
                int i10 = this.zzb;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i9).length() + 1 + String.valueOf(i10).length() + 3);
                sb3.append(i9);
                sb3.append(VastAttributes.HORIZONTAL_POSITION);
                sb3.append(i10);
                sb3.append("_as");
                sb = sb3.toString();
            } else if (!isFluid) {
                this.zza = adSize.toString();
            } else {
                sb = "320x50_mb";
            }
            this.zza = sb;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzr[length];
            for (int i11 = 0; i11 < adSizeArr.length; i11++) {
                this.zzg[i11] = new zzr(context, adSizeArr[i11]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) zzr[] zzrVarArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4, @SafeParcelable.Param(id = 12) boolean z5, @SafeParcelable.Param(id = 13) boolean z6, @SafeParcelable.Param(id = 14) boolean z7, @SafeParcelable.Param(id = 15) boolean z8, @SafeParcelable.Param(id = 16) boolean z9, @SafeParcelable.Param(id = 17) boolean z10) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzrVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
        this.zzp = z10;
    }
}
