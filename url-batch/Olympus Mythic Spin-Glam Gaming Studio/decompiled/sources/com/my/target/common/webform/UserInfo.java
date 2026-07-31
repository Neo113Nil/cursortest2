package com.my.target.common.webform;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Date;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public final class UserInfo {

    @Nullable
    public final Date birthday;

    @Nullable
    public final String city;

    @Nullable
    public final Contact contact;

    @Nullable
    public final String country;

    @Nullable
    public final String firstName;

    @Nullable
    public final String lastName;
    public final int vkId;

    public UserInfo(@Nullable String str, @Nullable String str2, @Nullable Date date, @Nullable String str3, @Nullable String str4, @Nullable Contact contact) {
        this(str, str2, date, str3, str4, contact, 0);
    }

    public UserInfo(@Nullable String str, @Nullable String str2, @Nullable Date date, @Nullable String str3, @Nullable String str4, @Nullable Contact contact, int i) {
        this.firstName = str;
        this.lastName = str2;
        this.birthday = date;
        this.city = str3;
        this.country = str4;
        this.contact = contact;
        this.vkId = i;
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class Contact {

        @Nullable
        public final DecodingParameters decodingParameters;

        @Nullable
        public final String email;

        @Nullable
        public final String emailSign;

        @Nullable
        public final String phone;

        @Nullable
        public final String phoneSign;

        /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
        public static final class DecodingParameters {

            @Nullable
            public final String accessToken;

            @NonNull
            public final String appId;

            @Nullable
            public final String userId;

            public DecodingParameters(@Nullable String str, @Nullable String str2, @NonNull String str3) {
                this.accessToken = str;
                this.userId = str2;
                this.appId = str3;
            }
        }

        public Contact(@Nullable String str, @Nullable String str2) {
            this.phone = str;
            this.phoneSign = null;
            this.email = str2;
            this.emailSign = null;
            this.decodingParameters = null;
        }

        public Contact(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NonNull DecodingParameters decodingParameters) {
            this.phone = str;
            this.phoneSign = str2;
            this.email = str3;
            this.emailSign = str4;
            this.decodingParameters = decodingParameters;
        }
    }
}
