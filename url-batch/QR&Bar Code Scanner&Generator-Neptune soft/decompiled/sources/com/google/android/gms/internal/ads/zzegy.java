package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzegy implements zzegz {
    private static zzfkw zzf(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            return zzfkw.HTML_DISPLAY;
        }
        if (c == 1) {
            return zzfkw.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return zzfkw.VIDEO;
    }

    private static zzfky zzg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? zzfky.UNSPECIFIED : zzfky.ONE_PIXEL : zzfky.DEFINED_BY_JAVASCRIPT : zzfky.BEGIN_TO_RENDER;
    }

    private static zzfkz zzh(String str) {
        return "native".equals(str) ? zzfkz.NATIVE : "javascript".equals(str) ? zzfkz.JAVASCRIPT : zzfkz.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, zzehb zzehbVar, zzeha zzehaVar, String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue() || !zzfkp.zzb()) {
            return null;
        }
        zzfla zza = zzfla.zza("Google", str);
        zzfkz zzh = zzh("javascript");
        zzfkw zzf = zzf(zzehaVar.toString());
        if (zzh == zzfkz.NONE) {
            com.google.android.gms.ads.internal.util.zze.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzf == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzehaVar))));
            return null;
        }
        zzfkz zzh2 = zzh(str4);
        if (zzf == zzfkw.VIDEO && zzh2 == zzfkz.NONE) {
            com.google.android.gms.ads.internal.util.zze.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return ObjectWrapper.wrap(zzfkr.zza(zzfks.zza(zzf, zzg(zzehbVar.toString()), zzh, zzh2, true), zzfkt.zzb(zza, webView, str5, "")));
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzehb zzehbVar, zzeha zzehaVar, String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue() || !zzfkp.zzb()) {
            return null;
        }
        zzfla zza = zzfla.zza(str5, str);
        zzfkz zzh = zzh("javascript");
        zzfkz zzh2 = zzh(str4);
        zzfkw zzf = zzf(zzehaVar.toString());
        if (zzh == zzfkz.NONE) {
            com.google.android.gms.ads.internal.util.zze.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzf == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzehaVar))));
            return null;
        }
        if (zzf == zzfkw.VIDEO && zzh2 == zzfkz.NONE) {
            com.google.android.gms.ads.internal.util.zze.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return ObjectWrapper.wrap(zzfkr.zza(zzfks.zza(zzf, zzg(zzehbVar.toString()), zzh, zzh2, true), zzfkt.zzc(zza, webView, str6, "")));
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    public final void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue() && zzfkp.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfkr) {
                ((zzfkr) unwrap).zzd(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue() && zzfkp.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfkr) {
                ((zzfkr) unwrap).zze();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegz
    public final boolean zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzj("Omid flag is disabled");
            return false;
        }
        if (zzfkp.zzb()) {
            return true;
        }
        zzfkp.zza(context);
        return zzfkp.zzb();
    }
}
