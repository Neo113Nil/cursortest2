package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaData.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H&\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData;", "Landroid/os/Parcelable;", "getDataSource", "", "Media", "Gif", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface MediaData extends Parcelable {
    Object getDataSource();

    /* compiled from: MediaData.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00142\u00020\u0001:\u0004\u0011\u0012\u0013\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData;", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "size", "", "getSize", "()J", "fileName", "getFileName", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "getDataSource", "Image", "Video", "Other", "Companion", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Other;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Video;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Media extends MediaData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
        Uri getDataSource();

        String getFileName();

        String getMimeType();

        long getSize();

        Uri getUri();

        /* compiled from: MediaData.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static Uri getDataSource(Media media) {
                return media.getUri();
            }
        }

        /* compiled from: MediaData.kt */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÇ\u0001J\b\u0010$\u001a\u00020\u0005H\u0007J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H×\u0003J\t\u0010)\u001a\u00020\u0005H×\u0001J\t\u0010*\u001a\u00020\u0003H×\u0001J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005H\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "mimeType", "", "width", "", "height", "size", "", "fileName", "uri", "Landroid/net/Uri;", "exifData", "", "<init>", "(Ljava/lang/String;IIJLjava/lang/String;Landroid/net/Uri;Ljava/util/Map;)V", "getMimeType", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "getSize", "()J", "getFileName", "getUri", "()Landroid/net/Uri;", "getExifData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Image> CREATOR = new Creator();
            private final Map<String, String> exifData;
            private final String fileName;
            private final int height;
            private final String mimeType;
            private final long size;
            private final Uri uri;
            private final int width;

            /* compiled from: MediaData.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Image> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    long readLong = parcel.readLong();
                    String readString2 = parcel.readString();
                    Uri uri = (Uri) parcel.readParcelable(Image.class.getClassLoader());
                    int readInt3 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
                    for (int i = 0; i != readInt3; i++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new Image(readString, readInt, readInt2, readLong, readString2, uri, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i) {
                    return new Image[i];
                }
            }

            public static /* synthetic */ Image copy$default(Image image, String str, int i, int i2, long j, String str2, Uri uri, Map map, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = image.mimeType;
                }
                if ((i3 & 2) != 0) {
                    i = image.width;
                }
                if ((i3 & 4) != 0) {
                    i2 = image.height;
                }
                if ((i3 & 8) != 0) {
                    j = image.size;
                }
                if ((i3 & 16) != 0) {
                    str2 = image.fileName;
                }
                if ((i3 & 32) != 0) {
                    uri = image.uri;
                }
                if ((i3 & 64) != 0) {
                    map = image.exifData;
                }
                Map map2 = map;
                String str3 = str2;
                long j2 = j;
                int i4 = i2;
                return image.copy(str, i, i4, j2, str3, uri, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }

            /* renamed from: component2, reason: from getter */
            public final int getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final long getSize() {
                return this.size;
            }

            /* renamed from: component5, reason: from getter */
            public final String getFileName() {
                return this.fileName;
            }

            /* renamed from: component6, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            public final Map<String, String> component7() {
                return this.exifData;
            }

            public final Image copy(String mimeType, int width, int height, long size, String fileName, Uri uri, Map<String, String> exifData) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(exifData, "exifData");
                return new Image(mimeType, width, height, size, fileName, uri, exifData);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.areEqual(this.mimeType, image.mimeType) && this.width == image.width && this.height == image.height && this.size == image.size && Intrinsics.areEqual(this.fileName, image.fileName) && Intrinsics.areEqual(this.uri, image.uri) && Intrinsics.areEqual(this.exifData, image.exifData);
            }

            public int hashCode() {
                return (((((((((((this.mimeType.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.exifData.hashCode();
            }

            public String toString() {
                return "Image(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ", exifData=" + this.exifData + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeInt(this.width);
                dest.writeInt(this.height);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, flags);
                Map<String, String> map = this.exifData;
                dest.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeString(entry.getValue());
                }
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public Image(String mimeType, int i, int i2, long j, String fileName, Uri uri, Map<String, String> exifData) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(exifData, "exifData");
                this.mimeType = mimeType;
                this.width = i;
                this.height = i2;
                this.size = j;
                this.fileName = fileName;
                this.uri = uri;
                this.exifData = exifData;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            public final int getWidth() {
                return this.width;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }

            public /* synthetic */ Image(String str, int i, int i2, long j, String str2, Uri uri, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, i2, j, str2, uri, (i3 & 64) != 0 ? MapsKt.emptyMap() : map);
            }

            public final Map<String, String> getExifData() {
                return this.exifData;
            }
        }

        /* compiled from: MediaData.kt */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÇ\u0001J\b\u0010'\u001a\u00020\u0005H\u0007J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H×\u0003J\t\u0010,\u001a\u00020\u0005H×\u0001J\t\u0010-\u001a\u00020\u0003H×\u0001J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005H\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00063"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Video;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "mimeType", "", "width", "", "height", "size", "", "fileName", "uri", "Landroid/net/Uri;", TypedValues.TransitionType.S_DURATION, "thumbnail", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "<init>", "(Ljava/lang/String;IIJLjava/lang/String;Landroid/net/Uri;JLio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;)V", "getMimeType", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "getSize", "()J", "getFileName", "getUri", "()Landroid/net/Uri;", "getDuration", "getThumbnail", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Video> CREATOR = new Creator();
            private final long duration;
            private final String fileName;
            private final int height;
            private final String mimeType;
            private final long size;
            private final Image thumbnail;
            private final Uri uri;
            private final int width;

            /* compiled from: MediaData.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Video> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Video createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Video(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Video.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Video[] newArray(int i) {
                    return new Video[i];
                }
            }

            public static /* synthetic */ Video copy$default(Video video, String str, int i, int i2, long j, String str2, Uri uri, long j2, Image image, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = video.mimeType;
                }
                if ((i3 & 2) != 0) {
                    i = video.width;
                }
                if ((i3 & 4) != 0) {
                    i2 = video.height;
                }
                if ((i3 & 8) != 0) {
                    j = video.size;
                }
                if ((i3 & 16) != 0) {
                    str2 = video.fileName;
                }
                if ((i3 & 32) != 0) {
                    uri = video.uri;
                }
                if ((i3 & 64) != 0) {
                    j2 = video.duration;
                }
                if ((i3 & 128) != 0) {
                    image = video.thumbnail;
                }
                Image image2 = image;
                long j3 = j;
                int i4 = i2;
                return video.copy(str, i, i4, j3, str2, uri, j2, image2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }

            /* renamed from: component2, reason: from getter */
            public final int getWidth() {
                return this.width;
            }

            /* renamed from: component3, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            /* renamed from: component4, reason: from getter */
            public final long getSize() {
                return this.size;
            }

            /* renamed from: component5, reason: from getter */
            public final String getFileName() {
                return this.fileName;
            }

            /* renamed from: component6, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            /* renamed from: component7, reason: from getter */
            public final long getDuration() {
                return this.duration;
            }

            /* renamed from: component8, reason: from getter */
            public final Image getThumbnail() {
                return this.thumbnail;
            }

            public final Video copy(String mimeType, int width, int height, long size, String fileName, Uri uri, long duration, Image thumbnail) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                return new Video(mimeType, width, height, size, fileName, uri, duration, thumbnail);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return Intrinsics.areEqual(this.mimeType, video.mimeType) && this.width == video.width && this.height == video.height && this.size == video.size && Intrinsics.areEqual(this.fileName, video.fileName) && Intrinsics.areEqual(this.uri, video.uri) && this.duration == video.duration && Intrinsics.areEqual(this.thumbnail, video.thumbnail);
            }

            public int hashCode() {
                int hashCode = ((((((((((((this.mimeType.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode()) * 31) + Long.hashCode(this.duration)) * 31;
                Image image = this.thumbnail;
                return hashCode + (image == null ? 0 : image.hashCode());
            }

            public String toString() {
                return "Video(mimeType=" + this.mimeType + ", width=" + this.width + ", height=" + this.height + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ", duration=" + this.duration + ", thumbnail=" + this.thumbnail + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeInt(this.width);
                dest.writeInt(this.height);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, flags);
                dest.writeLong(this.duration);
                Image image = this.thumbnail;
                if (image == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    image.writeToParcel(dest, flags);
                }
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public Video(String mimeType, int i, int i2, long j, String fileName, Uri uri, long j2, Image image) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                this.mimeType = mimeType;
                this.width = i;
                this.height = i2;
                this.size = j;
                this.fileName = fileName;
                this.uri = uri;
                this.duration = j2;
                this.thumbnail = image;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            public final int getWidth() {
                return this.width;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }

            public final long getDuration() {
                return this.duration;
            }

            public final Image getThumbnail() {
                return this.thumbnail;
            }
        }

        /* compiled from: MediaData.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0018H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Other;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "mimeType", "", "size", "", "fileName", "uri", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Landroid/net/Uri;)V", "getMimeType", "()Ljava/lang/String;", "getSize", "()J", "getFileName", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Other implements Media {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Other> CREATOR = new Creator();
            private final String fileName;
            private final String mimeType;
            private final long size;
            private final Uri uri;

            /* compiled from: MediaData.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Other> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Other(parcel.readString(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(Other.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Other[] newArray(int i) {
                    return new Other[i];
                }
            }

            public static /* synthetic */ Other copy$default(Other other, String str, long j, String str2, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = other.mimeType;
                }
                if ((i & 2) != 0) {
                    j = other.size;
                }
                if ((i & 4) != 0) {
                    str2 = other.fileName;
                }
                if ((i & 8) != 0) {
                    uri = other.uri;
                }
                return other.copy(str, j, str2, uri);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }

            /* renamed from: component2, reason: from getter */
            public final long getSize() {
                return this.size;
            }

            /* renamed from: component3, reason: from getter */
            public final String getFileName() {
                return this.fileName;
            }

            /* renamed from: component4, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            public final Other copy(String mimeType, long size, String fileName, Uri uri) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                return new Other(mimeType, size, fileName, uri);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Other)) {
                    return false;
                }
                Other other2 = (Other) other;
                return Intrinsics.areEqual(this.mimeType, other2.mimeType) && this.size == other2.size && Intrinsics.areEqual(this.fileName, other2.fileName) && Intrinsics.areEqual(this.uri, other2.uri);
            }

            public int hashCode() {
                return (((((this.mimeType.hashCode() * 31) + Long.hashCode(this.size)) * 31) + this.fileName.hashCode()) * 31) + this.uri.hashCode();
            }

            public String toString() {
                return "Other(mimeType=" + this.mimeType + ", size=" + this.size + ", fileName=" + this.fileName + ", uri=" + this.uri + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.mimeType);
                dest.writeLong(this.size);
                dest.writeString(this.fileName);
                dest.writeParcelable(this.uri, flags);
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
            public Uri getDataSource() {
                return DefaultImpls.getDataSource(this);
            }

            public Other(String mimeType, long j, String fileName, Uri uri) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Intrinsics.checkNotNullParameter(uri, "uri");
                this.mimeType = mimeType;
                this.size = j;
                this.fileName = fileName;
                this.uri = uri;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getMimeType() {
                return this.mimeType;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public long getSize() {
                return this.size;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public String getFileName() {
                return this.fileName;
            }

            @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media
            public Uri getUri() {
                return this.uri;
            }
        }

        /* compiled from: MediaData.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Companion;", "", "<init>", "()V", "empty", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Image empty() {
                Uri EMPTY = Uri.EMPTY;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                return new Image("", 0, 0, 0L, "", EMPTY, MapsKt.emptyMap());
            }
        }
    }

    /* compiled from: MediaData.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0003H\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\t\u0010\u001c\u001a\u00020\u0006H×\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData;", "width", "", "height", "url", "", "attribution", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getWidth", "()I", "getHeight", "getUrl", "()Ljava/lang/String;", "getAttribution", "getDataSource", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gif implements MediaData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Gif> CREATOR = new Creator();
        private final String attribution;
        private final int height;
        private final String url;
        private final int width;

        /* compiled from: MediaData.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Gif> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gif createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gif(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Gif[] newArray(int i) {
                return new Gif[i];
            }
        }

        public static /* synthetic */ Gif copy$default(Gif gif, int i, int i2, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = gif.width;
            }
            if ((i3 & 2) != 0) {
                i2 = gif.height;
            }
            if ((i3 & 4) != 0) {
                str = gif.url;
            }
            if ((i3 & 8) != 0) {
                str2 = gif.attribution;
            }
            return gif.copy(i, i2, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAttribution() {
            return this.attribution;
        }

        public final Gif copy(int width, int height, String url, String attribution) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(attribution, "attribution");
            return new Gif(width, height, url, attribution);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gif)) {
                return false;
            }
            Gif gif = (Gif) other;
            return this.width == gif.width && this.height == gif.height && Intrinsics.areEqual(this.url, gif.url) && Intrinsics.areEqual(this.attribution, gif.attribution);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + this.url.hashCode()) * 31) + this.attribution.hashCode();
        }

        public String toString() {
            return "Gif(width=" + this.width + ", height=" + this.height + ", url=" + this.url + ", attribution=" + this.attribution + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.width);
            dest.writeInt(this.height);
            dest.writeString(this.url);
            dest.writeString(this.attribution);
        }

        public Gif(int i, int i2, String url, String attribution) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(attribution, "attribution");
            this.width = i;
            this.height = i2;
            this.url = url;
            this.attribution = attribution;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getAttribution() {
            return this.attribution;
        }

        @Override // io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData
        public String getDataSource() {
            return this.url;
        }
    }
}
