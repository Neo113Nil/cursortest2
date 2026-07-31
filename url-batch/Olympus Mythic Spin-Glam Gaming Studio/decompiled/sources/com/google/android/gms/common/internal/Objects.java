package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class Objects {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public static final class ToStringHelper {
        private final List zza;
        private final Object zzb;

        /* synthetic */ ToStringHelper(Object obj, byte[] bArr) {
            Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new ArrayList();
        }

        @NonNull
        @KeepForSdk
        public ToStringHelper add(@NonNull String str, @Nullable Object obj) {
            Preconditions.checkNotNull(str);
            int length = str.length();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(length + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            this.zza.add(sb.toString());
            return this;
        }

        @NonNull
        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.zzb.getClass().getSimpleName());
            sb.append('{');
            List list = this.zza;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) list.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean checkBundlesEquality(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static boolean equal(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    public static int hashCode(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    @KeepForSdk
    public static ToStringHelper toStringHelper(@NonNull Object obj) {
        return new ToStringHelper(obj, null);
    }
}
