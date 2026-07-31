package io.intercom.android.sdk.lightcompressor.compressor;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.lightcompressor.CompressionProgressListener;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.utils.CompressorUtils;
import io.intercom.android.sdk.lightcompressor.utils.StreamableVideo;
import io.intercom.android.sdk.lightcompressor.video.InputSurface;
import io.intercom.android.sdk.lightcompressor.video.OutputSurface;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Compressor.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJb\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0005H\u0002J \u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%H\u0002J0\u0010,\u001a\u00020-2\u0006\u0010*\u001a\u00020+2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u0002002\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\fH\u0002J\u0018\u00106\u001a\u0002022\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0002J8\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u0002022\u0006\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?2\u0006\u00108\u001a\u0002092\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006@"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/compressor/Compressor;", "", "<init>", "()V", "MIN_BITRATE", "", "MIME_TYPE", "", "MEDIACODEC_TIMEOUT_DEFAULT", "", "INVALID_BITRATE", "isRunning", "", "()Z", "setRunning", "(Z)V", "compressVideo", "Lio/intercom/android/sdk/lightcompressor/video/Result;", FirebaseAnalytics.Param.INDEX, "context", "Landroid/content/Context;", "srcUri", "Landroid/net/Uri;", "destination", "streamableFile", "configuration", "Lio/intercom/android/sdk/lightcompressor/config/Configuration;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/intercom/android/sdk/lightcompressor/CompressionProgressListener;", "(ILandroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/lightcompressor/config/Configuration;Lio/intercom/android/sdk/lightcompressor/CompressionProgressListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "id", "newWidth", "newHeight", "newBitrate", "disableAudio", "extractor", "Landroid/media/MediaExtractor;", "compressionProgressListener", TypedValues.TransitionType.S_DURATION, "rotation", "addAudioTrack", "mediaMuxer", "Landroid/media/MediaMuxer;", "processAudio", "", "audioTrackIndex", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "prepareEncoder", "Landroid/media/MediaCodec;", "outputFormat", "Landroid/media/MediaFormat;", "hasQTI", "prepareDecoder", "inputFormat", "outputSurface", "Lio/intercom/android/sdk/lightcompressor/video/OutputSurface;", "dispose", "videoIndex", "decoder", "encoder", "inputSurface", "Lio/intercom/android/sdk/lightcompressor/video/InputSurface;", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Compressor {
    private static final String INVALID_BITRATE = "The provided bitrate is smaller than what is needed for compression try to set isMinBitRateEnabled to false";
    private static final long MEDIACODEC_TIMEOUT_DEFAULT = 100;
    private static final String MIME_TYPE = "video/avc";
    private static final int MIN_BITRATE = 2000000;
    public static final Compressor INSTANCE = new Compressor();
    private static boolean isRunning = true;

    private Compressor() {
    }

    public final boolean isRunning() {
        return isRunning;
    }

    public final void setRunning(boolean z) {
        isRunning = z;
    }

    public final Object compressVideo(int i, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionProgressListener compressionProgressListener, Continuation<? super Result> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new Compressor$compressVideo$2(context, uri, i, configuration, str, str2, compressionProgressListener, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f4, code lost:
    
        r1 = r29;
        r2 = r34;
        r4 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Result start(int id, int newWidth, int newHeight, String destination, int newBitrate, String streamableFile, boolean disableAudio, MediaExtractor extractor, CompressionProgressListener compressionProgressListener, long duration, int rotation) {
        InputSurface inputSurface;
        OutputSurface outputSurface;
        MediaCodec prepareDecoder;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        MediaMuxer mediaMuxer;
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        boolean z4;
        MediaCodec mediaCodec3;
        int i3;
        MediaCodec mediaCodec4;
        boolean z5;
        int dequeueOutputBuffer;
        boolean z6;
        boolean z7;
        int i4;
        MediaCodec mediaCodec5;
        int dequeueInputBuffer;
        Compressor compressor = this;
        int i5 = id;
        if (newWidth != 0 && newHeight != 0) {
            File file = new File(destination);
            try {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                MediaMuxer mediaMuxer2 = new MediaMuxer(destination, 0);
                if (rotation != 0) {
                    mediaMuxer2.setOrientationHint(rotation);
                }
                int findTrack = CompressorUtils.INSTANCE.findTrack(extractor, true);
                extractor.selectTrack(findTrack);
                extractor.seekTo(0L, 0);
                MediaFormat trackFormat = extractor.getTrackFormat(findTrack);
                Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", newWidth, newHeight);
                Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(...)");
                CompressorUtils.INSTANCE.setOutputFileParameters(trackFormat, createVideoFormat, newBitrate);
                MediaCodec prepareEncoder = compressor.prepareEncoder(createVideoFormat, CompressorUtils.INSTANCE.hasQTI());
                try {
                    inputSurface = new InputSurface(prepareEncoder.createInputSurface());
                    inputSurface.makeCurrent();
                    prepareEncoder.start();
                    outputSurface = new OutputSurface();
                    prepareDecoder = compressor.prepareDecoder(trackFormat, outputSurface);
                    prepareDecoder.start();
                    z = false;
                    z2 = false;
                    z3 = false;
                    i = -1;
                    i2 = -5;
                } catch (Exception e) {
                    e = e;
                }
                while (!z) {
                    if (z2) {
                        mediaCodec = prepareEncoder;
                    } else {
                        int sampleTrackIndex = extractor.getSampleTrackIndex();
                        if (sampleTrackIndex == findTrack) {
                            mediaCodec = prepareEncoder;
                            int dequeueInputBuffer2 = prepareDecoder.dequeueInputBuffer(100L);
                            if (dequeueInputBuffer2 >= 0) {
                                ByteBuffer inputBuffer = prepareDecoder.getInputBuffer(dequeueInputBuffer2);
                                Intrinsics.checkNotNull(inputBuffer);
                                int readSampleData = extractor.readSampleData(inputBuffer, 0);
                                if (readSampleData < 0) {
                                    mediaCodec2 = prepareDecoder;
                                    mediaCodec2.queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
                                    z2 = true;
                                } else {
                                    MediaCodec mediaCodec6 = prepareDecoder;
                                    mediaCodec6.queueInputBuffer(dequeueInputBuffer2, 0, readSampleData, extractor.getSampleTime(), 0);
                                    mediaCodec5 = mediaCodec6;
                                    extractor.advance();
                                    mediaCodec2 = mediaCodec5;
                                }
                            }
                        } else {
                            mediaCodec = prepareEncoder;
                            mediaCodec5 = prepareDecoder;
                            if (sampleTrackIndex == -1 && (dequeueInputBuffer = mediaCodec5.dequeueInputBuffer(100L)) >= 0) {
                                mediaCodec2 = mediaCodec5;
                                mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                z2 = true;
                            }
                            mediaCodec2 = mediaCodec5;
                        }
                        z4 = true;
                        boolean z8 = true;
                        while (true) {
                            if (!z4 && !z8) {
                                break;
                            }
                            if (isRunning) {
                                dispose(findTrack, mediaCodec2, mediaCodec, inputSurface, outputSurface, extractor);
                                compressionProgressListener.onProgressCancelled(i5);
                                return new Result(id, false, "The compression has stopped!", 0L, null, 24, null);
                            }
                            try {
                                mediaCodec3 = mediaCodec2;
                                i3 = findTrack;
                                mediaCodec4 = mediaCodec;
                                boolean z9 = z;
                                z5 = z4;
                                int i6 = i;
                                int i7 = i2;
                                dequeueOutputBuffer = mediaCodec4.dequeueOutputBuffer(bufferInfo, 100L);
                                if (dequeueOutputBuffer == -1) {
                                    z6 = z9;
                                    i = i6;
                                    i2 = i7;
                                    z8 = false;
                                    i4 = -1;
                                    z7 = false;
                                } else {
                                    if (dequeueOutputBuffer == -2) {
                                        MediaFormat outputFormat = mediaCodec4.getOutputFormat();
                                        Intrinsics.checkNotNullExpressionValue(outputFormat, "getOutputFormat(...)");
                                        if (i7 == -5) {
                                            int addTrack = mediaMuxer2.addTrack(outputFormat);
                                            i = i6 == -1 ? addAudioTrack(mediaMuxer2, disableAudio, extractor) : i6;
                                            if (z3) {
                                                z6 = z9;
                                                i2 = addTrack;
                                                z7 = false;
                                                i4 = -1;
                                            } else {
                                                mediaMuxer2.start();
                                                z6 = z9;
                                                i2 = addTrack;
                                                z7 = false;
                                                i4 = -1;
                                                z3 = true;
                                            }
                                        }
                                    } else if (dequeueOutputBuffer != -3) {
                                        if (dequeueOutputBuffer < 0) {
                                            throw new RuntimeException("unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
                                        }
                                        ByteBuffer outputBuffer = mediaCodec4.getOutputBuffer(dequeueOutputBuffer);
                                        if (outputBuffer == null) {
                                            throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                                        }
                                        if (bufferInfo.size > 1 && (bufferInfo.flags & 2) == 0 && z3) {
                                            mediaMuxer2.writeSampleData(i7, outputBuffer, bufferInfo);
                                        }
                                        z6 = (bufferInfo.flags & 4) != 0;
                                        z7 = false;
                                        mediaCodec4.releaseOutputBuffer(dequeueOutputBuffer, false);
                                        i = i6;
                                        i2 = i7;
                                        i4 = -1;
                                    }
                                    z7 = false;
                                    z6 = z9;
                                    i = i6;
                                    i2 = i7;
                                    i4 = -1;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                            if (dequeueOutputBuffer == i4) {
                                int dequeueOutputBuffer2 = mediaCodec3.dequeueOutputBuffer(bufferInfo, 100L);
                                if (dequeueOutputBuffer2 == i4) {
                                    mediaCodec2 = mediaCodec3;
                                    findTrack = i3;
                                    mediaCodec = mediaCodec4;
                                    z4 = z7;
                                    z = z6;
                                    i5 = id;
                                } else if (dequeueOutputBuffer2 != -3 && dequeueOutputBuffer2 != -2) {
                                    if (dequeueOutputBuffer2 < 0) {
                                        throw new RuntimeException("unexpected result from decoder.dequeueOutputBuffer: " + dequeueOutputBuffer2);
                                    }
                                    boolean z10 = bufferInfo.size != 0 ? true : z7;
                                    mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer2, z10);
                                    if (z10) {
                                        try {
                                            outputSurface.awaitNewImage();
                                            outputSurface.drawImage();
                                            inputSurface.setPresentationTime(bufferInfo.presentationTimeUs * 1000);
                                            i5 = id;
                                            compressionProgressListener.onProgressChanged(i5, (bufferInfo.presentationTimeUs / duration) * 100);
                                            inputSurface.swapBuffers();
                                        } catch (Exception e3) {
                                            i5 = id;
                                            String message = e3.getMessage();
                                            if (message == null) {
                                                message = "Compression failed at swapping buffer";
                                            }
                                            Log.e("Compressor", message);
                                        }
                                    } else {
                                        i5 = id;
                                    }
                                    if ((bufferInfo.flags & 4) != 0) {
                                        mediaCodec4.signalEndOfInputStream();
                                        mediaCodec2 = mediaCodec3;
                                        findTrack = i3;
                                        mediaCodec = mediaCodec4;
                                        z = z6;
                                        z4 = false;
                                    } else {
                                        mediaCodec2 = mediaCodec3;
                                        findTrack = i3;
                                        z4 = z5;
                                        mediaCodec = mediaCodec4;
                                        z = z6;
                                    }
                                    e = e;
                                    CompressorUtils.INSTANCE.printException(e);
                                    return new Result(id, false, e.getMessage(), 0L, null, 24, null);
                                }
                            }
                            i5 = id;
                            mediaCodec2 = mediaCodec3;
                            findTrack = i3;
                            z4 = z5;
                            mediaCodec = mediaCodec4;
                            z = z6;
                        }
                    }
                    mediaCodec2 = prepareDecoder;
                    z4 = true;
                    boolean z82 = true;
                    while (true) {
                        if (!z4) {
                        }
                        if (isRunning) {
                        }
                    }
                }
                compressor.dispose(findTrack, prepareDecoder, prepareEncoder, inputSurface, outputSurface, extractor);
                if (z3) {
                    mediaMuxer = mediaMuxer2;
                    processAudio(mediaMuxer, i, bufferInfo, disableAudio, extractor);
                } else {
                    mediaMuxer = mediaMuxer2;
                }
                extractor.release();
                try {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                } catch (Exception e4) {
                    CompressorUtils.INSTANCE.printException(e4);
                }
            } catch (Exception e5) {
                CompressorUtils.INSTANCE.printException(e5);
            }
            if (streamableFile != null) {
                try {
                    boolean start = StreamableVideo.INSTANCE.start(file, new File(streamableFile));
                    File file2 = new File(streamableFile);
                    if (start) {
                        try {
                            if (file.exists()) {
                                file.delete();
                            }
                        } catch (Exception e6) {
                            e = e6;
                            file = file2;
                            CompressorUtils.INSTANCE.printException(e);
                            return new Result(id, true, null, file.length(), file.getPath());
                        }
                    }
                    file = file2;
                } catch (Exception e7) {
                    e = e7;
                }
            }
            return new Result(id, true, null, file.length(), file.getPath());
        }
        return new Result(id, false, "Something went wrong, please try again", 0L, null, 24, null);
    }

    private final int addAudioTrack(MediaMuxer mediaMuxer, boolean disableAudio, MediaExtractor extractor) {
        int findTrack = CompressorUtils.INSTANCE.findTrack(extractor, false);
        if (findTrack < 0 || disableAudio) {
            return -1;
        }
        MediaFormat trackFormat = extractor.getTrackFormat(findTrack);
        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
        return mediaMuxer.addTrack(trackFormat);
    }

    private final void processAudio(MediaMuxer mediaMuxer, int audioTrackIndex, MediaCodec.BufferInfo bufferInfo, boolean disableAudio, MediaExtractor extractor) {
        int sampleSize;
        int findTrack = CompressorUtils.INSTANCE.findTrack(extractor, false);
        if (findTrack < 0 || disableAudio || audioTrackIndex < 0) {
            return;
        }
        extractor.selectTrack(findTrack);
        MediaFormat trackFormat = extractor.getTrackFormat(findTrack);
        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
        int integer = trackFormat.getInteger("max-input-size");
        if (integer <= 0) {
            integer = 65536;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(integer);
        Intrinsics.checkNotNullExpressionValue(allocateDirect, "allocateDirect(...)");
        if (Build.VERSION.SDK_INT >= 28 && (sampleSize = (int) extractor.getSampleSize()) > integer) {
            allocateDirect = ByteBuffer.allocateDirect(sampleSize + 1024);
        }
        extractor.seekTo(0L, 0);
        boolean z = false;
        while (!z) {
            int sampleTrackIndex = extractor.getSampleTrackIndex();
            if (sampleTrackIndex == findTrack) {
                bufferInfo.size = extractor.readSampleData(allocateDirect, 0);
                if (bufferInfo.size >= 0) {
                    bufferInfo.presentationTimeUs = extractor.getSampleTime();
                    bufferInfo.offset = 0;
                    bufferInfo.flags = 1;
                    mediaMuxer.writeSampleData(audioTrackIndex, allocateDirect, bufferInfo);
                    extractor.advance();
                } else {
                    bufferInfo.size = 0;
                    z = true;
                }
            } else if (sampleTrackIndex == -1) {
                z = true;
            }
        }
        extractor.unselectTrack(findTrack);
    }

    private final MediaCodec prepareEncoder(MediaFormat outputFormat, boolean hasQTI) {
        MediaCodec createEncoderByType;
        if (hasQTI) {
            createEncoderByType = MediaCodec.createByCodecName("c2.android.avc.encoder");
        } else {
            createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        }
        Intrinsics.checkNotNull(createEncoderByType);
        try {
            createEncoderByType.configure(outputFormat, (Surface) null, (MediaCrypto) null, 1);
            return createEncoderByType;
        } catch (Exception unused) {
            MediaCodec createEncoderByType2 = MediaCodec.createEncoderByType("video/avc");
            createEncoderByType2.configure(outputFormat, (Surface) null, (MediaCrypto) null, 1);
            return createEncoderByType2;
        }
    }

    private final MediaCodec prepareDecoder(MediaFormat inputFormat, OutputSurface outputSurface) {
        String string = inputFormat.getString("mime");
        Intrinsics.checkNotNull(string);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
        Intrinsics.checkNotNullExpressionValue(createDecoderByType, "createDecoderByType(...)");
        createDecoderByType.configure(inputFormat, outputSurface.getMSurface(), (MediaCrypto) null, 0);
        return createDecoderByType;
    }

    private final void dispose(int videoIndex, MediaCodec decoder, MediaCodec encoder, InputSurface inputSurface, OutputSurface outputSurface, MediaExtractor extractor) {
        extractor.unselectTrack(videoIndex);
        decoder.stop();
        decoder.release();
        encoder.stop();
        encoder.release();
        inputSurface.release();
        outputSurface.release();
    }
}
