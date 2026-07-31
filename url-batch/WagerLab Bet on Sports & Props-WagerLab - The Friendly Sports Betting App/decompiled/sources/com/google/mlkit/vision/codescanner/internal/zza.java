package com.google.mlkit.vision.codescanner.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_code_scanner.zzon;
import com.google.android.gms.internal.mlkit_code_scanner.zzoo;
import com.google.android.gms.internal.mlkit_code_scanner.zzop;
import com.google.android.gms.internal.mlkit_code_scanner.zzoq;
import com.google.android.gms.internal.mlkit_code_scanner.zzor;
import com.google.android.gms.internal.mlkit_code_scanner.zzos;
import com.google.android.gms.internal.mlkit_code_scanner.zzot;
import com.google.android.gms.internal.mlkit_code_scanner.zzou;
import com.google.android.gms.internal.mlkit_code_scanner.zzov;
import com.google.android.gms.internal.mlkit_code_scanner.zzow;
import com.google.android.gms.internal.mlkit_code_scanner.zzox;
import com.google.android.gms.internal.mlkit_code_scanner.zzoy;
import com.google.android.gms.internal.mlkit_code_scanner.zzoz;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-code-scanner@@16.1.0 */
/* loaded from: classes5.dex */
final class zza implements BarcodeSource {
    private final zzoz zza;

    public zza(zzoz zzozVar) {
        this.zza = zzozVar;
    }

    private static Barcode.CalendarDateTime zza(zzoo zzooVar) {
        if (zzooVar == null) {
            return null;
        }
        return new Barcode.CalendarDateTime(zzooVar.zzf(), zzooVar.zzd(), zzooVar.zza(), zzooVar.zzb(), zzooVar.zzc(), zzooVar.zze(), zzooVar.zzh(), zzooVar.zzg());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Rect getBoundingBox() {
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.CalendarEvent getCalendarEvent() {
        zzop zzc = this.zza.zzc();
        if (zzc != null) {
            return new Barcode.CalendarEvent(zzc.zzg(), zzc.zzc(), zzc.zzd(), zzc.zze(), zzc.zzf(), zza(zzc.zzb()), zza(zzc.zza()));
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.ContactInfo getContactInfo() {
        zzoq zzd = this.zza.zzd();
        if (zzd == null) {
            return null;
        }
        zzou zza = zzd.zza();
        Barcode.PersonName personName = zza == null ? null : new Barcode.PersonName(zza.zzb(), zza.zzf(), zza.zze(), zza.zza(), zza.zzd(), zza.zzc(), zza.zzg());
        String zzb = zzd.zzb();
        String zzc = zzd.zzc();
        zzov[] zzf = zzd.zzf();
        ArrayList arrayList = new ArrayList();
        if (zzf != null) {
            for (zzov zzovVar : zzf) {
                if (zzovVar != null) {
                    arrayList.add(new Barcode.Phone(zzovVar.zzb(), zzovVar.zza()));
                }
            }
        }
        zzos[] zze = zzd.zze();
        ArrayList arrayList2 = new ArrayList();
        if (zze != null) {
            for (zzos zzosVar : zze) {
                if (zzosVar != null) {
                    arrayList2.add(new Barcode.Email(zzosVar.zza(), zzosVar.zzb(), zzosVar.zzd(), zzosVar.zzc()));
                }
            }
        }
        List asList = zzd.zzg() != null ? Arrays.asList((String[]) Preconditions.checkNotNull(zzd.zzg())) : new ArrayList();
        zzon[] zzd2 = zzd.zzd();
        ArrayList arrayList3 = new ArrayList();
        if (zzd2 != null) {
            for (zzon zzonVar : zzd2) {
                if (zzonVar != null) {
                    arrayList3.add(new Barcode.Address(zzonVar.zza(), zzonVar.zzb()));
                }
            }
        }
        return new Barcode.ContactInfo(personName, zzb, zzc, arrayList, arrayList2, asList, arrayList3);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Point[] getCornerPoints() {
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getDisplayValue() {
        return this.zza.zzl();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.DriverLicense getDriverLicense() {
        zzor zze = this.zza.zze();
        if (zze != null) {
            return new Barcode.DriverLicense(zze.zzf(), zze.zzh(), zze.zzn(), zze.zzl(), zze.zzi(), zze.zzc(), zze.zza(), zze.zzb(), zze.zzd(), zze.zzm(), zze.zzj(), zze.zzg(), zze.zze(), zze.zzk());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Email getEmail() {
        zzos zzf = this.zza.zzf();
        if (zzf == null) {
            return null;
        }
        return new Barcode.Email(zzf.zza(), zzf.zzb(), zzf.zzd(), zzf.zzc());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.zza.zza();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.GeoPoint getGeoPoint() {
        zzot zzg = this.zza.zzg();
        if (zzg != null) {
            return new Barcode.GeoPoint(zzg.zza(), zzg.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Phone getPhone() {
        zzov zzh = this.zza.zzh();
        if (zzh != null) {
            return new Barcode.Phone(zzh.zzb(), zzh.zza());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final byte[] getRawBytes() {
        return this.zza.zzn();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getRawValue() {
        return this.zza.zzm();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Sms getSms() {
        zzow zzi = this.zza.zzi();
        if (zzi != null) {
            return new Barcode.Sms(zzi.zza(), zzi.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.UrlBookmark getUrl() {
        zzox zzj = this.zza.zzj();
        if (zzj != null) {
            return new Barcode.UrlBookmark(zzj.zza(), zzj.zzb());
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.zza.zzb();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.WiFi getWifi() {
        zzoy zzk = this.zza.zzk();
        if (zzk != null) {
            return new Barcode.WiFi(zzk.zzc(), zzk.zzb(), zzk.zza());
        }
        return null;
    }
}
