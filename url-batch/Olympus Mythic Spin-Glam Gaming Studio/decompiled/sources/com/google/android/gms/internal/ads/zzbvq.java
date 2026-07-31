package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbvq extends zzbvt {
    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbvx zza(String str) throws RemoteException {
        zzbwv zzbwvVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbvq.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbwv((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbwv((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Reflection failed, retrying using direct instantiation");
                if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zzbwvVar = new zzbwv(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                zzbwvVar = new zzbwv(new AdMobAdapter());
                return zzbwvVar;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb2.toString(), th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzb(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbvq.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzc(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbvq.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbxt zzd(String str) throws RemoteException {
        return new zzbyg((RtbAdapter) Class.forName(str, false, zzbxx.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
