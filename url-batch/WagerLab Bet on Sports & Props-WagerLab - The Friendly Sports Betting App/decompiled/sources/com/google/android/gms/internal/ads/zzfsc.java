package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfsc implements Serializer {
    public static final zzfsc zza = new zzfsc();
    private static final zzfrz zzb;

    static {
        zzfrz zzd = zzfrz.zzd();
        Intrinsics.checkNotNullExpressionValue(zzd, "getDefaultInstance(...)");
        zzb = zzd;
    }

    private zzfsc() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) {
        try {
            zzfrz zzc = zzfrz.zzc(inputStream);
            Intrinsics.checkNotNull(zzc);
            return zzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) {
        ((zzfrz) obj).zzaO(outputStream);
        return Unit.INSTANCE;
    }
}
