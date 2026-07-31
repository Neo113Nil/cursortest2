package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzguz {
    private final zzgty zza;
    private final boolean zzb;
    private final zzguy zzc;

    private zzguz(zzguy zzguyVar) {
        this(zzguyVar, false, zzgtw.zza, Integer.MAX_VALUE);
    }

    private zzguz(zzguy zzguyVar, boolean z, zzgty zzgtyVar, int i) {
        this.zzc = zzguyVar;
        this.zzb = z;
        this.zza = zzgtyVar;
    }

    public static zzguz zza(final zzgty zzgtyVar) {
        return new zzguz(new zzguy() { // from class: com.google.android.gms.internal.ads.zzguw
            @Override // com.google.android.gms.internal.ads.zzguy
            public final /* synthetic */ Iterator zza(zzguz zzguzVar, CharSequence charSequence) {
                return new zzguq(zzguzVar, charSequence, zzgty.this);
            }
        });
    }

    public static zzguz zzb(Pattern pattern) {
        final zzgud zzgudVar = new zzgud(pattern);
        zzguk.zzf(!((zzguc) zzgudVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzgudVar);
        return new zzguz(new zzguy() { // from class: com.google.android.gms.internal.ads.zzguu
            @Override // com.google.android.gms.internal.ads.zzguy
            public final /* synthetic */ Iterator zza(zzguz zzguzVar, CharSequence charSequence) {
                return new zzgur(zzguzVar, charSequence, zzgua.this.zza(charSequence));
            }
        });
    }

    public static zzguz zzc(int i) {
        final int i2 = 4000;
        return new zzguz(new zzguy(i2) { // from class: com.google.android.gms.internal.ads.zzguv
            @Override // com.google.android.gms.internal.ads.zzguy
            public final /* synthetic */ Iterator zza(zzguz zzguzVar, CharSequence charSequence) {
                return new zzgus(zzguzVar, charSequence, 4000);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final Iterator zzh(CharSequence charSequence) {
        return this.zzc.zza(this, charSequence);
    }

    public final zzguz zzd() {
        return new zzguz(this.zzc, true, this.zza, Integer.MAX_VALUE);
    }

    public final zzguz zze(zzgty zzgtyVar) {
        zzgtyVar.getClass();
        return new zzguz(this.zzc, this.zzb, zzgtyVar, Integer.MAX_VALUE);
    }

    final /* synthetic */ zzgty zzi() {
        return this.zza;
    }

    final /* synthetic */ boolean zzj() {
        return this.zzb;
    }

    public final Iterable zzf(CharSequence charSequence) {
        charSequence.getClass();
        return new zzgut(this, charSequence);
    }

    public final List zzg(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzh = zzh(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzh.hasNext()) {
            arrayList.add((String) zzh.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
