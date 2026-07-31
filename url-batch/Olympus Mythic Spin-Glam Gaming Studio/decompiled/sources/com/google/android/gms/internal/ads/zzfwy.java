package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfwy implements zzfww {
    private final zzfww zza;

    public zzfwy(zzfww zzfwwVar) {
        this.zza = zzfwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final JSONObject zza(View view) {
        JSONObject zzb = zzfxg.zzb(0, 0, 0, 0);
        int zzb2 = zzfxj.zzb();
        int i = zzb2 - 1;
        if (zzb2 == 0) {
            throw null;
        }
        try {
            zzb.put("noOutputDevice", i == 0);
        } catch (JSONException e) {
            zzfxh.zza("Error with setting output device status", e);
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zzb(View view, JSONObject jSONObject, zzfwv zzfwvVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfwk zza = zzfwk.zza();
        if (zza != null) {
            Collection zzf = zza.zzf();
            int size = zzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzf.iterator();
            while (it.hasNext()) {
                View zzi = ((zzfvq) it.next()).zzi();
                if (zzi != null && zzi.isAttachedToWindow() && zzi.isShown()) {
                    View view2 = zzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = zzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfwvVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
