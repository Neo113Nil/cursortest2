package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzgcd implements Serializer {

    @NotNull
    public static final zzgcd zza = new zzgcd();

    @NotNull
    private static final zzgca zzb;

    static {
        zzgca zzd = zzgca.zzd();
        Intrinsics.checkNotNullExpressionValue(zzd, "getDefaultInstance(...)");
        zzb = zzd;
    }

    private zzgcd() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public final Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation continuation) {
        try {
            zzgca zzc = zzgca.zzc(inputStream);
            Intrinsics.checkNotNull(zzc);
            return zzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) {
        ((zzgca) obj).zzaO(outputStream);
        return Unit.INSTANCE;
    }
}
