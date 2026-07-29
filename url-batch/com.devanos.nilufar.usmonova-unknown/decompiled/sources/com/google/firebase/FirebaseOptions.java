package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import o.AbstractC1473m3;
import o.C0208Hx;
import o.EB;
import o.TT;

/* loaded from: classes.dex */
public final class FirebaseOptions {
    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    public static final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        public Builder() {
        }

        public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId);
        }

        public Builder setApiKey(String str) {
            AbstractC1473m3.l(str, "ApiKey must be set.");
            this.apiKey = str;
            return this;
        }

        public Builder setApplicationId(String str) {
            AbstractC1473m3.l(str, "ApplicationId must be set.");
            this.applicationId = str;
            return this;
        }

        public Builder setDatabaseUrl(String str) {
            this.databaseUrl = str;
            return this;
        }

        public Builder setGaTrackingId(String str) {
            this.gaTrackingId = str;
            return this;
        }

        public Builder setGcmSenderId(String str) {
            this.gcmSenderId = str;
            return this;
        }

        public Builder setProjectId(String str) {
            this.projectId = str;
            return this;
        }

        public Builder setStorageBucket(String str) {
            this.storageBucket = str;
            return this;
        }

        public Builder(FirebaseOptions firebaseOptions) {
            this.applicationId = firebaseOptions.applicationId;
            this.apiKey = firebaseOptions.apiKey;
            this.databaseUrl = firebaseOptions.databaseUrl;
            this.gaTrackingId = firebaseOptions.gaTrackingId;
            this.gcmSenderId = firebaseOptions.gcmSenderId;
            this.storageBucket = firebaseOptions.storageBucket;
            this.projectId = firebaseOptions.projectId;
        }
    }

    public static FirebaseOptions fromResource(Context context) {
        C0208Hx c0208Hx = new C0208Hx(context, 25);
        String Q0 = c0208Hx.Q0(APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(Q0)) {
            return null;
        }
        return new FirebaseOptions(Q0, c0208Hx.Q0(API_KEY_RESOURCE_NAME), c0208Hx.Q0(DATABASE_URL_RESOURCE_NAME), c0208Hx.Q0(GA_TRACKING_ID_RESOURCE_NAME), c0208Hx.Q0(GCM_SENDER_ID_RESOURCE_NAME), c0208Hx.Q0(STORAGE_BUCKET_RESOURCE_NAME), c0208Hx.Q0(PROJECT_ID_RESOURCE_NAME));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return EB.o(this.applicationId, firebaseOptions.applicationId) && EB.o(this.apiKey, firebaseOptions.apiKey) && EB.o(this.databaseUrl, firebaseOptions.databaseUrl) && EB.o(this.gaTrackingId, firebaseOptions.gaTrackingId) && EB.o(this.gcmSenderId, firebaseOptions.gcmSenderId) && EB.o(this.storageBucket, firebaseOptions.storageBucket) && EB.o(this.projectId, firebaseOptions.projectId);
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    public String toString() {
        C0208Hx c0208Hx = new C0208Hx(12, this);
        c0208Hx.H0(this.applicationId, "applicationId");
        c0208Hx.H0(this.apiKey, "apiKey");
        c0208Hx.H0(this.databaseUrl, "databaseUrl");
        c0208Hx.H0(this.gcmSenderId, "gcmSenderId");
        c0208Hx.H0(this.storageBucket, "storageBucket");
        c0208Hx.H0(this.projectId, "projectId");
        return c0208Hx.toString();
    }

    private FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = TT.a;
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalStateException("ApplicationId must be set.");
        }
        this.applicationId = str;
        this.apiKey = str2;
        this.databaseUrl = str3;
        this.gaTrackingId = str4;
        this.gcmSenderId = str5;
        this.storageBucket = str6;
        this.projectId = str7;
    }
}
