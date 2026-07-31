package io.intercom.android.sdk.ui.preview.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IntercomPreviewArgs.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "Landroid/os/Parcelable;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "getMimeType", "", "context", "Landroid/content/Context;", "isImage", "", "isVideo", "LocalFile", "NetworkFile", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$LocalFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class IntercomPreviewFile implements Parcelable {
    public static final int $stable = 8;
    private final Uri uri;

    public /* synthetic */ IntercomPreviewFile(Uri uri, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri);
    }

    /* compiled from: IntercomPreviewArgs.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$LocalFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "fileUri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getFileUri", "()Landroid/net/Uri;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalFile extends IntercomPreviewFile {
        public static final int $stable = 8;
        public static final Parcelable.Creator<LocalFile> CREATOR = new Creator();
        private final Uri fileUri;

        /* compiled from: IntercomPreviewArgs.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LocalFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocalFile((Uri) parcel.readParcelable(LocalFile.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocalFile[] newArray(int i) {
                return new LocalFile[i];
            }
        }

        public static /* synthetic */ LocalFile copy$default(LocalFile localFile, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = localFile.fileUri;
            }
            return localFile.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getFileUri() {
            return this.fileUri;
        }

        public final LocalFile copy(Uri fileUri) {
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            return new LocalFile(fileUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LocalFile) && Intrinsics.areEqual(this.fileUri, ((LocalFile) other).fileUri);
        }

        public int hashCode() {
            return this.fileUri.hashCode();
        }

        public String toString() {
            return "LocalFile(fileUri=" + this.fileUri + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.fileUri, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalFile(Uri fileUri) {
            super(fileUri, null);
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            this.fileUri = fileUri;
        }

        public final Uri getFileUri() {
            return this.fileUri;
        }
    }

    private IntercomPreviewFile(Uri uri) {
        this.uri = uri;
    }

    public final Uri getUri() {
        return this.uri;
    }

    /* compiled from: IntercomPreviewArgs.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile$NetworkFile;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "url", "", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getMimeType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NetworkFile extends IntercomPreviewFile {
        public static final int $stable = 0;
        public static final Parcelable.Creator<NetworkFile> CREATOR = new Creator();
        private final String mimeType;
        private final String url;

        /* compiled from: IntercomPreviewArgs.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NetworkFile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NetworkFile(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkFile[] newArray(int i) {
                return new NetworkFile[i];
            }
        }

        public static /* synthetic */ NetworkFile copy$default(NetworkFile networkFile, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = networkFile.url;
            }
            if ((i & 2) != 0) {
                str2 = networkFile.mimeType;
            }
            return networkFile.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        public final NetworkFile copy(String url, String mimeType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            return new NetworkFile(url, mimeType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkFile)) {
                return false;
            }
            NetworkFile networkFile = (NetworkFile) other;
            return Intrinsics.areEqual(this.url, networkFile.url) && Intrinsics.areEqual(this.mimeType, networkFile.mimeType);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.mimeType.hashCode();
        }

        public String toString() {
            return "NetworkFile(url=" + this.url + ", mimeType=" + this.mimeType + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.url);
            dest.writeString(this.mimeType);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public NetworkFile(String url, String mimeType) {
            super(r0, null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            this.url = url;
            this.mimeType = mimeType;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    public final String getMimeType(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this instanceof LocalFile) {
            String type = context.getContentResolver().getType(this.uri);
            return type == null ? "application/*" : type;
        }
        if (this instanceof NetworkFile) {
            return ((NetworkFile) this).getMimeType();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isImage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StringsKt.contains$default((CharSequence) getMimeType(context), (CharSequence) "image", false, 2, (Object) null);
    }

    public final boolean isVideo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StringsKt.contains$default((CharSequence) getMimeType(context), (CharSequence) "video", false, 2, (Object) null);
    }
}
