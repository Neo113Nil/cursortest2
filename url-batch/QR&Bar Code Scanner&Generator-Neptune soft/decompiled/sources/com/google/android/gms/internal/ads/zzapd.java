package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzapd extends zzapc {
    protected zzapd(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzapd zzs(String str, Context context, boolean z) {
        zzq(context, false);
        return new zzapd(context, str, false);
    }

    @Deprecated
    public static zzapd zzt(String str, Context context, boolean z, int i) {
        zzq(context, z);
        return new zzapd(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzapc
    protected final List zzo(zzaqe zzaqeVar, Context context, zzamk zzamkVar, zzamd zzamdVar) {
        if (zzaqeVar.zzk() == null || !this.zzt) {
            return super.zzo(zzaqeVar, context, zzamkVar, null);
        }
        int zza = zzaqeVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzo(zzaqeVar, context, zzamkVar, null));
        arrayList.add(new zzaqw(zzaqeVar, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", zzamkVar, zza, 24));
        return arrayList;
    }
}
