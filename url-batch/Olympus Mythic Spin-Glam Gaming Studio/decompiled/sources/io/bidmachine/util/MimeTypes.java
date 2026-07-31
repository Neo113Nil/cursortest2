package io.bidmachine.util;

import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MimeTypes.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020UJ\u0014\u0010V\u001a\u0004\u0018\u00010\u00042\b\u0010W\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010X\u001a\u00020Y2\u0006\u0010W\u001a\u00020\u0004J\u0010\u0010Z\u001a\u00020Y2\b\u0010W\u001a\u0004\u0018\u00010\u0004J\u0010\u0010[\u001a\u00020Y2\b\u0010W\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\\\u001a\u00020Y2\b\u0010W\u001a\u0004\u0018\u00010\u0004J\u0010\u0010]\u001a\u00020Y2\b\u0010W\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lio/bidmachine/util/MimeTypes;", "", "()V", "APPLICATION_OCTET_STREAM", "", "APPLICATION_PDF", "APPLICATION_ZIP", "AUDIO_AAC", "AUDIO_AC3", "AUDIO_AC4", "AUDIO_ALAC", "AUDIO_ALAW", "AUDIO_AMR", "AUDIO_AMR_NB", "AUDIO_AMR_WB", "AUDIO_DTS", "AUDIO_DTS_EXPRESS", "AUDIO_DTS_HD", "AUDIO_DTS_X", "AUDIO_EXOPLAYER_MIDI", "AUDIO_E_AC3", "AUDIO_E_AC3_JOC", "AUDIO_FLAC", "AUDIO_IAMF", "AUDIO_MATROSKA", "AUDIO_MIDI", "AUDIO_MLAW", "AUDIO_MP4", "AUDIO_MPEG", "AUDIO_MPEGH_MHA1", "AUDIO_MPEGH_MHM1", "AUDIO_MPEG_L1", "AUDIO_MPEG_L2", "AUDIO_MSGSM", "AUDIO_OGG", "AUDIO_OPUS", "AUDIO_RAW", "AUDIO_TRUEHD", "AUDIO_UNKNOWN", "AUDIO_VORBIS", "AUDIO_WAV", "AUDIO_WEBM", "BASE_TYPE_APPLICATION", "BASE_TYPE_AUDIO", "BASE_TYPE_IMAGE", "BASE_TYPE_VIDEO", "IMAGE_AVIF", "IMAGE_BMP", "IMAGE_GIF", "IMAGE_HEIC", "IMAGE_HEIF", "IMAGE_JPEG", "IMAGE_JPEG_R", "IMAGE_PNG", "IMAGE_RAW", "IMAGE_WEBP", "VIDEO_APV", "VIDEO_AV1", "VIDEO_AVI", "VIDEO_DIVX", "VIDEO_DOLBY_VISION", "VIDEO_FLV", "VIDEO_H263", "VIDEO_H264", "VIDEO_H265", "VIDEO_MATROSKA", "VIDEO_MJPEG", "VIDEO_MP2T", "VIDEO_MP4", "VIDEO_MP42", "VIDEO_MP43", "VIDEO_MP4V", "VIDEO_MPEG", "VIDEO_MPEG2", "VIDEO_MV_HEVC", "VIDEO_OGG", "VIDEO_PS", "VIDEO_RAW", "VIDEO_UNKNOWN", "VIDEO_VC1", "VIDEO_VP8", "VIDEO_VP9", "VIDEO_WEBM", "getMimeTypeFromContent", "file", "Ljava/io/File;", "getTopLevelType", "mimeType", "isApplication", "", "isAudio", "isImage", "isVideo", "isVisual", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class MimeTypes {

    @NotNull
    public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";

    @NotNull
    public static final String APPLICATION_PDF = "application/pdf";

    @NotNull
    public static final String APPLICATION_ZIP = "application/zip";

    @NotNull
    public static final String AUDIO_AAC = "audio/mp4a-latm";

    @NotNull
    public static final String AUDIO_AC3 = "audio/ac3";

    @NotNull
    public static final String AUDIO_AC4 = "audio/ac4";

    @NotNull
    public static final String AUDIO_ALAC = "audio/alac";

    @NotNull
    public static final String AUDIO_ALAW = "audio/g711-alaw";

    @NotNull
    public static final String AUDIO_AMR = "audio/amr";

    @NotNull
    public static final String AUDIO_AMR_NB = "audio/3gpp";

    @NotNull
    public static final String AUDIO_AMR_WB = "audio/amr-wb";

    @NotNull
    public static final String AUDIO_DTS = "audio/vnd.dts";

    @NotNull
    public static final String AUDIO_DTS_EXPRESS = "audio/vnd.dts.hd;profile=lbr";

    @NotNull
    public static final String AUDIO_DTS_HD = "audio/vnd.dts.hd";

    @NotNull
    public static final String AUDIO_DTS_X = "audio/vnd.dts.uhd;profile=p2";

    @NotNull
    public static final String AUDIO_EXOPLAYER_MIDI = "audio/x-exoplayer-midi";

    @NotNull
    public static final String AUDIO_E_AC3 = "audio/eac3";

    @NotNull
    public static final String AUDIO_E_AC3_JOC = "audio/eac3-joc";

    @NotNull
    public static final String AUDIO_FLAC = "audio/flac";

    @NotNull
    public static final String AUDIO_IAMF = "audio/iamf";

    @NotNull
    public static final String AUDIO_MATROSKA = "audio/x-matroska";

    @NotNull
    public static final String AUDIO_MIDI = "audio/midi";

    @NotNull
    public static final String AUDIO_MLAW = "audio/g711-mlaw";

    @NotNull
    public static final String AUDIO_MP4 = "audio/mp4";

    @NotNull
    public static final String AUDIO_MPEG = "audio/mpeg";

    @NotNull
    public static final String AUDIO_MPEGH_MHA1 = "audio/mha1";

    @NotNull
    public static final String AUDIO_MPEGH_MHM1 = "audio/mhm1";

    @NotNull
    public static final String AUDIO_MPEG_L1 = "audio/mpeg-L1";

    @NotNull
    public static final String AUDIO_MPEG_L2 = "audio/mpeg-L2";

    @NotNull
    public static final String AUDIO_MSGSM = "audio/gsm";

    @NotNull
    public static final String AUDIO_OGG = "audio/ogg";

    @NotNull
    public static final String AUDIO_OPUS = "audio/opus";

    @NotNull
    public static final String AUDIO_RAW = "audio/raw";

    @NotNull
    public static final String AUDIO_TRUEHD = "audio/true-hd";

    @NotNull
    public static final String AUDIO_UNKNOWN = "audio/x-unknown";

    @NotNull
    public static final String AUDIO_VORBIS = "audio/vorbis";

    @NotNull
    public static final String AUDIO_WAV = "audio/wav";

    @NotNull
    public static final String AUDIO_WEBM = "audio/webm";

    @NotNull
    public static final String BASE_TYPE_APPLICATION = "application";

    @NotNull
    public static final String BASE_TYPE_AUDIO = "audio";

    @NotNull
    public static final String BASE_TYPE_IMAGE = "image";

    @NotNull
    public static final String BASE_TYPE_VIDEO = "video";

    @NotNull
    public static final String IMAGE_AVIF = "image/avif";

    @NotNull
    public static final String IMAGE_BMP = "image/bmp";

    @NotNull
    public static final String IMAGE_GIF = "image/gif";

    @NotNull
    public static final String IMAGE_HEIC = "image/heic";

    @NotNull
    public static final String IMAGE_HEIF = "image/heif";

    @NotNull
    public static final String IMAGE_JPEG = "image/jpeg";

    @NotNull
    public static final String IMAGE_JPEG_R = "image/jpeg_r";

    @NotNull
    public static final String IMAGE_PNG = "image/png";

    @NotNull
    public static final String IMAGE_RAW = "image/raw";

    @NotNull
    public static final String IMAGE_WEBP = "image/webp";

    @NotNull
    public static final MimeTypes INSTANCE = new MimeTypes();

    @NotNull
    public static final String VIDEO_APV = "video/apv";

    @NotNull
    public static final String VIDEO_AV1 = "video/av01";

    @NotNull
    public static final String VIDEO_AVI = "video/x-msvideo";

    @NotNull
    public static final String VIDEO_DIVX = "video/divx";

    @NotNull
    public static final String VIDEO_DOLBY_VISION = "video/dolby-vision";

    @NotNull
    public static final String VIDEO_FLV = "video/x-flv";

    @NotNull
    public static final String VIDEO_H263 = "video/3gpp";

    @NotNull
    public static final String VIDEO_H264 = "video/avc";

    @NotNull
    public static final String VIDEO_H265 = "video/hevc";

    @NotNull
    public static final String VIDEO_MATROSKA = "video/x-matroska";

    @NotNull
    public static final String VIDEO_MJPEG = "video/mjpeg";

    @NotNull
    public static final String VIDEO_MP2T = "video/mp2t";

    @NotNull
    public static final String VIDEO_MP4 = "video/mp4";

    @NotNull
    public static final String VIDEO_MP42 = "video/mp42";

    @NotNull
    public static final String VIDEO_MP43 = "video/mp43";

    @NotNull
    public static final String VIDEO_MP4V = "video/mp4v-es";

    @NotNull
    public static final String VIDEO_MPEG = "video/mpeg";

    @NotNull
    public static final String VIDEO_MPEG2 = "video/mpeg2";

    @NotNull
    public static final String VIDEO_MV_HEVC = "video/mv-hevc";

    @NotNull
    public static final String VIDEO_OGG = "video/ogg";

    @NotNull
    public static final String VIDEO_PS = "video/mp2p";

    @NotNull
    public static final String VIDEO_RAW = "video/raw";

    @NotNull
    public static final String VIDEO_UNKNOWN = "video/x-unknown";

    @NotNull
    public static final String VIDEO_VC1 = "video/wvc1";

    @NotNull
    public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";

    @NotNull
    public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";

    @NotNull
    public static final String VIDEO_WEBM = "video/webm";

    private MimeTypes() {
    }

    public final boolean isVideo(@Nullable String mimeType) {
        return Intrinsics.areEqual("video", getTopLevelType(mimeType));
    }

    public final boolean isAudio(@Nullable String mimeType) {
        return Intrinsics.areEqual("audio", getTopLevelType(mimeType));
    }

    public final boolean isImage(@Nullable String mimeType) {
        return Intrinsics.areEqual("image", getTopLevelType(mimeType));
    }

    public final boolean isVisual(@Nullable String mimeType) {
        return isVideo(mimeType) || isImage(mimeType);
    }

    public final boolean isApplication(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return Intrinsics.areEqual("application", getTopLevelType(mimeType));
    }

    private final String getTopLevelType(String mimeType) {
        int indexOf$default;
        if (mimeType == null || (indexOf$default = StringsKt.indexOf$default((CharSequence) mimeType, '/', 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        String substring = mimeType.substring(0, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final String getMimeTypeFromContent(@NotNull File file) {
        int i;
        Intrinsics.checkNotNullParameter(file, "file");
        byte[] bArr = new byte[16];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                i = fileInputStream.read(bArr);
                CloseableKt.closeFinally(fileInputStream, null);
            } finally {
            }
        } catch (Exception unused) {
            i = -1;
        }
        if (i < 4) {
            return APPLICATION_OCTET_STREAM;
        }
        if (i < 16) {
            bArr = Arrays.copyOf(bArr, i);
            Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(this, newSize)");
        }
        if (getMimeTypeFromContent$startsWith(bArr, 255, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 255)) {
            return "image/jpeg";
        }
        if (getMimeTypeFromContent$startsWith(bArr, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 80, 78, 71)) {
            return "image/png";
        }
        if (getMimeTypeFromContent$startsWith(bArr, 71, 73, 70)) {
            return IMAGE_GIF;
        }
        if (getMimeTypeFromContent$startsWith(bArr, 82, 73, 70, 70) && getMimeTypeFromContent$matchAt(bArr, 8, 87, 69, 66, 80)) {
            return "image/webp";
        }
        if (getMimeTypeFromContent$startsWith(bArr, 0, 0, 0, 24, 102, 116, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 112, 109, 112, 52) || getMimeTypeFromContent$startsWith(bArr, 0, 0, 0, 32, 102, 116, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 112, 109, 112, 52)) {
            return "video/mp4";
        }
        if (getMimeTypeFromContent$startsWith(bArr, 26, 69, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 163)) {
            return "video/webm";
        }
        if (getMimeTypeFromContent$startsWith(bArr, 82, 73, 70, 70) && getMimeTypeFromContent$matchAt(bArr, 8, 65, 86, 73, 32)) {
            return "video/avi";
        }
        if (getMimeTypeFromContent$startsWith(bArr, 73, 68, 51) || getMimeTypeFromContent$startsWith(bArr, 255, 251) || getMimeTypeFromContent$startsWith(bArr, 255, 243)) {
            return "audio/mpeg";
        }
        if (getMimeTypeFromContent$startsWith(bArr, 37, 80, 68, 70)) {
            return APPLICATION_PDF;
        }
        if (!getMimeTypeFromContent$startsWith(bArr, 80, 75, 3, 4) && !getMimeTypeFromContent$startsWith(bArr, 80, 75, 5, 6) && !getMimeTypeFromContent$startsWith(bArr, 80, 75, 7, 8)) {
            return APPLICATION_OCTET_STREAM;
        }
        return APPLICATION_ZIP;
    }

    private static final boolean getMimeTypeFromContent$startsWith(byte[] bArr, int... iArr) {
        if (bArr.length < iArr.length) {
            return false;
        }
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if ((bArr[i] & 255) != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    private static final boolean getMimeTypeFromContent$matchAt(byte[] bArr, int i, int... iArr) {
        if (i < 0 || bArr.length < iArr.length + i) {
            return false;
        }
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if ((bArr[i + i2] & 255) != iArr[i2]) {
                return false;
            }
        }
        return true;
    }
}
