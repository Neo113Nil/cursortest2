package io.intercom.android.sdk.m5.conversation.usecase;

import android.net.Uri;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioRecordingUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/RecordedAudioFile;", "", "file", "Ljava/io/File;", "uri", "Landroid/net/Uri;", "<init>", "(Ljava/io/File;Landroid/net/Uri;)V", "getFile", "()Ljava/io/File;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RecordedAudioFile {
    public static final int $stable = 8;
    private final File file;
    private final Uri uri;

    public static /* synthetic */ RecordedAudioFile copy$default(RecordedAudioFile recordedAudioFile, File file, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            file = recordedAudioFile.file;
        }
        if ((i & 2) != 0) {
            uri = recordedAudioFile.uri;
        }
        return recordedAudioFile.copy(file, uri);
    }

    /* renamed from: component1, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public final RecordedAudioFile copy(File file, Uri uri) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new RecordedAudioFile(file, uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordedAudioFile)) {
            return false;
        }
        RecordedAudioFile recordedAudioFile = (RecordedAudioFile) other;
        return Intrinsics.areEqual(this.file, recordedAudioFile.file) && Intrinsics.areEqual(this.uri, recordedAudioFile.uri);
    }

    public int hashCode() {
        return (this.file.hashCode() * 31) + this.uri.hashCode();
    }

    public String toString() {
        return "RecordedAudioFile(file=" + this.file + ", uri=" + this.uri + ')';
    }

    public RecordedAudioFile(File file, Uri uri) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.file = file;
        this.uri = uri;
    }

    public final File getFile() {
        return this.file;
    }

    public final Uri getUri() {
        return this.uri;
    }
}
