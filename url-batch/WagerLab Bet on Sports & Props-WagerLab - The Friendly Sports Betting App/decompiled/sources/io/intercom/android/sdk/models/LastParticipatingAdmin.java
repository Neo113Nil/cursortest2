package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Location;
import io.intercom.android.sdk.models.SocialAccount;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class LastParticipatingAdmin implements Parcelable {
    private static final String LINKED_IN = "linkedin";
    private static final String TWITTER = "twitter";
    private final Avatar avatar;
    private final String firstName;
    private final String intro;
    private final boolean isActive;
    private final boolean isBot;
    private final String jobTitle;
    private final long lastActiveAt;
    private final SocialAccount linkedIn;
    private final Location location;
    private final SocialAccount twitter;
    public static final Parcelable.Creator<LastParticipatingAdmin> CREATOR = new Parcelable.Creator<LastParticipatingAdmin>() { // from class: io.intercom.android.sdk.models.LastParticipatingAdmin.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastParticipatingAdmin createFromParcel(Parcel parcel) {
            return new LastParticipatingAdmin(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastParticipatingAdmin[] newArray(int i) {
            return new LastParticipatingAdmin[i];
        }
    };
    public static final LastParticipatingAdmin NULL = new LastParticipatingAdmin(new Builder());
    public static final LastParticipatingAdmin NONE = new LastParticipatingAdmin(new Builder());

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LastParticipatingAdmin(Builder builder) {
        this.avatar = (builder.avatar == null ? new Avatar.Builder() : builder.avatar).build();
        this.firstName = NullSafety.valueOrEmpty(builder.first_name);
        this.intro = NullSafety.valueOrEmpty(builder.intro);
        this.jobTitle = NullSafety.valueOrEmpty(builder.job_title);
        this.location = (builder.location == null ? new Location.Builder() : builder.location).build();
        this.lastActiveAt = builder.last_active_at;
        this.isActive = builder.is_active;
        this.isBot = builder.is_bot;
        SocialAccount socialAccount = SocialAccount.NULL;
        SocialAccount socialAccount2 = SocialAccount.NULL;
        if (builder.social_accounts != null) {
            Iterator<SocialAccount.Builder> it = builder.social_accounts.iterator();
            while (it.hasNext()) {
                SocialAccount build = it.next().build();
                if (TWITTER.equals(build.getProvider())) {
                    socialAccount = build;
                } else if (LINKED_IN.equals(build.getProvider())) {
                    socialAccount2 = build;
                }
            }
        }
        this.twitter = socialAccount;
        this.linkedIn = socialAccount2;
    }

    public long getLastActiveAt() {
        return this.lastActiveAt;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public Location getLocation() {
        return this.location;
    }

    public SocialAccount getTwitter() {
        return this.twitter;
    }

    public SocialAccount getLinkedIn() {
        return this.linkedIn;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isBot() {
        return this.isBot;
    }

    LastParticipatingAdmin(Parcel parcel) {
        this.lastActiveAt = parcel.readLong();
        this.isActive = parcel.readByte() != 0;
        this.avatar = (Avatar) parcel.readValue(Avatar.class.getClassLoader());
        this.firstName = parcel.readString();
        this.intro = parcel.readString();
        this.jobTitle = parcel.readString();
        this.location = (Location) parcel.readValue(Location.class.getClassLoader());
        this.twitter = (SocialAccount) parcel.readValue(SocialAccount.class.getClassLoader());
        this.linkedIn = (SocialAccount) parcel.readValue(SocialAccount.class.getClassLoader());
        this.isBot = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.lastActiveAt);
        parcel.writeByte(this.isActive ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.intro);
        parcel.writeString(this.jobTitle);
        parcel.writeValue(this.location);
        parcel.writeValue(this.twitter);
        parcel.writeValue(this.linkedIn);
        parcel.writeByte(this.isBot ? (byte) 1 : (byte) 0);
    }

    public static boolean isNull(LastParticipatingAdmin lastParticipatingAdmin) {
        if (lastParticipatingAdmin != NONE) {
            return NULL.equals(lastParticipatingAdmin) || lastParticipatingAdmin == null;
        }
        return false;
    }

    public static final class Builder {
        Avatar.Builder avatar;
        String first_name;
        String intro;
        boolean is_active;
        boolean is_bot;
        String job_title;
        long last_active_at;
        Location.Builder location;
        List<SocialAccount.Builder> social_accounts;

        public LastParticipatingAdmin build() {
            return new LastParticipatingAdmin(this);
        }

        public Builder withJobTitle(String str) {
            this.job_title = str;
            return this;
        }

        public Builder withIntro(String str) {
            this.intro = str;
            return this;
        }

        public Builder withFirstName(String str) {
            this.first_name = str;
            return this;
        }

        public Builder withAvatar(Avatar.Builder builder) {
            this.avatar = builder;
            return this;
        }

        public Builder withIsBot(Boolean bool) {
            this.is_bot = bool.booleanValue();
            return this;
        }
    }
}
