package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.ably.lib.transport.Defaults;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdwx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final Executor zzc;
    private final AtomicReference zzd = new AtomicReference("");

    zzdwx(Context context, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = executor;
    }

    private final String zzc() {
        String str;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String str2 = null;
        if (versionInfoParcel.isClientJar) {
            str = zzcev.class.getName();
        } else {
            try {
                str = (String) new JSONObject(zzd((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoO))).get(Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoN)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "SdkIE");
                }
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return ExifInterface.GPS_MEASUREMENT_2D;
        }
        try {
            str2 = zzd((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoP));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoN)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return ExifInterface.GPS_MEASUREMENT_3D;
        }
        try {
            for (Method method : this.zza.getClassLoader().loadClass(str).getDeclaredMethods()) {
                if (method.getName().matches(str2)) {
                    return "1";
                }
            }
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        } catch (ClassNotFoundException unused) {
            return Defaults.ABLY_PROTOCOL_VERSION;
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }

    private static final String zzd(String str) throws IllegalArgumentException {
        return com.google.android.gms.ads.internal.util.zzs.zzl(new String(Base64.decode(str, 0)), new String(Base64.decode((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoQ), 10), StandardCharsets.UTF_8));
    }

    public final String zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoM)).booleanValue()) {
            if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoO)).isEmpty()) {
                if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoP)).isEmpty()) {
                    if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoQ)).isEmpty()) {
                        String str = (String) this.zzd.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdww
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzdwx.this.zzb();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        AtomicReference atomicReference = this.zzd;
        synchronized (atomicReference) {
            if (((String) atomicReference.get()).isEmpty()) {
                atomicReference.set(zzc());
            }
        }
    }
}
