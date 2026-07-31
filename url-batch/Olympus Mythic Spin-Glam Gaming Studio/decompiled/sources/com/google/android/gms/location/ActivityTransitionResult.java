package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "ActivityTransitionResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzp();
    private final List zza;
    private Bundle zzb;

    public ActivityTransitionResult(List list) {
        this.zzb = null;
        Preconditions.checkNotNull(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                Preconditions.checkArgument(((ActivityTransitionEvent) list.get(i)).getElapsedRealTimeNanos() >= ((ActivityTransitionEvent) list.get(i + (-1))).getElapsedRealTimeNanos());
            }
        }
        this.zza = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((ActivityTransitionResult) obj).zza);
    }

    public List getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getTransitionEvents(), false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }
}
