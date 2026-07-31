package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes11.dex */
public class RequestConfiguration {

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    @NonNull
    public static final List zza = Arrays.asList("MA", "T", "PG", "G");
    private final AgeRestrictedTreatment zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final List zzf;
    private final PublisherPrivacyPersonalizationState zzg;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public static class Builder {
        private AgeRestrictedTreatment zza = null;
        private int zzb = -1;
        private int zzc = -1;
        private String zzd = null;
        private final List zze = new ArrayList();
        private PublisherPrivacyPersonalizationState zzf = PublisherPrivacyPersonalizationState.DEFAULT;

        @NonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
        }

        @NonNull
        public Builder setAgeRestrictedTreatment(AgeRestrictedTreatment ageRestrictedTreatment) {
            this.zza = ageRestrictedTreatment;
            return this;
        }

        @NonNull
        public Builder setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                str = null;
            } else if (!"G".equals(str) && !"PG".equals(str) && !"T".equals(str) && !"MA".equals(str)) {
                zzo.zzi("Invalid value passed to setMaxAdContentRating: ".concat(str));
                return this;
            }
            this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setPublisherPrivacyPersonalizationState(@NonNull PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.zzf = publisherPrivacyPersonalizationState;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzb = i;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 57);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i);
                zzo.zzi(sb.toString());
            }
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzc = i;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 52);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i);
                zzo.zzi(sb.toString());
            }
            return this;
        }

        @NonNull
        public Builder setTestDeviceIds(List<String> list) {
            List list2 = this.zze;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zza;

        PublisherPrivacyPersonalizationState(int i) {
            this.zza = i;
        }

        public int getValue() {
            return this.zza;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForUnderAgeOfConsent {
    }

    /* synthetic */ RequestConfiguration(AgeRestrictedTreatment ageRestrictedTreatment, int i, int i2, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, byte[] bArr) {
        this.zzb = ageRestrictedTreatment;
        this.zzc = i;
        this.zzd = i2;
        this.zze = str;
        this.zzf = list;
        this.zzg = publisherPrivacyPersonalizationState;
    }

    @NonNull
    public AgeRestrictedTreatment getAgeRestrictedTreatment() {
        AgeRestrictedTreatment ageRestrictedTreatment = this.zzb;
        return ageRestrictedTreatment == null ? AgeRestrictedTreatment.UNSPECIFIED : ageRestrictedTreatment;
    }

    @NonNull
    public String getMaxAdContentRating() {
        String str = this.zze;
        return str == null ? "" : str;
    }

    @NonNull
    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.zzg;
    }

    @Deprecated
    public int getTagForChildDirectedTreatment() {
        return this.zzc;
    }

    @Deprecated
    public int getTagForUnderAgeOfConsent() {
        return this.zzd;
    }

    @NonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zzf);
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setAgeRestrictedTreatment(this.zzb);
        builder.setTagForChildDirectedTreatment(this.zzc);
        builder.setTagForUnderAgeOfConsent(this.zzd);
        builder.setMaxAdContentRating(this.zze);
        builder.setTestDeviceIds(this.zzf);
        builder.setPublisherPrivacyPersonalizationState(this.zzg);
        return builder;
    }

    @Nullable
    public final AgeRestrictedTreatment zza() {
        return this.zzb;
    }
}
