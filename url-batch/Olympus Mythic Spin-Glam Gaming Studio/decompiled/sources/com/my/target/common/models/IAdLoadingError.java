package com.my.target.common.models;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public interface IAdLoadingError {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadErrorType {
        public static final int AD_NOT_LOADED_FROM_MEDIATION_NETWORK = 5001;
        public static final int BANNER_HAS_NO_HTML_SOURCE = 3002;
        public static final int BANNER_HAS_NO_IMAGE = 3001;
        public static final int EMPTY_RESPONSE = 2001;
        public static final int FORBIDDEN = 1403;
        public static final int INTERNAL_ERROR = 6000;
        public static final int INTERNAL_SERVER_ERROR = 1500;
        public static final int INVALID_BANNER_TYPE = 3004;
        public static final int INVALID_JSON = 2002;
        public static final int INVALID_TYPE = 2004;
        public static final int INVALID_URL = 1001;
        public static final int INVALID_XML = 2003;
        public static final int NETWORK_CONNECTION_FAILED = 1002;
        public static final int NOT_FOUND = 1404;
        public static final int NOT_LOADED_YET = 4002;
        public static final int NO_BANNERS = 3003;
        public static final int RELOADING_NOT_ALLOWED = 4001;
        public static final int REQUEST_TIMEOUT = 1003;
        public static final int REQUIRED_FIELD_MISSED = 2005;
        public static final int UNDEFINED_DATA_ERROR = 3000;
        public static final int UNDEFINED_MEDIATION_ERROR = 5000;
        public static final int UNDEFINED_NETWORK_ERROR = 1000;
        public static final int UNDEFINED_PARSE_ERROR = 2000;
    }

    int getCode();

    @NonNull
    String getMessage();
}
