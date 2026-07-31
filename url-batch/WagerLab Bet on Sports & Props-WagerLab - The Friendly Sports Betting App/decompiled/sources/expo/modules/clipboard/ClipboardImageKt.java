package expo.modules.clipboard;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.YieldKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: ClipboardImage.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0080@¢\u0006\u0002\u0010\u000e\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0000\u001a&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0080@¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0080@¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u001b\u001a\u00020\u001c*\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"PNG_PREFIX", "", "JPEG_PREFIX", "getImageFormatFromBase64", "Lexpo/modules/clipboard/ImageFormat;", "base64Image", "imageFromContentUri", "Lexpo/modules/clipboard/ImageResult;", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/clipboard/GetImageOptions;", "(Landroid/content/Context;Landroid/net/Uri;Lexpo/modules/clipboard/GetImageOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearClipboardCache", "", "clipboardCacheDir", "Ljava/io/File;", "hashFileName", "clipDataFromBase64Image", "Landroid/content/ClipData;", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bitmapFromContentUriAsync", "Landroid/graphics/Bitmap;", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bitmapFromBase64String", "ensureExists", "", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-clipboard_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClipboardImageKt {
    public static final String JPEG_PREFIX = "/9j/";
    public static final String PNG_PREFIX = "iVBORw0K";

    /* compiled from: ClipboardImage.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            try {
                iArr[ImageFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageFormat.JPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImageFormat getImageFormatFromBase64(String base64Image) {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        String substring = base64Image.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return StringsKt.startsWith$default(substring, PNG_PREFIX, false, 2, (Object) null) ? ImageFormat.PNG : StringsKt.startsWith$default(substring, JPEG_PREFIX, false, 2, (Object) null) ? ImageFormat.JPG : ImageFormat.JPG;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object imageFromContentUri(Context context, Uri uri, GetImageOptions getImageOptions, Continuation<? super ImageResult> continuation) {
        ClipboardImageKt$imageFromContentUri$1 clipboardImageKt$imageFromContentUri$1;
        Object coroutine_suspended;
        int i;
        ImageFormat imageFormat;
        Bitmap bitmap;
        ByteArrayOutputStream byteArrayOutputStream;
        if (continuation instanceof ClipboardImageKt$imageFromContentUri$1) {
            clipboardImageKt$imageFromContentUri$1 = (ClipboardImageKt$imageFromContentUri$1) continuation;
            if ((clipboardImageKt$imageFromContentUri$1.label & Integer.MIN_VALUE) != 0) {
                clipboardImageKt$imageFromContentUri$1.label -= Integer.MIN_VALUE;
                Object obj = clipboardImageKt$imageFromContentUri$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = clipboardImageKt$imageFromContentUri$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    clipboardImageKt$imageFromContentUri$1.L$0 = getImageOptions;
                    clipboardImageKt$imageFromContentUri$1.label = 1;
                    obj = bitmapFromContentUriAsync(context, uri, clipboardImageKt$imageFromContentUri$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        byteArrayOutputStream = (ByteArrayOutputStream) clipboardImageKt$imageFromContentUri$1.L$2;
                        imageFormat = (ImageFormat) clipboardImageKt$imageFromContentUri$1.L$1;
                        bitmap = (Bitmap) clipboardImageKt$imageFromContentUri$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        String str = ("data:" + imageFormat.getMimeType() + ";base64,") + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                        return new ImageResult(str, bitmap.getWidth(), bitmap.getHeight());
                    }
                    getImageOptions = (GetImageOptions) clipboardImageKt$imageFromContentUri$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Bitmap bitmap2 = (Bitmap) obj;
                imageFormat = getImageOptions.getImageFormat();
                int jpegQuality = (int) (getImageOptions.getJpegQuality() * 100);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bitmap2.compress(imageFormat.getCompressFormat(), jpegQuality, byteArrayOutputStream2);
                clipboardImageKt$imageFromContentUri$1.L$0 = bitmap2;
                clipboardImageKt$imageFromContentUri$1.L$1 = imageFormat;
                clipboardImageKt$imageFromContentUri$1.L$2 = byteArrayOutputStream2;
                clipboardImageKt$imageFromContentUri$1.label = 2;
                if (YieldKt.yield(clipboardImageKt$imageFromContentUri$1) != coroutine_suspended) {
                    bitmap = bitmap2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    String str2 = ("data:" + imageFormat.getMimeType() + ";base64,") + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
                    return new ImageResult(str2, bitmap.getWidth(), bitmap.getHeight());
                }
                return coroutine_suspended;
            }
        }
        clipboardImageKt$imageFromContentUri$1 = new ClipboardImageKt$imageFromContentUri$1(continuation);
        Object obj2 = clipboardImageKt$imageFromContentUri$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = clipboardImageKt$imageFromContentUri$1.label;
        if (i != 0) {
        }
        Bitmap bitmap22 = (Bitmap) obj2;
        imageFormat = getImageOptions.getImageFormat();
        int jpegQuality2 = (int) (getImageOptions.getJpegQuality() * 100);
        ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
        bitmap22.compress(imageFormat.getCompressFormat(), jpegQuality2, byteArrayOutputStream22);
        clipboardImageKt$imageFromContentUri$1.L$0 = bitmap22;
        clipboardImageKt$imageFromContentUri$1.L$1 = imageFormat;
        clipboardImageKt$imageFromContentUri$1.L$2 = byteArrayOutputStream22;
        clipboardImageKt$imageFromContentUri$1.label = 2;
        if (YieldKt.yield(clipboardImageKt$imageFromContentUri$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static final void clearClipboardCache(File clipboardCacheDir) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(clipboardCacheDir, "clipboardCacheDir");
        if (clipboardCacheDir.exists() && clipboardCacheDir.isDirectory() && (listFiles = clipboardCacheDir.listFiles()) != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    Intrinsics.checkNotNull(file);
                    FilesKt.deleteRecursively(file);
                } else {
                    file.delete();
                }
            }
        }
    }

    public static final String hashFileName() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String str = "copied_image" + ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence hashFileName$lambda$3;
                hashFileName$lambda$3 = ClipboardImageKt.hashFileName$lambda$3(((Byte) obj).byteValue());
                return hashFileName$lambda$3;
            }
        }, 30, (Object) null);
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(digest);
        return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence hashFileName$lambda$4;
                hashFileName$lambda$4 = ClipboardImageKt.hashFileName$lambda$4(((Byte) obj).byteValue());
                return hashFileName$lambda$4;
            }
        }, 30, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hashFileName$lambda$3(byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hashFileName$lambda$4(byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        if (r12 != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object clipDataFromBase64Image(Context context, String str, File file, Continuation<? super ClipData> continuation) {
        ClipboardImageKt$clipDataFromBase64Image$1 clipboardImageKt$clipDataFromBase64Image$1;
        int i;
        ImageFormat imageFormatFromBase64;
        String str2;
        Context context2;
        Bitmap bitmap;
        final File file2;
        Closeable closeable;
        File file3;
        Context context3;
        if (continuation instanceof ClipboardImageKt$clipDataFromBase64Image$1) {
            clipboardImageKt$clipDataFromBase64Image$1 = (ClipboardImageKt$clipDataFromBase64Image$1) continuation;
            if ((clipboardImageKt$clipDataFromBase64Image$1.label & Integer.MIN_VALUE) != 0) {
                clipboardImageKt$clipDataFromBase64Image$1.label -= Integer.MIN_VALUE;
                Object obj = clipboardImageKt$clipDataFromBase64Image$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = clipboardImageKt$clipDataFromBase64Image$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Bitmap bitmapFromBase64String = bitmapFromBase64String(str);
                    imageFormatFromBase64 = getImageFormatFromBase64(str);
                    clearClipboardCache(file);
                    String hashFileName = hashFileName();
                    int i2 = WhenMappings.$EnumSwitchMapping$0[imageFormatFromBase64.ordinal()];
                    if (i2 == 1) {
                        str2 = hashFileName + ".png";
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = hashFileName + ".jpeg";
                    }
                    File file4 = new File(file, str2);
                    clipboardImageKt$clipDataFromBase64Image$1.L$0 = context;
                    clipboardImageKt$clipDataFromBase64Image$1.L$1 = bitmapFromBase64String;
                    clipboardImageKt$clipDataFromBase64Image$1.L$2 = imageFormatFromBase64;
                    clipboardImageKt$clipDataFromBase64Image$1.L$3 = file4;
                    clipboardImageKt$clipDataFromBase64Image$1.label = 1;
                    if (ensureExists(file4, clipboardImageKt$clipDataFromBase64Image$1) != coroutine_suspended) {
                        context2 = context;
                        bitmap = bitmapFromBase64String;
                        file2 = file4;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeable = (Closeable) clipboardImageKt$clipDataFromBase64Image$1.L$2;
                        file3 = (File) clipboardImageKt$clipDataFromBase64Image$1.L$1;
                        context3 = (Context) clipboardImageKt$clipDataFromBase64Image$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(closeable, null);
                            ClipData newUri = ClipData.newUri(context3.getContentResolver(), "image", ClipboardFileProvider.INSTANCE.getUriForFile(context3, context3.getApplicationInfo().packageName + ".ClipboardFileProvider", file3));
                            Intrinsics.checkNotNullExpressionValue(newUri, "newUri(...)");
                            return newUri;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(closeable, th);
                                throw th2;
                            }
                        }
                    }
                    file2 = (File) clipboardImageKt$clipDataFromBase64Image$1.L$3;
                    imageFormatFromBase64 = (ImageFormat) clipboardImageKt$clipDataFromBase64Image$1.L$2;
                    bitmap = (Bitmap) clipboardImageKt$clipDataFromBase64Image$1.L$1;
                    context2 = (Context) clipboardImageKt$clipDataFromBase64Image$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((FileOutputStream) obj);
                    try {
                        final BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
                        bitmap.compress(imageFormatFromBase64.getCompressFormat(), 100, bufferedOutputStream2);
                        Function0 function0 = new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit clipDataFromBase64Image$lambda$8$lambda$7;
                                clipDataFromBase64Image$lambda$8$lambda$7 = ClipboardImageKt.clipDataFromBase64Image$lambda$8$lambda$7(bufferedOutputStream2);
                                return clipDataFromBase64Image$lambda$8$lambda$7;
                            }
                        };
                        clipboardImageKt$clipDataFromBase64Image$1.L$0 = context2;
                        clipboardImageKt$clipDataFromBase64Image$1.L$1 = file2;
                        clipboardImageKt$clipDataFromBase64Image$1.L$2 = bufferedOutputStream;
                        clipboardImageKt$clipDataFromBase64Image$1.L$3 = null;
                        clipboardImageKt$clipDataFromBase64Image$1.label = 3;
                        if (InterruptibleKt.runInterruptible$default(null, function0, clipboardImageKt$clipDataFromBase64Image$1, 1, null) != coroutine_suspended) {
                            file3 = file2;
                            closeable = bufferedOutputStream;
                            context3 = context2;
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(closeable, null);
                            ClipData newUri2 = ClipData.newUri(context3.getContentResolver(), "image", ClipboardFileProvider.INSTANCE.getUriForFile(context3, context3.getApplicationInfo().packageName + ".ClipboardFileProvider", file3));
                            Intrinsics.checkNotNullExpressionValue(newUri2, "newUri(...)");
                            return newUri2;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = bufferedOutputStream;
                        throw th;
                    }
                }
                file2 = (File) clipboardImageKt$clipDataFromBase64Image$1.L$3;
                imageFormatFromBase64 = (ImageFormat) clipboardImageKt$clipDataFromBase64Image$1.L$2;
                bitmap = (Bitmap) clipboardImageKt$clipDataFromBase64Image$1.L$1;
                context2 = (Context) clipboardImageKt$clipDataFromBase64Image$1.L$0;
                ResultKt.throwOnFailure(obj);
                Function0 function02 = new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        FileOutputStream clipDataFromBase64Image$lambda$6;
                        clipDataFromBase64Image$lambda$6 = ClipboardImageKt.clipDataFromBase64Image$lambda$6(file2);
                        return clipDataFromBase64Image$lambda$6;
                    }
                };
                clipboardImageKt$clipDataFromBase64Image$1.L$0 = context2;
                clipboardImageKt$clipDataFromBase64Image$1.L$1 = bitmap;
                clipboardImageKt$clipDataFromBase64Image$1.L$2 = imageFormatFromBase64;
                clipboardImageKt$clipDataFromBase64Image$1.L$3 = file2;
                clipboardImageKt$clipDataFromBase64Image$1.label = 2;
                obj = InterruptibleKt.runInterruptible$default(null, function02, clipboardImageKt$clipDataFromBase64Image$1, 1, null);
            }
        }
        clipboardImageKt$clipDataFromBase64Image$1 = new ClipboardImageKt$clipDataFromBase64Image$1(continuation);
        Object obj2 = clipboardImageKt$clipDataFromBase64Image$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = clipboardImageKt$clipDataFromBase64Image$1.label;
        if (i != 0) {
        }
        Function0 function022 = new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FileOutputStream clipDataFromBase64Image$lambda$6;
                clipDataFromBase64Image$lambda$6 = ClipboardImageKt.clipDataFromBase64Image$lambda$6(file2);
                return clipDataFromBase64Image$lambda$6;
            }
        };
        clipboardImageKt$clipDataFromBase64Image$1.L$0 = context2;
        clipboardImageKt$clipDataFromBase64Image$1.L$1 = bitmap;
        clipboardImageKt$clipDataFromBase64Image$1.L$2 = imageFormatFromBase64;
        clipboardImageKt$clipDataFromBase64Image$1.L$3 = file2;
        clipboardImageKt$clipDataFromBase64Image$1.label = 2;
        obj2 = InterruptibleKt.runInterruptible$default(null, function022, clipboardImageKt$clipDataFromBase64Image$1, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileOutputStream clipDataFromBase64Image$lambda$6(File file) {
        return new FileOutputStream(file, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clipDataFromBase64Image$lambda$8$lambda$7(BufferedOutputStream bufferedOutputStream) {
        bufferedOutputStream.flush();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bitmapFromContentUriAsync(final Context context, final Uri uri, Continuation<? super Bitmap> continuation) {
        ClipboardImageKt$bitmapFromContentUriAsync$1 clipboardImageKt$bitmapFromContentUriAsync$1;
        int i;
        if (continuation instanceof ClipboardImageKt$bitmapFromContentUriAsync$1) {
            clipboardImageKt$bitmapFromContentUriAsync$1 = (ClipboardImageKt$bitmapFromContentUriAsync$1) continuation;
            if ((clipboardImageKt$bitmapFromContentUriAsync$1.label & Integer.MIN_VALUE) != 0) {
                clipboardImageKt$bitmapFromContentUriAsync$1.label -= Integer.MIN_VALUE;
                Object obj = clipboardImageKt$bitmapFromContentUriAsync$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = clipboardImageKt$bitmapFromContentUriAsync$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    Function0 function0 = new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Bitmap bitmapFromContentUriAsync$lambda$9;
                            bitmapFromContentUriAsync$lambda$9 = ClipboardImageKt.bitmapFromContentUriAsync$lambda$9(context, uri);
                            return bitmapFromContentUriAsync$lambda$9;
                        }
                    };
                    clipboardImageKt$bitmapFromContentUriAsync$1.label = 1;
                    obj = InterruptibleKt.runInterruptible(io2, function0, clipboardImageKt$bitmapFromContentUriAsync$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "runInterruptible(...)");
                return obj;
            }
        }
        clipboardImageKt$bitmapFromContentUriAsync$1 = new ClipboardImageKt$bitmapFromContentUriAsync$1(continuation);
        Object obj2 = clipboardImageKt$bitmapFromContentUriAsync$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = clipboardImageKt$bitmapFromContentUriAsync$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "runInterruptible(...)");
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap bitmapFromContentUriAsync$lambda$9(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 28) {
            return MediaStore.Images.Media.getBitmap(contentResolver, uri);
        }
        ImageDecoder.Source createSource = ImageDecoder.createSource(contentResolver, uri);
        Intrinsics.checkNotNullExpressionValue(createSource, "createSource(...)");
        return ImageDecoder.decodeBitmap(createSource);
    }

    public static final Bitmap bitmapFromBase64String(String base64Image) {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        try {
            byte[] decode = Base64.decode(base64Image, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (decodeByteArray != null) {
                return decodeByteArray;
            }
            throw new RuntimeException("Failed to convert base64 into Bitmap");
        } catch (RuntimeException e) {
            throw new InvalidImageException(base64Image, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ensureExists(final File file, Continuation<? super Boolean> continuation) {
        return InterruptibleKt.runInterruptible(Dispatchers.getIO(), new Function0() { // from class: expo.modules.clipboard.ClipboardImageKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean ensureExists$lambda$10;
                ensureExists$lambda$10 = ClipboardImageKt.ensureExists$lambda$10(file);
                return Boolean.valueOf(ensureExists$lambda$10);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ensureExists$lambda$10(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return file.createNewFile();
    }
}
