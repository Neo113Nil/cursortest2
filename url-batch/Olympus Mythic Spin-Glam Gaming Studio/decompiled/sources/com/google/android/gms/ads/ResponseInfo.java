package com.google.android.gms.ads;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbjg;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes3.dex */
public final class ResponseInfo {

    @Nullable
    private final zzdx zza;
    private final List zzb = new ArrayList();

    @Nullable
    private AdapterResponseInfo zzc;

    private ResponseInfo(@Nullable zzdx zzdxVar) {
        this.zza = zzdxVar;
        if (zzdxVar != null) {
            try {
                List zzg = zzdxVar.zzg();
                if (zzg != null) {
                    Iterator it = zzg.iterator();
                    while (it.hasNext()) {
                        AdapterResponseInfo zza = AdapterResponseInfo.zza((zzv) it.next());
                        if (zza != null) {
                            this.zzb.add(zza);
                        }
                    }
                }
            } catch (RemoteException e) {
                zzo.zzg("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        zzdx zzdxVar2 = this.zza;
        if (zzdxVar2 == null) {
            return;
        }
        try {
            zzv zzh = zzdxVar2.zzh();
            if (zzh != null) {
                this.zzc = AdapterResponseInfo.zza(zzh);
            }
        } catch (RemoteException e2) {
            zzo.zzg("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    @Nullable
    public static ResponseInfo zzb(@Nullable zzdx zzdxVar) {
        if (zzdxVar != null) {
            return new ResponseInfo(zzdxVar);
        }
        return null;
    }

    @NonNull
    public static ResponseInfo zzc(@Nullable zzdx zzdxVar) {
        return new ResponseInfo(zzdxVar);
    }

    @NonNull
    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    @Nullable
    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    @Nullable
    public String getMediationAdapterClassName() {
        try {
            zzdx zzdxVar = this.zza;
            if (zzdxVar != null) {
                return zzdxVar.zze();
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzg("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @NonNull
    public Bundle getResponseExtras() {
        try {
            zzdx zzdxVar = this.zza;
            if (zzdxVar != null) {
                Bundle zzi = zzdxVar.zzi();
                if (zzi != null) {
                    if (((Boolean) zzba.zzc().zzd(zzbjg.zzv)).booleanValue()) {
                        zzi.keySet();
                    }
                }
                return zzi;
            }
        } catch (BadParcelableException | RemoteException | IllegalArgumentException e) {
            zzo.zzg("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    @Nullable
    public String getResponseId() {
        try {
            zzdx zzdxVar = this.zza;
            if (zzdxVar != null) {
                return zzdxVar.zzf();
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzg("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @NonNull
    public String toString() {
        try {
            return zza().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @NonNull
    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", POBCommonConstants.NULL_VALUE);
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", POBCommonConstants.NULL_VALUE);
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            jSONArray.put(((AdapterResponseInfo) it.next()).zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        AdapterResponseInfo adapterResponseInfo = this.zzc;
        if (adapterResponseInfo != null) {
            jSONObject.put("Loaded Adapter Response", adapterResponseInfo.zzb());
        }
        Bundle responseExtras = getResponseExtras();
        if (responseExtras != null) {
            jSONObject.put("Response Extras", zzay.zza().zzo(responseExtras));
        }
        return jSONObject;
    }

    @Nullable
    public final zzdx zzd() {
        return this.zza;
    }
}
