package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public class BlockAttachment implements Parcelable {
    public static final Parcelable.Creator<BlockAttachment> CREATOR = new Parcelable.Creator<BlockAttachment>() { // from class: io.intercom.android.sdk.blocks.lib.models.BlockAttachment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BlockAttachment createFromParcel(Parcel parcel) {
            return new BlockAttachment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BlockAttachment[] newArray(int i) {
            return new BlockAttachment[i];
        }
    };
    private final String contentType;
    private final String humanFileSize;
    private final int id;
    private final String name;
    private final long size;
    private final String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BlockAttachment() {
        this(new Builder());
    }

    public BlockAttachment(Builder builder) {
        this.name = builder.name == null ? "" : builder.name;
        this.url = builder.url == null ? "" : builder.url;
        this.contentType = builder.contentType == null ? "" : builder.contentType;
        this.humanFileSize = builder.humanFileSize != null ? builder.humanFileSize : "";
        this.id = builder.id;
        this.size = builder.size;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getHumanFileSize() {
        return this.humanFileSize;
    }

    public int getId() {
        return this.id;
    }

    public long getSize() {
        return this.size;
    }

    public Builder toBuilder() {
        return new Builder().withName(this.name).withUrl(this.url).withContentType(this.contentType).withHumanFileSize(this.humanFileSize).withId(this.id).withSize(this.size);
    }

    public static final class Builder {
        String contentType;
        String humanFileSize;
        int id;
        String name;
        long size;
        String url;

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withContentType(String str) {
            this.contentType = str;
            return this;
        }

        public Builder withHumanFileSize(String str) {
            this.humanFileSize = str;
            return this;
        }

        public Builder withId(int i) {
            this.id = i;
            return this;
        }

        public Builder withSize(long j) {
            this.size = j;
            return this;
        }

        public BlockAttachment build() {
            return new BlockAttachment(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BlockAttachment blockAttachment = (BlockAttachment) obj;
            if (this.size != blockAttachment.size || this.id != blockAttachment.id) {
                return false;
            }
            String str = this.name;
            if (str == null ? blockAttachment.name != null : !str.equals(blockAttachment.name)) {
                return false;
            }
            String str2 = this.url;
            if (str2 == null ? blockAttachment.url != null : !str2.equals(blockAttachment.url)) {
                return false;
            }
            String str3 = this.humanFileSize;
            if (str3 == null ? blockAttachment.humanFileSize == null : !str3.equals(blockAttachment.humanFileSize)) {
                return false;
            }
            String str4 = this.contentType;
            String str5 = blockAttachment.contentType;
            if (str4 != null) {
                return str4.equals(str5);
            }
            if (str5 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contentType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.humanFileSize;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j = this.size;
        return ((hashCode4 + ((int) (j ^ (j >>> 32)))) * 31) + this.id;
    }

    protected BlockAttachment(Parcel parcel) {
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.contentType = parcel.readString();
        this.humanFileSize = parcel.readString();
        this.id = parcel.readInt();
        this.size = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.contentType);
        parcel.writeString(this.humanFileSize);
        parcel.writeInt(this.id);
        parcel.writeLong(this.size);
    }
}
